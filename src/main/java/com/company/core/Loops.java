package com.company.core;

public class Loops {


    public static void demoForIterator() {

        for(int i=0; i<5; i++) {
            System.out.println(i);
        }
    }

    // for forEach loop we need a collection
    public static void demoForEach() {
        String[] cars = { "Honda", "Nissan", "Ford"};
        for(String car : cars){
            System.out.println(car);
        }
    }


}
