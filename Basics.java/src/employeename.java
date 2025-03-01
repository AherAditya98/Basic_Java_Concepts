import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private final int id;
    private final String name;
    private final double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Overriding toString() for better output
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class employeename {
    public static void main(String[] args) {
        // Employee List
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 60000),
                new Employee(2, "Bob", 55000),
                new Employee(3, "Andrew", 75000),
                new Employee(4, "Charlie", 70000),
                new Employee(5, "Anna", 80000)
        );

        // Filtering employees whose names start with 'A'
        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getName().startsWith("A"))
                .toList();

        // Printing the filtered employees
        filteredEmployees.forEach(System.out::println);
    }
}
