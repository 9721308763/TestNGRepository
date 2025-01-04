package com.test;

import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will executes before every class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will executes before every class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will executes before every method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will executes after every method");
    }

    @Test
    public void test3() {
        System.out.println("This is test4");
    }

    @Test
    public void test4() {
        System.out.println("This is test5");
    }
}
