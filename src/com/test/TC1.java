package com.test;

import org.testng.annotations.*;

public class TC1 {

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
    public void test1() {
        System.out.println("This is test1");
    }

    @Test
    public void test2() {
        System.out.println("This is test2");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will executes before every test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will executes after every test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will executes before every suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will executes after every suite");
    }


}
