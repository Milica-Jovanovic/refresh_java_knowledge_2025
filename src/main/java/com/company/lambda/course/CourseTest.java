package com.company.lambda.course;

public class CourseTest {

    public static void main(String[] args) {

        //*********************************************
        // If we have more than once abstract method we will use this way

        Course java = new Java();
        java.study();

        Course selenium = new Selenium();
        selenium.study();


        //*********************************************
        Course java2 = new Course() {

            // Anonymous Inner Class
            @Override
            public void study() {
                System.out.println("Studying Java");
            }
        };
        java2.study();


        Course selenium2 = new Course() {
            @Override
            public void study() {
                System.out.println("Studying Selenium");
            }
        };
        selenium2.study();

        //*********************************************
        // When we have only one abstract method we can use lambda

        Course javaCourse = () -> System.out.println("Studying Java");
        javaCourse.study();

        Course seleniumCourse = () -> System.out.println("Studying Selenium");
        seleniumCourse.study();

        // We can use Lambda in a functional interface
        // Functional interface is if our interface has only one abstract method
    }

}
