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
        try {
            click(addProduct);
            Thread.sleep(2000);
            type(name, productName);
            Thread.sleep(2000);
            scrollIntoView(submitButton);
            click(submitButton);
        } catch (Exception e) {
            System.out.println("Error in add new Product");
        }
    }


}
