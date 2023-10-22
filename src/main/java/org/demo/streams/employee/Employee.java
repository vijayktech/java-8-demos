package org.demo.streams.employee;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    String name;
    int age;
    double salary;
    String gender;

    @Override
    public String toString() {
        return
        "Employee { " +
         "Name:"+ name+" - "+
         "Age:"+ age +" - "+
         "Sal:"+ salary +" - "+
         "Gender:"+ gender +
        "}";
    }
}
