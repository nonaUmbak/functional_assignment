package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePagePO;

public class ProductPricePO extends BasePagePO {


    By addProduct = By.id("page-header-desc-product-new_product");
    By linkPrice = By.id("link-Prices");
    By priceTE = By.id("priceTE");
    By finalPrice = By.id("finalPrice");
    By taxRule = By.id("id_tax_rules_group");

    public ProductPricePO(WebDriver driver) {
        super(driver);
    }

    public void fillPrice(Double price){
        click(addProduct);
        click(linkPrice);
        clear(priceTE);
        type(priceTE, price.toString());
    }

    public String getFinalPrice(){
        WebElement element = driver.findElement(finalPrice);
        return element.getText().trim();
    }
    public void addPrice(Double price) {
        fillPrice(price);
    }

    public void addPriceWithTax(Double price, String option) {
        fillPrice(price);
        selectDropdown(taxRule, option);
    }

}
