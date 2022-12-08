package edu.global.golf.dto;

public class MemberDto {
    private String customerNo;
    private String customerName;
    private String phone;
    private String address;
    private String grade;

    @Override
    public String toString() {
        return "MemberDto{" +
                "customerNo='" + customerNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public MemberDto(String customerNo, String customerName, String phone, String address, String grade) {
        this.customerNo = customerNo;
        this.customerName = customerName;
        this.phone = phone;
        this.address = address;
        this.grade = grade;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
