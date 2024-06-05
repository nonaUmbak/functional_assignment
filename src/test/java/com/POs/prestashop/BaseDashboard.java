package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.POs.BasePagePO;

public class BaseDashboard extends BasePagePO{

    public BaseDashboard(WebDriver driver) {
        super(driver);
        driver.get("http://localhost:8080//administrator");
    }

    WebElement parentMenu, subMenu;

    public void selectMenu(By parent, By sub) {
        parentMenu = driver.findElement(parent);
        subMenu = driver.findElement(sub);
        Actions actions = new Actions(driver);
        actions.moveToElement(parentMenu).moveToElement(subMenu).click().build().perform();
    }

}
