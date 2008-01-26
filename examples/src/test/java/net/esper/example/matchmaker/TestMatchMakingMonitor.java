package net.esper.example.matchmaker;

import junit.framework.TestCase;
import net.esper.example.matchmaker.monitor.MatchAlertListener;
import net.esper.example.matchmaker.monitor.MatchMakingMonitor;
import net.esper.example.matchmaker.eventbean.*;
import net.esper.client.EPServiceProvider;
import net.esper.client.EPServiceProviderManager;
import net.esper.client.Configuration;

public class TestMatchMakingMonitor extends TestCase
{
    private final int USER_ID_1 = 1;
    private final int USER_ID_2 = 2;

    private MatchAlertListener listener;
    private EPServiceProvider epService = null;

    protected void setUp() throws Exception
    {
        // This code runs as part of the automated regression test suite; Therefore disable internal timer theading to safe resources
        Configuration config = new Configuration();
        config.getEngineDefaults().getThreading().setInternalTimerEnabled(false);

        listener = new MatchAlertListener();
        epService = EPServiceProviderManager.getDefaultProvider(config);
        epService.initialize();
        epService.getEPRuntime().addEmittedListener(listener, null);

        new MatchMakingMonitor();
    }

    public void testLocationChanges()
    {
        MobileUserBean user_1 = new MobileUserBean(USER_ID_1, 10, 10,
                Gender.MALE, HairColor.BLONDE, AgeRange.AGE_4,
                Gender.FEMALE, HairColor.BLACK, AgeRange.AGE_1);
        epService.getEPRuntime().sendEvent(user_1);

        MobileUserBean user_2 = new MobileUserBean(USER_ID_2, 10, 10,
                Gender.FEMALE, HairColor.BLACK, AgeRange.AGE_1,
                Gender.MALE, HairColor.BLONDE, AgeRange.AGE_4);
        epService.getEPRuntime().sendEvent(user_2);

        assertEquals(1, listener.getAndClearEmittedCount());

        user_1.setLocation(8.99999, 10);
        epService.getEPRuntime().sendEvent(user_1);
        assertEquals(0, listener.getAndClearEmittedCount());

        user_1.setLocation(9, 10);
        epService.getEPRuntime().sendEvent(user_1);
        assertEquals(1, listener.getAndClearEmittedCount());

        user_1.setLocation(11, 10);
        epService.getEPRuntime().sendEvent(user_1);
        assertEquals(1, listener.getAndClearEmittedCount());

        user_1.setLocation(11.0000001, 10);
        epService.getEPRuntime().sendEvent(user_1);
        assertEquals(0, listener.getAndClearEmittedCount());

        user_2.setLocation(10.0000001, 9);
        epService.getEPRuntime().sendEvent(user_2);
        assertEquals(1, listener.getAndClearEmittedCount());
    }

    public void testPreferredMatching()
    {
        MobileUserBean user_1 = new MobileUserBean(USER_ID_1, 10, 10,
                Gender.MALE, HairColor.RED, AgeRange.AGE_6,
                Gender.FEMALE, HairColor.BLACK, AgeRange.AGE_5);
        epService.getEPRuntime().sendEvent(user_1);

        // Test all combinations
        for (Gender gender : Gender.values())
        {
            for (HairColor color : HairColor.values())
            {
                for (AgeRange age : AgeRange.values())
                {
                    // Try user preferences
                    MobileUserBean userA = new MobileUserBean(USER_ID_2, 10, 10,
                            Gender.FEMALE, HairColor.BLACK, AgeRange.AGE_5,
                            gender, color, age);
                    epService.getEPRuntime().sendEvent(userA);

                    if (listener.getEmittedList().size() == 1)
                    {
                        assertEquals(gender, Gender.MALE);
                        assertEquals(color, HairColor.RED);
                        assertEquals(age, AgeRange.AGE_6);
                    }
                    else
                    {
                        assertEquals(0, listener.getAndClearEmittedCount());
                    }
                }
            }
        }
    }

    public void testPreferredMatchingBackwards()
    {
        MobileUserBean user_1 = new MobileUserBean(USER_ID_1, 10, 10,
                Gender.MALE, HairColor.RED, AgeRange.AGE_6,
                Gender.FEMALE, HairColor.BLACK, AgeRange.AGE_5);
        epService.getEPRuntime().sendEvent(user_1);

        // Test all combinations
        for (Gender gender : Gender.values())
        {
            for (HairColor color : HairColor.values())
            {
                for (AgeRange age : AgeRange.values())
                {
                    // Try user preferences backwards
                    MobileUserBean userB = new MobileUserBean(USER_ID_2, 10, 10,
                            gender, color, age,
                            Gender.MALE, HairColor.RED, AgeRange.AGE_6);
                    epService.getEPRuntime().sendEvent(userB);

                    if (listener.getEmittedList().size() == 1)
                    {
                        assertEquals(gender, Gender.FEMALE);
                        assertEquals(color, HairColor.BLACK);
                        assertEquals(age, AgeRange.AGE_5);
                    }
                    else
                    {
                        assertEquals(0, listener.getAndClearEmittedCount());
                    }
                }
            }
        }
    }
}
