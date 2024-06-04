package com.POs.bludit;

import static org.junit.Assert.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePO;

public class ContentPO extends BasePO{

    By title = By.name("title");
    By save = By.xpath("//button[text()='Save']");
    By delete = By.id("jsdelete");
    By saveDraft = By.xpath("//button[text()='Save as draft']");

    String publishSection = "//td[contains(text(), 'Published')]";

    String draftSection = "//td[contains(text(), 'Draft')]";

    String stickySection = "//td[contains(text(), 'sticky')";

    By publishedContent = By.xpath(publishSection);
    By draftContent = By.xpath(draftSection);
    By stickyContent = By.xpath(stickySection);

    

    public ContentPO(WebDriver driver) {
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

    public void clickAdvanced() {
        By advanced = By.xpath("//h2[@class='sidebar-button' and @data-view='sidebar-advanced-view']");
        click(advanced);
    }

    public void clickAdvanced(String title) {
        By content = By.linkText(title);
        click(content);
        clickAdvanced();
    }


    public void verifyContentSection(String titleStr, By contentSection, String sectionStr){
        try {

            visibilityOfElementLocated(contentSection,5d);
            WebElement firstRowElement = visibilityOfElementLocated(By.xpath(sectionStr+"/ancestor::tr/following-sibling::tr[1]"), 5d);

            WebElement content = firstRowElement.findElement(By.xpath(".//a"));
            String contentText = content.getText().trim();

            assertEquals(titleStr, contentText);
        } catch (Exception e) {
            System.out.println("Exception occurred in verify content: " + e.getMessage());
            throw e;
        }
    }

    public void verifyContentTitle(String titleStr) {
        verifyContentSection(titleStr, publishedContent, publishSection);
    }

    public void verifyContentUrl(String titleStr, String contentUrl) {
        try {
            String xpathForRowWithTitle = String.format("//td/a[contains(text(), '%s')]/../following-sibling::td[last()]", titleStr);
            WebElement urlElement = driver.findElement(By.xpath(xpathForRowWithTitle));
            String url = urlElement.getText();
            assertEquals(contentUrl, url);
        } catch (Exception e) {
            System.out.println("Exception occurred in verify content: " + e.getMessage());
            throw e;
        }
    }


    public void verifyParent(String expectedValue){
        By parentDropDown = By.id("jsparent");
        WebElement selectedOption = getSelectedValueFromDropDown(parentDropDown);
        String actualOption = selectedOption.getText();
        assertEquals(expectedValue, actualOption);
    }


    public void verifyDraftContentTitle(String titleStr) {
        verifyContentSection(titleStr, draftContent, draftSection);
    }

    public void verifyStickyContentTitle(String titleStr) {
        visibilityOfElementLocated(By.xpath("//tbody"), 5d);
        WebElement stickyHeader = driver.findElement(By.xpath(stickySection + " and @style[contains(., 'text-transform: uppercase;')]]"));
        WebElement stickyRow = stickyHeader.findElement(By.xpath("./ancestor::tr/following-sibling::tr[td[1]//a[contains(text(), '" + titleStr + "')]]"));
        assertNotNull(stickyRow);
    }


    public void changeUrl(String title, String newUrl) {
        try {
            clickAdvanced(title);
            By friendlyUrl = By.id("jsslug");
            scrollIntoView(friendlyUrl);
            clear(friendlyUrl);
            type(friendlyUrl, newUrl);
            click(save);
        } catch (Exception e){
            System.out.println("Exception occurred in change content url: " + e.getMessage());
            throw e;
        }
    }

    public void changeParent(String title, String parentOption) {
        try {
            clickAdvanced(title);
            By parentDropDown = By.id("jsparent");
            selectDropdown(parentDropDown, parentOption);
            click(save);

        } catch (Exception e) {
            System.out.println("Exception occurred in change content url: " + e.getMessage());
            throw e;
        }
    }


    public void setStickyPost(String title, String status) {
        By item = By.linkText(title);
        click(item);

        clickAdvanced();
        By stickyOption = By.id("jsstatus");
        selectDropdown(stickyOption, status);
        click(save);
    }

    public void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void checkNotExist(String title) {
        By item = By.xpath("//a[contains(text(), '" + title + "')]");
        try {
            WebElement element = driver.findElement(item);
            fail("Element with title '" + title + "' still exists");
        } catch (NoSuchElementException e) {
            System.out.println("Element with title '" + title + "' does not exist (deleted)");
        }
    }

    public void deletePost(String title) {
        By item = By.linkText(title);
        click(item);
        click(delete);
        acceptAlert();

    }


}
