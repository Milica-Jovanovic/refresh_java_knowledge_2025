package com.company.lambda.shape;

public class ShapeTest {

    public static void main(String[] args) {

        Drawable drawable = () -> System.out.println("Drawing a circle.");
        drawable.draw();

        Drawable2 drawable2 = shape -> System.out.println("Drawing a " + shape + ".");
        drawable2.draw("triangle");

        Drawable3 drawable3 = (shape, name) -> System.out.println(name + " is drawing a " + shape + ".");
        drawable3.draw("triangle", "User");

        Drawable4 drawable4 = (shape, area) -> "Drawing a " + shape + " and its area is " + area + ".";
        System.out.println(drawable4.draw("circle", 3));

        Drawable3 drawable3b = (shape, name) -> {
            System.out.println("What kind of shape is this? " + shape);
            System.out.println("Who is drawing this shape? " + name);
        };
        drawable3b.draw("Circle", "User");
    }


}

// In our application we will not going to create one interface with one abstract method, because all of our interfaces will have more than one abstract method
// But when we use the stream we will use lambda expression, all ste stream concept is built on top of functional interface so we need to understand the concept now