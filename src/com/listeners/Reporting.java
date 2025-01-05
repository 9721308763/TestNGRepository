package com.listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.listeners.Listeners.class)
public class Reporting {

    @Test
    void testStart() {
     System.out.println("This is my my test scenarios");
    }
    @Test
    void testSuccess() {
     System.out.println("Test is my test success scenarios");
    }
    @Test
    void testFailure() {
     System.out.println("Test is failed");
    }
    @Test
    void testSkip() {
       throw new SkipException( "Skipping this test");
    }
}
