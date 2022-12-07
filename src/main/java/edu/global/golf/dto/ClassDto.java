package edu.global.golf.dto;

public class ClassDto {
    private String registeredMonth;
    private String customerNo;
    private String classArea;
    private int tuition;
    private String teacherCode;

    @Override
    public String toString() {
        return "ClassDto{" +
                "registeredMonth='" + registeredMonth + '\'' +
                ", customerNo='" + customerNo + '\'' +
                ", classArea='" + classArea + '\'' +
                ", tuition=" + tuition +
                ", teacherCode='" + teacherCode + '\'' +
                '}';
    }

    public ClassDto(String registeredMonth, String customerNo, String classArea, int tuition, String teacherCode) {
        this.registeredMonth = registeredMonth;
        this.customerNo = customerNo;
        this.classArea = classArea;
        this.tuition = tuition;
        this.teacherCode = teacherCode;
    }

    public String getRegisteredMonth() {
        return registeredMonth;
    }

    public void setRegisteredMonth(String registeredMonth) {
        this.registeredMonth = registeredMonth;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getClassArea() {
        return classArea;
    }

    public void setClassArea(String classArea) {
        this.classArea = classArea;
    }

    public int getTuition() {
        return tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }
}
