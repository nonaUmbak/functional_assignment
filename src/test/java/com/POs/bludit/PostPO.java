package com.POs.bludit;

import static org.junit.Assert.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePO;

public class PostPO extends BasePO{

    
    By delete = By.id("jsdelete");

    

    public PostPO(WebDriver driver) {
        super(driver);
    }

    public void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }


    public void deletePost(String title) {
        By item = By.linkText(title);
        click(item);
        click(delete);
        acceptAlert();
    }

    public void checkNotExist(String title) {
        By item = By.xpath("//a[contains(text(), '" + title + "')]");
        WebElement element = driver.findElement(item);
        fail("Object with title '" + title + "' still exists");
    }


}
