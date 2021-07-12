package com.example;

import java.util.Date;

public class VariableExampleClass {

    private final int field;
    private final int forgottenField;
    private final Date date = new Date();
    public static final int JAVA_CONSTANT = 10;

    public VariableExampleClass() {
        field = 100;
    }

    public void changeValues(final int param) {
        param = 1; 

        date.setTime(0); 
        date = new Date(); 
        final int localVar;
        localVar = 42;
        localVar = 43; 
    }
}
