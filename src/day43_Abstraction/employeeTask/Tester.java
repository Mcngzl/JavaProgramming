package day43_Abstraction.employeeTask;

public final class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobtitle, double slary) {
        super(name, age, gender, id, jobtitle, slary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours");

    }

    public void bugreport(){
        System.out.println(getName()+" is creating bug reports");
    }



}
