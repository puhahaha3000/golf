package edu.global.common;

public class Constant {
    public static final String CONNECT_POOL = "java:comp/env/jdbc/oracle/golf";
    public static final String QUERY_TEACHER_LIST = "SELECT TEACHER_CODE,\n" +
            "       TEACHER_NAME,\n" +
            "       CLASS_NAME,\n" +
            "       CLASS_PRICE,\n" +
            "       SUBSTR(TEACHER_REGIST_DATE, 1, 4)||'년'||SUBSTR(TEACHER_REGIST_DATE, 5, 2)||'월'||SUBSTR(TEACHER_REGIST_DATE, 7, 2)||'일' AS TEACHAR_REGIST_DATE\n" +
            "FROM TBL_TEACHER_202201";
    public static final String QUERY_INSERT_CLASS = "INSERT INTO TBL_CLASS_202201\n" +
            "VALUES (?, ?, ?, ?, ?)";
    public static final String QUERY_CLASS_LIST = "SELECT SUBSTR(REGIST_MONTH, 1, 4)||'년'||SUBSTR(REGIST_MONTH, 5, 2)||'월' AS REGIST_MONTH,\n" +
            "       M.C_NO, C_NAME, CLASS_NAME, CLASS_AREA,\n" +
            "       '\\'||TO_CHAR(TUITION, 'FM999,999,999') AS TUITION,\n" +
            "       GRADE\n" +
            "FROM TBL_CLASS_202201 C, TBL_MEMBER_202201 M, TBL_TEACHER_202201 T\n" +
            "WHERE C.C_NO = M.C_NO AND C.TEACHER_CODE = T.TEACHER_CODE";
    public static final String QUERY_TEACHER_SALE_LIST = "SELECT T.TEACHER_CODE, CLASS_NAME, TEACHER_NAME, TUITION\n" +
            "FROM TBL_TEACHER_202201 T, (\n" +
            "    SELECT TEACHER_CODE, SUM(TUITION) AS TUITION\n" +
            "    FROM TBL_CLASS_202201\n" +
            "    GROUP BY TEACHER_CODE) C\n" +
            "WHERE T.TEACHER_CODE = C.TEACHER_CODE";
}
