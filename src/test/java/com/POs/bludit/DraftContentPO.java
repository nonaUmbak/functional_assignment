package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DraftContentPO extends SectionCheckerPO {


    String draftSection = "//td[contains(text(), 'Draft')]";
    By draftContent = By.xpath(draftSection);

    public DraftContentPO(WebDriver driver) {
        super(driver);
    }


    public String getDraftContentTitle(int index) {
        return getTitleByIndex(draftContent, draftSection, index);
    }
}
