package com.POs.bludit;

import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePagePO;

public class ContentStickyPO extends BasePagePO{

    By save = By.xpath("//button[text()='Save']");
    By stickyOption = By.id("jsstatus");

    String stickySection = "//td[contains(text(), 'sticky')";

    By stickyContent = By.xpath(stickySection);

    public ContentStickyPO(WebDriver driver) {
        super(driver);
    }

    public void setStickyPost( String status) {
        selectDropdown(stickyOption, status);
        click(save);
    }


    public boolean isExistStickyContentByTitle(String titleStr) {
        visibilityOfElementLocated(By.xpath("//tbody"), 5d);
        WebElement stickyHeader = driver.findElement(By.xpath(stickySection + " and @style[contains(., 'text-transform: uppercase;')]]"));
        WebElement stickyRow = stickyHeader.findElement(By.xpath("./ancestor::tr/following-sibling::tr[td[1]//a[contains(text(), '" + titleStr + "')]]"));
        return Objects.nonNull(stickyRow);
    }



}
