package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.pages.LoginPage;
import com.reusablefunctions.SeleniumUtilities;

public class LoginTestCase extends Library{
	@BeforeTest
    public void stratUp() {
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
       
    }
    @Test
    public void login() {
        LoginPage lpage=new LoginPage(driver);
        lpage.login("Admin", "admin123");
       
    }
    @AfterClass
    public void close() throws IOException {
        SeleniumUtilities sUti = new SeleniumUtilities(driver);
        sUti.to_take_screenshot("C:\\Users\\Chandreshwar\\eclipse-workspace\\HybridSeleniumCucumber\\src\\main\\resources\\Screenshots\\orangeHRMLogin.png");
        quit();
    }
}
