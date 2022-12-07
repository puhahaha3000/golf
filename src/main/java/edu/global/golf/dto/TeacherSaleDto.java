package edu.global.golf.dto;

public class TeacherSaleDto {
    private String teacherCode;
    private String className;
    private String teacherName;
    private String tuition;

    @Override
    public String toString() {
        return "TeacherSaleDto{" +
                "teacherCode='" + teacherCode + '\'' +
                ", className='" + className + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", tuition='" + tuition + '\'' +
                '}';
    }

    public TeacherSaleDto(String teacherCode, String className, String teacherName, String tuition) {
        this.teacherCode = teacherCode;
        this.className = className;
        this.teacherName = teacherName;
        this.tuition = tuition;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }
}
