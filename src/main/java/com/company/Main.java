package com.company;

import com.company.core.Loops;
import com.company.core.Methods;
import com.company.core.SelectionStatements;
import com.company.enums.Gender;
import com.company.oop.abstraction.implementation.UserServiceImplementation;
import com.company.oop.abstraction.service.UserService;
import com.company.oop.encapsulation.Role;
import com.company.oop.encapsulation.User;
import com.company.oop.inheritance.BaseEntity;
import com.company.oop.inheritance.Project;
import com.company.oop.polymorphism.Employee;

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
        User user = new User("Milica", "Jovanovic",  new Role(123456789, "Software Engineer"), Gender.FEMALE);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());

        // INHERITANCE
       Project project1 = new Project(123, LocalDateTime.now(), 124, LocalDateTime.now().minusHours(2), 125, "CODE123", "New Project 123", new User("Mike", "Smith", new Role(12, "manager"), Gender.MALE), LocalDate.now(), LocalDate.now().plusDays(5),"IN PROGRESS", "New project" );
       System.out.println(project1.getId());

       Project project2 = new Project(1, LocalDateTime.now(), 1, LocalDateTime.now().minusHours(5),
               1, "PRJ001", "HR CRM", new User("Mike", "Smith", new Role(1, "Manager"), Gender.MALE),
               LocalDate.now(), LocalDate.now().plusDays(5), "IN PROGRESS", "HR CRM Detail Info");

        // INTERFACE

        UserService userService = new UserService();
        System.out.println(userService.userByFirstName("Mike").getLastName());

        // POLYMORPHISM
        Employee employee = new Employee();
        BaseEntity employee2 = new Employee();
        UserServiceImplementation userServiceImplementation = new UserService();
        // parent - child relationship
        // reference type - object type

        employee.getEmployeeHours();
        ((Employee)employee2).getEmployeeHours();
        // Down Casting
        // Casting object to access child method

        // We can build an application based on OOP knowledge
        // Encapsulation - whenever we create table in the database, that table it will be a class, and all in there will be created in an encapsulated way (getters and setters)
        // Inheritance - we will have some BaseEntity classes that we can inherit, we need some data that we don't want to show in UI but we want it in DB so we will inherit it
        // Abstraction and Interfaces we will use a lot - all our application business logic will be created through interfaces, business logic will be created through services and this services will be implemented interfaces
        // Polymorphism - whenever you need to pass some object is the best to do it through polymorphic way
    }
}
