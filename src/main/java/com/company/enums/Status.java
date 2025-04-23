package com.company.enums;

public enum Status {

    OPEN("Open"), IN_PROGRESS("In progree"), UAT_TEST("UAT Testing"), COMPLETED("Completed");

    private final String value;

    Status(String value) {
        this.value = value;
    }
}

// If we create final constants we need to assign these variables in 3 different ways:
// 1. in the same statement, variable = value
// 2. in the constructor
// 3. in the block