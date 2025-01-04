package com.test2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Data provider example
public class DataProviderExample {

    @Test(dataProvider = "loginDetails",dataProviderClass=CustomDataProviderClass.class)
    public void loginTest(String email, String pwd) {
        System.out.println("Email: " + email + " Password: " + pwd);

    }


}
