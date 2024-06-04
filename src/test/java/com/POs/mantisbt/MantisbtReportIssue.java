package com.POs.mantisbt;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MantisbtReportIssue {

    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public MantisbtReportIssue(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
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

    public void click_LINKTEXT_ReportIssue() {
        By elem = By.linkText("Report Issue");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_button_1(String key3) {
        By elem = By.cssSelector(".button");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            elem = By.name("category_id");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key3 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_row_1nth_child2optionnth_child2(String key4) {
        By elem = By.cssSelector(".row-1:nth-child(2) option:nth-child(2)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            elem = By.name("reproducibility");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key4 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_row_2nth_child3optionnth_child3(String key5) {
        By elem = By.cssSelector(".row-2:nth-child(3) option:nth-child(3)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            elem = By.name("severity");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key5 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_optionnth_child7(String key6) {
        By elem = By.cssSelector("option:nth-child(7)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            elem = By.name("priority");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key6 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_row_2nth_child5optionnth_child6() {
        By elem = By.cssSelector(".row-2:nth-child(5) option:nth-child(6)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_NAME_summary(String key7) {
        By elem = By.name("summary");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key7);
    }

    public void set_NAME_description(String key8) {
        By elem = By.name("description");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key8);
    }

    public void click_CSSSELECTOR_button_2() {
        By elem = By.cssSelector(".button");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            elem = By.id("filter_open");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement element = driver.findElement(elem);
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(elem);
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(elem);
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
    }

    public void click_ID_filter_open() {
        By elem = By.id("filter_open");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_buglisttrnth_child4() {
        By elem = By.cssSelector("#buglist tr:nth-child(4)");
        // MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_CSSSELECTOR_leftnth_child10() {
        By elem = By.cssSelector(".left:nth-child(10)");
        MyUtils.WaitForElementLoaded(driver, elem);
    }

    public void addNewIssue(String key1, String key2, String key3, String key4, String key5, String key6, String key7, String key8) {
        set_NAME_username(key1);
        set_NAME_password(key2);
        click_CSSSELECTOR_button();
        click_LINKTEXT_ReportIssue();
        click_CSSSELECTOR_button_1(key3);
        click_CSSSELECTOR_row_1nth_child2optionnth_child2(key4);
        click_CSSSELECTOR_row_2nth_child3optionnth_child3(key5);
        click_CSSSELECTOR_optionnth_child7(key6);
        click_CSSSELECTOR_row_2nth_child5optionnth_child6();
        set_NAME_summary(key7);
        set_NAME_description(key8);
        click_CSSSELECTOR_button_2();
    }

    public String set_CSSSELECTOR_leftnth_child10_1() {
        By elem = By.cssSelector(".left:nth-child(10)");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public void click_LINKTEXT_Logout() {
        By elem = By.linkText("Logout");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_ViewIssues() {
        By elem = By.linkText("View Issues");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_NAME_bug_arr() {
        By elem = By.name("bug_arr[]");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_NAME_action(String key3) {
        By elem = By.name("action");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key3 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void clickSaveButton(){
        By elem = By.cssSelector(".button");
        driver.findElement(elem).click();
    }

    public void set_CSSSELECTOR_trnth_child4issue_status() {
        By elem = By.cssSelector("tr:nth-child(4) .issue-status");
        MyUtils.WaitForElementLoaded(driver, elem);
    }

    public void assignIssue(String key1, String key2, String key3) {
        set_NAME_username(key1);
        set_NAME_password(key2);
        click_CSSSELECTOR_button();
        click_LINKTEXT_ViewIssues();
        click_NAME_bug_arr();
        click_NAME_action(key3);
        clickSaveButton();
        clickSaveButton();
        set_CSSSELECTOR_trnth_child4issue_status();
    }

    public String set_CSSSELECTOR_trnth_child4issue_status_1() {
        By elem = By.cssSelector("tr:nth-child(4) .issue-status");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public void click_CSSSELECTOR_trnth_child4aimg(String key3) {
        By elem = By.cssSelector("tr:nth-child(4) a > img");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            elem = By.name("priority");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key3 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_row_2tdnth_child2optionnth_child2() {
        By elem = By.cssSelector(".button");
        driver.findElement(elem).click();
    }

    public void set_CSSSELECTOR_row_2nth_child7tdnth_child2() {
        By elem = By.cssSelector(".row-2:nth-child(7) > td:nth-child(2)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        System.out.println(driver.findElement(elem).getText());
    }

    public void updateIssue(String key1, String key2, String key3) {
        set_NAME_username(key1);
        set_NAME_password(key2);
        click_CSSSELECTOR_button();
        click_LINKTEXT_ViewIssues();
        click_CSSSELECTOR_trnth_child4aimg(key3);
        clickSaveButton();
        set_CSSSELECTOR_row_2nth_child7tdnth_child2();
    }

    public String set_CSSSELECTOR_row_2nth_child7tdnth_child2_1() {
        By elem = By.cssSelector(".row-2:nth-child(7) > td:nth-child(2)");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }
}
