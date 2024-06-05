package com.example;

import static org.junit.Assert.*;

import com.POs.prestashop.CatalogDashboardPO;
import com.POs.prestashop.LocalizationDashboardPO;
import com.POs.prestashop.LogOutPage;
import com.POs.prestashop.LoginPage;
import com.POs.prestashop.ProductAttributes;
import com.POs.prestashop.ProductEditPO;
import com.POs.prestashop.ProductFailPO;
import com.POs.prestashop.ProductFeature;
import com.POs.prestashop.ProductFormPO;
import com.POs.prestashop.ProductPricePO;
import com.POs.prestashop.ProductSuccessPO;
import com.POs.prestashop.StatePage;

public class Prestashop extends DriverLifeCyclingSetting{

    public void login(String username, String password){
        LoginPage login = new LoginPage(driver);
        login.login( username, password);
    }

    public void loginAdmin(){
        login("admin@prestashop.com", "password");
    }

    public void logout(){
        LogOutPage logOutPage = new LogOutPage(driver);
        logOutPage.logout();
        // logOutPage.isLogoutSuccessful();
    }


    @org.junit.jupiter.api.Test
    public void addProduct()
    {
        loginAdmin();

        CatalogDashboardPO menuPage = new CatalogDashboardPO(driver);
        menuPage.selectCatalogProduct();

        ProductFormPO productPage = new ProductFormPO(driver);
        productPage.addNewProduct("Blue Jacket3");

        ProductSuccessPO successPO = new ProductSuccessPO(driver);
        assertTrue(successPO.isProductCreationSuccessful());

        logout();
    }

    @org.junit.jupiter.api.Test
    public void addProductFail(){
        loginAdmin();

        CatalogDashboardPO menuPage = new CatalogDashboardPO(driver);
        menuPage.selectCatalogProduct();


        ProductFormPO productPage = new ProductFormPO(driver);
        productPage.addNewProduct("");

        ProductFailPO creationFailPO = new ProductFailPO(driver);
        assertTrue(creationFailPO.failAlertIsPresent());

        String alertText = creationFailPO.getFailAlertText();

        String expectedAlertText = "2 errors This link_rewrite field is required at least in English (English) This name field is required at least in English (English)";
        
        assertEquals(expectedAlertText, alertText);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void editProduct(){
        loginAdmin();

        CatalogDashboardPO menuPage = new CatalogDashboardPO(driver);
        menuPage.selectCatalogProduct();


        ProductEditPO productPage = new ProductEditPO(driver);
        productPage.editProduct("Blue Jacket3", "Deep Blue Jacket");

        ProductSuccessPO successPO = new ProductSuccessPO(driver);
        assertTrue(successPO.isProductCreationSuccessful());

        logout();
    }

    @org.junit.jupiter.api.Test
    public void addState() {
        loginAdmin();

        LocalizationDashboardPO menuPage = new LocalizationDashboardPO(driver);
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

        LocalizationDashboardPO menuPage = new LocalizationDashboardPO(driver);
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

        CatalogDashboardPO menuPage = new CatalogDashboardPO(driver);
        menuPage.selectCatalogProduct();

        ProductPricePO productPage = new ProductPricePO(driver);
        productPage.addPrice(10.0);
        String actual = productPage.getFinalPrice();
        String expectedValue = "12.20";
        assertEquals(expectedValue, actual);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void verifyPriceWithTax() {
        loginAdmin();
        
        CatalogDashboardPO menuPage = new CatalogDashboardPO(driver);
        menuPage.selectCatalogProduct();

        ProductPricePO productPage = new ProductPricePO(driver);
        productPage.addPriceWithTax(10.0, "IT Reduced Rate (10%)");

        String actual = productPage.getFinalPrice();
        String expectedValue = "11.00";
        assertEquals(expectedValue, actual);


        logout();

    }

    @org.junit.jupiter.api.Test
    public void addProductFeature() {
        loginAdmin();
        
        CatalogDashboardPO menuPage = new CatalogDashboardPO(driver);
        menuPage.selectFeauture();

        ProductFeature productPage = new ProductFeature(driver);
        productPage.addFeature("Strong");

        ProductSuccessPO successPO = new ProductSuccessPO(driver);
        assertTrue(successPO.isProductCreationSuccessful());

        logout();

    }

    @org.junit.jupiter.api.Test
    public void addEmptyProductFeature() {
        loginAdmin();
        
        CatalogDashboardPO menuPage = new CatalogDashboardPO(driver);
        menuPage.selectFeauture();

        ProductFeature productPage = new ProductFeature(driver);
        productPage.addEmptyFeature();

        ProductFailPO failPO = new ProductFailPO(driver);
        assertTrue(failPO.failAlertIsPresent());
        String alertText = failPO.getFailAlertText();

        String expectedAlertText = "The field name is required at least in English (English).";
        assertEquals(expectedAlertText, alertText);

        logout();

    }

    @org.junit.jupiter.api.Test
    public void addProductAttribute() {
        loginAdmin();
        
        CatalogDashboardPO menuPage = new CatalogDashboardPO(driver);
        menuPage.selectAttributes();

        ProductAttributes productPage = new ProductAttributes(driver);
        productPage.addAttribute("Quantity", "Qnt");
        
        ProductSuccessPO successPO = new ProductSuccessPO(driver);
        assertTrue(successPO.isProductCreationSuccessful());

        String expectedAlertText = "The field name is required at least in English (English).";

        logout();

    }

    @org.junit.jupiter.api.Test
    public void addProductAttributeFail() {
        loginAdmin();
        
        CatalogDashboardPO menuPage = new CatalogDashboardPO(driver);
        menuPage.selectAttributes();

        ProductAttributes productPage = new ProductAttributes(driver);
        productPage.addAttribute("", "Qnt");
        
        ProductFailPO failPO = new ProductFailPO(driver);
        assertTrue(failPO.failAlertIsPresent());

        String alertString = failPO.getFailAlertText();
        String expectedAlertText = "The field name is required at least in English (English).";

        assertEquals(expectedAlertText,alertString);
        logout();

    }
}
