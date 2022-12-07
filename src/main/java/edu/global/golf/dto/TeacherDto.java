package edu.global.golf.dto;

public class TeacherDto {
    private String teacherCode;
    private String teacherName;
    private String className;
    private int classPrice;
    private String teacherRegisteredDate;

    @Override
    public String toString() {
        return "TeacherDto{" +
                "teacherCode='" + teacherCode + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", className='" + className + '\'' +
                ", classPrice=" + classPrice +
                ", teacherRegisteredDate='" + teacherRegisteredDate + '\'' +
                '}';
    }

    public TeacherDto(String teacherCode, String teacherName, String className, int classPrice, String teacherRegisteredDate) {
        this.teacherCode = teacherCode;
        this.teacherName = teacherName;
        this.className = className;
        this.classPrice = classPrice;
        this.teacherRegisteredDate = teacherRegisteredDate;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassPrice() {
        return classPrice;
    }

    public void setClassPrice(int classPrice) {
        this.classPrice = classPrice;
    }

    public String getTeacherRegisteredDate() {
        return teacherRegisteredDate;
    }

    public void setTeacherRegisteredDate(String teacherRegisteredDate) {
        this.teacherRegisteredDate = teacherRegisteredDate;
    }
}
