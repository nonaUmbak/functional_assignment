package com.POs.prestashop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocalizationDashboardPO extends BaseDashboard {


    By localization = By.id("maintab-AdminParentLocalization");
    By localizationMenu = By.id("subtab-AdminStates");

    public LocalizationDashboardPO(WebDriver driver) {
        super(driver);
    }

    public void selectLocalization(){
        selectMenu(localization, localizationMenu);
    }

}
