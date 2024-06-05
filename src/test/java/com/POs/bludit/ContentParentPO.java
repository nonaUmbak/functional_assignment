package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePagePO;

public class ContentParentPO extends BasePagePO {

    By save = By.xpath("//button[text()='Save']");
    By parentDropDown = By.id("jsparent");

    public ContentParentPO(WebDriver driver) {
        super(driver);
    }

    public void changeParent(String parentOption) {
        try {
            selectDropdown(parentDropDown, parentOption);
            click(save);

        } catch (Exception e) {
            System.out.println("Exception occurred in change content url: " + e.getMessage());
            throw e;
        }
    }


    public String getSelectedParent(){
        WebElement selectedOption = getSelectedValueFromDropDown(parentDropDown);
        return selectedOption.getText();
    }

}
