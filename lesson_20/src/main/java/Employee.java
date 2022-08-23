import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String lastName;
    private String idCard;
    private double salary;

    public Employee(String name, String lastName, String idCard, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.idCard = idCard;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", salary=" + salary +
                '}';
    }
}
