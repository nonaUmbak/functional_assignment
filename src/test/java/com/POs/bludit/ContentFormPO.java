package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePagePO;

public class ContentFormPO extends BasePagePO {

    By title = By.name("title");
    By save = By.xpath("//button[text()='Save']");
    By saveDraft = By.xpath("//button[text()='Save as draft']");

    public ContentFormPO(WebDriver driver) {
        super(driver);
    }

    public void saveContent(String titleStr) {
        type(title, titleStr);
        click(save);
    }

    public void saveDraft(String titleStr) {
        type(title, titleStr);
        click(saveDraft);
    }
}
