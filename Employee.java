import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, int age) {
        this(firstName, lastName, age, 1000.0);
    }

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, 25, 1000.0);
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 30, 5000.0);
        Employee employee2 = new Employee("Jane", "Doe", 25);

        System.out.println("Employee 1: " + employee1.getFullName() + ", Age: " + employee1.getAge() + ", Salary: " + employee1.getSalary());
        System.out.println("Employee 2: " + employee2.getFullName() + ", Age: " + employee2.getAge() + ", Salary: " + employee2.getSalary());

        // Changing some details
        employee1.setAge(31);
        employee2.setSalary(1500.0);

        System.out.println("Updated Employee 1: " + employee1);
        System.out.println("Updated Employee 2: " + employee2);

        // Checking equality
        System.out.println("Are employees equal? " + employee1.equals(employee2));
    }
}
