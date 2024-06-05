package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePagePO;

public class ProductSuccessPO extends BasePagePO {

    By successAlert = By.className("alert-success");

    public ProductSuccessPO(WebDriver driver) {
        super(driver);
    }

    public boolean isProductCreationSuccessful() {
        return isIn(successAlert);
    }

}
