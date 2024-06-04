package com.POs.prestashop;

import static org.junit.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPagePO extends BasePagePO {

    By addProduct = By.id("page-header-desc-product-new_product");
    By name = By.id("name_1");
    By submitButton = By.name("submitAddproduct");
    By successAlert = By.className("alert-success");
    By failedAlert = By.className("alert-danger");
    By tableProduct = By.id("table-product");
    By linkPrice = By.id("link-Prices");
    By priceTE = By.id("priceTE");
    By finalPrice = By.id("finalPrice");
    By taxRule = By.id("id_tax_rules_group");



    public ProductPagePO(WebDriver driver) {
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

    public void editProduct(String currentName, String productName) {
        try {
            scrollIntoView(tableProduct);
            WebElement productTable = driver.findElement(tableProduct);
            List<WebElement> rows = productTable.findElements(By.tagName("tr"));
            for (WebElement row : rows) {
                List<WebElement> cells = row.findElements(By.tagName("td"));
                for (WebElement cell : cells) {
                    if (cell.getText().equals(currentName)) {
                        WebElement editButton = row.findElement(By.className("edit"));
                        editButton.click();
                        clear(name);
                        type(name, productName);
                        scrollIntoView(submitButton);
                        click(submitButton);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error in edit the product");
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
                String expectedAlertText = "2 errors This link_rewrite field is required at least in English (English) This name field is required at least in English (English)";
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

    public void addPrice(Double price) {
        try {
            click(addProduct);
            click(linkPrice);
            clear(priceTE);
            type(priceTE, price.toString());
            WebElement element = driver.findElement(finalPrice);
            String actual = element.getText().trim();
            String expectedValue = "12.20";
            assertEquals(expectedValue, actual);
        } catch (Exception e) {
            System.out.println("Error in add the price");
        }
    }

    public void addPriceWithTax(Double price, String option) {
        try {
            click(addProduct);
            click(linkPrice);
            clear(priceTE);
            type(priceTE, price.toString());
            selectDropdown(taxRule, option);
            WebElement element = driver.findElement(finalPrice);
            String actual = element.getText().trim();
            String expectedValue = "11.00";
            assertEquals(expectedValue, actual);
        } catch (Exception e) {
            System.out.println("Error in add the price");
        }
    }

}
