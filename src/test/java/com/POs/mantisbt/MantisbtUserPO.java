package com.POs.mantisbt;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MantisbtUserPO {

    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public MantisbtUserPO(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
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
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key2);
    }

    public void click_CSSSELECTOR_button() {
        By elem = By.cssSelector(".button");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Manage() {
        By elem = By.linkText("Manage");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_ManageUsers() {
        By elem = By.linkText("Manage Users");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_form_titlebutton_small() {
        By elem = By.cssSelector(".form-title .button-small");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_NAME_realname(String key4) {
        By elem = By.name("realname");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key4);
    }

    public void set_NAME_email(String key5) {
        By elem = By.name("email");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key5);
    }

    public void click_NAME_access_level(String key6) {
        By elem = By.name("access_level");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key6 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_optionnth_child3() {
        By elem = By.cssSelector("option:nth-child(3)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Logout() {
        By elem = By.linkText("Logout");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void fillUser(String key1, String key2, String key3, String key4, String key5, String key6){
        set_NAME_username(key1);
        set_NAME_password(key2);
        click_CSSSELECTOR_button();
        click_LINKTEXT_Manage();
        click_LINKTEXT_ManageUsers();
        click_CSSSELECTOR_form_titlebutton_small();
        set_NAME_username(key3);
        set_NAME_realname(key4);
        set_NAME_email(key5);
        click_NAME_access_level(key6);
        click_CSSSELECTOR_optionnth_child3();
        set_CSSSELECTOR_trnth_child2center();
    }

    public void addUser(String key1, String key2, String key3, String key4, String key5, String key6) {
        fillUser(key1, key2, key3, key4, key5, key6);
        click_LINKTEXT_Logout();
    }


    public void set_CSSSELECTOR_trnth_child2center() {
        By elem = By.className("button");
        driver.findElement(elem).click();
    }

    public void addExistingUserFail(String key1, String key2, String key3, String key4, String key5, String key6) {
        fillUser(key1, key2, key3, key4, key5, key6);
    }

    public String set_CSSSELECTOR_trnth_child2center_1() {
        By elem = By.cssSelector("tr:nth-child(2) .center");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public void addEmptyUser(String key1, String key2) {
        set_NAME_username(key1);
        set_NAME_password(key2);
        click_CSSSELECTOR_button();
        click_LINKTEXT_Manage();
        click_LINKTEXT_ManageUsers();
        click_CSSSELECTOR_form_titlebutton_small();
        set_CSSSELECTOR_trnth_child2center();
    }
}


