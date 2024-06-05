package com.POs.prestashop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePagePO;

public class ProductEditPO extends BasePagePO{

    By name = By.id("name_1");
    By submitButton = By.name("submitAddproduct");
    By tableProduct = By.id("table-product");

     public ProductEditPO(WebDriver driver) {
        super(driver);
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
}
