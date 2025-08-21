package com.euroTech.step_definitions;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Point;

import java.time.Duration;

public class Hooks {
    @Before(order = 0)
    public void setUp() {
        Driver.get().manage().window().setPosition(new Point(-1000,0));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // System.out.println("\t Comes from before method");
    }

    @After(order = 0)
    public void tearDown() {
        Driver.closeDriver();
        // System.out.println("\t Comes from after method");
    }

    @Before(value = "@db", order = 1)
    public void openDB() {
        //  System.out.println("\t\t Database is opened");
    }

    @After(value = "@db", order = 1)
    public void closeDB() {
        //   System.out.println("\t\t Database is closed");
    }
}
