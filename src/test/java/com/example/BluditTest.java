package com.example;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.POs.bludit.ContentPO;
import com.POs.bludit.Dashboard;
import com.POs.bludit.LoginPO;
import com.POs.bludit.LogoutPO;
import com.POs.bludit.UserPO;

public class BluditTest {
    private WebDriver driver;

    @BeforeAll
    public static void beforeAll(){
        System.setProperty("webdriver.chrome.driver", "/Users/nomundarierdenebileg/Downloads/chromedriver-mac-arm64/chromedriver");
    }

    @BeforeEach
    public void beforeEach(){
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://localhost:8080/admin");
    }


    public void login(String username, String password){
        LoginPO login = new LoginPO(driver);
        login.loginTest( username, password);
    }

    public void loginAdmin(){
        login("admin", "password");
    }


    // @AfterEach
    public void logout(){
        LogoutPO logOutPage = new LogoutPO(driver);
        logOutPage.logout();
        // logOutPage.isLogoutSuccessful();
    }

    @AfterEach
    public void afterEach(){

        if (driver != null) {
            driver.quit();
        }
    }

    @org.junit.jupiter.api.Test
    public void addContent(){
        loginAdmin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickNewContent();

        String title = "Test Content";
        ContentPO contentPO = new ContentPO(driver);
        contentPO.saveContent(title);

        contentPO.verifyContentTitle(title);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void changeUrl() {
        loginAdmin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickContent();

        String title = "Test Content", url = "new-post-url";
        ContentPO contentPO = new ContentPO(driver);
        contentPO.changeUrl(title, url);

        dashboard.clickContent();
        contentPO.verifyContentUrl(title, "/" + url);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void changeParent() {
        loginAdmin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickContent();

        String title = "Test Content", option = "Create your own content";
        ContentPO contentPO = new ContentPO(driver);
        contentPO.changeParent(title, option);

        dashboard.clickContent();

        contentPO.clickAdvanced(title);
        contentPO.verifyParent(option);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void addContentDraft(){
        loginAdmin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickNewContent();

        String title = "Draft Content";
        ContentPO contentPO = new ContentPO(driver);
        contentPO.saveDraft(title);
        contentPO.verifyDraftContentTitle(title);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void addContentSticky(){
        loginAdmin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickContent();

        String title = "Set up your new site", status = "Sticky";

        ContentPO contentPO = new ContentPO(driver);
        contentPO.setStickyPost(title, status);
        dashboard.clickContent();
        contentPO.verifyStickyContentTitle(title);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void deletePost(){
        loginAdmin();
        String title = "Follow Bludit";

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickContent();

        ContentPO contentPO = new ContentPO(driver);
        contentPO.deletePost(title);
        contentPO.checkNotExist(title);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void userAdd(){
        loginAdmin();
        String username = "test1";
        String pass = "password", confirmPass = pass;
        String email = "test@gmail.com";

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickUsers();

        UserPO userPO = new UserPO(driver);
        userPO.addUser(username, pass, confirmPass, email, "Administrator");

        userPO.checkUsernameLocatedInPosition(username, 3);

        logout();
        
    }

    @org.junit.jupiter.api.Test
    public void changePassword(){
        loginAdmin();
        String pass = "password", confirmPass = pass;

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickUsers();

        UserPO userPO = new UserPO(driver);
        userPO.changePassword(2, pass, confirmPass);
        String alertText = userPO.waitForChangesSavedNotification();
        String expectedString = "The changes have been saved";


        assertEquals(expectedString, alertText);
        logout();
    }

    @org.junit.jupiter.api.Test
    public void addSocial(){
        loginAdmin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickUsers();

        UserPO userPO = new UserPO(driver);
        String fbLink = "https://www.facebook.com/some_fake_user_name_52432562135863";
        String igLink = "https://instagram.com/some_fake_user_name_52432562135863";
        userPO.addSocialTest(1, fbLink, igLink);
        userPO.checkSocials(fbLink, igLink);

        logout();

    }







}
