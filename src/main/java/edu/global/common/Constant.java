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
}
