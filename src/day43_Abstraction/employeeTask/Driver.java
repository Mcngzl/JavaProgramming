package day43_Abstraction.employeeTask;

public final class Driver extends Employee{
    public Driver(String name, int age, char gender, int id, String jobtitle, double slary) {
        super(name, age, gender, id, jobtitle, slary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+"sleeps 10 hours");
    }


}
