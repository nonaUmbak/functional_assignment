package com.POs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePagePO {
    protected WebDriver driver;

    public BasePagePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void visit(String url){
        driver.get(url);
    }

    public WebElement find(By element){
        return driver.findElement(element);
    }

    public void click(By element){
        find(element).click();
    }

    public void type(By element, String text){
        find(element).sendKeys(text);
    }

    public void clear(By element){
        driver.findElement(element).clear();
    }

    public void select(By element){
        find(element).click();
    }
    
    public boolean isIn(By element) {
        return find(element).isDisplayed();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public void selectDropdown(By element, String option) {
        WebElement dropDown = driver.findElement(element);
        Select options = new Select(dropDown);
        options.selectByVisibleText(option);
    }

    public void scrollIntoView(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));
    }


    public WebElement visibilityOfElementLocated(By element, Double seconds) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(seconds.longValue()));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public WebElement getSelectedValueFromDropDown(By element){
        WebElement dropdown = driver.findElement(element);
        Select select = new Select(dropdown);
        return select.getFirstSelectedOption();

    }

}
