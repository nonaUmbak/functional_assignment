package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePagePO;

public class ProductFailPO extends BasePagePO {


    By failedAlert = By.className("alert-danger");
    By successAlert = By.className("alert-success");

    public ProductFailPO(WebDriver driver) {
        super(driver);
    }

    public boolean failAlertIsPresent(){
        return isIn(failedAlert);
    }

    public String getFailAlertText(){
        WebElement alertElement = driver.findElement(failedAlert);
        return alertElement.getText().replace("\n", " ").trim();
        // if (alertText.startsWith("×")) {
        //     alertText = alertText.substring(1).trim();
        // }
    }

}
