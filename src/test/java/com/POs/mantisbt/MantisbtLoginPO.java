package com.POs.mantisbt;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MantisbtLoginPO {

    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public MantisbtLoginPO(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
        this.driver = driver;
        this.js = js;
        this.vars = vars;
    }

    public void set_NAME_username(String key1) {
        By elem = By.name("username");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void set_NAME_password(String key2) {
        By elem = By.name("password");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key2);
    }

    public void click_CSSSELECTOR_button() {
        By elem = By.cssSelector(".button");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_CSSSELECTOR_login_info_left() {
        By elem = By.cssSelector(".login-info-left");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void login(String key1, String key2) {
        set_NAME_username(key1);
        set_NAME_password(key2);
        click_CSSSELECTOR_button();
        set_CSSSELECTOR_login_info_left();
    }

    public String set_CSSSELECTOR_login_info_left_1() {
        By elem = By.cssSelector(".login-info-left");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public void click_LINKTEXT_Logout() {
        By elem = By.linkText("Logout");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }
}
