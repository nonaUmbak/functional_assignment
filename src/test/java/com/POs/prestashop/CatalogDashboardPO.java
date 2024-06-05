package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogDashboardPO extends BaseDashboard {
    By catalog = By.id("maintab-AdminCatalog");
    By productMenu = By.id("subtab-AdminProducts");
    By productFeature = By.id("subtab-AdminFeatures");
    By productAttribute = By.id("subtab-AdminAttributesGroups");

    public CatalogDashboardPO(WebDriver driver) {
        super(driver);
    }

    public void selectCatalogProduct(){
        selectMenu(catalog, productMenu);
    }

    public void selectFeauture(){
        selectMenu(catalog,productFeature);
    }

    public void selectAttributes(){
        selectMenu(catalog, productAttribute);
    }
}

