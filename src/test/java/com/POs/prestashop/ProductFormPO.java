package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePagePO;

public class ProductFormPO  extends BasePagePO{

    By addProduct = By.id("page-header-desc-product-new_product");
    By name = By.id("name_1");
    By submitButton = By.name("submitAddproduct");

    public ProductFormPO(WebDriver driver) {
        super(driver);
    }

    public void addNewProduct(String productName) {
        click(addProduct);
        type(name, productName);
        scrollIntoView(submitButton);
        click(submitButton);
    }


}
