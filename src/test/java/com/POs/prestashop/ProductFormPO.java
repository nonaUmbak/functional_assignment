package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductCreatePO  extends BasePagePO{

    By addProduct = By.id("page-header-desc-product-new_product");
    By name = By.id("name_1");
    By submitButton = By.name("submitAddproduct");
    By successAlert = By.className("alert-success");

    public ProductCreatePO(WebDriver driver) {
        super(driver);
        driver.get("http://localhost:8080//administrator");
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

    public boolean isProductCreationSuccessful() {
        return isIn(successAlert);
    }
}
