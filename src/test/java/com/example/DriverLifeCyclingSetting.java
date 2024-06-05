package com.example;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverLifeCyclingSetting {
    protected WebDriver driver;

    @BeforeAll
    public static void beforeAll(){
        // System.setProperty("webdriver.chrome.driver", "/Users/nomundarierdenebileg/Downloads/chromedriver-mac-arm64/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/Users/nomundarierdenebileg/Downloads/geckodriver");
    }

    @BeforeEach
    public void beforeEach(){
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    @AfterEach
    public void afterEach(){

        if (driver != null) {
            driver.quit();
        }
    }
}
