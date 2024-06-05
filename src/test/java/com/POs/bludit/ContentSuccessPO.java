package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContentSuccessPO extends SectionCheckerPO {

    String publishSection = "//td[contains(text(), 'Published')]";
    By publishedContent = By.xpath(publishSection);

    public ContentSuccessPO(WebDriver driver) {
        super(driver);
    }

    public String getTitleOfContentSection(int index) {
        return getTitleByIndex(publishedContent, publishSection, index);
    }


}
