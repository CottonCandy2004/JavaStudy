package Homework4.Problem3;

import java.time.LocalDate;
import java.time.Period;
public class Student {
    private String sname;
    private String sbirthday;
    private int sclass;
    Student(String name, String birthday, int sclass) {
        this.sname = name;
        this.sbirthday = birthday;
        this.sclass = sclass;
    }
    Student() {
        this.sname = "Unknown";
        this.sbirthday = "2000-01-01";
        this.sclass = 1;
    }
    public void setname(String name) {
        this.sname = name;
    }
    public void setbirthday(String birthday) {
        this.sbirthday = birthday;
    }
    public void setclass(int sclass) {
        this.sclass = sclass;
    }
    public void print() {
        System.out.println("Name: " + this.sname);
        System.out.println("Birthday: " + this.sbirthday);
        System.out.println("Class: " + this.sclass);
    }
}

class CollegeStudent extends Student {
    CollegeStudent() {
        super();
    }
    
    CollegeStudent(String name, String birthday, int sclass) {
        super(name, birthday, sclass);
    }
    
    public void setbirthday(String sbirthday) {
        if (sbirthday.matches("\\d{4}-\\d{2}-\\d{2}")) {
            LocalDate birthDate = LocalDate.parse(sbirthday);
            LocalDate now = LocalDate.now();
            int age = Period.between(birthDate, now).getYears();
            if (age >= 17 && age <= 30) {
                super.setbirthday(sbirthday);
            } else {
                System.out.println("Age must be between 17 and 30 years");
            }
        } else {
            System.out.println("Invalid birthday format. Use YYYY-MM-DD");
        }
    }
}