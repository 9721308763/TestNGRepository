package com.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {

    WebDriver driver;

    @BeforeClass
    void setup(){
        System.setProperty("webdriver.gecko.driver","/Users/vijaychaurasiya/Downloads/geckodriver");
        driver=new org.openqa.selenium.firefox.FirefoxDriver();
        driver.get("https://www.orangehrm.com/en/book-a-free-demo");
    }
    @Test(priority=1)
    void logoTest(){
       WebElement logo= driver.findElement(org.openqa.selenium.By.xpath(" /html/body/nav/div/a/img"));
       Assert.assertTrue(logo.isDisplayed());
     }

     @Test(priority=2)
     void getTitle(){
         String titile=driver.getTitle();
         Assert.assertEquals(titile,"Book Your Free Demo | OrangeHRM");
     }

     @AfterClass
     void tearDown(){
        driver.quit();
     }
}
