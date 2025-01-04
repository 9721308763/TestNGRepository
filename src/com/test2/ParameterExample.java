package com.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser,String url){

        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/vijaychaurasiya/Downloads/chromedriver-mac-x64/chromedriver");
            driver=new org.openqa.selenium.chrome.ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/vijaychaurasiya/Downloads/geckodriver");
            driver = new org.openqa.selenium.firefox.FirefoxDriver();
        }
        driver.get(url);
    }
    @Test(priority=1)
    void logoTest() {
        WebElement logo = driver.findElement(org.openqa.selenium.By.xpath(" /html/body/nav/div/a/img"));
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
