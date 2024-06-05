package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePagePO;

public class LoginPage extends BasePagePO {

    By usernameInput = By.id("email");
    By passwordInput = By.id("passwd");
    By clickBox = By.id("stay_logged_in");
    By submitButton = By.name("submitLogin");

    public LoginPage(WebDriver driver) {
        super(driver);
        visit("http://localhost:8080//administrator");
    }

    
    public void login(String username, String password){
        type(usernameInput, username);
        type(passwordInput, password);
        select(clickBox);
        click(submitButton);
    }


}
