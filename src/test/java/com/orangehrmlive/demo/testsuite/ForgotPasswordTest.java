package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.ForgotPassword;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ForgotPassword forgotPassword = new ForgotPassword();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        // click on the ‘Forgot your password’ link
        loginPage.clickOnForgotPasswordLink();
        //This is from requirement
        String expectedText = "Reset Password";
        // Verify the Reset Password text is displayed
        Assert.assertEquals(forgotPassword.getErrorMessage(), expectedText, "Reset Password is not displayed");


    }
}
