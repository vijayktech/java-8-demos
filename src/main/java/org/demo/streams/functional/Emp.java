package org.demo.streams.functional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


enum Gender {
    MALE,
    FEMALE,
    OTHER
}

enum Role {
    EMPLOYEE,
    MANAGER,
    SENIOR_MANAGER
}

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Emp {
    private final String id;
    private final String name;
    private final int age;
    private final Gender gender;
    private final Role role;
    private final double salary;

    @Override
    public String toString() {
        return String.format("Id: %s, Name: %s, Age: %d, Gender: %s, Role: %s",
                this.id, this.name, this.age, this.gender, this.role);
    }
}
