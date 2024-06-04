package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePO;

public class LogoutPO extends BasePO{

    By logout = By.linkText("Log out");

    public LogoutPO(WebDriver driver) {
        super(driver);
    }

    public void logout(){
        click(logout);
    }

}
