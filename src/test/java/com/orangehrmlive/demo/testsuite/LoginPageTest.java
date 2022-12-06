package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedTest = "Dashboard";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedTest, "Dashboard is not displayed");

    }
}
