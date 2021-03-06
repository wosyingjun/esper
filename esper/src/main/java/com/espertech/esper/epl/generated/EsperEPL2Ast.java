// $ANTLR 3.2 Sep 23, 2009 12:02:23 EsperEPL2Ast.g 2013-09-05 19:55:27

  package com.espertech.esper.epl.generated;
  import java.util.Stack;
  import org.apache.commons.logging.Log;
  import org.apache.commons.logging.LogFactory;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class EsperEPL2Ast extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CREATE", "WINDOW", "IN_SET", "BETWEEN", "LIKE", "REGEXP", "ESCAPE", "OR_EXPR", "AND_EXPR", "NOT_EXPR", "EVERY_EXPR", "EVERY_DISTINCT_EXPR", "WHERE", "AS", "SUM", "AVG", "MAX", "MIN", "COALESCE", "MEDIAN", "STDDEV", "AVEDEV", "COUNT", "SELECT", "CASE", "CASE2", "ELSE", "WHEN", "THEN", "END", "FROM", "OUTER", "INNER", "JOIN", "LEFT", "RIGHT", "FULL", "ON", "IS", "BY", "GROUP", "HAVING", "DISTINCT", "ALL", "ANY", "SOME", "OUTPUT", "EVENTS", "FIRST", "LAST", "INSERT", "INTO", "ORDER", "ASC", "DESC", "RSTREAM", "ISTREAM", "IRSTREAM", "SCHEMA", "UNIDIRECTIONAL", "RETAINUNION", "RETAININTERSECTION", "PATTERN", "SQL", "METADATASQL", "PREVIOUS", "PREVIOUSTAIL", "PREVIOUSCOUNT", "PREVIOUSWINDOW", "PRIOR", "EXISTS", "WEEKDAY", "LW", "INSTANCEOF", "TYPEOF", "CAST", "CURRENT_TIMESTAMP", "DELETE", "SNAPSHOT", "SET", "VARIABLE", "UNTIL", "AT", "INDEX", "TIMEPERIOD_YEAR", "TIMEPERIOD_YEARS", "TIMEPERIOD_MONTH", "TIMEPERIOD_MONTHS", "TIMEPERIOD_WEEK", "TIMEPERIOD_WEEKS", "TIMEPERIOD_DAY", "TIMEPERIOD_DAYS", "TIMEPERIOD_HOUR", "TIMEPERIOD_HOURS", "TIMEPERIOD_MINUTE", "TIMEPERIOD_MINUTES", "TIMEPERIOD_SEC", "TIMEPERIOD_SECOND", "TIMEPERIOD_SECONDS", "TIMEPERIOD_MILLISEC", "TIMEPERIOD_MILLISECOND", "TIMEPERIOD_MILLISECONDS", "BOOLEAN_TRUE", "BOOLEAN_FALSE", "VALUE_NULL", "ROW_LIMIT_EXPR", "OFFSET", "UPDATE", "MATCH_RECOGNIZE", "MEASURES", "DEFINE", "PARTITION", "MATCHES", "AFTER", "FOR", "WHILE", "USING", "MERGE", "MATCHED", "EXPRESSIONDECL", "NEWKW", "START", "CONTEXT", "INITIATED", "TERMINATED", "DATAFLOW", "NUMERIC_PARAM_RANGE", "NUMERIC_PARAM_LIST", "NUMERIC_PARAM_FREQUENCY", "OBJECT_PARAM_ORDERED_EXPR", "FOLLOWED_BY_EXPR", "FOLLOWED_BY_ITEM", "PATTERN_FILTER_EXPR", "PATTERN_NOT_EXPR", "PATTERN_EVERY_DISTINCT_EXPR", "EVENT_FILTER_EXPR", "EVENT_FILTER_PROPERTY_EXPR", "EVENT_FILTER_PROPERTY_EXPR_ATOM", "PROPERTY_SELECTION_ELEMENT_EXPR", "PROPERTY_SELECTION_STREAM", "PROPERTY_WILDCARD_SELECT", "EVENT_FILTER_IDENT", "EVENT_FILTER_PARAM", "EVENT_FILTER_RANGE", "EVENT_FILTER_NOT_RANGE", "EVENT_FILTER_IN", "EVENT_FILTER_NOT_IN", "EVENT_FILTER_BETWEEN", "EVENT_FILTER_NOT_BETWEEN", "CLASS_IDENT", "GUARD_EXPR", "OBSERVER_EXPR", "VIEW_EXPR", "PATTERN_INCL_EXPR", "DATABASE_JOIN_EXPR", "WHERE_EXPR", "HAVING_EXPR", "EVAL_BITWISE_EXPR", "EVAL_AND_EXPR", "EVAL_OR_EXPR", "EVAL_EQUALS_EXPR", "EVAL_NOTEQUALS_EXPR", "EVAL_IS_EXPR", "EVAL_ISNOT_EXPR", "EVAL_EQUALS_GROUP_EXPR", "EVAL_NOTEQUALS_GROUP_EXPR", "EVAL_IDENT", "SELECTION_EXPR", "SELECTION_ELEMENT_EXPR", "SELECTION_STREAM", "STREAM_EXPR", "OUTERJOIN_EXPR", "INNERJOIN_EXPR", "LEFT_OUTERJOIN_EXPR", "RIGHT_OUTERJOIN_EXPR", "FULL_OUTERJOIN_EXPR", "GROUP_BY_EXPR", "ORDER_BY_EXPR", "ORDER_ELEMENT_EXPR", "EVENT_PROP_EXPR", "EVENT_PROP_SIMPLE", "EVENT_PROP_MAPPED", "EVENT_PROP_INDEXED", "EVENT_PROP_DYNAMIC_SIMPLE", "EVENT_PROP_DYNAMIC_INDEXED", "EVENT_PROP_DYNAMIC_MAPPED", "EVENT_LIMIT_EXPR", "TIMEPERIOD_LIMIT_EXPR", "AFTER_LIMIT_EXPR", "CRONTAB_LIMIT_EXPR", "CRONTAB_LIMIT_EXPR_PARAM", "WHEN_LIMIT_EXPR", "TERM_LIMIT_EXPR", "INSERTINTO_EXPR", "EXPRCOL", "INDEXCOL", "CONCAT", "LIB_FUNCTION", "LIB_FUNC_CHAIN", "DOT_EXPR", "UNARY_MINUS", "TIME_PERIOD", "ARRAY_EXPR", "YEAR_PART", "MONTH_PART", "WEEK_PART", "DAY_PART", "HOUR_PART", "MINUTE_PART", "SECOND_PART", "MILLISECOND_PART", "NOT_IN_SET", "NOT_BETWEEN", "NOT_LIKE", "NOT_REGEXP", "DBSELECT_EXPR", "DBFROM_CLAUSE", "DBWHERE_CLAUSE", "WILDCARD_SELECT", "INSERTINTO_STREAM_NAME", "IN_RANGE", "NOT_IN_RANGE", "SUBSELECT_EXPR", "SUBSELECT_GROUP_EXPR", "EXISTS_SUBSELECT_EXPR", "IN_SUBSELECT_EXPR", "NOT_IN_SUBSELECT_EXPR", "IN_SUBSELECT_QUERY_EXPR", "LAST_OPERATOR", "WEEKDAY_OPERATOR", "SUBSTITUTION", "CAST_EXPR", "CREATE_INDEX_EXPR", "CREATE_WINDOW_EXPR", "CREATE_WINDOW_SELECT_EXPR", "ON_EXPR", "ON_STREAM", "ON_DELETE_EXPR", "ON_SELECT_EXPR", "ON_UPDATE_EXPR", "ON_MERGE_EXPR", "ON_SELECT_INSERT_EXPR", "ON_SELECT_INSERT_OUTPUT", "ON_EXPR_FROM", "ON_SET_EXPR", "CREATE_VARIABLE_EXPR", "METHOD_JOIN_EXPR", "MATCH_UNTIL_EXPR", "MATCH_UNTIL_RANGE_HALFOPEN", "MATCH_UNTIL_RANGE_HALFCLOSED", "MATCH_UNTIL_RANGE_CLOSED", "MATCH_UNTIL_RANGE_BOUNDED", "CREATE_COL_TYPE_LIST", "CREATE_COL_TYPE", "NUMBERSETSTAR", "ANNOTATION", "ANNOTATION_ARRAY", "ANNOTATION_VALUE", "FIRST_AGGREG", "LAST_AGGREG", "WINDOW_AGGREG", "ACCESS_AGG", "UPDATE_EXPR", "ON_SET_EXPR_ITEM", "CREATE_SCHEMA_EXPR", "CREATE_SCHEMA_EXPR_QUAL", "CREATE_SCHEMA_DEF", "VARIANT_LIST", "MERGE_UNM", "MERGE_MAT", "MERGE_UPD", "MERGE_INS", "MERGE_DEL", "NEW_ITEM", "AGG_FILTER_EXPR", "CREATE_EXPR", "CREATE_CTX", "CREATE_CTX_FIXED", "CREATE_CTX_PART", "CREATE_CTX_COAL", "CREATE_CTX_CAT", "CREATE_CTX_INIT", "CREATE_CTX_CATITEM", "CREATE_CTX_NESTED", "CREATE_CTX_PATTERN", "CREATE_DATAFLOW", "GOP", "GOPPARAM", "GOPPARAMITM", "GOPOUT", "GOPOUTITM", "GOPOUTTYP", "GOPCFG", "GOPCFGITM", "GOPCFGEPL", "PARTITIONITEM", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "STRING_TYPE", "BOOL_TYPE", "NULL_TYPE", "NUM_DOUBLE", "EPL_EXPR", "MATCHREC_PATTERN", "MATCHREC_PATTERN_ATOM", "MATCHREC_PATTERN_CONCAT", "MATCHREC_PATTERN_ALTER", "MATCHREC_PATTERN_NESTED", "MATCHREC_AFTER_SKIP", "MATCHREC_INTERVAL", "MATCHREC_DEFINE", "MATCHREC_DEFINE_ITEM", "MATCHREC_MEASURES", "MATCHREC_MEASURE_ITEM", "JSON_OBJECT", "JSON_ARRAY", "JSON_FIELD", "LBRACK", "RBRACK", "IDENT", "LPAREN", "RPAREN", "COLON", "LCURLY", "RCURLY", "GOES", "ATCHAR", "COMMA", "DOT", "EQUALS", "STAR", "FOLLOWED_BY", "LT", "GT", "QUESTION", "BOR", "PLUS", "STRING_LITERAL", "QUOTED_STRING_LITERAL", "BAND", "BXOR", "SQL_NE", "NOT_EQUAL", "LE", "GE", "LOR", "MINUS", "DIV", "MOD", "NUM_INT", "FOLLOWMAX_BEGIN", "FOLLOWMAX_END", "ESCAPECHAR", "TICKED_STRING_LITERAL", "NUM_LONG", "NUM_FLOAT", "EQUAL", "LNOT", "BNOT", "DIV_ASSIGN", "PLUS_ASSIGN", "INC", "MINUS_ASSIGN", "DEC", "STAR_ASSIGN", "MOD_ASSIGN", "BXOR_ASSIGN", "BOR_ASSIGN", "BAND_ASSIGN", "LAND", "SEMI", "WS", "SL_COMMENT", "ML_COMMENT", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "EXPONENT", "FLOAT_SUFFIX", "GOPCFGEXP", "EVAL_IS_GROUP_EXPR", "EVAL_ISNOT_GROUP_EXPR"
    };
    public static final int FLOAT_SUFFIX=385;
    public static final int GOPCFGITM=297;
    public static final int NUMERIC_PARAM_LIST=131;
    public static final int OUTERJOIN_EXPR=175;
    public static final int CREATE_COL_TYPE_LIST=256;
    public static final int MERGE_INS=275;
    public static final int TIMEPERIOD_MILLISECONDS=105;
    public static final int CREATE_CTX_FIXED=281;
    public static final int RPAREN=327;
    public static final int LNOT=363;
    public static final int INC=367;
    public static final int CREATE=4;
    public static final int STRING_LITERAL=343;
    public static final int STREAM_EXPR=174;
    public static final int MATCHES=116;
    public static final int METADATASQL=68;
    public static final int EVENT_FILTER_PROPERTY_EXPR=140;
    public static final int GOES=331;
    public static final int REGEXP=9;
    public static final int MATCHED=122;
    public static final int INITIATED=127;
    public static final int FOLLOWED_BY_EXPR=134;
    public static final int RBRACK=324;
    public static final int MATCH_UNTIL_RANGE_CLOSED=254;
    public static final int GE=350;
    public static final int ASC=57;
    public static final int IN_SET=6;
    public static final int EVENT_FILTER_EXPR=139;
    public static final int EVENT_FILTER_NOT_IN=150;
    public static final int NUM_DOUBLE=307;
    public static final int TIMEPERIOD_MILLISEC=103;
    public static final int RETAINUNION=64;
    public static final int DBWHERE_CLAUSE=221;
    public static final int MEDIAN=23;
    public static final int GROUP=44;
    public static final int SUBSELECT_GROUP_EXPR=227;
    public static final int YEAR_PART=207;
    public static final int TYPEOF=78;
    public static final int ESCAPECHAR=358;
    public static final int EXPRCOL=198;
    public static final int SL_COMMENT=378;
    public static final int NULL_TYPE=306;
    public static final int MATCH_UNTIL_RANGE_HALFOPEN=252;
    public static final int GT=339;
    public static final int LAND=375;
    public static final int EVENT_PROP_EXPR=183;
    public static final int LBRACK=323;
    public static final int VIEW_EXPR=156;
    public static final int MERGE_UPD=274;
    public static final int CREATE_SCHEMA_DEF=270;
    public static final int EVENT_FILTER_PROPERTY_EXPR_ATOM=141;
    public static final int ON_MERGE_EXPR=244;
    public static final int TIMEPERIOD_SEC=100;
    public static final int ON_SELECT_EXPR=242;
    public static final int TICKED_STRING_LITERAL=359;
    public static final int SUM=18;
    public static final int JSON_ARRAY=321;
    public static final int HexDigit=383;
    public static final int AT=86;
    public static final int AS=17;
    public static final int TIMEPERIOD_MONTH=90;
    public static final int LEFT=38;
    public static final int AVG=19;
    public static final int PREVIOUS=69;
    public static final int PREVIOUSWINDOW=72;
    public static final int PARTITIONITEM=299;
    public static final int DATABASE_JOIN_EXPR=158;
    public static final int IDENT=325;
    public static final int PLUS=342;
    public static final int EVENT_PROP_INDEXED=186;
    public static final int CREATE_SCHEMA_EXPR=268;
    public static final int CREATE_INDEX_EXPR=236;
    public static final int ACCESS_AGG=265;
    public static final int LIKE=8;
    public static final int OUTER=35;
    public static final int RIGHT_OUTERJOIN_EXPR=178;
    public static final int BY=43;
    public static final int MATCHREC_DEFINE=316;
    public static final int MERGE=121;
    public static final int MERGE_UNM=272;
    public static final int FOLLOWMAX_END=357;
    public static final int LEFT_OUTERJOIN_EXPR=177;
    public static final int GROUP_BY_EXPR=180;
    public static final int EPL_EXPR=308;
    public static final int RIGHT=39;
    public static final int HAVING=45;
    public static final int GOPOUTITM=294;
    public static final int MINUS=352;
    public static final int SEMI=376;
    public static final int INDEXCOL=199;
    public static final int STAR_ASSIGN=370;
    public static final int FIRST_AGGREG=262;
    public static final int COLON=328;
    public static final int PREVIOUSTAIL=70;
    public static final int NOT_IN_SET=215;
    public static final int VALUE_NULL=108;
    public static final int EVENT_PROP_DYNAMIC_SIMPLE=187;
    public static final int NOT_IN_SUBSELECT_EXPR=230;
    public static final int GUARD_EXPR=154;
    public static final int RCURLY=330;
    public static final int EXISTS_SUBSELECT_EXPR=228;
    public static final int WEEK_PART=209;
    public static final int ROW_LIMIT_EXPR=109;
    public static final int SELECTION_EXPR=171;
    public static final int EVAL_IS_GROUP_EXPR=387;
    public static final int LW=76;
    public static final int LT=338;
    public static final int CREATE_CTX=280;
    public static final int ORDER_BY_EXPR=181;
    public static final int NEW_ITEM=277;
    public static final int MOD_ASSIGN=371;
    public static final int IN_SUBSELECT_QUERY_EXPR=231;
    public static final int JSON_FIELD=322;
    public static final int EQUALS=335;
    public static final int COUNT=26;
    public static final int RETAININTERSECTION=65;
    public static final int TERMINATED=128;
    public static final int TIMEPERIOD_WEEKS=93;
    public static final int PATTERN=66;
    public static final int MATCHREC_AFTER_SKIP=314;
    public static final int ESCAPE=10;
    public static final int EVAL_NOTEQUALS_GROUP_EXPR=169;
    public static final int SELECT=27;
    public static final int INTO=55;
    public static final int EVAL_ISNOT_EXPR=167;
    public static final int FLOAT_TYPE=302;
    public static final int COALESCE=22;
    public static final int EVENT_FILTER_BETWEEN=151;
    public static final int ANNOTATION_VALUE=261;
    public static final int CLASS_IDENT=153;
    public static final int MATCHREC_PATTERN_ALTER=312;
    public static final int CREATE_WINDOW_EXPR=237;
    public static final int PROPERTY_SELECTION_STREAM=143;
    public static final int ON_DELETE_EXPR=241;
    public static final int ON=41;
    public static final int DELETE=81;
    public static final int INT_TYPE=300;
    public static final int EVERY_EXPR=14;
    public static final int EVAL_BITWISE_EXPR=161;
    public static final int TIMEPERIOD_HOURS=97;
    public static final int STRING_TYPE=304;
    public static final int MATCHREC_DEFINE_ITEM=317;
    public static final int STDDEV=24;
    public static final int OUTPUT=50;
    public static final int WEEKDAY_OPERATOR=233;
    public static final int DEC=369;
    public static final int WHERE=16;
    public static final int GOPOUT=293;
    public static final int BXOR_ASSIGN=372;
    public static final int AFTER_LIMIT_EXPR=192;
    public static final int SNAPSHOT=82;
    public static final int MAX=20;
    public static final int DEFINE=114;
    public static final int TIMEPERIOD_YEARS=89;
    public static final int TIMEPERIOD_DAYS=95;
    public static final int CONTEXT=126;
    public static final int CREATE_CTX_CAT=284;
    public static final int EVENT_PROP_DYNAMIC_INDEXED=188;
    public static final int BOR_ASSIGN=373;
    public static final int COMMA=333;
    public static final int WHEN_LIMIT_EXPR=195;
    public static final int IS=42;
    public static final int PARTITION=115;
    public static final int SOME=49;
    public static final int EQUAL=362;
    public static final int MATCHREC_MEASURE_ITEM=319;
    public static final int EVENT_FILTER_NOT_BETWEEN=152;
    public static final int IN_RANGE=224;
    public static final int TIMEPERIOD_WEEK=92;
    public static final int PROPERTY_WILDCARD_SELECT=144;
    public static final int INSERTINTO_EXPR=197;
    public static final int UNIDIRECTIONAL=63;
    public static final int MATCH_UNTIL_RANGE_BOUNDED=255;
    public static final int TIMEPERIOD_MINUTES=99;
    public static final int RSTREAM=59;
    public static final int NOT_BETWEEN=216;
    public static final int TIMEPERIOD_MINUTE=98;
    public static final int EVAL_OR_EXPR=163;
    public static final int BAND=345;
    public static final int MATCHREC_PATTERN_ATOM=310;
    public static final int QUOTED_STRING_LITERAL=344;
    public static final int NOT_EXPR=13;
    public static final int QUESTION=340;
    public static final int EVENT_FILTER_IDENT=145;
    public static final int UnicodeEscape=381;
    public static final int DBSELECT_EXPR=219;
    public static final int FOLLOWMAX_BEGIN=356;
    public static final int WINDOW=5;
    public static final int ON_SET_EXPR_ITEM=267;
    public static final int DBFROM_CLAUSE=220;
    public static final int LE=349;
    public static final int EVAL_IDENT=170;
    public static final int CRONTAB_LIMIT_EXPR=193;
    public static final int STAR=336;
    public static final int DOT_EXPR=203;
    public static final int ISTREAM=60;
    public static final int MOD=354;
    public static final int LIB_FUNC_CHAIN=202;
    public static final int EVAL_ISNOT_GROUP_EXPR=388;
    public static final int MONTH_PART=208;
    public static final int EOF=-1;
    public static final int LIB_FUNCTION=201;
    public static final int FULL_OUTERJOIN_EXPR=179;
    public static final int CREATE_CTX_NESTED=287;
    public static final int MATCHREC_PATTERN_CONCAT=311;
    public static final int USING=120;
    public static final int CAST_EXPR=235;
    public static final int TIMEPERIOD_SECONDS=102;
    public static final int NOT_EQUAL=348;
    public static final int LAST_AGGREG=263;
    public static final int NEWKW=124;
    public static final int HOUR_PART=211;
    public static final int FOLLOWED_BY=337;
    public static final int MATCHREC_PATTERN_NESTED=313;
    public static final int GOPPARAMITM=292;
    public static final int METHOD_JOIN_EXPR=250;
    public static final int CREATE_CTX_PART=282;
    public static final int PATTERN_EVERY_DISTINCT_EXPR=138;
    public static final int CREATE_CTX_COAL=283;
    public static final int ELSE=30;
    public static final int MINUS_ASSIGN=368;
    public static final int INSERTINTO_STREAM_NAME=223;
    public static final int UNARY_MINUS=204;
    public static final int LCURLY=329;
    public static final int EVENTS=51;
    public static final int AND_EXPR=12;
    public static final int EVENT_FILTER_NOT_RANGE=148;
    public static final int WS=377;
    public static final int FOLLOWED_BY_ITEM=135;
    public static final int ON_SELECT_INSERT_EXPR=245;
    public static final int GOPPARAM=291;
    public static final int BNOT=364;
    public static final int EVAL_IS_EXPR=166;
    public static final int WHERE_EXPR=159;
    public static final int END=33;
    public static final int INNERJOIN_EXPR=176;
    public static final int TERM_LIMIT_EXPR=196;
    public static final int NOT_REGEXP=218;
    public static final int MATCH_UNTIL_EXPR=251;
    public static final int ANNOTATION=259;
    public static final int LONG_TYPE=301;
    public static final int MATCHREC_PATTERN=309;
    public static final int ATCHAR=332;
    public static final int MINUTE_PART=212;
    public static final int PATTERN_NOT_EXPR=137;
    public static final int SQL_NE=347;
    public static final int UPDATE_EXPR=266;
    public static final int LPAREN=326;
    public static final int IN_SUBSELECT_EXPR=229;
    public static final int BOOLEAN_TRUE=106;
    public static final int OR_EXPR=11;
    public static final int JSON_OBJECT=320;
    public static final int THEN=32;
    public static final int NOT_IN_RANGE=225;
    public static final int MATCHREC_INTERVAL=315;
    public static final int OFFSET=110;
    public static final int SECOND_PART=213;
    public static final int MATCH_RECOGNIZE=112;
    public static final int CASE2=29;
    public static final int BXOR=346;
    public static final int TIMEPERIOD_DAY=94;
    public static final int MERGE_MAT=273;
    public static final int EXISTS=74;
    public static final int TIMEPERIOD_MILLISECOND=104;
    public static final int EVAL_NOTEQUALS_EXPR=165;
    public static final int CREATE_CTX_CATITEM=286;
    public static final int CREATE_VARIABLE_EXPR=249;
    public static final int MATCH_UNTIL_RANGE_HALFCLOSED=253;
    public static final int PATTERN_FILTER_EXPR=136;
    public static final int LAST_OPERATOR=232;
    public static final int NUMBERSETSTAR=258;
    public static final int EVAL_AND_EXPR=162;
    public static final int SET=83;
    public static final int INSTANCEOF=77;
    public static final int EVENT_PROP_SIMPLE=184;
    public static final int MIN=21;
    public static final int PREVIOUSCOUNT=71;
    public static final int VARIANT_LIST=271;
    public static final int EVAL_EQUALS_GROUP_EXPR=168;
    public static final int SCHEMA=62;
    public static final int BAND_ASSIGN=374;
    public static final int CRONTAB_LIMIT_EXPR_PARAM=194;
    public static final int WHEN=31;
    public static final int PLUS_ASSIGN=366;
    public static final int DAY_PART=210;
    public static final int START=125;
    public static final int EVENT_FILTER_IN=149;
    public static final int DIV=353;
    public static final int GOPCFGEXP=386;
    public static final int OBJECT_PARAM_ORDERED_EXPR=133;
    public static final int EXPRESSIONDECL=123;
    public static final int OctalEscape=382;
    public static final int BETWEEN=7;
    public static final int MILLISECOND_PART=214;
    public static final int FIRST=52;
    public static final int PRIOR=73;
    public static final int CAST=79;
    public static final int LOR=351;
    public static final int WILDCARD_SELECT=222;
    public static final int EXPONENT=384;
    public static final int PATTERN_INCL_EXPR=157;
    public static final int WHILE=119;
    public static final int BOOL_TYPE=305;
    public static final int GOPCFG=296;
    public static final int ANNOTATION_ARRAY=260;
    public static final int CASE=28;
    public static final int CREATE_EXPR=279;
    public static final int GOP=290;
    public static final int WINDOW_AGGREG=264;
    public static final int DIV_ASSIGN=365;
    public static final int CREATE_CTX_INIT=285;
    public static final int SQL=67;
    public static final int FULL=40;
    public static final int WEEKDAY=75;
    public static final int INSERT=54;
    public static final int ON_UPDATE_EXPR=243;
    public static final int ARRAY_EXPR=206;
    public static final int CREATE_COL_TYPE=257;
    public static final int LAST=53;
    public static final int BOOLEAN_FALSE=107;
    public static final int TIMEPERIOD_SECOND=101;
    public static final int SUBSELECT_EXPR=226;
    public static final int NUMERIC_PARAM_RANGE=130;
    public static final int CONCAT=200;
    public static final int ON_EXPR=239;
    public static final int NUM_LONG=360;
    public static final int TIME_PERIOD=205;
    public static final int DOUBLE_TYPE=303;
    public static final int ORDER_ELEMENT_EXPR=182;
    public static final int VARIABLE=84;
    public static final int SUBSTITUTION=234;
    public static final int UNTIL=85;
    public static final int ON_SET_EXPR=248;
    public static final int NUM_INT=355;
    public static final int ON_EXPR_FROM=247;
    public static final int NUM_FLOAT=361;
    public static final int FROM=34;
    public static final int DISTINCT=46;
    public static final int EscapeSequence=380;
    public static final int PROPERTY_SELECTION_ELEMENT_EXPR=142;
    public static final int INNER=36;
    public static final int NUMERIC_PARAM_FREQUENCY=132;
    public static final int ORDER=56;
    public static final int EVENT_FILTER_PARAM=146;
    public static final int EVENT_PROP_DYNAMIC_MAPPED=189;
    public static final int IRSTREAM=61;
    public static final int UPDATE=111;
    public static final int FOR=118;
    public static final int ON_STREAM=240;
    public static final int EVENT_FILTER_RANGE=147;
    public static final int INDEX=87;
    public static final int ML_COMMENT=379;
    public static final int TIMEPERIOD_LIMIT_EXPR=191;
    public static final int TIMEPERIOD_HOUR=96;
    public static final int ALL=47;
    public static final int BOR=341;
    public static final int DOT=334;
    public static final int CURRENT_TIMESTAMP=80;
    public static final int MATCHREC_MEASURES=318;
    public static final int EVERY_DISTINCT_EXPR=15;
    public static final int HAVING_EXPR=160;
    public static final int MERGE_DEL=276;
    public static final int EVAL_EQUALS_EXPR=164;
    public static final int NOT_LIKE=217;
    public static final int EVENT_LIMIT_EXPR=190;
    public static final int ON_SELECT_INSERT_OUTPUT=246;
    public static final int CREATE_DATAFLOW=289;
    public static final int AFTER=117;
    public static final int MEASURES=113;
    public static final int AGG_FILTER_EXPR=278;
    public static final int CREATE_CTX_PATTERN=288;
    public static final int JOIN=37;
    public static final int GOPOUTTYP=295;
    public static final int ANY=48;
    public static final int OBSERVER_EXPR=155;
    public static final int CREATE_SCHEMA_EXPR_QUAL=269;
    public static final int EVENT_PROP_MAPPED=185;
    public static final int TIMEPERIOD_YEAR=88;
    public static final int AVEDEV=25;
    public static final int GOPCFGEPL=298;
    public static final int TIMEPERIOD_MONTHS=91;
    public static final int SELECTION_ELEMENT_EXPR=172;
    public static final int CREATE_WINDOW_SELECT_EXPR=238;
    public static final int DESC=58;
    public static final int DATAFLOW=129;
    public static final int SELECTION_STREAM=173;

    // delegates
    // delegators


        public EsperEPL2Ast(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public EsperEPL2Ast(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return EsperEPL2Ast.tokenNames; }
    public String getGrammarFileName() { return "EsperEPL2Ast.g"; }


      private static Log log = LogFactory.getLog(EsperEPL2Ast.class);

      // For pattern processing within EPL
      protected void endPattern() {};

      protected void pushStmtContext() {};
      protected void leaveNode(Tree node) {};
      protected void end() {};

      protected void mismatch(IntStream input, int ttype, BitSet follow) throws RecognitionException {
        throw new MismatchedTokenException(ttype, input);  
      }

      public void recoverFromMismatchedToken(IntStream intStream, RecognitionException recognitionException, int i, BitSet bitSet) throws RecognitionException {
        throw recognitionException;
      }

      public Object recoverFromMismatchedSet(IntStream intStream, RecognitionException recognitionException, BitSet bitSet) throws RecognitionException {
        throw recognitionException;
      }

      protected boolean recoverFromMismatchedElement(IntStream intStream, RecognitionException recognitionException, BitSet bitSet) {
        throw new RuntimeException("Error recovering from mismatched element", recognitionException);
      }
      
      public void recover(org.antlr.runtime.IntStream intStream, org.antlr.runtime.RecognitionException recognitionException) {
        throw new RuntimeException("Error recovering from recognition exception", recognitionException);
      }



    // $ANTLR start "annotation"
    // EsperEPL2Ast.g:57:1: annotation[boolean isLeaveNode] : ^(a= ANNOTATION CLASS_IDENT ( elementValuePair )* ( elementValue )? ) ;
    public final void annotation(boolean isLeaveNode) throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:58:2: ( ^(a= ANNOTATION CLASS_IDENT ( elementValuePair )* ( elementValue )? ) )
            // EsperEPL2Ast.g:58:4: ^(a= ANNOTATION CLASS_IDENT ( elementValuePair )* ( elementValue )? )
            {
            a=(CommonTree)match(input,ANNOTATION,FOLLOW_ANNOTATION_in_annotation92); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_annotation94); 
            // EsperEPL2Ast.g:58:31: ( elementValuePair )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ANNOTATION_VALUE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // EsperEPL2Ast.g:58:31: elementValuePair
            	    {
            	    pushFollow(FOLLOW_elementValuePair_in_annotation96);
            	    elementValuePair();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // EsperEPL2Ast.g:58:49: ( elementValue )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CLASS_IDENT||(LA2_0>=ANNOTATION && LA2_0<=ANNOTATION_ARRAY)||(LA2_0>=INT_TYPE && LA2_0<=NULL_TYPE)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // EsperEPL2Ast.g:58:49: elementValue
                    {
                    pushFollow(FOLLOW_elementValue_in_annotation99);
                    elementValue();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
             if (isLeaveNode) leaveNode(a); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "annotation"


    // $ANTLR start "elementValuePair"
    // EsperEPL2Ast.g:61:1: elementValuePair : ^(a= ANNOTATION_VALUE IDENT elementValue ) ;
    public final void elementValuePair() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:62:2: ( ^(a= ANNOTATION_VALUE IDENT elementValue ) )
            // EsperEPL2Ast.g:62:4: ^(a= ANNOTATION_VALUE IDENT elementValue )
            {
            a=(CommonTree)match(input,ANNOTATION_VALUE,FOLLOW_ANNOTATION_VALUE_in_elementValuePair117); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_elementValuePair119); 
            pushFollow(FOLLOW_elementValue_in_elementValuePair121);
            elementValue();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "elementValuePair"


    // $ANTLR start "elementValue"
    // EsperEPL2Ast.g:65:1: elementValue : ( annotation[false] | ^( ANNOTATION_ARRAY ( elementValue )* ) | constant[false] | CLASS_IDENT );
    public final void elementValue() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:66:6: ( annotation[false] | ^( ANNOTATION_ARRAY ( elementValue )* ) | constant[false] | CLASS_IDENT )
            int alt4=4;
            switch ( input.LA(1) ) {
            case ANNOTATION:
                {
                alt4=1;
                }
                break;
            case ANNOTATION_ARRAY:
                {
                alt4=2;
                }
                break;
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt4=3;
                }
                break;
            case CLASS_IDENT:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // EsperEPL2Ast.g:66:11: annotation[false]
                    {
                    pushFollow(FOLLOW_annotation_in_elementValue148);
                    annotation(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:67:5: ^( ANNOTATION_ARRAY ( elementValue )* )
                    {
                    match(input,ANNOTATION_ARRAY,FOLLOW_ANNOTATION_ARRAY_in_elementValue156); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:67:24: ( elementValue )*
                        loop3:
                        do {
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==CLASS_IDENT||(LA3_0>=ANNOTATION && LA3_0<=ANNOTATION_ARRAY)||(LA3_0>=INT_TYPE && LA3_0<=NULL_TYPE)) ) {
                                alt3=1;
                            }


                            switch (alt3) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:67:24: elementValue
                        	    {
                        	    pushFollow(FOLLOW_elementValue_in_elementValue158);
                        	    elementValue();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop3;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:68:8: constant[false]
                    {
                    pushFollow(FOLLOW_constant_in_elementValue169);
                    constant(false);

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:69:8: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_elementValue179); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "elementValue"


    // $ANTLR start "expressionDecl"
    // EsperEPL2Ast.g:75:1: expressionDecl[boolean isLeaveNode] : ^(e= EXPRESSIONDECL IDENT expressionDef ( exprCol )? ( CLASS_IDENT )? ( ^( COLON IDENT ) )? ( LBRACK )? ) ;
    public final void expressionDecl(boolean isLeaveNode) throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:76:2: ( ^(e= EXPRESSIONDECL IDENT expressionDef ( exprCol )? ( CLASS_IDENT )? ( ^( COLON IDENT ) )? ( LBRACK )? ) )
            // EsperEPL2Ast.g:76:4: ^(e= EXPRESSIONDECL IDENT expressionDef ( exprCol )? ( CLASS_IDENT )? ( ^( COLON IDENT ) )? ( LBRACK )? )
            {
            e=(CommonTree)match(input,EXPRESSIONDECL,FOLLOW_EXPRESSIONDECL_in_expressionDecl205); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_expressionDecl207); 
            pushFollow(FOLLOW_expressionDef_in_expressionDecl209);
            expressionDef();

            state._fsp--;

            // EsperEPL2Ast.g:76:43: ( exprCol )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EXPRCOL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // EsperEPL2Ast.g:76:43: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_expressionDecl211);
                    exprCol();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:76:52: ( CLASS_IDENT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CLASS_IDENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // EsperEPL2Ast.g:76:52: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_expressionDecl214); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:76:65: ( ^( COLON IDENT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // EsperEPL2Ast.g:76:66: ^( COLON IDENT )
                    {
                    match(input,COLON,FOLLOW_COLON_in_expressionDecl219); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_expressionDecl221); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:76:83: ( LBRACK )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LBRACK) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // EsperEPL2Ast.g:76:83: LBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_expressionDecl226); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
             if (isLeaveNode) leaveNode(e); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionDecl"


    // $ANTLR start "expressionDef"
    // EsperEPL2Ast.g:79:1: expressionDef : ( ^( GOES valueExpr ( expressionLambdaDecl )? ) | ^( EXPRESSIONDECL constant[false] ) );
    public final void expressionDef() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:80:2: ( ^( GOES valueExpr ( expressionLambdaDecl )? ) | ^( EXPRESSIONDECL constant[false] ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==GOES) ) {
                alt10=1;
            }
            else if ( (LA10_0==EXPRESSIONDECL) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // EsperEPL2Ast.g:80:4: ^( GOES valueExpr ( expressionLambdaDecl )? )
                    {
                    match(input,GOES,FOLLOW_GOES_in_expressionDef243); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_expressionDef245);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:80:21: ( expressionLambdaDecl )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==GOES) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // EsperEPL2Ast.g:80:21: expressionLambdaDecl
                            {
                            pushFollow(FOLLOW_expressionLambdaDecl_in_expressionDef247);
                            expressionLambdaDecl();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:81:4: ^( EXPRESSIONDECL constant[false] )
                    {
                    match(input,EXPRESSIONDECL,FOLLOW_EXPRESSIONDECL_in_expressionDef255); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_constant_in_expressionDef257);
                    constant(false);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionDef"


    // $ANTLR start "expressionLambdaDecl"
    // EsperEPL2Ast.g:84:1: expressionLambdaDecl : ^( GOES ( IDENT | exprCol ) ) ;
    public final void expressionLambdaDecl() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:85:2: ( ^( GOES ( IDENT | exprCol ) ) )
            // EsperEPL2Ast.g:85:4: ^( GOES ( IDENT | exprCol ) )
            {
            match(input,GOES,FOLLOW_GOES_in_expressionLambdaDecl271); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:85:11: ( IDENT | exprCol )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT) ) {
                alt11=1;
            }
            else if ( (LA11_0==EXPRCOL) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // EsperEPL2Ast.g:85:12: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_expressionLambdaDecl274); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:85:20: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_expressionLambdaDecl278);
                    exprCol();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "expressionLambdaDecl"


    // $ANTLR start "startEPLExpressionRule"
    // EsperEPL2Ast.g:91:1: startEPLExpressionRule : ^( EPL_EXPR ( annotation[true] | expressionDecl[true] )* eplExpressionRule ) ;
    public final void startEPLExpressionRule() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:92:2: ( ^( EPL_EXPR ( annotation[true] | expressionDecl[true] )* eplExpressionRule ) )
            // EsperEPL2Ast.g:92:4: ^( EPL_EXPR ( annotation[true] | expressionDecl[true] )* eplExpressionRule )
            {
            match(input,EPL_EXPR,FOLLOW_EPL_EXPR_in_startEPLExpressionRule295); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:92:15: ( annotation[true] | expressionDecl[true] )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ANNOTATION) ) {
                    alt12=1;
                }
                else if ( (LA12_0==EXPRESSIONDECL) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // EsperEPL2Ast.g:92:16: annotation[true]
            	    {
            	    pushFollow(FOLLOW_annotation_in_startEPLExpressionRule298);
            	    annotation(true);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // EsperEPL2Ast.g:92:35: expressionDecl[true]
            	    {
            	    pushFollow(FOLLOW_expressionDecl_in_startEPLExpressionRule303);
            	    expressionDecl(true);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            pushFollow(FOLLOW_eplExpressionRule_in_startEPLExpressionRule308);
            eplExpressionRule();

            state._fsp--;


            match(input, Token.UP, null); 
             end(); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "startEPLExpressionRule"


    // $ANTLR start "eplExpressionRule"
    // EsperEPL2Ast.g:95:1: eplExpressionRule : ( ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow | fafDelete | fafUpdate ) ( forExpr )? ) | createContextExpr | createExpr );
    public final void eplExpressionRule() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:96:2: ( ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow | fafDelete | fafUpdate ) ( forExpr )? ) | createContextExpr | createExpr )
            int alt16=3;
            switch ( input.LA(1) ) {
            case DELETE:
            case UPDATE:
            case CONTEXT:
            case SELECTION_EXPR:
            case INSERTINTO_EXPR:
            case CREATE_INDEX_EXPR:
            case CREATE_WINDOW_EXPR:
            case ON_EXPR:
            case CREATE_VARIABLE_EXPR:
            case UPDATE_EXPR:
            case CREATE_SCHEMA_EXPR:
            case CREATE_DATAFLOW:
                {
                alt16=1;
                }
                break;
            case CREATE_CTX:
                {
                alt16=2;
                }
                break;
            case CREATE_EXPR:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // EsperEPL2Ast.g:96:4: ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow | fafDelete | fafUpdate ) ( forExpr )? )
                    {
                    // EsperEPL2Ast.g:96:4: ( ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow | fafDelete | fafUpdate ) ( forExpr )? )
                    // EsperEPL2Ast.g:96:5: ( contextExpr )? ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow | fafDelete | fafUpdate ) ( forExpr )?
                    {
                    // EsperEPL2Ast.g:96:5: ( contextExpr )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==CONTEXT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // EsperEPL2Ast.g:96:5: contextExpr
                            {
                            pushFollow(FOLLOW_contextExpr_in_eplExpressionRule325);
                            contextExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:96:18: ( selectExpr | createWindowExpr | createIndexExpr | createVariableExpr | createSchemaExpr[true] | onExpr | updateExpr | createDataflow | fafDelete | fafUpdate )
                    int alt14=10;
                    switch ( input.LA(1) ) {
                    case SELECTION_EXPR:
                    case INSERTINTO_EXPR:
                        {
                        alt14=1;
                        }
                        break;
                    case CREATE_WINDOW_EXPR:
                        {
                        alt14=2;
                        }
                        break;
                    case CREATE_INDEX_EXPR:
                        {
                        alt14=3;
                        }
                        break;
                    case CREATE_VARIABLE_EXPR:
                        {
                        alt14=4;
                        }
                        break;
                    case CREATE_SCHEMA_EXPR:
                        {
                        alt14=5;
                        }
                        break;
                    case ON_EXPR:
                        {
                        alt14=6;
                        }
                        break;
                    case UPDATE_EXPR:
                        {
                        alt14=7;
                        }
                        break;
                    case CREATE_DATAFLOW:
                        {
                        alt14=8;
                        }
                        break;
                    case DELETE:
                        {
                        alt14=9;
                        }
                        break;
                    case UPDATE:
                        {
                        alt14=10;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // EsperEPL2Ast.g:96:19: selectExpr
                            {
                            pushFollow(FOLLOW_selectExpr_in_eplExpressionRule329);
                            selectExpr();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:96:32: createWindowExpr
                            {
                            pushFollow(FOLLOW_createWindowExpr_in_eplExpressionRule333);
                            createWindowExpr();

                            state._fsp--;


                            }
                            break;
                        case 3 :
                            // EsperEPL2Ast.g:96:51: createIndexExpr
                            {
                            pushFollow(FOLLOW_createIndexExpr_in_eplExpressionRule337);
                            createIndexExpr();

                            state._fsp--;


                            }
                            break;
                        case 4 :
                            // EsperEPL2Ast.g:96:69: createVariableExpr
                            {
                            pushFollow(FOLLOW_createVariableExpr_in_eplExpressionRule341);
                            createVariableExpr();

                            state._fsp--;


                            }
                            break;
                        case 5 :
                            // EsperEPL2Ast.g:96:90: createSchemaExpr[true]
                            {
                            pushFollow(FOLLOW_createSchemaExpr_in_eplExpressionRule345);
                            createSchemaExpr(true);

                            state._fsp--;


                            }
                            break;
                        case 6 :
                            // EsperEPL2Ast.g:96:115: onExpr
                            {
                            pushFollow(FOLLOW_onExpr_in_eplExpressionRule350);
                            onExpr();

                            state._fsp--;


                            }
                            break;
                        case 7 :
                            // EsperEPL2Ast.g:96:124: updateExpr
                            {
                            pushFollow(FOLLOW_updateExpr_in_eplExpressionRule354);
                            updateExpr();

                            state._fsp--;


                            }
                            break;
                        case 8 :
                            // EsperEPL2Ast.g:96:137: createDataflow
                            {
                            pushFollow(FOLLOW_createDataflow_in_eplExpressionRule358);
                            createDataflow();

                            state._fsp--;


                            }
                            break;
                        case 9 :
                            // EsperEPL2Ast.g:96:154: fafDelete
                            {
                            pushFollow(FOLLOW_fafDelete_in_eplExpressionRule362);
                            fafDelete();

                            state._fsp--;


                            }
                            break;
                        case 10 :
                            // EsperEPL2Ast.g:96:166: fafUpdate
                            {
                            pushFollow(FOLLOW_fafUpdate_in_eplExpressionRule366);
                            fafUpdate();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:96:177: ( forExpr )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==FOR) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // EsperEPL2Ast.g:96:177: forExpr
                            {
                            pushFollow(FOLLOW_forExpr_in_eplExpressionRule369);
                            forExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:97:4: createContextExpr
                    {
                    pushFollow(FOLLOW_createContextExpr_in_eplExpressionRule376);
                    createContextExpr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:97:24: createExpr
                    {
                    pushFollow(FOLLOW_createExpr_in_eplExpressionRule380);
                    createExpr();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "eplExpressionRule"


    // $ANTLR start "contextExpr"
    // EsperEPL2Ast.g:100:1: contextExpr : ^(i= CONTEXT IDENT ) ;
    public final void contextExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:101:2: ( ^(i= CONTEXT IDENT ) )
            // EsperEPL2Ast.g:101:4: ^(i= CONTEXT IDENT )
            {
            i=(CommonTree)match(input,CONTEXT,FOLLOW_CONTEXT_in_contextExpr395); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_contextExpr397); 
             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "contextExpr"


    // $ANTLR start "onExpr"
    // EsperEPL2Ast.g:104:1: onExpr : ^(i= ON_EXPR onStreamExpr ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr ) ) ;
    public final void onExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:105:2: ( ^(i= ON_EXPR onStreamExpr ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr ) ) )
            // EsperEPL2Ast.g:105:4: ^(i= ON_EXPR onStreamExpr ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr ) )
            {
            i=(CommonTree)match(input,ON_EXPR,FOLLOW_ON_EXPR_in_onExpr416); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onStreamExpr_in_onExpr418);
            onStreamExpr();

            state._fsp--;

            // EsperEPL2Ast.g:106:3: ( onDeleteExpr | onUpdateExpr | onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )? | onSetExpr | onMergeExpr )
            int alt20=5;
            switch ( input.LA(1) ) {
            case ON_DELETE_EXPR:
                {
                alt20=1;
                }
                break;
            case ON_UPDATE_EXPR:
                {
                alt20=2;
                }
                break;
            case ON_SELECT_EXPR:
                {
                alt20=3;
                }
                break;
            case ON_SET_EXPR:
                {
                alt20=4;
                }
                break;
            case ON_MERGE_EXPR:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // EsperEPL2Ast.g:106:4: onDeleteExpr
                    {
                    pushFollow(FOLLOW_onDeleteExpr_in_onExpr423);
                    onDeleteExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:106:19: onUpdateExpr
                    {
                    pushFollow(FOLLOW_onUpdateExpr_in_onExpr427);
                    onUpdateExpr();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:106:34: onSelectExpr ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )?
                    {
                    pushFollow(FOLLOW_onSelectExpr_in_onExpr431);
                    onSelectExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:106:47: ( ( onSelectInsertExpr )+ ( onSelectInsertOutput )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==ON_SELECT_INSERT_EXPR) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // EsperEPL2Ast.g:106:48: ( onSelectInsertExpr )+ ( onSelectInsertOutput )?
                            {
                            // EsperEPL2Ast.g:106:48: ( onSelectInsertExpr )+
                            int cnt17=0;
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==ON_SELECT_INSERT_EXPR) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:106:48: onSelectInsertExpr
                            	    {
                            	    pushFollow(FOLLOW_onSelectInsertExpr_in_onExpr434);
                            	    onSelectInsertExpr();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt17 >= 1 ) break loop17;
                                        EarlyExitException eee =
                                            new EarlyExitException(17, input);
                                        throw eee;
                                }
                                cnt17++;
                            } while (true);

                            // EsperEPL2Ast.g:106:68: ( onSelectInsertOutput )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==ON_SELECT_INSERT_OUTPUT) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // EsperEPL2Ast.g:106:68: onSelectInsertOutput
                                    {
                                    pushFollow(FOLLOW_onSelectInsertOutput_in_onExpr437);
                                    onSelectInsertOutput();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:106:94: onSetExpr
                    {
                    pushFollow(FOLLOW_onSetExpr_in_onExpr444);
                    onSetExpr();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:106:106: onMergeExpr
                    {
                    pushFollow(FOLLOW_onMergeExpr_in_onExpr448);
                    onMergeExpr();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onExpr"


    // $ANTLR start "onStreamExpr"
    // EsperEPL2Ast.g:110:1: onStreamExpr : ^(s= ON_STREAM ( eventFilterExpr[true] | patternInclusionExpression ) ( IDENT )? ) ;
    public final void onStreamExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:111:2: ( ^(s= ON_STREAM ( eventFilterExpr[true] | patternInclusionExpression ) ( IDENT )? ) )
            // EsperEPL2Ast.g:111:4: ^(s= ON_STREAM ( eventFilterExpr[true] | patternInclusionExpression ) ( IDENT )? )
            {
            s=(CommonTree)match(input,ON_STREAM,FOLLOW_ON_STREAM_in_onStreamExpr470); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:111:18: ( eventFilterExpr[true] | patternInclusionExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EVENT_FILTER_EXPR) ) {
                alt21=1;
            }
            else if ( (LA21_0==PATTERN_INCL_EXPR) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // EsperEPL2Ast.g:111:19: eventFilterExpr[true]
                    {
                    pushFollow(FOLLOW_eventFilterExpr_in_onStreamExpr473);
                    eventFilterExpr(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:111:43: patternInclusionExpression
                    {
                    pushFollow(FOLLOW_patternInclusionExpression_in_onStreamExpr478);
                    patternInclusionExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:111:71: ( IDENT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // EsperEPL2Ast.g:111:71: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_onStreamExpr481); 

                    }
                    break;

            }

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onStreamExpr"


    // $ANTLR start "onMergeExpr"
    // EsperEPL2Ast.g:114:1: onMergeExpr : ^(m= ON_MERGE_EXPR IDENT ( IDENT )? ( mergeItem )+ ( whereClause[true] )? ) ;
    public final void onMergeExpr() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:115:2: ( ^(m= ON_MERGE_EXPR IDENT ( IDENT )? ( mergeItem )+ ( whereClause[true] )? ) )
            // EsperEPL2Ast.g:115:4: ^(m= ON_MERGE_EXPR IDENT ( IDENT )? ( mergeItem )+ ( whereClause[true] )? )
            {
            m=(CommonTree)match(input,ON_MERGE_EXPR,FOLLOW_ON_MERGE_EXPR_in_onMergeExpr499); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_onMergeExpr501); 
            // EsperEPL2Ast.g:115:28: ( IDENT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // EsperEPL2Ast.g:115:28: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_onMergeExpr503); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:115:35: ( mergeItem )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=MERGE_UNM && LA24_0<=MERGE_MAT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // EsperEPL2Ast.g:115:35: mergeItem
            	    {
            	    pushFollow(FOLLOW_mergeItem_in_onMergeExpr506);
            	    mergeItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            // EsperEPL2Ast.g:115:46: ( whereClause[true] )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==WHERE_EXPR) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // EsperEPL2Ast.g:115:46: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onMergeExpr509);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onMergeExpr"


    // $ANTLR start "mergeItem"
    // EsperEPL2Ast.g:118:1: mergeItem : ( mergeMatched | mergeUnmatched ) ;
    public final void mergeItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:119:2: ( ( mergeMatched | mergeUnmatched ) )
            // EsperEPL2Ast.g:119:4: ( mergeMatched | mergeUnmatched )
            {
            // EsperEPL2Ast.g:119:4: ( mergeMatched | mergeUnmatched )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==MERGE_MAT) ) {
                alt26=1;
            }
            else if ( (LA26_0==MERGE_UNM) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // EsperEPL2Ast.g:119:5: mergeMatched
                    {
                    pushFollow(FOLLOW_mergeMatched_in_mergeItem525);
                    mergeMatched();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:119:20: mergeUnmatched
                    {
                    pushFollow(FOLLOW_mergeUnmatched_in_mergeItem529);
                    mergeUnmatched();

                    state._fsp--;


                    }
                    break;

            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "mergeItem"


    // $ANTLR start "mergeMatched"
    // EsperEPL2Ast.g:122:1: mergeMatched : ^(m= MERGE_MAT ( mergeMatchedItem )+ ( valueExpr )? ) ;
    public final void mergeMatched() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:123:2: ( ^(m= MERGE_MAT ( mergeMatchedItem )+ ( valueExpr )? ) )
            // EsperEPL2Ast.g:123:4: ^(m= MERGE_MAT ( mergeMatchedItem )+ ( valueExpr )? )
            {
            m=(CommonTree)match(input,MERGE_MAT,FOLLOW_MERGE_MAT_in_mergeMatched544); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:123:18: ( mergeMatchedItem )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=MERGE_UPD && LA27_0<=MERGE_DEL)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // EsperEPL2Ast.g:123:18: mergeMatchedItem
            	    {
            	    pushFollow(FOLLOW_mergeMatchedItem_in_mergeMatched546);
            	    mergeMatchedItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            // EsperEPL2Ast.g:123:36: ( valueExpr )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=IN_SET && LA28_0<=REGEXP)||LA28_0==NOT_EXPR||(LA28_0>=SUM && LA28_0<=AVG)||(LA28_0>=COALESCE && LA28_0<=COUNT)||(LA28_0>=CASE && LA28_0<=CASE2)||LA28_0==ISTREAM||(LA28_0>=PREVIOUS && LA28_0<=EXISTS)||(LA28_0>=INSTANCEOF && LA28_0<=CURRENT_TIMESTAMP)||LA28_0==NEWKW||(LA28_0>=EVAL_AND_EXPR && LA28_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA28_0==EVENT_PROP_EXPR||LA28_0==CONCAT||(LA28_0>=LIB_FUNC_CHAIN && LA28_0<=DOT_EXPR)||LA28_0==ARRAY_EXPR||(LA28_0>=NOT_IN_SET && LA28_0<=NOT_REGEXP)||(LA28_0>=IN_RANGE && LA28_0<=SUBSELECT_EXPR)||(LA28_0>=EXISTS_SUBSELECT_EXPR && LA28_0<=NOT_IN_SUBSELECT_EXPR)||LA28_0==SUBSTITUTION||(LA28_0>=FIRST_AGGREG && LA28_0<=WINDOW_AGGREG)||(LA28_0>=INT_TYPE && LA28_0<=NULL_TYPE)||(LA28_0>=JSON_OBJECT && LA28_0<=JSON_ARRAY)||LA28_0==STAR||(LA28_0>=LT && LA28_0<=GT)||(LA28_0>=BOR && LA28_0<=PLUS)||(LA28_0>=BAND && LA28_0<=BXOR)||(LA28_0>=LE && LA28_0<=GE)||(LA28_0>=MINUS && LA28_0<=MOD)||(LA28_0>=EVAL_IS_GROUP_EXPR && LA28_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // EsperEPL2Ast.g:123:36: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_mergeMatched549);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(m); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "mergeMatched"


    // $ANTLR start "mergeMatchedItem"
    // EsperEPL2Ast.g:126:1: mergeMatchedItem : ( ^(m= MERGE_UPD ( onSetAssignment )* ( whereClause[false] )? ) | ^(d= MERGE_DEL ( whereClause[false] )? INT_TYPE ) | mergeInsert );
    public final void mergeMatchedItem() throws RecognitionException {
        CommonTree m=null;
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:127:2: ( ^(m= MERGE_UPD ( onSetAssignment )* ( whereClause[false] )? ) | ^(d= MERGE_DEL ( whereClause[false] )? INT_TYPE ) | mergeInsert )
            int alt32=3;
            switch ( input.LA(1) ) {
            case MERGE_UPD:
                {
                alt32=1;
                }
                break;
            case MERGE_DEL:
                {
                alt32=2;
                }
                break;
            case MERGE_INS:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // EsperEPL2Ast.g:127:4: ^(m= MERGE_UPD ( onSetAssignment )* ( whereClause[false] )? )
                    {
                    m=(CommonTree)match(input,MERGE_UPD,FOLLOW_MERGE_UPD_in_mergeMatchedItem567); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:127:18: ( onSetAssignment )*
                        loop29:
                        do {
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==ON_SET_EXPR_ITEM) ) {
                                alt29=1;
                            }


                            switch (alt29) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:127:18: onSetAssignment
                        	    {
                        	    pushFollow(FOLLOW_onSetAssignment_in_mergeMatchedItem569);
                        	    onSetAssignment();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop29;
                            }
                        } while (true);

                        // EsperEPL2Ast.g:127:35: ( whereClause[false] )?
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==WHERE_EXPR) ) {
                            alt30=1;
                        }
                        switch (alt30) {
                            case 1 :
                                // EsperEPL2Ast.g:127:35: whereClause[false]
                                {
                                pushFollow(FOLLOW_whereClause_in_mergeMatchedItem572);
                                whereClause(false);

                                state._fsp--;


                                }
                                break;

                        }

                         leaveNode(m); 

                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:128:4: ^(d= MERGE_DEL ( whereClause[false] )? INT_TYPE )
                    {
                    d=(CommonTree)match(input,MERGE_DEL,FOLLOW_MERGE_DEL_in_mergeMatchedItem585); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:128:18: ( whereClause[false] )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==WHERE_EXPR) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // EsperEPL2Ast.g:128:18: whereClause[false]
                            {
                            pushFollow(FOLLOW_whereClause_in_mergeMatchedItem587);
                            whereClause(false);

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,INT_TYPE,FOLLOW_INT_TYPE_in_mergeMatchedItem591); 
                     leaveNode(d); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:129:4: mergeInsert
                    {
                    pushFollow(FOLLOW_mergeInsert_in_mergeMatchedItem599);
                    mergeInsert();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "mergeMatchedItem"


    // $ANTLR start "mergeUnmatched"
    // EsperEPL2Ast.g:132:1: mergeUnmatched : ^(m= MERGE_UNM ( mergeInsert )+ ( valueExpr )? ) ;
    public final void mergeUnmatched() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:133:2: ( ^(m= MERGE_UNM ( mergeInsert )+ ( valueExpr )? ) )
            // EsperEPL2Ast.g:133:4: ^(m= MERGE_UNM ( mergeInsert )+ ( valueExpr )? )
            {
            m=(CommonTree)match(input,MERGE_UNM,FOLLOW_MERGE_UNM_in_mergeUnmatched613); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:133:18: ( mergeInsert )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==MERGE_INS) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // EsperEPL2Ast.g:133:18: mergeInsert
            	    {
            	    pushFollow(FOLLOW_mergeInsert_in_mergeUnmatched615);
            	    mergeInsert();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            // EsperEPL2Ast.g:133:31: ( valueExpr )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=IN_SET && LA34_0<=REGEXP)||LA34_0==NOT_EXPR||(LA34_0>=SUM && LA34_0<=AVG)||(LA34_0>=COALESCE && LA34_0<=COUNT)||(LA34_0>=CASE && LA34_0<=CASE2)||LA34_0==ISTREAM||(LA34_0>=PREVIOUS && LA34_0<=EXISTS)||(LA34_0>=INSTANCEOF && LA34_0<=CURRENT_TIMESTAMP)||LA34_0==NEWKW||(LA34_0>=EVAL_AND_EXPR && LA34_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA34_0==EVENT_PROP_EXPR||LA34_0==CONCAT||(LA34_0>=LIB_FUNC_CHAIN && LA34_0<=DOT_EXPR)||LA34_0==ARRAY_EXPR||(LA34_0>=NOT_IN_SET && LA34_0<=NOT_REGEXP)||(LA34_0>=IN_RANGE && LA34_0<=SUBSELECT_EXPR)||(LA34_0>=EXISTS_SUBSELECT_EXPR && LA34_0<=NOT_IN_SUBSELECT_EXPR)||LA34_0==SUBSTITUTION||(LA34_0>=FIRST_AGGREG && LA34_0<=WINDOW_AGGREG)||(LA34_0>=INT_TYPE && LA34_0<=NULL_TYPE)||(LA34_0>=JSON_OBJECT && LA34_0<=JSON_ARRAY)||LA34_0==STAR||(LA34_0>=LT && LA34_0<=GT)||(LA34_0>=BOR && LA34_0<=PLUS)||(LA34_0>=BAND && LA34_0<=BXOR)||(LA34_0>=LE && LA34_0<=GE)||(LA34_0>=MINUS && LA34_0<=MOD)||(LA34_0>=EVAL_IS_GROUP_EXPR && LA34_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // EsperEPL2Ast.g:133:31: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_mergeUnmatched618);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(m); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "mergeUnmatched"


    // $ANTLR start "mergeInsert"
    // EsperEPL2Ast.g:136:1: mergeInsert : ^(um= MERGE_INS selectionList ( CLASS_IDENT )? ( exprCol )? ( whereClause[false] )? ) ;
    public final void mergeInsert() throws RecognitionException {
        CommonTree um=null;

        try {
            // EsperEPL2Ast.g:137:2: ( ^(um= MERGE_INS selectionList ( CLASS_IDENT )? ( exprCol )? ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:137:4: ^(um= MERGE_INS selectionList ( CLASS_IDENT )? ( exprCol )? ( whereClause[false] )? )
            {
            um=(CommonTree)match(input,MERGE_INS,FOLLOW_MERGE_INS_in_mergeInsert637); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_selectionList_in_mergeInsert639);
            selectionList();

            state._fsp--;

            // EsperEPL2Ast.g:137:33: ( CLASS_IDENT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==CLASS_IDENT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // EsperEPL2Ast.g:137:33: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_mergeInsert641); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:137:46: ( exprCol )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==EXPRCOL) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // EsperEPL2Ast.g:137:46: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_mergeInsert644);
                    exprCol();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:137:55: ( whereClause[false] )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==WHERE_EXPR) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // EsperEPL2Ast.g:137:55: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_mergeInsert647);
                    whereClause(false);

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(um); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "mergeInsert"


    // $ANTLR start "updateExpr"
    // EsperEPL2Ast.g:140:1: updateExpr : ^(u= UPDATE_EXPR updateDetails ) ;
    public final void updateExpr() throws RecognitionException {
        CommonTree u=null;

        try {
            // EsperEPL2Ast.g:141:2: ( ^(u= UPDATE_EXPR updateDetails ) )
            // EsperEPL2Ast.g:141:4: ^(u= UPDATE_EXPR updateDetails )
            {
            u=(CommonTree)match(input,UPDATE_EXPR,FOLLOW_UPDATE_EXPR_in_updateExpr667); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_updateDetails_in_updateExpr669);
            updateDetails();

            state._fsp--;

             leaveNode(u); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "updateExpr"


    // $ANTLR start "updateDetails"
    // EsperEPL2Ast.g:144:1: updateDetails : ^(u= UPDATE CLASS_IDENT ( IDENT )? ( onSetAssignment )+ ( whereClause[false] )? ) ;
    public final void updateDetails() throws RecognitionException {
        CommonTree u=null;

        try {
            // EsperEPL2Ast.g:145:2: ( ^(u= UPDATE CLASS_IDENT ( IDENT )? ( onSetAssignment )+ ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:145:4: ^(u= UPDATE CLASS_IDENT ( IDENT )? ( onSetAssignment )+ ( whereClause[false] )? )
            {
            u=(CommonTree)match(input,UPDATE,FOLLOW_UPDATE_in_updateDetails686); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_updateDetails688); 
            // EsperEPL2Ast.g:145:27: ( IDENT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==IDENT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // EsperEPL2Ast.g:145:27: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_updateDetails690); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:145:34: ( onSetAssignment )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ON_SET_EXPR_ITEM) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // EsperEPL2Ast.g:145:34: onSetAssignment
            	    {
            	    pushFollow(FOLLOW_onSetAssignment_in_updateDetails693);
            	    onSetAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // EsperEPL2Ast.g:145:51: ( whereClause[false] )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==WHERE_EXPR) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // EsperEPL2Ast.g:145:51: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_updateDetails696);
                    whereClause(false);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "updateDetails"


    // $ANTLR start "onDeleteExpr"
    // EsperEPL2Ast.g:148:1: onDeleteExpr : ^( ON_DELETE_EXPR onExprFrom ( whereClause[true] )? ) ;
    public final void onDeleteExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:149:2: ( ^( ON_DELETE_EXPR onExprFrom ( whereClause[true] )? ) )
            // EsperEPL2Ast.g:149:4: ^( ON_DELETE_EXPR onExprFrom ( whereClause[true] )? )
            {
            match(input,ON_DELETE_EXPR,FOLLOW_ON_DELETE_EXPR_in_onDeleteExpr711); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onExprFrom_in_onDeleteExpr713);
            onExprFrom();

            state._fsp--;

            // EsperEPL2Ast.g:149:32: ( whereClause[true] )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WHERE_EXPR) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // EsperEPL2Ast.g:149:33: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onDeleteExpr716);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onDeleteExpr"


    // $ANTLR start "onSelectExpr"
    // EsperEPL2Ast.g:152:1: onSelectExpr : ^(s= ON_SELECT_EXPR ( insertIntoExpr )? ( DELETE )? ( DISTINCT )? selectionList ( onExprFrom )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( orderByClause )? ( rowLimitClause )? ) ;
    public final void onSelectExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:153:2: ( ^(s= ON_SELECT_EXPR ( insertIntoExpr )? ( DELETE )? ( DISTINCT )? selectionList ( onExprFrom )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( orderByClause )? ( rowLimitClause )? ) )
            // EsperEPL2Ast.g:153:4: ^(s= ON_SELECT_EXPR ( insertIntoExpr )? ( DELETE )? ( DISTINCT )? selectionList ( onExprFrom )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( orderByClause )? ( rowLimitClause )? )
            {
            s=(CommonTree)match(input,ON_SELECT_EXPR,FOLLOW_ON_SELECT_EXPR_in_onSelectExpr736); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:153:23: ( insertIntoExpr )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==INSERTINTO_EXPR) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // EsperEPL2Ast.g:153:23: insertIntoExpr
                    {
                    pushFollow(FOLLOW_insertIntoExpr_in_onSelectExpr738);
                    insertIntoExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:153:39: ( DELETE )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==DELETE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // EsperEPL2Ast.g:153:39: DELETE
                    {
                    match(input,DELETE,FOLLOW_DELETE_in_onSelectExpr741); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:153:47: ( DISTINCT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==DISTINCT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // EsperEPL2Ast.g:153:47: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_onSelectExpr744); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_onSelectExpr747);
            selectionList();

            state._fsp--;

            // EsperEPL2Ast.g:153:71: ( onExprFrom )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==ON_EXPR_FROM) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // EsperEPL2Ast.g:153:71: onExprFrom
                    {
                    pushFollow(FOLLOW_onExprFrom_in_onSelectExpr749);
                    onExprFrom();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:153:83: ( whereClause[true] )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==WHERE_EXPR) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // EsperEPL2Ast.g:153:83: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onSelectExpr752);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:153:102: ( groupByClause )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==GROUP_BY_EXPR) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // EsperEPL2Ast.g:153:102: groupByClause
                    {
                    pushFollow(FOLLOW_groupByClause_in_onSelectExpr756);
                    groupByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:153:117: ( havingClause )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==HAVING_EXPR) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // EsperEPL2Ast.g:153:117: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_onSelectExpr759);
                    havingClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:153:131: ( orderByClause )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ORDER_BY_EXPR) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // EsperEPL2Ast.g:153:131: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_onSelectExpr762);
                    orderByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:153:146: ( rowLimitClause )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ROW_LIMIT_EXPR) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // EsperEPL2Ast.g:153:146: rowLimitClause
                    {
                    pushFollow(FOLLOW_rowLimitClause_in_onSelectExpr765);
                    rowLimitClause();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onSelectExpr"


    // $ANTLR start "onSelectInsertExpr"
    // EsperEPL2Ast.g:156:1: onSelectInsertExpr : ^( ON_SELECT_INSERT_EXPR insertIntoExpr selectionList ( whereClause[true] )? ) ;
    public final void onSelectInsertExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:157:2: ( ^( ON_SELECT_INSERT_EXPR insertIntoExpr selectionList ( whereClause[true] )? ) )
            // EsperEPL2Ast.g:157:4: ^( ON_SELECT_INSERT_EXPR insertIntoExpr selectionList ( whereClause[true] )? )
            {
            pushStmtContext();
            match(input,ON_SELECT_INSERT_EXPR,FOLLOW_ON_SELECT_INSERT_EXPR_in_onSelectInsertExpr785); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_insertIntoExpr_in_onSelectInsertExpr787);
            insertIntoExpr();

            state._fsp--;

            pushFollow(FOLLOW_selectionList_in_onSelectInsertExpr789);
            selectionList();

            state._fsp--;

            // EsperEPL2Ast.g:157:78: ( whereClause[true] )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==WHERE_EXPR) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // EsperEPL2Ast.g:157:78: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_onSelectInsertExpr791);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onSelectInsertExpr"


    // $ANTLR start "onSelectInsertOutput"
    // EsperEPL2Ast.g:160:1: onSelectInsertOutput : ^( ON_SELECT_INSERT_OUTPUT ( ALL | FIRST ) ) ;
    public final void onSelectInsertOutput() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:161:2: ( ^( ON_SELECT_INSERT_OUTPUT ( ALL | FIRST ) ) )
            // EsperEPL2Ast.g:161:4: ^( ON_SELECT_INSERT_OUTPUT ( ALL | FIRST ) )
            {
            match(input,ON_SELECT_INSERT_OUTPUT,FOLLOW_ON_SELECT_INSERT_OUTPUT_in_onSelectInsertOutput808); 

            match(input, Token.DOWN, null); 
            if ( input.LA(1)==ALL||input.LA(1)==FIRST ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onSelectInsertOutput"


    // $ANTLR start "onSetExpr"
    // EsperEPL2Ast.g:164:1: onSetExpr : ^( ON_SET_EXPR onSetAssignment ( onSetAssignment )* ( whereClause[false] )? ) ;
    public final void onSetExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:165:2: ( ^( ON_SET_EXPR onSetAssignment ( onSetAssignment )* ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:165:4: ^( ON_SET_EXPR onSetAssignment ( onSetAssignment )* ( whereClause[false] )? )
            {
            match(input,ON_SET_EXPR,FOLLOW_ON_SET_EXPR_in_onSetExpr828); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onSetAssignment_in_onSetExpr830);
            onSetAssignment();

            state._fsp--;

            // EsperEPL2Ast.g:165:34: ( onSetAssignment )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==ON_SET_EXPR_ITEM) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // EsperEPL2Ast.g:165:35: onSetAssignment
            	    {
            	    pushFollow(FOLLOW_onSetAssignment_in_onSetExpr833);
            	    onSetAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // EsperEPL2Ast.g:165:53: ( whereClause[false] )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==WHERE_EXPR) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // EsperEPL2Ast.g:165:53: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_onSetExpr837);
                    whereClause(false);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onSetExpr"


    // $ANTLR start "onUpdateExpr"
    // EsperEPL2Ast.g:168:1: onUpdateExpr : ^( ON_UPDATE_EXPR onExprFrom ( onSetAssignment )+ ( whereClause[false] )? ) ;
    public final void onUpdateExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:169:2: ( ^( ON_UPDATE_EXPR onExprFrom ( onSetAssignment )+ ( whereClause[false] )? ) )
            // EsperEPL2Ast.g:169:4: ^( ON_UPDATE_EXPR onExprFrom ( onSetAssignment )+ ( whereClause[false] )? )
            {
            match(input,ON_UPDATE_EXPR,FOLLOW_ON_UPDATE_EXPR_in_onUpdateExpr852); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_onExprFrom_in_onUpdateExpr854);
            onExprFrom();

            state._fsp--;

            // EsperEPL2Ast.g:169:32: ( onSetAssignment )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==ON_SET_EXPR_ITEM) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // EsperEPL2Ast.g:169:32: onSetAssignment
            	    {
            	    pushFollow(FOLLOW_onSetAssignment_in_onUpdateExpr856);
            	    onSetAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            // EsperEPL2Ast.g:169:49: ( whereClause[false] )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==WHERE_EXPR) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // EsperEPL2Ast.g:169:49: whereClause[false]
                    {
                    pushFollow(FOLLOW_whereClause_in_onUpdateExpr859);
                    whereClause(false);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onUpdateExpr"


    // $ANTLR start "onSetAssignment"
    // EsperEPL2Ast.g:172:1: onSetAssignment : ^( ON_SET_EXPR_ITEM valueExpr ) ;
    public final void onSetAssignment() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:173:2: ( ^( ON_SET_EXPR_ITEM valueExpr ) )
            // EsperEPL2Ast.g:173:4: ^( ON_SET_EXPR_ITEM valueExpr )
            {
            match(input,ON_SET_EXPR_ITEM,FOLLOW_ON_SET_EXPR_ITEM_in_onSetAssignment874); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_onSetAssignment876);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onSetAssignment"


    // $ANTLR start "onExprFrom"
    // EsperEPL2Ast.g:176:1: onExprFrom : ^( ON_EXPR_FROM IDENT ( IDENT )? ) ;
    public final void onExprFrom() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:177:2: ( ^( ON_EXPR_FROM IDENT ( IDENT )? ) )
            // EsperEPL2Ast.g:177:4: ^( ON_EXPR_FROM IDENT ( IDENT )? )
            {
            match(input,ON_EXPR_FROM,FOLLOW_ON_EXPR_FROM_in_onExprFrom890); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_onExprFrom892); 
            // EsperEPL2Ast.g:177:25: ( IDENT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==IDENT) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // EsperEPL2Ast.g:177:26: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_onExprFrom895); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "onExprFrom"


    // $ANTLR start "createWindowExpr"
    // EsperEPL2Ast.g:180:1: createWindowExpr : ^(i= CREATE_WINDOW_EXPR IDENT ( viewListExpr )? ( RETAINUNION )? ( RETAININTERSECTION )? ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) ) ( createWindowExprInsert )? ) ;
    public final void createWindowExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:181:2: ( ^(i= CREATE_WINDOW_EXPR IDENT ( viewListExpr )? ( RETAINUNION )? ( RETAININTERSECTION )? ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) ) ( createWindowExprInsert )? ) )
            // EsperEPL2Ast.g:181:4: ^(i= CREATE_WINDOW_EXPR IDENT ( viewListExpr )? ( RETAINUNION )? ( RETAININTERSECTION )? ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) ) ( createWindowExprInsert )? )
            {
            i=(CommonTree)match(input,CREATE_WINDOW_EXPR,FOLLOW_CREATE_WINDOW_EXPR_in_createWindowExpr913); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createWindowExpr915); 
            // EsperEPL2Ast.g:181:33: ( viewListExpr )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==VIEW_EXPR) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // EsperEPL2Ast.g:181:34: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_createWindowExpr918);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:181:49: ( RETAINUNION )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RETAINUNION) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // EsperEPL2Ast.g:181:49: RETAINUNION
                    {
                    match(input,RETAINUNION,FOLLOW_RETAINUNION_in_createWindowExpr922); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:181:62: ( RETAININTERSECTION )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RETAININTERSECTION) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // EsperEPL2Ast.g:181:62: RETAININTERSECTION
                    {
                    match(input,RETAININTERSECTION,FOLLOW_RETAININTERSECTION_in_createWindowExpr925); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:182:4: ( ( ( createSelectionList )? CLASS_IDENT ) | ( createColTypeList ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==CLASS_IDENT||LA61_0==CREATE_WINDOW_SELECT_EXPR) ) {
                alt61=1;
            }
            else if ( (LA61_0==CREATE_COL_TYPE_LIST) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // EsperEPL2Ast.g:183:5: ( ( createSelectionList )? CLASS_IDENT )
                    {
                    // EsperEPL2Ast.g:183:5: ( ( createSelectionList )? CLASS_IDENT )
                    // EsperEPL2Ast.g:183:6: ( createSelectionList )? CLASS_IDENT
                    {
                    // EsperEPL2Ast.g:183:6: ( createSelectionList )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==CREATE_WINDOW_SELECT_EXPR) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // EsperEPL2Ast.g:183:6: createSelectionList
                            {
                            pushFollow(FOLLOW_createSelectionList_in_createWindowExpr939);
                            createSelectionList();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createWindowExpr942); 

                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:185:12: ( createColTypeList )
                    {
                    // EsperEPL2Ast.g:185:12: ( createColTypeList )
                    // EsperEPL2Ast.g:185:13: createColTypeList
                    {
                    pushFollow(FOLLOW_createColTypeList_in_createWindowExpr971);
                    createColTypeList();

                    state._fsp--;


                    }


                    }
                    break;

            }

            // EsperEPL2Ast.g:187:4: ( createWindowExprInsert )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==INSERT) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // EsperEPL2Ast.g:187:4: createWindowExprInsert
                    {
                    pushFollow(FOLLOW_createWindowExprInsert_in_createWindowExpr982);
                    createWindowExprInsert();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createWindowExpr"


    // $ANTLR start "createIndexExpr"
    // EsperEPL2Ast.g:191:1: createIndexExpr : ^(i= CREATE_INDEX_EXPR IDENT IDENT indexColList ( IDENT )? ) ;
    public final void createIndexExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:192:2: ( ^(i= CREATE_INDEX_EXPR IDENT IDENT indexColList ( IDENT )? ) )
            // EsperEPL2Ast.g:192:4: ^(i= CREATE_INDEX_EXPR IDENT IDENT indexColList ( IDENT )? )
            {
            i=(CommonTree)match(input,CREATE_INDEX_EXPR,FOLLOW_CREATE_INDEX_EXPR_in_createIndexExpr1002); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createIndexExpr1004); 
            match(input,IDENT,FOLLOW_IDENT_in_createIndexExpr1006); 
            pushFollow(FOLLOW_indexColList_in_createIndexExpr1008);
            indexColList();

            state._fsp--;

            // EsperEPL2Ast.g:192:51: ( IDENT )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==IDENT) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // EsperEPL2Ast.g:192:51: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_createIndexExpr1010); 

                    }
                    break;

            }

             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createIndexExpr"


    // $ANTLR start "indexColList"
    // EsperEPL2Ast.g:195:1: indexColList : ^( INDEXCOL ( indexCol )+ ) ;
    public final void indexColList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:196:2: ( ^( INDEXCOL ( indexCol )+ ) )
            // EsperEPL2Ast.g:196:4: ^( INDEXCOL ( indexCol )+ )
            {
            match(input,INDEXCOL,FOLLOW_INDEXCOL_in_indexColList1026); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:196:15: ( indexCol )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==INDEXCOL) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // EsperEPL2Ast.g:196:15: indexCol
            	    {
            	    pushFollow(FOLLOW_indexCol_in_indexColList1028);
            	    indexCol();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "indexColList"


    // $ANTLR start "indexCol"
    // EsperEPL2Ast.g:199:1: indexCol : ^( INDEXCOL IDENT ( IDENT )? ) ;
    public final void indexCol() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:200:2: ( ^( INDEXCOL IDENT ( IDENT )? ) )
            // EsperEPL2Ast.g:200:4: ^( INDEXCOL IDENT ( IDENT )? )
            {
            match(input,INDEXCOL,FOLLOW_INDEXCOL_in_indexCol1043); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_indexCol1045); 
            // EsperEPL2Ast.g:200:21: ( IDENT )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==IDENT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // EsperEPL2Ast.g:200:21: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_indexCol1047); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "indexCol"


    // $ANTLR start "createWindowExprInsert"
    // EsperEPL2Ast.g:203:1: createWindowExprInsert : ^( INSERT ( valueExpr )? ) ;
    public final void createWindowExprInsert() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:204:2: ( ^( INSERT ( valueExpr )? ) )
            // EsperEPL2Ast.g:204:4: ^( INSERT ( valueExpr )? )
            {
            match(input,INSERT,FOLLOW_INSERT_in_createWindowExprInsert1061); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:204:13: ( valueExpr )?
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=IN_SET && LA66_0<=REGEXP)||LA66_0==NOT_EXPR||(LA66_0>=SUM && LA66_0<=AVG)||(LA66_0>=COALESCE && LA66_0<=COUNT)||(LA66_0>=CASE && LA66_0<=CASE2)||LA66_0==ISTREAM||(LA66_0>=PREVIOUS && LA66_0<=EXISTS)||(LA66_0>=INSTANCEOF && LA66_0<=CURRENT_TIMESTAMP)||LA66_0==NEWKW||(LA66_0>=EVAL_AND_EXPR && LA66_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA66_0==EVENT_PROP_EXPR||LA66_0==CONCAT||(LA66_0>=LIB_FUNC_CHAIN && LA66_0<=DOT_EXPR)||LA66_0==ARRAY_EXPR||(LA66_0>=NOT_IN_SET && LA66_0<=NOT_REGEXP)||(LA66_0>=IN_RANGE && LA66_0<=SUBSELECT_EXPR)||(LA66_0>=EXISTS_SUBSELECT_EXPR && LA66_0<=NOT_IN_SUBSELECT_EXPR)||LA66_0==SUBSTITUTION||(LA66_0>=FIRST_AGGREG && LA66_0<=WINDOW_AGGREG)||(LA66_0>=INT_TYPE && LA66_0<=NULL_TYPE)||(LA66_0>=JSON_OBJECT && LA66_0<=JSON_ARRAY)||LA66_0==STAR||(LA66_0>=LT && LA66_0<=GT)||(LA66_0>=BOR && LA66_0<=PLUS)||(LA66_0>=BAND && LA66_0<=BXOR)||(LA66_0>=LE && LA66_0<=GE)||(LA66_0>=MINUS && LA66_0<=MOD)||(LA66_0>=EVAL_IS_GROUP_EXPR && LA66_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt66=1;
                }
                switch (alt66) {
                    case 1 :
                        // EsperEPL2Ast.g:204:13: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_createWindowExprInsert1063);
                        valueExpr();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createWindowExprInsert"


    // $ANTLR start "createSelectionList"
    // EsperEPL2Ast.g:207:1: createSelectionList : ^(s= CREATE_WINDOW_SELECT_EXPR createSelectionListElement ( createSelectionListElement )* ) ;
    public final void createSelectionList() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:208:2: ( ^(s= CREATE_WINDOW_SELECT_EXPR createSelectionListElement ( createSelectionListElement )* ) )
            // EsperEPL2Ast.g:208:4: ^(s= CREATE_WINDOW_SELECT_EXPR createSelectionListElement ( createSelectionListElement )* )
            {
            s=(CommonTree)match(input,CREATE_WINDOW_SELECT_EXPR,FOLLOW_CREATE_WINDOW_SELECT_EXPR_in_createSelectionList1080); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_createSelectionListElement_in_createSelectionList1082);
            createSelectionListElement();

            state._fsp--;

            // EsperEPL2Ast.g:208:61: ( createSelectionListElement )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==SELECTION_ELEMENT_EXPR||LA67_0==WILDCARD_SELECT) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // EsperEPL2Ast.g:208:62: createSelectionListElement
            	    {
            	    pushFollow(FOLLOW_createSelectionListElement_in_createSelectionList1085);
            	    createSelectionListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createSelectionList"


    // $ANTLR start "createColTypeList"
    // EsperEPL2Ast.g:211:1: createColTypeList : ^( CREATE_COL_TYPE_LIST createColTypeListElement ( createColTypeListElement )* ) ;
    public final void createColTypeList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:212:2: ( ^( CREATE_COL_TYPE_LIST createColTypeListElement ( createColTypeListElement )* ) )
            // EsperEPL2Ast.g:212:4: ^( CREATE_COL_TYPE_LIST createColTypeListElement ( createColTypeListElement )* )
            {
            match(input,CREATE_COL_TYPE_LIST,FOLLOW_CREATE_COL_TYPE_LIST_in_createColTypeList1104); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_createColTypeListElement_in_createColTypeList1106);
            createColTypeListElement();

            state._fsp--;

            // EsperEPL2Ast.g:212:52: ( createColTypeListElement )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==CREATE_COL_TYPE) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // EsperEPL2Ast.g:212:53: createColTypeListElement
            	    {
            	    pushFollow(FOLLOW_createColTypeListElement_in_createColTypeList1109);
            	    createColTypeListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createColTypeList"


    // $ANTLR start "createColTypeListElement"
    // EsperEPL2Ast.g:215:1: createColTypeListElement : ^( CREATE_COL_TYPE CLASS_IDENT CLASS_IDENT ( LBRACK )? ) ;
    public final void createColTypeListElement() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:216:2: ( ^( CREATE_COL_TYPE CLASS_IDENT CLASS_IDENT ( LBRACK )? ) )
            // EsperEPL2Ast.g:216:4: ^( CREATE_COL_TYPE CLASS_IDENT CLASS_IDENT ( LBRACK )? )
            {
            match(input,CREATE_COL_TYPE,FOLLOW_CREATE_COL_TYPE_in_createColTypeListElement1124); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createColTypeListElement1126); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createColTypeListElement1128); 
            // EsperEPL2Ast.g:216:46: ( LBRACK )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==LBRACK) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // EsperEPL2Ast.g:216:46: LBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_createColTypeListElement1130); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createColTypeListElement"


    // $ANTLR start "createSelectionListElement"
    // EsperEPL2Ast.g:219:1: createSelectionListElement : (w= WILDCARD_SELECT | ^(s= SELECTION_ELEMENT_EXPR ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) ) ) );
    public final void createSelectionListElement() throws RecognitionException {
        CommonTree w=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:220:2: (w= WILDCARD_SELECT | ^(s= SELECTION_ELEMENT_EXPR ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==WILDCARD_SELECT) ) {
                alt72=1;
            }
            else if ( (LA72_0==SELECTION_ELEMENT_EXPR) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // EsperEPL2Ast.g:220:4: w= WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,WILDCARD_SELECT,FOLLOW_WILDCARD_SELECT_in_createSelectionListElement1145); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:221:4: ^(s= SELECTION_ELEMENT_EXPR ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) ) )
                    {
                    s=(CommonTree)match(input,SELECTION_ELEMENT_EXPR,FOLLOW_SELECTION_ELEMENT_EXPR_in_createSelectionListElement1155); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:221:31: ( ( eventPropertyExpr[true] ( IDENT )? ) | ( constant[true] IDENT ) )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==EVENT_PROP_EXPR) ) {
                        alt71=1;
                    }
                    else if ( ((LA71_0>=INT_TYPE && LA71_0<=NULL_TYPE)) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // EsperEPL2Ast.g:222:16: ( eventPropertyExpr[true] ( IDENT )? )
                            {
                            // EsperEPL2Ast.g:222:16: ( eventPropertyExpr[true] ( IDENT )? )
                            // EsperEPL2Ast.g:222:17: eventPropertyExpr[true] ( IDENT )?
                            {
                            pushFollow(FOLLOW_eventPropertyExpr_in_createSelectionListElement1175);
                            eventPropertyExpr(true);

                            state._fsp--;

                            // EsperEPL2Ast.g:222:41: ( IDENT )?
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==IDENT) ) {
                                alt70=1;
                            }
                            switch (alt70) {
                                case 1 :
                                    // EsperEPL2Ast.g:222:42: IDENT
                                    {
                                    match(input,IDENT,FOLLOW_IDENT_in_createSelectionListElement1179); 

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:223:16: ( constant[true] IDENT )
                            {
                            // EsperEPL2Ast.g:223:16: ( constant[true] IDENT )
                            // EsperEPL2Ast.g:223:17: constant[true] IDENT
                            {
                            pushFollow(FOLLOW_constant_in_createSelectionListElement1201);
                            constant(true);

                            state._fsp--;

                            match(input,IDENT,FOLLOW_IDENT_in_createSelectionListElement1204); 

                            }


                            }
                            break;

                    }

                     leaveNode(s); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createSelectionListElement"


    // $ANTLR start "createVariableExpr"
    // EsperEPL2Ast.g:227:1: createVariableExpr : ^(i= CREATE_VARIABLE_EXPR CLASS_IDENT IDENT ( IDENT )? ( LBRACK )? ( valueExpr )? ) ;
    public final void createVariableExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:228:2: ( ^(i= CREATE_VARIABLE_EXPR CLASS_IDENT IDENT ( IDENT )? ( LBRACK )? ( valueExpr )? ) )
            // EsperEPL2Ast.g:228:4: ^(i= CREATE_VARIABLE_EXPR CLASS_IDENT IDENT ( IDENT )? ( LBRACK )? ( valueExpr )? )
            {
            i=(CommonTree)match(input,CREATE_VARIABLE_EXPR,FOLLOW_CREATE_VARIABLE_EXPR_in_createVariableExpr1240); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_createVariableExpr1242); 
            match(input,IDENT,FOLLOW_IDENT_in_createVariableExpr1244); 
            // EsperEPL2Ast.g:228:47: ( IDENT )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==IDENT) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // EsperEPL2Ast.g:228:47: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_createVariableExpr1246); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:228:54: ( LBRACK )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==LBRACK) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // EsperEPL2Ast.g:228:54: LBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_createVariableExpr1249); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:228:62: ( valueExpr )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=IN_SET && LA75_0<=REGEXP)||LA75_0==NOT_EXPR||(LA75_0>=SUM && LA75_0<=AVG)||(LA75_0>=COALESCE && LA75_0<=COUNT)||(LA75_0>=CASE && LA75_0<=CASE2)||LA75_0==ISTREAM||(LA75_0>=PREVIOUS && LA75_0<=EXISTS)||(LA75_0>=INSTANCEOF && LA75_0<=CURRENT_TIMESTAMP)||LA75_0==NEWKW||(LA75_0>=EVAL_AND_EXPR && LA75_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA75_0==EVENT_PROP_EXPR||LA75_0==CONCAT||(LA75_0>=LIB_FUNC_CHAIN && LA75_0<=DOT_EXPR)||LA75_0==ARRAY_EXPR||(LA75_0>=NOT_IN_SET && LA75_0<=NOT_REGEXP)||(LA75_0>=IN_RANGE && LA75_0<=SUBSELECT_EXPR)||(LA75_0>=EXISTS_SUBSELECT_EXPR && LA75_0<=NOT_IN_SUBSELECT_EXPR)||LA75_0==SUBSTITUTION||(LA75_0>=FIRST_AGGREG && LA75_0<=WINDOW_AGGREG)||(LA75_0>=INT_TYPE && LA75_0<=NULL_TYPE)||(LA75_0>=JSON_OBJECT && LA75_0<=JSON_ARRAY)||LA75_0==STAR||(LA75_0>=LT && LA75_0<=GT)||(LA75_0>=BOR && LA75_0<=PLUS)||(LA75_0>=BAND && LA75_0<=BXOR)||(LA75_0>=LE && LA75_0<=GE)||(LA75_0>=MINUS && LA75_0<=MOD)||(LA75_0>=EVAL_IS_GROUP_EXPR && LA75_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // EsperEPL2Ast.g:228:62: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_createVariableExpr1252);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createVariableExpr"


    // $ANTLR start "fafDelete"
    // EsperEPL2Ast.g:231:1: fafDelete : ^(d= DELETE IDENT ( IDENT )? ( whereClause[true] )? ) ;
    public final void fafDelete() throws RecognitionException {
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:232:2: ( ^(d= DELETE IDENT ( IDENT )? ( whereClause[true] )? ) )
            // EsperEPL2Ast.g:232:4: ^(d= DELETE IDENT ( IDENT )? ( whereClause[true] )? )
            {
            d=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_fafDelete1271); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_fafDelete1273); 
            // EsperEPL2Ast.g:232:21: ( IDENT )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==IDENT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // EsperEPL2Ast.g:232:21: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_fafDelete1275); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:232:28: ( whereClause[true] )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==WHERE_EXPR) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // EsperEPL2Ast.g:232:28: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_fafDelete1278);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(d); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "fafDelete"


    // $ANTLR start "fafUpdate"
    // EsperEPL2Ast.g:235:1: fafUpdate : ^(u= UPDATE updateDetails ) ;
    public final void fafUpdate() throws RecognitionException {
        CommonTree u=null;

        try {
            // EsperEPL2Ast.g:236:2: ( ^(u= UPDATE updateDetails ) )
            // EsperEPL2Ast.g:236:4: ^(u= UPDATE updateDetails )
            {
            u=(CommonTree)match(input,UPDATE,FOLLOW_UPDATE_in_fafUpdate1300); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_updateDetails_in_fafUpdate1302);
            updateDetails();

            state._fsp--;

             leaveNode(u); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "fafUpdate"


    // $ANTLR start "createDataflow"
    // EsperEPL2Ast.g:242:1: createDataflow : ^(s= CREATE_DATAFLOW IDENT ( gop )+ ) ;
    public final void createDataflow() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:243:2: ( ^(s= CREATE_DATAFLOW IDENT ( gop )+ ) )
            // EsperEPL2Ast.g:243:4: ^(s= CREATE_DATAFLOW IDENT ( gop )+ )
            {
            s=(CommonTree)match(input,CREATE_DATAFLOW,FOLLOW_CREATE_DATAFLOW_in_createDataflow1322); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createDataflow1324); 
            // EsperEPL2Ast.g:243:30: ( gop )+
            int cnt78=0;
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==CREATE_SCHEMA_EXPR||LA78_0==GOP) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // EsperEPL2Ast.g:243:30: gop
            	    {
            	    pushFollow(FOLLOW_gop_in_createDataflow1326);
            	    gop();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt78 >= 1 ) break loop78;
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
            } while (true);

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createDataflow"


    // $ANTLR start "gop"
    // EsperEPL2Ast.g:246:1: gop : ( ^( GOP ( IDENT | SELECT ) ( gopParam )? ( gopOut )? ( gopDetail )? ( annotation[false] )* ) | createSchemaExpr[false] );
    public final void gop() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:247:2: ( ^( GOP ( IDENT | SELECT ) ( gopParam )? ( gopOut )? ( gopDetail )? ( annotation[false] )* ) | createSchemaExpr[false] )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==GOP) ) {
                alt83=1;
            }
            else if ( (LA83_0==CREATE_SCHEMA_EXPR) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // EsperEPL2Ast.g:247:4: ^( GOP ( IDENT | SELECT ) ( gopParam )? ( gopOut )? ( gopDetail )? ( annotation[false] )* )
                    {
                    match(input,GOP,FOLLOW_GOP_in_gop1343); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==SELECT||input.LA(1)==IDENT ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:247:25: ( gopParam )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==GOPPARAM) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // EsperEPL2Ast.g:247:25: gopParam
                            {
                            pushFollow(FOLLOW_gopParam_in_gop1351);
                            gopParam();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:247:35: ( gopOut )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==GOPOUT) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // EsperEPL2Ast.g:247:35: gopOut
                            {
                            pushFollow(FOLLOW_gopOut_in_gop1354);
                            gopOut();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:247:43: ( gopDetail )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==GOPCFG) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // EsperEPL2Ast.g:247:43: gopDetail
                            {
                            pushFollow(FOLLOW_gopDetail_in_gop1357);
                            gopDetail();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:247:54: ( annotation[false] )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==ANNOTATION) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:247:55: annotation[false]
                    	    {
                    	    pushFollow(FOLLOW_annotation_in_gop1361);
                    	    annotation(false);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:248:4: createSchemaExpr[false]
                    {
                    pushFollow(FOLLOW_createSchemaExpr_in_gop1370);
                    createSchemaExpr(false);

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "gop"


    // $ANTLR start "gopParam"
    // EsperEPL2Ast.g:251:1: gopParam : ^( GOPPARAM ( gopParamItem )* ) ;
    public final void gopParam() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:252:2: ( ^( GOPPARAM ( gopParamItem )* ) )
            // EsperEPL2Ast.g:252:4: ^( GOPPARAM ( gopParamItem )* )
            {
            match(input,GOPPARAM,FOLLOW_GOPPARAM_in_gopParam1385); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:252:15: ( gopParamItem )*
                loop84:
                do {
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==GOPPARAMITM) ) {
                        alt84=1;
                    }


                    switch (alt84) {
                	case 1 :
                	    // EsperEPL2Ast.g:252:15: gopParamItem
                	    {
                	    pushFollow(FOLLOW_gopParamItem_in_gopParam1387);
                	    gopParamItem();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop84;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "gopParam"


    // $ANTLR start "gopParamItem"
    // EsperEPL2Ast.g:255:1: gopParamItem : ^( GOPPARAMITM ( CLASS_IDENT )+ ( ^( AS IDENT ) )? ) ;
    public final void gopParamItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:256:2: ( ^( GOPPARAMITM ( CLASS_IDENT )+ ( ^( AS IDENT ) )? ) )
            // EsperEPL2Ast.g:256:4: ^( GOPPARAMITM ( CLASS_IDENT )+ ( ^( AS IDENT ) )? )
            {
            match(input,GOPPARAMITM,FOLLOW_GOPPARAMITM_in_gopParamItem1401); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:256:18: ( CLASS_IDENT )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==CLASS_IDENT) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // EsperEPL2Ast.g:256:18: CLASS_IDENT
            	    {
            	    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_gopParamItem1403); 

            	    }
            	    break;

            	default :
            	    if ( cnt85 >= 1 ) break loop85;
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
            } while (true);

            // EsperEPL2Ast.g:256:31: ( ^( AS IDENT ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==AS) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // EsperEPL2Ast.g:256:32: ^( AS IDENT )
                    {
                    match(input,AS,FOLLOW_AS_in_gopParamItem1408); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_gopParamItem1410); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "gopParamItem"


    // $ANTLR start "gopOut"
    // EsperEPL2Ast.g:259:1: gopOut : ^( GOPOUT ( gopOutItem )* ) ;
    public final void gopOut() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:260:2: ( ^( GOPOUT ( gopOutItem )* ) )
            // EsperEPL2Ast.g:260:4: ^( GOPOUT ( gopOutItem )* )
            {
            match(input,GOPOUT,FOLLOW_GOPOUT_in_gopOut1426); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:260:13: ( gopOutItem )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==GOPOUTITM) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // EsperEPL2Ast.g:260:13: gopOutItem
                	    {
                	    pushFollow(FOLLOW_gopOutItem_in_gopOut1428);
                	    gopOutItem();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "gopOut"


    // $ANTLR start "gopOutItem"
    // EsperEPL2Ast.g:263:1: gopOutItem : ^( GOPOUTITM CLASS_IDENT ( gopOutTypeParam )* ) ;
    public final void gopOutItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:264:2: ( ^( GOPOUTITM CLASS_IDENT ( gopOutTypeParam )* ) )
            // EsperEPL2Ast.g:264:4: ^( GOPOUTITM CLASS_IDENT ( gopOutTypeParam )* )
            {
            match(input,GOPOUTITM,FOLLOW_GOPOUTITM_in_gopOutItem1442); 

            match(input, Token.DOWN, null); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_gopOutItem1444); 
            // EsperEPL2Ast.g:264:28: ( gopOutTypeParam )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==GOPOUTTYP) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // EsperEPL2Ast.g:264:28: gopOutTypeParam
            	    {
            	    pushFollow(FOLLOW_gopOutTypeParam_in_gopOutItem1446);
            	    gopOutTypeParam();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "gopOutItem"


    // $ANTLR start "gopOutTypeParam"
    // EsperEPL2Ast.g:267:1: gopOutTypeParam : ^( GOPOUTTYP ( ( CLASS_IDENT ( gopOutTypeParam )* ) | QUESTION ) ) ;
    public final void gopOutTypeParam() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:268:2: ( ^( GOPOUTTYP ( ( CLASS_IDENT ( gopOutTypeParam )* ) | QUESTION ) ) )
            // EsperEPL2Ast.g:268:4: ^( GOPOUTTYP ( ( CLASS_IDENT ( gopOutTypeParam )* ) | QUESTION ) )
            {
            match(input,GOPOUTTYP,FOLLOW_GOPOUTTYP_in_gopOutTypeParam1461); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:268:16: ( ( CLASS_IDENT ( gopOutTypeParam )* ) | QUESTION )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==CLASS_IDENT) ) {
                alt90=1;
            }
            else if ( (LA90_0==QUESTION) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // EsperEPL2Ast.g:268:17: ( CLASS_IDENT ( gopOutTypeParam )* )
                    {
                    // EsperEPL2Ast.g:268:17: ( CLASS_IDENT ( gopOutTypeParam )* )
                    // EsperEPL2Ast.g:268:18: CLASS_IDENT ( gopOutTypeParam )*
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_gopOutTypeParam1465); 
                    // EsperEPL2Ast.g:268:30: ( gopOutTypeParam )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==GOPOUTTYP) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:268:30: gopOutTypeParam
                    	    {
                    	    pushFollow(FOLLOW_gopOutTypeParam_in_gopOutTypeParam1467);
                    	    gopOutTypeParam();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:268:50: QUESTION
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_gopOutTypeParam1473); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "gopOutTypeParam"


    // $ANTLR start "gopDetail"
    // EsperEPL2Ast.g:271:1: gopDetail : ^( GOPCFG ( gopConfig )+ ) ;
    public final void gopDetail() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:272:2: ( ^( GOPCFG ( gopConfig )+ ) )
            // EsperEPL2Ast.g:272:4: ^( GOPCFG ( gopConfig )+ )
            {
            match(input,GOPCFG,FOLLOW_GOPCFG_in_gopDetail1487); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:272:13: ( gopConfig )+
            int cnt91=0;
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=GOPCFGITM && LA91_0<=GOPCFGEPL)||LA91_0==GOPCFGEXP) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // EsperEPL2Ast.g:272:13: gopConfig
            	    {
            	    pushFollow(FOLLOW_gopConfig_in_gopDetail1489);
            	    gopConfig();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt91 >= 1 ) break loop91;
                        EarlyExitException eee =
                            new EarlyExitException(91, input);
                        throw eee;
                }
                cnt91++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "gopDetail"


    // $ANTLR start "gopConfig"
    // EsperEPL2Ast.g:275:1: gopConfig : ( ^(a= GOPCFGITM IDENT valueExpr ) | ^(b= GOPCFGEXP valueExpr ) | ^(c= GOPCFGEPL selectExpr ) );
    public final void gopConfig() throws RecognitionException {
        CommonTree a=null;
        CommonTree b=null;
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:276:2: ( ^(a= GOPCFGITM IDENT valueExpr ) | ^(b= GOPCFGEXP valueExpr ) | ^(c= GOPCFGEPL selectExpr ) )
            int alt92=3;
            switch ( input.LA(1) ) {
            case GOPCFGITM:
                {
                alt92=1;
                }
                break;
            case GOPCFGEXP:
                {
                alt92=2;
                }
                break;
            case GOPCFGEPL:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // EsperEPL2Ast.g:276:4: ^(a= GOPCFGITM IDENT valueExpr )
                    {
                    a=(CommonTree)match(input,GOPCFGITM,FOLLOW_GOPCFGITM_in_gopConfig1505); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_gopConfig1507); 
                    pushFollow(FOLLOW_valueExpr_in_gopConfig1509);
                    valueExpr();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:277:4: ^(b= GOPCFGEXP valueExpr )
                    {
                    b=(CommonTree)match(input,GOPCFGEXP,FOLLOW_GOPCFGEXP_in_gopConfig1520); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_gopConfig1522);
                    valueExpr();

                    state._fsp--;

                     leaveNode(b); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:278:4: ^(c= GOPCFGEPL selectExpr )
                    {
                    c=(CommonTree)match(input,GOPCFGEPL,FOLLOW_GOPCFGEPL_in_gopConfig1533); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_selectExpr_in_gopConfig1535);
                    selectExpr();

                    state._fsp--;

                     leaveNode(c); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "gopConfig"


    // $ANTLR start "jsonvalue"
    // EsperEPL2Ast.g:281:1: jsonvalue : ( constant[false] | jsonobject[false] | jsonarray[false] );
    public final void jsonvalue() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:282:2: ( constant[false] | jsonobject[false] | jsonarray[false] )
            int alt93=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt93=1;
                }
                break;
            case JSON_OBJECT:
                {
                alt93=2;
                }
                break;
            case JSON_ARRAY:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // EsperEPL2Ast.g:282:5: constant[false]
                    {
                    pushFollow(FOLLOW_constant_in_jsonvalue1551);
                    constant(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:283:5: jsonobject[false]
                    {
                    pushFollow(FOLLOW_jsonobject_in_jsonvalue1558);
                    jsonobject(false);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:284:5: jsonarray[false]
                    {
                    pushFollow(FOLLOW_jsonarray_in_jsonvalue1565);
                    jsonarray(false);

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "jsonvalue"


    // $ANTLR start "jsonobject"
    // EsperEPL2Ast.g:287:1: jsonobject[boolean isLeaveNode] : ^(o= JSON_OBJECT ( jsonpair )* ) ;
    public final void jsonobject(boolean isLeaveNode) throws RecognitionException {
        CommonTree o=null;

        try {
            // EsperEPL2Ast.g:288:2: ( ^(o= JSON_OBJECT ( jsonpair )* ) )
            // EsperEPL2Ast.g:288:5: ^(o= JSON_OBJECT ( jsonpair )* )
            {
            o=(CommonTree)match(input,JSON_OBJECT,FOLLOW_JSON_OBJECT_in_jsonobject1582); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:288:21: ( jsonpair )*
                loop94:
                do {
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==JSON_FIELD) ) {
                        alt94=1;
                    }


                    switch (alt94) {
                	case 1 :
                	    // EsperEPL2Ast.g:288:21: jsonpair
                	    {
                	    pushFollow(FOLLOW_jsonpair_in_jsonobject1584);
                	    jsonpair();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop94;
                    }
                } while (true);

                 if (isLeaveNode) leaveNode(o); 

                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "jsonobject"


    // $ANTLR start "jsonarray"
    // EsperEPL2Ast.g:291:1: jsonarray[boolean isLeaveNode] : ^(a= JSON_ARRAY ( jsonvalue )* ) ;
    public final void jsonarray(boolean isLeaveNode) throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:292:9: ( ^(a= JSON_ARRAY ( jsonvalue )* ) )
            // EsperEPL2Ast.g:292:12: ^(a= JSON_ARRAY ( jsonvalue )* )
            {
            a=(CommonTree)match(input,JSON_ARRAY,FOLLOW_JSON_ARRAY_in_jsonarray1613); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:292:27: ( jsonvalue )*
                loop95:
                do {
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( ((LA95_0>=INT_TYPE && LA95_0<=NULL_TYPE)||(LA95_0>=JSON_OBJECT && LA95_0<=JSON_ARRAY)) ) {
                        alt95=1;
                    }


                    switch (alt95) {
                	case 1 :
                	    // EsperEPL2Ast.g:292:27: jsonvalue
                	    {
                	    pushFollow(FOLLOW_jsonvalue_in_jsonarray1615);
                	    jsonvalue();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop95;
                    }
                } while (true);

                 if (isLeaveNode) leaveNode(a); 

                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "jsonarray"


    // $ANTLR start "jsonpair"
    // EsperEPL2Ast.g:295:1: jsonpair : ^( JSON_FIELD ( constant[false] | IDENT ) jsonvalue ) ;
    public final void jsonpair() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:296:2: ( ^( JSON_FIELD ( constant[false] | IDENT ) jsonvalue ) )
            // EsperEPL2Ast.g:296:5: ^( JSON_FIELD ( constant[false] | IDENT ) jsonvalue )
            {
            match(input,JSON_FIELD,FOLLOW_JSON_FIELD_in_jsonpair1633); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:296:18: ( constant[false] | IDENT )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( ((LA96_0>=INT_TYPE && LA96_0<=NULL_TYPE)) ) {
                alt96=1;
            }
            else if ( (LA96_0==IDENT) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // EsperEPL2Ast.g:296:19: constant[false]
                    {
                    pushFollow(FOLLOW_constant_in_jsonpair1636);
                    constant(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:296:37: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_jsonpair1641); 

                    }
                    break;

            }

            pushFollow(FOLLOW_jsonvalue_in_jsonpair1644);
            jsonvalue();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "jsonpair"


    // $ANTLR start "createContextExpr"
    // EsperEPL2Ast.g:302:1: createContextExpr : ^(s= CREATE_CTX IDENT createContextDetail ) ;
    public final void createContextExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:303:2: ( ^(s= CREATE_CTX IDENT createContextDetail ) )
            // EsperEPL2Ast.g:303:4: ^(s= CREATE_CTX IDENT createContextDetail )
            {
            s=(CommonTree)match(input,CREATE_CTX,FOLLOW_CREATE_CTX_in_createContextExpr1664); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createContextExpr1666); 
            pushFollow(FOLLOW_createContextDetail_in_createContextExpr1668);
            createContextDetail();

            state._fsp--;

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextExpr"


    // $ANTLR start "createContextDetail"
    // EsperEPL2Ast.g:306:1: createContextDetail : ( ^( CREATE_CTX_FIXED ( IDENT | createContextRangePoint ) createContextRangePoint ) | ^( CREATE_CTX_INIT createContextRangePoint createContextRangePoint ( IDENT )? ) | ^( CREATE_CTX_PART ( createContextPartitionItem )+ ) | ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] ) | ^( CREATE_CTX_COAL ( createContextCoalesceItem )+ IDENT number ( IDENT )? ) | ^( CREATE_CTX_NESTED createContextNested ( createContextNested )+ ) );
    public final void createContextDetail() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:307:2: ( ^( CREATE_CTX_FIXED ( IDENT | createContextRangePoint ) createContextRangePoint ) | ^( CREATE_CTX_INIT createContextRangePoint createContextRangePoint ( IDENT )? ) | ^( CREATE_CTX_PART ( createContextPartitionItem )+ ) | ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] ) | ^( CREATE_CTX_COAL ( createContextCoalesceItem )+ IDENT number ( IDENT )? ) | ^( CREATE_CTX_NESTED createContextNested ( createContextNested )+ ) )
            int alt104=6;
            switch ( input.LA(1) ) {
            case CREATE_CTX_FIXED:
                {
                alt104=1;
                }
                break;
            case CREATE_CTX_INIT:
                {
                alt104=2;
                }
                break;
            case CREATE_CTX_PART:
                {
                alt104=3;
                }
                break;
            case CREATE_CTX_CAT:
                {
                alt104=4;
                }
                break;
            case CREATE_CTX_COAL:
                {
                alt104=5;
                }
                break;
            case CREATE_CTX_NESTED:
                {
                alt104=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // EsperEPL2Ast.g:307:4: ^( CREATE_CTX_FIXED ( IDENT | createContextRangePoint ) createContextRangePoint )
                    {
                    match(input,CREATE_CTX_FIXED,FOLLOW_CREATE_CTX_FIXED_in_createContextDetail1684); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:307:23: ( IDENT | createContextRangePoint )
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==IDENT) ) {
                        alt97=1;
                    }
                    else if ( (LA97_0==AFTER||LA97_0==STREAM_EXPR||LA97_0==CRONTAB_LIMIT_EXPR_PARAM||LA97_0==CREATE_CTX_PATTERN) ) {
                        alt97=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        throw nvae;
                    }
                    switch (alt97) {
                        case 1 :
                            // EsperEPL2Ast.g:307:24: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_createContextDetail1687); 

                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:307:32: createContextRangePoint
                            {
                            pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1691);
                            createContextRangePoint();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1694);
                    createContextRangePoint();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:308:4: ^( CREATE_CTX_INIT createContextRangePoint createContextRangePoint ( IDENT )? )
                    {
                    match(input,CREATE_CTX_INIT,FOLLOW_CREATE_CTX_INIT_in_createContextDetail1701); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1703);
                    createContextRangePoint();

                    state._fsp--;

                    pushFollow(FOLLOW_createContextRangePoint_in_createContextDetail1705);
                    createContextRangePoint();

                    state._fsp--;

                    // EsperEPL2Ast.g:308:70: ( IDENT )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==IDENT) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // EsperEPL2Ast.g:308:70: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_createContextDetail1707); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:309:4: ^( CREATE_CTX_PART ( createContextPartitionItem )+ )
                    {
                    match(input,CREATE_CTX_PART,FOLLOW_CREATE_CTX_PART_in_createContextDetail1715); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:309:22: ( createContextPartitionItem )+
                    int cnt99=0;
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==PARTITIONITEM) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:309:22: createContextPartitionItem
                    	    {
                    	    pushFollow(FOLLOW_createContextPartitionItem_in_createContextDetail1717);
                    	    createContextPartitionItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt99 >= 1 ) break loop99;
                                EarlyExitException eee =
                                    new EarlyExitException(99, input);
                                throw eee;
                        }
                        cnt99++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:310:4: ^( CREATE_CTX_CAT ( createContextCategoryItem )+ eventFilterExpr[false] )
                    {
                    match(input,CREATE_CTX_CAT,FOLLOW_CREATE_CTX_CAT_in_createContextDetail1725); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:310:21: ( createContextCategoryItem )+
                    int cnt100=0;
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==CREATE_CTX_CATITEM) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:310:21: createContextCategoryItem
                    	    {
                    	    pushFollow(FOLLOW_createContextCategoryItem_in_createContextDetail1727);
                    	    createContextCategoryItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt100 >= 1 ) break loop100;
                                EarlyExitException eee =
                                    new EarlyExitException(100, input);
                                throw eee;
                        }
                        cnt100++;
                    } while (true);

                    pushFollow(FOLLOW_eventFilterExpr_in_createContextDetail1730);
                    eventFilterExpr(false);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:311:4: ^( CREATE_CTX_COAL ( createContextCoalesceItem )+ IDENT number ( IDENT )? )
                    {
                    match(input,CREATE_CTX_COAL,FOLLOW_CREATE_CTX_COAL_in_createContextDetail1738); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:311:22: ( createContextCoalesceItem )+
                    int cnt101=0;
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==COALESCE) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:311:22: createContextCoalesceItem
                    	    {
                    	    pushFollow(FOLLOW_createContextCoalesceItem_in_createContextDetail1740);
                    	    createContextCoalesceItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt101 >= 1 ) break loop101;
                                EarlyExitException eee =
                                    new EarlyExitException(101, input);
                                throw eee;
                        }
                        cnt101++;
                    } while (true);

                    match(input,IDENT,FOLLOW_IDENT_in_createContextDetail1743); 
                    pushFollow(FOLLOW_number_in_createContextDetail1745);
                    number();

                    state._fsp--;

                    // EsperEPL2Ast.g:311:62: ( IDENT )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==IDENT) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // EsperEPL2Ast.g:311:62: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_createContextDetail1747); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:312:4: ^( CREATE_CTX_NESTED createContextNested ( createContextNested )+ )
                    {
                    match(input,CREATE_CTX_NESTED,FOLLOW_CREATE_CTX_NESTED_in_createContextDetail1755); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_createContextNested_in_createContextDetail1757);
                    createContextNested();

                    state._fsp--;

                    // EsperEPL2Ast.g:312:44: ( createContextNested )+
                    int cnt103=0;
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==CREATE_CTX) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:312:44: createContextNested
                    	    {
                    	    pushFollow(FOLLOW_createContextNested_in_createContextDetail1759);
                    	    createContextNested();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt103 >= 1 ) break loop103;
                                EarlyExitException eee =
                                    new EarlyExitException(103, input);
                                throw eee;
                        }
                        cnt103++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextDetail"


    // $ANTLR start "createContextRangePoint"
    // EsperEPL2Ast.g:315:1: createContextRangePoint : ( createContextFilter | ^( CREATE_CTX_PATTERN patternInclusionExpression ( IDENT )? ) | crontabLimitParameterSet | ^( AFTER timePeriod ) );
    public final void createContextRangePoint() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:316:2: ( createContextFilter | ^( CREATE_CTX_PATTERN patternInclusionExpression ( IDENT )? ) | crontabLimitParameterSet | ^( AFTER timePeriod ) )
            int alt106=4;
            switch ( input.LA(1) ) {
            case STREAM_EXPR:
                {
                alt106=1;
                }
                break;
            case CREATE_CTX_PATTERN:
                {
                alt106=2;
                }
                break;
            case CRONTAB_LIMIT_EXPR_PARAM:
                {
                alt106=3;
                }
                break;
            case AFTER:
                {
                alt106=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // EsperEPL2Ast.g:316:4: createContextFilter
                    {
                    pushFollow(FOLLOW_createContextFilter_in_createContextRangePoint1772);
                    createContextFilter();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:317:5: ^( CREATE_CTX_PATTERN patternInclusionExpression ( IDENT )? )
                    {
                    match(input,CREATE_CTX_PATTERN,FOLLOW_CREATE_CTX_PATTERN_in_createContextRangePoint1780); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_patternInclusionExpression_in_createContextRangePoint1782);
                    patternInclusionExpression();

                    state._fsp--;

                    // EsperEPL2Ast.g:317:53: ( IDENT )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==IDENT) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // EsperEPL2Ast.g:317:53: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_createContextRangePoint1784); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:318:4: crontabLimitParameterSet
                    {
                    pushFollow(FOLLOW_crontabLimitParameterSet_in_createContextRangePoint1791);
                    crontabLimitParameterSet();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:319:4: ^( AFTER timePeriod )
                    {
                    match(input,AFTER,FOLLOW_AFTER_in_createContextRangePoint1797); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_timePeriod_in_createContextRangePoint1799);
                    timePeriod();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextRangePoint"


    // $ANTLR start "createContextNested"
    // EsperEPL2Ast.g:322:1: createContextNested : ^(s= CREATE_CTX IDENT createContextDetail ) ;
    public final void createContextNested() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:323:2: ( ^(s= CREATE_CTX IDENT createContextDetail ) )
            // EsperEPL2Ast.g:323:4: ^(s= CREATE_CTX IDENT createContextDetail )
            {
            s=(CommonTree)match(input,CREATE_CTX,FOLLOW_CREATE_CTX_in_createContextNested1815); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createContextNested1817); 
            pushFollow(FOLLOW_createContextDetail_in_createContextNested1819);
            createContextDetail();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextNested"


    // $ANTLR start "createContextFilter"
    // EsperEPL2Ast.g:326:1: createContextFilter : ^( STREAM_EXPR eventFilterExpr[false] ( IDENT )? ) ;
    public final void createContextFilter() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:327:2: ( ^( STREAM_EXPR eventFilterExpr[false] ( IDENT )? ) )
            // EsperEPL2Ast.g:327:4: ^( STREAM_EXPR eventFilterExpr[false] ( IDENT )? )
            {
            match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_createContextFilter1832); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_createContextFilter1834);
            eventFilterExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:327:41: ( IDENT )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==IDENT) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // EsperEPL2Ast.g:327:41: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_createContextFilter1837); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextFilter"


    // $ANTLR start "createContextPartitionItem"
    // EsperEPL2Ast.g:330:1: createContextPartitionItem : ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ ) ;
    public final void createContextPartitionItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:331:2: ( ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ ) )
            // EsperEPL2Ast.g:331:4: ^( PARTITIONITEM eventFilterExpr[false] ( eventPropertyExpr[false] )+ )
            {
            match(input,PARTITIONITEM,FOLLOW_PARTITIONITEM_in_createContextPartitionItem1853); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_createContextPartitionItem1855);
            eventFilterExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:331:43: ( eventPropertyExpr[false] )+
            int cnt108=0;
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==EVENT_PROP_EXPR) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // EsperEPL2Ast.g:331:43: eventPropertyExpr[false]
            	    {
            	    pushFollow(FOLLOW_eventPropertyExpr_in_createContextPartitionItem1858);
            	    eventPropertyExpr(false);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt108 >= 1 ) break loop108;
                        EarlyExitException eee =
                            new EarlyExitException(108, input);
                        throw eee;
                }
                cnt108++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextPartitionItem"


    // $ANTLR start "createContextCoalesceItem"
    // EsperEPL2Ast.g:334:1: createContextCoalesceItem : ^( COALESCE libFunctionWithClass eventFilterExpr[false] ) ;
    public final void createContextCoalesceItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:335:2: ( ^( COALESCE libFunctionWithClass eventFilterExpr[false] ) )
            // EsperEPL2Ast.g:335:4: ^( COALESCE libFunctionWithClass eventFilterExpr[false] )
            {
            match(input,COALESCE,FOLLOW_COALESCE_in_createContextCoalesceItem1875); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_libFunctionWithClass_in_createContextCoalesceItem1877);
            libFunctionWithClass();

            state._fsp--;

            pushFollow(FOLLOW_eventFilterExpr_in_createContextCoalesceItem1879);
            eventFilterExpr(false);

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextCoalesceItem"


    // $ANTLR start "createContextCategoryItem"
    // EsperEPL2Ast.g:338:1: createContextCategoryItem : ^( CREATE_CTX_CATITEM valueExpr IDENT ) ;
    public final void createContextCategoryItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:339:2: ( ^( CREATE_CTX_CATITEM valueExpr IDENT ) )
            // EsperEPL2Ast.g:339:4: ^( CREATE_CTX_CATITEM valueExpr IDENT )
            {
            match(input,CREATE_CTX_CATITEM,FOLLOW_CREATE_CTX_CATITEM_in_createContextCategoryItem1895); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_createContextCategoryItem1897);
            valueExpr();

            state._fsp--;

            match(input,IDENT,FOLLOW_IDENT_in_createContextCategoryItem1899); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createContextCategoryItem"


    // $ANTLR start "createExpr"
    // EsperEPL2Ast.g:342:1: createExpr : ^(s= CREATE_EXPR expressionDecl[false] ) ;
    public final void createExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:343:2: ( ^(s= CREATE_EXPR expressionDecl[false] ) )
            // EsperEPL2Ast.g:343:4: ^(s= CREATE_EXPR expressionDecl[false] )
            {
            s=(CommonTree)match(input,CREATE_EXPR,FOLLOW_CREATE_EXPR_in_createExpr1916); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expressionDecl_in_createExpr1918);
            expressionDecl(false);

            state._fsp--;

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createExpr"


    // $ANTLR start "createSchemaExpr"
    // EsperEPL2Ast.g:346:1: createSchemaExpr[boolean isLeaveNode] : ^(s= CREATE_SCHEMA_EXPR createSchemaDef ( IDENT )? ) ;
    public final void createSchemaExpr(boolean isLeaveNode) throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:347:2: ( ^(s= CREATE_SCHEMA_EXPR createSchemaDef ( IDENT )? ) )
            // EsperEPL2Ast.g:347:4: ^(s= CREATE_SCHEMA_EXPR createSchemaDef ( IDENT )? )
            {
            s=(CommonTree)match(input,CREATE_SCHEMA_EXPR,FOLLOW_CREATE_SCHEMA_EXPR_in_createSchemaExpr1937); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_createSchemaDef_in_createSchemaExpr1939);
            createSchemaDef();

            state._fsp--;

            // EsperEPL2Ast.g:347:43: ( IDENT )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==IDENT) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // EsperEPL2Ast.g:347:43: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_createSchemaExpr1941); 

                    }
                    break;

            }

             if (isLeaveNode) leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createSchemaExpr"


    // $ANTLR start "createSchemaDef"
    // EsperEPL2Ast.g:350:1: createSchemaDef : ^( CREATE_SCHEMA_DEF IDENT ( variantList | ( createColTypeList )? ) ( createSchemaQual )* ) ;
    public final void createSchemaDef() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:351:2: ( ^( CREATE_SCHEMA_DEF IDENT ( variantList | ( createColTypeList )? ) ( createSchemaQual )* ) )
            // EsperEPL2Ast.g:351:4: ^( CREATE_SCHEMA_DEF IDENT ( variantList | ( createColTypeList )? ) ( createSchemaQual )* )
            {
            match(input,CREATE_SCHEMA_DEF,FOLLOW_CREATE_SCHEMA_DEF_in_createSchemaDef1958); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createSchemaDef1960); 
            // EsperEPL2Ast.g:351:30: ( variantList | ( createColTypeList )? )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==VARIANT_LIST) ) {
                alt111=1;
            }
            else if ( (LA111_0==UP||LA111_0==CREATE_COL_TYPE_LIST||LA111_0==CREATE_SCHEMA_EXPR_QUAL) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // EsperEPL2Ast.g:351:31: variantList
                    {
                    pushFollow(FOLLOW_variantList_in_createSchemaDef1963);
                    variantList();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:351:43: ( createColTypeList )?
                    {
                    // EsperEPL2Ast.g:351:43: ( createColTypeList )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==CREATE_COL_TYPE_LIST) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // EsperEPL2Ast.g:351:43: createColTypeList
                            {
                            pushFollow(FOLLOW_createColTypeList_in_createSchemaDef1965);
                            createColTypeList();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }

            // EsperEPL2Ast.g:351:63: ( createSchemaQual )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==CREATE_SCHEMA_EXPR_QUAL) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // EsperEPL2Ast.g:351:63: createSchemaQual
            	    {
            	    pushFollow(FOLLOW_createSchemaQual_in_createSchemaDef1969);
            	    createSchemaQual();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createSchemaDef"


    // $ANTLR start "createSchemaQual"
    // EsperEPL2Ast.g:354:1: createSchemaQual : ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol ) ;
    public final void createSchemaQual() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:355:2: ( ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol ) )
            // EsperEPL2Ast.g:355:4: ^( CREATE_SCHEMA_EXPR_QUAL IDENT exprCol )
            {
            match(input,CREATE_SCHEMA_EXPR_QUAL,FOLLOW_CREATE_SCHEMA_EXPR_QUAL_in_createSchemaQual1984); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_createSchemaQual1986); 
            pushFollow(FOLLOW_exprCol_in_createSchemaQual1988);
            exprCol();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "createSchemaQual"


    // $ANTLR start "variantList"
    // EsperEPL2Ast.g:358:1: variantList : ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ ) ;
    public final void variantList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:359:2: ( ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ ) )
            // EsperEPL2Ast.g:359:4: ^( VARIANT_LIST ( STAR | CLASS_IDENT )+ )
            {
            match(input,VARIANT_LIST,FOLLOW_VARIANT_LIST_in_variantList2004); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:359:19: ( STAR | CLASS_IDENT )+
            int cnt113=0;
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==CLASS_IDENT||LA113_0==STAR) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // EsperEPL2Ast.g:
            	    {
            	    if ( input.LA(1)==CLASS_IDENT||input.LA(1)==STAR ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt113 >= 1 ) break loop113;
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        throw eee;
                }
                cnt113++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "variantList"


    // $ANTLR start "selectExpr"
    // EsperEPL2Ast.g:362:1: selectExpr : ( insertIntoExpr )? selectClause ( fromClause )? ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )? ;
    public final void selectExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:363:2: ( ( insertIntoExpr )? selectClause ( fromClause )? ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )? )
            // EsperEPL2Ast.g:363:4: ( insertIntoExpr )? selectClause ( fromClause )? ( matchRecogClause )? ( whereClause[true] )? ( groupByClause )? ( havingClause )? ( outputLimitExpr )? ( orderByClause )? ( rowLimitClause )?
            {
            // EsperEPL2Ast.g:363:4: ( insertIntoExpr )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==INSERTINTO_EXPR) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // EsperEPL2Ast.g:363:5: insertIntoExpr
                    {
                    pushFollow(FOLLOW_insertIntoExpr_in_selectExpr2024);
                    insertIntoExpr();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_selectClause_in_selectExpr2030);
            selectClause();

            state._fsp--;

            // EsperEPL2Ast.g:365:3: ( fromClause )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==STREAM_EXPR) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // EsperEPL2Ast.g:365:4: fromClause
                    {
                    pushFollow(FOLLOW_fromClause_in_selectExpr2036);
                    fromClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:366:3: ( matchRecogClause )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==MATCH_RECOGNIZE) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // EsperEPL2Ast.g:366:4: matchRecogClause
                    {
                    pushFollow(FOLLOW_matchRecogClause_in_selectExpr2043);
                    matchRecogClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:367:3: ( whereClause[true] )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==WHERE_EXPR) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // EsperEPL2Ast.g:367:4: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_selectExpr2050);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:368:3: ( groupByClause )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==GROUP_BY_EXPR) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // EsperEPL2Ast.g:368:4: groupByClause
                    {
                    pushFollow(FOLLOW_groupByClause_in_selectExpr2058);
                    groupByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:369:3: ( havingClause )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==HAVING_EXPR) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // EsperEPL2Ast.g:369:4: havingClause
                    {
                    pushFollow(FOLLOW_havingClause_in_selectExpr2065);
                    havingClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:370:3: ( outputLimitExpr )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( ((LA120_0>=EVENT_LIMIT_EXPR && LA120_0<=CRONTAB_LIMIT_EXPR)||(LA120_0>=WHEN_LIMIT_EXPR && LA120_0<=TERM_LIMIT_EXPR)) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // EsperEPL2Ast.g:370:4: outputLimitExpr
                    {
                    pushFollow(FOLLOW_outputLimitExpr_in_selectExpr2072);
                    outputLimitExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:371:3: ( orderByClause )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==ORDER_BY_EXPR) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // EsperEPL2Ast.g:371:4: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_selectExpr2079);
                    orderByClause();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:372:3: ( rowLimitClause )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==ROW_LIMIT_EXPR) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // EsperEPL2Ast.g:372:4: rowLimitClause
                    {
                    pushFollow(FOLLOW_rowLimitClause_in_selectExpr2086);
                    rowLimitClause();

                    state._fsp--;


                    }
                    break;

            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "selectExpr"


    // $ANTLR start "insertIntoExpr"
    // EsperEPL2Ast.g:375:1: insertIntoExpr : ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM | IRSTREAM )? CLASS_IDENT ( exprCol )? ) ;
    public final void insertIntoExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:376:2: ( ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM | IRSTREAM )? CLASS_IDENT ( exprCol )? ) )
            // EsperEPL2Ast.g:376:4: ^(i= INSERTINTO_EXPR ( ISTREAM | RSTREAM | IRSTREAM )? CLASS_IDENT ( exprCol )? )
            {
            i=(CommonTree)match(input,INSERTINTO_EXPR,FOLLOW_INSERTINTO_EXPR_in_insertIntoExpr2103); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:376:24: ( ISTREAM | RSTREAM | IRSTREAM )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( ((LA123_0>=RSTREAM && LA123_0<=IRSTREAM)) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( (input.LA(1)>=RSTREAM && input.LA(1)<=IRSTREAM) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_insertIntoExpr2118); 
            // EsperEPL2Ast.g:376:68: ( exprCol )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==EXPRCOL) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // EsperEPL2Ast.g:376:69: exprCol
                    {
                    pushFollow(FOLLOW_exprCol_in_insertIntoExpr2121);
                    exprCol();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(i); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "insertIntoExpr"


    // $ANTLR start "exprCol"
    // EsperEPL2Ast.g:379:1: exprCol : ^( EXPRCOL IDENT ( IDENT )* ) ;
    public final void exprCol() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:380:2: ( ^( EXPRCOL IDENT ( IDENT )* ) )
            // EsperEPL2Ast.g:380:4: ^( EXPRCOL IDENT ( IDENT )* )
            {
            match(input,EXPRCOL,FOLLOW_EXPRCOL_in_exprCol2140); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_exprCol2142); 
            // EsperEPL2Ast.g:380:20: ( IDENT )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==IDENT) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // EsperEPL2Ast.g:380:21: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_exprCol2145); 

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "exprCol"


    // $ANTLR start "selectClause"
    // EsperEPL2Ast.g:383:1: selectClause : ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList ) ;
    public final void selectClause() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:384:2: ( ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList ) )
            // EsperEPL2Ast.g:384:4: ^(s= SELECTION_EXPR ( RSTREAM | ISTREAM | IRSTREAM )? ( DISTINCT )? selectionList )
            {
            s=(CommonTree)match(input,SELECTION_EXPR,FOLLOW_SELECTION_EXPR_in_selectClause2163); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:384:23: ( RSTREAM | ISTREAM | IRSTREAM )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( ((LA126_0>=RSTREAM && LA126_0<=IRSTREAM)) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( (input.LA(1)>=RSTREAM && input.LA(1)<=IRSTREAM) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            // EsperEPL2Ast.g:384:55: ( DISTINCT )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==DISTINCT) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // EsperEPL2Ast.g:384:55: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_selectClause2178); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_selectClause2181);
            selectionList();

            state._fsp--;

             leaveNode(s); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "selectClause"


    // $ANTLR start "fromClause"
    // EsperEPL2Ast.g:387:1: fromClause : streamExpression ( streamExpression ( outerJoin )* )* ;
    public final void fromClause() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:388:2: ( streamExpression ( streamExpression ( outerJoin )* )* )
            // EsperEPL2Ast.g:388:4: streamExpression ( streamExpression ( outerJoin )* )*
            {
            pushFollow(FOLLOW_streamExpression_in_fromClause2195);
            streamExpression();

            state._fsp--;

            // EsperEPL2Ast.g:388:21: ( streamExpression ( outerJoin )* )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==STREAM_EXPR) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // EsperEPL2Ast.g:388:22: streamExpression ( outerJoin )*
            	    {
            	    pushFollow(FOLLOW_streamExpression_in_fromClause2198);
            	    streamExpression();

            	    state._fsp--;

            	    // EsperEPL2Ast.g:388:39: ( outerJoin )*
            	    loop128:
            	    do {
            	        int alt128=2;
            	        int LA128_0 = input.LA(1);

            	        if ( ((LA128_0>=INNERJOIN_EXPR && LA128_0<=FULL_OUTERJOIN_EXPR)) ) {
            	            alt128=1;
            	        }


            	        switch (alt128) {
            	    	case 1 :
            	    	    // EsperEPL2Ast.g:388:40: outerJoin
            	    	    {
            	    	    pushFollow(FOLLOW_outerJoin_in_fromClause2201);
            	    	    outerJoin();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop128;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "fromClause"


    // $ANTLR start "forExpr"
    // EsperEPL2Ast.g:391:1: forExpr : ^(f= FOR IDENT ( valueExpr )* ) ;
    public final void forExpr() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:392:2: ( ^(f= FOR IDENT ( valueExpr )* ) )
            // EsperEPL2Ast.g:392:4: ^(f= FOR IDENT ( valueExpr )* )
            {
            f=(CommonTree)match(input,FOR,FOLLOW_FOR_in_forExpr2221); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_forExpr2223); 
            // EsperEPL2Ast.g:392:18: ( valueExpr )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( ((LA130_0>=IN_SET && LA130_0<=REGEXP)||LA130_0==NOT_EXPR||(LA130_0>=SUM && LA130_0<=AVG)||(LA130_0>=COALESCE && LA130_0<=COUNT)||(LA130_0>=CASE && LA130_0<=CASE2)||LA130_0==ISTREAM||(LA130_0>=PREVIOUS && LA130_0<=EXISTS)||(LA130_0>=INSTANCEOF && LA130_0<=CURRENT_TIMESTAMP)||LA130_0==NEWKW||(LA130_0>=EVAL_AND_EXPR && LA130_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA130_0==EVENT_PROP_EXPR||LA130_0==CONCAT||(LA130_0>=LIB_FUNC_CHAIN && LA130_0<=DOT_EXPR)||LA130_0==ARRAY_EXPR||(LA130_0>=NOT_IN_SET && LA130_0<=NOT_REGEXP)||(LA130_0>=IN_RANGE && LA130_0<=SUBSELECT_EXPR)||(LA130_0>=EXISTS_SUBSELECT_EXPR && LA130_0<=NOT_IN_SUBSELECT_EXPR)||LA130_0==SUBSTITUTION||(LA130_0>=FIRST_AGGREG && LA130_0<=WINDOW_AGGREG)||(LA130_0>=INT_TYPE && LA130_0<=NULL_TYPE)||(LA130_0>=JSON_OBJECT && LA130_0<=JSON_ARRAY)||LA130_0==STAR||(LA130_0>=LT && LA130_0<=GT)||(LA130_0>=BOR && LA130_0<=PLUS)||(LA130_0>=BAND && LA130_0<=BXOR)||(LA130_0>=LE && LA130_0<=GE)||(LA130_0>=MINUS && LA130_0<=MOD)||(LA130_0>=EVAL_IS_GROUP_EXPR && LA130_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // EsperEPL2Ast.g:392:18: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_forExpr2225);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);

             leaveNode(f); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "forExpr"


    // $ANTLR start "matchRecogClause"
    // EsperEPL2Ast.g:395:1: matchRecogClause : ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine ) ;
    public final void matchRecogClause() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:396:2: ( ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine ) )
            // EsperEPL2Ast.g:396:4: ^(m= MATCH_RECOGNIZE ( matchRecogPartitionBy )? matchRecogMeasures ( ALL )? ( matchRecogMatchesAfterSkip )? matchRecogPattern ( matchRecogMatchesInterval )? matchRecogDefine )
            {
            m=(CommonTree)match(input,MATCH_RECOGNIZE,FOLLOW_MATCH_RECOGNIZE_in_matchRecogClause2244); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:396:24: ( matchRecogPartitionBy )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==PARTITIONITEM) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // EsperEPL2Ast.g:396:24: matchRecogPartitionBy
                    {
                    pushFollow(FOLLOW_matchRecogPartitionBy_in_matchRecogClause2246);
                    matchRecogPartitionBy();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogMeasures_in_matchRecogClause2253);
            matchRecogMeasures();

            state._fsp--;

            // EsperEPL2Ast.g:398:4: ( ALL )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==ALL) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // EsperEPL2Ast.g:398:4: ALL
                    {
                    match(input,ALL,FOLLOW_ALL_in_matchRecogClause2259); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:399:4: ( matchRecogMatchesAfterSkip )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==MATCHREC_AFTER_SKIP) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // EsperEPL2Ast.g:399:4: matchRecogMatchesAfterSkip
                    {
                    pushFollow(FOLLOW_matchRecogMatchesAfterSkip_in_matchRecogClause2265);
                    matchRecogMatchesAfterSkip();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogPattern_in_matchRecogClause2271);
            matchRecogPattern();

            state._fsp--;

            // EsperEPL2Ast.g:401:4: ( matchRecogMatchesInterval )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==MATCHREC_INTERVAL) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // EsperEPL2Ast.g:401:4: matchRecogMatchesInterval
                    {
                    pushFollow(FOLLOW_matchRecogMatchesInterval_in_matchRecogClause2277);
                    matchRecogMatchesInterval();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_matchRecogDefine_in_matchRecogClause2283);
            matchRecogDefine();

            state._fsp--;

             leaveNode(m); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogClause"


    // $ANTLR start "matchRecogPartitionBy"
    // EsperEPL2Ast.g:405:1: matchRecogPartitionBy : ^(p= PARTITIONITEM ( valueExpr )+ ) ;
    public final void matchRecogPartitionBy() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:406:2: ( ^(p= PARTITIONITEM ( valueExpr )+ ) )
            // EsperEPL2Ast.g:406:4: ^(p= PARTITIONITEM ( valueExpr )+ )
            {
            p=(CommonTree)match(input,PARTITIONITEM,FOLLOW_PARTITIONITEM_in_matchRecogPartitionBy2301); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:406:22: ( valueExpr )+
            int cnt135=0;
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( ((LA135_0>=IN_SET && LA135_0<=REGEXP)||LA135_0==NOT_EXPR||(LA135_0>=SUM && LA135_0<=AVG)||(LA135_0>=COALESCE && LA135_0<=COUNT)||(LA135_0>=CASE && LA135_0<=CASE2)||LA135_0==ISTREAM||(LA135_0>=PREVIOUS && LA135_0<=EXISTS)||(LA135_0>=INSTANCEOF && LA135_0<=CURRENT_TIMESTAMP)||LA135_0==NEWKW||(LA135_0>=EVAL_AND_EXPR && LA135_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA135_0==EVENT_PROP_EXPR||LA135_0==CONCAT||(LA135_0>=LIB_FUNC_CHAIN && LA135_0<=DOT_EXPR)||LA135_0==ARRAY_EXPR||(LA135_0>=NOT_IN_SET && LA135_0<=NOT_REGEXP)||(LA135_0>=IN_RANGE && LA135_0<=SUBSELECT_EXPR)||(LA135_0>=EXISTS_SUBSELECT_EXPR && LA135_0<=NOT_IN_SUBSELECT_EXPR)||LA135_0==SUBSTITUTION||(LA135_0>=FIRST_AGGREG && LA135_0<=WINDOW_AGGREG)||(LA135_0>=INT_TYPE && LA135_0<=NULL_TYPE)||(LA135_0>=JSON_OBJECT && LA135_0<=JSON_ARRAY)||LA135_0==STAR||(LA135_0>=LT && LA135_0<=GT)||(LA135_0>=BOR && LA135_0<=PLUS)||(LA135_0>=BAND && LA135_0<=BXOR)||(LA135_0>=LE && LA135_0<=GE)||(LA135_0>=MINUS && LA135_0<=MOD)||(LA135_0>=EVAL_IS_GROUP_EXPR && LA135_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // EsperEPL2Ast.g:406:22: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_matchRecogPartitionBy2303);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt135 >= 1 ) break loop135;
                        EarlyExitException eee =
                            new EarlyExitException(135, input);
                        throw eee;
                }
                cnt135++;
            } while (true);

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPartitionBy"


    // $ANTLR start "matchRecogMatchesAfterSkip"
    // EsperEPL2Ast.g:409:1: matchRecogMatchesAfterSkip : ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT ) ;
    public final void matchRecogMatchesAfterSkip() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:410:2: ( ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT ) )
            // EsperEPL2Ast.g:410:4: ^( MATCHREC_AFTER_SKIP IDENT IDENT IDENT ( IDENT | LAST ) IDENT )
            {
            match(input,MATCHREC_AFTER_SKIP,FOLLOW_MATCHREC_AFTER_SKIP_in_matchRecogMatchesAfterSkip2320); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2322); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2324); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2326); 
            if ( input.LA(1)==LAST||input.LA(1)==IDENT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2334); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogMatchesAfterSkip"


    // $ANTLR start "matchRecogMatchesInterval"
    // EsperEPL2Ast.g:413:1: matchRecogMatchesInterval : ^( MATCHREC_INTERVAL IDENT timePeriod ) ;
    public final void matchRecogMatchesInterval() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:414:2: ( ^( MATCHREC_INTERVAL IDENT timePeriod ) )
            // EsperEPL2Ast.g:414:4: ^( MATCHREC_INTERVAL IDENT timePeriod )
            {
            match(input,MATCHREC_INTERVAL,FOLLOW_MATCHREC_INTERVAL_in_matchRecogMatchesInterval2349); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogMatchesInterval2351); 
            pushFollow(FOLLOW_timePeriod_in_matchRecogMatchesInterval2353);
            timePeriod();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogMatchesInterval"


    // $ANTLR start "matchRecogMeasures"
    // EsperEPL2Ast.g:417:1: matchRecogMeasures : ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* ) ;
    public final void matchRecogMeasures() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:418:2: ( ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* ) )
            // EsperEPL2Ast.g:418:4: ^(m= MATCHREC_MEASURES ( matchRecogMeasureListElement )* )
            {
            m=(CommonTree)match(input,MATCHREC_MEASURES,FOLLOW_MATCHREC_MEASURES_in_matchRecogMeasures2369); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:418:26: ( matchRecogMeasureListElement )*
                loop136:
                do {
                    int alt136=2;
                    int LA136_0 = input.LA(1);

                    if ( (LA136_0==MATCHREC_MEASURE_ITEM) ) {
                        alt136=1;
                    }


                    switch (alt136) {
                	case 1 :
                	    // EsperEPL2Ast.g:418:26: matchRecogMeasureListElement
                	    {
                	    pushFollow(FOLLOW_matchRecogMeasureListElement_in_matchRecogMeasures2371);
                	    matchRecogMeasureListElement();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop136;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogMeasures"


    // $ANTLR start "matchRecogMeasureListElement"
    // EsperEPL2Ast.g:421:1: matchRecogMeasureListElement : ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? ) ;
    public final void matchRecogMeasureListElement() throws RecognitionException {
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:422:2: ( ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? ) )
            // EsperEPL2Ast.g:422:4: ^(m= MATCHREC_MEASURE_ITEM valueExpr ( IDENT )? )
            {
            m=(CommonTree)match(input,MATCHREC_MEASURE_ITEM,FOLLOW_MATCHREC_MEASURE_ITEM_in_matchRecogMeasureListElement2388); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_matchRecogMeasureListElement2390);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:422:40: ( IDENT )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==IDENT) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // EsperEPL2Ast.g:422:40: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_matchRecogMeasureListElement2392); 

                    }
                    break;

            }

             leaveNode(m); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogMeasureListElement"


    // $ANTLR start "matchRecogPattern"
    // EsperEPL2Ast.g:425:1: matchRecogPattern : ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ ) ;
    public final void matchRecogPattern() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:426:2: ( ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ ) )
            // EsperEPL2Ast.g:426:4: ^(p= MATCHREC_PATTERN ( matchRecogPatternAlteration )+ )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN,FOLLOW_MATCHREC_PATTERN_in_matchRecogPattern2412); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:426:25: ( matchRecogPatternAlteration )+
            int cnt138=0;
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( ((LA138_0>=MATCHREC_PATTERN_CONCAT && LA138_0<=MATCHREC_PATTERN_ALTER)) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // EsperEPL2Ast.g:426:25: matchRecogPatternAlteration
            	    {
            	    pushFollow(FOLLOW_matchRecogPatternAlteration_in_matchRecogPattern2414);
            	    matchRecogPatternAlteration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt138 >= 1 ) break loop138;
                        EarlyExitException eee =
                            new EarlyExitException(138, input);
                        throw eee;
                }
                cnt138++;
            } while (true);

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPattern"


    // $ANTLR start "matchRecogPatternAlteration"
    // EsperEPL2Ast.g:429:1: matchRecogPatternAlteration : ( matchRecogPatternConcat | ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ ) );
    public final void matchRecogPatternAlteration() throws RecognitionException {
        CommonTree o=null;

        try {
            // EsperEPL2Ast.g:430:2: ( matchRecogPatternConcat | ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ ) )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==MATCHREC_PATTERN_CONCAT) ) {
                alt140=1;
            }
            else if ( (LA140_0==MATCHREC_PATTERN_ALTER) ) {
                alt140=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // EsperEPL2Ast.g:430:4: matchRecogPatternConcat
                    {
                    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2429);
                    matchRecogPatternConcat();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:431:4: ^(o= MATCHREC_PATTERN_ALTER matchRecogPatternConcat ( matchRecogPatternConcat )+ )
                    {
                    o=(CommonTree)match(input,MATCHREC_PATTERN_ALTER,FOLLOW_MATCHREC_PATTERN_ALTER_in_matchRecogPatternAlteration2437); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2439);
                    matchRecogPatternConcat();

                    state._fsp--;

                    // EsperEPL2Ast.g:431:55: ( matchRecogPatternConcat )+
                    int cnt139=0;
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==MATCHREC_PATTERN_CONCAT) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:431:55: matchRecogPatternConcat
                    	    {
                    	    pushFollow(FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2441);
                    	    matchRecogPatternConcat();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt139 >= 1 ) break loop139;
                                EarlyExitException eee =
                                    new EarlyExitException(139, input);
                                throw eee;
                        }
                        cnt139++;
                    } while (true);

                     leaveNode(o); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPatternAlteration"


    // $ANTLR start "matchRecogPatternConcat"
    // EsperEPL2Ast.g:434:1: matchRecogPatternConcat : ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ ) ;
    public final void matchRecogPatternConcat() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:435:2: ( ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ ) )
            // EsperEPL2Ast.g:435:4: ^(p= MATCHREC_PATTERN_CONCAT ( matchRecogPatternUnary )+ )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_CONCAT,FOLLOW_MATCHREC_PATTERN_CONCAT_in_matchRecogPatternConcat2459); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:435:32: ( matchRecogPatternUnary )+
            int cnt141=0;
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==MATCHREC_PATTERN_ATOM||LA141_0==MATCHREC_PATTERN_NESTED) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // EsperEPL2Ast.g:435:32: matchRecogPatternUnary
            	    {
            	    pushFollow(FOLLOW_matchRecogPatternUnary_in_matchRecogPatternConcat2461);
            	    matchRecogPatternUnary();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt141 >= 1 ) break loop141;
                        EarlyExitException eee =
                            new EarlyExitException(141, input);
                        throw eee;
                }
                cnt141++;
            } while (true);

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPatternConcat"


    // $ANTLR start "matchRecogPatternUnary"
    // EsperEPL2Ast.g:438:1: matchRecogPatternUnary : ( matchRecogPatternNested | matchRecogPatternAtom );
    public final void matchRecogPatternUnary() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:439:2: ( matchRecogPatternNested | matchRecogPatternAtom )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==MATCHREC_PATTERN_NESTED) ) {
                alt142=1;
            }
            else if ( (LA142_0==MATCHREC_PATTERN_ATOM) ) {
                alt142=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }
            switch (alt142) {
                case 1 :
                    // EsperEPL2Ast.g:439:4: matchRecogPatternNested
                    {
                    pushFollow(FOLLOW_matchRecogPatternNested_in_matchRecogPatternUnary2476);
                    matchRecogPatternNested();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:440:4: matchRecogPatternAtom
                    {
                    pushFollow(FOLLOW_matchRecogPatternAtom_in_matchRecogPatternUnary2481);
                    matchRecogPatternAtom();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPatternUnary"


    // $ANTLR start "matchRecogPatternNested"
    // EsperEPL2Ast.g:443:1: matchRecogPatternNested : ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? ) ;
    public final void matchRecogPatternNested() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:444:2: ( ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? ) )
            // EsperEPL2Ast.g:444:4: ^(p= MATCHREC_PATTERN_NESTED matchRecogPatternAlteration ( PLUS | STAR | QUESTION )? )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_NESTED,FOLLOW_MATCHREC_PATTERN_NESTED_in_matchRecogPatternNested2496); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_matchRecogPatternAlteration_in_matchRecogPatternNested2498);
            matchRecogPatternAlteration();

            state._fsp--;

            // EsperEPL2Ast.g:444:60: ( PLUS | STAR | QUESTION )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==STAR||LA143_0==QUESTION||LA143_0==PLUS) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( input.LA(1)==STAR||input.LA(1)==QUESTION||input.LA(1)==PLUS ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPatternNested"


    // $ANTLR start "matchRecogPatternAtom"
    // EsperEPL2Ast.g:447:1: matchRecogPatternAtom : ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? ) ;
    public final void matchRecogPatternAtom() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:448:2: ( ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? ) )
            // EsperEPL2Ast.g:448:4: ^(p= MATCHREC_PATTERN_ATOM IDENT ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )? )
            {
            p=(CommonTree)match(input,MATCHREC_PATTERN_ATOM,FOLLOW_MATCHREC_PATTERN_ATOM_in_matchRecogPatternAtom2529); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogPatternAtom2531); 
            // EsperEPL2Ast.g:448:36: ( ( PLUS | STAR | QUESTION ) ( QUESTION )? )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==STAR||LA145_0==QUESTION||LA145_0==PLUS) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // EsperEPL2Ast.g:448:38: ( PLUS | STAR | QUESTION ) ( QUESTION )?
                    {
                    if ( input.LA(1)==STAR||input.LA(1)==QUESTION||input.LA(1)==PLUS ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:448:63: ( QUESTION )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==QUESTION) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // EsperEPL2Ast.g:448:63: QUESTION
                            {
                            match(input,QUESTION,FOLLOW_QUESTION_in_matchRecogPatternAtom2547); 

                            }
                            break;

                    }


                    }
                    break;

            }

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogPatternAtom"


    // $ANTLR start "matchRecogDefine"
    // EsperEPL2Ast.g:451:1: matchRecogDefine : ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ ) ;
    public final void matchRecogDefine() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:452:2: ( ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ ) )
            // EsperEPL2Ast.g:452:4: ^(p= MATCHREC_DEFINE ( matchRecogDefineItem )+ )
            {
            p=(CommonTree)match(input,MATCHREC_DEFINE,FOLLOW_MATCHREC_DEFINE_in_matchRecogDefine2569); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:452:24: ( matchRecogDefineItem )+
            int cnt146=0;
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==MATCHREC_DEFINE_ITEM) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // EsperEPL2Ast.g:452:24: matchRecogDefineItem
            	    {
            	    pushFollow(FOLLOW_matchRecogDefineItem_in_matchRecogDefine2571);
            	    matchRecogDefineItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt146 >= 1 ) break loop146;
                        EarlyExitException eee =
                            new EarlyExitException(146, input);
                        throw eee;
                }
                cnt146++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogDefine"


    // $ANTLR start "matchRecogDefineItem"
    // EsperEPL2Ast.g:455:1: matchRecogDefineItem : ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr ) ;
    public final void matchRecogDefineItem() throws RecognitionException {
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:456:2: ( ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr ) )
            // EsperEPL2Ast.g:456:4: ^(d= MATCHREC_DEFINE_ITEM IDENT valueExpr )
            {
            d=(CommonTree)match(input,MATCHREC_DEFINE_ITEM,FOLLOW_MATCHREC_DEFINE_ITEM_in_matchRecogDefineItem2588); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_matchRecogDefineItem2590); 
            pushFollow(FOLLOW_valueExpr_in_matchRecogDefineItem2592);
            valueExpr();

            state._fsp--;

             leaveNode(d); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchRecogDefineItem"


    // $ANTLR start "selectionList"
    // EsperEPL2Ast.g:460:1: selectionList : selectionListElement ( selectionListElement )* ;
    public final void selectionList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:461:2: ( selectionListElement ( selectionListElement )* )
            // EsperEPL2Ast.g:461:4: selectionListElement ( selectionListElement )*
            {
            pushFollow(FOLLOW_selectionListElement_in_selectionList2609);
            selectionListElement();

            state._fsp--;

            // EsperEPL2Ast.g:461:25: ( selectionListElement )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( ((LA147_0>=SELECTION_ELEMENT_EXPR && LA147_0<=SELECTION_STREAM)||LA147_0==WILDCARD_SELECT) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // EsperEPL2Ast.g:461:26: selectionListElement
            	    {
            	    pushFollow(FOLLOW_selectionListElement_in_selectionList2612);
            	    selectionListElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop147;
                }
            } while (true);


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "selectionList"


    // $ANTLR start "selectionListElement"
    // EsperEPL2Ast.g:464:1: selectionListElement : (w= WILDCARD_SELECT | ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ( selectionListElementAnno )? ) | ^(s= SELECTION_STREAM IDENT ( IDENT )? ) );
    public final void selectionListElement() throws RecognitionException {
        CommonTree w=null;
        CommonTree e=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:465:2: (w= WILDCARD_SELECT | ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ( selectionListElementAnno )? ) | ^(s= SELECTION_STREAM IDENT ( IDENT )? ) )
            int alt151=3;
            switch ( input.LA(1) ) {
            case WILDCARD_SELECT:
                {
                alt151=1;
                }
                break;
            case SELECTION_ELEMENT_EXPR:
                {
                alt151=2;
                }
                break;
            case SELECTION_STREAM:
                {
                alt151=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }

            switch (alt151) {
                case 1 :
                    // EsperEPL2Ast.g:465:4: w= WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,WILDCARD_SELECT,FOLLOW_WILDCARD_SELECT_in_selectionListElement2628); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:466:4: ^(e= SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ( selectionListElementAnno )? )
                    {
                    e=(CommonTree)match(input,SELECTION_ELEMENT_EXPR,FOLLOW_SELECTION_ELEMENT_EXPR_in_selectionListElement2638); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_selectionListElement2640);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:466:41: ( IDENT )?
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==IDENT) ) {
                        alt148=1;
                    }
                    switch (alt148) {
                        case 1 :
                            // EsperEPL2Ast.g:466:42: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2643); 

                            }
                            break;

                    }

                    // EsperEPL2Ast.g:466:50: ( selectionListElementAnno )?
                    int alt149=2;
                    int LA149_0 = input.LA(1);

                    if ( (LA149_0==ATCHAR) ) {
                        alt149=1;
                    }
                    switch (alt149) {
                        case 1 :
                            // EsperEPL2Ast.g:466:50: selectionListElementAnno
                            {
                            pushFollow(FOLLOW_selectionListElementAnno_in_selectionListElement2647);
                            selectionListElementAnno();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(e); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:467:4: ^(s= SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,SELECTION_STREAM,FOLLOW_SELECTION_STREAM_in_selectionListElement2660); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2662); 
                    // EsperEPL2Ast.g:467:31: ( IDENT )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==IDENT) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // EsperEPL2Ast.g:467:32: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_selectionListElement2665); 

                            }
                            break;

                    }

                     leaveNode(s); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "selectionListElement"


    // $ANTLR start "selectionListElementAnno"
    // EsperEPL2Ast.g:470:1: selectionListElementAnno : ^( ATCHAR IDENT ) ;
    public final void selectionListElementAnno() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:471:2: ( ^( ATCHAR IDENT ) )
            // EsperEPL2Ast.g:471:4: ^( ATCHAR IDENT )
            {
            match(input,ATCHAR,FOLLOW_ATCHAR_in_selectionListElementAnno2684); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_selectionListElementAnno2686); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "selectionListElementAnno"


    // $ANTLR start "outerJoin"
    // EsperEPL2Ast.g:475:1: outerJoin : ( ^(tl= LEFT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tr= RIGHT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tf= FULL_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(i= INNERJOIN_EXPR ON ( outerJoinIdent )? ) );
    public final void outerJoin() throws RecognitionException {
        CommonTree tl=null;
        CommonTree tr=null;
        CommonTree tf=null;
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:476:2: ( ^(tl= LEFT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tr= RIGHT_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(tf= FULL_OUTERJOIN_EXPR ON ( outerJoinIdent )? ) | ^(i= INNERJOIN_EXPR ON ( outerJoinIdent )? ) )
            int alt156=4;
            switch ( input.LA(1) ) {
            case LEFT_OUTERJOIN_EXPR:
                {
                alt156=1;
                }
                break;
            case RIGHT_OUTERJOIN_EXPR:
                {
                alt156=2;
                }
                break;
            case FULL_OUTERJOIN_EXPR:
                {
                alt156=3;
                }
                break;
            case INNERJOIN_EXPR:
                {
                alt156=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // EsperEPL2Ast.g:476:4: ^(tl= LEFT_OUTERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    tl=(CommonTree)match(input,LEFT_OUTERJOIN_EXPR,FOLLOW_LEFT_OUTERJOIN_EXPR_in_outerJoin2704); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2706); 
                    // EsperEPL2Ast.g:476:32: ( outerJoinIdent )?
                    int alt152=2;
                    int LA152_0 = input.LA(1);

                    if ( (LA152_0==EVENT_PROP_EXPR) ) {
                        alt152=1;
                    }
                    switch (alt152) {
                        case 1 :
                            // EsperEPL2Ast.g:476:32: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2708);
                            outerJoinIdent();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(tl); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:477:4: ^(tr= RIGHT_OUTERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    tr=(CommonTree)match(input,RIGHT_OUTERJOIN_EXPR,FOLLOW_RIGHT_OUTERJOIN_EXPR_in_outerJoin2721); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2723); 
                    // EsperEPL2Ast.g:477:33: ( outerJoinIdent )?
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( (LA153_0==EVENT_PROP_EXPR) ) {
                        alt153=1;
                    }
                    switch (alt153) {
                        case 1 :
                            // EsperEPL2Ast.g:477:33: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2725);
                            outerJoinIdent();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(tr); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:478:4: ^(tf= FULL_OUTERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    tf=(CommonTree)match(input,FULL_OUTERJOIN_EXPR,FOLLOW_FULL_OUTERJOIN_EXPR_in_outerJoin2738); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2740); 
                    // EsperEPL2Ast.g:478:32: ( outerJoinIdent )?
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==EVENT_PROP_EXPR) ) {
                        alt154=1;
                    }
                    switch (alt154) {
                        case 1 :
                            // EsperEPL2Ast.g:478:32: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2742);
                            outerJoinIdent();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(tf); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:479:4: ^(i= INNERJOIN_EXPR ON ( outerJoinIdent )? )
                    {
                    i=(CommonTree)match(input,INNERJOIN_EXPR,FOLLOW_INNERJOIN_EXPR_in_outerJoin2755); 

                    match(input, Token.DOWN, null); 
                    match(input,ON,FOLLOW_ON_in_outerJoin2757); 
                    // EsperEPL2Ast.g:479:26: ( outerJoinIdent )?
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==EVENT_PROP_EXPR) ) {
                        alt155=1;
                    }
                    switch (alt155) {
                        case 1 :
                            // EsperEPL2Ast.g:479:26: outerJoinIdent
                            {
                            pushFollow(FOLLOW_outerJoinIdent_in_outerJoin2759);
                            outerJoinIdent();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(i); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "outerJoin"


    // $ANTLR start "outerJoinIdent"
    // EsperEPL2Ast.g:482:1: outerJoinIdent : eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* ;
    public final void outerJoinIdent() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:483:2: ( eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )* )
            // EsperEPL2Ast.g:483:4: eventPropertyExpr[true] eventPropertyExpr[true] ( eventPropertyExpr[true] eventPropertyExpr[true] )*
            {
            pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2775);
            eventPropertyExpr(true);

            state._fsp--;

            pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2778);
            eventPropertyExpr(true);

            state._fsp--;

            // EsperEPL2Ast.g:483:52: ( eventPropertyExpr[true] eventPropertyExpr[true] )*
            loop157:
            do {
                int alt157=2;
                int LA157_0 = input.LA(1);

                if ( (LA157_0==EVENT_PROP_EXPR) ) {
                    alt157=1;
                }


                switch (alt157) {
            	case 1 :
            	    // EsperEPL2Ast.g:483:53: eventPropertyExpr[true] eventPropertyExpr[true]
            	    {
            	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2782);
            	    eventPropertyExpr(true);

            	    state._fsp--;

            	    pushFollow(FOLLOW_eventPropertyExpr_in_outerJoinIdent2785);
            	    eventPropertyExpr(true);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop157;
                }
            } while (true);


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "outerJoinIdent"


    // $ANTLR start "streamExpression"
    // EsperEPL2Ast.g:486:1: streamExpression : ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? ) ;
    public final void streamExpression() throws RecognitionException {
        CommonTree v=null;

        try {
            // EsperEPL2Ast.g:487:2: ( ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? ) )
            // EsperEPL2Ast.g:487:4: ^(v= STREAM_EXPR ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression ) ( viewListExpr )? ( IDENT )? ( UNIDIRECTIONAL )? ( RETAINUNION | RETAININTERSECTION )? )
            {
            v=(CommonTree)match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_streamExpression2802); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:487:20: ( eventFilterExpr[true] | patternInclusionExpression | databaseJoinExpression | methodJoinExpression )
            int alt158=4;
            switch ( input.LA(1) ) {
            case EVENT_FILTER_EXPR:
                {
                alt158=1;
                }
                break;
            case PATTERN_INCL_EXPR:
                {
                alt158=2;
                }
                break;
            case DATABASE_JOIN_EXPR:
                {
                alt158=3;
                }
                break;
            case METHOD_JOIN_EXPR:
                {
                alt158=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }

            switch (alt158) {
                case 1 :
                    // EsperEPL2Ast.g:487:21: eventFilterExpr[true]
                    {
                    pushFollow(FOLLOW_eventFilterExpr_in_streamExpression2805);
                    eventFilterExpr(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:487:45: patternInclusionExpression
                    {
                    pushFollow(FOLLOW_patternInclusionExpression_in_streamExpression2810);
                    patternInclusionExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:487:74: databaseJoinExpression
                    {
                    pushFollow(FOLLOW_databaseJoinExpression_in_streamExpression2814);
                    databaseJoinExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:487:99: methodJoinExpression
                    {
                    pushFollow(FOLLOW_methodJoinExpression_in_streamExpression2818);
                    methodJoinExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:487:121: ( viewListExpr )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==VIEW_EXPR) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // EsperEPL2Ast.g:487:122: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_streamExpression2822);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:487:137: ( IDENT )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==IDENT) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // EsperEPL2Ast.g:487:138: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_streamExpression2827); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:487:146: ( UNIDIRECTIONAL )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==UNIDIRECTIONAL) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // EsperEPL2Ast.g:487:147: UNIDIRECTIONAL
                    {
                    match(input,UNIDIRECTIONAL,FOLLOW_UNIDIRECTIONAL_in_streamExpression2832); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:487:164: ( RETAINUNION | RETAININTERSECTION )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( ((LA162_0>=RETAINUNION && LA162_0<=RETAININTERSECTION)) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( (input.LA(1)>=RETAINUNION && input.LA(1)<=RETAININTERSECTION) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

             leaveNode(v); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "streamExpression"


    // $ANTLR start "eventFilterExpr"
    // EsperEPL2Ast.g:490:1: eventFilterExpr[boolean isLeaveNode] : ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* ) ;
    public final void eventFilterExpr(boolean isLeaveNode) throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:491:2: ( ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* ) )
            // EsperEPL2Ast.g:491:4: ^(f= EVENT_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( valueExpr )* )
            {
            f=(CommonTree)match(input,EVENT_FILTER_EXPR,FOLLOW_EVENT_FILTER_EXPR_in_eventFilterExpr2861); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:491:27: ( IDENT )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==IDENT) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // EsperEPL2Ast.g:491:27: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_eventFilterExpr2863); 

                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_eventFilterExpr2866); 
            // EsperEPL2Ast.g:491:46: ( propertyExpression )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==EVENT_FILTER_PROPERTY_EXPR) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // EsperEPL2Ast.g:491:46: propertyExpression
                    {
                    pushFollow(FOLLOW_propertyExpression_in_eventFilterExpr2868);
                    propertyExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:491:66: ( valueExpr )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( ((LA165_0>=IN_SET && LA165_0<=REGEXP)||LA165_0==NOT_EXPR||(LA165_0>=SUM && LA165_0<=AVG)||(LA165_0>=COALESCE && LA165_0<=COUNT)||(LA165_0>=CASE && LA165_0<=CASE2)||LA165_0==ISTREAM||(LA165_0>=PREVIOUS && LA165_0<=EXISTS)||(LA165_0>=INSTANCEOF && LA165_0<=CURRENT_TIMESTAMP)||LA165_0==NEWKW||(LA165_0>=EVAL_AND_EXPR && LA165_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA165_0==EVENT_PROP_EXPR||LA165_0==CONCAT||(LA165_0>=LIB_FUNC_CHAIN && LA165_0<=DOT_EXPR)||LA165_0==ARRAY_EXPR||(LA165_0>=NOT_IN_SET && LA165_0<=NOT_REGEXP)||(LA165_0>=IN_RANGE && LA165_0<=SUBSELECT_EXPR)||(LA165_0>=EXISTS_SUBSELECT_EXPR && LA165_0<=NOT_IN_SUBSELECT_EXPR)||LA165_0==SUBSTITUTION||(LA165_0>=FIRST_AGGREG && LA165_0<=WINDOW_AGGREG)||(LA165_0>=INT_TYPE && LA165_0<=NULL_TYPE)||(LA165_0>=JSON_OBJECT && LA165_0<=JSON_ARRAY)||LA165_0==STAR||(LA165_0>=LT && LA165_0<=GT)||(LA165_0>=BOR && LA165_0<=PLUS)||(LA165_0>=BAND && LA165_0<=BXOR)||(LA165_0>=LE && LA165_0<=GE)||(LA165_0>=MINUS && LA165_0<=MOD)||(LA165_0>=EVAL_IS_GROUP_EXPR && LA165_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // EsperEPL2Ast.g:491:67: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_eventFilterExpr2872);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);

             if (isLeaveNode) leaveNode(f); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "eventFilterExpr"


    // $ANTLR start "propertyExpression"
    // EsperEPL2Ast.g:494:1: propertyExpression : ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* ) ;
    public final void propertyExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:495:2: ( ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* ) )
            // EsperEPL2Ast.g:495:4: ^( EVENT_FILTER_PROPERTY_EXPR ( propertyExpressionAtom )* )
            {
            match(input,EVENT_FILTER_PROPERTY_EXPR,FOLLOW_EVENT_FILTER_PROPERTY_EXPR_in_propertyExpression2892); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:495:34: ( propertyExpressionAtom )*
                loop166:
                do {
                    int alt166=2;
                    int LA166_0 = input.LA(1);

                    if ( (LA166_0==EVENT_FILTER_PROPERTY_EXPR_ATOM) ) {
                        alt166=1;
                    }


                    switch (alt166) {
                	case 1 :
                	    // EsperEPL2Ast.g:495:34: propertyExpressionAtom
                	    {
                	    pushFollow(FOLLOW_propertyExpressionAtom_in_propertyExpression2894);
                	    propertyExpressionAtom();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop166;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "propertyExpression"


    // $ANTLR start "propertyExpressionAtom"
    // EsperEPL2Ast.g:498:1: propertyExpressionAtom : ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( ^( SELECT ( propertySelectionListElement )+ ) )? valueExpr ( ^( ATCHAR IDENT IDENT ) )? ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) ) ;
    public final void propertyExpressionAtom() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:499:2: ( ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( ^( SELECT ( propertySelectionListElement )+ ) )? valueExpr ( ^( ATCHAR IDENT IDENT ) )? ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) ) )
            // EsperEPL2Ast.g:499:4: ^(a= EVENT_FILTER_PROPERTY_EXPR_ATOM ( ^( SELECT ( propertySelectionListElement )+ ) )? valueExpr ( ^( ATCHAR IDENT IDENT ) )? ( IDENT )? ^( WHERE_EXPR ( valueExpr )? ) )
            {
            a=(CommonTree)match(input,EVENT_FILTER_PROPERTY_EXPR_ATOM,FOLLOW_EVENT_FILTER_PROPERTY_EXPR_ATOM_in_propertyExpressionAtom2913); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:499:41: ( ^( SELECT ( propertySelectionListElement )+ ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==SELECT) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // EsperEPL2Ast.g:499:42: ^( SELECT ( propertySelectionListElement )+ )
                    {
                    match(input,SELECT,FOLLOW_SELECT_in_propertyExpressionAtom2917); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:499:51: ( propertySelectionListElement )+
                    int cnt167=0;
                    loop167:
                    do {
                        int alt167=2;
                        int LA167_0 = input.LA(1);

                        if ( ((LA167_0>=PROPERTY_SELECTION_ELEMENT_EXPR && LA167_0<=PROPERTY_WILDCARD_SELECT)) ) {
                            alt167=1;
                        }


                        switch (alt167) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:499:51: propertySelectionListElement
                    	    {
                    	    pushFollow(FOLLOW_propertySelectionListElement_in_propertyExpressionAtom2919);
                    	    propertySelectionListElement();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt167 >= 1 ) break loop167;
                                EarlyExitException eee =
                                    new EarlyExitException(167, input);
                                throw eee;
                        }
                        cnt167++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            pushFollow(FOLLOW_valueExpr_in_propertyExpressionAtom2925);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:499:94: ( ^( ATCHAR IDENT IDENT ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==ATCHAR) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // EsperEPL2Ast.g:499:95: ^( ATCHAR IDENT IDENT )
                    {
                    match(input,ATCHAR,FOLLOW_ATCHAR_in_propertyExpressionAtom2929); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2931); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2933); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:499:119: ( IDENT )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==IDENT) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // EsperEPL2Ast.g:499:119: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_propertyExpressionAtom2938); 

                    }
                    break;

            }

            match(input,WHERE_EXPR,FOLLOW_WHERE_EXPR_in_propertyExpressionAtom2942); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:499:139: ( valueExpr )?
                int alt171=2;
                int LA171_0 = input.LA(1);

                if ( ((LA171_0>=IN_SET && LA171_0<=REGEXP)||LA171_0==NOT_EXPR||(LA171_0>=SUM && LA171_0<=AVG)||(LA171_0>=COALESCE && LA171_0<=COUNT)||(LA171_0>=CASE && LA171_0<=CASE2)||LA171_0==ISTREAM||(LA171_0>=PREVIOUS && LA171_0<=EXISTS)||(LA171_0>=INSTANCEOF && LA171_0<=CURRENT_TIMESTAMP)||LA171_0==NEWKW||(LA171_0>=EVAL_AND_EXPR && LA171_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA171_0==EVENT_PROP_EXPR||LA171_0==CONCAT||(LA171_0>=LIB_FUNC_CHAIN && LA171_0<=DOT_EXPR)||LA171_0==ARRAY_EXPR||(LA171_0>=NOT_IN_SET && LA171_0<=NOT_REGEXP)||(LA171_0>=IN_RANGE && LA171_0<=SUBSELECT_EXPR)||(LA171_0>=EXISTS_SUBSELECT_EXPR && LA171_0<=NOT_IN_SUBSELECT_EXPR)||LA171_0==SUBSTITUTION||(LA171_0>=FIRST_AGGREG && LA171_0<=WINDOW_AGGREG)||(LA171_0>=INT_TYPE && LA171_0<=NULL_TYPE)||(LA171_0>=JSON_OBJECT && LA171_0<=JSON_ARRAY)||LA171_0==STAR||(LA171_0>=LT && LA171_0<=GT)||(LA171_0>=BOR && LA171_0<=PLUS)||(LA171_0>=BAND && LA171_0<=BXOR)||(LA171_0>=LE && LA171_0<=GE)||(LA171_0>=MINUS && LA171_0<=MOD)||(LA171_0>=EVAL_IS_GROUP_EXPR && LA171_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt171=1;
                }
                switch (alt171) {
                    case 1 :
                        // EsperEPL2Ast.g:499:139: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_propertyExpressionAtom2944);
                        valueExpr();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
             leaveNode(a); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "propertyExpressionAtom"


    // $ANTLR start "propertySelectionListElement"
    // EsperEPL2Ast.g:502:1: propertySelectionListElement : (w= PROPERTY_WILDCARD_SELECT | ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) );
    public final void propertySelectionListElement() throws RecognitionException {
        CommonTree w=null;
        CommonTree e=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:503:2: (w= PROPERTY_WILDCARD_SELECT | ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? ) | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) )
            int alt174=3;
            switch ( input.LA(1) ) {
            case PROPERTY_WILDCARD_SELECT:
                {
                alt174=1;
                }
                break;
            case PROPERTY_SELECTION_ELEMENT_EXPR:
                {
                alt174=2;
                }
                break;
            case PROPERTY_SELECTION_STREAM:
                {
                alt174=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }

            switch (alt174) {
                case 1 :
                    // EsperEPL2Ast.g:503:4: w= PROPERTY_WILDCARD_SELECT
                    {
                    w=(CommonTree)match(input,PROPERTY_WILDCARD_SELECT,FOLLOW_PROPERTY_WILDCARD_SELECT_in_propertySelectionListElement2964); 
                     leaveNode(w); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:504:4: ^(e= PROPERTY_SELECTION_ELEMENT_EXPR valueExpr ( IDENT )? )
                    {
                    e=(CommonTree)match(input,PROPERTY_SELECTION_ELEMENT_EXPR,FOLLOW_PROPERTY_SELECTION_ELEMENT_EXPR_in_propertySelectionListElement2974); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_propertySelectionListElement2976);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:504:50: ( IDENT )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==IDENT) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // EsperEPL2Ast.g:504:51: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2979); 

                            }
                            break;

                    }

                     leaveNode(e); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:505:4: ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,PROPERTY_SELECTION_STREAM,FOLLOW_PROPERTY_SELECTION_STREAM_in_propertySelectionListElement2993); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2995); 
                    // EsperEPL2Ast.g:505:40: ( IDENT )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==IDENT) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // EsperEPL2Ast.g:505:41: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_propertySelectionListElement2998); 

                            }
                            break;

                    }

                     leaveNode(s); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "propertySelectionListElement"


    // $ANTLR start "patternInclusionExpression"
    // EsperEPL2Ast.g:508:1: patternInclusionExpression : ^(p= PATTERN_INCL_EXPR exprChoice ) ;
    public final void patternInclusionExpression() throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:509:2: ( ^(p= PATTERN_INCL_EXPR exprChoice ) )
            // EsperEPL2Ast.g:509:4: ^(p= PATTERN_INCL_EXPR exprChoice )
            {
            p=(CommonTree)match(input,PATTERN_INCL_EXPR,FOLLOW_PATTERN_INCL_EXPR_in_patternInclusionExpression3019); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_exprChoice_in_patternInclusionExpression3021);
            exprChoice();

            state._fsp--;

             leaveNode(p); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "patternInclusionExpression"


    // $ANTLR start "databaseJoinExpression"
    // EsperEPL2Ast.g:512:1: databaseJoinExpression : ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? ) ;
    public final void databaseJoinExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:513:2: ( ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? ) )
            // EsperEPL2Ast.g:513:4: ^( DATABASE_JOIN_EXPR IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ( STRING_LITERAL | QUOTED_STRING_LITERAL )? )
            {
            match(input,DATABASE_JOIN_EXPR,FOLLOW_DATABASE_JOIN_EXPR_in_databaseJoinExpression3038); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_databaseJoinExpression3040); 
            if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=QUOTED_STRING_LITERAL) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // EsperEPL2Ast.g:513:72: ( STRING_LITERAL | QUOTED_STRING_LITERAL )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( ((LA175_0>=STRING_LITERAL && LA175_0<=QUOTED_STRING_LITERAL)) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=QUOTED_STRING_LITERAL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "databaseJoinExpression"


    // $ANTLR start "methodJoinExpression"
    // EsperEPL2Ast.g:516:1: methodJoinExpression : ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* ) ;
    public final void methodJoinExpression() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:517:2: ( ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* ) )
            // EsperEPL2Ast.g:517:4: ^( METHOD_JOIN_EXPR IDENT CLASS_IDENT ( valueExpr )* )
            {
            match(input,METHOD_JOIN_EXPR,FOLLOW_METHOD_JOIN_EXPR_in_methodJoinExpression3071); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_methodJoinExpression3073); 
            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_methodJoinExpression3075); 
            // EsperEPL2Ast.g:517:41: ( valueExpr )*
            loop176:
            do {
                int alt176=2;
                int LA176_0 = input.LA(1);

                if ( ((LA176_0>=IN_SET && LA176_0<=REGEXP)||LA176_0==NOT_EXPR||(LA176_0>=SUM && LA176_0<=AVG)||(LA176_0>=COALESCE && LA176_0<=COUNT)||(LA176_0>=CASE && LA176_0<=CASE2)||LA176_0==ISTREAM||(LA176_0>=PREVIOUS && LA176_0<=EXISTS)||(LA176_0>=INSTANCEOF && LA176_0<=CURRENT_TIMESTAMP)||LA176_0==NEWKW||(LA176_0>=EVAL_AND_EXPR && LA176_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA176_0==EVENT_PROP_EXPR||LA176_0==CONCAT||(LA176_0>=LIB_FUNC_CHAIN && LA176_0<=DOT_EXPR)||LA176_0==ARRAY_EXPR||(LA176_0>=NOT_IN_SET && LA176_0<=NOT_REGEXP)||(LA176_0>=IN_RANGE && LA176_0<=SUBSELECT_EXPR)||(LA176_0>=EXISTS_SUBSELECT_EXPR && LA176_0<=NOT_IN_SUBSELECT_EXPR)||LA176_0==SUBSTITUTION||(LA176_0>=FIRST_AGGREG && LA176_0<=WINDOW_AGGREG)||(LA176_0>=INT_TYPE && LA176_0<=NULL_TYPE)||(LA176_0>=JSON_OBJECT && LA176_0<=JSON_ARRAY)||LA176_0==STAR||(LA176_0>=LT && LA176_0<=GT)||(LA176_0>=BOR && LA176_0<=PLUS)||(LA176_0>=BAND && LA176_0<=BXOR)||(LA176_0>=LE && LA176_0<=GE)||(LA176_0>=MINUS && LA176_0<=MOD)||(LA176_0>=EVAL_IS_GROUP_EXPR && LA176_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt176=1;
                }


                switch (alt176) {
            	case 1 :
            	    // EsperEPL2Ast.g:517:42: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_methodJoinExpression3078);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop176;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "methodJoinExpression"


    // $ANTLR start "viewListExpr"
    // EsperEPL2Ast.g:520:1: viewListExpr : viewExpr ( viewExpr )* ;
    public final void viewListExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:521:2: ( viewExpr ( viewExpr )* )
            // EsperEPL2Ast.g:521:4: viewExpr ( viewExpr )*
            {
            pushFollow(FOLLOW_viewExpr_in_viewListExpr3092);
            viewExpr();

            state._fsp--;

            // EsperEPL2Ast.g:521:13: ( viewExpr )*
            loop177:
            do {
                int alt177=2;
                int LA177_0 = input.LA(1);

                if ( (LA177_0==VIEW_EXPR) ) {
                    alt177=1;
                }


                switch (alt177) {
            	case 1 :
            	    // EsperEPL2Ast.g:521:14: viewExpr
            	    {
            	    pushFollow(FOLLOW_viewExpr_in_viewListExpr3095);
            	    viewExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop177;
                }
            } while (true);


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "viewListExpr"


    // $ANTLR start "viewExpr"
    // EsperEPL2Ast.g:524:1: viewExpr : ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* ) ;
    public final void viewExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:525:2: ( ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* ) )
            // EsperEPL2Ast.g:525:4: ^(n= VIEW_EXPR IDENT IDENT ( valueExprWithTime )* )
            {
            n=(CommonTree)match(input,VIEW_EXPR,FOLLOW_VIEW_EXPR_in_viewExpr3112); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_viewExpr3114); 
            match(input,IDENT,FOLLOW_IDENT_in_viewExpr3116); 
            // EsperEPL2Ast.g:525:30: ( valueExprWithTime )*
            loop178:
            do {
                int alt178=2;
                int LA178_0 = input.LA(1);

                if ( ((LA178_0>=IN_SET && LA178_0<=REGEXP)||LA178_0==NOT_EXPR||(LA178_0>=SUM && LA178_0<=AVG)||(LA178_0>=COALESCE && LA178_0<=COUNT)||(LA178_0>=CASE && LA178_0<=CASE2)||LA178_0==LAST||LA178_0==ISTREAM||(LA178_0>=PREVIOUS && LA178_0<=EXISTS)||(LA178_0>=LW && LA178_0<=CURRENT_TIMESTAMP)||LA178_0==NEWKW||(LA178_0>=NUMERIC_PARAM_RANGE && LA178_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA178_0>=EVAL_AND_EXPR && LA178_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA178_0==EVENT_PROP_EXPR||LA178_0==CONCAT||(LA178_0>=LIB_FUNC_CHAIN && LA178_0<=DOT_EXPR)||(LA178_0>=TIME_PERIOD && LA178_0<=ARRAY_EXPR)||(LA178_0>=NOT_IN_SET && LA178_0<=NOT_REGEXP)||(LA178_0>=IN_RANGE && LA178_0<=SUBSELECT_EXPR)||(LA178_0>=EXISTS_SUBSELECT_EXPR && LA178_0<=NOT_IN_SUBSELECT_EXPR)||(LA178_0>=LAST_OPERATOR && LA178_0<=SUBSTITUTION)||LA178_0==NUMBERSETSTAR||(LA178_0>=FIRST_AGGREG && LA178_0<=WINDOW_AGGREG)||(LA178_0>=INT_TYPE && LA178_0<=NULL_TYPE)||(LA178_0>=JSON_OBJECT && LA178_0<=JSON_ARRAY)||LA178_0==STAR||(LA178_0>=LT && LA178_0<=GT)||(LA178_0>=BOR && LA178_0<=PLUS)||(LA178_0>=BAND && LA178_0<=BXOR)||(LA178_0>=LE && LA178_0<=GE)||(LA178_0>=MINUS && LA178_0<=MOD)||(LA178_0>=EVAL_IS_GROUP_EXPR && LA178_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt178=1;
                }


                switch (alt178) {
            	case 1 :
            	    // EsperEPL2Ast.g:525:31: valueExprWithTime
            	    {
            	    pushFollow(FOLLOW_valueExprWithTime_in_viewExpr3119);
            	    valueExprWithTime();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop178;
                }
            } while (true);

             leaveNode(n); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "viewExpr"


    // $ANTLR start "whereClause"
    // EsperEPL2Ast.g:528:1: whereClause[boolean isLeaveNode] : ^(n= WHERE_EXPR valueExpr ) ;
    public final void whereClause(boolean isLeaveNode) throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:529:2: ( ^(n= WHERE_EXPR valueExpr ) )
            // EsperEPL2Ast.g:529:4: ^(n= WHERE_EXPR valueExpr )
            {
            n=(CommonTree)match(input,WHERE_EXPR,FOLLOW_WHERE_EXPR_in_whereClause3141); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_whereClause3143);
            valueExpr();

            state._fsp--;

             if (isLeaveNode) leaveNode(n); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "whereClause"


    // $ANTLR start "groupByClause"
    // EsperEPL2Ast.g:532:1: groupByClause : ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* ) ;
    public final void groupByClause() throws RecognitionException {
        CommonTree g=null;

        try {
            // EsperEPL2Ast.g:533:2: ( ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* ) )
            // EsperEPL2Ast.g:533:4: ^(g= GROUP_BY_EXPR valueExpr ( valueExpr )* )
            {
            g=(CommonTree)match(input,GROUP_BY_EXPR,FOLLOW_GROUP_BY_EXPR_in_groupByClause3161); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_groupByClause3163);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:533:32: ( valueExpr )*
            loop179:
            do {
                int alt179=2;
                int LA179_0 = input.LA(1);

                if ( ((LA179_0>=IN_SET && LA179_0<=REGEXP)||LA179_0==NOT_EXPR||(LA179_0>=SUM && LA179_0<=AVG)||(LA179_0>=COALESCE && LA179_0<=COUNT)||(LA179_0>=CASE && LA179_0<=CASE2)||LA179_0==ISTREAM||(LA179_0>=PREVIOUS && LA179_0<=EXISTS)||(LA179_0>=INSTANCEOF && LA179_0<=CURRENT_TIMESTAMP)||LA179_0==NEWKW||(LA179_0>=EVAL_AND_EXPR && LA179_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA179_0==EVENT_PROP_EXPR||LA179_0==CONCAT||(LA179_0>=LIB_FUNC_CHAIN && LA179_0<=DOT_EXPR)||LA179_0==ARRAY_EXPR||(LA179_0>=NOT_IN_SET && LA179_0<=NOT_REGEXP)||(LA179_0>=IN_RANGE && LA179_0<=SUBSELECT_EXPR)||(LA179_0>=EXISTS_SUBSELECT_EXPR && LA179_0<=NOT_IN_SUBSELECT_EXPR)||LA179_0==SUBSTITUTION||(LA179_0>=FIRST_AGGREG && LA179_0<=WINDOW_AGGREG)||(LA179_0>=INT_TYPE && LA179_0<=NULL_TYPE)||(LA179_0>=JSON_OBJECT && LA179_0<=JSON_ARRAY)||LA179_0==STAR||(LA179_0>=LT && LA179_0<=GT)||(LA179_0>=BOR && LA179_0<=PLUS)||(LA179_0>=BAND && LA179_0<=BXOR)||(LA179_0>=LE && LA179_0<=GE)||(LA179_0>=MINUS && LA179_0<=MOD)||(LA179_0>=EVAL_IS_GROUP_EXPR && LA179_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt179=1;
                }


                switch (alt179) {
            	case 1 :
            	    // EsperEPL2Ast.g:533:33: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_groupByClause3166);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop179;
                }
            } while (true);


            match(input, Token.UP, null); 
             leaveNode(g); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "groupByClause"


    // $ANTLR start "orderByClause"
    // EsperEPL2Ast.g:536:1: orderByClause : ^( ORDER_BY_EXPR orderByElement ( orderByElement )* ) ;
    public final void orderByClause() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:537:2: ( ^( ORDER_BY_EXPR orderByElement ( orderByElement )* ) )
            // EsperEPL2Ast.g:537:4: ^( ORDER_BY_EXPR orderByElement ( orderByElement )* )
            {
            match(input,ORDER_BY_EXPR,FOLLOW_ORDER_BY_EXPR_in_orderByClause3184); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_orderByElement_in_orderByClause3186);
            orderByElement();

            state._fsp--;

            // EsperEPL2Ast.g:537:35: ( orderByElement )*
            loop180:
            do {
                int alt180=2;
                int LA180_0 = input.LA(1);

                if ( (LA180_0==ORDER_ELEMENT_EXPR) ) {
                    alt180=1;
                }


                switch (alt180) {
            	case 1 :
            	    // EsperEPL2Ast.g:537:36: orderByElement
            	    {
            	    pushFollow(FOLLOW_orderByElement_in_orderByClause3189);
            	    orderByElement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop180;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "orderByClause"


    // $ANTLR start "orderByElement"
    // EsperEPL2Ast.g:540:1: orderByElement : ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? ) ;
    public final void orderByElement() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:541:2: ( ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? ) )
            // EsperEPL2Ast.g:541:5: ^(e= ORDER_ELEMENT_EXPR valueExpr ( ASC | DESC )? )
            {
            e=(CommonTree)match(input,ORDER_ELEMENT_EXPR,FOLLOW_ORDER_ELEMENT_EXPR_in_orderByElement3209); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_orderByElement3211);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:541:38: ( ASC | DESC )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( ((LA181_0>=ASC && LA181_0<=DESC)) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // EsperEPL2Ast.g:
                    {
                    if ( (input.LA(1)>=ASC && input.LA(1)<=DESC) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

             leaveNode(e); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "orderByElement"


    // $ANTLR start "havingClause"
    // EsperEPL2Ast.g:544:1: havingClause : ^(n= HAVING_EXPR valueExpr ) ;
    public final void havingClause() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:545:2: ( ^(n= HAVING_EXPR valueExpr ) )
            // EsperEPL2Ast.g:545:4: ^(n= HAVING_EXPR valueExpr )
            {
            n=(CommonTree)match(input,HAVING_EXPR,FOLLOW_HAVING_EXPR_in_havingClause3236); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_havingClause3238);
            valueExpr();

            state._fsp--;

             leaveNode(n); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "havingClause"


    // $ANTLR start "outputLimitExpr"
    // EsperEPL2Ast.g:548:1: outputLimitExpr : ( ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? outputLimitAndTerm ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( outputLimitAndTerm )? ) );
    public final void outputLimitExpr() throws RecognitionException {
        CommonTree e=null;
        CommonTree tp=null;
        CommonTree cron=null;
        CommonTree when=null;
        CommonTree term=null;
        CommonTree after=null;

        try {
            // EsperEPL2Ast.g:549:2: ( ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? outputLimitAndTerm ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? ) | ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( outputLimitAndTerm )? ) )
            int alt201=6;
            switch ( input.LA(1) ) {
            case EVENT_LIMIT_EXPR:
                {
                alt201=1;
                }
                break;
            case TIMEPERIOD_LIMIT_EXPR:
                {
                alt201=2;
                }
                break;
            case CRONTAB_LIMIT_EXPR:
                {
                alt201=3;
                }
                break;
            case WHEN_LIMIT_EXPR:
                {
                alt201=4;
                }
                break;
            case TERM_LIMIT_EXPR:
                {
                alt201=5;
                }
                break;
            case AFTER_LIMIT_EXPR:
                {
                alt201=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 201, 0, input);

                throw nvae;
            }

            switch (alt201) {
                case 1 :
                    // EsperEPL2Ast.g:549:4: ^(e= EVENT_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? ( number | IDENT ) ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    e=(CommonTree)match(input,EVENT_LIMIT_EXPR,FOLLOW_EVENT_LIMIT_EXPR_in_outputLimitExpr3256); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:549:25: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt182=2;
                    int LA182_0 = input.LA(1);

                    if ( (LA182_0==ALL||(LA182_0>=FIRST && LA182_0<=LAST)||LA182_0==SNAPSHOT) ) {
                        alt182=1;
                    }
                    switch (alt182) {
                        case 1 :
                            // EsperEPL2Ast.g:
                            {
                            if ( input.LA(1)==ALL||(input.LA(1)>=FIRST && input.LA(1)<=LAST)||input.LA(1)==SNAPSHOT ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:549:52: ( number | IDENT )
                    int alt183=2;
                    int LA183_0 = input.LA(1);

                    if ( ((LA183_0>=INT_TYPE && LA183_0<=DOUBLE_TYPE)) ) {
                        alt183=1;
                    }
                    else if ( (LA183_0==IDENT) ) {
                        alt183=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 183, 0, input);

                        throw nvae;
                    }
                    switch (alt183) {
                        case 1 :
                            // EsperEPL2Ast.g:549:53: number
                            {
                            pushFollow(FOLLOW_number_in_outputLimitExpr3270);
                            number();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:549:60: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_outputLimitExpr3272); 

                            }
                            break;

                    }

                    // EsperEPL2Ast.g:549:67: ( outputLimitAfter )?
                    int alt184=2;
                    int LA184_0 = input.LA(1);

                    if ( (LA184_0==AFTER) ) {
                        alt184=1;
                    }
                    switch (alt184) {
                        case 1 :
                            // EsperEPL2Ast.g:549:67: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3275);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:549:85: ( outputLimitAndTerm )?
                    int alt185=2;
                    int LA185_0 = input.LA(1);

                    if ( (LA185_0==TERMINATED) ) {
                        alt185=1;
                    }
                    switch (alt185) {
                        case 1 :
                            // EsperEPL2Ast.g:549:85: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3278);
                            outputLimitAndTerm();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(e); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:550:7: ^(tp= TIMEPERIOD_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? timePeriod ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    tp=(CommonTree)match(input,TIMEPERIOD_LIMIT_EXPR,FOLLOW_TIMEPERIOD_LIMIT_EXPR_in_outputLimitExpr3295); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:550:34: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt186=2;
                    int LA186_0 = input.LA(1);

                    if ( (LA186_0==ALL||(LA186_0>=FIRST && LA186_0<=LAST)||LA186_0==SNAPSHOT) ) {
                        alt186=1;
                    }
                    switch (alt186) {
                        case 1 :
                            // EsperEPL2Ast.g:
                            {
                            if ( input.LA(1)==ALL||(input.LA(1)>=FIRST && input.LA(1)<=LAST)||input.LA(1)==SNAPSHOT ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_timePeriod_in_outputLimitExpr3308);
                    timePeriod();

                    state._fsp--;

                    // EsperEPL2Ast.g:550:72: ( outputLimitAfter )?
                    int alt187=2;
                    int LA187_0 = input.LA(1);

                    if ( (LA187_0==AFTER) ) {
                        alt187=1;
                    }
                    switch (alt187) {
                        case 1 :
                            // EsperEPL2Ast.g:550:72: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3310);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:550:90: ( outputLimitAndTerm )?
                    int alt188=2;
                    int LA188_0 = input.LA(1);

                    if ( (LA188_0==TERMINATED) ) {
                        alt188=1;
                    }
                    switch (alt188) {
                        case 1 :
                            // EsperEPL2Ast.g:550:90: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3313);
                            outputLimitAndTerm();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(tp); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:551:7: ^(cron= CRONTAB_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? crontabLimitParameterSet ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    cron=(CommonTree)match(input,CRONTAB_LIMIT_EXPR,FOLLOW_CRONTAB_LIMIT_EXPR_in_outputLimitExpr3329); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:551:33: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt189=2;
                    int LA189_0 = input.LA(1);

                    if ( (LA189_0==ALL||(LA189_0>=FIRST && LA189_0<=LAST)||LA189_0==SNAPSHOT) ) {
                        alt189=1;
                    }
                    switch (alt189) {
                        case 1 :
                            // EsperEPL2Ast.g:
                            {
                            if ( input.LA(1)==ALL||(input.LA(1)>=FIRST && input.LA(1)<=LAST)||input.LA(1)==SNAPSHOT ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_crontabLimitParameterSet_in_outputLimitExpr3342);
                    crontabLimitParameterSet();

                    state._fsp--;

                    // EsperEPL2Ast.g:551:85: ( outputLimitAfter )?
                    int alt190=2;
                    int LA190_0 = input.LA(1);

                    if ( (LA190_0==AFTER) ) {
                        alt190=1;
                    }
                    switch (alt190) {
                        case 1 :
                            // EsperEPL2Ast.g:551:85: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3344);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:551:103: ( outputLimitAndTerm )?
                    int alt191=2;
                    int LA191_0 = input.LA(1);

                    if ( (LA191_0==TERMINATED) ) {
                        alt191=1;
                    }
                    switch (alt191) {
                        case 1 :
                            // EsperEPL2Ast.g:551:103: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3347);
                            outputLimitAndTerm();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(cron); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:552:7: ^(when= WHEN_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? valueExpr ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    when=(CommonTree)match(input,WHEN_LIMIT_EXPR,FOLLOW_WHEN_LIMIT_EXPR_in_outputLimitExpr3363); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:552:30: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt192=2;
                    int LA192_0 = input.LA(1);

                    if ( (LA192_0==ALL||(LA192_0>=FIRST && LA192_0<=LAST)||LA192_0==SNAPSHOT) ) {
                        alt192=1;
                    }
                    switch (alt192) {
                        case 1 :
                            // EsperEPL2Ast.g:
                            {
                            if ( input.LA(1)==ALL||(input.LA(1)>=FIRST && input.LA(1)<=LAST)||input.LA(1)==SNAPSHOT ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_outputLimitExpr3376);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:552:67: ( onSetExpr )?
                    int alt193=2;
                    int LA193_0 = input.LA(1);

                    if ( (LA193_0==ON_SET_EXPR) ) {
                        alt193=1;
                    }
                    switch (alt193) {
                        case 1 :
                            // EsperEPL2Ast.g:552:67: onSetExpr
                            {
                            pushFollow(FOLLOW_onSetExpr_in_outputLimitExpr3378);
                            onSetExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:552:78: ( outputLimitAfter )?
                    int alt194=2;
                    int LA194_0 = input.LA(1);

                    if ( (LA194_0==AFTER) ) {
                        alt194=1;
                    }
                    switch (alt194) {
                        case 1 :
                            // EsperEPL2Ast.g:552:78: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3381);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:552:96: ( outputLimitAndTerm )?
                    int alt195=2;
                    int LA195_0 = input.LA(1);

                    if ( (LA195_0==TERMINATED) ) {
                        alt195=1;
                    }
                    switch (alt195) {
                        case 1 :
                            // EsperEPL2Ast.g:552:96: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3384);
                            outputLimitAndTerm();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(when); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:553:7: ^(term= TERM_LIMIT_EXPR ( ALL | FIRST | LAST | SNAPSHOT )? outputLimitAndTerm ( onSetExpr )? ( outputLimitAfter )? ( outputLimitAndTerm )? )
                    {
                    term=(CommonTree)match(input,TERM_LIMIT_EXPR,FOLLOW_TERM_LIMIT_EXPR_in_outputLimitExpr3400); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:553:30: ( ALL | FIRST | LAST | SNAPSHOT )?
                    int alt196=2;
                    int LA196_0 = input.LA(1);

                    if ( (LA196_0==ALL||(LA196_0>=FIRST && LA196_0<=LAST)||LA196_0==SNAPSHOT) ) {
                        alt196=1;
                    }
                    switch (alt196) {
                        case 1 :
                            // EsperEPL2Ast.g:
                            {
                            if ( input.LA(1)==ALL||(input.LA(1)>=FIRST && input.LA(1)<=LAST)||input.LA(1)==SNAPSHOT ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3413);
                    outputLimitAndTerm();

                    state._fsp--;

                    // EsperEPL2Ast.g:553:76: ( onSetExpr )?
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( (LA197_0==ON_SET_EXPR) ) {
                        alt197=1;
                    }
                    switch (alt197) {
                        case 1 :
                            // EsperEPL2Ast.g:553:76: onSetExpr
                            {
                            pushFollow(FOLLOW_onSetExpr_in_outputLimitExpr3415);
                            onSetExpr();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:553:87: ( outputLimitAfter )?
                    int alt198=2;
                    int LA198_0 = input.LA(1);

                    if ( (LA198_0==AFTER) ) {
                        alt198=1;
                    }
                    switch (alt198) {
                        case 1 :
                            // EsperEPL2Ast.g:553:87: outputLimitAfter
                            {
                            pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3418);
                            outputLimitAfter();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:553:105: ( outputLimitAndTerm )?
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( (LA199_0==TERMINATED) ) {
                        alt199=1;
                    }
                    switch (alt199) {
                        case 1 :
                            // EsperEPL2Ast.g:553:105: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3421);
                            outputLimitAndTerm();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(term); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:554:4: ^(after= AFTER_LIMIT_EXPR outputLimitAfter ( outputLimitAndTerm )? )
                    {
                    after=(CommonTree)match(input,AFTER_LIMIT_EXPR,FOLLOW_AFTER_LIMIT_EXPR_in_outputLimitExpr3434); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_outputLimitAfter_in_outputLimitExpr3436);
                    outputLimitAfter();

                    state._fsp--;

                    // EsperEPL2Ast.g:554:46: ( outputLimitAndTerm )?
                    int alt200=2;
                    int LA200_0 = input.LA(1);

                    if ( (LA200_0==TERMINATED) ) {
                        alt200=1;
                    }
                    switch (alt200) {
                        case 1 :
                            // EsperEPL2Ast.g:554:46: outputLimitAndTerm
                            {
                            pushFollow(FOLLOW_outputLimitAndTerm_in_outputLimitExpr3438);
                            outputLimitAndTerm();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(after); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "outputLimitExpr"


    // $ANTLR start "outputLimitAndTerm"
    // EsperEPL2Ast.g:557:1: outputLimitAndTerm : ^( TERMINATED ( valueExpr )? ( onSetExpr )? ) ;
    public final void outputLimitAndTerm() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:558:2: ( ^( TERMINATED ( valueExpr )? ( onSetExpr )? ) )
            // EsperEPL2Ast.g:558:5: ^( TERMINATED ( valueExpr )? ( onSetExpr )? )
            {
            match(input,TERMINATED,FOLLOW_TERMINATED_in_outputLimitAndTerm3455); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:558:18: ( valueExpr )?
                int alt202=2;
                int LA202_0 = input.LA(1);

                if ( ((LA202_0>=IN_SET && LA202_0<=REGEXP)||LA202_0==NOT_EXPR||(LA202_0>=SUM && LA202_0<=AVG)||(LA202_0>=COALESCE && LA202_0<=COUNT)||(LA202_0>=CASE && LA202_0<=CASE2)||LA202_0==ISTREAM||(LA202_0>=PREVIOUS && LA202_0<=EXISTS)||(LA202_0>=INSTANCEOF && LA202_0<=CURRENT_TIMESTAMP)||LA202_0==NEWKW||(LA202_0>=EVAL_AND_EXPR && LA202_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA202_0==EVENT_PROP_EXPR||LA202_0==CONCAT||(LA202_0>=LIB_FUNC_CHAIN && LA202_0<=DOT_EXPR)||LA202_0==ARRAY_EXPR||(LA202_0>=NOT_IN_SET && LA202_0<=NOT_REGEXP)||(LA202_0>=IN_RANGE && LA202_0<=SUBSELECT_EXPR)||(LA202_0>=EXISTS_SUBSELECT_EXPR && LA202_0<=NOT_IN_SUBSELECT_EXPR)||LA202_0==SUBSTITUTION||(LA202_0>=FIRST_AGGREG && LA202_0<=WINDOW_AGGREG)||(LA202_0>=INT_TYPE && LA202_0<=NULL_TYPE)||(LA202_0>=JSON_OBJECT && LA202_0<=JSON_ARRAY)||LA202_0==STAR||(LA202_0>=LT && LA202_0<=GT)||(LA202_0>=BOR && LA202_0<=PLUS)||(LA202_0>=BAND && LA202_0<=BXOR)||(LA202_0>=LE && LA202_0<=GE)||(LA202_0>=MINUS && LA202_0<=MOD)||(LA202_0>=EVAL_IS_GROUP_EXPR && LA202_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt202=1;
                }
                switch (alt202) {
                    case 1 :
                        // EsperEPL2Ast.g:558:18: valueExpr
                        {
                        pushFollow(FOLLOW_valueExpr_in_outputLimitAndTerm3457);
                        valueExpr();

                        state._fsp--;


                        }
                        break;

                }

                // EsperEPL2Ast.g:558:29: ( onSetExpr )?
                int alt203=2;
                int LA203_0 = input.LA(1);

                if ( (LA203_0==ON_SET_EXPR) ) {
                    alt203=1;
                }
                switch (alt203) {
                    case 1 :
                        // EsperEPL2Ast.g:558:29: onSetExpr
                        {
                        pushFollow(FOLLOW_onSetExpr_in_outputLimitAndTerm3460);
                        onSetExpr();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "outputLimitAndTerm"


    // $ANTLR start "outputLimitAfter"
    // EsperEPL2Ast.g:561:1: outputLimitAfter : ^( AFTER ( timePeriod )? ( number )? ) ;
    public final void outputLimitAfter() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:562:2: ( ^( AFTER ( timePeriod )? ( number )? ) )
            // EsperEPL2Ast.g:562:4: ^( AFTER ( timePeriod )? ( number )? )
            {
            match(input,AFTER,FOLLOW_AFTER_in_outputLimitAfter3474); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:562:12: ( timePeriod )?
                int alt204=2;
                int LA204_0 = input.LA(1);

                if ( (LA204_0==TIME_PERIOD) ) {
                    alt204=1;
                }
                switch (alt204) {
                    case 1 :
                        // EsperEPL2Ast.g:562:12: timePeriod
                        {
                        pushFollow(FOLLOW_timePeriod_in_outputLimitAfter3476);
                        timePeriod();

                        state._fsp--;


                        }
                        break;

                }

                // EsperEPL2Ast.g:562:24: ( number )?
                int alt205=2;
                int LA205_0 = input.LA(1);

                if ( ((LA205_0>=INT_TYPE && LA205_0<=DOUBLE_TYPE)) ) {
                    alt205=1;
                }
                switch (alt205) {
                    case 1 :
                        // EsperEPL2Ast.g:562:24: number
                        {
                        pushFollow(FOLLOW_number_in_outputLimitAfter3479);
                        number();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "outputLimitAfter"


    // $ANTLR start "rowLimitClause"
    // EsperEPL2Ast.g:565:1: rowLimitClause : ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? ) ;
    public final void rowLimitClause() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:566:2: ( ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? ) )
            // EsperEPL2Ast.g:566:4: ^(e= ROW_LIMIT_EXPR ( number | IDENT ) ( number | IDENT )? ( COMMA )? ( OFFSET )? )
            {
            e=(CommonTree)match(input,ROW_LIMIT_EXPR,FOLLOW_ROW_LIMIT_EXPR_in_rowLimitClause3495); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:566:23: ( number | IDENT )
            int alt206=2;
            int LA206_0 = input.LA(1);

            if ( ((LA206_0>=INT_TYPE && LA206_0<=DOUBLE_TYPE)) ) {
                alt206=1;
            }
            else if ( (LA206_0==IDENT) ) {
                alt206=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 206, 0, input);

                throw nvae;
            }
            switch (alt206) {
                case 1 :
                    // EsperEPL2Ast.g:566:24: number
                    {
                    pushFollow(FOLLOW_number_in_rowLimitClause3498);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:566:31: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_rowLimitClause3500); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:566:38: ( number | IDENT )?
            int alt207=3;
            int LA207_0 = input.LA(1);

            if ( ((LA207_0>=INT_TYPE && LA207_0<=DOUBLE_TYPE)) ) {
                alt207=1;
            }
            else if ( (LA207_0==IDENT) ) {
                alt207=2;
            }
            switch (alt207) {
                case 1 :
                    // EsperEPL2Ast.g:566:39: number
                    {
                    pushFollow(FOLLOW_number_in_rowLimitClause3504);
                    number();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:566:46: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_rowLimitClause3506); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:566:54: ( COMMA )?
            int alt208=2;
            int LA208_0 = input.LA(1);

            if ( (LA208_0==COMMA) ) {
                alt208=1;
            }
            switch (alt208) {
                case 1 :
                    // EsperEPL2Ast.g:566:54: COMMA
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_rowLimitClause3510); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:566:61: ( OFFSET )?
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==OFFSET) ) {
                alt209=1;
            }
            switch (alt209) {
                case 1 :
                    // EsperEPL2Ast.g:566:61: OFFSET
                    {
                    match(input,OFFSET,FOLLOW_OFFSET_in_rowLimitClause3513); 

                    }
                    break;

            }

             leaveNode(e); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "rowLimitClause"


    // $ANTLR start "crontabLimitParameterSet"
    // EsperEPL2Ast.g:569:1: crontabLimitParameterSet : ^( CRONTAB_LIMIT_EXPR_PARAM ( valueExprWithTime )* ) ;
    public final void crontabLimitParameterSet() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:570:2: ( ^( CRONTAB_LIMIT_EXPR_PARAM ( valueExprWithTime )* ) )
            // EsperEPL2Ast.g:570:4: ^( CRONTAB_LIMIT_EXPR_PARAM ( valueExprWithTime )* )
            {
            match(input,CRONTAB_LIMIT_EXPR_PARAM,FOLLOW_CRONTAB_LIMIT_EXPR_PARAM_in_crontabLimitParameterSet3531); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:570:31: ( valueExprWithTime )*
                loop210:
                do {
                    int alt210=2;
                    int LA210_0 = input.LA(1);

                    if ( ((LA210_0>=IN_SET && LA210_0<=REGEXP)||LA210_0==NOT_EXPR||(LA210_0>=SUM && LA210_0<=AVG)||(LA210_0>=COALESCE && LA210_0<=COUNT)||(LA210_0>=CASE && LA210_0<=CASE2)||LA210_0==LAST||LA210_0==ISTREAM||(LA210_0>=PREVIOUS && LA210_0<=EXISTS)||(LA210_0>=LW && LA210_0<=CURRENT_TIMESTAMP)||LA210_0==NEWKW||(LA210_0>=NUMERIC_PARAM_RANGE && LA210_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA210_0>=EVAL_AND_EXPR && LA210_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA210_0==EVENT_PROP_EXPR||LA210_0==CONCAT||(LA210_0>=LIB_FUNC_CHAIN && LA210_0<=DOT_EXPR)||(LA210_0>=TIME_PERIOD && LA210_0<=ARRAY_EXPR)||(LA210_0>=NOT_IN_SET && LA210_0<=NOT_REGEXP)||(LA210_0>=IN_RANGE && LA210_0<=SUBSELECT_EXPR)||(LA210_0>=EXISTS_SUBSELECT_EXPR && LA210_0<=NOT_IN_SUBSELECT_EXPR)||(LA210_0>=LAST_OPERATOR && LA210_0<=SUBSTITUTION)||LA210_0==NUMBERSETSTAR||(LA210_0>=FIRST_AGGREG && LA210_0<=WINDOW_AGGREG)||(LA210_0>=INT_TYPE && LA210_0<=NULL_TYPE)||(LA210_0>=JSON_OBJECT && LA210_0<=JSON_ARRAY)||LA210_0==STAR||(LA210_0>=LT && LA210_0<=GT)||(LA210_0>=BOR && LA210_0<=PLUS)||(LA210_0>=BAND && LA210_0<=BXOR)||(LA210_0>=LE && LA210_0<=GE)||(LA210_0>=MINUS && LA210_0<=MOD)||(LA210_0>=EVAL_IS_GROUP_EXPR && LA210_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt210=1;
                    }


                    switch (alt210) {
                	case 1 :
                	    // EsperEPL2Ast.g:570:31: valueExprWithTime
                	    {
                	    pushFollow(FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3533);
                	    valueExprWithTime();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop210;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "crontabLimitParameterSet"


    // $ANTLR start "relationalExpr"
    // EsperEPL2Ast.g:573:1: relationalExpr : ( ^(n= LT relationalExprValue ) | ^(n= GT relationalExprValue ) | ^(n= LE relationalExprValue ) | ^(n= GE relationalExprValue ) );
    public final void relationalExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:574:2: ( ^(n= LT relationalExprValue ) | ^(n= GT relationalExprValue ) | ^(n= LE relationalExprValue ) | ^(n= GE relationalExprValue ) )
            int alt211=4;
            switch ( input.LA(1) ) {
            case LT:
                {
                alt211=1;
                }
                break;
            case GT:
                {
                alt211=2;
                }
                break;
            case LE:
                {
                alt211=3;
                }
                break;
            case GE:
                {
                alt211=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 211, 0, input);

                throw nvae;
            }

            switch (alt211) {
                case 1 :
                    // EsperEPL2Ast.g:574:5: ^(n= LT relationalExprValue )
                    {
                    n=(CommonTree)match(input,LT,FOLLOW_LT_in_relationalExpr3550); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3552);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:575:5: ^(n= GT relationalExprValue )
                    {
                    n=(CommonTree)match(input,GT,FOLLOW_GT_in_relationalExpr3565); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3567);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:576:5: ^(n= LE relationalExprValue )
                    {
                    n=(CommonTree)match(input,LE,FOLLOW_LE_in_relationalExpr3580); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3582);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:577:4: ^(n= GE relationalExprValue )
                    {
                    n=(CommonTree)match(input,GE,FOLLOW_GE_in_relationalExpr3594); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_relationalExprValue_in_relationalExpr3596);
                    relationalExprValue();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "relationalExpr"


    // $ANTLR start "relationalExprValue"
    // EsperEPL2Ast.g:580:1: relationalExprValue : ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) ) ;
    public final void relationalExprValue() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:581:2: ( ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) ) )
            // EsperEPL2Ast.g:581:4: ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) )
            {
            // EsperEPL2Ast.g:581:4: ( valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ) )
            // EsperEPL2Ast.g:582:5: valueExpr ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            {
            pushFollow(FOLLOW_valueExpr_in_relationalExprValue3618);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:583:6: ( valueExpr | ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( ((LA214_0>=IN_SET && LA214_0<=REGEXP)||LA214_0==NOT_EXPR||(LA214_0>=SUM && LA214_0<=AVG)||(LA214_0>=COALESCE && LA214_0<=COUNT)||(LA214_0>=CASE && LA214_0<=CASE2)||LA214_0==ISTREAM||(LA214_0>=PREVIOUS && LA214_0<=EXISTS)||(LA214_0>=INSTANCEOF && LA214_0<=CURRENT_TIMESTAMP)||LA214_0==NEWKW||(LA214_0>=EVAL_AND_EXPR && LA214_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA214_0==EVENT_PROP_EXPR||LA214_0==CONCAT||(LA214_0>=LIB_FUNC_CHAIN && LA214_0<=DOT_EXPR)||LA214_0==ARRAY_EXPR||(LA214_0>=NOT_IN_SET && LA214_0<=NOT_REGEXP)||(LA214_0>=IN_RANGE && LA214_0<=SUBSELECT_EXPR)||(LA214_0>=EXISTS_SUBSELECT_EXPR && LA214_0<=NOT_IN_SUBSELECT_EXPR)||LA214_0==SUBSTITUTION||(LA214_0>=FIRST_AGGREG && LA214_0<=WINDOW_AGGREG)||(LA214_0>=INT_TYPE && LA214_0<=NULL_TYPE)||(LA214_0>=JSON_OBJECT && LA214_0<=JSON_ARRAY)||LA214_0==STAR||(LA214_0>=LT && LA214_0<=GT)||(LA214_0>=BOR && LA214_0<=PLUS)||(LA214_0>=BAND && LA214_0<=BXOR)||(LA214_0>=LE && LA214_0<=GE)||(LA214_0>=MINUS && LA214_0<=MOD)||(LA214_0>=EVAL_IS_GROUP_EXPR && LA214_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt214=1;
            }
            else if ( ((LA214_0>=ALL && LA214_0<=SOME)) ) {
                alt214=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 214, 0, input);

                throw nvae;
            }
            switch (alt214) {
                case 1 :
                    // EsperEPL2Ast.g:583:8: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_relationalExprValue3628);
                    valueExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:585:6: ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr )
                    {
                    if ( (input.LA(1)>=ALL && input.LA(1)<=SOME) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:585:21: ( ( valueExpr )* | subSelectGroupExpr )
                    int alt213=2;
                    int LA213_0 = input.LA(1);

                    if ( (LA213_0==UP||(LA213_0>=IN_SET && LA213_0<=REGEXP)||LA213_0==NOT_EXPR||(LA213_0>=SUM && LA213_0<=AVG)||(LA213_0>=COALESCE && LA213_0<=COUNT)||(LA213_0>=CASE && LA213_0<=CASE2)||LA213_0==ISTREAM||(LA213_0>=PREVIOUS && LA213_0<=EXISTS)||(LA213_0>=INSTANCEOF && LA213_0<=CURRENT_TIMESTAMP)||LA213_0==NEWKW||(LA213_0>=EVAL_AND_EXPR && LA213_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA213_0==EVENT_PROP_EXPR||LA213_0==CONCAT||(LA213_0>=LIB_FUNC_CHAIN && LA213_0<=DOT_EXPR)||LA213_0==ARRAY_EXPR||(LA213_0>=NOT_IN_SET && LA213_0<=NOT_REGEXP)||(LA213_0>=IN_RANGE && LA213_0<=SUBSELECT_EXPR)||(LA213_0>=EXISTS_SUBSELECT_EXPR && LA213_0<=NOT_IN_SUBSELECT_EXPR)||LA213_0==SUBSTITUTION||(LA213_0>=FIRST_AGGREG && LA213_0<=WINDOW_AGGREG)||(LA213_0>=INT_TYPE && LA213_0<=NULL_TYPE)||(LA213_0>=JSON_OBJECT && LA213_0<=JSON_ARRAY)||LA213_0==STAR||(LA213_0>=LT && LA213_0<=GT)||(LA213_0>=BOR && LA213_0<=PLUS)||(LA213_0>=BAND && LA213_0<=BXOR)||(LA213_0>=LE && LA213_0<=GE)||(LA213_0>=MINUS && LA213_0<=MOD)||(LA213_0>=EVAL_IS_GROUP_EXPR && LA213_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt213=1;
                    }
                    else if ( (LA213_0==SUBSELECT_GROUP_EXPR) ) {
                        alt213=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 213, 0, input);

                        throw nvae;
                    }
                    switch (alt213) {
                        case 1 :
                            // EsperEPL2Ast.g:585:22: ( valueExpr )*
                            {
                            // EsperEPL2Ast.g:585:22: ( valueExpr )*
                            loop212:
                            do {
                                int alt212=2;
                                int LA212_0 = input.LA(1);

                                if ( ((LA212_0>=IN_SET && LA212_0<=REGEXP)||LA212_0==NOT_EXPR||(LA212_0>=SUM && LA212_0<=AVG)||(LA212_0>=COALESCE && LA212_0<=COUNT)||(LA212_0>=CASE && LA212_0<=CASE2)||LA212_0==ISTREAM||(LA212_0>=PREVIOUS && LA212_0<=EXISTS)||(LA212_0>=INSTANCEOF && LA212_0<=CURRENT_TIMESTAMP)||LA212_0==NEWKW||(LA212_0>=EVAL_AND_EXPR && LA212_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA212_0==EVENT_PROP_EXPR||LA212_0==CONCAT||(LA212_0>=LIB_FUNC_CHAIN && LA212_0<=DOT_EXPR)||LA212_0==ARRAY_EXPR||(LA212_0>=NOT_IN_SET && LA212_0<=NOT_REGEXP)||(LA212_0>=IN_RANGE && LA212_0<=SUBSELECT_EXPR)||(LA212_0>=EXISTS_SUBSELECT_EXPR && LA212_0<=NOT_IN_SUBSELECT_EXPR)||LA212_0==SUBSTITUTION||(LA212_0>=FIRST_AGGREG && LA212_0<=WINDOW_AGGREG)||(LA212_0>=INT_TYPE && LA212_0<=NULL_TYPE)||(LA212_0>=JSON_OBJECT && LA212_0<=JSON_ARRAY)||LA212_0==STAR||(LA212_0>=LT && LA212_0<=GT)||(LA212_0>=BOR && LA212_0<=PLUS)||(LA212_0>=BAND && LA212_0<=BXOR)||(LA212_0>=LE && LA212_0<=GE)||(LA212_0>=MINUS && LA212_0<=MOD)||(LA212_0>=EVAL_IS_GROUP_EXPR && LA212_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                    alt212=1;
                                }


                                switch (alt212) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:585:22: valueExpr
                            	    {
                            	    pushFollow(FOLLOW_valueExpr_in_relationalExprValue3652);
                            	    valueExpr();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop212;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:585:35: subSelectGroupExpr
                            {
                            pushFollow(FOLLOW_subSelectGroupExpr_in_relationalExprValue3657);
                            subSelectGroupExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "relationalExprValue"


    // $ANTLR start "evalExprChoice"
    // EsperEPL2Ast.g:590:1: evalExprChoice : ( ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr ) | ^(ji= EVAL_IS_EXPR valueExpr valueExpr ) | ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr ) | ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr ) | ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery ) | ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery ) | ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery ) | ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery ) | ^(n= NOT_EXPR valueExpr ) | r= relationalExpr );
    public final void evalExprChoice() throws RecognitionException {
        CommonTree jo=null;
        CommonTree ja=null;
        CommonTree je=null;
        CommonTree ji=null;
        CommonTree jne=null;
        CommonTree jis=null;
        CommonTree jge=null;
        CommonTree jgi=null;
        CommonTree jgne=null;
        CommonTree jgni=null;
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:591:2: ( ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* ) | ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr ) | ^(ji= EVAL_IS_EXPR valueExpr valueExpr ) | ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr ) | ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr ) | ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery ) | ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery ) | ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery ) | ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery ) | ^(n= NOT_EXPR valueExpr ) | r= relationalExpr )
            int alt217=12;
            switch ( input.LA(1) ) {
            case EVAL_OR_EXPR:
                {
                alt217=1;
                }
                break;
            case EVAL_AND_EXPR:
                {
                alt217=2;
                }
                break;
            case EVAL_EQUALS_EXPR:
                {
                alt217=3;
                }
                break;
            case EVAL_IS_EXPR:
                {
                alt217=4;
                }
                break;
            case EVAL_NOTEQUALS_EXPR:
                {
                alt217=5;
                }
                break;
            case EVAL_ISNOT_EXPR:
                {
                alt217=6;
                }
                break;
            case EVAL_EQUALS_GROUP_EXPR:
                {
                alt217=7;
                }
                break;
            case EVAL_IS_GROUP_EXPR:
                {
                alt217=8;
                }
                break;
            case EVAL_NOTEQUALS_GROUP_EXPR:
                {
                alt217=9;
                }
                break;
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt217=10;
                }
                break;
            case NOT_EXPR:
                {
                alt217=11;
                }
                break;
            case LT:
            case GT:
            case LE:
            case GE:
                {
                alt217=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 217, 0, input);

                throw nvae;
            }

            switch (alt217) {
                case 1 :
                    // EsperEPL2Ast.g:591:4: ^(jo= EVAL_OR_EXPR valueExpr valueExpr ( valueExpr )* )
                    {
                    jo=(CommonTree)match(input,EVAL_OR_EXPR,FOLLOW_EVAL_OR_EXPR_in_evalExprChoice3683); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3685);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3687);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:591:42: ( valueExpr )*
                    loop215:
                    do {
                        int alt215=2;
                        int LA215_0 = input.LA(1);

                        if ( ((LA215_0>=IN_SET && LA215_0<=REGEXP)||LA215_0==NOT_EXPR||(LA215_0>=SUM && LA215_0<=AVG)||(LA215_0>=COALESCE && LA215_0<=COUNT)||(LA215_0>=CASE && LA215_0<=CASE2)||LA215_0==ISTREAM||(LA215_0>=PREVIOUS && LA215_0<=EXISTS)||(LA215_0>=INSTANCEOF && LA215_0<=CURRENT_TIMESTAMP)||LA215_0==NEWKW||(LA215_0>=EVAL_AND_EXPR && LA215_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA215_0==EVENT_PROP_EXPR||LA215_0==CONCAT||(LA215_0>=LIB_FUNC_CHAIN && LA215_0<=DOT_EXPR)||LA215_0==ARRAY_EXPR||(LA215_0>=NOT_IN_SET && LA215_0<=NOT_REGEXP)||(LA215_0>=IN_RANGE && LA215_0<=SUBSELECT_EXPR)||(LA215_0>=EXISTS_SUBSELECT_EXPR && LA215_0<=NOT_IN_SUBSELECT_EXPR)||LA215_0==SUBSTITUTION||(LA215_0>=FIRST_AGGREG && LA215_0<=WINDOW_AGGREG)||(LA215_0>=INT_TYPE && LA215_0<=NULL_TYPE)||(LA215_0>=JSON_OBJECT && LA215_0<=JSON_ARRAY)||LA215_0==STAR||(LA215_0>=LT && LA215_0<=GT)||(LA215_0>=BOR && LA215_0<=PLUS)||(LA215_0>=BAND && LA215_0<=BXOR)||(LA215_0>=LE && LA215_0<=GE)||(LA215_0>=MINUS && LA215_0<=MOD)||(LA215_0>=EVAL_IS_GROUP_EXPR && LA215_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt215=1;
                        }


                        switch (alt215) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:591:43: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3690);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop215;
                        }
                    } while (true);

                     leaveNode(jo); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:592:4: ^(ja= EVAL_AND_EXPR valueExpr valueExpr ( valueExpr )* )
                    {
                    ja=(CommonTree)match(input,EVAL_AND_EXPR,FOLLOW_EVAL_AND_EXPR_in_evalExprChoice3704); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3706);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3708);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:592:43: ( valueExpr )*
                    loop216:
                    do {
                        int alt216=2;
                        int LA216_0 = input.LA(1);

                        if ( ((LA216_0>=IN_SET && LA216_0<=REGEXP)||LA216_0==NOT_EXPR||(LA216_0>=SUM && LA216_0<=AVG)||(LA216_0>=COALESCE && LA216_0<=COUNT)||(LA216_0>=CASE && LA216_0<=CASE2)||LA216_0==ISTREAM||(LA216_0>=PREVIOUS && LA216_0<=EXISTS)||(LA216_0>=INSTANCEOF && LA216_0<=CURRENT_TIMESTAMP)||LA216_0==NEWKW||(LA216_0>=EVAL_AND_EXPR && LA216_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA216_0==EVENT_PROP_EXPR||LA216_0==CONCAT||(LA216_0>=LIB_FUNC_CHAIN && LA216_0<=DOT_EXPR)||LA216_0==ARRAY_EXPR||(LA216_0>=NOT_IN_SET && LA216_0<=NOT_REGEXP)||(LA216_0>=IN_RANGE && LA216_0<=SUBSELECT_EXPR)||(LA216_0>=EXISTS_SUBSELECT_EXPR && LA216_0<=NOT_IN_SUBSELECT_EXPR)||LA216_0==SUBSTITUTION||(LA216_0>=FIRST_AGGREG && LA216_0<=WINDOW_AGGREG)||(LA216_0>=INT_TYPE && LA216_0<=NULL_TYPE)||(LA216_0>=JSON_OBJECT && LA216_0<=JSON_ARRAY)||LA216_0==STAR||(LA216_0>=LT && LA216_0<=GT)||(LA216_0>=BOR && LA216_0<=PLUS)||(LA216_0>=BAND && LA216_0<=BXOR)||(LA216_0>=LE && LA216_0<=GE)||(LA216_0>=MINUS && LA216_0<=MOD)||(LA216_0>=EVAL_IS_GROUP_EXPR && LA216_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt216=1;
                        }


                        switch (alt216) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:592:44: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3711);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop216;
                        }
                    } while (true);

                     leaveNode(ja); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:593:4: ^(je= EVAL_EQUALS_EXPR valueExpr valueExpr )
                    {
                    je=(CommonTree)match(input,EVAL_EQUALS_EXPR,FOLLOW_EVAL_EQUALS_EXPR_in_evalExprChoice3725); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3727);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3729);
                    valueExpr();

                    state._fsp--;

                     leaveNode(je); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:594:4: ^(ji= EVAL_IS_EXPR valueExpr valueExpr )
                    {
                    ji=(CommonTree)match(input,EVAL_IS_EXPR,FOLLOW_EVAL_IS_EXPR_in_evalExprChoice3741); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3743);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3745);
                    valueExpr();

                    state._fsp--;

                     leaveNode(ji); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:595:4: ^(jne= EVAL_NOTEQUALS_EXPR valueExpr valueExpr )
                    {
                    jne=(CommonTree)match(input,EVAL_NOTEQUALS_EXPR,FOLLOW_EVAL_NOTEQUALS_EXPR_in_evalExprChoice3757); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3759);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3761);
                    valueExpr();

                    state._fsp--;

                     leaveNode(jne); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:596:4: ^(jis= EVAL_ISNOT_EXPR valueExpr valueExpr )
                    {
                    jis=(CommonTree)match(input,EVAL_ISNOT_EXPR,FOLLOW_EVAL_ISNOT_EXPR_in_evalExprChoice3773); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3775);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3777);
                    valueExpr();

                    state._fsp--;

                     leaveNode(jis); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:597:4: ^(jge= EVAL_EQUALS_GROUP_EXPR equalsSubquery )
                    {
                    jge=(CommonTree)match(input,EVAL_EQUALS_GROUP_EXPR,FOLLOW_EVAL_EQUALS_GROUP_EXPR_in_evalExprChoice3789); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3791);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jge); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:598:4: ^(jgi= EVAL_IS_GROUP_EXPR equalsSubquery )
                    {
                    jgi=(CommonTree)match(input,EVAL_IS_GROUP_EXPR,FOLLOW_EVAL_IS_GROUP_EXPR_in_evalExprChoice3803); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3805);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgi); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:599:4: ^(jgne= EVAL_NOTEQUALS_GROUP_EXPR equalsSubquery )
                    {
                    jgne=(CommonTree)match(input,EVAL_NOTEQUALS_GROUP_EXPR,FOLLOW_EVAL_NOTEQUALS_GROUP_EXPR_in_evalExprChoice3817); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3819);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgne); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:600:4: ^(jgni= EVAL_ISNOT_GROUP_EXPR equalsSubquery )
                    {
                    jgni=(CommonTree)match(input,EVAL_ISNOT_GROUP_EXPR,FOLLOW_EVAL_ISNOT_GROUP_EXPR_in_evalExprChoice3831); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equalsSubquery_in_evalExprChoice3833);
                    equalsSubquery();

                    state._fsp--;

                     leaveNode(jgni); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:601:4: ^(n= NOT_EXPR valueExpr )
                    {
                    n=(CommonTree)match(input,NOT_EXPR,FOLLOW_NOT_EXPR_in_evalExprChoice3845); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_evalExprChoice3847);
                    valueExpr();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:602:4: r= relationalExpr
                    {
                    pushFollow(FOLLOW_relationalExpr_in_evalExprChoice3858);
                    relationalExpr();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "evalExprChoice"


    // $ANTLR start "equalsSubquery"
    // EsperEPL2Ast.g:605:1: equalsSubquery : valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) ;
    public final void equalsSubquery() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:606:2: ( valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr ) )
            // EsperEPL2Ast.g:606:4: valueExpr ( ANY | SOME | ALL ) ( ( valueExpr )* | subSelectGroupExpr )
            {
            pushFollow(FOLLOW_valueExpr_in_equalsSubquery3869);
            valueExpr();

            state._fsp--;

            if ( (input.LA(1)>=ALL && input.LA(1)<=SOME) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // EsperEPL2Ast.g:606:29: ( ( valueExpr )* | subSelectGroupExpr )
            int alt219=2;
            int LA219_0 = input.LA(1);

            if ( (LA219_0==UP||(LA219_0>=IN_SET && LA219_0<=REGEXP)||LA219_0==NOT_EXPR||(LA219_0>=SUM && LA219_0<=AVG)||(LA219_0>=COALESCE && LA219_0<=COUNT)||(LA219_0>=CASE && LA219_0<=CASE2)||LA219_0==ISTREAM||(LA219_0>=PREVIOUS && LA219_0<=EXISTS)||(LA219_0>=INSTANCEOF && LA219_0<=CURRENT_TIMESTAMP)||LA219_0==NEWKW||(LA219_0>=EVAL_AND_EXPR && LA219_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA219_0==EVENT_PROP_EXPR||LA219_0==CONCAT||(LA219_0>=LIB_FUNC_CHAIN && LA219_0<=DOT_EXPR)||LA219_0==ARRAY_EXPR||(LA219_0>=NOT_IN_SET && LA219_0<=NOT_REGEXP)||(LA219_0>=IN_RANGE && LA219_0<=SUBSELECT_EXPR)||(LA219_0>=EXISTS_SUBSELECT_EXPR && LA219_0<=NOT_IN_SUBSELECT_EXPR)||LA219_0==SUBSTITUTION||(LA219_0>=FIRST_AGGREG && LA219_0<=WINDOW_AGGREG)||(LA219_0>=INT_TYPE && LA219_0<=NULL_TYPE)||(LA219_0>=JSON_OBJECT && LA219_0<=JSON_ARRAY)||LA219_0==STAR||(LA219_0>=LT && LA219_0<=GT)||(LA219_0>=BOR && LA219_0<=PLUS)||(LA219_0>=BAND && LA219_0<=BXOR)||(LA219_0>=LE && LA219_0<=GE)||(LA219_0>=MINUS && LA219_0<=MOD)||(LA219_0>=EVAL_IS_GROUP_EXPR && LA219_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt219=1;
            }
            else if ( (LA219_0==SUBSELECT_GROUP_EXPR) ) {
                alt219=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 219, 0, input);

                throw nvae;
            }
            switch (alt219) {
                case 1 :
                    // EsperEPL2Ast.g:606:30: ( valueExpr )*
                    {
                    // EsperEPL2Ast.g:606:30: ( valueExpr )*
                    loop218:
                    do {
                        int alt218=2;
                        int LA218_0 = input.LA(1);

                        if ( ((LA218_0>=IN_SET && LA218_0<=REGEXP)||LA218_0==NOT_EXPR||(LA218_0>=SUM && LA218_0<=AVG)||(LA218_0>=COALESCE && LA218_0<=COUNT)||(LA218_0>=CASE && LA218_0<=CASE2)||LA218_0==ISTREAM||(LA218_0>=PREVIOUS && LA218_0<=EXISTS)||(LA218_0>=INSTANCEOF && LA218_0<=CURRENT_TIMESTAMP)||LA218_0==NEWKW||(LA218_0>=EVAL_AND_EXPR && LA218_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA218_0==EVENT_PROP_EXPR||LA218_0==CONCAT||(LA218_0>=LIB_FUNC_CHAIN && LA218_0<=DOT_EXPR)||LA218_0==ARRAY_EXPR||(LA218_0>=NOT_IN_SET && LA218_0<=NOT_REGEXP)||(LA218_0>=IN_RANGE && LA218_0<=SUBSELECT_EXPR)||(LA218_0>=EXISTS_SUBSELECT_EXPR && LA218_0<=NOT_IN_SUBSELECT_EXPR)||LA218_0==SUBSTITUTION||(LA218_0>=FIRST_AGGREG && LA218_0<=WINDOW_AGGREG)||(LA218_0>=INT_TYPE && LA218_0<=NULL_TYPE)||(LA218_0>=JSON_OBJECT && LA218_0<=JSON_ARRAY)||LA218_0==STAR||(LA218_0>=LT && LA218_0<=GT)||(LA218_0>=BOR && LA218_0<=PLUS)||(LA218_0>=BAND && LA218_0<=BXOR)||(LA218_0>=LE && LA218_0<=GE)||(LA218_0>=MINUS && LA218_0<=MOD)||(LA218_0>=EVAL_IS_GROUP_EXPR && LA218_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt218=1;
                        }


                        switch (alt218) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:606:30: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_equalsSubquery3880);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop218;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:606:43: subSelectGroupExpr
                    {
                    pushFollow(FOLLOW_subSelectGroupExpr_in_equalsSubquery3885);
                    subSelectGroupExpr();

                    state._fsp--;


                    }
                    break;

            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "equalsSubquery"


    // $ANTLR start "valueExpr"
    // EsperEPL2Ast.g:609:1: valueExpr : ( constant[true] | substitution | arithmeticExpr | eventPropertyExpr[true] | evalExprChoice | builtinFunc | libFuncChain | caseExpr | inExpr | betweenExpr | likeExpr | regExpExpr | arrayExpr | subSelectInExpr | subSelectRowExpr | subSelectExistsExpr | dotExpr | newExpr | jsonarray[true] | jsonobject[true] );
    public final void valueExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:610:2: ( constant[true] | substitution | arithmeticExpr | eventPropertyExpr[true] | evalExprChoice | builtinFunc | libFuncChain | caseExpr | inExpr | betweenExpr | likeExpr | regExpExpr | arrayExpr | subSelectInExpr | subSelectRowExpr | subSelectExistsExpr | dotExpr | newExpr | jsonarray[true] | jsonobject[true] )
            int alt220=20;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt220=1;
                }
                break;
            case SUBSTITUTION:
                {
                alt220=2;
                }
                break;
            case CONCAT:
            case STAR:
            case BOR:
            case PLUS:
            case BAND:
            case BXOR:
            case MINUS:
            case DIV:
            case MOD:
                {
                alt220=3;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt220=4;
                }
                break;
            case NOT_EXPR:
            case EVAL_AND_EXPR:
            case EVAL_OR_EXPR:
            case EVAL_EQUALS_EXPR:
            case EVAL_NOTEQUALS_EXPR:
            case EVAL_IS_EXPR:
            case EVAL_ISNOT_EXPR:
            case EVAL_EQUALS_GROUP_EXPR:
            case EVAL_NOTEQUALS_GROUP_EXPR:
            case LT:
            case GT:
            case LE:
            case GE:
            case EVAL_IS_GROUP_EXPR:
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt220=5;
                }
                break;
            case SUM:
            case AVG:
            case COALESCE:
            case MEDIAN:
            case STDDEV:
            case AVEDEV:
            case COUNT:
            case ISTREAM:
            case PREVIOUS:
            case PREVIOUSTAIL:
            case PREVIOUSCOUNT:
            case PREVIOUSWINDOW:
            case PRIOR:
            case EXISTS:
            case INSTANCEOF:
            case TYPEOF:
            case CAST:
            case CURRENT_TIMESTAMP:
            case FIRST_AGGREG:
            case LAST_AGGREG:
            case WINDOW_AGGREG:
                {
                alt220=6;
                }
                break;
            case LIB_FUNC_CHAIN:
                {
                alt220=7;
                }
                break;
            case CASE:
            case CASE2:
                {
                alt220=8;
                }
                break;
            case IN_SET:
            case NOT_IN_SET:
            case IN_RANGE:
            case NOT_IN_RANGE:
                {
                alt220=9;
                }
                break;
            case BETWEEN:
            case NOT_BETWEEN:
                {
                alt220=10;
                }
                break;
            case LIKE:
            case NOT_LIKE:
                {
                alt220=11;
                }
                break;
            case REGEXP:
            case NOT_REGEXP:
                {
                alt220=12;
                }
                break;
            case ARRAY_EXPR:
                {
                alt220=13;
                }
                break;
            case IN_SUBSELECT_EXPR:
            case NOT_IN_SUBSELECT_EXPR:
                {
                alt220=14;
                }
                break;
            case SUBSELECT_EXPR:
                {
                alt220=15;
                }
                break;
            case EXISTS_SUBSELECT_EXPR:
                {
                alt220=16;
                }
                break;
            case DOT_EXPR:
                {
                alt220=17;
                }
                break;
            case NEWKW:
                {
                alt220=18;
                }
                break;
            case JSON_ARRAY:
                {
                alt220=19;
                }
                break;
            case JSON_OBJECT:
                {
                alt220=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 220, 0, input);

                throw nvae;
            }

            switch (alt220) {
                case 1 :
                    // EsperEPL2Ast.g:610:5: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_valueExpr3899);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:611:4: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_valueExpr3905);
                    substitution();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:612:5: arithmeticExpr
                    {
                    pushFollow(FOLLOW_arithmeticExpr_in_valueExpr3911);
                    arithmeticExpr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:613:5: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_valueExpr3918);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:614:7: evalExprChoice
                    {
                    pushFollow(FOLLOW_evalExprChoice_in_valueExpr3927);
                    evalExprChoice();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:615:4: builtinFunc
                    {
                    pushFollow(FOLLOW_builtinFunc_in_valueExpr3932);
                    builtinFunc();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:616:7: libFuncChain
                    {
                    pushFollow(FOLLOW_libFuncChain_in_valueExpr3940);
                    libFuncChain();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:617:4: caseExpr
                    {
                    pushFollow(FOLLOW_caseExpr_in_valueExpr3945);
                    caseExpr();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:618:4: inExpr
                    {
                    pushFollow(FOLLOW_inExpr_in_valueExpr3950);
                    inExpr();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:619:4: betweenExpr
                    {
                    pushFollow(FOLLOW_betweenExpr_in_valueExpr3956);
                    betweenExpr();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:620:4: likeExpr
                    {
                    pushFollow(FOLLOW_likeExpr_in_valueExpr3961);
                    likeExpr();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:621:4: regExpExpr
                    {
                    pushFollow(FOLLOW_regExpExpr_in_valueExpr3966);
                    regExpExpr();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // EsperEPL2Ast.g:622:4: arrayExpr
                    {
                    pushFollow(FOLLOW_arrayExpr_in_valueExpr3971);
                    arrayExpr();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // EsperEPL2Ast.g:623:4: subSelectInExpr
                    {
                    pushFollow(FOLLOW_subSelectInExpr_in_valueExpr3976);
                    subSelectInExpr();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // EsperEPL2Ast.g:624:5: subSelectRowExpr
                    {
                    pushFollow(FOLLOW_subSelectRowExpr_in_valueExpr3982);
                    subSelectRowExpr();

                    state._fsp--;


                    }
                    break;
                case 16 :
                    // EsperEPL2Ast.g:625:5: subSelectExistsExpr
                    {
                    pushFollow(FOLLOW_subSelectExistsExpr_in_valueExpr3989);
                    subSelectExistsExpr();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // EsperEPL2Ast.g:626:4: dotExpr
                    {
                    pushFollow(FOLLOW_dotExpr_in_valueExpr3994);
                    dotExpr();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // EsperEPL2Ast.g:627:4: newExpr
                    {
                    pushFollow(FOLLOW_newExpr_in_valueExpr3999);
                    newExpr();

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // EsperEPL2Ast.g:628:4: jsonarray[true]
                    {
                    pushFollow(FOLLOW_jsonarray_in_valueExpr4004);
                    jsonarray(true);

                    state._fsp--;


                    }
                    break;
                case 20 :
                    // EsperEPL2Ast.g:629:4: jsonobject[true]
                    {
                    pushFollow(FOLLOW_jsonobject_in_valueExpr4010);
                    jsonobject(true);

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "valueExpr"


    // $ANTLR start "valueExprWithTime"
    // EsperEPL2Ast.g:632:1: valueExprWithTime : (l= LAST | lw= LW | valueExpr | ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) ) | rangeOperator | frequencyOperator | lastOperator | weekDayOperator | ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ ) | s= NUMBERSETSTAR | timePeriod );
    public final void valueExprWithTime() throws RecognitionException {
        CommonTree l=null;
        CommonTree lw=null;
        CommonTree ordered=null;
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:633:2: (l= LAST | lw= LW | valueExpr | ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) ) | rangeOperator | frequencyOperator | lastOperator | weekDayOperator | ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ ) | s= NUMBERSETSTAR | timePeriod )
            int alt222=11;
            switch ( input.LA(1) ) {
            case LAST:
                {
                alt222=1;
                }
                break;
            case LW:
                {
                alt222=2;
                }
                break;
            case IN_SET:
            case BETWEEN:
            case LIKE:
            case REGEXP:
            case NOT_EXPR:
            case SUM:
            case AVG:
            case COALESCE:
            case MEDIAN:
            case STDDEV:
            case AVEDEV:
            case COUNT:
            case CASE:
            case CASE2:
            case ISTREAM:
            case PREVIOUS:
            case PREVIOUSTAIL:
            case PREVIOUSCOUNT:
            case PREVIOUSWINDOW:
            case PRIOR:
            case EXISTS:
            case INSTANCEOF:
            case TYPEOF:
            case CAST:
            case CURRENT_TIMESTAMP:
            case NEWKW:
            case EVAL_AND_EXPR:
            case EVAL_OR_EXPR:
            case EVAL_EQUALS_EXPR:
            case EVAL_NOTEQUALS_EXPR:
            case EVAL_IS_EXPR:
            case EVAL_ISNOT_EXPR:
            case EVAL_EQUALS_GROUP_EXPR:
            case EVAL_NOTEQUALS_GROUP_EXPR:
            case EVENT_PROP_EXPR:
            case CONCAT:
            case LIB_FUNC_CHAIN:
            case DOT_EXPR:
            case ARRAY_EXPR:
            case NOT_IN_SET:
            case NOT_BETWEEN:
            case NOT_LIKE:
            case NOT_REGEXP:
            case IN_RANGE:
            case NOT_IN_RANGE:
            case SUBSELECT_EXPR:
            case EXISTS_SUBSELECT_EXPR:
            case IN_SUBSELECT_EXPR:
            case NOT_IN_SUBSELECT_EXPR:
            case SUBSTITUTION:
            case FIRST_AGGREG:
            case LAST_AGGREG:
            case WINDOW_AGGREG:
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
            case JSON_OBJECT:
            case JSON_ARRAY:
            case STAR:
            case LT:
            case GT:
            case BOR:
            case PLUS:
            case BAND:
            case BXOR:
            case LE:
            case GE:
            case MINUS:
            case DIV:
            case MOD:
            case EVAL_IS_GROUP_EXPR:
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt222=3;
                }
                break;
            case OBJECT_PARAM_ORDERED_EXPR:
                {
                alt222=4;
                }
                break;
            case NUMERIC_PARAM_RANGE:
                {
                alt222=5;
                }
                break;
            case NUMERIC_PARAM_FREQUENCY:
                {
                alt222=6;
                }
                break;
            case LAST_OPERATOR:
                {
                alt222=7;
                }
                break;
            case WEEKDAY_OPERATOR:
                {
                alt222=8;
                }
                break;
            case NUMERIC_PARAM_LIST:
                {
                alt222=9;
                }
                break;
            case NUMBERSETSTAR:
                {
                alt222=10;
                }
                break;
            case TIME_PERIOD:
                {
                alt222=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 222, 0, input);

                throw nvae;
            }

            switch (alt222) {
                case 1 :
                    // EsperEPL2Ast.g:633:4: l= LAST
                    {
                    l=(CommonTree)match(input,LAST,FOLLOW_LAST_in_valueExprWithTime4024); 
                     leaveNode(l); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:634:4: lw= LW
                    {
                    lw=(CommonTree)match(input,LW,FOLLOW_LW_in_valueExprWithTime4033); 
                     leaveNode(lw); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:635:4: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_valueExprWithTime4040);
                    valueExpr();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:636:4: ^(ordered= OBJECT_PARAM_ORDERED_EXPR valueExpr ( DESC | ASC ) )
                    {
                    ordered=(CommonTree)match(input,OBJECT_PARAM_ORDERED_EXPR,FOLLOW_OBJECT_PARAM_ORDERED_EXPR_in_valueExprWithTime4048); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_valueExprWithTime4050);
                    valueExpr();

                    state._fsp--;

                    if ( (input.LA(1)>=ASC && input.LA(1)<=DESC) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     leaveNode(ordered); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:637:5: rangeOperator
                    {
                    pushFollow(FOLLOW_rangeOperator_in_valueExprWithTime4065);
                    rangeOperator();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:638:5: frequencyOperator
                    {
                    pushFollow(FOLLOW_frequencyOperator_in_valueExprWithTime4071);
                    frequencyOperator();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:639:4: lastOperator
                    {
                    pushFollow(FOLLOW_lastOperator_in_valueExprWithTime4076);
                    lastOperator();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:640:4: weekDayOperator
                    {
                    pushFollow(FOLLOW_weekDayOperator_in_valueExprWithTime4081);
                    weekDayOperator();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:641:5: ^(l= NUMERIC_PARAM_LIST ( numericParameterList )+ )
                    {
                    l=(CommonTree)match(input,NUMERIC_PARAM_LIST,FOLLOW_NUMERIC_PARAM_LIST_in_valueExprWithTime4091); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:641:29: ( numericParameterList )+
                    int cnt221=0;
                    loop221:
                    do {
                        int alt221=2;
                        int LA221_0 = input.LA(1);

                        if ( (LA221_0==NUMERIC_PARAM_RANGE||LA221_0==NUMERIC_PARAM_FREQUENCY||(LA221_0>=INT_TYPE && LA221_0<=NULL_TYPE)) ) {
                            alt221=1;
                        }


                        switch (alt221) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:641:29: numericParameterList
                    	    {
                    	    pushFollow(FOLLOW_numericParameterList_in_valueExprWithTime4093);
                    	    numericParameterList();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt221 >= 1 ) break loop221;
                                EarlyExitException eee =
                                    new EarlyExitException(221, input);
                                throw eee;
                        }
                        cnt221++;
                    } while (true);

                     leaveNode(l); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:642:4: s= NUMBERSETSTAR
                    {
                    s=(CommonTree)match(input,NUMBERSETSTAR,FOLLOW_NUMBERSETSTAR_in_valueExprWithTime4104); 
                     leaveNode(s); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:643:4: timePeriod
                    {
                    pushFollow(FOLLOW_timePeriod_in_valueExprWithTime4111);
                    timePeriod();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "valueExprWithTime"


    // $ANTLR start "numericParameterList"
    // EsperEPL2Ast.g:646:1: numericParameterList : ( constant[true] | rangeOperator | frequencyOperator );
    public final void numericParameterList() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:647:2: ( constant[true] | rangeOperator | frequencyOperator )
            int alt223=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt223=1;
                }
                break;
            case NUMERIC_PARAM_RANGE:
                {
                alt223=2;
                }
                break;
            case NUMERIC_PARAM_FREQUENCY:
                {
                alt223=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 223, 0, input);

                throw nvae;
            }

            switch (alt223) {
                case 1 :
                    // EsperEPL2Ast.g:647:5: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_numericParameterList4124);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:648:5: rangeOperator
                    {
                    pushFollow(FOLLOW_rangeOperator_in_numericParameterList4131);
                    rangeOperator();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:649:5: frequencyOperator
                    {
                    pushFollow(FOLLOW_frequencyOperator_in_numericParameterList4137);
                    frequencyOperator();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "numericParameterList"


    // $ANTLR start "rangeOperator"
    // EsperEPL2Ast.g:652:1: rangeOperator : ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void rangeOperator() throws RecognitionException {
        CommonTree r=null;

        try {
            // EsperEPL2Ast.g:653:2: ( ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:653:4: ^(r= NUMERIC_PARAM_RANGE ( constant[true] | eventPropertyExpr[true] | substitution ) ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            r=(CommonTree)match(input,NUMERIC_PARAM_RANGE,FOLLOW_NUMERIC_PARAM_RANGE_in_rangeOperator4153); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:653:29: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt224=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt224=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt224=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt224=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 224, 0, input);

                throw nvae;
            }

            switch (alt224) {
                case 1 :
                    // EsperEPL2Ast.g:653:30: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_rangeOperator4156);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:653:45: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_rangeOperator4159);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:653:69: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_rangeOperator4162);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:653:83: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt225=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt225=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt225=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt225=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 225, 0, input);

                throw nvae;
            }

            switch (alt225) {
                case 1 :
                    // EsperEPL2Ast.g:653:84: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_rangeOperator4166);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:653:99: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_rangeOperator4169);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:653:123: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_rangeOperator4172);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(r); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "rangeOperator"


    // $ANTLR start "frequencyOperator"
    // EsperEPL2Ast.g:656:1: frequencyOperator : ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void frequencyOperator() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:657:2: ( ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:657:4: ^(f= NUMERIC_PARAM_FREQUENCY ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            f=(CommonTree)match(input,NUMERIC_PARAM_FREQUENCY,FOLLOW_NUMERIC_PARAM_FREQUENCY_in_frequencyOperator4193); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:657:33: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt226=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt226=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt226=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt226=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 226, 0, input);

                throw nvae;
            }

            switch (alt226) {
                case 1 :
                    // EsperEPL2Ast.g:657:34: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_frequencyOperator4196);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:657:49: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_frequencyOperator4199);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:657:73: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_frequencyOperator4202);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(f); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "frequencyOperator"


    // $ANTLR start "lastOperator"
    // EsperEPL2Ast.g:660:1: lastOperator : ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void lastOperator() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:661:2: ( ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:661:4: ^(l= LAST_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            l=(CommonTree)match(input,LAST_OPERATOR,FOLLOW_LAST_OPERATOR_in_lastOperator4221); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:661:23: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt227=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt227=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt227=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt227=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 227, 0, input);

                throw nvae;
            }

            switch (alt227) {
                case 1 :
                    // EsperEPL2Ast.g:661:24: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_lastOperator4224);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:661:39: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_lastOperator4227);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:661:63: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_lastOperator4230);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(l); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "lastOperator"


    // $ANTLR start "weekDayOperator"
    // EsperEPL2Ast.g:664:1: weekDayOperator : ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) ;
    public final void weekDayOperator() throws RecognitionException {
        CommonTree w=null;

        try {
            // EsperEPL2Ast.g:665:2: ( ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) ) )
            // EsperEPL2Ast.g:665:4: ^(w= WEEKDAY_OPERATOR ( constant[true] | eventPropertyExpr[true] | substitution ) )
            {
            w=(CommonTree)match(input,WEEKDAY_OPERATOR,FOLLOW_WEEKDAY_OPERATOR_in_weekDayOperator4249); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:665:26: ( constant[true] | eventPropertyExpr[true] | substitution )
            int alt228=3;
            switch ( input.LA(1) ) {
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
                {
                alt228=1;
                }
                break;
            case EVENT_PROP_EXPR:
                {
                alt228=2;
                }
                break;
            case SUBSTITUTION:
                {
                alt228=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 228, 0, input);

                throw nvae;
            }

            switch (alt228) {
                case 1 :
                    // EsperEPL2Ast.g:665:27: constant[true]
                    {
                    pushFollow(FOLLOW_constant_in_weekDayOperator4252);
                    constant(true);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:665:42: eventPropertyExpr[true]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_weekDayOperator4255);
                    eventPropertyExpr(true);

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:665:66: substitution
                    {
                    pushFollow(FOLLOW_substitution_in_weekDayOperator4258);
                    substitution();

                    state._fsp--;


                    }
                    break;

            }

             leaveNode(w); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "weekDayOperator"


    // $ANTLR start "subSelectGroupExpr"
    // EsperEPL2Ast.g:668:1: subSelectGroupExpr : ^(s= SUBSELECT_GROUP_EXPR subQueryExpr ) ;
    public final void subSelectGroupExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:669:2: ( ^(s= SUBSELECT_GROUP_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:669:4: ^(s= SUBSELECT_GROUP_EXPR subQueryExpr )
            {
            pushStmtContext();
            s=(CommonTree)match(input,SUBSELECT_GROUP_EXPR,FOLLOW_SUBSELECT_GROUP_EXPR_in_subSelectGroupExpr4279); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectGroupExpr4281);
            subQueryExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectGroupExpr"


    // $ANTLR start "subSelectRowExpr"
    // EsperEPL2Ast.g:672:1: subSelectRowExpr : ^(s= SUBSELECT_EXPR subQueryExpr ) ;
    public final void subSelectRowExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:673:2: ( ^(s= SUBSELECT_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:673:4: ^(s= SUBSELECT_EXPR subQueryExpr )
            {
            pushStmtContext();
            s=(CommonTree)match(input,SUBSELECT_EXPR,FOLLOW_SUBSELECT_EXPR_in_subSelectRowExpr4300); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectRowExpr4302);
            subQueryExpr();

            state._fsp--;


            match(input, Token.UP, null); 
            leaveNode(s);

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectRowExpr"


    // $ANTLR start "subSelectExistsExpr"
    // EsperEPL2Ast.g:676:1: subSelectExistsExpr : ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr ) ;
    public final void subSelectExistsExpr() throws RecognitionException {
        CommonTree e=null;

        try {
            // EsperEPL2Ast.g:677:2: ( ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:677:4: ^(e= EXISTS_SUBSELECT_EXPR subQueryExpr )
            {
            pushStmtContext();
            e=(CommonTree)match(input,EXISTS_SUBSELECT_EXPR,FOLLOW_EXISTS_SUBSELECT_EXPR_in_subSelectExistsExpr4321); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectExistsExpr4323);
            subQueryExpr();

            state._fsp--;


            match(input, Token.UP, null); 
            leaveNode(e);

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectExistsExpr"


    // $ANTLR start "subSelectInExpr"
    // EsperEPL2Ast.g:680:1: subSelectInExpr : ( ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) | ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) );
    public final void subSelectInExpr() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:681:2: ( ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) | ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr ) )
            int alt229=2;
            int LA229_0 = input.LA(1);

            if ( (LA229_0==IN_SUBSELECT_EXPR) ) {
                alt229=1;
            }
            else if ( (LA229_0==NOT_IN_SUBSELECT_EXPR) ) {
                alt229=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 229, 0, input);

                throw nvae;
            }
            switch (alt229) {
                case 1 :
                    // EsperEPL2Ast.g:681:5: ^(s= IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr )
                    {
                    s=(CommonTree)match(input,IN_SUBSELECT_EXPR,FOLLOW_IN_SUBSELECT_EXPR_in_subSelectInExpr4342); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_subSelectInExpr4344);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_subSelectInQueryExpr_in_subSelectInExpr4346);
                    subSelectInQueryExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(s); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:682:5: ^(s= NOT_IN_SUBSELECT_EXPR valueExpr subSelectInQueryExpr )
                    {
                    s=(CommonTree)match(input,NOT_IN_SUBSELECT_EXPR,FOLLOW_NOT_IN_SUBSELECT_EXPR_in_subSelectInExpr4358); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_subSelectInExpr4360);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_subSelectInQueryExpr_in_subSelectInExpr4362);
                    subSelectInQueryExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(s); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectInExpr"


    // $ANTLR start "subSelectInQueryExpr"
    // EsperEPL2Ast.g:685:1: subSelectInQueryExpr : ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr ) ;
    public final void subSelectInQueryExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:686:2: ( ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr ) )
            // EsperEPL2Ast.g:686:4: ^(i= IN_SUBSELECT_QUERY_EXPR subQueryExpr )
            {
            pushStmtContext();
            i=(CommonTree)match(input,IN_SUBSELECT_QUERY_EXPR,FOLLOW_IN_SUBSELECT_QUERY_EXPR_in_subSelectInQueryExpr4381); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subQueryExpr_in_subSelectInQueryExpr4383);
            subQueryExpr();

            state._fsp--;


            match(input, Token.UP, null); 
            leaveNode(i);

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectInQueryExpr"


    // $ANTLR start "subQueryExpr"
    // EsperEPL2Ast.g:689:1: subQueryExpr : ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )? ;
    public final void subQueryExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:690:2: ( ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )? )
            // EsperEPL2Ast.g:690:4: ( DISTINCT )? selectionList subSelectFilterExpr ( whereClause[true] )?
            {
            // EsperEPL2Ast.g:690:4: ( DISTINCT )?
            int alt230=2;
            int LA230_0 = input.LA(1);

            if ( (LA230_0==DISTINCT) ) {
                alt230=1;
            }
            switch (alt230) {
                case 1 :
                    // EsperEPL2Ast.g:690:4: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_subQueryExpr4399); 

                    }
                    break;

            }

            pushFollow(FOLLOW_selectionList_in_subQueryExpr4402);
            selectionList();

            state._fsp--;

            pushFollow(FOLLOW_subSelectFilterExpr_in_subQueryExpr4404);
            subSelectFilterExpr();

            state._fsp--;

            // EsperEPL2Ast.g:690:48: ( whereClause[true] )?
            int alt231=2;
            int LA231_0 = input.LA(1);

            if ( (LA231_0==WHERE_EXPR) ) {
                alt231=1;
            }
            switch (alt231) {
                case 1 :
                    // EsperEPL2Ast.g:690:49: whereClause[true]
                    {
                    pushFollow(FOLLOW_whereClause_in_subQueryExpr4407);
                    whereClause(true);

                    state._fsp--;


                    }
                    break;

            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subQueryExpr"


    // $ANTLR start "subSelectFilterExpr"
    // EsperEPL2Ast.g:693:1: subSelectFilterExpr : ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? ) ;
    public final void subSelectFilterExpr() throws RecognitionException {
        CommonTree v=null;

        try {
            // EsperEPL2Ast.g:694:2: ( ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? ) )
            // EsperEPL2Ast.g:694:4: ^(v= STREAM_EXPR eventFilterExpr[true] ( viewListExpr )? ( IDENT )? ( RETAINUNION )? ( RETAININTERSECTION )? )
            {
            v=(CommonTree)match(input,STREAM_EXPR,FOLLOW_STREAM_EXPR_in_subSelectFilterExpr4425); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventFilterExpr_in_subSelectFilterExpr4427);
            eventFilterExpr(true);

            state._fsp--;

            // EsperEPL2Ast.g:694:42: ( viewListExpr )?
            int alt232=2;
            int LA232_0 = input.LA(1);

            if ( (LA232_0==VIEW_EXPR) ) {
                alt232=1;
            }
            switch (alt232) {
                case 1 :
                    // EsperEPL2Ast.g:694:43: viewListExpr
                    {
                    pushFollow(FOLLOW_viewListExpr_in_subSelectFilterExpr4431);
                    viewListExpr();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:694:58: ( IDENT )?
            int alt233=2;
            int LA233_0 = input.LA(1);

            if ( (LA233_0==IDENT) ) {
                alt233=1;
            }
            switch (alt233) {
                case 1 :
                    // EsperEPL2Ast.g:694:59: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_subSelectFilterExpr4436); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:694:67: ( RETAINUNION )?
            int alt234=2;
            int LA234_0 = input.LA(1);

            if ( (LA234_0==RETAINUNION) ) {
                alt234=1;
            }
            switch (alt234) {
                case 1 :
                    // EsperEPL2Ast.g:694:67: RETAINUNION
                    {
                    match(input,RETAINUNION,FOLLOW_RETAINUNION_in_subSelectFilterExpr4440); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:694:80: ( RETAININTERSECTION )?
            int alt235=2;
            int LA235_0 = input.LA(1);

            if ( (LA235_0==RETAININTERSECTION) ) {
                alt235=1;
            }
            switch (alt235) {
                case 1 :
                    // EsperEPL2Ast.g:694:80: RETAININTERSECTION
                    {
                    match(input,RETAININTERSECTION,FOLLOW_RETAININTERSECTION_in_subSelectFilterExpr4443); 

                    }
                    break;

            }

             leaveNode(v); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "subSelectFilterExpr"


    // $ANTLR start "caseExpr"
    // EsperEPL2Ast.g:697:1: caseExpr : ( ^(c= CASE ( valueExpr )* ) | ^(c= CASE2 ( valueExpr )* ) );
    public final void caseExpr() throws RecognitionException {
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:698:2: ( ^(c= CASE ( valueExpr )* ) | ^(c= CASE2 ( valueExpr )* ) )
            int alt238=2;
            int LA238_0 = input.LA(1);

            if ( (LA238_0==CASE) ) {
                alt238=1;
            }
            else if ( (LA238_0==CASE2) ) {
                alt238=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 238, 0, input);

                throw nvae;
            }
            switch (alt238) {
                case 1 :
                    // EsperEPL2Ast.g:698:4: ^(c= CASE ( valueExpr )* )
                    {
                    c=(CommonTree)match(input,CASE,FOLLOW_CASE_in_caseExpr4463); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:698:13: ( valueExpr )*
                        loop236:
                        do {
                            int alt236=2;
                            int LA236_0 = input.LA(1);

                            if ( ((LA236_0>=IN_SET && LA236_0<=REGEXP)||LA236_0==NOT_EXPR||(LA236_0>=SUM && LA236_0<=AVG)||(LA236_0>=COALESCE && LA236_0<=COUNT)||(LA236_0>=CASE && LA236_0<=CASE2)||LA236_0==ISTREAM||(LA236_0>=PREVIOUS && LA236_0<=EXISTS)||(LA236_0>=INSTANCEOF && LA236_0<=CURRENT_TIMESTAMP)||LA236_0==NEWKW||(LA236_0>=EVAL_AND_EXPR && LA236_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA236_0==EVENT_PROP_EXPR||LA236_0==CONCAT||(LA236_0>=LIB_FUNC_CHAIN && LA236_0<=DOT_EXPR)||LA236_0==ARRAY_EXPR||(LA236_0>=NOT_IN_SET && LA236_0<=NOT_REGEXP)||(LA236_0>=IN_RANGE && LA236_0<=SUBSELECT_EXPR)||(LA236_0>=EXISTS_SUBSELECT_EXPR && LA236_0<=NOT_IN_SUBSELECT_EXPR)||LA236_0==SUBSTITUTION||(LA236_0>=FIRST_AGGREG && LA236_0<=WINDOW_AGGREG)||(LA236_0>=INT_TYPE && LA236_0<=NULL_TYPE)||(LA236_0>=JSON_OBJECT && LA236_0<=JSON_ARRAY)||LA236_0==STAR||(LA236_0>=LT && LA236_0<=GT)||(LA236_0>=BOR && LA236_0<=PLUS)||(LA236_0>=BAND && LA236_0<=BXOR)||(LA236_0>=LE && LA236_0<=GE)||(LA236_0>=MINUS && LA236_0<=MOD)||(LA236_0>=EVAL_IS_GROUP_EXPR && LA236_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                alt236=1;
                            }


                            switch (alt236) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:698:14: valueExpr
                        	    {
                        	    pushFollow(FOLLOW_valueExpr_in_caseExpr4466);
                        	    valueExpr();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop236;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                     leaveNode(c); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:699:4: ^(c= CASE2 ( valueExpr )* )
                    {
                    c=(CommonTree)match(input,CASE2,FOLLOW_CASE2_in_caseExpr4479); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:699:14: ( valueExpr )*
                        loop237:
                        do {
                            int alt237=2;
                            int LA237_0 = input.LA(1);

                            if ( ((LA237_0>=IN_SET && LA237_0<=REGEXP)||LA237_0==NOT_EXPR||(LA237_0>=SUM && LA237_0<=AVG)||(LA237_0>=COALESCE && LA237_0<=COUNT)||(LA237_0>=CASE && LA237_0<=CASE2)||LA237_0==ISTREAM||(LA237_0>=PREVIOUS && LA237_0<=EXISTS)||(LA237_0>=INSTANCEOF && LA237_0<=CURRENT_TIMESTAMP)||LA237_0==NEWKW||(LA237_0>=EVAL_AND_EXPR && LA237_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA237_0==EVENT_PROP_EXPR||LA237_0==CONCAT||(LA237_0>=LIB_FUNC_CHAIN && LA237_0<=DOT_EXPR)||LA237_0==ARRAY_EXPR||(LA237_0>=NOT_IN_SET && LA237_0<=NOT_REGEXP)||(LA237_0>=IN_RANGE && LA237_0<=SUBSELECT_EXPR)||(LA237_0>=EXISTS_SUBSELECT_EXPR && LA237_0<=NOT_IN_SUBSELECT_EXPR)||LA237_0==SUBSTITUTION||(LA237_0>=FIRST_AGGREG && LA237_0<=WINDOW_AGGREG)||(LA237_0>=INT_TYPE && LA237_0<=NULL_TYPE)||(LA237_0>=JSON_OBJECT && LA237_0<=JSON_ARRAY)||LA237_0==STAR||(LA237_0>=LT && LA237_0<=GT)||(LA237_0>=BOR && LA237_0<=PLUS)||(LA237_0>=BAND && LA237_0<=BXOR)||(LA237_0>=LE && LA237_0<=GE)||(LA237_0>=MINUS && LA237_0<=MOD)||(LA237_0>=EVAL_IS_GROUP_EXPR && LA237_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                alt237=1;
                            }


                            switch (alt237) {
                        	case 1 :
                        	    // EsperEPL2Ast.g:699:15: valueExpr
                        	    {
                        	    pushFollow(FOLLOW_valueExpr_in_caseExpr4482);
                        	    valueExpr();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop237;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                     leaveNode(c); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "caseExpr"


    // $ANTLR start "inExpr"
    // EsperEPL2Ast.g:702:1: inExpr : ( ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) );
    public final void inExpr() throws RecognitionException {
        CommonTree i=null;

        try {
            // EsperEPL2Ast.g:703:2: ( ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) ) | ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) | ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) ) )
            int alt241=4;
            switch ( input.LA(1) ) {
            case IN_SET:
                {
                alt241=1;
                }
                break;
            case NOT_IN_SET:
                {
                alt241=2;
                }
                break;
            case IN_RANGE:
                {
                alt241=3;
                }
                break;
            case NOT_IN_RANGE:
                {
                alt241=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 241, 0, input);

                throw nvae;
            }

            switch (alt241) {
                case 1 :
                    // EsperEPL2Ast.g:703:4: ^(i= IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,IN_SET,FOLLOW_IN_SET_in_inExpr4502); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4504);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr4512);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:703:51: ( valueExpr )*
                    loop239:
                    do {
                        int alt239=2;
                        int LA239_0 = input.LA(1);

                        if ( ((LA239_0>=IN_SET && LA239_0<=REGEXP)||LA239_0==NOT_EXPR||(LA239_0>=SUM && LA239_0<=AVG)||(LA239_0>=COALESCE && LA239_0<=COUNT)||(LA239_0>=CASE && LA239_0<=CASE2)||LA239_0==ISTREAM||(LA239_0>=PREVIOUS && LA239_0<=EXISTS)||(LA239_0>=INSTANCEOF && LA239_0<=CURRENT_TIMESTAMP)||LA239_0==NEWKW||(LA239_0>=EVAL_AND_EXPR && LA239_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA239_0==EVENT_PROP_EXPR||LA239_0==CONCAT||(LA239_0>=LIB_FUNC_CHAIN && LA239_0<=DOT_EXPR)||LA239_0==ARRAY_EXPR||(LA239_0>=NOT_IN_SET && LA239_0<=NOT_REGEXP)||(LA239_0>=IN_RANGE && LA239_0<=SUBSELECT_EXPR)||(LA239_0>=EXISTS_SUBSELECT_EXPR && LA239_0<=NOT_IN_SUBSELECT_EXPR)||LA239_0==SUBSTITUTION||(LA239_0>=FIRST_AGGREG && LA239_0<=WINDOW_AGGREG)||(LA239_0>=INT_TYPE && LA239_0<=NULL_TYPE)||(LA239_0>=JSON_OBJECT && LA239_0<=JSON_ARRAY)||LA239_0==STAR||(LA239_0>=LT && LA239_0<=GT)||(LA239_0>=BOR && LA239_0<=PLUS)||(LA239_0>=BAND && LA239_0<=BXOR)||(LA239_0>=LE && LA239_0<=GE)||(LA239_0>=MINUS && LA239_0<=MOD)||(LA239_0>=EVAL_IS_GROUP_EXPR && LA239_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt239=1;
                        }


                        switch (alt239) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:703:52: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_inExpr4515);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop239;
                        }
                    } while (true);

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 
                     leaveNode(i); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:704:4: ^(i= NOT_IN_SET valueExpr ( LPAREN | LBRACK ) valueExpr ( valueExpr )* ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,NOT_IN_SET,FOLLOW_NOT_IN_SET_in_inExpr4534); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4536);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr4544);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:704:55: ( valueExpr )*
                    loop240:
                    do {
                        int alt240=2;
                        int LA240_0 = input.LA(1);

                        if ( ((LA240_0>=IN_SET && LA240_0<=REGEXP)||LA240_0==NOT_EXPR||(LA240_0>=SUM && LA240_0<=AVG)||(LA240_0>=COALESCE && LA240_0<=COUNT)||(LA240_0>=CASE && LA240_0<=CASE2)||LA240_0==ISTREAM||(LA240_0>=PREVIOUS && LA240_0<=EXISTS)||(LA240_0>=INSTANCEOF && LA240_0<=CURRENT_TIMESTAMP)||LA240_0==NEWKW||(LA240_0>=EVAL_AND_EXPR && LA240_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA240_0==EVENT_PROP_EXPR||LA240_0==CONCAT||(LA240_0>=LIB_FUNC_CHAIN && LA240_0<=DOT_EXPR)||LA240_0==ARRAY_EXPR||(LA240_0>=NOT_IN_SET && LA240_0<=NOT_REGEXP)||(LA240_0>=IN_RANGE && LA240_0<=SUBSELECT_EXPR)||(LA240_0>=EXISTS_SUBSELECT_EXPR && LA240_0<=NOT_IN_SUBSELECT_EXPR)||LA240_0==SUBSTITUTION||(LA240_0>=FIRST_AGGREG && LA240_0<=WINDOW_AGGREG)||(LA240_0>=INT_TYPE && LA240_0<=NULL_TYPE)||(LA240_0>=JSON_OBJECT && LA240_0<=JSON_ARRAY)||LA240_0==STAR||(LA240_0>=LT && LA240_0<=GT)||(LA240_0>=BOR && LA240_0<=PLUS)||(LA240_0>=BAND && LA240_0<=BXOR)||(LA240_0>=LE && LA240_0<=GE)||(LA240_0>=MINUS && LA240_0<=MOD)||(LA240_0>=EVAL_IS_GROUP_EXPR && LA240_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt240=1;
                        }


                        switch (alt240) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:704:56: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_inExpr4547);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop240;
                        }
                    } while (true);

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 
                     leaveNode(i); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:705:4: ^(i= IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,IN_RANGE,FOLLOW_IN_RANGE_in_inExpr4566); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4568);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr4576);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_inExpr4578);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 
                     leaveNode(i); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:706:4: ^(i= NOT_IN_RANGE valueExpr ( LPAREN | LBRACK ) valueExpr valueExpr ( RPAREN | RBRACK ) )
                    {
                    i=(CommonTree)match(input,NOT_IN_RANGE,FOLLOW_NOT_IN_RANGE_in_inExpr4595); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_inExpr4597);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_valueExpr_in_inExpr4605);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_inExpr4607);
                    valueExpr();

                    state._fsp--;

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 
                     leaveNode(i); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "inExpr"


    // $ANTLR start "betweenExpr"
    // EsperEPL2Ast.g:709:1: betweenExpr : ( ^(b= BETWEEN valueExpr valueExpr valueExpr ) | ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* ) );
    public final void betweenExpr() throws RecognitionException {
        CommonTree b=null;

        try {
            // EsperEPL2Ast.g:710:2: ( ^(b= BETWEEN valueExpr valueExpr valueExpr ) | ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* ) )
            int alt243=2;
            int LA243_0 = input.LA(1);

            if ( (LA243_0==BETWEEN) ) {
                alt243=1;
            }
            else if ( (LA243_0==NOT_BETWEEN) ) {
                alt243=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 243, 0, input);

                throw nvae;
            }
            switch (alt243) {
                case 1 :
                    // EsperEPL2Ast.g:710:4: ^(b= BETWEEN valueExpr valueExpr valueExpr )
                    {
                    b=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_betweenExpr4632); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4634);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4636);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4638);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(b); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:711:4: ^(b= NOT_BETWEEN valueExpr valueExpr ( valueExpr )* )
                    {
                    b=(CommonTree)match(input,NOT_BETWEEN,FOLLOW_NOT_BETWEEN_in_betweenExpr4649); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4651);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_betweenExpr4653);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:711:40: ( valueExpr )*
                    loop242:
                    do {
                        int alt242=2;
                        int LA242_0 = input.LA(1);

                        if ( ((LA242_0>=IN_SET && LA242_0<=REGEXP)||LA242_0==NOT_EXPR||(LA242_0>=SUM && LA242_0<=AVG)||(LA242_0>=COALESCE && LA242_0<=COUNT)||(LA242_0>=CASE && LA242_0<=CASE2)||LA242_0==ISTREAM||(LA242_0>=PREVIOUS && LA242_0<=EXISTS)||(LA242_0>=INSTANCEOF && LA242_0<=CURRENT_TIMESTAMP)||LA242_0==NEWKW||(LA242_0>=EVAL_AND_EXPR && LA242_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA242_0==EVENT_PROP_EXPR||LA242_0==CONCAT||(LA242_0>=LIB_FUNC_CHAIN && LA242_0<=DOT_EXPR)||LA242_0==ARRAY_EXPR||(LA242_0>=NOT_IN_SET && LA242_0<=NOT_REGEXP)||(LA242_0>=IN_RANGE && LA242_0<=SUBSELECT_EXPR)||(LA242_0>=EXISTS_SUBSELECT_EXPR && LA242_0<=NOT_IN_SUBSELECT_EXPR)||LA242_0==SUBSTITUTION||(LA242_0>=FIRST_AGGREG && LA242_0<=WINDOW_AGGREG)||(LA242_0>=INT_TYPE && LA242_0<=NULL_TYPE)||(LA242_0>=JSON_OBJECT && LA242_0<=JSON_ARRAY)||LA242_0==STAR||(LA242_0>=LT && LA242_0<=GT)||(LA242_0>=BOR && LA242_0<=PLUS)||(LA242_0>=BAND && LA242_0<=BXOR)||(LA242_0>=LE && LA242_0<=GE)||(LA242_0>=MINUS && LA242_0<=MOD)||(LA242_0>=EVAL_IS_GROUP_EXPR && LA242_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt242=1;
                        }


                        switch (alt242) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:711:41: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_betweenExpr4656);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop242;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(b); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "betweenExpr"


    // $ANTLR start "likeExpr"
    // EsperEPL2Ast.g:714:1: likeExpr : ( ^(l= LIKE valueExpr valueExpr ( valueExpr )? ) | ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? ) );
    public final void likeExpr() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:715:2: ( ^(l= LIKE valueExpr valueExpr ( valueExpr )? ) | ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? ) )
            int alt246=2;
            int LA246_0 = input.LA(1);

            if ( (LA246_0==LIKE) ) {
                alt246=1;
            }
            else if ( (LA246_0==NOT_LIKE) ) {
                alt246=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 246, 0, input);

                throw nvae;
            }
            switch (alt246) {
                case 1 :
                    // EsperEPL2Ast.g:715:4: ^(l= LIKE valueExpr valueExpr ( valueExpr )? )
                    {
                    l=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_likeExpr4676); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_likeExpr4678);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_likeExpr4680);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:715:33: ( valueExpr )?
                    int alt244=2;
                    int LA244_0 = input.LA(1);

                    if ( ((LA244_0>=IN_SET && LA244_0<=REGEXP)||LA244_0==NOT_EXPR||(LA244_0>=SUM && LA244_0<=AVG)||(LA244_0>=COALESCE && LA244_0<=COUNT)||(LA244_0>=CASE && LA244_0<=CASE2)||LA244_0==ISTREAM||(LA244_0>=PREVIOUS && LA244_0<=EXISTS)||(LA244_0>=INSTANCEOF && LA244_0<=CURRENT_TIMESTAMP)||LA244_0==NEWKW||(LA244_0>=EVAL_AND_EXPR && LA244_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA244_0==EVENT_PROP_EXPR||LA244_0==CONCAT||(LA244_0>=LIB_FUNC_CHAIN && LA244_0<=DOT_EXPR)||LA244_0==ARRAY_EXPR||(LA244_0>=NOT_IN_SET && LA244_0<=NOT_REGEXP)||(LA244_0>=IN_RANGE && LA244_0<=SUBSELECT_EXPR)||(LA244_0>=EXISTS_SUBSELECT_EXPR && LA244_0<=NOT_IN_SUBSELECT_EXPR)||LA244_0==SUBSTITUTION||(LA244_0>=FIRST_AGGREG && LA244_0<=WINDOW_AGGREG)||(LA244_0>=INT_TYPE && LA244_0<=NULL_TYPE)||(LA244_0>=JSON_OBJECT && LA244_0<=JSON_ARRAY)||LA244_0==STAR||(LA244_0>=LT && LA244_0<=GT)||(LA244_0>=BOR && LA244_0<=PLUS)||(LA244_0>=BAND && LA244_0<=BXOR)||(LA244_0>=LE && LA244_0<=GE)||(LA244_0>=MINUS && LA244_0<=MOD)||(LA244_0>=EVAL_IS_GROUP_EXPR && LA244_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt244=1;
                    }
                    switch (alt244) {
                        case 1 :
                            // EsperEPL2Ast.g:715:34: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_likeExpr4683);
                            valueExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(l); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:716:4: ^(l= NOT_LIKE valueExpr valueExpr ( valueExpr )? )
                    {
                    l=(CommonTree)match(input,NOT_LIKE,FOLLOW_NOT_LIKE_in_likeExpr4696); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_likeExpr4698);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_likeExpr4700);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:716:37: ( valueExpr )?
                    int alt245=2;
                    int LA245_0 = input.LA(1);

                    if ( ((LA245_0>=IN_SET && LA245_0<=REGEXP)||LA245_0==NOT_EXPR||(LA245_0>=SUM && LA245_0<=AVG)||(LA245_0>=COALESCE && LA245_0<=COUNT)||(LA245_0>=CASE && LA245_0<=CASE2)||LA245_0==ISTREAM||(LA245_0>=PREVIOUS && LA245_0<=EXISTS)||(LA245_0>=INSTANCEOF && LA245_0<=CURRENT_TIMESTAMP)||LA245_0==NEWKW||(LA245_0>=EVAL_AND_EXPR && LA245_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA245_0==EVENT_PROP_EXPR||LA245_0==CONCAT||(LA245_0>=LIB_FUNC_CHAIN && LA245_0<=DOT_EXPR)||LA245_0==ARRAY_EXPR||(LA245_0>=NOT_IN_SET && LA245_0<=NOT_REGEXP)||(LA245_0>=IN_RANGE && LA245_0<=SUBSELECT_EXPR)||(LA245_0>=EXISTS_SUBSELECT_EXPR && LA245_0<=NOT_IN_SUBSELECT_EXPR)||LA245_0==SUBSTITUTION||(LA245_0>=FIRST_AGGREG && LA245_0<=WINDOW_AGGREG)||(LA245_0>=INT_TYPE && LA245_0<=NULL_TYPE)||(LA245_0>=JSON_OBJECT && LA245_0<=JSON_ARRAY)||LA245_0==STAR||(LA245_0>=LT && LA245_0<=GT)||(LA245_0>=BOR && LA245_0<=PLUS)||(LA245_0>=BAND && LA245_0<=BXOR)||(LA245_0>=LE && LA245_0<=GE)||(LA245_0>=MINUS && LA245_0<=MOD)||(LA245_0>=EVAL_IS_GROUP_EXPR && LA245_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt245=1;
                    }
                    switch (alt245) {
                        case 1 :
                            // EsperEPL2Ast.g:716:38: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_likeExpr4703);
                            valueExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(l); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "likeExpr"


    // $ANTLR start "regExpExpr"
    // EsperEPL2Ast.g:719:1: regExpExpr : ( ^(r= REGEXP valueExpr valueExpr ) | ^(r= NOT_REGEXP valueExpr valueExpr ) );
    public final void regExpExpr() throws RecognitionException {
        CommonTree r=null;

        try {
            // EsperEPL2Ast.g:720:2: ( ^(r= REGEXP valueExpr valueExpr ) | ^(r= NOT_REGEXP valueExpr valueExpr ) )
            int alt247=2;
            int LA247_0 = input.LA(1);

            if ( (LA247_0==REGEXP) ) {
                alt247=1;
            }
            else if ( (LA247_0==NOT_REGEXP) ) {
                alt247=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 247, 0, input);

                throw nvae;
            }
            switch (alt247) {
                case 1 :
                    // EsperEPL2Ast.g:720:4: ^(r= REGEXP valueExpr valueExpr )
                    {
                    r=(CommonTree)match(input,REGEXP,FOLLOW_REGEXP_in_regExpExpr4722); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4724);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4726);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(r); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:721:4: ^(r= NOT_REGEXP valueExpr valueExpr )
                    {
                    r=(CommonTree)match(input,NOT_REGEXP,FOLLOW_NOT_REGEXP_in_regExpExpr4737); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4739);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_regExpExpr4741);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(r); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "regExpExpr"


    // $ANTLR start "builtinFunc"
    // EsperEPL2Ast.g:724:1: builtinFunc : ( ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? ) | ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? ) | ^(f= COALESCE valueExpr valueExpr ( valueExpr )* ) | ^(f= PREVIOUS valueExpr ( valueExpr )? ) | ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? ) | ^(f= PREVIOUSCOUNT valueExpr ) | ^(f= PREVIOUSWINDOW valueExpr ) | ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] ) | ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* ) | ^(f= TYPEOF valueExpr ) | ^(f= CAST valueExpr CLASS_IDENT ) | ^(f= EXISTS eventPropertyExpr[true] ) | ^(f= CURRENT_TIMESTAMP ) | ^(f= ISTREAM ) );
    public final void builtinFunc() throws RecognitionException {
        CommonTree f=null;
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:725:2: ( ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? ) | ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? ) | ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? ) | ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? ) | ^(f= COALESCE valueExpr valueExpr ( valueExpr )* ) | ^(f= PREVIOUS valueExpr ( valueExpr )? ) | ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? ) | ^(f= PREVIOUSCOUNT valueExpr ) | ^(f= PREVIOUSWINDOW valueExpr ) | ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] ) | ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* ) | ^(f= TYPEOF valueExpr ) | ^(f= CAST valueExpr CLASS_IDENT ) | ^(f= EXISTS eventPropertyExpr[true] ) | ^(f= CURRENT_TIMESTAMP ) | ^(f= ISTREAM ) )
            int alt273=21;
            switch ( input.LA(1) ) {
            case SUM:
                {
                alt273=1;
                }
                break;
            case AVG:
                {
                alt273=2;
                }
                break;
            case COUNT:
                {
                alt273=3;
                }
                break;
            case MEDIAN:
                {
                alt273=4;
                }
                break;
            case STDDEV:
                {
                alt273=5;
                }
                break;
            case AVEDEV:
                {
                alt273=6;
                }
                break;
            case LAST_AGGREG:
                {
                alt273=7;
                }
                break;
            case FIRST_AGGREG:
                {
                alt273=8;
                }
                break;
            case WINDOW_AGGREG:
                {
                alt273=9;
                }
                break;
            case COALESCE:
                {
                alt273=10;
                }
                break;
            case PREVIOUS:
                {
                alt273=11;
                }
                break;
            case PREVIOUSTAIL:
                {
                alt273=12;
                }
                break;
            case PREVIOUSCOUNT:
                {
                alt273=13;
                }
                break;
            case PREVIOUSWINDOW:
                {
                alt273=14;
                }
                break;
            case PRIOR:
                {
                alt273=15;
                }
                break;
            case INSTANCEOF:
                {
                alt273=16;
                }
                break;
            case TYPEOF:
                {
                alt273=17;
                }
                break;
            case CAST:
                {
                alt273=18;
                }
                break;
            case EXISTS:
                {
                alt273=19;
                }
                break;
            case CURRENT_TIMESTAMP:
                {
                alt273=20;
                }
                break;
            case ISTREAM:
                {
                alt273=21;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 273, 0, input);

                throw nvae;
            }

            switch (alt273) {
                case 1 :
                    // EsperEPL2Ast.g:725:5: ^(f= SUM ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,SUM,FOLLOW_SUM_in_builtinFunc4760); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:725:13: ( DISTINCT )?
                    int alt248=2;
                    int LA248_0 = input.LA(1);

                    if ( (LA248_0==DISTINCT) ) {
                        alt248=1;
                    }
                    switch (alt248) {
                        case 1 :
                            // EsperEPL2Ast.g:725:14: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4763); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4767);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:725:35: ( aggregationFilterExpr )?
                    int alt249=2;
                    int LA249_0 = input.LA(1);

                    if ( (LA249_0==AGG_FILTER_EXPR) ) {
                        alt249=1;
                    }
                    switch (alt249) {
                        case 1 :
                            // EsperEPL2Ast.g:725:35: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4769);
                            aggregationFilterExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:726:4: ^(f= AVG ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,AVG,FOLLOW_AVG_in_builtinFunc4781); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:726:12: ( DISTINCT )?
                    int alt250=2;
                    int LA250_0 = input.LA(1);

                    if ( (LA250_0==DISTINCT) ) {
                        alt250=1;
                    }
                    switch (alt250) {
                        case 1 :
                            // EsperEPL2Ast.g:726:13: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4784); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4788);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:726:34: ( aggregationFilterExpr )?
                    int alt251=2;
                    int LA251_0 = input.LA(1);

                    if ( (LA251_0==AGG_FILTER_EXPR) ) {
                        alt251=1;
                    }
                    switch (alt251) {
                        case 1 :
                            // EsperEPL2Ast.g:726:34: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4790);
                            aggregationFilterExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:727:4: ^(f= COUNT ( ( DISTINCT )? valueExpr )? ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,COUNT,FOLLOW_COUNT_in_builtinFunc4802); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:727:14: ( ( DISTINCT )? valueExpr )?
                        int alt253=2;
                        int LA253_0 = input.LA(1);

                        if ( ((LA253_0>=IN_SET && LA253_0<=REGEXP)||LA253_0==NOT_EXPR||(LA253_0>=SUM && LA253_0<=AVG)||(LA253_0>=COALESCE && LA253_0<=COUNT)||(LA253_0>=CASE && LA253_0<=CASE2)||LA253_0==DISTINCT||LA253_0==ISTREAM||(LA253_0>=PREVIOUS && LA253_0<=EXISTS)||(LA253_0>=INSTANCEOF && LA253_0<=CURRENT_TIMESTAMP)||LA253_0==NEWKW||(LA253_0>=EVAL_AND_EXPR && LA253_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA253_0==EVENT_PROP_EXPR||LA253_0==CONCAT||(LA253_0>=LIB_FUNC_CHAIN && LA253_0<=DOT_EXPR)||LA253_0==ARRAY_EXPR||(LA253_0>=NOT_IN_SET && LA253_0<=NOT_REGEXP)||(LA253_0>=IN_RANGE && LA253_0<=SUBSELECT_EXPR)||(LA253_0>=EXISTS_SUBSELECT_EXPR && LA253_0<=NOT_IN_SUBSELECT_EXPR)||LA253_0==SUBSTITUTION||(LA253_0>=FIRST_AGGREG && LA253_0<=WINDOW_AGGREG)||(LA253_0>=INT_TYPE && LA253_0<=NULL_TYPE)||(LA253_0>=JSON_OBJECT && LA253_0<=JSON_ARRAY)||LA253_0==STAR||(LA253_0>=LT && LA253_0<=GT)||(LA253_0>=BOR && LA253_0<=PLUS)||(LA253_0>=BAND && LA253_0<=BXOR)||(LA253_0>=LE && LA253_0<=GE)||(LA253_0>=MINUS && LA253_0<=MOD)||(LA253_0>=EVAL_IS_GROUP_EXPR && LA253_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt253=1;
                        }
                        switch (alt253) {
                            case 1 :
                                // EsperEPL2Ast.g:727:15: ( DISTINCT )? valueExpr
                                {
                                // EsperEPL2Ast.g:727:15: ( DISTINCT )?
                                int alt252=2;
                                int LA252_0 = input.LA(1);

                                if ( (LA252_0==DISTINCT) ) {
                                    alt252=1;
                                }
                                switch (alt252) {
                                    case 1 :
                                        // EsperEPL2Ast.g:727:16: DISTINCT
                                        {
                                        match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4806); 

                                        }
                                        break;

                                }

                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4810);
                                valueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:727:39: ( aggregationFilterExpr )?
                        int alt254=2;
                        int LA254_0 = input.LA(1);

                        if ( (LA254_0==AGG_FILTER_EXPR) ) {
                            alt254=1;
                        }
                        switch (alt254) {
                            case 1 :
                                // EsperEPL2Ast.g:727:39: aggregationFilterExpr
                                {
                                pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4814);
                                aggregationFilterExpr();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                     leaveNode(f); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:728:4: ^(f= MEDIAN ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,MEDIAN,FOLLOW_MEDIAN_in_builtinFunc4826); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:728:15: ( DISTINCT )?
                    int alt255=2;
                    int LA255_0 = input.LA(1);

                    if ( (LA255_0==DISTINCT) ) {
                        alt255=1;
                    }
                    switch (alt255) {
                        case 1 :
                            // EsperEPL2Ast.g:728:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4829); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4833);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:728:37: ( aggregationFilterExpr )?
                    int alt256=2;
                    int LA256_0 = input.LA(1);

                    if ( (LA256_0==AGG_FILTER_EXPR) ) {
                        alt256=1;
                    }
                    switch (alt256) {
                        case 1 :
                            // EsperEPL2Ast.g:728:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4835);
                            aggregationFilterExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:729:4: ^(f= STDDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,STDDEV,FOLLOW_STDDEV_in_builtinFunc4847); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:729:15: ( DISTINCT )?
                    int alt257=2;
                    int LA257_0 = input.LA(1);

                    if ( (LA257_0==DISTINCT) ) {
                        alt257=1;
                    }
                    switch (alt257) {
                        case 1 :
                            // EsperEPL2Ast.g:729:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4850); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4854);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:729:37: ( aggregationFilterExpr )?
                    int alt258=2;
                    int LA258_0 = input.LA(1);

                    if ( (LA258_0==AGG_FILTER_EXPR) ) {
                        alt258=1;
                    }
                    switch (alt258) {
                        case 1 :
                            // EsperEPL2Ast.g:729:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4856);
                            aggregationFilterExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:730:4: ^(f= AVEDEV ( DISTINCT )? valueExpr ( aggregationFilterExpr )? )
                    {
                    f=(CommonTree)match(input,AVEDEV,FOLLOW_AVEDEV_in_builtinFunc4868); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:730:15: ( DISTINCT )?
                    int alt259=2;
                    int LA259_0 = input.LA(1);

                    if ( (LA259_0==DISTINCT) ) {
                        alt259=1;
                    }
                    switch (alt259) {
                        case 1 :
                            // EsperEPL2Ast.g:730:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4871); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4875);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:730:37: ( aggregationFilterExpr )?
                    int alt260=2;
                    int LA260_0 = input.LA(1);

                    if ( (LA260_0==AGG_FILTER_EXPR) ) {
                        alt260=1;
                    }
                    switch (alt260) {
                        case 1 :
                            // EsperEPL2Ast.g:730:37: aggregationFilterExpr
                            {
                            pushFollow(FOLLOW_aggregationFilterExpr_in_builtinFunc4877);
                            aggregationFilterExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:731:4: ^(f= LAST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,LAST_AGGREG,FOLLOW_LAST_AGGREG_in_builtinFunc4889); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:731:20: ( DISTINCT )?
                        int alt261=2;
                        int LA261_0 = input.LA(1);

                        if ( (LA261_0==DISTINCT) ) {
                            alt261=1;
                        }
                        switch (alt261) {
                            case 1 :
                                // EsperEPL2Ast.g:731:21: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4892); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:731:32: ( accessValueExpr )?
                        int alt262=2;
                        int LA262_0 = input.LA(1);

                        if ( (LA262_0==ACCESS_AGG) ) {
                            alt262=1;
                        }
                        switch (alt262) {
                            case 1 :
                                // EsperEPL2Ast.g:731:32: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4896);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:731:49: ( valueExpr )?
                        int alt263=2;
                        int LA263_0 = input.LA(1);

                        if ( ((LA263_0>=IN_SET && LA263_0<=REGEXP)||LA263_0==NOT_EXPR||(LA263_0>=SUM && LA263_0<=AVG)||(LA263_0>=COALESCE && LA263_0<=COUNT)||(LA263_0>=CASE && LA263_0<=CASE2)||LA263_0==ISTREAM||(LA263_0>=PREVIOUS && LA263_0<=EXISTS)||(LA263_0>=INSTANCEOF && LA263_0<=CURRENT_TIMESTAMP)||LA263_0==NEWKW||(LA263_0>=EVAL_AND_EXPR && LA263_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA263_0==EVENT_PROP_EXPR||LA263_0==CONCAT||(LA263_0>=LIB_FUNC_CHAIN && LA263_0<=DOT_EXPR)||LA263_0==ARRAY_EXPR||(LA263_0>=NOT_IN_SET && LA263_0<=NOT_REGEXP)||(LA263_0>=IN_RANGE && LA263_0<=SUBSELECT_EXPR)||(LA263_0>=EXISTS_SUBSELECT_EXPR && LA263_0<=NOT_IN_SUBSELECT_EXPR)||LA263_0==SUBSTITUTION||(LA263_0>=FIRST_AGGREG && LA263_0<=WINDOW_AGGREG)||(LA263_0>=INT_TYPE && LA263_0<=NULL_TYPE)||(LA263_0>=JSON_OBJECT && LA263_0<=JSON_ARRAY)||LA263_0==STAR||(LA263_0>=LT && LA263_0<=GT)||(LA263_0>=BOR && LA263_0<=PLUS)||(LA263_0>=BAND && LA263_0<=BXOR)||(LA263_0>=LE && LA263_0<=GE)||(LA263_0>=MINUS && LA263_0<=MOD)||(LA263_0>=EVAL_IS_GROUP_EXPR && LA263_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt263=1;
                        }
                        switch (alt263) {
                            case 1 :
                                // EsperEPL2Ast.g:731:49: valueExpr
                                {
                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4899);
                                valueExpr();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                     leaveNode(f); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:732:4: ^(f= FIRST_AGGREG ( DISTINCT )? ( accessValueExpr )? ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,FIRST_AGGREG,FOLLOW_FIRST_AGGREG_in_builtinFunc4911); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:732:21: ( DISTINCT )?
                        int alt264=2;
                        int LA264_0 = input.LA(1);

                        if ( (LA264_0==DISTINCT) ) {
                            alt264=1;
                        }
                        switch (alt264) {
                            case 1 :
                                // EsperEPL2Ast.g:732:22: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4914); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:732:33: ( accessValueExpr )?
                        int alt265=2;
                        int LA265_0 = input.LA(1);

                        if ( (LA265_0==ACCESS_AGG) ) {
                            alt265=1;
                        }
                        switch (alt265) {
                            case 1 :
                                // EsperEPL2Ast.g:732:33: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4918);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }

                        // EsperEPL2Ast.g:732:50: ( valueExpr )?
                        int alt266=2;
                        int LA266_0 = input.LA(1);

                        if ( ((LA266_0>=IN_SET && LA266_0<=REGEXP)||LA266_0==NOT_EXPR||(LA266_0>=SUM && LA266_0<=AVG)||(LA266_0>=COALESCE && LA266_0<=COUNT)||(LA266_0>=CASE && LA266_0<=CASE2)||LA266_0==ISTREAM||(LA266_0>=PREVIOUS && LA266_0<=EXISTS)||(LA266_0>=INSTANCEOF && LA266_0<=CURRENT_TIMESTAMP)||LA266_0==NEWKW||(LA266_0>=EVAL_AND_EXPR && LA266_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA266_0==EVENT_PROP_EXPR||LA266_0==CONCAT||(LA266_0>=LIB_FUNC_CHAIN && LA266_0<=DOT_EXPR)||LA266_0==ARRAY_EXPR||(LA266_0>=NOT_IN_SET && LA266_0<=NOT_REGEXP)||(LA266_0>=IN_RANGE && LA266_0<=SUBSELECT_EXPR)||(LA266_0>=EXISTS_SUBSELECT_EXPR && LA266_0<=NOT_IN_SUBSELECT_EXPR)||LA266_0==SUBSTITUTION||(LA266_0>=FIRST_AGGREG && LA266_0<=WINDOW_AGGREG)||(LA266_0>=INT_TYPE && LA266_0<=NULL_TYPE)||(LA266_0>=JSON_OBJECT && LA266_0<=JSON_ARRAY)||LA266_0==STAR||(LA266_0>=LT && LA266_0<=GT)||(LA266_0>=BOR && LA266_0<=PLUS)||(LA266_0>=BAND && LA266_0<=BXOR)||(LA266_0>=LE && LA266_0<=GE)||(LA266_0>=MINUS && LA266_0<=MOD)||(LA266_0>=EVAL_IS_GROUP_EXPR && LA266_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt266=1;
                        }
                        switch (alt266) {
                            case 1 :
                                // EsperEPL2Ast.g:732:50: valueExpr
                                {
                                pushFollow(FOLLOW_valueExpr_in_builtinFunc4921);
                                valueExpr();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                     leaveNode(f); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:733:4: ^(f= WINDOW_AGGREG ( DISTINCT )? ( accessValueExpr )? )
                    {
                    f=(CommonTree)match(input,WINDOW_AGGREG,FOLLOW_WINDOW_AGGREG_in_builtinFunc4933); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // EsperEPL2Ast.g:733:22: ( DISTINCT )?
                        int alt267=2;
                        int LA267_0 = input.LA(1);

                        if ( (LA267_0==DISTINCT) ) {
                            alt267=1;
                        }
                        switch (alt267) {
                            case 1 :
                                // EsperEPL2Ast.g:733:23: DISTINCT
                                {
                                match(input,DISTINCT,FOLLOW_DISTINCT_in_builtinFunc4936); 

                                }
                                break;

                        }

                        // EsperEPL2Ast.g:733:34: ( accessValueExpr )?
                        int alt268=2;
                        int LA268_0 = input.LA(1);

                        if ( (LA268_0==ACCESS_AGG) ) {
                            alt268=1;
                        }
                        switch (alt268) {
                            case 1 :
                                // EsperEPL2Ast.g:733:34: accessValueExpr
                                {
                                pushFollow(FOLLOW_accessValueExpr_in_builtinFunc4940);
                                accessValueExpr();

                                state._fsp--;


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                     leaveNode(f); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:734:5: ^(f= COALESCE valueExpr valueExpr ( valueExpr )* )
                    {
                    f=(CommonTree)match(input,COALESCE,FOLLOW_COALESCE_in_builtinFunc4953); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4955);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4957);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:734:38: ( valueExpr )*
                    loop269:
                    do {
                        int alt269=2;
                        int LA269_0 = input.LA(1);

                        if ( ((LA269_0>=IN_SET && LA269_0<=REGEXP)||LA269_0==NOT_EXPR||(LA269_0>=SUM && LA269_0<=AVG)||(LA269_0>=COALESCE && LA269_0<=COUNT)||(LA269_0>=CASE && LA269_0<=CASE2)||LA269_0==ISTREAM||(LA269_0>=PREVIOUS && LA269_0<=EXISTS)||(LA269_0>=INSTANCEOF && LA269_0<=CURRENT_TIMESTAMP)||LA269_0==NEWKW||(LA269_0>=EVAL_AND_EXPR && LA269_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA269_0==EVENT_PROP_EXPR||LA269_0==CONCAT||(LA269_0>=LIB_FUNC_CHAIN && LA269_0<=DOT_EXPR)||LA269_0==ARRAY_EXPR||(LA269_0>=NOT_IN_SET && LA269_0<=NOT_REGEXP)||(LA269_0>=IN_RANGE && LA269_0<=SUBSELECT_EXPR)||(LA269_0>=EXISTS_SUBSELECT_EXPR && LA269_0<=NOT_IN_SUBSELECT_EXPR)||LA269_0==SUBSTITUTION||(LA269_0>=FIRST_AGGREG && LA269_0<=WINDOW_AGGREG)||(LA269_0>=INT_TYPE && LA269_0<=NULL_TYPE)||(LA269_0>=JSON_OBJECT && LA269_0<=JSON_ARRAY)||LA269_0==STAR||(LA269_0>=LT && LA269_0<=GT)||(LA269_0>=BOR && LA269_0<=PLUS)||(LA269_0>=BAND && LA269_0<=BXOR)||(LA269_0>=LE && LA269_0<=GE)||(LA269_0>=MINUS && LA269_0<=MOD)||(LA269_0>=EVAL_IS_GROUP_EXPR && LA269_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt269=1;
                        }


                        switch (alt269) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:734:39: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_builtinFunc4960);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop269;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:735:5: ^(f= PREVIOUS valueExpr ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,PREVIOUS,FOLLOW_PREVIOUS_in_builtinFunc4975); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4977);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:735:28: ( valueExpr )?
                    int alt270=2;
                    int LA270_0 = input.LA(1);

                    if ( ((LA270_0>=IN_SET && LA270_0<=REGEXP)||LA270_0==NOT_EXPR||(LA270_0>=SUM && LA270_0<=AVG)||(LA270_0>=COALESCE && LA270_0<=COUNT)||(LA270_0>=CASE && LA270_0<=CASE2)||LA270_0==ISTREAM||(LA270_0>=PREVIOUS && LA270_0<=EXISTS)||(LA270_0>=INSTANCEOF && LA270_0<=CURRENT_TIMESTAMP)||LA270_0==NEWKW||(LA270_0>=EVAL_AND_EXPR && LA270_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA270_0==EVENT_PROP_EXPR||LA270_0==CONCAT||(LA270_0>=LIB_FUNC_CHAIN && LA270_0<=DOT_EXPR)||LA270_0==ARRAY_EXPR||(LA270_0>=NOT_IN_SET && LA270_0<=NOT_REGEXP)||(LA270_0>=IN_RANGE && LA270_0<=SUBSELECT_EXPR)||(LA270_0>=EXISTS_SUBSELECT_EXPR && LA270_0<=NOT_IN_SUBSELECT_EXPR)||LA270_0==SUBSTITUTION||(LA270_0>=FIRST_AGGREG && LA270_0<=WINDOW_AGGREG)||(LA270_0>=INT_TYPE && LA270_0<=NULL_TYPE)||(LA270_0>=JSON_OBJECT && LA270_0<=JSON_ARRAY)||LA270_0==STAR||(LA270_0>=LT && LA270_0<=GT)||(LA270_0>=BOR && LA270_0<=PLUS)||(LA270_0>=BAND && LA270_0<=BXOR)||(LA270_0>=LE && LA270_0<=GE)||(LA270_0>=MINUS && LA270_0<=MOD)||(LA270_0>=EVAL_IS_GROUP_EXPR && LA270_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt270=1;
                    }
                    switch (alt270) {
                        case 1 :
                            // EsperEPL2Ast.g:735:28: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_builtinFunc4979);
                            valueExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:736:5: ^(f= PREVIOUSTAIL valueExpr ( valueExpr )? )
                    {
                    f=(CommonTree)match(input,PREVIOUSTAIL,FOLLOW_PREVIOUSTAIL_in_builtinFunc4992); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc4994);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:736:32: ( valueExpr )?
                    int alt271=2;
                    int LA271_0 = input.LA(1);

                    if ( ((LA271_0>=IN_SET && LA271_0<=REGEXP)||LA271_0==NOT_EXPR||(LA271_0>=SUM && LA271_0<=AVG)||(LA271_0>=COALESCE && LA271_0<=COUNT)||(LA271_0>=CASE && LA271_0<=CASE2)||LA271_0==ISTREAM||(LA271_0>=PREVIOUS && LA271_0<=EXISTS)||(LA271_0>=INSTANCEOF && LA271_0<=CURRENT_TIMESTAMP)||LA271_0==NEWKW||(LA271_0>=EVAL_AND_EXPR && LA271_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA271_0==EVENT_PROP_EXPR||LA271_0==CONCAT||(LA271_0>=LIB_FUNC_CHAIN && LA271_0<=DOT_EXPR)||LA271_0==ARRAY_EXPR||(LA271_0>=NOT_IN_SET && LA271_0<=NOT_REGEXP)||(LA271_0>=IN_RANGE && LA271_0<=SUBSELECT_EXPR)||(LA271_0>=EXISTS_SUBSELECT_EXPR && LA271_0<=NOT_IN_SUBSELECT_EXPR)||LA271_0==SUBSTITUTION||(LA271_0>=FIRST_AGGREG && LA271_0<=WINDOW_AGGREG)||(LA271_0>=INT_TYPE && LA271_0<=NULL_TYPE)||(LA271_0>=JSON_OBJECT && LA271_0<=JSON_ARRAY)||LA271_0==STAR||(LA271_0>=LT && LA271_0<=GT)||(LA271_0>=BOR && LA271_0<=PLUS)||(LA271_0>=BAND && LA271_0<=BXOR)||(LA271_0>=LE && LA271_0<=GE)||(LA271_0>=MINUS && LA271_0<=MOD)||(LA271_0>=EVAL_IS_GROUP_EXPR && LA271_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt271=1;
                    }
                    switch (alt271) {
                        case 1 :
                            // EsperEPL2Ast.g:736:32: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_builtinFunc4996);
                            valueExpr();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 13 :
                    // EsperEPL2Ast.g:737:5: ^(f= PREVIOUSCOUNT valueExpr )
                    {
                    f=(CommonTree)match(input,PREVIOUSCOUNT,FOLLOW_PREVIOUSCOUNT_in_builtinFunc5009); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc5011);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 14 :
                    // EsperEPL2Ast.g:738:5: ^(f= PREVIOUSWINDOW valueExpr )
                    {
                    f=(CommonTree)match(input,PREVIOUSWINDOW,FOLLOW_PREVIOUSWINDOW_in_builtinFunc5023); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc5025);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 15 :
                    // EsperEPL2Ast.g:739:5: ^(f= PRIOR c= NUM_INT eventPropertyExpr[true] )
                    {
                    f=(CommonTree)match(input,PRIOR,FOLLOW_PRIOR_in_builtinFunc5037); 

                    match(input, Token.DOWN, null); 
                    c=(CommonTree)match(input,NUM_INT,FOLLOW_NUM_INT_in_builtinFunc5041); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_builtinFunc5043);
                    eventPropertyExpr(true);

                    state._fsp--;


                    match(input, Token.UP, null); 
                    leaveNode(c); leaveNode(f);

                    }
                    break;
                case 16 :
                    // EsperEPL2Ast.g:740:5: ^(f= INSTANCEOF valueExpr CLASS_IDENT ( CLASS_IDENT )* )
                    {
                    f=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_builtinFunc5056); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc5058);
                    valueExpr();

                    state._fsp--;

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc5060); 
                    // EsperEPL2Ast.g:740:42: ( CLASS_IDENT )*
                    loop272:
                    do {
                        int alt272=2;
                        int LA272_0 = input.LA(1);

                        if ( (LA272_0==CLASS_IDENT) ) {
                            alt272=1;
                        }


                        switch (alt272) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:740:43: CLASS_IDENT
                    	    {
                    	    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc5063); 

                    	    }
                    	    break;

                    	default :
                    	    break loop272;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 17 :
                    // EsperEPL2Ast.g:741:5: ^(f= TYPEOF valueExpr )
                    {
                    f=(CommonTree)match(input,TYPEOF,FOLLOW_TYPEOF_in_builtinFunc5077); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc5079);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 18 :
                    // EsperEPL2Ast.g:742:5: ^(f= CAST valueExpr CLASS_IDENT )
                    {
                    f=(CommonTree)match(input,CAST,FOLLOW_CAST_in_builtinFunc5091); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_builtinFunc5093);
                    valueExpr();

                    state._fsp--;

                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_builtinFunc5095); 

                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 19 :
                    // EsperEPL2Ast.g:743:5: ^(f= EXISTS eventPropertyExpr[true] )
                    {
                    f=(CommonTree)match(input,EXISTS,FOLLOW_EXISTS_in_builtinFunc5107); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_eventPropertyExpr_in_builtinFunc5109);
                    eventPropertyExpr(true);

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(f); 

                    }
                    break;
                case 20 :
                    // EsperEPL2Ast.g:744:4: ^(f= CURRENT_TIMESTAMP )
                    {
                    f=(CommonTree)match(input,CURRENT_TIMESTAMP,FOLLOW_CURRENT_TIMESTAMP_in_builtinFunc5121); 



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        match(input, Token.UP, null); 
                    }
                     leaveNode(f); 

                    }
                    break;
                case 21 :
                    // EsperEPL2Ast.g:745:4: ^(f= ISTREAM )
                    {
                    f=(CommonTree)match(input,ISTREAM,FOLLOW_ISTREAM_in_builtinFunc5134); 



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        match(input, Token.UP, null); 
                    }
                     leaveNode(f); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "builtinFunc"


    // $ANTLR start "aggregationFilterExpr"
    // EsperEPL2Ast.g:748:1: aggregationFilterExpr : ^( AGG_FILTER_EXPR valueExpr ) ;
    public final void aggregationFilterExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:749:2: ( ^( AGG_FILTER_EXPR valueExpr ) )
            // EsperEPL2Ast.g:749:4: ^( AGG_FILTER_EXPR valueExpr )
            {
            match(input,AGG_FILTER_EXPR,FOLLOW_AGG_FILTER_EXPR_in_aggregationFilterExpr5151); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_aggregationFilterExpr5153);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "aggregationFilterExpr"


    // $ANTLR start "accessValueExpr"
    // EsperEPL2Ast.g:752:1: accessValueExpr : ^( ACCESS_AGG accessValueExprChoice ) ;
    public final void accessValueExpr() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:753:2: ( ^( ACCESS_AGG accessValueExprChoice ) )
            // EsperEPL2Ast.g:753:5: ^( ACCESS_AGG accessValueExprChoice )
            {
            match(input,ACCESS_AGG,FOLLOW_ACCESS_AGG_in_accessValueExpr5167); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_accessValueExprChoice_in_accessValueExpr5169);
            accessValueExprChoice();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "accessValueExpr"


    // $ANTLR start "accessValueExprChoice"
    // EsperEPL2Ast.g:756:1: accessValueExprChoice : ( PROPERTY_WILDCARD_SELECT | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) | valueExpr );
    public final void accessValueExprChoice() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:757:2: ( PROPERTY_WILDCARD_SELECT | ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? ) | valueExpr )
            int alt275=3;
            switch ( input.LA(1) ) {
            case PROPERTY_WILDCARD_SELECT:
                {
                alt275=1;
                }
                break;
            case PROPERTY_SELECTION_STREAM:
                {
                alt275=2;
                }
                break;
            case IN_SET:
            case BETWEEN:
            case LIKE:
            case REGEXP:
            case NOT_EXPR:
            case SUM:
            case AVG:
            case COALESCE:
            case MEDIAN:
            case STDDEV:
            case AVEDEV:
            case COUNT:
            case CASE:
            case CASE2:
            case ISTREAM:
            case PREVIOUS:
            case PREVIOUSTAIL:
            case PREVIOUSCOUNT:
            case PREVIOUSWINDOW:
            case PRIOR:
            case EXISTS:
            case INSTANCEOF:
            case TYPEOF:
            case CAST:
            case CURRENT_TIMESTAMP:
            case NEWKW:
            case EVAL_AND_EXPR:
            case EVAL_OR_EXPR:
            case EVAL_EQUALS_EXPR:
            case EVAL_NOTEQUALS_EXPR:
            case EVAL_IS_EXPR:
            case EVAL_ISNOT_EXPR:
            case EVAL_EQUALS_GROUP_EXPR:
            case EVAL_NOTEQUALS_GROUP_EXPR:
            case EVENT_PROP_EXPR:
            case CONCAT:
            case LIB_FUNC_CHAIN:
            case DOT_EXPR:
            case ARRAY_EXPR:
            case NOT_IN_SET:
            case NOT_BETWEEN:
            case NOT_LIKE:
            case NOT_REGEXP:
            case IN_RANGE:
            case NOT_IN_RANGE:
            case SUBSELECT_EXPR:
            case EXISTS_SUBSELECT_EXPR:
            case IN_SUBSELECT_EXPR:
            case NOT_IN_SUBSELECT_EXPR:
            case SUBSTITUTION:
            case FIRST_AGGREG:
            case LAST_AGGREG:
            case WINDOW_AGGREG:
            case INT_TYPE:
            case LONG_TYPE:
            case FLOAT_TYPE:
            case DOUBLE_TYPE:
            case STRING_TYPE:
            case BOOL_TYPE:
            case NULL_TYPE:
            case JSON_OBJECT:
            case JSON_ARRAY:
            case STAR:
            case LT:
            case GT:
            case BOR:
            case PLUS:
            case BAND:
            case BXOR:
            case LE:
            case GE:
            case MINUS:
            case DIV:
            case MOD:
            case EVAL_IS_GROUP_EXPR:
            case EVAL_ISNOT_GROUP_EXPR:
                {
                alt275=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 275, 0, input);

                throw nvae;
            }

            switch (alt275) {
                case 1 :
                    // EsperEPL2Ast.g:757:4: PROPERTY_WILDCARD_SELECT
                    {
                    match(input,PROPERTY_WILDCARD_SELECT,FOLLOW_PROPERTY_WILDCARD_SELECT_in_accessValueExprChoice5184); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:757:31: ^(s= PROPERTY_SELECTION_STREAM IDENT ( IDENT )? )
                    {
                    s=(CommonTree)match(input,PROPERTY_SELECTION_STREAM,FOLLOW_PROPERTY_SELECTION_STREAM_in_accessValueExprChoice5191); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_accessValueExprChoice5193); 
                    // EsperEPL2Ast.g:757:67: ( IDENT )?
                    int alt274=2;
                    int LA274_0 = input.LA(1);

                    if ( (LA274_0==IDENT) ) {
                        alt274=1;
                    }
                    switch (alt274) {
                        case 1 :
                            // EsperEPL2Ast.g:757:67: IDENT
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_accessValueExprChoice5195); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:757:77: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_accessValueExprChoice5201);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "accessValueExprChoice"


    // $ANTLR start "arrayExpr"
    // EsperEPL2Ast.g:760:1: arrayExpr : ^(a= ARRAY_EXPR ( valueExpr )* ) ;
    public final void arrayExpr() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:761:2: ( ^(a= ARRAY_EXPR ( valueExpr )* ) )
            // EsperEPL2Ast.g:761:4: ^(a= ARRAY_EXPR ( valueExpr )* )
            {
            a=(CommonTree)match(input,ARRAY_EXPR,FOLLOW_ARRAY_EXPR_in_arrayExpr5217); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:761:19: ( valueExpr )*
                loop276:
                do {
                    int alt276=2;
                    int LA276_0 = input.LA(1);

                    if ( ((LA276_0>=IN_SET && LA276_0<=REGEXP)||LA276_0==NOT_EXPR||(LA276_0>=SUM && LA276_0<=AVG)||(LA276_0>=COALESCE && LA276_0<=COUNT)||(LA276_0>=CASE && LA276_0<=CASE2)||LA276_0==ISTREAM||(LA276_0>=PREVIOUS && LA276_0<=EXISTS)||(LA276_0>=INSTANCEOF && LA276_0<=CURRENT_TIMESTAMP)||LA276_0==NEWKW||(LA276_0>=EVAL_AND_EXPR && LA276_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA276_0==EVENT_PROP_EXPR||LA276_0==CONCAT||(LA276_0>=LIB_FUNC_CHAIN && LA276_0<=DOT_EXPR)||LA276_0==ARRAY_EXPR||(LA276_0>=NOT_IN_SET && LA276_0<=NOT_REGEXP)||(LA276_0>=IN_RANGE && LA276_0<=SUBSELECT_EXPR)||(LA276_0>=EXISTS_SUBSELECT_EXPR && LA276_0<=NOT_IN_SUBSELECT_EXPR)||LA276_0==SUBSTITUTION||(LA276_0>=FIRST_AGGREG && LA276_0<=WINDOW_AGGREG)||(LA276_0>=INT_TYPE && LA276_0<=NULL_TYPE)||(LA276_0>=JSON_OBJECT && LA276_0<=JSON_ARRAY)||LA276_0==STAR||(LA276_0>=LT && LA276_0<=GT)||(LA276_0>=BOR && LA276_0<=PLUS)||(LA276_0>=BAND && LA276_0<=BXOR)||(LA276_0>=LE && LA276_0<=GE)||(LA276_0>=MINUS && LA276_0<=MOD)||(LA276_0>=EVAL_IS_GROUP_EXPR && LA276_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt276=1;
                    }


                    switch (alt276) {
                	case 1 :
                	    // EsperEPL2Ast.g:761:20: valueExpr
                	    {
                	    pushFollow(FOLLOW_valueExpr_in_arrayExpr5220);
                	    valueExpr();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop276;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
             leaveNode(a); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "arrayExpr"


    // $ANTLR start "arithmeticExpr"
    // EsperEPL2Ast.g:764:1: arithmeticExpr : ( ^(a= PLUS valueExpr valueExpr ) | ^(a= MINUS valueExpr valueExpr ) | ^(a= DIV valueExpr valueExpr ) | ^(a= STAR valueExpr valueExpr ) | ^(a= MOD valueExpr valueExpr ) | ^(a= BAND valueExpr valueExpr ) | ^(a= BOR valueExpr valueExpr ) | ^(a= BXOR valueExpr valueExpr ) | ^(a= CONCAT valueExpr valueExpr ( valueExpr )* ) );
    public final void arithmeticExpr() throws RecognitionException {
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:765:2: ( ^(a= PLUS valueExpr valueExpr ) | ^(a= MINUS valueExpr valueExpr ) | ^(a= DIV valueExpr valueExpr ) | ^(a= STAR valueExpr valueExpr ) | ^(a= MOD valueExpr valueExpr ) | ^(a= BAND valueExpr valueExpr ) | ^(a= BOR valueExpr valueExpr ) | ^(a= BXOR valueExpr valueExpr ) | ^(a= CONCAT valueExpr valueExpr ( valueExpr )* ) )
            int alt278=9;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt278=1;
                }
                break;
            case MINUS:
                {
                alt278=2;
                }
                break;
            case DIV:
                {
                alt278=3;
                }
                break;
            case STAR:
                {
                alt278=4;
                }
                break;
            case MOD:
                {
                alt278=5;
                }
                break;
            case BAND:
                {
                alt278=6;
                }
                break;
            case BOR:
                {
                alt278=7;
                }
                break;
            case BXOR:
                {
                alt278=8;
                }
                break;
            case CONCAT:
                {
                alt278=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 278, 0, input);

                throw nvae;
            }

            switch (alt278) {
                case 1 :
                    // EsperEPL2Ast.g:765:5: ^(a= PLUS valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_arithmeticExpr5241); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5243);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5245);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:766:5: ^(a= MINUS valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_arithmeticExpr5257); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5259);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5261);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:767:5: ^(a= DIV valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,DIV,FOLLOW_DIV_in_arithmeticExpr5273); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5275);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5277);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:768:4: ^(a= STAR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,STAR,FOLLOW_STAR_in_arithmeticExpr5288); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5290);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5292);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:769:5: ^(a= MOD valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,MOD,FOLLOW_MOD_in_arithmeticExpr5304); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5306);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5308);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:770:4: ^(a= BAND valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BAND,FOLLOW_BAND_in_arithmeticExpr5319); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5321);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5323);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:771:4: ^(a= BOR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BOR,FOLLOW_BOR_in_arithmeticExpr5334); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5336);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5338);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:772:4: ^(a= BXOR valueExpr valueExpr )
                    {
                    a=(CommonTree)match(input,BXOR,FOLLOW_BXOR_in_arithmeticExpr5349); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5351);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5353);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:773:5: ^(a= CONCAT valueExpr valueExpr ( valueExpr )* )
                    {
                    a=(CommonTree)match(input,CONCAT,FOLLOW_CONCAT_in_arithmeticExpr5365); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5367);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5369);
                    valueExpr();

                    state._fsp--;

                    // EsperEPL2Ast.g:773:36: ( valueExpr )*
                    loop277:
                    do {
                        int alt277=2;
                        int LA277_0 = input.LA(1);

                        if ( ((LA277_0>=IN_SET && LA277_0<=REGEXP)||LA277_0==NOT_EXPR||(LA277_0>=SUM && LA277_0<=AVG)||(LA277_0>=COALESCE && LA277_0<=COUNT)||(LA277_0>=CASE && LA277_0<=CASE2)||LA277_0==ISTREAM||(LA277_0>=PREVIOUS && LA277_0<=EXISTS)||(LA277_0>=INSTANCEOF && LA277_0<=CURRENT_TIMESTAMP)||LA277_0==NEWKW||(LA277_0>=EVAL_AND_EXPR && LA277_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA277_0==EVENT_PROP_EXPR||LA277_0==CONCAT||(LA277_0>=LIB_FUNC_CHAIN && LA277_0<=DOT_EXPR)||LA277_0==ARRAY_EXPR||(LA277_0>=NOT_IN_SET && LA277_0<=NOT_REGEXP)||(LA277_0>=IN_RANGE && LA277_0<=SUBSELECT_EXPR)||(LA277_0>=EXISTS_SUBSELECT_EXPR && LA277_0<=NOT_IN_SUBSELECT_EXPR)||LA277_0==SUBSTITUTION||(LA277_0>=FIRST_AGGREG && LA277_0<=WINDOW_AGGREG)||(LA277_0>=INT_TYPE && LA277_0<=NULL_TYPE)||(LA277_0>=JSON_OBJECT && LA277_0<=JSON_ARRAY)||LA277_0==STAR||(LA277_0>=LT && LA277_0<=GT)||(LA277_0>=BOR && LA277_0<=PLUS)||(LA277_0>=BAND && LA277_0<=BXOR)||(LA277_0>=LE && LA277_0<=GE)||(LA277_0>=MINUS && LA277_0<=MOD)||(LA277_0>=EVAL_IS_GROUP_EXPR && LA277_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt277=1;
                        }


                        switch (alt277) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:773:37: valueExpr
                    	    {
                    	    pushFollow(FOLLOW_valueExpr_in_arithmeticExpr5372);
                    	    valueExpr();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop277;
                        }
                    } while (true);


                    match(input, Token.UP, null); 
                     leaveNode(a); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "arithmeticExpr"


    // $ANTLR start "dotExpr"
    // EsperEPL2Ast.g:776:1: dotExpr : ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* ) ;
    public final void dotExpr() throws RecognitionException {
        CommonTree d=null;

        try {
            // EsperEPL2Ast.g:777:2: ( ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* ) )
            // EsperEPL2Ast.g:777:4: ^(d= DOT_EXPR valueExpr ( libFunctionWithClass )* )
            {
            d=(CommonTree)match(input,DOT_EXPR,FOLLOW_DOT_EXPR_in_dotExpr5392); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_dotExpr5394);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:777:27: ( libFunctionWithClass )*
            loop279:
            do {
                int alt279=2;
                int LA279_0 = input.LA(1);

                if ( (LA279_0==LIB_FUNCTION) ) {
                    alt279=1;
                }


                switch (alt279) {
            	case 1 :
            	    // EsperEPL2Ast.g:777:27: libFunctionWithClass
            	    {
            	    pushFollow(FOLLOW_libFunctionWithClass_in_dotExpr5396);
            	    libFunctionWithClass();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop279;
                }
            } while (true);


            match(input, Token.UP, null); 
             leaveNode(d); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "dotExpr"


    // $ANTLR start "newExpr"
    // EsperEPL2Ast.g:780:1: newExpr : ^(n= NEWKW ( newAssign )* ) ;
    public final void newExpr() throws RecognitionException {
        CommonTree n=null;

        try {
            // EsperEPL2Ast.g:780:9: ( ^(n= NEWKW ( newAssign )* ) )
            // EsperEPL2Ast.g:780:11: ^(n= NEWKW ( newAssign )* )
            {
            n=(CommonTree)match(input,NEWKW,FOLLOW_NEWKW_in_newExpr5414); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // EsperEPL2Ast.g:780:21: ( newAssign )*
                loop280:
                do {
                    int alt280=2;
                    int LA280_0 = input.LA(1);

                    if ( (LA280_0==NEW_ITEM) ) {
                        alt280=1;
                    }


                    switch (alt280) {
                	case 1 :
                	    // EsperEPL2Ast.g:780:21: newAssign
                	    {
                	    pushFollow(FOLLOW_newAssign_in_newExpr5416);
                	    newAssign();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop280;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
             leaveNode(n); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "newExpr"


    // $ANTLR start "newAssign"
    // EsperEPL2Ast.g:783:1: newAssign : ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? ) ;
    public final void newAssign() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:784:2: ( ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? ) )
            // EsperEPL2Ast.g:784:4: ^( NEW_ITEM eventPropertyExpr[false] ( valueExpr )? )
            {
            match(input,NEW_ITEM,FOLLOW_NEW_ITEM_in_newAssign5432); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyExpr_in_newAssign5434);
            eventPropertyExpr(false);

            state._fsp--;

            // EsperEPL2Ast.g:784:40: ( valueExpr )?
            int alt281=2;
            int LA281_0 = input.LA(1);

            if ( ((LA281_0>=IN_SET && LA281_0<=REGEXP)||LA281_0==NOT_EXPR||(LA281_0>=SUM && LA281_0<=AVG)||(LA281_0>=COALESCE && LA281_0<=COUNT)||(LA281_0>=CASE && LA281_0<=CASE2)||LA281_0==ISTREAM||(LA281_0>=PREVIOUS && LA281_0<=EXISTS)||(LA281_0>=INSTANCEOF && LA281_0<=CURRENT_TIMESTAMP)||LA281_0==NEWKW||(LA281_0>=EVAL_AND_EXPR && LA281_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA281_0==EVENT_PROP_EXPR||LA281_0==CONCAT||(LA281_0>=LIB_FUNC_CHAIN && LA281_0<=DOT_EXPR)||LA281_0==ARRAY_EXPR||(LA281_0>=NOT_IN_SET && LA281_0<=NOT_REGEXP)||(LA281_0>=IN_RANGE && LA281_0<=SUBSELECT_EXPR)||(LA281_0>=EXISTS_SUBSELECT_EXPR && LA281_0<=NOT_IN_SUBSELECT_EXPR)||LA281_0==SUBSTITUTION||(LA281_0>=FIRST_AGGREG && LA281_0<=WINDOW_AGGREG)||(LA281_0>=INT_TYPE && LA281_0<=NULL_TYPE)||(LA281_0>=JSON_OBJECT && LA281_0<=JSON_ARRAY)||LA281_0==STAR||(LA281_0>=LT && LA281_0<=GT)||(LA281_0>=BOR && LA281_0<=PLUS)||(LA281_0>=BAND && LA281_0<=BXOR)||(LA281_0>=LE && LA281_0<=GE)||(LA281_0>=MINUS && LA281_0<=MOD)||(LA281_0>=EVAL_IS_GROUP_EXPR && LA281_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt281=1;
            }
            switch (alt281) {
                case 1 :
                    // EsperEPL2Ast.g:784:40: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_newAssign5437);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "newAssign"


    // $ANTLR start "libFuncChain"
    // EsperEPL2Ast.g:787:1: libFuncChain : ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* ) ;
    public final void libFuncChain() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:788:2: ( ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* ) )
            // EsperEPL2Ast.g:788:6: ^(l= LIB_FUNC_CHAIN libFunctionWithClass ( libOrPropFunction )* )
            {
            l=(CommonTree)match(input,LIB_FUNC_CHAIN,FOLLOW_LIB_FUNC_CHAIN_in_libFuncChain5455); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_libFunctionWithClass_in_libFuncChain5457);
            libFunctionWithClass();

            state._fsp--;

            // EsperEPL2Ast.g:788:46: ( libOrPropFunction )*
            loop282:
            do {
                int alt282=2;
                int LA282_0 = input.LA(1);

                if ( (LA282_0==EVENT_PROP_EXPR||LA282_0==LIB_FUNCTION) ) {
                    alt282=1;
                }


                switch (alt282) {
            	case 1 :
            	    // EsperEPL2Ast.g:788:46: libOrPropFunction
            	    {
            	    pushFollow(FOLLOW_libOrPropFunction_in_libFuncChain5459);
            	    libOrPropFunction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop282;
                }
            } while (true);


            match(input, Token.UP, null); 
             leaveNode(l); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "libFuncChain"


    // $ANTLR start "libFunctionWithClass"
    // EsperEPL2Ast.g:791:1: libFunctionWithClass : ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? ) ;
    public final void libFunctionWithClass() throws RecognitionException {
        CommonTree l=null;

        try {
            // EsperEPL2Ast.g:792:2: ( ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? ) )
            // EsperEPL2Ast.g:792:6: ^(l= LIB_FUNCTION ( CLASS_IDENT )? IDENT ( DISTINCT )? ( libFunctionArgItem )* ( LPAREN )? )
            {
            l=(CommonTree)match(input,LIB_FUNCTION,FOLLOW_LIB_FUNCTION_in_libFunctionWithClass5479); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:792:23: ( CLASS_IDENT )?
            int alt283=2;
            int LA283_0 = input.LA(1);

            if ( (LA283_0==CLASS_IDENT) ) {
                alt283=1;
            }
            switch (alt283) {
                case 1 :
                    // EsperEPL2Ast.g:792:24: CLASS_IDENT
                    {
                    match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_libFunctionWithClass5482); 

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_libFunctionWithClass5486); 
            // EsperEPL2Ast.g:792:44: ( DISTINCT )?
            int alt284=2;
            int LA284_0 = input.LA(1);

            if ( (LA284_0==DISTINCT) ) {
                alt284=1;
            }
            switch (alt284) {
                case 1 :
                    // EsperEPL2Ast.g:792:45: DISTINCT
                    {
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_libFunctionWithClass5489); 

                    }
                    break;

            }

            // EsperEPL2Ast.g:792:56: ( libFunctionArgItem )*
            loop285:
            do {
                int alt285=2;
                int LA285_0 = input.LA(1);

                if ( ((LA285_0>=IN_SET && LA285_0<=REGEXP)||LA285_0==NOT_EXPR||(LA285_0>=SUM && LA285_0<=AVG)||(LA285_0>=COALESCE && LA285_0<=COUNT)||(LA285_0>=CASE && LA285_0<=CASE2)||LA285_0==LAST||LA285_0==ISTREAM||(LA285_0>=PREVIOUS && LA285_0<=EXISTS)||(LA285_0>=LW && LA285_0<=CURRENT_TIMESTAMP)||LA285_0==NEWKW||(LA285_0>=NUMERIC_PARAM_RANGE && LA285_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA285_0>=EVAL_AND_EXPR && LA285_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA285_0==EVENT_PROP_EXPR||LA285_0==CONCAT||(LA285_0>=LIB_FUNC_CHAIN && LA285_0<=DOT_EXPR)||(LA285_0>=TIME_PERIOD && LA285_0<=ARRAY_EXPR)||(LA285_0>=NOT_IN_SET && LA285_0<=NOT_REGEXP)||(LA285_0>=IN_RANGE && LA285_0<=SUBSELECT_EXPR)||(LA285_0>=EXISTS_SUBSELECT_EXPR && LA285_0<=NOT_IN_SUBSELECT_EXPR)||(LA285_0>=LAST_OPERATOR && LA285_0<=SUBSTITUTION)||LA285_0==NUMBERSETSTAR||(LA285_0>=FIRST_AGGREG && LA285_0<=WINDOW_AGGREG)||(LA285_0>=INT_TYPE && LA285_0<=NULL_TYPE)||(LA285_0>=JSON_OBJECT && LA285_0<=JSON_ARRAY)||LA285_0==GOES||LA285_0==STAR||(LA285_0>=LT && LA285_0<=GT)||(LA285_0>=BOR && LA285_0<=PLUS)||(LA285_0>=BAND && LA285_0<=BXOR)||(LA285_0>=LE && LA285_0<=GE)||(LA285_0>=MINUS && LA285_0<=MOD)||(LA285_0>=EVAL_IS_GROUP_EXPR && LA285_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt285=1;
                }


                switch (alt285) {
            	case 1 :
            	    // EsperEPL2Ast.g:792:56: libFunctionArgItem
            	    {
            	    pushFollow(FOLLOW_libFunctionArgItem_in_libFunctionWithClass5493);
            	    libFunctionArgItem();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop285;
                }
            } while (true);

            // EsperEPL2Ast.g:792:76: ( LPAREN )?
            int alt286=2;
            int LA286_0 = input.LA(1);

            if ( (LA286_0==LPAREN) ) {
                alt286=1;
            }
            switch (alt286) {
                case 1 :
                    // EsperEPL2Ast.g:792:76: LPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_libFunctionWithClass5496); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "libFunctionWithClass"


    // $ANTLR start "libFunctionArgItem"
    // EsperEPL2Ast.g:795:1: libFunctionArgItem : ( expressionLambdaDecl | valueExprWithTime );
    public final void libFunctionArgItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:796:2: ( expressionLambdaDecl | valueExprWithTime )
            int alt287=2;
            int LA287_0 = input.LA(1);

            if ( (LA287_0==GOES) ) {
                alt287=1;
            }
            else if ( ((LA287_0>=IN_SET && LA287_0<=REGEXP)||LA287_0==NOT_EXPR||(LA287_0>=SUM && LA287_0<=AVG)||(LA287_0>=COALESCE && LA287_0<=COUNT)||(LA287_0>=CASE && LA287_0<=CASE2)||LA287_0==LAST||LA287_0==ISTREAM||(LA287_0>=PREVIOUS && LA287_0<=EXISTS)||(LA287_0>=LW && LA287_0<=CURRENT_TIMESTAMP)||LA287_0==NEWKW||(LA287_0>=NUMERIC_PARAM_RANGE && LA287_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA287_0>=EVAL_AND_EXPR && LA287_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA287_0==EVENT_PROP_EXPR||LA287_0==CONCAT||(LA287_0>=LIB_FUNC_CHAIN && LA287_0<=DOT_EXPR)||(LA287_0>=TIME_PERIOD && LA287_0<=ARRAY_EXPR)||(LA287_0>=NOT_IN_SET && LA287_0<=NOT_REGEXP)||(LA287_0>=IN_RANGE && LA287_0<=SUBSELECT_EXPR)||(LA287_0>=EXISTS_SUBSELECT_EXPR && LA287_0<=NOT_IN_SUBSELECT_EXPR)||(LA287_0>=LAST_OPERATOR && LA287_0<=SUBSTITUTION)||LA287_0==NUMBERSETSTAR||(LA287_0>=FIRST_AGGREG && LA287_0<=WINDOW_AGGREG)||(LA287_0>=INT_TYPE && LA287_0<=NULL_TYPE)||(LA287_0>=JSON_OBJECT && LA287_0<=JSON_ARRAY)||LA287_0==STAR||(LA287_0>=LT && LA287_0<=GT)||(LA287_0>=BOR && LA287_0<=PLUS)||(LA287_0>=BAND && LA287_0<=BXOR)||(LA287_0>=LE && LA287_0<=GE)||(LA287_0>=MINUS && LA287_0<=MOD)||(LA287_0>=EVAL_IS_GROUP_EXPR && LA287_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt287=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 287, 0, input);

                throw nvae;
            }
            switch (alt287) {
                case 1 :
                    // EsperEPL2Ast.g:796:4: expressionLambdaDecl
                    {
                    pushFollow(FOLLOW_expressionLambdaDecl_in_libFunctionArgItem5510);
                    expressionLambdaDecl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:796:27: valueExprWithTime
                    {
                    pushFollow(FOLLOW_valueExprWithTime_in_libFunctionArgItem5514);
                    valueExprWithTime();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "libFunctionArgItem"


    // $ANTLR start "libOrPropFunction"
    // EsperEPL2Ast.g:799:1: libOrPropFunction : ( eventPropertyExpr[false] | libFunctionWithClass );
    public final void libOrPropFunction() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:800:2: ( eventPropertyExpr[false] | libFunctionWithClass )
            int alt288=2;
            int LA288_0 = input.LA(1);

            if ( (LA288_0==EVENT_PROP_EXPR) ) {
                alt288=1;
            }
            else if ( (LA288_0==LIB_FUNCTION) ) {
                alt288=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 288, 0, input);

                throw nvae;
            }
            switch (alt288) {
                case 1 :
                    // EsperEPL2Ast.g:800:7: eventPropertyExpr[false]
                    {
                    pushFollow(FOLLOW_eventPropertyExpr_in_libOrPropFunction5529);
                    eventPropertyExpr(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:801:7: libFunctionWithClass
                    {
                    pushFollow(FOLLOW_libFunctionWithClass_in_libOrPropFunction5539);
                    libFunctionWithClass();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "libOrPropFunction"


    // $ANTLR start "startPatternExpressionRule"
    // EsperEPL2Ast.g:807:1: startPatternExpressionRule : ( annotation[true] )* exprChoice ;
    public final void startPatternExpressionRule() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:808:2: ( ( annotation[true] )* exprChoice )
            // EsperEPL2Ast.g:808:4: ( annotation[true] )* exprChoice
            {
            // EsperEPL2Ast.g:808:4: ( annotation[true] )*
            loop289:
            do {
                int alt289=2;
                int LA289_0 = input.LA(1);

                if ( (LA289_0==ANNOTATION) ) {
                    alt289=1;
                }


                switch (alt289) {
            	case 1 :
            	    // EsperEPL2Ast.g:808:4: annotation[true]
            	    {
            	    pushFollow(FOLLOW_annotation_in_startPatternExpressionRule5554);
            	    annotation(true);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop289;
                }
            } while (true);

            pushFollow(FOLLOW_exprChoice_in_startPatternExpressionRule5558);
            exprChoice();

            state._fsp--;

             endPattern(); end(); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "startPatternExpressionRule"


    // $ANTLR start "exprChoice"
    // EsperEPL2Ast.g:811:1: exprChoice : ( atomicExpr | patternOp | ^(a= EVERY_EXPR exprChoice ) | ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice ) | ^(n= PATTERN_NOT_EXPR exprChoice ) | ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) ) | ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? ) );
    public final void exprChoice() throws RecognitionException {
        CommonTree a=null;
        CommonTree n=null;
        CommonTree g=null;
        CommonTree m=null;

        try {
            // EsperEPL2Ast.g:812:2: ( atomicExpr | patternOp | ^(a= EVERY_EXPR exprChoice ) | ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice ) | ^(n= PATTERN_NOT_EXPR exprChoice ) | ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) ) | ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? ) )
            int alt294=7;
            switch ( input.LA(1) ) {
            case PATTERN_FILTER_EXPR:
            case OBSERVER_EXPR:
                {
                alt294=1;
                }
                break;
            case OR_EXPR:
            case AND_EXPR:
            case FOLLOWED_BY_EXPR:
                {
                alt294=2;
                }
                break;
            case EVERY_EXPR:
                {
                alt294=3;
                }
                break;
            case EVERY_DISTINCT_EXPR:
                {
                alt294=4;
                }
                break;
            case PATTERN_NOT_EXPR:
                {
                alt294=5;
                }
                break;
            case GUARD_EXPR:
                {
                alt294=6;
                }
                break;
            case MATCH_UNTIL_EXPR:
                {
                alt294=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 294, 0, input);

                throw nvae;
            }

            switch (alt294) {
                case 1 :
                    // EsperEPL2Ast.g:812:5: atomicExpr
                    {
                    pushFollow(FOLLOW_atomicExpr_in_exprChoice5572);
                    atomicExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:813:4: patternOp
                    {
                    pushFollow(FOLLOW_patternOp_in_exprChoice5577);
                    patternOp();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:814:5: ^(a= EVERY_EXPR exprChoice )
                    {
                    a=(CommonTree)match(input,EVERY_EXPR,FOLLOW_EVERY_EXPR_in_exprChoice5587); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5589);
                    exprChoice();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:815:5: ^(a= EVERY_DISTINCT_EXPR distinctExpressions exprChoice )
                    {
                    a=(CommonTree)match(input,EVERY_DISTINCT_EXPR,FOLLOW_EVERY_DISTINCT_EXPR_in_exprChoice5603); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_distinctExpressions_in_exprChoice5605);
                    distinctExpressions();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_exprChoice5607);
                    exprChoice();

                    state._fsp--;

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:816:5: ^(n= PATTERN_NOT_EXPR exprChoice )
                    {
                    n=(CommonTree)match(input,PATTERN_NOT_EXPR,FOLLOW_PATTERN_NOT_EXPR_in_exprChoice5621); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5623);
                    exprChoice();

                    state._fsp--;

                     leaveNode(n); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:817:5: ^(g= GUARD_EXPR exprChoice ( IDENT IDENT ( valueExprWithTime )* | valueExpr ) )
                    {
                    g=(CommonTree)match(input,GUARD_EXPR,FOLLOW_GUARD_EXPR_in_exprChoice5637); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_exprChoice5639);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:817:32: ( IDENT IDENT ( valueExprWithTime )* | valueExpr )
                    int alt291=2;
                    int LA291_0 = input.LA(1);

                    if ( (LA291_0==IDENT) ) {
                        alt291=1;
                    }
                    else if ( ((LA291_0>=IN_SET && LA291_0<=REGEXP)||LA291_0==NOT_EXPR||(LA291_0>=SUM && LA291_0<=AVG)||(LA291_0>=COALESCE && LA291_0<=COUNT)||(LA291_0>=CASE && LA291_0<=CASE2)||LA291_0==ISTREAM||(LA291_0>=PREVIOUS && LA291_0<=EXISTS)||(LA291_0>=INSTANCEOF && LA291_0<=CURRENT_TIMESTAMP)||LA291_0==NEWKW||(LA291_0>=EVAL_AND_EXPR && LA291_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA291_0==EVENT_PROP_EXPR||LA291_0==CONCAT||(LA291_0>=LIB_FUNC_CHAIN && LA291_0<=DOT_EXPR)||LA291_0==ARRAY_EXPR||(LA291_0>=NOT_IN_SET && LA291_0<=NOT_REGEXP)||(LA291_0>=IN_RANGE && LA291_0<=SUBSELECT_EXPR)||(LA291_0>=EXISTS_SUBSELECT_EXPR && LA291_0<=NOT_IN_SUBSELECT_EXPR)||LA291_0==SUBSTITUTION||(LA291_0>=FIRST_AGGREG && LA291_0<=WINDOW_AGGREG)||(LA291_0>=INT_TYPE && LA291_0<=NULL_TYPE)||(LA291_0>=JSON_OBJECT && LA291_0<=JSON_ARRAY)||LA291_0==STAR||(LA291_0>=LT && LA291_0<=GT)||(LA291_0>=BOR && LA291_0<=PLUS)||(LA291_0>=BAND && LA291_0<=BXOR)||(LA291_0>=LE && LA291_0<=GE)||(LA291_0>=MINUS && LA291_0<=MOD)||(LA291_0>=EVAL_IS_GROUP_EXPR && LA291_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                        alt291=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 291, 0, input);

                        throw nvae;
                    }
                    switch (alt291) {
                        case 1 :
                            // EsperEPL2Ast.g:817:33: IDENT IDENT ( valueExprWithTime )*
                            {
                            match(input,IDENT,FOLLOW_IDENT_in_exprChoice5642); 
                            match(input,IDENT,FOLLOW_IDENT_in_exprChoice5644); 
                            // EsperEPL2Ast.g:817:45: ( valueExprWithTime )*
                            loop290:
                            do {
                                int alt290=2;
                                int LA290_0 = input.LA(1);

                                if ( ((LA290_0>=IN_SET && LA290_0<=REGEXP)||LA290_0==NOT_EXPR||(LA290_0>=SUM && LA290_0<=AVG)||(LA290_0>=COALESCE && LA290_0<=COUNT)||(LA290_0>=CASE && LA290_0<=CASE2)||LA290_0==LAST||LA290_0==ISTREAM||(LA290_0>=PREVIOUS && LA290_0<=EXISTS)||(LA290_0>=LW && LA290_0<=CURRENT_TIMESTAMP)||LA290_0==NEWKW||(LA290_0>=NUMERIC_PARAM_RANGE && LA290_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA290_0>=EVAL_AND_EXPR && LA290_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA290_0==EVENT_PROP_EXPR||LA290_0==CONCAT||(LA290_0>=LIB_FUNC_CHAIN && LA290_0<=DOT_EXPR)||(LA290_0>=TIME_PERIOD && LA290_0<=ARRAY_EXPR)||(LA290_0>=NOT_IN_SET && LA290_0<=NOT_REGEXP)||(LA290_0>=IN_RANGE && LA290_0<=SUBSELECT_EXPR)||(LA290_0>=EXISTS_SUBSELECT_EXPR && LA290_0<=NOT_IN_SUBSELECT_EXPR)||(LA290_0>=LAST_OPERATOR && LA290_0<=SUBSTITUTION)||LA290_0==NUMBERSETSTAR||(LA290_0>=FIRST_AGGREG && LA290_0<=WINDOW_AGGREG)||(LA290_0>=INT_TYPE && LA290_0<=NULL_TYPE)||(LA290_0>=JSON_OBJECT && LA290_0<=JSON_ARRAY)||LA290_0==STAR||(LA290_0>=LT && LA290_0<=GT)||(LA290_0>=BOR && LA290_0<=PLUS)||(LA290_0>=BAND && LA290_0<=BXOR)||(LA290_0>=LE && LA290_0<=GE)||(LA290_0>=MINUS && LA290_0<=MOD)||(LA290_0>=EVAL_IS_GROUP_EXPR && LA290_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                                    alt290=1;
                                }


                                switch (alt290) {
                            	case 1 :
                            	    // EsperEPL2Ast.g:817:45: valueExprWithTime
                            	    {
                            	    pushFollow(FOLLOW_valueExprWithTime_in_exprChoice5646);
                            	    valueExprWithTime();

                            	    state._fsp--;


                            	    }
                            	    break;

                            	default :
                            	    break loop290;
                                }
                            } while (true);


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:817:66: valueExpr
                            {
                            pushFollow(FOLLOW_valueExpr_in_exprChoice5651);
                            valueExpr();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(g); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:818:4: ^(m= MATCH_UNTIL_EXPR ( matchUntilRange )? exprChoice ( exprChoice )? )
                    {
                    m=(CommonTree)match(input,MATCH_UNTIL_EXPR,FOLLOW_MATCH_UNTIL_EXPR_in_exprChoice5665); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:818:26: ( matchUntilRange )?
                    int alt292=2;
                    int LA292_0 = input.LA(1);

                    if ( ((LA292_0>=MATCH_UNTIL_RANGE_HALFOPEN && LA292_0<=MATCH_UNTIL_RANGE_BOUNDED)) ) {
                        alt292=1;
                    }
                    switch (alt292) {
                        case 1 :
                            // EsperEPL2Ast.g:818:26: matchUntilRange
                            {
                            pushFollow(FOLLOW_matchUntilRange_in_exprChoice5667);
                            matchUntilRange();

                            state._fsp--;


                            }
                            break;

                    }

                    pushFollow(FOLLOW_exprChoice_in_exprChoice5670);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:818:54: ( exprChoice )?
                    int alt293=2;
                    int LA293_0 = input.LA(1);

                    if ( ((LA293_0>=OR_EXPR && LA293_0<=AND_EXPR)||(LA293_0>=EVERY_EXPR && LA293_0<=EVERY_DISTINCT_EXPR)||LA293_0==FOLLOWED_BY_EXPR||(LA293_0>=PATTERN_FILTER_EXPR && LA293_0<=PATTERN_NOT_EXPR)||(LA293_0>=GUARD_EXPR && LA293_0<=OBSERVER_EXPR)||LA293_0==MATCH_UNTIL_EXPR) ) {
                        alt293=1;
                    }
                    switch (alt293) {
                        case 1 :
                            // EsperEPL2Ast.g:818:54: exprChoice
                            {
                            pushFollow(FOLLOW_exprChoice_in_exprChoice5672);
                            exprChoice();

                            state._fsp--;


                            }
                            break;

                    }

                     leaveNode(m); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "exprChoice"


    // $ANTLR start "distinctExpressions"
    // EsperEPL2Ast.g:822:1: distinctExpressions : ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ ) ;
    public final void distinctExpressions() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:823:2: ( ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ ) )
            // EsperEPL2Ast.g:823:4: ^( PATTERN_EVERY_DISTINCT_EXPR ( valueExprWithTime )+ )
            {
            match(input,PATTERN_EVERY_DISTINCT_EXPR,FOLLOW_PATTERN_EVERY_DISTINCT_EXPR_in_distinctExpressions5693); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:823:35: ( valueExprWithTime )+
            int cnt295=0;
            loop295:
            do {
                int alt295=2;
                int LA295_0 = input.LA(1);

                if ( ((LA295_0>=IN_SET && LA295_0<=REGEXP)||LA295_0==NOT_EXPR||(LA295_0>=SUM && LA295_0<=AVG)||(LA295_0>=COALESCE && LA295_0<=COUNT)||(LA295_0>=CASE && LA295_0<=CASE2)||LA295_0==LAST||LA295_0==ISTREAM||(LA295_0>=PREVIOUS && LA295_0<=EXISTS)||(LA295_0>=LW && LA295_0<=CURRENT_TIMESTAMP)||LA295_0==NEWKW||(LA295_0>=NUMERIC_PARAM_RANGE && LA295_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA295_0>=EVAL_AND_EXPR && LA295_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA295_0==EVENT_PROP_EXPR||LA295_0==CONCAT||(LA295_0>=LIB_FUNC_CHAIN && LA295_0<=DOT_EXPR)||(LA295_0>=TIME_PERIOD && LA295_0<=ARRAY_EXPR)||(LA295_0>=NOT_IN_SET && LA295_0<=NOT_REGEXP)||(LA295_0>=IN_RANGE && LA295_0<=SUBSELECT_EXPR)||(LA295_0>=EXISTS_SUBSELECT_EXPR && LA295_0<=NOT_IN_SUBSELECT_EXPR)||(LA295_0>=LAST_OPERATOR && LA295_0<=SUBSTITUTION)||LA295_0==NUMBERSETSTAR||(LA295_0>=FIRST_AGGREG && LA295_0<=WINDOW_AGGREG)||(LA295_0>=INT_TYPE && LA295_0<=NULL_TYPE)||(LA295_0>=JSON_OBJECT && LA295_0<=JSON_ARRAY)||LA295_0==STAR||(LA295_0>=LT && LA295_0<=GT)||(LA295_0>=BOR && LA295_0<=PLUS)||(LA295_0>=BAND && LA295_0<=BXOR)||(LA295_0>=LE && LA295_0<=GE)||(LA295_0>=MINUS && LA295_0<=MOD)||(LA295_0>=EVAL_IS_GROUP_EXPR && LA295_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt295=1;
                }


                switch (alt295) {
            	case 1 :
            	    // EsperEPL2Ast.g:823:35: valueExprWithTime
            	    {
            	    pushFollow(FOLLOW_valueExprWithTime_in_distinctExpressions5695);
            	    valueExprWithTime();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt295 >= 1 ) break loop295;
                        EarlyExitException eee =
                            new EarlyExitException(295, input);
                        throw eee;
                }
                cnt295++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "distinctExpressions"


    // $ANTLR start "patternOp"
    // EsperEPL2Ast.g:826:1: patternOp : ( ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* ) | ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* ) | ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* ) );
    public final void patternOp() throws RecognitionException {
        CommonTree f=null;
        CommonTree o=null;
        CommonTree a=null;

        try {
            // EsperEPL2Ast.g:827:2: ( ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* ) | ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* ) | ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* ) )
            int alt299=3;
            switch ( input.LA(1) ) {
            case FOLLOWED_BY_EXPR:
                {
                alt299=1;
                }
                break;
            case OR_EXPR:
                {
                alt299=2;
                }
                break;
            case AND_EXPR:
                {
                alt299=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 299, 0, input);

                throw nvae;
            }

            switch (alt299) {
                case 1 :
                    // EsperEPL2Ast.g:827:4: ^(f= FOLLOWED_BY_EXPR followedByItem followedByItem ( followedByItem )* )
                    {
                    f=(CommonTree)match(input,FOLLOWED_BY_EXPR,FOLLOW_FOLLOWED_BY_EXPR_in_patternOp5714); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_followedByItem_in_patternOp5716);
                    followedByItem();

                    state._fsp--;

                    pushFollow(FOLLOW_followedByItem_in_patternOp5718);
                    followedByItem();

                    state._fsp--;

                    // EsperEPL2Ast.g:827:56: ( followedByItem )*
                    loop296:
                    do {
                        int alt296=2;
                        int LA296_0 = input.LA(1);

                        if ( (LA296_0==FOLLOWED_BY_ITEM) ) {
                            alt296=1;
                        }


                        switch (alt296) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:827:57: followedByItem
                    	    {
                    	    pushFollow(FOLLOW_followedByItem_in_patternOp5721);
                    	    followedByItem();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop296;
                        }
                    } while (true);

                     leaveNode(f); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:828:5: ^(o= OR_EXPR exprChoice exprChoice ( exprChoice )* )
                    {
                    o=(CommonTree)match(input,OR_EXPR,FOLLOW_OR_EXPR_in_patternOp5737); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_patternOp5739);
                    exprChoice();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_patternOp5741);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:828:40: ( exprChoice )*
                    loop297:
                    do {
                        int alt297=2;
                        int LA297_0 = input.LA(1);

                        if ( ((LA297_0>=OR_EXPR && LA297_0<=AND_EXPR)||(LA297_0>=EVERY_EXPR && LA297_0<=EVERY_DISTINCT_EXPR)||LA297_0==FOLLOWED_BY_EXPR||(LA297_0>=PATTERN_FILTER_EXPR && LA297_0<=PATTERN_NOT_EXPR)||(LA297_0>=GUARD_EXPR && LA297_0<=OBSERVER_EXPR)||LA297_0==MATCH_UNTIL_EXPR) ) {
                            alt297=1;
                        }


                        switch (alt297) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:828:41: exprChoice
                    	    {
                    	    pushFollow(FOLLOW_exprChoice_in_patternOp5744);
                    	    exprChoice();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop297;
                        }
                    } while (true);

                     leaveNode(o); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:829:5: ^(a= AND_EXPR exprChoice exprChoice ( exprChoice )* )
                    {
                    a=(CommonTree)match(input,AND_EXPR,FOLLOW_AND_EXPR_in_patternOp5760); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_exprChoice_in_patternOp5762);
                    exprChoice();

                    state._fsp--;

                    pushFollow(FOLLOW_exprChoice_in_patternOp5764);
                    exprChoice();

                    state._fsp--;

                    // EsperEPL2Ast.g:829:41: ( exprChoice )*
                    loop298:
                    do {
                        int alt298=2;
                        int LA298_0 = input.LA(1);

                        if ( ((LA298_0>=OR_EXPR && LA298_0<=AND_EXPR)||(LA298_0>=EVERY_EXPR && LA298_0<=EVERY_DISTINCT_EXPR)||LA298_0==FOLLOWED_BY_EXPR||(LA298_0>=PATTERN_FILTER_EXPR && LA298_0<=PATTERN_NOT_EXPR)||(LA298_0>=GUARD_EXPR && LA298_0<=OBSERVER_EXPR)||LA298_0==MATCH_UNTIL_EXPR) ) {
                            alt298=1;
                        }


                        switch (alt298) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:829:42: exprChoice
                    	    {
                    	    pushFollow(FOLLOW_exprChoice_in_patternOp5767);
                    	    exprChoice();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop298;
                        }
                    } while (true);

                     leaveNode(a); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "patternOp"


    // $ANTLR start "followedByItem"
    // EsperEPL2Ast.g:832:1: followedByItem : ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice ) ;
    public final void followedByItem() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:833:2: ( ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice ) )
            // EsperEPL2Ast.g:833:4: ^( FOLLOWED_BY_ITEM ( valueExpr )? exprChoice )
            {
            match(input,FOLLOWED_BY_ITEM,FOLLOW_FOLLOWED_BY_ITEM_in_followedByItem5788); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:833:24: ( valueExpr )?
            int alt300=2;
            int LA300_0 = input.LA(1);

            if ( ((LA300_0>=IN_SET && LA300_0<=REGEXP)||LA300_0==NOT_EXPR||(LA300_0>=SUM && LA300_0<=AVG)||(LA300_0>=COALESCE && LA300_0<=COUNT)||(LA300_0>=CASE && LA300_0<=CASE2)||LA300_0==ISTREAM||(LA300_0>=PREVIOUS && LA300_0<=EXISTS)||(LA300_0>=INSTANCEOF && LA300_0<=CURRENT_TIMESTAMP)||LA300_0==NEWKW||(LA300_0>=EVAL_AND_EXPR && LA300_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA300_0==EVENT_PROP_EXPR||LA300_0==CONCAT||(LA300_0>=LIB_FUNC_CHAIN && LA300_0<=DOT_EXPR)||LA300_0==ARRAY_EXPR||(LA300_0>=NOT_IN_SET && LA300_0<=NOT_REGEXP)||(LA300_0>=IN_RANGE && LA300_0<=SUBSELECT_EXPR)||(LA300_0>=EXISTS_SUBSELECT_EXPR && LA300_0<=NOT_IN_SUBSELECT_EXPR)||LA300_0==SUBSTITUTION||(LA300_0>=FIRST_AGGREG && LA300_0<=WINDOW_AGGREG)||(LA300_0>=INT_TYPE && LA300_0<=NULL_TYPE)||(LA300_0>=JSON_OBJECT && LA300_0<=JSON_ARRAY)||LA300_0==STAR||(LA300_0>=LT && LA300_0<=GT)||(LA300_0>=BOR && LA300_0<=PLUS)||(LA300_0>=BAND && LA300_0<=BXOR)||(LA300_0>=LE && LA300_0<=GE)||(LA300_0>=MINUS && LA300_0<=MOD)||(LA300_0>=EVAL_IS_GROUP_EXPR && LA300_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                alt300=1;
            }
            switch (alt300) {
                case 1 :
                    // EsperEPL2Ast.g:833:24: valueExpr
                    {
                    pushFollow(FOLLOW_valueExpr_in_followedByItem5790);
                    valueExpr();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_exprChoice_in_followedByItem5793);
            exprChoice();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "followedByItem"


    // $ANTLR start "atomicExpr"
    // EsperEPL2Ast.g:836:1: atomicExpr : ( patternFilterExpr | ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* ) );
    public final void atomicExpr() throws RecognitionException {
        CommonTree ac=null;

        try {
            // EsperEPL2Ast.g:837:2: ( patternFilterExpr | ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* ) )
            int alt302=2;
            int LA302_0 = input.LA(1);

            if ( (LA302_0==PATTERN_FILTER_EXPR) ) {
                alt302=1;
            }
            else if ( (LA302_0==OBSERVER_EXPR) ) {
                alt302=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 302, 0, input);

                throw nvae;
            }
            switch (alt302) {
                case 1 :
                    // EsperEPL2Ast.g:837:4: patternFilterExpr
                    {
                    pushFollow(FOLLOW_patternFilterExpr_in_atomicExpr5807);
                    patternFilterExpr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:838:7: ^(ac= OBSERVER_EXPR IDENT IDENT ( valueExprWithTime )* )
                    {
                    ac=(CommonTree)match(input,OBSERVER_EXPR,FOLLOW_OBSERVER_EXPR_in_atomicExpr5819); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_atomicExpr5821); 
                    match(input,IDENT,FOLLOW_IDENT_in_atomicExpr5823); 
                    // EsperEPL2Ast.g:838:39: ( valueExprWithTime )*
                    loop301:
                    do {
                        int alt301=2;
                        int LA301_0 = input.LA(1);

                        if ( ((LA301_0>=IN_SET && LA301_0<=REGEXP)||LA301_0==NOT_EXPR||(LA301_0>=SUM && LA301_0<=AVG)||(LA301_0>=COALESCE && LA301_0<=COUNT)||(LA301_0>=CASE && LA301_0<=CASE2)||LA301_0==LAST||LA301_0==ISTREAM||(LA301_0>=PREVIOUS && LA301_0<=EXISTS)||(LA301_0>=LW && LA301_0<=CURRENT_TIMESTAMP)||LA301_0==NEWKW||(LA301_0>=NUMERIC_PARAM_RANGE && LA301_0<=OBJECT_PARAM_ORDERED_EXPR)||(LA301_0>=EVAL_AND_EXPR && LA301_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA301_0==EVENT_PROP_EXPR||LA301_0==CONCAT||(LA301_0>=LIB_FUNC_CHAIN && LA301_0<=DOT_EXPR)||(LA301_0>=TIME_PERIOD && LA301_0<=ARRAY_EXPR)||(LA301_0>=NOT_IN_SET && LA301_0<=NOT_REGEXP)||(LA301_0>=IN_RANGE && LA301_0<=SUBSELECT_EXPR)||(LA301_0>=EXISTS_SUBSELECT_EXPR && LA301_0<=NOT_IN_SUBSELECT_EXPR)||(LA301_0>=LAST_OPERATOR && LA301_0<=SUBSTITUTION)||LA301_0==NUMBERSETSTAR||(LA301_0>=FIRST_AGGREG && LA301_0<=WINDOW_AGGREG)||(LA301_0>=INT_TYPE && LA301_0<=NULL_TYPE)||(LA301_0>=JSON_OBJECT && LA301_0<=JSON_ARRAY)||LA301_0==STAR||(LA301_0>=LT && LA301_0<=GT)||(LA301_0>=BOR && LA301_0<=PLUS)||(LA301_0>=BAND && LA301_0<=BXOR)||(LA301_0>=LE && LA301_0<=GE)||(LA301_0>=MINUS && LA301_0<=MOD)||(LA301_0>=EVAL_IS_GROUP_EXPR && LA301_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                            alt301=1;
                        }


                        switch (alt301) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:838:39: valueExprWithTime
                    	    {
                    	    pushFollow(FOLLOW_valueExprWithTime_in_atomicExpr5825);
                    	    valueExprWithTime();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop301;
                        }
                    } while (true);

                     leaveNode(ac); 

                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "atomicExpr"


    // $ANTLR start "patternFilterExpr"
    // EsperEPL2Ast.g:841:1: patternFilterExpr : ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* ) ;
    public final void patternFilterExpr() throws RecognitionException {
        CommonTree f=null;

        try {
            // EsperEPL2Ast.g:842:2: ( ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* ) )
            // EsperEPL2Ast.g:842:4: ^(f= PATTERN_FILTER_EXPR ( IDENT )? CLASS_IDENT ( propertyExpression )? ( patternFilterAnno )? ( valueExpr )* )
            {
            f=(CommonTree)match(input,PATTERN_FILTER_EXPR,FOLLOW_PATTERN_FILTER_EXPR_in_patternFilterExpr5845); 

            match(input, Token.DOWN, null); 
            // EsperEPL2Ast.g:842:29: ( IDENT )?
            int alt303=2;
            int LA303_0 = input.LA(1);

            if ( (LA303_0==IDENT) ) {
                alt303=1;
            }
            switch (alt303) {
                case 1 :
                    // EsperEPL2Ast.g:842:29: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_patternFilterExpr5847); 

                    }
                    break;

            }

            match(input,CLASS_IDENT,FOLLOW_CLASS_IDENT_in_patternFilterExpr5850); 
            // EsperEPL2Ast.g:842:48: ( propertyExpression )?
            int alt304=2;
            int LA304_0 = input.LA(1);

            if ( (LA304_0==EVENT_FILTER_PROPERTY_EXPR) ) {
                alt304=1;
            }
            switch (alt304) {
                case 1 :
                    // EsperEPL2Ast.g:842:48: propertyExpression
                    {
                    pushFollow(FOLLOW_propertyExpression_in_patternFilterExpr5852);
                    propertyExpression();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:842:68: ( patternFilterAnno )?
            int alt305=2;
            int LA305_0 = input.LA(1);

            if ( (LA305_0==ATCHAR) ) {
                alt305=1;
            }
            switch (alt305) {
                case 1 :
                    // EsperEPL2Ast.g:842:68: patternFilterAnno
                    {
                    pushFollow(FOLLOW_patternFilterAnno_in_patternFilterExpr5855);
                    patternFilterAnno();

                    state._fsp--;


                    }
                    break;

            }

            // EsperEPL2Ast.g:842:87: ( valueExpr )*
            loop306:
            do {
                int alt306=2;
                int LA306_0 = input.LA(1);

                if ( ((LA306_0>=IN_SET && LA306_0<=REGEXP)||LA306_0==NOT_EXPR||(LA306_0>=SUM && LA306_0<=AVG)||(LA306_0>=COALESCE && LA306_0<=COUNT)||(LA306_0>=CASE && LA306_0<=CASE2)||LA306_0==ISTREAM||(LA306_0>=PREVIOUS && LA306_0<=EXISTS)||(LA306_0>=INSTANCEOF && LA306_0<=CURRENT_TIMESTAMP)||LA306_0==NEWKW||(LA306_0>=EVAL_AND_EXPR && LA306_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA306_0==EVENT_PROP_EXPR||LA306_0==CONCAT||(LA306_0>=LIB_FUNC_CHAIN && LA306_0<=DOT_EXPR)||LA306_0==ARRAY_EXPR||(LA306_0>=NOT_IN_SET && LA306_0<=NOT_REGEXP)||(LA306_0>=IN_RANGE && LA306_0<=SUBSELECT_EXPR)||(LA306_0>=EXISTS_SUBSELECT_EXPR && LA306_0<=NOT_IN_SUBSELECT_EXPR)||LA306_0==SUBSTITUTION||(LA306_0>=FIRST_AGGREG && LA306_0<=WINDOW_AGGREG)||(LA306_0>=INT_TYPE && LA306_0<=NULL_TYPE)||(LA306_0>=JSON_OBJECT && LA306_0<=JSON_ARRAY)||LA306_0==STAR||(LA306_0>=LT && LA306_0<=GT)||(LA306_0>=BOR && LA306_0<=PLUS)||(LA306_0>=BAND && LA306_0<=BXOR)||(LA306_0>=LE && LA306_0<=GE)||(LA306_0>=MINUS && LA306_0<=MOD)||(LA306_0>=EVAL_IS_GROUP_EXPR && LA306_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt306=1;
                }


                switch (alt306) {
            	case 1 :
            	    // EsperEPL2Ast.g:842:88: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_patternFilterExpr5859);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop306;
                }
            } while (true);

             leaveNode(f); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "patternFilterExpr"


    // $ANTLR start "patternFilterAnno"
    // EsperEPL2Ast.g:845:1: patternFilterAnno : ^( ATCHAR IDENT ( number )? ) ;
    public final void patternFilterAnno() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:846:2: ( ^( ATCHAR IDENT ( number )? ) )
            // EsperEPL2Ast.g:846:4: ^( ATCHAR IDENT ( number )? )
            {
            match(input,ATCHAR,FOLLOW_ATCHAR_in_patternFilterAnno5879); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_patternFilterAnno5881); 
            // EsperEPL2Ast.g:846:20: ( number )?
            int alt307=2;
            int LA307_0 = input.LA(1);

            if ( ((LA307_0>=INT_TYPE && LA307_0<=DOUBLE_TYPE)) ) {
                alt307=1;
            }
            switch (alt307) {
                case 1 :
                    // EsperEPL2Ast.g:846:20: number
                    {
                    pushFollow(FOLLOW_number_in_patternFilterAnno5883);
                    number();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "patternFilterAnno"


    // $ANTLR start "matchUntilRange"
    // EsperEPL2Ast.g:849:1: matchUntilRange : ( ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr ) | ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr ) );
    public final void matchUntilRange() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:850:2: ( ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr ) | ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr ) | ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr ) )
            int alt308=4;
            switch ( input.LA(1) ) {
            case MATCH_UNTIL_RANGE_CLOSED:
                {
                alt308=1;
                }
                break;
            case MATCH_UNTIL_RANGE_BOUNDED:
                {
                alt308=2;
                }
                break;
            case MATCH_UNTIL_RANGE_HALFCLOSED:
                {
                alt308=3;
                }
                break;
            case MATCH_UNTIL_RANGE_HALFOPEN:
                {
                alt308=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 308, 0, input);

                throw nvae;
            }

            switch (alt308) {
                case 1 :
                    // EsperEPL2Ast.g:850:4: ^( MATCH_UNTIL_RANGE_CLOSED valueExpr valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_CLOSED,FOLLOW_MATCH_UNTIL_RANGE_CLOSED_in_matchUntilRange5898); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5900);
                    valueExpr();

                    state._fsp--;

                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5902);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:851:5: ^( MATCH_UNTIL_RANGE_BOUNDED valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_BOUNDED,FOLLOW_MATCH_UNTIL_RANGE_BOUNDED_in_matchUntilRange5910); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5912);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:852:5: ^( MATCH_UNTIL_RANGE_HALFCLOSED valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_HALFCLOSED,FOLLOW_MATCH_UNTIL_RANGE_HALFCLOSED_in_matchUntilRange5920); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5922);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:853:4: ^( MATCH_UNTIL_RANGE_HALFOPEN valueExpr )
                    {
                    match(input,MATCH_UNTIL_RANGE_HALFOPEN,FOLLOW_MATCH_UNTIL_RANGE_HALFOPEN_in_matchUntilRange5929); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_valueExpr_in_matchUntilRange5931);
                    valueExpr();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "matchUntilRange"


    // $ANTLR start "filterParam"
    // EsperEPL2Ast.g:856:1: filterParam : ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* ) ;
    public final void filterParam() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:857:2: ( ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* ) )
            // EsperEPL2Ast.g:857:4: ^( EVENT_FILTER_PARAM valueExpr ( valueExpr )* )
            {
            match(input,EVENT_FILTER_PARAM,FOLLOW_EVENT_FILTER_PARAM_in_filterParam5944); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_filterParam5946);
            valueExpr();

            state._fsp--;

            // EsperEPL2Ast.g:857:35: ( valueExpr )*
            loop309:
            do {
                int alt309=2;
                int LA309_0 = input.LA(1);

                if ( ((LA309_0>=IN_SET && LA309_0<=REGEXP)||LA309_0==NOT_EXPR||(LA309_0>=SUM && LA309_0<=AVG)||(LA309_0>=COALESCE && LA309_0<=COUNT)||(LA309_0>=CASE && LA309_0<=CASE2)||LA309_0==ISTREAM||(LA309_0>=PREVIOUS && LA309_0<=EXISTS)||(LA309_0>=INSTANCEOF && LA309_0<=CURRENT_TIMESTAMP)||LA309_0==NEWKW||(LA309_0>=EVAL_AND_EXPR && LA309_0<=EVAL_NOTEQUALS_GROUP_EXPR)||LA309_0==EVENT_PROP_EXPR||LA309_0==CONCAT||(LA309_0>=LIB_FUNC_CHAIN && LA309_0<=DOT_EXPR)||LA309_0==ARRAY_EXPR||(LA309_0>=NOT_IN_SET && LA309_0<=NOT_REGEXP)||(LA309_0>=IN_RANGE && LA309_0<=SUBSELECT_EXPR)||(LA309_0>=EXISTS_SUBSELECT_EXPR && LA309_0<=NOT_IN_SUBSELECT_EXPR)||LA309_0==SUBSTITUTION||(LA309_0>=FIRST_AGGREG && LA309_0<=WINDOW_AGGREG)||(LA309_0>=INT_TYPE && LA309_0<=NULL_TYPE)||(LA309_0>=JSON_OBJECT && LA309_0<=JSON_ARRAY)||LA309_0==STAR||(LA309_0>=LT && LA309_0<=GT)||(LA309_0>=BOR && LA309_0<=PLUS)||(LA309_0>=BAND && LA309_0<=BXOR)||(LA309_0>=LE && LA309_0<=GE)||(LA309_0>=MINUS && LA309_0<=MOD)||(LA309_0>=EVAL_IS_GROUP_EXPR && LA309_0<=EVAL_ISNOT_GROUP_EXPR)) ) {
                    alt309=1;
                }


                switch (alt309) {
            	case 1 :
            	    // EsperEPL2Ast.g:857:36: valueExpr
            	    {
            	    pushFollow(FOLLOW_valueExpr_in_filterParam5949);
            	    valueExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop309;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "filterParam"


    // $ANTLR start "filterParamComparator"
    // EsperEPL2Ast.g:860:1: filterParamComparator : ( ^( EQUALS filterAtom ) | ^( NOT_EQUAL filterAtom ) | ^( LT filterAtom ) | ^( LE filterAtom ) | ^( GT filterAtom ) | ^( GE filterAtom ) | ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) | ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) );
    public final void filterParamComparator() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:861:2: ( ^( EQUALS filterAtom ) | ^( NOT_EQUAL filterAtom ) | ^( LT filterAtom ) | ^( LE filterAtom ) | ^( GT filterAtom ) | ^( GE filterAtom ) | ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) ) | ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) | ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ) )
            int alt322=12;
            switch ( input.LA(1) ) {
            case EQUALS:
                {
                alt322=1;
                }
                break;
            case NOT_EQUAL:
                {
                alt322=2;
                }
                break;
            case LT:
                {
                alt322=3;
                }
                break;
            case LE:
                {
                alt322=4;
                }
                break;
            case GT:
                {
                alt322=5;
                }
                break;
            case GE:
                {
                alt322=6;
                }
                break;
            case EVENT_FILTER_RANGE:
                {
                alt322=7;
                }
                break;
            case EVENT_FILTER_NOT_RANGE:
                {
                alt322=8;
                }
                break;
            case EVENT_FILTER_IN:
                {
                alt322=9;
                }
                break;
            case EVENT_FILTER_NOT_IN:
                {
                alt322=10;
                }
                break;
            case EVENT_FILTER_BETWEEN:
                {
                alt322=11;
                }
                break;
            case EVENT_FILTER_NOT_BETWEEN:
                {
                alt322=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 322, 0, input);

                throw nvae;
            }

            switch (alt322) {
                case 1 :
                    // EsperEPL2Ast.g:861:4: ^( EQUALS filterAtom )
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_filterParamComparator5965); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5967);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:862:4: ^( NOT_EQUAL filterAtom )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_filterParamComparator5974); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5976);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:863:4: ^( LT filterAtom )
                    {
                    match(input,LT,FOLLOW_LT_in_filterParamComparator5983); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5985);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:864:4: ^( LE filterAtom )
                    {
                    match(input,LE,FOLLOW_LE_in_filterParamComparator5992); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator5994);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:865:4: ^( GT filterAtom )
                    {
                    match(input,GT,FOLLOW_GT_in_filterParamComparator6001); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator6003);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:866:4: ^( GE filterAtom )
                    {
                    match(input,GE,FOLLOW_GE_in_filterParamComparator6010); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_filterAtom_in_filterParamComparator6012);
                    filterAtom();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:867:4: ^( EVENT_FILTER_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_RANGE,FOLLOW_EVENT_FILTER_RANGE_in_filterParamComparator6019); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:867:41: ( constant[false] | filterIdentifier )
                    int alt310=2;
                    int LA310_0 = input.LA(1);

                    if ( ((LA310_0>=INT_TYPE && LA310_0<=NULL_TYPE)) ) {
                        alt310=1;
                    }
                    else if ( (LA310_0==EVENT_FILTER_IDENT) ) {
                        alt310=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 310, 0, input);

                        throw nvae;
                    }
                    switch (alt310) {
                        case 1 :
                            // EsperEPL2Ast.g:867:42: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6028);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:867:58: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6031);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:867:76: ( constant[false] | filterIdentifier )
                    int alt311=2;
                    int LA311_0 = input.LA(1);

                    if ( ((LA311_0>=INT_TYPE && LA311_0<=NULL_TYPE)) ) {
                        alt311=1;
                    }
                    else if ( (LA311_0==EVENT_FILTER_IDENT) ) {
                        alt311=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 311, 0, input);

                        throw nvae;
                    }
                    switch (alt311) {
                        case 1 :
                            // EsperEPL2Ast.g:867:77: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6035);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:867:93: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6038);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:868:4: ^( EVENT_FILTER_NOT_RANGE ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_NOT_RANGE,FOLLOW_EVENT_FILTER_NOT_RANGE_in_filterParamComparator6052); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:868:45: ( constant[false] | filterIdentifier )
                    int alt312=2;
                    int LA312_0 = input.LA(1);

                    if ( ((LA312_0>=INT_TYPE && LA312_0<=NULL_TYPE)) ) {
                        alt312=1;
                    }
                    else if ( (LA312_0==EVENT_FILTER_IDENT) ) {
                        alt312=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 312, 0, input);

                        throw nvae;
                    }
                    switch (alt312) {
                        case 1 :
                            // EsperEPL2Ast.g:868:46: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6061);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:868:62: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6064);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:868:80: ( constant[false] | filterIdentifier )
                    int alt313=2;
                    int LA313_0 = input.LA(1);

                    if ( ((LA313_0>=INT_TYPE && LA313_0<=NULL_TYPE)) ) {
                        alt313=1;
                    }
                    else if ( (LA313_0==EVENT_FILTER_IDENT) ) {
                        alt313=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 313, 0, input);

                        throw nvae;
                    }
                    switch (alt313) {
                        case 1 :
                            // EsperEPL2Ast.g:868:81: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6068);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:868:97: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6071);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 9 :
                    // EsperEPL2Ast.g:869:4: ^( EVENT_FILTER_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_IN,FOLLOW_EVENT_FILTER_IN_in_filterParamComparator6085); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:869:38: ( constant[false] | filterIdentifier )
                    int alt314=2;
                    int LA314_0 = input.LA(1);

                    if ( ((LA314_0>=INT_TYPE && LA314_0<=NULL_TYPE)) ) {
                        alt314=1;
                    }
                    else if ( (LA314_0==EVENT_FILTER_IDENT) ) {
                        alt314=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 314, 0, input);

                        throw nvae;
                    }
                    switch (alt314) {
                        case 1 :
                            // EsperEPL2Ast.g:869:39: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6094);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:869:55: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6097);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:869:73: ( constant[false] | filterIdentifier )*
                    loop315:
                    do {
                        int alt315=3;
                        int LA315_0 = input.LA(1);

                        if ( ((LA315_0>=INT_TYPE && LA315_0<=NULL_TYPE)) ) {
                            alt315=1;
                        }
                        else if ( (LA315_0==EVENT_FILTER_IDENT) ) {
                            alt315=2;
                        }


                        switch (alt315) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:869:74: constant[false]
                    	    {
                    	    pushFollow(FOLLOW_constant_in_filterParamComparator6101);
                    	    constant(false);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // EsperEPL2Ast.g:869:90: filterIdentifier
                    	    {
                    	    pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6104);
                    	    filterIdentifier();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop315;
                        }
                    } while (true);

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 10 :
                    // EsperEPL2Ast.g:870:4: ^( EVENT_FILTER_NOT_IN ( LPAREN | LBRACK ) ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier )* ( RPAREN | RBRACK ) )
                    {
                    match(input,EVENT_FILTER_NOT_IN,FOLLOW_EVENT_FILTER_NOT_IN_in_filterParamComparator6119); 

                    match(input, Token.DOWN, null); 
                    if ( input.LA(1)==LBRACK||input.LA(1)==LPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // EsperEPL2Ast.g:870:42: ( constant[false] | filterIdentifier )
                    int alt316=2;
                    int LA316_0 = input.LA(1);

                    if ( ((LA316_0>=INT_TYPE && LA316_0<=NULL_TYPE)) ) {
                        alt316=1;
                    }
                    else if ( (LA316_0==EVENT_FILTER_IDENT) ) {
                        alt316=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 316, 0, input);

                        throw nvae;
                    }
                    switch (alt316) {
                        case 1 :
                            // EsperEPL2Ast.g:870:43: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6128);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:870:59: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6131);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:870:77: ( constant[false] | filterIdentifier )*
                    loop317:
                    do {
                        int alt317=3;
                        int LA317_0 = input.LA(1);

                        if ( ((LA317_0>=INT_TYPE && LA317_0<=NULL_TYPE)) ) {
                            alt317=1;
                        }
                        else if ( (LA317_0==EVENT_FILTER_IDENT) ) {
                            alt317=2;
                        }


                        switch (alt317) {
                    	case 1 :
                    	    // EsperEPL2Ast.g:870:78: constant[false]
                    	    {
                    	    pushFollow(FOLLOW_constant_in_filterParamComparator6135);
                    	    constant(false);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // EsperEPL2Ast.g:870:94: filterIdentifier
                    	    {
                    	    pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6138);
                    	    filterIdentifier();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop317;
                        }
                    } while (true);

                    if ( input.LA(1)==RBRACK||input.LA(1)==RPAREN ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 11 :
                    // EsperEPL2Ast.g:871:4: ^( EVENT_FILTER_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) )
                    {
                    match(input,EVENT_FILTER_BETWEEN,FOLLOW_EVENT_FILTER_BETWEEN_in_filterParamComparator6153); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:871:27: ( constant[false] | filterIdentifier )
                    int alt318=2;
                    int LA318_0 = input.LA(1);

                    if ( ((LA318_0>=INT_TYPE && LA318_0<=NULL_TYPE)) ) {
                        alt318=1;
                    }
                    else if ( (LA318_0==EVENT_FILTER_IDENT) ) {
                        alt318=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 318, 0, input);

                        throw nvae;
                    }
                    switch (alt318) {
                        case 1 :
                            // EsperEPL2Ast.g:871:28: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6156);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:871:44: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6159);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:871:62: ( constant[false] | filterIdentifier )
                    int alt319=2;
                    int LA319_0 = input.LA(1);

                    if ( ((LA319_0>=INT_TYPE && LA319_0<=NULL_TYPE)) ) {
                        alt319=1;
                    }
                    else if ( (LA319_0==EVENT_FILTER_IDENT) ) {
                        alt319=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 319, 0, input);

                        throw nvae;
                    }
                    switch (alt319) {
                        case 1 :
                            // EsperEPL2Ast.g:871:63: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6163);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:871:79: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6166);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 12 :
                    // EsperEPL2Ast.g:872:4: ^( EVENT_FILTER_NOT_BETWEEN ( constant[false] | filterIdentifier ) ( constant[false] | filterIdentifier ) )
                    {
                    match(input,EVENT_FILTER_NOT_BETWEEN,FOLLOW_EVENT_FILTER_NOT_BETWEEN_in_filterParamComparator6174); 

                    match(input, Token.DOWN, null); 
                    // EsperEPL2Ast.g:872:31: ( constant[false] | filterIdentifier )
                    int alt320=2;
                    int LA320_0 = input.LA(1);

                    if ( ((LA320_0>=INT_TYPE && LA320_0<=NULL_TYPE)) ) {
                        alt320=1;
                    }
                    else if ( (LA320_0==EVENT_FILTER_IDENT) ) {
                        alt320=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 320, 0, input);

                        throw nvae;
                    }
                    switch (alt320) {
                        case 1 :
                            // EsperEPL2Ast.g:872:32: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6177);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:872:48: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6180);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:872:66: ( constant[false] | filterIdentifier )
                    int alt321=2;
                    int LA321_0 = input.LA(1);

                    if ( ((LA321_0>=INT_TYPE && LA321_0<=NULL_TYPE)) ) {
                        alt321=1;
                    }
                    else if ( (LA321_0==EVENT_FILTER_IDENT) ) {
                        alt321=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 321, 0, input);

                        throw nvae;
                    }
                    switch (alt321) {
                        case 1 :
                            // EsperEPL2Ast.g:872:67: constant[false]
                            {
                            pushFollow(FOLLOW_constant_in_filterParamComparator6184);
                            constant(false);

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // EsperEPL2Ast.g:872:83: filterIdentifier
                            {
                            pushFollow(FOLLOW_filterIdentifier_in_filterParamComparator6187);
                            filterIdentifier();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "filterParamComparator"


    // $ANTLR start "filterAtom"
    // EsperEPL2Ast.g:875:1: filterAtom : ( constant[false] | filterIdentifier );
    public final void filterAtom() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:876:2: ( constant[false] | filterIdentifier )
            int alt323=2;
            int LA323_0 = input.LA(1);

            if ( ((LA323_0>=INT_TYPE && LA323_0<=NULL_TYPE)) ) {
                alt323=1;
            }
            else if ( (LA323_0==EVENT_FILTER_IDENT) ) {
                alt323=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 323, 0, input);

                throw nvae;
            }
            switch (alt323) {
                case 1 :
                    // EsperEPL2Ast.g:876:4: constant[false]
                    {
                    pushFollow(FOLLOW_constant_in_filterAtom6201);
                    constant(false);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:877:4: filterIdentifier
                    {
                    pushFollow(FOLLOW_filterIdentifier_in_filterAtom6207);
                    filterIdentifier();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "filterAtom"


    // $ANTLR start "filterIdentifier"
    // EsperEPL2Ast.g:879:1: filterIdentifier : ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] ) ;
    public final void filterIdentifier() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:880:2: ( ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] ) )
            // EsperEPL2Ast.g:880:4: ^( EVENT_FILTER_IDENT IDENT eventPropertyExpr[true] )
            {
            match(input,EVENT_FILTER_IDENT,FOLLOW_EVENT_FILTER_IDENT_in_filterIdentifier6218); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_filterIdentifier6220); 
            pushFollow(FOLLOW_eventPropertyExpr_in_filterIdentifier6222);
            eventPropertyExpr(true);

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "filterIdentifier"


    // $ANTLR start "eventPropertyExpr"
    // EsperEPL2Ast.g:883:1: eventPropertyExpr[boolean isLeaveNode] : ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* ) ;
    public final void eventPropertyExpr(boolean isLeaveNode) throws RecognitionException {
        CommonTree p=null;

        try {
            // EsperEPL2Ast.g:884:2: ( ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* ) )
            // EsperEPL2Ast.g:884:4: ^(p= EVENT_PROP_EXPR eventPropertyAtomic ( eventPropertyAtomic )* )
            {
            p=(CommonTree)match(input,EVENT_PROP_EXPR,FOLLOW_EVENT_PROP_EXPR_in_eventPropertyExpr6241); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_eventPropertyAtomic_in_eventPropertyExpr6243);
            eventPropertyAtomic();

            state._fsp--;

            // EsperEPL2Ast.g:884:44: ( eventPropertyAtomic )*
            loop324:
            do {
                int alt324=2;
                int LA324_0 = input.LA(1);

                if ( ((LA324_0>=EVENT_PROP_SIMPLE && LA324_0<=EVENT_PROP_DYNAMIC_MAPPED)) ) {
                    alt324=1;
                }


                switch (alt324) {
            	case 1 :
            	    // EsperEPL2Ast.g:884:45: eventPropertyAtomic
            	    {
            	    pushFollow(FOLLOW_eventPropertyAtomic_in_eventPropertyExpr6246);
            	    eventPropertyAtomic();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop324;
                }
            } while (true);


            match(input, Token.UP, null); 
             if (isLeaveNode) leaveNode(p); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "eventPropertyExpr"


    // $ANTLR start "eventPropertyAtomic"
    // EsperEPL2Ast.g:887:1: eventPropertyAtomic : ( ^( EVENT_PROP_SIMPLE IDENT ) | ^( EVENT_PROP_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) | ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT ) | ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) );
    public final void eventPropertyAtomic() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:888:2: ( ^( EVENT_PROP_SIMPLE IDENT ) | ^( EVENT_PROP_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) | ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT ) | ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT ) | ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) ) )
            int alt325=6;
            switch ( input.LA(1) ) {
            case EVENT_PROP_SIMPLE:
                {
                alt325=1;
                }
                break;
            case EVENT_PROP_INDEXED:
                {
                alt325=2;
                }
                break;
            case EVENT_PROP_MAPPED:
                {
                alt325=3;
                }
                break;
            case EVENT_PROP_DYNAMIC_SIMPLE:
                {
                alt325=4;
                }
                break;
            case EVENT_PROP_DYNAMIC_INDEXED:
                {
                alt325=5;
                }
                break;
            case EVENT_PROP_DYNAMIC_MAPPED:
                {
                alt325=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 325, 0, input);

                throw nvae;
            }

            switch (alt325) {
                case 1 :
                    // EsperEPL2Ast.g:888:4: ^( EVENT_PROP_SIMPLE IDENT )
                    {
                    match(input,EVENT_PROP_SIMPLE,FOLLOW_EVENT_PROP_SIMPLE_in_eventPropertyAtomic6265); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6267); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:889:4: ^( EVENT_PROP_INDEXED IDENT NUM_INT )
                    {
                    match(input,EVENT_PROP_INDEXED,FOLLOW_EVENT_PROP_INDEXED_in_eventPropertyAtomic6274); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6276); 
                    match(input,NUM_INT,FOLLOW_NUM_INT_in_eventPropertyAtomic6278); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:890:4: ^( EVENT_PROP_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) )
                    {
                    match(input,EVENT_PROP_MAPPED,FOLLOW_EVENT_PROP_MAPPED_in_eventPropertyAtomic6285); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6287); 
                    if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=QUOTED_STRING_LITERAL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:891:4: ^( EVENT_PROP_DYNAMIC_SIMPLE IDENT )
                    {
                    match(input,EVENT_PROP_DYNAMIC_SIMPLE,FOLLOW_EVENT_PROP_DYNAMIC_SIMPLE_in_eventPropertyAtomic6302); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6304); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:892:4: ^( EVENT_PROP_DYNAMIC_INDEXED IDENT NUM_INT )
                    {
                    match(input,EVENT_PROP_DYNAMIC_INDEXED,FOLLOW_EVENT_PROP_DYNAMIC_INDEXED_in_eventPropertyAtomic6311); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6313); 
                    match(input,NUM_INT,FOLLOW_NUM_INT_in_eventPropertyAtomic6315); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:893:4: ^( EVENT_PROP_DYNAMIC_MAPPED IDENT ( STRING_LITERAL | QUOTED_STRING_LITERAL ) )
                    {
                    match(input,EVENT_PROP_DYNAMIC_MAPPED,FOLLOW_EVENT_PROP_DYNAMIC_MAPPED_in_eventPropertyAtomic6322); 

                    match(input, Token.DOWN, null); 
                    match(input,IDENT,FOLLOW_IDENT_in_eventPropertyAtomic6324); 
                    if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=QUOTED_STRING_LITERAL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.UP, null); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "eventPropertyAtomic"


    // $ANTLR start "timePeriod"
    // EsperEPL2Ast.g:896:1: timePeriod : ^(t= TIME_PERIOD timePeriodDef ) ;
    public final void timePeriod() throws RecognitionException {
        CommonTree t=null;

        try {
            // EsperEPL2Ast.g:897:2: ( ^(t= TIME_PERIOD timePeriodDef ) )
            // EsperEPL2Ast.g:897:5: ^(t= TIME_PERIOD timePeriodDef )
            {
            t=(CommonTree)match(input,TIME_PERIOD,FOLLOW_TIME_PERIOD_in_timePeriod6351); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_timePeriodDef_in_timePeriod6353);
            timePeriodDef();

            state._fsp--;

             leaveNode(t); 

            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "timePeriod"


    // $ANTLR start "timePeriodDef"
    // EsperEPL2Ast.g:900:1: timePeriodDef : ( yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | hourPart ( minutePart )? ( secondPart )? ( millisecondPart )? | minutePart ( secondPart )? ( millisecondPart )? | secondPart ( millisecondPart )? | millisecondPart );
    public final void timePeriodDef() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:901:2: ( yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )? | hourPart ( minutePart )? ( secondPart )? ( millisecondPart )? | minutePart ( secondPart )? ( millisecondPart )? | secondPart ( millisecondPart )? | millisecondPart )
            int alt354=8;
            switch ( input.LA(1) ) {
            case YEAR_PART:
                {
                alt354=1;
                }
                break;
            case MONTH_PART:
                {
                alt354=2;
                }
                break;
            case WEEK_PART:
                {
                alt354=3;
                }
                break;
            case DAY_PART:
                {
                alt354=4;
                }
                break;
            case HOUR_PART:
                {
                alt354=5;
                }
                break;
            case MINUTE_PART:
                {
                alt354=6;
                }
                break;
            case SECOND_PART:
                {
                alt354=7;
                }
                break;
            case MILLISECOND_PART:
                {
                alt354=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 354, 0, input);

                throw nvae;
            }

            switch (alt354) {
                case 1 :
                    // EsperEPL2Ast.g:901:5: yearPart ( monthPart )? ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_yearPart_in_timePeriodDef6369);
                    yearPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:901:14: ( monthPart )?
                    int alt326=2;
                    int LA326_0 = input.LA(1);

                    if ( (LA326_0==MONTH_PART) ) {
                        alt326=1;
                    }
                    switch (alt326) {
                        case 1 :
                            // EsperEPL2Ast.g:901:15: monthPart
                            {
                            pushFollow(FOLLOW_monthPart_in_timePeriodDef6372);
                            monthPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:901:27: ( weekPart )?
                    int alt327=2;
                    int LA327_0 = input.LA(1);

                    if ( (LA327_0==WEEK_PART) ) {
                        alt327=1;
                    }
                    switch (alt327) {
                        case 1 :
                            // EsperEPL2Ast.g:901:28: weekPart
                            {
                            pushFollow(FOLLOW_weekPart_in_timePeriodDef6377);
                            weekPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:901:39: ( dayPart )?
                    int alt328=2;
                    int LA328_0 = input.LA(1);

                    if ( (LA328_0==DAY_PART) ) {
                        alt328=1;
                    }
                    switch (alt328) {
                        case 1 :
                            // EsperEPL2Ast.g:901:40: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef6382);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:901:50: ( hourPart )?
                    int alt329=2;
                    int LA329_0 = input.LA(1);

                    if ( (LA329_0==HOUR_PART) ) {
                        alt329=1;
                    }
                    switch (alt329) {
                        case 1 :
                            // EsperEPL2Ast.g:901:51: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef6387);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:901:62: ( minutePart )?
                    int alt330=2;
                    int LA330_0 = input.LA(1);

                    if ( (LA330_0==MINUTE_PART) ) {
                        alt330=1;
                    }
                    switch (alt330) {
                        case 1 :
                            // EsperEPL2Ast.g:901:63: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef6392);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:901:76: ( secondPart )?
                    int alt331=2;
                    int LA331_0 = input.LA(1);

                    if ( (LA331_0==SECOND_PART) ) {
                        alt331=1;
                    }
                    switch (alt331) {
                        case 1 :
                            // EsperEPL2Ast.g:901:77: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6397);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:901:90: ( millisecondPart )?
                    int alt332=2;
                    int LA332_0 = input.LA(1);

                    if ( (LA332_0==MILLISECOND_PART) ) {
                        alt332=1;
                    }
                    switch (alt332) {
                        case 1 :
                            // EsperEPL2Ast.g:901:91: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6402);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:902:5: monthPart ( weekPart )? ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_monthPart_in_timePeriodDef6410);
                    monthPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:902:15: ( weekPart )?
                    int alt333=2;
                    int LA333_0 = input.LA(1);

                    if ( (LA333_0==WEEK_PART) ) {
                        alt333=1;
                    }
                    switch (alt333) {
                        case 1 :
                            // EsperEPL2Ast.g:902:16: weekPart
                            {
                            pushFollow(FOLLOW_weekPart_in_timePeriodDef6413);
                            weekPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:902:27: ( dayPart )?
                    int alt334=2;
                    int LA334_0 = input.LA(1);

                    if ( (LA334_0==DAY_PART) ) {
                        alt334=1;
                    }
                    switch (alt334) {
                        case 1 :
                            // EsperEPL2Ast.g:902:28: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef6418);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:902:38: ( hourPart )?
                    int alt335=2;
                    int LA335_0 = input.LA(1);

                    if ( (LA335_0==HOUR_PART) ) {
                        alt335=1;
                    }
                    switch (alt335) {
                        case 1 :
                            // EsperEPL2Ast.g:902:39: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef6423);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:902:50: ( minutePart )?
                    int alt336=2;
                    int LA336_0 = input.LA(1);

                    if ( (LA336_0==MINUTE_PART) ) {
                        alt336=1;
                    }
                    switch (alt336) {
                        case 1 :
                            // EsperEPL2Ast.g:902:51: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef6428);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:902:64: ( secondPart )?
                    int alt337=2;
                    int LA337_0 = input.LA(1);

                    if ( (LA337_0==SECOND_PART) ) {
                        alt337=1;
                    }
                    switch (alt337) {
                        case 1 :
                            // EsperEPL2Ast.g:902:65: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6433);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:902:78: ( millisecondPart )?
                    int alt338=2;
                    int LA338_0 = input.LA(1);

                    if ( (LA338_0==MILLISECOND_PART) ) {
                        alt338=1;
                    }
                    switch (alt338) {
                        case 1 :
                            // EsperEPL2Ast.g:902:79: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6438);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:903:5: weekPart ( dayPart )? ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_weekPart_in_timePeriodDef6446);
                    weekPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:903:14: ( dayPart )?
                    int alt339=2;
                    int LA339_0 = input.LA(1);

                    if ( (LA339_0==DAY_PART) ) {
                        alt339=1;
                    }
                    switch (alt339) {
                        case 1 :
                            // EsperEPL2Ast.g:903:15: dayPart
                            {
                            pushFollow(FOLLOW_dayPart_in_timePeriodDef6449);
                            dayPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:903:25: ( hourPart )?
                    int alt340=2;
                    int LA340_0 = input.LA(1);

                    if ( (LA340_0==HOUR_PART) ) {
                        alt340=1;
                    }
                    switch (alt340) {
                        case 1 :
                            // EsperEPL2Ast.g:903:26: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef6454);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:903:37: ( minutePart )?
                    int alt341=2;
                    int LA341_0 = input.LA(1);

                    if ( (LA341_0==MINUTE_PART) ) {
                        alt341=1;
                    }
                    switch (alt341) {
                        case 1 :
                            // EsperEPL2Ast.g:903:38: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef6459);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:903:51: ( secondPart )?
                    int alt342=2;
                    int LA342_0 = input.LA(1);

                    if ( (LA342_0==SECOND_PART) ) {
                        alt342=1;
                    }
                    switch (alt342) {
                        case 1 :
                            // EsperEPL2Ast.g:903:52: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6464);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:903:65: ( millisecondPart )?
                    int alt343=2;
                    int LA343_0 = input.LA(1);

                    if ( (LA343_0==MILLISECOND_PART) ) {
                        alt343=1;
                    }
                    switch (alt343) {
                        case 1 :
                            // EsperEPL2Ast.g:903:66: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6469);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:904:5: dayPart ( hourPart )? ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_dayPart_in_timePeriodDef6477);
                    dayPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:904:13: ( hourPart )?
                    int alt344=2;
                    int LA344_0 = input.LA(1);

                    if ( (LA344_0==HOUR_PART) ) {
                        alt344=1;
                    }
                    switch (alt344) {
                        case 1 :
                            // EsperEPL2Ast.g:904:14: hourPart
                            {
                            pushFollow(FOLLOW_hourPart_in_timePeriodDef6480);
                            hourPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:904:25: ( minutePart )?
                    int alt345=2;
                    int LA345_0 = input.LA(1);

                    if ( (LA345_0==MINUTE_PART) ) {
                        alt345=1;
                    }
                    switch (alt345) {
                        case 1 :
                            // EsperEPL2Ast.g:904:26: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef6485);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:904:39: ( secondPart )?
                    int alt346=2;
                    int LA346_0 = input.LA(1);

                    if ( (LA346_0==SECOND_PART) ) {
                        alt346=1;
                    }
                    switch (alt346) {
                        case 1 :
                            // EsperEPL2Ast.g:904:40: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6490);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:904:53: ( millisecondPart )?
                    int alt347=2;
                    int LA347_0 = input.LA(1);

                    if ( (LA347_0==MILLISECOND_PART) ) {
                        alt347=1;
                    }
                    switch (alt347) {
                        case 1 :
                            // EsperEPL2Ast.g:904:54: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6495);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:905:4: hourPart ( minutePart )? ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_hourPart_in_timePeriodDef6502);
                    hourPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:905:13: ( minutePart )?
                    int alt348=2;
                    int LA348_0 = input.LA(1);

                    if ( (LA348_0==MINUTE_PART) ) {
                        alt348=1;
                    }
                    switch (alt348) {
                        case 1 :
                            // EsperEPL2Ast.g:905:14: minutePart
                            {
                            pushFollow(FOLLOW_minutePart_in_timePeriodDef6505);
                            minutePart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:905:27: ( secondPart )?
                    int alt349=2;
                    int LA349_0 = input.LA(1);

                    if ( (LA349_0==SECOND_PART) ) {
                        alt349=1;
                    }
                    switch (alt349) {
                        case 1 :
                            // EsperEPL2Ast.g:905:28: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6510);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:905:41: ( millisecondPart )?
                    int alt350=2;
                    int LA350_0 = input.LA(1);

                    if ( (LA350_0==MILLISECOND_PART) ) {
                        alt350=1;
                    }
                    switch (alt350) {
                        case 1 :
                            // EsperEPL2Ast.g:905:42: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6515);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:906:4: minutePart ( secondPart )? ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_minutePart_in_timePeriodDef6522);
                    minutePart();

                    state._fsp--;

                    // EsperEPL2Ast.g:906:15: ( secondPart )?
                    int alt351=2;
                    int LA351_0 = input.LA(1);

                    if ( (LA351_0==SECOND_PART) ) {
                        alt351=1;
                    }
                    switch (alt351) {
                        case 1 :
                            // EsperEPL2Ast.g:906:16: secondPart
                            {
                            pushFollow(FOLLOW_secondPart_in_timePeriodDef6525);
                            secondPart();

                            state._fsp--;


                            }
                            break;

                    }

                    // EsperEPL2Ast.g:906:29: ( millisecondPart )?
                    int alt352=2;
                    int LA352_0 = input.LA(1);

                    if ( (LA352_0==MILLISECOND_PART) ) {
                        alt352=1;
                    }
                    switch (alt352) {
                        case 1 :
                            // EsperEPL2Ast.g:906:30: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6530);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:907:4: secondPart ( millisecondPart )?
                    {
                    pushFollow(FOLLOW_secondPart_in_timePeriodDef6537);
                    secondPart();

                    state._fsp--;

                    // EsperEPL2Ast.g:907:15: ( millisecondPart )?
                    int alt353=2;
                    int LA353_0 = input.LA(1);

                    if ( (LA353_0==MILLISECOND_PART) ) {
                        alt353=1;
                    }
                    switch (alt353) {
                        case 1 :
                            // EsperEPL2Ast.g:907:16: millisecondPart
                            {
                            pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6540);
                            millisecondPart();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // EsperEPL2Ast.g:908:4: millisecondPart
                    {
                    pushFollow(FOLLOW_millisecondPart_in_timePeriodDef6547);
                    millisecondPart();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "timePeriodDef"


    // $ANTLR start "yearPart"
    // EsperEPL2Ast.g:911:1: yearPart : ^( YEAR_PART valueExpr ) ;
    public final void yearPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:912:2: ( ^( YEAR_PART valueExpr ) )
            // EsperEPL2Ast.g:912:4: ^( YEAR_PART valueExpr )
            {
            match(input,YEAR_PART,FOLLOW_YEAR_PART_in_yearPart6561); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_yearPart6563);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "yearPart"


    // $ANTLR start "monthPart"
    // EsperEPL2Ast.g:915:1: monthPart : ^( MONTH_PART valueExpr ) ;
    public final void monthPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:916:2: ( ^( MONTH_PART valueExpr ) )
            // EsperEPL2Ast.g:916:4: ^( MONTH_PART valueExpr )
            {
            match(input,MONTH_PART,FOLLOW_MONTH_PART_in_monthPart6578); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_monthPart6580);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "monthPart"


    // $ANTLR start "weekPart"
    // EsperEPL2Ast.g:919:1: weekPart : ^( WEEK_PART valueExpr ) ;
    public final void weekPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:920:2: ( ^( WEEK_PART valueExpr ) )
            // EsperEPL2Ast.g:920:4: ^( WEEK_PART valueExpr )
            {
            match(input,WEEK_PART,FOLLOW_WEEK_PART_in_weekPart6595); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_weekPart6597);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "weekPart"


    // $ANTLR start "dayPart"
    // EsperEPL2Ast.g:923:1: dayPart : ^( DAY_PART valueExpr ) ;
    public final void dayPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:924:2: ( ^( DAY_PART valueExpr ) )
            // EsperEPL2Ast.g:924:4: ^( DAY_PART valueExpr )
            {
            match(input,DAY_PART,FOLLOW_DAY_PART_in_dayPart6612); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_dayPart6614);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "dayPart"


    // $ANTLR start "hourPart"
    // EsperEPL2Ast.g:927:1: hourPart : ^( HOUR_PART valueExpr ) ;
    public final void hourPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:928:2: ( ^( HOUR_PART valueExpr ) )
            // EsperEPL2Ast.g:928:4: ^( HOUR_PART valueExpr )
            {
            match(input,HOUR_PART,FOLLOW_HOUR_PART_in_hourPart6629); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_hourPart6631);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "hourPart"


    // $ANTLR start "minutePart"
    // EsperEPL2Ast.g:931:1: minutePart : ^( MINUTE_PART valueExpr ) ;
    public final void minutePart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:932:2: ( ^( MINUTE_PART valueExpr ) )
            // EsperEPL2Ast.g:932:4: ^( MINUTE_PART valueExpr )
            {
            match(input,MINUTE_PART,FOLLOW_MINUTE_PART_in_minutePart6646); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_minutePart6648);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "minutePart"


    // $ANTLR start "secondPart"
    // EsperEPL2Ast.g:935:1: secondPart : ^( SECOND_PART valueExpr ) ;
    public final void secondPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:936:2: ( ^( SECOND_PART valueExpr ) )
            // EsperEPL2Ast.g:936:4: ^( SECOND_PART valueExpr )
            {
            match(input,SECOND_PART,FOLLOW_SECOND_PART_in_secondPart6663); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_secondPart6665);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "secondPart"


    // $ANTLR start "millisecondPart"
    // EsperEPL2Ast.g:939:1: millisecondPart : ^( MILLISECOND_PART valueExpr ) ;
    public final void millisecondPart() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:940:2: ( ^( MILLISECOND_PART valueExpr ) )
            // EsperEPL2Ast.g:940:4: ^( MILLISECOND_PART valueExpr )
            {
            match(input,MILLISECOND_PART,FOLLOW_MILLISECOND_PART_in_millisecondPart6680); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_valueExpr_in_millisecondPart6682);
            valueExpr();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "millisecondPart"


    // $ANTLR start "substitution"
    // EsperEPL2Ast.g:943:1: substitution : s= SUBSTITUTION ;
    public final void substitution() throws RecognitionException {
        CommonTree s=null;

        try {
            // EsperEPL2Ast.g:944:2: (s= SUBSTITUTION )
            // EsperEPL2Ast.g:944:4: s= SUBSTITUTION
            {
            s=(CommonTree)match(input,SUBSTITUTION,FOLLOW_SUBSTITUTION_in_substitution6697); 
             leaveNode(s); 

            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "substitution"


    // $ANTLR start "constant"
    // EsperEPL2Ast.g:947:1: constant[boolean isLeaveNode] : (c= INT_TYPE | c= LONG_TYPE | c= FLOAT_TYPE | c= DOUBLE_TYPE | c= STRING_TYPE | c= BOOL_TYPE | c= NULL_TYPE );
    public final void constant(boolean isLeaveNode) throws RecognitionException {
        CommonTree c=null;

        try {
            // EsperEPL2Ast.g:948:2: (c= INT_TYPE | c= LONG_TYPE | c= FLOAT_TYPE | c= DOUBLE_TYPE | c= STRING_TYPE | c= BOOL_TYPE | c= NULL_TYPE )
            int alt355=7;
            switch ( input.LA(1) ) {
            case INT_TYPE:
                {
                alt355=1;
                }
                break;
            case LONG_TYPE:
                {
                alt355=2;
                }
                break;
            case FLOAT_TYPE:
                {
                alt355=3;
                }
                break;
            case DOUBLE_TYPE:
                {
                alt355=4;
                }
                break;
            case STRING_TYPE:
                {
                alt355=5;
                }
                break;
            case BOOL_TYPE:
                {
                alt355=6;
                }
                break;
            case NULL_TYPE:
                {
                alt355=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 355, 0, input);

                throw nvae;
            }

            switch (alt355) {
                case 1 :
                    // EsperEPL2Ast.g:948:4: c= INT_TYPE
                    {
                    c=(CommonTree)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_constant6713); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 2 :
                    // EsperEPL2Ast.g:949:4: c= LONG_TYPE
                    {
                    c=(CommonTree)match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_constant6722); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 3 :
                    // EsperEPL2Ast.g:950:4: c= FLOAT_TYPE
                    {
                    c=(CommonTree)match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_constant6731); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 4 :
                    // EsperEPL2Ast.g:951:4: c= DOUBLE_TYPE
                    {
                    c=(CommonTree)match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_constant6740); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 5 :
                    // EsperEPL2Ast.g:952:11: c= STRING_TYPE
                    {
                    c=(CommonTree)match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_constant6756); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 6 :
                    // EsperEPL2Ast.g:953:11: c= BOOL_TYPE
                    {
                    c=(CommonTree)match(input,BOOL_TYPE,FOLLOW_BOOL_TYPE_in_constant6772); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;
                case 7 :
                    // EsperEPL2Ast.g:954:8: c= NULL_TYPE
                    {
                    c=(CommonTree)match(input,NULL_TYPE,FOLLOW_NULL_TYPE_in_constant6785); 
                     if (isLeaveNode) leaveNode(c); 

                    }
                    break;

            }
        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "constant"


    // $ANTLR start "number"
    // EsperEPL2Ast.g:957:1: number : ( INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE );
    public final void number() throws RecognitionException {
        try {
            // EsperEPL2Ast.g:958:2: ( INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE )
            // EsperEPL2Ast.g:
            {
            if ( (input.LA(1)>=INT_TYPE && input.LA(1)<=DOUBLE_TYPE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }

          catch (RecognitionException rex) {
            throw rex;
          }
        finally {
        }
        return ;
    }
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_ANNOTATION_in_annotation92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_annotation94 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0007F00000000038L});
    public static final BitSet FOLLOW_elementValuePair_in_annotation96 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0007F00000000038L});
    public static final BitSet FOLLOW_elementValue_in_annotation99 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_VALUE_in_elementValuePair117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_elementValuePair119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0007F00000000018L});
    public static final BitSet FOLLOW_elementValue_in_elementValuePair121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_annotation_in_elementValue148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_ARRAY_in_elementValue156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_elementValue_in_elementValue158 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0007F00000000018L});
    public static final BitSet FOLLOW_constant_in_elementValue169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_elementValue179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPRESSIONDECL_in_expressionDecl205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionDecl207 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_expressionDef_in_expressionDecl209 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000040L,0x0000000000000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_exprCol_in_expressionDecl211 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_expressionDecl214 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_COLON_in_expressionDecl219 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionDecl221 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LBRACK_in_expressionDecl226 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOES_in_expressionDef243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_expressionDef245 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_expressionLambdaDecl_in_expressionDef247 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSIONDECL_in_expressionDef255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_expressionDef257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOES_in_expressionLambdaDecl271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_expressionLambdaDecl274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_exprCol_in_expressionLambdaDecl278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EPL_EXPR_in_startEPLExpressionRule295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_startEPLExpressionRule298 = new BitSet(new long[]{0x0000000000000000L,0x4800800000020000L,0x0000080000000000L,0x0200B00000000020L,0x0000000201801408L});
    public static final BitSet FOLLOW_expressionDecl_in_startEPLExpressionRule303 = new BitSet(new long[]{0x0000000000000000L,0x4800800000020000L,0x0000080000000000L,0x0200B00000000020L,0x0000000201801408L});
    public static final BitSet FOLLOW_eplExpressionRule_in_startEPLExpressionRule308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_contextExpr_in_eplExpressionRule325 = new BitSet(new long[]{0x0000000000000000L,0x4000800000020000L,0x0000080000000000L,0x0200B00000000020L,0x0000000200001400L});
    public static final BitSet FOLLOW_selectExpr_in_eplExpressionRule329 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createWindowExpr_in_eplExpressionRule333 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createIndexExpr_in_eplExpressionRule337 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createVariableExpr_in_eplExpressionRule341 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createSchemaExpr_in_eplExpressionRule345 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_onExpr_in_eplExpressionRule350 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_updateExpr_in_eplExpressionRule354 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_createDataflow_in_eplExpressionRule358 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_fafDelete_in_eplExpressionRule362 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_fafUpdate_in_eplExpressionRule366 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_forExpr_in_eplExpressionRule369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createContextExpr_in_eplExpressionRule376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createExpr_in_eplExpressionRule380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTEXT_in_contextExpr395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_contextExpr397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_EXPR_in_onExpr416 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onStreamExpr_in_onExpr418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x011E000000000000L});
    public static final BitSet FOLLOW_onDeleteExpr_in_onExpr423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onUpdateExpr_in_onExpr427 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onSelectExpr_in_onExpr431 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_onSelectInsertExpr_in_onExpr434 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0060000000000000L});
    public static final BitSet FOLLOW_onSelectInsertOutput_in_onExpr437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onSetExpr_in_onExpr444 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_onMergeExpr_in_onExpr448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_STREAM_in_onStreamExpr470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_onStreamExpr473 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_onStreamExpr478 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_onStreamExpr481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_MERGE_EXPR_in_onMergeExpr499 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_onMergeExpr501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000030000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_onMergeExpr503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000030000L,0x0000000000000020L});
    public static final BitSet FOLLOW_mergeItem_in_onMergeExpr506 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000030000L,0x0000000000000020L});
    public static final BitSet FOLLOW_whereClause_in_onMergeExpr509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mergeMatched_in_mergeItem525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mergeUnmatched_in_mergeItem529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_MAT_in_mergeMatched544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mergeMatchedItem_in_mergeMatched546 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000001C01C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_mergeMatched549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_UPD_in_mergeMatchedItem567 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onSetAssignment_in_mergeMatchedItem569 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_whereClause_in_mergeMatchedItem572 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_DEL_in_mergeMatchedItem585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_whereClause_in_mergeMatchedItem587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_INT_TYPE_in_mergeMatchedItem591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_mergeInsert_in_mergeMatchedItem599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MERGE_UNM_in_mergeUnmatched613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mergeInsert_in_mergeUnmatched615 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000001C01C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_mergeUnmatched618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MERGE_INS_in_mergeInsert637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectionList_in_mergeInsert639 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000082000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_mergeInsert641 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_exprCol_in_mergeInsert644 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_whereClause_in_mergeInsert647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_EXPR_in_updateExpr667 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_updateDetails_in_updateExpr669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_updateDetails686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_updateDetails688 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_updateDetails690 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_onSetAssignment_in_updateDetails693 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_whereClause_in_updateDetails696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_DELETE_EXPR_in_onDeleteExpr711 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onExprFrom_in_onDeleteExpr713 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_whereClause_in_onDeleteExpr716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_EXPR_in_onSelectExpr736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_insertIntoExpr_in_onSelectExpr738 = new BitSet(new long[]{0x0000400000000000L,0x0000000000020000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_DELETE_in_onSelectExpr741 = new BitSet(new long[]{0x0000400000000000L,0x0000000000020000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_DISTINCT_in_onSelectExpr744 = new BitSet(new long[]{0x0000400000000000L,0x0000000000020000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectionList_in_onSelectExpr747 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0030000180000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_onExprFrom_in_onSelectExpr749 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0030000180000000L});
    public static final BitSet FOLLOW_whereClause_in_onSelectExpr752 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0030000100000000L});
    public static final BitSet FOLLOW_groupByClause_in_onSelectExpr756 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0020000100000000L});
    public static final BitSet FOLLOW_havingClause_in_onSelectExpr759 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_onSelectExpr762 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L});
    public static final BitSet FOLLOW_rowLimitClause_in_onSelectExpr765 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_INSERT_EXPR_in_onSelectInsertExpr785 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_insertIntoExpr_in_onSelectInsertExpr787 = new BitSet(new long[]{0x0000400000000000L,0x0000000000020000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectionList_in_onSelectInsertExpr789 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_whereClause_in_onSelectInsertExpr791 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SELECT_INSERT_OUTPUT_in_onSelectInsertOutput808 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_onSelectInsertOutput810 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SET_EXPR_in_onSetExpr828 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onSetAssignment_in_onSetExpr830 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_onSetAssignment_in_onSetExpr833 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_whereClause_in_onSetExpr837 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_UPDATE_EXPR_in_onUpdateExpr852 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_onExprFrom_in_onUpdateExpr854 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_onSetAssignment_in_onUpdateExpr856 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_whereClause_in_onUpdateExpr859 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_SET_EXPR_ITEM_in_onSetAssignment874 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_onSetAssignment876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ON_EXPR_FROM_in_onExprFrom890 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_onExprFrom892 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_onExprFrom895 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_WINDOW_EXPR_in_createWindowExpr913 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createWindowExpr915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000012000000L,0x0000400000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_viewListExpr_in_createWindowExpr918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000012000000L,0x0000400000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RETAINUNION_in_createWindowExpr922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000012000000L,0x0000400000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RETAININTERSECTION_in_createWindowExpr925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L,0x0000000012000000L,0x0000400000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_createSelectionList_in_createWindowExpr939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createWindowExpr942 = new BitSet(new long[]{0x0040000000000008L});
    public static final BitSet FOLLOW_createColTypeList_in_createWindowExpr971 = new BitSet(new long[]{0x0040000000000008L});
    public static final BitSet FOLLOW_createWindowExprInsert_in_createWindowExpr982 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_INDEX_EXPR_in_createIndexExpr1002 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createIndexExpr1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createIndexExpr1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_indexColList_in_createIndexExpr1008 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createIndexExpr1010 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEXCOL_in_indexColList1026 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexCol_in_indexColList1028 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INDEXCOL_in_indexCol1043 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_indexCol1045 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_indexCol1047 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_in_createWindowExprInsert1061 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_createWindowExprInsert1063 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_WINDOW_SELECT_EXPR_in_createSelectionList1080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createSelectionListElement_in_createSelectionList1082 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000100000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_createSelectionListElement_in_createSelectionList1085 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000100000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_CREATE_COL_TYPE_LIST_in_createColTypeList1104 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createColTypeListElement_in_createColTypeList1106 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_createColTypeListElement_in_createColTypeList1109 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_COL_TYPE_in_createColTypeListElement1124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createColTypeListElement1126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createColTypeListElement1128 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_LBRACK_in_createColTypeListElement1130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WILDCARD_SELECT_in_createSelectionListElement1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECTION_ELEMENT_EXPR_in_createSelectionListElement1155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_createSelectionListElement1175 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createSelectionListElement1179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_createSelectionListElement1201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createSelectionListElement1204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_VARIABLE_EXPR_in_createVariableExpr1240 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_createVariableExpr1242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createVariableExpr1244 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D002BL,0x0000000000000018L});
    public static final BitSet FOLLOW_IDENT_in_createVariableExpr1246 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D000BL,0x0000000000000018L});
    public static final BitSet FOLLOW_LBRACK_in_createVariableExpr1249 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_createVariableExpr1252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_fafDelete1271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_fafDelete1273 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_fafDelete1275 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_whereClause_in_fafDelete1278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_fafUpdate1300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_updateDetails_in_fafUpdate1302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_DATAFLOW_in_createDataflow1322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createDataflow1324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400001000L});
    public static final BitSet FOLLOW_gop_in_createDataflow1326 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400001000L});
    public static final BitSet FOLLOW_GOP_in_gop1343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_gop1345 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000012800000008L});
    public static final BitSet FOLLOW_gopParam_in_gop1351 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000012000000008L});
    public static final BitSet FOLLOW_gopOut_in_gop1354 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000008L});
    public static final BitSet FOLLOW_gopDetail_in_gop1357 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_annotation_in_gop1361 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_createSchemaExpr_in_gop1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOPPARAM_in_gopParam1385 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gopParamItem_in_gopParam1387 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_GOPPARAMITM_in_gopParamItem1401 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_gopParamItem1403 = new BitSet(new long[]{0x0000000000020008L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_AS_in_gopParamItem1408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_gopParamItem1410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOPOUT_in_gopOut1426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gopOutItem_in_gopOut1428 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_GOPOUTITM_in_gopOutItem1442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_gopOutItem1444 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_gopOutTypeParam_in_gopOutItem1446 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_GOPOUTTYP_in_gopOutTypeParam1461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_gopOutTypeParam1465 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_gopOutTypeParam_in_gopOutTypeParam1467 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_QUESTION_in_gopOutTypeParam1473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOPCFG_in_gopDetail1487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_gopConfig_in_gopDetail1489 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000060000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_GOPCFGITM_in_gopConfig1505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_gopConfig1507 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_gopConfig1509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOPCFGEXP_in_gopConfig1520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_gopConfig1522 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOPCFGEPL_in_gopConfig1533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selectExpr_in_gopConfig1535 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_jsonvalue1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonobject_in_jsonvalue1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonarray_in_jsonvalue1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSON_OBJECT_in_jsonobject1582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_jsonpair_in_jsonobject1584 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_JSON_ARRAY_in_jsonarray1613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_jsonvalue_in_jsonarray1615 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_JSON_FIELD_in_jsonpair1633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_jsonpair1636 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_IDENT_in_jsonpair1641 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_jsonvalue_in_jsonpair1644 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_in_createContextExpr1664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createContextExpr1666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000BE000000L});
    public static final BitSet FOLLOW_createContextDetail_in_createContextExpr1668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_FIXED_in_createContextDetail1684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createContextDetail1687 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000400000000000L,0x0000000000000004L,0x0000000100000000L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1691 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000400000000000L,0x0000000000000004L,0x0000000100000000L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_INIT_in_createContextDetail1701 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1703 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000400000000000L,0x0000000000000004L,0x0000000100000000L});
    public static final BitSet FOLLOW_createContextRangePoint_in_createContextDetail1705 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createContextDetail1707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_PART_in_createContextDetail1715 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextPartitionItem_in_createContextDetail1717 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_CREATE_CTX_CAT_in_createContextDetail1725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextCategoryItem_in_createContextDetail1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextDetail1730 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_COAL_in_createContextDetail1738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextCoalesceItem_in_createContextDetail1740 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createContextDetail1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_number_in_createContextDetail1745 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createContextDetail1747 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_NESTED_in_createContextDetail1755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createContextNested_in_createContextDetail1757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_createContextNested_in_createContextDetail1759 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_createContextFilter_in_createContextRangePoint1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_CTX_PATTERN_in_createContextRangePoint1780 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_createContextRangePoint1782 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createContextRangePoint1784 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_crontabLimitParameterSet_in_createContextRangePoint1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AFTER_in_createContextRangePoint1797 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriod_in_createContextRangePoint1799 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_in_createContextNested1815 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createContextNested1817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x00000000BE000000L});
    public static final BitSet FOLLOW_createContextDetail_in_createContextNested1819 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_createContextFilter1832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextFilter1834 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createContextFilter1837 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTITIONITEM_in_createContextPartitionItem1853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextPartitionItem1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_createContextPartitionItem1858 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_COALESCE_in_createContextCoalesceItem1875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_createContextCoalesceItem1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_eventFilterExpr_in_createContextCoalesceItem1879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_CTX_CATITEM_in_createContextCategoryItem1895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_createContextCategoryItem1897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createContextCategoryItem1899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_EXPR_in_createExpr1916 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionDecl_in_createExpr1918 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_in_createSchemaExpr1937 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_createSchemaDef_in_createSchemaExpr1939 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaExpr1941 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_DEF_in_createSchemaDef1958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaDef1960 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000012000000L,0x0000400000000000L,0x000000000000A001L});
    public static final BitSet FOLLOW_variantList_in_createSchemaDef1963 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_createColTypeList_in_createSchemaDef1965 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_createSchemaQual_in_createSchemaDef1969 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_CREATE_SCHEMA_EXPR_QUAL_in_createSchemaQual1984 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_createSchemaQual1986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_exprCol_in_createSchemaQual1988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIANT_LIST_in_variantList2004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_variantList2006 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_insertIntoExpr_in_selectExpr2024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_selectClause_in_selectExpr2030 = new BitSet(new long[]{0x0000000000000002L,0x0001200000000000L,0xC030400180000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_fromClause_in_selectExpr2036 = new BitSet(new long[]{0x0000000000000002L,0x0001200000000000L,0xC030000180000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_matchRecogClause_in_selectExpr2043 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xC030000180000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_whereClause_in_selectExpr2050 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xC030000100000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_groupByClause_in_selectExpr2058 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xC020000100000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_havingClause_in_selectExpr2065 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0xC020000000000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_outputLimitExpr_in_selectExpr2072 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_selectExpr2079 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_rowLimitClause_in_selectExpr2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERTINTO_EXPR_in_insertIntoExpr2103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_insertIntoExpr2105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_insertIntoExpr2118 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_exprCol_in_insertIntoExpr2121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRCOL_in_exprCol2140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_exprCol2142 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_exprCol2145 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SELECTION_EXPR_in_selectClause2163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_selectClause2165 = new BitSet(new long[]{0x0000400000000000L,0x0000000000020000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_DISTINCT_in_selectClause2178 = new BitSet(new long[]{0x0000400000000000L,0x0000000000020000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectionList_in_selectClause2181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_streamExpression_in_fromClause2195 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_streamExpression_in_fromClause2198 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000F400000000000L});
    public static final BitSet FOLLOW_outerJoin_in_fromClause2201 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000F400000000000L});
    public static final BitSet FOLLOW_FOR_in_forExpr2221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_forExpr2223 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_forExpr2225 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_MATCH_RECOGNIZE_in_matchRecogClause2244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPartitionBy_in_matchRecogClause2246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_matchRecogMeasures_in_matchRecogClause2253 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0420000000000000L});
    public static final BitSet FOLLOW_ALL_in_matchRecogClause2259 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0420000000000000L});
    public static final BitSet FOLLOW_matchRecogMatchesAfterSkip_in_matchRecogClause2265 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0420000000000000L});
    public static final BitSet FOLLOW_matchRecogPattern_in_matchRecogClause2271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_matchRecogMatchesInterval_in_matchRecogClause2277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1800000000000000L});
    public static final BitSet FOLLOW_matchRecogDefine_in_matchRecogClause2283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARTITIONITEM_in_matchRecogPartitionBy2301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogPartitionBy2303 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_MATCHREC_AFTER_SKIP_in_matchRecogMatchesAfterSkip2320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2326 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_matchRecogMatchesAfterSkip2328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesAfterSkip2334 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_INTERVAL_in_matchRecogMatchesInterval2349 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMatchesInterval2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_timePeriod_in_matchRecogMatchesInterval2353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_MEASURES_in_matchRecogMeasures2369 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogMeasureListElement_in_matchRecogMeasures2371 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_MATCHREC_MEASURE_ITEM_in_matchRecogMeasureListElement2388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogMeasureListElement2390 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogMeasureListElement2392 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_in_matchRecogPattern2412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternAlteration_in_matchRecogPattern2414 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_ALTER_in_matchRecogPatternAlteration2437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_matchRecogPatternConcat_in_matchRecogPatternAlteration2441 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_CONCAT_in_matchRecogPatternConcat2459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternUnary_in_matchRecogPatternConcat2461 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0240000000000000L});
    public static final BitSet FOLLOW_matchRecogPatternNested_in_matchRecogPatternUnary2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matchRecogPatternAtom_in_matchRecogPatternUnary2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_NESTED_in_matchRecogPatternNested2496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogPatternAlteration_in_matchRecogPatternNested2498 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000510000L});
    public static final BitSet FOLLOW_set_in_matchRecogPatternNested2500 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_PATTERN_ATOM_in_matchRecogPatternAtom2529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogPatternAtom2531 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000510000L});
    public static final BitSet FOLLOW_set_in_matchRecogPatternAtom2535 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_QUESTION_in_matchRecogPatternAtom2547 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCHREC_DEFINE_in_matchRecogDefine2569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchRecogDefineItem_in_matchRecogDefine2571 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_MATCHREC_DEFINE_ITEM_in_matchRecogDefineItem2588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_matchRecogDefineItem2590 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_matchRecogDefineItem2592 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selectionListElement_in_selectionList2609 = new BitSet(new long[]{0x0000400000000002L,0x0000000000020000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectionListElement_in_selectionList2612 = new BitSet(new long[]{0x0000400000000002L,0x0000000000020000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_WILDCARD_SELECT_in_selectionListElement2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECTION_ELEMENT_EXPR_in_selectionListElement2638 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_selectionListElement2640 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001020L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2643 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_selectionListElementAnno_in_selectionListElement2647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECTION_STREAM_in_selectionListElement2660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2662 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElement2665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATCHAR_in_selectionListElementAnno2684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_selectionListElementAnno2686 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEFT_OUTERJOIN_EXPR_in_outerJoin2704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2706 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RIGHT_OUTERJOIN_EXPR_in_outerJoin2721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2723 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FULL_OUTERJOIN_EXPR_in_outerJoin2738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2740 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INNERJOIN_EXPR_in_outerJoin2755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ON_in_outerJoin2757 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_outerJoinIdent_in_outerJoin2759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2778 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_outerJoinIdent2785 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_streamExpression2802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_streamExpression2805 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_patternInclusionExpression_in_streamExpression2810 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_databaseJoinExpression_in_streamExpression2814 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_methodJoinExpression_in_streamExpression2818 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_viewListExpr_in_streamExpression2822 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_streamExpression2827 = new BitSet(new long[]{0x8000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_UNIDIRECTIONAL_in_streamExpression2832 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_streamExpression2836 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_EXPR_in_eventFilterExpr2861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventFilterExpr2863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_eventFilterExpr2866 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00001000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_propertyExpression_in_eventFilterExpr2868 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_eventFilterExpr2872 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_EVENT_FILTER_PROPERTY_EXPR_in_propertyExpression2892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertyExpressionAtom_in_propertyExpression2894 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_EVENT_FILTER_PROPERTY_EXPR_ATOM_in_propertyExpressionAtom2913 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SELECT_in_propertyExpressionAtom2917 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_propertySelectionListElement_in_propertyExpressionAtom2919 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_valueExpr_in_propertyExpressionAtom2925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001020L});
    public static final BitSet FOLLOW_ATCHAR_in_propertyExpressionAtom2929 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2933 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_propertyExpressionAtom2938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_WHERE_EXPR_in_propertyExpressionAtom2942 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_propertyExpressionAtom2944 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_WILDCARD_SELECT_in_propertySelectionListElement2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_ELEMENT_EXPR_in_propertySelectionListElement2974 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_propertySelectionListElement2976 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2979 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_STREAM_in_propertySelectionListElement2993 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2995 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_propertySelectionListElement2998 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_INCL_EXPR_in_patternInclusionExpression3019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternInclusionExpression3021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATABASE_JOIN_EXPR_in_databaseJoinExpression3038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_databaseJoinExpression3040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_databaseJoinExpression3042 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_databaseJoinExpression3050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_JOIN_EXPR_in_methodJoinExpression3071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_methodJoinExpression3073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_methodJoinExpression3075 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_methodJoinExpression3078 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_viewExpr_in_viewListExpr3092 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_viewExpr_in_viewListExpr3095 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_VIEW_EXPR_in_viewExpr3112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_viewExpr3114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_viewExpr3116 = new BitSet(new long[]{0x1020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x0007F000000001C4L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExprWithTime_in_viewExpr3119 = new BitSet(new long[]{0x1020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x0007F000000001C4L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_WHERE_EXPR_in_whereClause3141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_whereClause3143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_BY_EXPR_in_groupByClause3161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_groupByClause3163 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_groupByClause3166 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_ORDER_BY_EXPR_in_orderByClause3184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_orderByElement_in_orderByClause3186 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_orderByElement_in_orderByClause3189 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_ORDER_ELEMENT_EXPR_in_orderByElement3209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_orderByElement3211 = new BitSet(new long[]{0x0600000000000008L});
    public static final BitSet FOLLOW_set_in_orderByElement3213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HAVING_EXPR_in_havingClause3236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_havingClause3238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_LIMIT_EXPR_in_outputLimitExpr3256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr3258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000F00000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_number_in_outputLimitExpr3270 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IDENT_in_outputLimitExpr3272 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3275 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMEPERIOD_LIMIT_EXPR_in_outputLimitExpr3295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr3297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_timePeriod_in_outputLimitExpr3308 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3310 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CRONTAB_LIMIT_EXPR_in_outputLimitExpr3329 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr3331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_crontabLimitParameterSet_in_outputLimitExpr3342 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3344 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHEN_LIMIT_EXPR_in_outputLimitExpr3363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr3365 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_outputLimitExpr3376 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L,0x0100000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitExpr3378 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3381 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_LIMIT_EXPR_in_outputLimitExpr3400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_outputLimitExpr3402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3413 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L,0x0100000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitExpr3415 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3418 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AFTER_LIMIT_EXPR_in_outputLimitExpr3434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_outputLimitAfter_in_outputLimitExpr3436 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_outputLimitAndTerm_in_outputLimitExpr3438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINATED_in_outputLimitAndTerm3455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_outputLimitAndTerm3457 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_onSetExpr_in_outputLimitAndTerm3460 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AFTER_in_outputLimitAfter3474 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriod_in_outputLimitAfter3476 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_number_in_outputLimitAfter3479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ROW_LIMIT_EXPR_in_rowLimitClause3495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_rowLimitClause3498 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000F00000000000L,0x0000000000002020L});
    public static final BitSet FOLLOW_IDENT_in_rowLimitClause3500 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000F00000000000L,0x0000000000002020L});
    public static final BitSet FOLLOW_number_in_rowLimitClause3504 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_IDENT_in_rowLimitClause3506 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_rowLimitClause3510 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L});
    public static final BitSet FOLLOW_OFFSET_in_rowLimitClause3513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CRONTAB_LIMIT_EXPR_PARAM_in_crontabLimitParameterSet3531 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExprWithTime_in_crontabLimitParameterSet3533 = new BitSet(new long[]{0x1020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x0007F000000001C4L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_LT_in_relationalExpr3550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_relationalExpr3565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3567 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_relationalExpr3580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3582 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_relationalExpr3594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExprValue_in_relationalExpr3596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3618 = new BitSet(new long[]{0x1003800037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_relationalExprValue3643 = new BitSet(new long[]{0x1000000037CC23C2L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047F07804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_relationalExprValue3652 = new BitSet(new long[]{0x1000000037CC23C2L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_subSelectGroupExpr_in_relationalExprValue3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVAL_OR_EXPR_in_evalExprChoice3683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3685 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3687 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3690 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_EVAL_AND_EXPR_in_evalExprChoice3704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3706 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3708 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3711 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_EVAL_EQUALS_EXPR_in_evalExprChoice3725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3727 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_IS_EXPR_in_evalExprChoice3741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3743 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_NOTEQUALS_EXPR_in_evalExprChoice3757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3759 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3761 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_ISNOT_EXPR_in_evalExprChoice3773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3775 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3777 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_EQUALS_GROUP_EXPR_in_evalExprChoice3789 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3791 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_IS_GROUP_EXPR_in_evalExprChoice3803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3805 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_NOTEQUALS_GROUP_EXPR_in_evalExprChoice3817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3819 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVAL_ISNOT_GROUP_EXPR_in_evalExprChoice3831 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equalsSubquery_in_evalExprChoice3833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EXPR_in_evalExprChoice3845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_evalExprChoice3847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relationalExpr_in_evalExprChoice3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpr_in_equalsSubquery3869 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_set_in_equalsSubquery3871 = new BitSet(new long[]{0x1000000037CC23C2L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047F07804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_equalsSubquery3880 = new BitSet(new long[]{0x1000000037CC23C2L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_subSelectGroupExpr_in_equalsSubquery3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_valueExpr3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_substitution_in_valueExpr3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmeticExpr_in_valueExpr3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_valueExpr3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evalExprChoice_in_valueExpr3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtinFunc_in_valueExpr3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_libFuncChain_in_valueExpr3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseExpr_in_valueExpr3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inExpr_in_valueExpr3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_betweenExpr_in_valueExpr3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeExpr_in_valueExpr3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regExpExpr_in_valueExpr3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayExpr_in_valueExpr3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectInExpr_in_valueExpr3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectRowExpr_in_valueExpr3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subSelectExistsExpr_in_valueExpr3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotExpr_in_valueExpr3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_valueExpr3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonarray_in_valueExpr4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonobject_in_valueExpr4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAST_in_valueExprWithTime4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LW_in_valueExprWithTime4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExpr_in_valueExprWithTime4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_PARAM_ORDERED_EXPR_in_valueExprWithTime4048 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_valueExprWithTime4050 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_valueExprWithTime4052 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rangeOperator_in_valueExprWithTime4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frequencyOperator_in_valueExprWithTime4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lastOperator_in_valueExprWithTime4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weekDayOperator_in_valueExprWithTime4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_LIST_in_valueExprWithTime4091 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numericParameterList_in_valueExprWithTime4093 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000014L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_NUMBERSETSTAR_in_valueExprWithTime4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timePeriod_in_valueExprWithTime4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_numericParameterList4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeOperator_in_numericParameterList4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frequencyOperator_in_numericParameterList4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_RANGE_in_rangeOperator4153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_rangeOperator4156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000040000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_rangeOperator4159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000040000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_substitution_in_rangeOperator4162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L,0x0000040000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_constant_in_rangeOperator4166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_rangeOperator4169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_rangeOperator4172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMERIC_PARAM_FREQUENCY_in_frequencyOperator4193 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_frequencyOperator4196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_frequencyOperator4199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_frequencyOperator4202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAST_OPERATOR_in_lastOperator4221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_lastOperator4224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_lastOperator4227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_lastOperator4230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WEEKDAY_OPERATOR_in_weekDayOperator4249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_weekDayOperator4252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_weekDayOperator4255 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_substitution_in_weekDayOperator4258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_GROUP_EXPR_in_subSelectGroupExpr4279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectGroupExpr4281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSELECT_EXPR_in_subSelectRowExpr4300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectRowExpr4302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_SUBSELECT_EXPR_in_subSelectExistsExpr4321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectExistsExpr4323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_SUBSELECT_EXPR_in_subSelectInExpr4342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_subSelectInExpr4344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_subSelectInQueryExpr_in_subSelectInExpr4346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_SUBSELECT_EXPR_in_subSelectInExpr4358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_subSelectInExpr4360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_subSelectInQueryExpr_in_subSelectInExpr4362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_SUBSELECT_QUERY_EXPR_in_subSelectInQueryExpr4381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subQueryExpr_in_subSelectInQueryExpr4383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DISTINCT_in_subQueryExpr4399 = new BitSet(new long[]{0x0000400000000000L,0x0000000000020000L,0x0000300000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_selectionList_in_subQueryExpr4402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_subSelectFilterExpr_in_subQueryExpr4404 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_whereClause_in_subQueryExpr4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STREAM_EXPR_in_subSelectFilterExpr4425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventFilterExpr_in_subSelectFilterExpr4427 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_viewListExpr_in_subSelectFilterExpr4431 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_subSelectFilterExpr4436 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000003L});
    public static final BitSet FOLLOW_RETAINUNION_in_subSelectFilterExpr4440 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
    public static final BitSet FOLLOW_RETAININTERSECTION_in_subSelectFilterExpr4443 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CASE_in_caseExpr4463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_caseExpr4466 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_CASE2_in_caseExpr4479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_caseExpr4482 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_IN_SET_in_inExpr4502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_set_in_inExpr4506 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4512 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0093L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4515 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0093L,0x0000000000000018L});
    public static final BitSet FOLLOW_set_in_inExpr4519 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_SET_in_inExpr4534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_set_in_inExpr4538 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4544 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0093L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4547 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0093L,0x0000000000000018L});
    public static final BitSet FOLLOW_set_in_inExpr4551 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_RANGE_in_inExpr4566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_set_in_inExpr4570 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4576 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_set_in_inExpr4580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_IN_RANGE_in_inExpr4595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_set_in_inExpr4599 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4605 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_inExpr4607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_set_in_inExpr4609 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BETWEEN_in_betweenExpr4632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4634 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4636 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4638 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_BETWEEN_in_betweenExpr4649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4651 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4653 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_betweenExpr4656 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_LIKE_in_likeExpr4676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4678 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4680 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4683 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_LIKE_in_likeExpr4696 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4698 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4700 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_likeExpr4703 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REGEXP_in_regExpExpr4722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4724 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_REGEXP_in_regExpExpr4737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4739 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_regExpExpr4741 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUM_in_builtinFunc4760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4763 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4767 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVG_in_builtinFunc4781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4784 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4788 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4790 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COUNT_in_builtinFunc4802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4806 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4810 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEDIAN_in_builtinFunc4826 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4829 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4833 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4835 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STDDEV_in_builtinFunc4847 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4850 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4854 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4856 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AVEDEV_in_builtinFunc4868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4871 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4875 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_aggregationFilterExpr_in_builtinFunc4877 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LAST_AGGREG_in_builtinFunc4889 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4892 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000003C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4896 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIRST_AGGREG_in_builtinFunc4911 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4914 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000003C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4918 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WINDOW_AGGREG_in_builtinFunc4933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DISTINCT_in_builtinFunc4936 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_accessValueExpr_in_builtinFunc4940 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COALESCE_in_builtinFunc4953 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4955 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4957 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4960 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_PREVIOUS_in_builtinFunc4975 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4977 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4979 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSTAIL_in_builtinFunc4992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4994 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc4996 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSCOUNT_in_builtinFunc5009 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc5011 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREVIOUSWINDOW_in_builtinFunc5023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc5025 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRIOR_in_builtinFunc5037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NUM_INT_in_builtinFunc5041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_builtinFunc5043 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_builtinFunc5056 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc5058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc5060 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc5063 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TYPEOF_in_builtinFunc5077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc5079 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_builtinFunc5091 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_builtinFunc5093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_builtinFunc5095 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXISTS_in_builtinFunc5107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_builtinFunc5109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CURRENT_TIMESTAMP_in_builtinFunc5121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ISTREAM_in_builtinFunc5134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AGG_FILTER_EXPR_in_aggregationFilterExpr5151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_aggregationFilterExpr5153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ACCESS_AGG_in_accessValueExpr5167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_accessValueExprChoice_in_accessValueExpr5169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROPERTY_WILDCARD_SELECT_in_accessValueExprChoice5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROPERTY_SELECTION_STREAM_in_accessValueExprChoice5191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_accessValueExprChoice5193 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_accessValueExprChoice5195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpr_in_accessValueExprChoice5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_EXPR_in_arrayExpr5217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arrayExpr5220 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_PLUS_in_arithmeticExpr5241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5243 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_arithmeticExpr5257 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5259 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5261 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_arithmeticExpr5273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5275 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_arithmeticExpr5288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5290 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_arithmeticExpr5304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5306 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAND_in_arithmeticExpr5319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5321 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOR_in_arithmeticExpr5334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5336 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BXOR_in_arithmeticExpr5349 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5351 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCAT_in_arithmeticExpr5365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5367 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5369 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_arithmeticExpr5372 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_DOT_EXPR_in_dotExpr5392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_dotExpr5394 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_dotExpr5396 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NEWKW_in_newExpr5414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_newAssign_in_newExpr5416 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NEW_ITEM_in_newAssign5432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_newAssign5434 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_newAssign5437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIB_FUNC_CHAIN_in_libFuncChain5455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_libFuncChain5457 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_libOrPropFunction_in_libFuncChain5459 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0080000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LIB_FUNCTION_in_libFunctionWithClass5479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_libFunctionWithClass5482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_libFunctionWithClass5486 = new BitSet(new long[]{0x1020400037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x0007F000000001C4L,0x00000007666D0843L,0x0000000000000018L});
    public static final BitSet FOLLOW_DISTINCT_in_libFunctionWithClass5489 = new BitSet(new long[]{0x1020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x0007F000000001C4L,0x00000007666D0843L,0x0000000000000018L});
    public static final BitSet FOLLOW_libFunctionArgItem_in_libFunctionWithClass5493 = new BitSet(new long[]{0x1020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x0007F000000001C4L,0x00000007666D0843L,0x0000000000000018L});
    public static final BitSet FOLLOW_LPAREN_in_libFunctionWithClass5496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expressionLambdaDecl_in_libFunctionArgItem5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueExprWithTime_in_libFunctionArgItem5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_libOrPropFunction5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_libFunctionWithClass_in_libOrPropFunction5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_startPatternExpressionRule5554 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_exprChoice_in_startPatternExpressionRule5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicExpr_in_exprChoice5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternOp_in_exprChoice5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVERY_EXPR_in_exprChoice5587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5589 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVERY_DISTINCT_EXPR_in_exprChoice5603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_distinctExpressions_in_exprChoice5605 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_NOT_EXPR_in_exprChoice5621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5623 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GUARD_EXPR_in_exprChoice5637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5639 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0023L,0x0000000000000018L});
    public static final BitSet FOLLOW_IDENT_in_exprChoice5642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_exprChoice5644 = new BitSet(new long[]{0x1020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x0007F000000001C4L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExprWithTime_in_exprChoice5646 = new BitSet(new long[]{0x1020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x0007F000000001C4L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_exprChoice5651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_EXPR_in_exprChoice5665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_matchUntilRange_in_exprChoice5667 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5670 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_exprChoice5672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_EVERY_DISTINCT_EXPR_in_distinctExpressions5693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExprWithTime_in_distinctExpressions5695 = new BitSet(new long[]{0x1020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x0007F000000001C4L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_FOLLOWED_BY_EXPR_in_patternOp5714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5718 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_followedByItem_in_patternOp5721 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_OR_EXPR_in_patternOp5737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5739 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5741 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5744 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_AND_EXPR_in_patternOp5760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5762 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5764 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_patternOp5767 = new BitSet(new long[]{0x000000000000D808L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_FOLLOWED_BY_ITEM_in_followedByItem5788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_followedByItem5790 = new BitSet(new long[]{0x000000000000D800L,0x0000000000000000L,0x000000000C000340L,0x0800000000000000L});
    public static final BitSet FOLLOW_exprChoice_in_followedByItem5793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternFilterExpr_in_atomicExpr5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSERVER_EXPR_in_atomicExpr5819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_atomicExpr5821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_atomicExpr5823 = new BitSet(new long[]{0x1020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x0007F000000001C4L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExprWithTime_in_atomicExpr5825 = new BitSet(new long[]{0x1020000037CC23C8L,0x100000000001F7E0L,0x008003FC0000003CL,0x0000077707806D00L,0x0007F000000001C4L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_PATTERN_FILTER_EXPR_in_patternFilterExpr5845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_patternFilterExpr5847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_IDENT_in_patternFilterExpr5850 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00001000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D1003L,0x0000000000000018L});
    public static final BitSet FOLLOW_propertyExpression_in_patternFilterExpr5852 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D1003L,0x0000000000000018L});
    public static final BitSet FOLLOW_patternFilterAnno_in_patternFilterExpr5855 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_patternFilterExpr5859 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_ATCHAR_in_patternFilterAnno5879 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_patternFilterAnno5881 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000F00000000000L});
    public static final BitSet FOLLOW_number_in_patternFilterAnno5883 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_CLOSED_in_matchUntilRange5898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5900 = new BitSet(new long[]{0x1000000037CC23C0L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5902 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_BOUNDED_in_matchUntilRange5910 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_HALFCLOSED_in_matchUntilRange5920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5922 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MATCH_UNTIL_RANGE_HALFOPEN_in_matchUntilRange5929 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_matchUntilRange5931 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_PARAM_in_filterParam5944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_filterParam5946 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_valueExpr_in_filterParam5949 = new BitSet(new long[]{0x1000000037CC23C8L,0x100000000001E7E0L,0x008003FC00000000L,0x0000047707804D00L,0x0007F000000001C0L,0x00000007666D0003L,0x0000000000000018L});
    public static final BitSet FOLLOW_EQUALS_in_filterParamComparator5965 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_filterParamComparator5974 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5976 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_in_filterParamComparator5983 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5985 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_in_filterParamComparator5992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator5994 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GT_in_filterParamComparator6001 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator6003 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GE_in_filterParamComparator6010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterAtom_in_filterParamComparator6012 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_RANGE_in_filterParamComparator6019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator6021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_set_in_filterParamComparator6041 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_RANGE_in_filterParamComparator6052 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator6054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_set_in_filterParamComparator6074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_IN_in_filterParamComparator6085 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator6087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_set_in_filterParamComparator6108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_IN_in_filterParamComparator6119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_filterParamComparator6121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_set_in_filterParamComparator6142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_BETWEEN_in_filterParamComparator6153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_FILTER_NOT_BETWEEN_in_filterParamComparator6174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000000000L,0x0007F00000000000L});
    public static final BitSet FOLLOW_constant_in_filterParamComparator6184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterParamComparator6187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_filterAtom6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterIdentifier_in_filterAtom6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVENT_FILTER_IDENT_in_filterIdentifier6218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_filterIdentifier6220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_eventPropertyExpr_in_filterIdentifier6222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_EXPR_in_eventPropertyExpr6241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_eventPropertyAtomic_in_eventPropertyExpr6243 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_eventPropertyAtomic_in_eventPropertyExpr6246 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x3F00000000000000L});
    public static final BitSet FOLLOW_EVENT_PROP_SIMPLE_in_eventPropertyAtomic6265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6267 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_INDEXED_in_eventPropertyAtomic6274 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NUM_INT_in_eventPropertyAtomic6278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_MAPPED_in_eventPropertyAtomic6285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_eventPropertyAtomic6289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_SIMPLE_in_eventPropertyAtomic6302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_INDEXED_in_eventPropertyAtomic6311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NUM_INT_in_eventPropertyAtomic6315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EVENT_PROP_DYNAMIC_MAPPED_in_eventPropertyAtomic6322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_eventPropertyAtomic6324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_eventPropertyAtomic6326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_PERIOD_in_timePeriod6351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timePeriodDef_in_timePeriod6353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_yearPart_in_timePeriodDef6369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007F0000L});
    public static final BitSet FOLLOW_monthPart_in_timePeriodDef6372 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007E0000L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef6377 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007C0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef6382 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef6387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_monthPart_in_timePeriodDef6410 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007E0000L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef6413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007C0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef6418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef6423 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weekPart_in_timePeriodDef6446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x00000000007C0000L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef6449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef6454 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6459 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6464 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayPart_in_timePeriodDef6477 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef6480 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6485 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6490 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hourPart_in_timePeriodDef6502 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000700000L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6505 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6510 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minutePart_in_timePeriodDef6522 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_secondPart_in_timePeriodDef6537 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_millisecondPart_in_timePeriodDef6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_YEAR_PART_in_yearPart6561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_yearPart6563 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MONTH_PART_in_monthPart6578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_monthPart6580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WEEK_PART_in_weekPart6595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_weekPart6597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAY_PART_in_dayPart6612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_dayPart6614 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HOUR_PART_in_hourPart6629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_hourPart6631 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUTE_PART_in_minutePart6646 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_minutePart6648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECOND_PART_in_secondPart6663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_secondPart6665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MILLISECOND_PART_in_millisecondPart6680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_valueExpr_in_millisecondPart6682 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSTITUTION_in_substitution6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_constant6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_TYPE_in_constant6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_TYPE_in_constant6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_TYPE_in_constant6740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_TYPE_in_constant6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_TYPE_in_constant6772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_TYPE_in_constant6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_number0 = new BitSet(new long[]{0x0000000000000002L});

}