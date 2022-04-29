package day43_Abstraction.employeeTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobtitle, double slary) {
        super(name, age, gender, id, jobtitle, slary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 6 hours");
    }

    public void unitTest1(){
        System.out.println(getName()+" is unit testing");
    }


}
