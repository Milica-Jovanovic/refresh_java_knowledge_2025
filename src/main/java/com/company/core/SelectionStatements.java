package com.company.core;

public class SelectionStatements {

    String str;

    // We have 3 types of variables: local, instance and static
    // local belongs to method, instance belongs to object, static belongs to class
    // username is local variable, local belongs to method
    // str is instance variable, and every time object is created it will be available

    public static  void demoIfStatement(){
        String username = "Mili";
        if (username.equals("Mili")) {
            System.out.println("PASS");
        } else if(username.equals("Mike")){
            System.out.println("FAIL");
        } else {
            System.out.println("Not valid");
        }
    }


    public  static void demoSwitchCaseStatement() {
        String username = "Mike";

        switch(username){
            case "Mili":
                System.out.println("PASS");
                break; // if we don't have break even this case is correct, it will go and execute next case
            case "Mike":
                System.out.println("FAIL");
                break;
            default:
                System.out.println("Not valid");
        }
    }



}
