package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePagePO;

public class SocialPO extends BasePagePO {


    By faceBookInput = By.id("jsfacebook");
    By instaInput = By.id("jsinstagram");
    By save = By.xpath("//button[text()='Save']");

    public SocialPO(WebDriver driver) {
        super(driver);
    }

    public void addSocialTest(int userPosition, String fbLink, String igLink){
        String xpath = "//table[@class='uk-table uk-table-striped']//tbody/tr[" + userPosition + "]/td/a";
        WebElement usernameElement = driver.findElement(By.xpath(xpath));
        usernameElement.click();
        clear(faceBookInput);
        type(faceBookInput, fbLink);
        clear(instaInput);
        type(instaInput, igLink);
        click(save);
    }

    public String getInputValue(By element) {
        WebElement elem = driver.findElement(element);
        return elem.getAttribute("value");
    }

    public String getFbLink(){
        return getInputValue(faceBookInput);
    }

    public String getInstaLink(){
        return getInputValue(instaInput);
    }

}
