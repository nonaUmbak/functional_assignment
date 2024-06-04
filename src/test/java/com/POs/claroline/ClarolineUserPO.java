package com.POs.claroline;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ClarolineUserPO {

    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public ClarolineUserPO(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
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

    public void click_LINKTEXT_Platformadministration() {
        By elem = By.linkText("Platform administration");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Createuser() {
        By elem = By.linkText("Create user");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_lastname(String key3) {
        By elem = By.id("lastname");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key3);
    }

    public void set_ID_firstname(String key4) {
        By elem = By.id("firstname");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key4);
    }

    public void set_ID_username(String key5) {
        By elem = By.id("username");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key5);
    }

    public void set_ID_password_conf(String key6) {
        By elem = By.id("password_conf");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key6);
    }

    public void set_ID_password_1(String key7) {
        By elem = By.id("password");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key7);
    }

    public void click_ID_student() {
        By elem = By.id("student");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_ID_applyChange() {
        By elem = By.id("applyChange");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_CSSSELECTOR_msgSuccess() {
        By elem = By.cssSelector(".msgSuccess");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void addUser(String key1, String key2, String key3, String key4, String key5, String key6, String key7) {
        set_ID_login(key1);
        set_ID_password(key2);
        click_CSSSELECTOR_buttonnth_child11();
        click_LINKTEXT_Platformadministration();
        click_LINKTEXT_Createuser();
        set_ID_lastname(key3);
        set_ID_firstname(key4);
        set_ID_username(key5);
        set_ID_password_conf(key6);
        set_ID_password_1(key7);
        click_ID_student();
        click_ID_applyChange();
        set_CSSSELECTOR_msgSuccess();
    }

    public String set_CSSSELECTOR_msgSuccess_1() {
        By elem = By.cssSelector(".msgSuccess");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public void click_LINKTEXT_Logout() {
        By elem = By.linkText("Logout");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }


    public void set_ID_search_user(String key3) {
        By elem = By.id("search_user");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key3);
    }

    public void click_CSSSELECTOR_adminUserinputnth_child2() {
        By elem = By.cssSelector(".adminUser input:nth-child(2)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_L0() {
        By elem = By.id("L0");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            WebElement element = driver.findElement(elem);
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
    }

    public void searchUser(String key1, String key2, String key3) {
        set_ID_login(key1);
        set_ID_password(key2);
        click_CSSSELECTOR_buttonnth_child11();
        click_LINKTEXT_Platformadministration();
        set_ID_search_user(key3);
        click_CSSSELECTOR_adminUserinputnth_child2();
        set_ID_L0();
    }

    public String set_ID_L0_1() {
        By elem = By.id("L0");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public String set_CSSSELECTOR_tdnth_child3() {
        By elem = By.cssSelector("td:nth-child(3)");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public String set_CSSSELECTOR_tdnth_child6() {
        By elem = By.cssSelector("td:nth-child(6)");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }
}
