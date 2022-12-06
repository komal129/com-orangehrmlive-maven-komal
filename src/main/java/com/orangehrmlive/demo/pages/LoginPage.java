package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@type = 'submit']");

    By errorMessage = By.xpath("//span/h6[text() = 'Dashboard']");
    By forgotPassword = By.xpath("//form/div/p [text() = 'Forgot your password? ']");

    public void enterUsername(String email){

        sendTextToElement(userNameField, email);
    }

    public void enterPassword(String password){

        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){

        clickOnElement(loginButton);
    }

    public String getErrorMessage(){

        return getTextFromElement(errorMessage);
    }

    public void clickOnForgotPasswordLink(){

        clickOnElement(forgotPassword);
    }



}
