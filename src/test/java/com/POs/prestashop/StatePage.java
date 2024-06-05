package com.POs.prestashop;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePagePO;

public class StatePage extends BasePagePO {

    By addState = By.id("page-header-desc-state-new_state");
    By nameInput = By.id("name");
    By iso = By.id("iso_code");
    By countryDropDown = By.id("id_country");
    By zoneDropDown = By.id("id_zone");
    By submit = By.id("state_form_submit_btn");
    By successAlert = By.className("alert-success");
    By failedAlert = By.className("alert-danger");
    By footer = By.className("fanel-footer");

    public StatePage(WebDriver driver) {
        super(driver);
    }

    public void addState(String name, String isoCode, String country, String zone){
        try {

            click(addState);

            type(nameInput, name);

            Thread.sleep(2000);
            type(iso, isoCode);
            
            selectDropdown(countryDropDown, country);
            selectDropdown(zoneDropDown, zone);
            click(submit);

        } catch (Exception e) {
            System.out.println("Error in add new State");
        }
    }

    public void emptySave(){
        click(addState);

        scrollIntoView(submit);
        click(submit);
    }

    public boolean isProductCreationSuccessful() {
        return isIn(successAlert);
    }


    public boolean isFailed() {
        try {
            if (isIn(failedAlert)) {
                Thread.sleep(2000);
                WebElement alertElement = driver.findElement(failedAlert);
                String actualAlertText = alertElement.getText().replace("\n", " ").trim();
                if (actualAlertText.startsWith("×")) {
                    actualAlertText = actualAlertText.substring(1).trim();
                }
                String expectedAlertText = "2 errors The iso_code field is required. The name field is required.";
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
