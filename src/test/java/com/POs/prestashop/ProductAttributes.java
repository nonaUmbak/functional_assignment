package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePagePO;

public class ProductAttributes extends BasePagePO {

    By addProduct = By.id("page-header-desc-attribute_group-new_attribute_group");
    By name = By.id("name_1");
    By publicName = By.id("public_name_1");
    By submitButton = By.id("attribute_group_form_submit_btn");

    public ProductAttributes(WebDriver driver) {
        super(driver);
    }

    public void addAttribute(String nameStr, String publicNameStr) {
            click(addProduct);
            type(name, nameStr);
            type(publicName, publicNameStr);
            scrollIntoView(submitButton);
            click(submitButton);
    }

}
