package com.POs.prestashop;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductAttributes extends BasePagePO {

    By addProduct = By.id("page-header-desc-attribute_group-new_attribute_group");
    By name = By.id("name_1");
    By publicName = By.id("public_name_1");
    By submitButton = By.id("attribute_group_form_submit_btn");
    By successAlert = By.className("alert-success");
    By failedAlert = By.className("alert-danger");

    public ProductAttributes(WebDriver driver) {
        super(driver);
    }

    public void addAttribute(String nameStr, String publicNameStr) {
        try {
            click(addProduct);
            type(name, nameStr);
            type(publicName, publicNameStr);
            scrollIntoView(submitButton);
            click(submitButton);
        } catch (Exception e) {
            System.out.println("Error in add new product feature");
        }
    }

    public boolean isProductCreationSuccessful() {
        return isIn(successAlert);
    }

    public boolean isProductCreationFailed() {
        try {
            if (isIn(failedAlert)) {
                Thread.sleep(2000);
                WebElement alertElement = driver.findElement(failedAlert);
                String actualAlertText = alertElement.getText().replace("\n", " ").trim();
                if (actualAlertText.startsWith("×")) {
                    actualAlertText = actualAlertText.substring(1).trim();
                }
                String expectedAlertText = "The field name is required at least in English (English).";
                try {
                    assertEquals(expectedAlertText, actualAlertText);
                    return true;
                } catch (AssertionError e) {
                    System.out.println("Alert text does not match: " + e.getMessage());
                    return false;
                }
            }
            return false;
        } catch (Exception e){
            System.out.println("Error in add new Product");
            return false;
        }
    }

}
