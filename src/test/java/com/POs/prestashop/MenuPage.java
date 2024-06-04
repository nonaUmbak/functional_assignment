package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuPage extends BasePagePO{

    By menu = ByClassName.className("menu");
    By catalog = By.id("maintab-AdminCatalog");
    By catalogSubMenu = ByClassName.className("submenu");
    By productMenu = By.id("subtab-AdminProducts");
    By localization = By.id("maintab-AdminParentLocalization");
    By localizationMenu = By.id("subtab-AdminStates");
    By productFeature = By.id("subtab-AdminFeatures");
    By productAttribute = By.id("subtab-AdminAttributesGroups");


    WebElement parentMenu, subMenu;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public void selectCatalogProduct(){
        parentMenu = driver.findElement(catalog);
        subMenu = driver.findElement(productMenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(parentMenu).moveToElement(subMenu).click().build().perform();
    }

    public void selectLocalization(){
        parentMenu = driver.findElement(localization);
        subMenu = driver.findElement(localizationMenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(parentMenu).moveToElement(subMenu).click().build().perform();
    }

    public void selectFeauture(){
        parentMenu = driver.findElement(catalog);
        subMenu = driver.findElement(productFeature);
        Actions actions = new Actions(driver);
        actions.moveToElement(parentMenu).moveToElement(subMenu).click().build().perform();
    }

    public void selectAttributes(){
        parentMenu = driver.findElement(catalog);
        subMenu = driver.findElement(productAttribute);
        Actions actions = new Actions(driver);
        actions.moveToElement(parentMenu).moveToElement(subMenu).click().build().perform();
    }


}
