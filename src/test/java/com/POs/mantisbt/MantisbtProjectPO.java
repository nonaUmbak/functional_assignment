package com.POs.mantisbt;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MantisbtProjectPO {

    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public MantisbtProjectPO(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
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

    public void click_LINKTEXT_Manage() {
        By elem = By.linkText("Manage");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_ManageProjects() {
        By elem = By.linkText("Manage Projects");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_form_titlebutton_small() {
        By elem = By.cssSelector(".form-title .button-small");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_NAME_name() {
        By elem = By.name("name");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_NAME_name_1(String key3, String key4) {
        By elem = By.name("name");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key3);
        {
            elem = By.name("status");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key4 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_row_2optionnth_child2() {
        By elem = By.cssSelector(".row-2 option:nth-child(2)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_row_1optionnth_child1() {
        By elem = By.cssSelector(".row-1 option:nth-child(1)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_NAME_description(String key5) {
        By elem = By.name("description");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key5);
    }

    public void click_CSSSELECTOR_row_1() {
        By elem = By.className("button");
        driver.findElement(elem).click();
    }

    public void set_CSSSELECTOR_row_1tdnth_child5() {
        By elem = By.cssSelector(".row-1 > td:nth-child(5)");
        // MyUtils.WaitForElementLoaded(driver, elem);
    }

    public void fillProject(String key1, String key2, String key3, String key4, String key5) {
        set_NAME_username(key1);
        set_NAME_password(key2);
        click_CSSSELECTOR_button();
        click_LINKTEXT_Manage();
        click_LINKTEXT_ManageProjects();
        click_CSSSELECTOR_form_titlebutton_small();
        set_NAME_name();
        set_NAME_name_1(key3, key4);
        click_CSSSELECTOR_row_2optionnth_child2();
        click_CSSSELECTOR_row_1optionnth_child1();
        set_NAME_description(key5);
    }

    public void addProject(String key1, String key2, String key3, String key4, String key5) {
        fillProject(key1, key2, key3, key4, key5);
        click_CSSSELECTOR_row_1();
        set_CSSSELECTOR_row_1tdnth_child5();
    }

    public String set_CSSSELECTOR_row_1tdnth_child5_1() {
        By elem = By.cssSelector(".row-1 > td:nth-child(5)");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public void click_LINKTEXT_Logout() {
        By elem = By.linkText("Logout");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void addExistingProject(String key1, String key2, String key3, String key4, String key5) {
        fillProject(key1, key2, key3, key4, key5);
        click_CSSSELECTOR_row_1();
    }

    public String set_CSSSELECTOR_trnth_child2center_1() {
        By elem = By.cssSelector("tr:nth-child(2) .center");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }


    public void set_CSSSELECTOR_row_1nth_child5tdnth_child1() {
        By elem = By.cssSelector(".row-1:nth-child(5) > td:nth-child(1)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Project001() {
        By elem = By.linkText("Project001");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void scrollIntoView(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));
    }

    public void click_CSSSELECTOR_divnth_child6form() {
        By addCategoryButton = By.name("categories");
        scrollIntoView(addCategoryButton);
        // By elem = By.cssSelector("div:nth-child(6) > form");
        // scrollIntoView(elem);
        // // MyUtils.WaitForElementLoaded(driver, elem);
        // driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_body() {
        By elem = By.cssSelector("body");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_CSSSELECTOR_trnth_child6forminputnth_child3(String key3) {
        By elem = By.cssSelector("form[action='manage_proj_cat_add.php']");
        driver.findElement(elem).click();
        WebElement form = driver.findElement(elem);
        WebElement webElement = form.findElement(By.name("name"));
        webElement.click();
        webElement.clear();
        webElement.sendKeys(key3);
    }

    public void click_CSSSELECTOR_trnth_child6formbutton() {
        By elem = By.cssSelector("form[action='manage_proj_cat_add.php']");
        driver.findElement(elem).click();
        WebElement form = driver.findElement(elem);
        WebElement webElement = form.findElement(By.className("button"));
        webElement.click();
    }

    public void addCategory(String key1, String key2, String key3) {
        set_NAME_username(key1);
        set_NAME_password(key2);
        click_CSSSELECTOR_button();
        click_LINKTEXT_Manage();
        click_LINKTEXT_ManageProjects();
        click_LINKTEXT_Project001();
        click_CSSSELECTOR_divnth_child6form();
        click_CSSSELECTOR_body();
        set_CSSSELECTOR_trnth_child6forminputnth_child3(key3);
        click_CSSSELECTOR_trnth_child6formbutton();
        // set_CSSSELECTOR_row_1nth_child5tdnth_child1();
    }

    public boolean set_CSSSELECTOR_row_1nth_child5tdnth_child1_1(String newCategory) {
        WebElement categoryTable = driver.findElement(By.name("categories"));

        List<WebElement> categoryRows = categoryTable.findElements(By.xpath("//tr[starts-with(@class, 'row-')]"));

        for (WebElement row : categoryRows) {
            WebElement categoryCell = row.findElement(By.xpath("td[1]"));
            if (categoryCell.getText().trim().equals(newCategory)) {
                return true;
            }
        }
        return false;
    }

    public void set_CSSSELECTOR_trnth_child7inputnth_child3(String key3) {
        By elem = By.cssSelector("tr:nth-child(7) input:nth-child(3)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key3);
    }

    public void click_CSSSELECTOR_trnth_child7button() {
        By elem = By.cssSelector("tr:nth-child(7) .button");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_CSSSELECTOR_trnth_child2center() {
        By elem = By.cssSelector("tr:nth-child(2) .center");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }


    public void addExistingCategory(String key1, String key2, String key3) {
        set_NAME_username(key1);
        set_NAME_password(key2);
        click_CSSSELECTOR_button();
        click_LINKTEXT_Manage();
        click_LINKTEXT_ManageProjects();
        click_LINKTEXT_Project001();
        set_CSSSELECTOR_trnth_child6forminputnth_child3(key3);
        click_CSSSELECTOR_trnth_child6formbutton();
        set_CSSSELECTOR_trnth_child2center();
    }
}

