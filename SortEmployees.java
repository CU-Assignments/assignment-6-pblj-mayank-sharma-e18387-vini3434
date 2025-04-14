import java.util.*;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30, 50000),
            new Employee("Bob", 25, 60000),
            new Employee("Charlie", 35, 45000)
        );

        // Sorting by name
        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("Sorted by Name: " + employees);

        // Sorting by age
        employees.sort(Comparator.comparingInt(Employee::getAge));
        System.out.println("Sorted by Age: " + employees);

        // Sorting by salary
        employees.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Sorted by Salary: " + employees);
    }
}
