package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePagePO;

public class ContentAdvancedPO extends BasePagePO {

    By advanced = By.xpath("//h2[@class='sidebar-button' and @data-view='sidebar-advanced-view']");

    public ContentAdvancedPO(WebDriver driver) {
        super(driver);
    }

    public void clickAdvanced() {
        click(advanced);
    }

    public void clickAdvanced(String title) {
        By content = By.linkText(title);
        click(content);
        clickAdvanced();
    }


}
