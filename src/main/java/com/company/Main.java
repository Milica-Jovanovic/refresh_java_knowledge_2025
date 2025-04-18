package com.company;

import com.company.core.Loops;
import com.company.core.Methods;
import com.company.core.SelectionStatements;
import com.company.oop.abstraction.service.UserService;
import com.company.oop.encapsulation.Role;
import com.company.oop.encapsulation.User;
import com.company.oop.inheritance.Project;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //*********** CORE ***********//

        // METHODS
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB());
        System.out.println(methods.methodB(5));

        // methods.methodC(); - not possible because methodC() is static method
        Methods.methodC();

        // LOOPS
        Loops.demoForIterator();
        Loops.demoForEach();

        // SELECTION STATEMENTS
        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();


        //*********** OOP ***********//

        // ENCAPTULATION
        User user = new User("Milica", "Jovanovic",  new Role(123456789, "Software Engineer"));
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());

        // INHERITANCE
       Project project1 = new Project(123, LocalDateTime.now(), 124, LocalDateTime.now().minusHours(2), 125, "CODE123", "New Project 123", new User("Mike", "Smith", new Role(12, "manager")), LocalDate.now(), LocalDate.now().plusDays(5),"IN PROGRESS", "New project" );
       System.out.println(project1.getId());

       Project project2 = new Project(1, LocalDateTime.now(), 1, LocalDateTime.now().minusHours(5),
               1, "PRJ001", "HR CRM", new User("Mike", "Smith", new Role(1, "Manager")),
               LocalDate.now(), LocalDate.now().plusDays(5), "IN PROGRESS", "HR CRM Detail Info");

        // INTERFACE

        UserService userService = new UserService();
        System.out.println(userService.userByFirstName("Mike").getLastName());

    }
}
