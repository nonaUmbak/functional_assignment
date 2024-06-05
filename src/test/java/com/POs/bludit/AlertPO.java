package com.POs.bludit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.POs.BasePagePO;

public class AlertPO extends BasePagePO {

    public AlertPO(WebDriver driver) {
        super(driver);
    }

    public String getAlertText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By alert = By.id("alert");
        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(alert));
        String text = notification.getText();
        wait.until(ExpectedConditions.invisibilityOf(notification));
        return text;
    }
}
