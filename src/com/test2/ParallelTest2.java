package com.test2;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;

    @Test
    void loginTest(){
        System.setProperty("webdriver.gecko.driver","/Users/vijaychaurasiya/Downloads/geckodriver");
        driver =new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(org.openqa.selenium.By.id("user-name")).sendKeys("standard_user");
        driver.findElement(org.openqa.selenium.By.id("password")).sendKeys("secret_sauce");
        driver.findElement(org.openqa.selenium.By.id("login-button")).click();
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Swag Labs"));

    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
