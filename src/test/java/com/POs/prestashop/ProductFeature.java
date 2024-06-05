package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePagePO;

import io.opentelemetry.api.internal.StringUtils;

public class ProductFeature extends BasePagePO{

    By addProduct = By.id("page-header-desc-feature-new_feature");
    By name = By.id("name_1");
    By submitButton = By.id("feature_form_submit_btn");

    public ProductFeature(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String productName) {
        click(addProduct);
        if (!StringUtils.isNullOrEmpty(productName))
            type(name, productName);
        scrollIntoView(submitButton);
        click(submitButton);
    }

    public void addFeature(String productName) {
        fillForm(productName);
    }

    public void addEmptyFeature() {
        fillForm(null);
    }

}
