package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPassword extends Utility {

    By errorMessage = By.xpath("//form/h6[text() = 'Reset Password']");

    public String getErrorMessage(){

        return getTextFromElement(errorMessage);
    }
}
