package com.zerobank.step_defs;

import com.zerobank.utilities.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Point;


import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        Point p = new Point(0,3000);

        //Minimize the current window to the set position
        Driver.get().manage().window().maximize();




        Driver.get().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }

   /* @After
    public void tearDown() {
        Driver.closeDriver();
    }

    */


}

