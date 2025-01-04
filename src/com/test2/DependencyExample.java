package com.test2;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DependencyExample {
    @Test
    void startCar(){
        System.out.println("Car is started");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("Car is driving");
    }
    @Test(dependsOnMethods={"driveCar"})
    void stopCar(){
        System.out.println("Car is stopped");
    }
    @Test(dependsOnMethods={"stopCar","driveCar"} ,alwaysRun=true)
    void parkCar(){
        System.out.println("Car is parked");
    }
}
