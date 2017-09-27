package Miscellaneous;


import java.util.Comparator;
import java.util.Date;

public class Employee implements Comparable<Employee> {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    private String name;

    private int salary;

    private Date joiningDate;

    public Employee (String name, int salary, Date joiningDate){
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int compareTo(Employee e1) {
        if (e1.name.equals(this.name)) {
            if (e1.salary == this.salary) {
                if (e1.joiningDate.equals(this.joiningDate)) {
                    return 0;
                } else {
                    return e1.joiningDate.compareTo(this.joiningDate);
                }
            } else {
                return e1.salary - this.salary;
            }
        } else {
            return e1.name.compareTo(this.name);
        }

    }

    @Override
    public String toString(){
        return "name=" + this.name + ", salary=" + this.salary + ", joiningDate=" +
                this.joiningDate + "]";
    }

}
