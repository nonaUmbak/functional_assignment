package com.POs.claroline;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ClarolineLoginPO {
    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public ClarolineLoginPO(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
        this.driver = driver;
        this.js = js;
        this.vars = vars;
    }

    public void set_ID_login(String key1) {
        By elem = By.id("login");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void set_ID_password(String key2) {
        By elem = By.id("password");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key2);
    }

    public void click_CSSSELECTOR_buttonnth_child11() {
        By elem = By.cssSelector("button:nth-child(11)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Logout() {
        By elem = By.linkText("Logout");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void login(String key1, String key2) {
        set_ID_login(key1);
        set_ID_password(key2);
        click_CSSSELECTOR_buttonnth_child11();
        click_LINKTEXT_Logout();
    }

    public void set_ID_login_1(String key1) {
        By elem = By.id("login");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void set_ID_password_1(String key2) {
        By elem = By.id("password");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key2);
    }

    public void click_CSSSELECTOR_menuuserName() {
        By elem = By.cssSelector(".menu > .userName");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_CSSSELECTOR_blockHeaderuserName() {
        By elem = By.cssSelector(".blockHeader > .userName");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void userLogin(String key1, String key2) {
        set_ID_login_1(key1);
        set_ID_password_1(key2);
        click_CSSSELECTOR_buttonnth_child11();
        click_CSSSELECTOR_menuuserName();
        set_CSSSELECTOR_blockHeaderuserName();
    }

    public String set_CSSSELECTOR_blockHeaderuserName_1() {
        By elem = By.cssSelector(".blockHeader > .userName");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }
}
