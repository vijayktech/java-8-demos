package org.demo.streams.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Sort employee byname and salary using java 8 stream API
public class EmployeeSorting {

    public static void main(String[] args) {
        List<Employee> empList =  Arrays.asList(
                new Employee("Vijay",30, 1000, "M"),
                new Employee("Kumar",34, 2000, "M"),
                new Employee("Via",20, 4000, "F"),
                new Employee("Kiran",40, 2500, "M")
        );

//    List<Employee> sortedList = (List<Employee>)
            empList.stream()
                .sorted(
                        Comparator.comparing(Employee::getName)  // first sorted using Name
                                .thenComparing(Comparator.comparing(Employee::getSalary))) // then sorting with Salary based
           // .collect(Collectors.toList());
                    .forEach(System.out::println);

    }
}
