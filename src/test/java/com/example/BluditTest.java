package com.example;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

import com.POs.bludit.ContentAdvancedPO;
import com.POs.bludit.ContentFormPO;
import com.POs.bludit.ContentParentPO;
import com.POs.bludit.ContentStickyPO;
import com.POs.bludit.ContentSuccessPO;
import com.POs.bludit.ContentUrlPO;
import com.POs.bludit.Dashboard;
import com.POs.bludit.DraftContentPO;
import com.POs.bludit.LoginPO;
import com.POs.bludit.LogoutPO;
import com.POs.bludit.PostPO;
import com.POs.bludit.UserPO;

public class BluditTest extends DriverLifeCyclingSetting {
    private WebDriver driver;


    public void login(String username, String password){
        LoginPO login = new LoginPO(driver);
        login.loginTest( username, password);
    }

    public void loginAdmin(){
        login("admin", "password");
    }

    public void logout(){
        LogoutPO logOutPage = new LogoutPO(driver);
        logOutPage.logout();
        // logOutPage.isLogoutSuccessful();
    }

    @org.junit.jupiter.api.Test
    public void addContent(){
        loginAdmin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickNewContent();

        String title = "Test Content";
        ContentFormPO contentPO = new ContentFormPO(driver);
        contentPO.saveContent(title);

        ContentSuccessPO successPO = new ContentSuccessPO(driver);
        String titleByInd = successPO.getTitleOfContentSection(1);
        assertEquals(title, titleByInd);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void changeUrl() {
        loginAdmin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickContent();

        String title = "Test Content", url = "new-post-url";
        
        ContentAdvancedPO advancedPO = new ContentAdvancedPO(driver);
        advancedPO.clickAdvanced(title);

        ContentUrlPO contentPO = new ContentUrlPO(driver);
        contentPO.changeUrl(url);

        dashboard.clickContent();
        ContentUrlPO contentUrlPO = new ContentUrlPO(driver);
        String contentUrl = contentUrlPO.getContentUrl(title);
        assertEquals( "/" + url, contentUrl);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void changeParent() {
        loginAdmin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickContent();

        String title = "Test Content", option = "Create your own content";
        ContentAdvancedPO advancedPO = new ContentAdvancedPO(driver);
        advancedPO.clickAdvanced(title);

        ContentParentPO contentParentPO = new ContentParentPO(driver);
        contentParentPO.changeParent(option);

        dashboard.clickContent();
        advancedPO.clickAdvanced(title);

        String actualOption = contentParentPO.getSelectedParent();
        assertEquals(option, actualOption);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void addContentDraft(){
        loginAdmin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickNewContent();

        String title = "Draft Content";
        ContentFormPO contentPO = new ContentFormPO(driver);
        contentPO.saveDraft(title);
        
        DraftContentPO draftContentPO = new DraftContentPO(driver);
        String draftTitle = draftContentPO.getDraftContentTitle(1);
        assertEquals(title, draftTitle);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void addContentSticky(){
        loginAdmin();

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickContent();

        String title = "Set up your new site", status = "Sticky";

        ContentAdvancedPO advancedPO = new ContentAdvancedPO(driver);
        advancedPO.clickAdvanced();

        ContentStickyPO stickyPO = new ContentStickyPO(driver);
        stickyPO.setStickyPost(title, status);
        dashboard.clickContent();
        assertTrue(stickyPO.isExistStickyContentByTitle(title));

        logout();

    }

    @org.junit.jupiter.api.Test
    public void deletePost(){
        loginAdmin();
        String title = "Follow Bludit";

        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickContent();

        PostPO contentPO = new PostPO(driver);
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
