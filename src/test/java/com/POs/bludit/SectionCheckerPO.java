package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePagePO;

public class SectionCheckerPO extends BasePagePO {

    public SectionCheckerPO(WebDriver driver) {
        super(driver);
    }

    public String getTitleByIndex(By contentSection, String sectionStr, int index){
        visibilityOfElementLocated(contentSection,5d);
        WebElement firstRowElement = visibilityOfElementLocated(By.xpath(sectionStr+"/ancestor::tr/following-sibling::tr["+ index +"]"), 5d);

        WebElement content = firstRowElement.findElement(By.xpath(".//a"));
        return content.getText().trim();
    }
}
