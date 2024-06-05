package com.POs.bludit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.POs.BasePagePO;

public class UserCheckerPO extends BasePagePO{

    public UserCheckerPO(WebDriver driver) {
        super(driver);
    }

    public boolean checkUsernameDisplayed(String username) {
        String xpath = "//table[@class='uk-table uk-table-striped']//td/a[contains(text(), '" + username + "')]";
        WebElement usernameElement = driver.findElement(By.xpath(xpath));
        return usernameElement.isDisplayed();
    }

    public void checkUsernameLocatedInPosition(String username, int  position) {
        String xpath = "//table[@class='uk-table uk-table-striped']//tbody/tr["+ position+ "]/td/a[contains(text(), '" + username + "')]";
        WebElement usernameElement = driver.findElement(By.xpath(xpath));
        assert usernameElement.getText().equals(username) : "Username '" + username + "' not found as the second user";
    }

}
