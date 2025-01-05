package com.test2;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest1 {
    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","/Users/vijaychaurasiya/Downloads/geckodriver");
        driver =new FirefoxDriver();
        driver.get("https://www.orangehrm.com/en/book-a-free-demo");
        WebElement logo= driver.findElement(org.openqa.selenium.By.xpath(" /html/body/nav/div/a/img"));
        Assert.assertTrue(logo.isDisplayed());

        Thread.sleep(5000);

    }

    @Test
    void homePageTitle() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","/Users/vijaychaurasiya/Downloads/geckodriver");
        driver =new FirefoxDriver();
        driver.get("https://www.orangehrm.com/en/book-a-free-demo");
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Book Your Free Demo | OrangeHRM"));
        Thread.sleep(5000);
    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }

}
