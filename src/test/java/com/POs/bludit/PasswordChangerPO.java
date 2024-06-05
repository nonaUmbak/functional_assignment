package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePagePO;

public class PasswordChangerPO extends BasePagePO{


    By changePass = By.linkText("Change password");
    By passwordInput = By.id("jsnew_password");
    By confirmPassInput = By.id("jsconfirm_password");
    By save = By.xpath("//button[text()='Save']");

    public PasswordChangerPO(WebDriver driver) {
        super(driver);
    }


    public void changePassword(int position, String newPass, String confirmPass) {
        String xpath = "//table[@class='uk-table uk-table-striped']//tbody/tr[" +position+ "]/td/a";
        WebElement usernameElement = driver.findElement(By.xpath(xpath));
        usernameElement.click();
        click(changePass);
        type(passwordInput, newPass);
        type(confirmPassInput, confirmPass);
        click(save);
    }


}
