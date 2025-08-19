package com.euroTech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before (order = 0)
    public void setUp (){
        System.out.println("\t Comes from before method");
    }
    @After (order = 0)
    public void tearDown (){
        System.out.println("\t Comes from after method");
    }
    @Before (value = "@db", order = 1)
    public void openDB(){
        System.out.println("\t\t Database is opened");
    }
    @After (value = "@db", order = 1)
    public void closeDB(){
        System.out.println("\t\t Database is closed");
    }
}
