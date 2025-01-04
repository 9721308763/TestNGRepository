package com.test2;

import org.testng.annotations.DataProvider;

public class CustomDataProviderClass {


    @DataProvider(name = "loginDetails")
    public Object[][] getData() {
        Object[][] data = {{"vijay@gmail.com", "123445"}, {"shivansh@gmail.com", "1234567890"}, {"anita@gmail.com", "abc"}, {"sooraj@" +
                "xyxz","dddd"}, {"vaishnavi@gmail.com", "qwkjfkdf"}};
        return data;
    }
}
