package com.test;
// 1. Setup
// 2. Login
// 3. close

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test
    void setup() {
        System.out.println("This is setup from first test case");
    }

    @Test
    void login() {
        System.out.print("This is login from first test case");
    }

    @Test
    void tearDown() {
        System.out.println("This is close from first test case");

    }


}
