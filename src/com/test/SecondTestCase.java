package com.test;

import org.testng.annotations.Test;
// 1. Setup
// 2. Login
// 3. Close

public class SecondTestCase {

    @Test(priority = 1)
    public void setup() {
        System.out.println("Hello I am setup method");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("Hello I am login method");
    }

    @Test(priority = 3)
    public void tearDown() {
        System.out.println("Hello I am closing method");
    }

}
