package com.example;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.POs.prestashop.LogOutPage;
import com.POs.prestashop.LoginPage;
import com.POs.prestashop.MenuPage;
import com.POs.prestashop.ProductAttributes;
import com.POs.prestashop.ProductFeature;
import com.POs.prestashop.ProductPagePO;
import com.POs.prestashop.StatePage;

public class Prestashop {

    private WebDriver driver;

    @BeforeAll
    public static void beforeAll(){
        System.setProperty("webdriver.chrome.driver", "/Users/nomundarierdenebileg/Downloads/chromedriver-mac-arm64/chromedriver");
    }

    @BeforeEach
    public void beforeEach(){
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://localhost:8080//administrator");
    }


    public void login(String username, String password){
        LoginPage login = new LoginPage(driver);
        login.loginTest( username, password);
    }

    public void loginAdmin(){
        login("admin@prestashop.com", "password");
    }


    // @AfterEach
    public void logout(){
        LogOutPage logOutPage = new LogOutPage(driver);
        logOutPage.logout();
        logOutPage.isLogoutSuccessful();
    }

    @AfterEach
    public void afterEach(){

        if (driver != null) {
            driver.quit();
        }
    }


    @org.junit.jupiter.api.Test
    public void testLoginOk()
    {
        loginAdmin();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectCatalogProduct();
        ProductPagePO productPage = new ProductPagePO(driver);
        productPage.addNewProduct("Blue Jacket3");
        Boolean result = productPage.isProductCreationSuccessful();
        assertTrue(result);

        logout();
    }

    @org.junit.jupiter.api.Test
    public void addProductFail(){
        loginAdmin();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectCatalogProduct();


        ProductPagePO productPage = new ProductPagePO(driver);
        productPage.addNewProduct("");
        Boolean result = productPage.isProductCreationFailed();
        assertTrue(result);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void editProduct(){
        loginAdmin();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectCatalogProduct();


        ProductPagePO productPage = new ProductPagePO(driver);
        productPage.editProduct("Blue Jacket3", "Deep Blue Jacket");
        Boolean result = productPage.isProductCreationSuccessful();
        assertTrue(result);

        logout();
    }

    @org.junit.jupiter.api.Test
    public void addState() {
        loginAdmin();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectLocalization();

        StatePage statePage = new StatePage(driver);
        statePage.addState("Liguria", "1121", "Italy", "Europe");
        Boolean result = statePage.isProductCreationSuccessful();
        assertTrue(result);

        logout();
    }


    @org.junit.jupiter.api.Test
    public void emptySave() {
        loginAdmin();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectLocalization();

        StatePage statePage = new StatePage(driver);
        statePage.emptySave();

        Boolean result = statePage.isFailed();
        assertTrue(result);
        
        logout();
    }

    @org.junit.jupiter.api.Test
    public void verifyPrice() {
        loginAdmin();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectCatalogProduct();

        ProductPagePO productPage = new ProductPagePO(driver);
        productPage.addPrice(10.0);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void verifyPriceWithTax() {
        loginAdmin();
        
        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectCatalogProduct();

        ProductPagePO productPage = new ProductPagePO(driver);
        productPage.addPriceWithTax(10.0, "IT Reduced Rate (10%)");

        logout();

    }

    @org.junit.jupiter.api.Test
    public void addProductFeature() {
        loginAdmin();
        
        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectFeauture();

        ProductFeature productPage = new ProductFeature(driver);
        productPage.addFeature("Strong");
        Boolean result = productPage.isProductCreationSuccessful();
        assertTrue(result);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void addEmptyProductFeature() {
        loginAdmin();
        
        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectFeauture();

        ProductFeature productPage = new ProductFeature(driver);
        productPage.addEmptyFeature();
        Boolean result = productPage.isProductCreationFailed();
        assertTrue(result);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void addProductAttribute() {
        loginAdmin();
        
        MenuPage menuPage = new MenuPage(driver);
        menuPage.selectAttributes();

        ProductAttributes productPage = new ProductAttributes(driver);
        productPage.addAttribute("Quantity", "Qnt");
        Boolean result = productPage.isProductCreationSuccessful();
        assertTrue(result);

        logout();

    }
}
