package day30_CustomClass;

public class Employee {
    public String name;
    public char gender;
    public int age;
    public  int id;
    public String jobtitle;
    public double salary;
    public  boolean isfulltime;
    public boolean isFullTime;


    public void setInfo(String name, char gender, int age, int id, String jobtitle, double salary, boolean isfulltime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.isfulltime = isfulltime;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary= $" + salary +
                ", isfulltime=" + isfulltime +
                '}';
    }

    public void work(){
        System.out.println(jobtitle+" "+name+" is working");
    }









}
