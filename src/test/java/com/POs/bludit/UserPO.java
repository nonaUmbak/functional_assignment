package com.POs.bludit;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.POs.BasePO;

public class UserPO extends BasePO {


   
    By changePass = By.linkText("Change password");
    By faceBookInput = By.id("jsfacebook");
    By instaInput = By.id("jsinstagram");

    public UserPO(WebDriver driver) {
        super(driver);
    }

 

    public void checkUsernameDisplayed(String username) {
        String xpath = "//table[@class='uk-table uk-table-striped']//td/a[contains(text(), '" + username + "')]";
        WebElement usernameElement = driver.findElement(By.xpath(xpath));
        assert usernameElement.isDisplayed() : "Username '" + username + "' not found";
    }

    public void checkUsernameLocatedInPosition(String username, int  position) {
        String xpath = "//table[@class='uk-table uk-table-striped']//tbody/tr["+ position+ "]/td/a[contains(text(), '" + username + "')]";
        WebElement usernameElement = driver.findElement(By.xpath(xpath));
        assert usernameElement.getText().equals(username) : "Username '" + username + "' not found as the second user";
    }


    public String getAlertText(){
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public String waitForChangesSavedNotification() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    try {
        By alert = By.id("alert");
        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(alert));
        String text = notification.getText();
        wait.until(ExpectedConditions.invisibilityOf(notification));
        return text;
    } catch (TimeoutException e) {
        throw e;
    } catch (Exception e){
        throw e;
    }
}

    public void changePassword(int position, String newPass, String confirmPass) {
        String xpath = "//table[@class='uk-table uk-table-striped']//tbody/tr[" +position+ "]/td/a";
        WebElement usernameElement = driver.findElement(By.xpath(xpath));
        usernameElement.click();
        click(changePass);
        type(passwordInput, newPass);
        type(confirmPassInput, confirmPass);
        click(save);
    }

    public void addSocialTest(int position, String fbLink, String igLink){
        String xpath = "//table[@class='uk-table uk-table-striped']//tbody/tr[" +position+ "]/td/a";
        WebElement usernameElement = driver.findElement(By.xpath(xpath));
        usernameElement.click();
        clear(faceBookInput);
        type(faceBookInput, fbLink);
        clear(instaInput);
        type(instaInput, igLink);
        click(save);
    }

    public void checkSocials(String fbLink, String igLink){
        WebElement fb = driver.findElement(faceBookInput);
        assertEquals(fbLink, fb.getAttribute("value"));
        WebElement ig = driver.findElement(instaInput);
        assertEquals(igLink, ig.getAttribute("value"));
    }

}
