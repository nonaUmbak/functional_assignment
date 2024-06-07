package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePagePO;

public class LogOutPage extends BasePagePO {

    By userIcon = By.className("imgm");
    By logOut = By.id("header_logout");

    By loginButton = By.name("submitLogin");


    public LogOutPage(WebDriver driver) {
        super(driver);
    }

    public void logout() {
        click(userIcon);
        click(logOut);
    }

    public boolean isLogoutSuccessful() {
        try {
            return isIn(loginButton);
        } catch (Exception e) {
            return false;
        }
    }


}
