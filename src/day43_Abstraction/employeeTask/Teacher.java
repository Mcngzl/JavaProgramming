package day43_Abstraction.employeeTask;

public final class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int id, String jobtitle, double slary) {
        super(name, age, gender, id, jobtitle, slary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeping 8 hours");
    }
}
