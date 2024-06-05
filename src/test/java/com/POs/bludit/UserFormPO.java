package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POs.BasePagePO;

public class UserFormPO extends BasePagePO{

    By userAdd = By.linkText("Add a new user");
    By usernameInput = By.id("jsnew_username");
    By passwordInput = By.id("jsnew_password");
    By confirmPassInput = By.id("jsconfirm_password");
    By emailInput =  By.id("jsemail");
    By roleDropDown = By.id("jsrole");
    By save = By.xpath("//button[text()='Save']");

    public UserFormPO(WebDriver driver) {
        super(driver);
    }

    public void addUser(String username, String pass, String confirmPass, String email, String role){
        click(userAdd);
        type(usernameInput, username);
        type(passwordInput, pass);
        type(confirmPassInput, confirmPass);
        type(emailInput, email);
        selectDropdown(roleDropDown, role);
        click(save);
    }
}
