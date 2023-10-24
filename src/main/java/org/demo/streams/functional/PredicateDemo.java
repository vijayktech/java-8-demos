package org.demo.streams.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        // Employees who are Male and age greater than 25
        // Employees who are Female and are Managers.

        Predicate<Emp> empMaleGreater25 = emp -> Gender.MALE.equals(emp.getGender())
                                                    && emp.getAge() > 25;

        Predicate<Emp> empFemaleManagers = emp -> Gender.FEMALE.equals(emp.getGender())
                                                    && Role.MANAGER.equals(emp.getRole());

        List<Emp> empList = Arrays.asList(
            new Emp("1", "Tony Stark", 23, Gender.MALE, Role.EMPLOYEE, 25000),
            new Emp ("2", "Steve Rogers", 28, Gender.MALE, Role.MANAGER, 35000),
            new Emp("3", "Natasha Romanoff", 23, Gender.FEMALE, Role.MANAGER, 30000),
            new Emp("4", "Wanda Maximoff", 25, Gender.FEMALE, Role.SENIOR_MANAGER, 50000)
        );

        System.out.println("Employees who are Male and age greater than 25 !!");
        empList.stream().filter(empMaleGreater25).forEach(System.out::println);
        System.out.println("-------------------------");
        System.out.println("Employees who are Female and are Managers");
        empList.stream().filter(empFemaleManagers).forEach(System.out::println);
    }
}
