package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePO;

public class Dashboard extends BasePO{

    By newContent = By.linkText("New content");
    By content = By.linkText("Content");
    By users = By.linkText("Users");

    public Dashboard(WebDriver driver) {
        super(driver);
    }

    public void clickNewContent(){
        click(newContent);
    }

    public void clickContent(){
        click(content);
    }

    public void clickUsers(){
        click(users);
    }



}
