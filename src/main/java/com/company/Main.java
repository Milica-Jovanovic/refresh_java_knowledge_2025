package com.company;

import com.company.core.Loops;
import com.company.core.Methods;
import com.company.core.SelectionStatements;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //***********CORE***********//

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


    }
}
