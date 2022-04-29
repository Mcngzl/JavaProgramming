package day43_Abstraction.employeeTask;

public abstract class Employee extends Person{

    private final int id;
    private String jobtitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobtitle, double salary) {
        super(name, age, gender);
        if (id <=0){
            throw new RuntimeException("Invalid id : "+id);
        }
        this.id = id;
        setJobtitle(jobtitle);
       setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public double getSlary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    public String toString() {
        return "Employee{" +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
