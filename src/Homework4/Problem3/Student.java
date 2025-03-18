package Homework4.Problem3;

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
