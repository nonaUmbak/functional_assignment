package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage extends BasePagePO {

    By userIcon = By.className("imgm");
    By logOut = By.id("header_logout");

    By loginButton = By.name("submitLogin");


    public LogOutPage(WebDriver driver) {
        super(driver);
    }

    public void logout() {
        try{
            Thread.sleep(2000);
            click(userIcon);

            Thread.sleep(2000);
            click(logOut);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Exception happened in logout");
        }
    }

    public boolean isLogoutSuccessful() {
        try {
            return isIn(loginButton);
        } catch (Exception e) {
            return false;
        }
    }


}
