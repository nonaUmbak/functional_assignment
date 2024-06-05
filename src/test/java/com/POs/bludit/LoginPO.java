package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePO;

public class LoginPO extends BasePO{

    By usernameInput = By.name("username");
    By passwordInput = By.name("password");
    By submitButton = By.cssSelector("button[type='submit']");

    public LoginPO(WebDriver driver) {
        super(driver);
        driver.get("http://localhost:8080/admin");
    }


    public void loginTest(String username, String password){
        type(usernameInput, username);
        type(passwordInput, password);
        click(submitButton);
    }



}
