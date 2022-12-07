package edu.global.golf.dto;

public class ClassDto {
    private String registeredMonth;
    private String customerNo;
    private String customerName;
    private String className;
    private String classArea;
    private String tuition;
    private String grade;

    @Override
    public String toString() {
        return "ClassDto{" +
                "registeredMonth='" + registeredMonth + '\'' +
                ", customerNo='" + customerNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", className='" + className + '\'' +
                ", classArea='" + classArea + '\'' +
                ", tuition='" + tuition + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public ClassDto(String registeredMonth, String customerNo, String customerName, String className, String classArea, String tuition, String grade) {
        this.registeredMonth = registeredMonth;
        this.customerNo = customerNo;
        this.customerName = customerName;
        this.className = className;
        this.classArea = classArea;
        this.tuition = tuition;
        this.grade = grade;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassArea() {
        return classArea;
    }

    public void setClassArea(String classArea) {
        this.classArea = classArea;
    }

    public String getTuition() {
        return tuition;
    }

    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
