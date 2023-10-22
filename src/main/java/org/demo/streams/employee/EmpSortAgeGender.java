package org.demo.streams.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Sort Employee based on gender and age is above 30 using Java 8 stream API?
public class EmpSortAgeGender {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee("Vijay",30, 1000, "M"),
                new Employee("Kumar",34, 2000, "M"),
                new Employee("Via",20, 4000, "F"),
                new Employee("Kiran",40, 2500, "M"),
                new Employee("Via",33, 2500, "F")
        );

        empList.stream()
                .filter(e -> e.getAge() > 30)
                .sorted(Comparator.comparing(Employee::getGender))
                .forEach(System.out::println);

    }
}
