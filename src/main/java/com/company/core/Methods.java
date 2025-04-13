package com.company.core;

public class Methods {


    // Instance methods belongs to object

    public void methodA() {
        System.out.println("Method A() is called");
    }

    public void methodA(String str) {
        System.out.println("methodA(String str) is called");
    }

    public String methodB() {
        return "methodB() is called";
    }

    public String methodB(int x) {
        return "methodB(int x) is called";
    }

    // Static methods, belongs to class, utility methods are static
    // if the method doesn't have any dependencies on instance variables is good to be static

    public static  void methodC(){
        System.out.println("methodC() is called");
    }


}
