package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePO;

public class ContentUrlPO extends BasePO {

    By save = By.xpath("//button[text()='Save']");
    By friendlyUrl = By.id("jsslug");

    public ContentUrlPO(WebDriver driver) {
        super(driver);
    }



    public void changeUrl(String newUrl) {
        scrollIntoView(friendlyUrl);
        clear(friendlyUrl);
        type(friendlyUrl, newUrl);
        click(save);
    }


    public String getContentUrl(String titleStr) {
        String xpathForRowWithTitle = String.format("//td/a[contains(text(), '%s')]/../following-sibling::td[last()]", titleStr);
        WebElement urlElement = driver.findElement(By.xpath(xpathForRowWithTitle));
        return urlElement.getText();
    }

}
