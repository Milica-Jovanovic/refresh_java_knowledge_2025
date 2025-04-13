package com.company.oop.encapsulation;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    // Encapsulation - Data hiding
    // if it's it not private, it's default - accessible within the same package
    private  String firstName;
    private String lastName;

    // Composition - class depends on another class (class have another class in it)
    private Role role;


    // command + N to bring autocomplete constructor, getter, setter...

    // Below is the boilerplate code
  /* public User() {
    }

    public User(String firstName, String lastName, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Role getRole() {
        return role;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(Role role) {
        this.role = role;
    } */

}
