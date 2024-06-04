package com.POs.claroline;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClarolineCoursePO {

    WebDriver driver;

    JavascriptExecutor js;

    Map<String, Object> vars;

    public ClarolineCoursePO(WebDriver driver, JavascriptExecutor js, Map<String, Object> vars) {
        this.driver = driver;
        this.js = js;
        this.vars = vars;
    }

    public void set_ID_login(String key1) {
        By elem = By.id("login");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void set_ID_password(String key2) {
        By elem = By.id("password");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key2);
    }

    public void click_CSSSELECTOR_buttonnth_child11() {
        By elem = By.cssSelector("button:nth-child(11)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Platformadministration() {
        By elem = By.linkText("Platform administration");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Createcourse() {
        By elem = By.linkText("Create course");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_course_title(String key3) {
        By elem = By.id("course_title");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key3);
    }

    public void set_ID_course_officialCode() {
        By elem = By.id("course_officialCode");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_course_officialCode_1(String key4, String key5) {
        By elem = By.id("course_officialCode");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key4);
        {
            elem = By.id("mslist2");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key5 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_ID_mslist2() {
        By elem = By.id("mslist2");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_msremoveimg(String key6) {
        By elem = By.cssSelector(".msremove > img");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            elem = By.id("mslist2");
            MyUtils.WaitForElementLoaded(driver, elem);
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key6 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_msremoveimg_1() {
        By elem = By.cssSelector(".msremove > img");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_ID_access_public() {
        By elem = By.id("access_public");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_ID_registration_true() {
        By elem = By.id("registration_true");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_NAME_changeProperties() {
        By elem = By.name("changeProperties");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_claroDialogMsg() {
        By elem = By.cssSelector(".claroDialogMsg");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_CSSSELECTOR_strong() {
        By elem = By.cssSelector("strong");
        MyUtils.WaitForElementLoaded(driver, elem);
    }

    public void createCourse(String key1, String key2, String key3, String key4, String key5, String key6) {
        set_ID_login(key1);
        set_ID_password(key2);
        click_CSSSELECTOR_buttonnth_child11();
        click_LINKTEXT_Platformadministration();
        click_LINKTEXT_Createcourse();
        set_ID_course_title(key3);
        set_ID_course_officialCode();
        set_ID_course_officialCode_1(key4, key5);
        click_ID_mslist2();
        click_CSSSELECTOR_msremoveimg(key6);
        click_CSSSELECTOR_msremoveimg_1();
        click_ID_access_public();
        click_ID_registration_true();
        click_NAME_changeProperties();
        click_CSSSELECTOR_claroDialogMsg();
        set_CSSSELECTOR_strong();
    }

    public String set_CSSSELECTOR_strong_1() {
        By elem = By.cssSelector("strong");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public void click_LINKTEXT_Logout() {
        By elem = By.linkText("Logout");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_search_course(String key3) {
        By elem = By.id("search_course");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key3);
    }

    public void click_CSSSELECTOR_adminCourseinputnth_child2() {
        By elem = By.cssSelector(".adminCourse input:nth-child(2)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_tbodynth_child2tdnth_child2() {
        By elem = By.cssSelector("tbody:nth-child(2) td:nth-child(2)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_CSSSELECTOR_ab() {
        By elem = By.cssSelector("a > b");
        MyUtils.WaitForElementLoaded(driver, elem);
    }

    public void searchCourse(String key1, String key2, String key3) {
        set_ID_login(key1);
        set_ID_password(key2);
        click_CSSSELECTOR_buttonnth_child11();
        click_LINKTEXT_Platformadministration();
        set_ID_search_course(key3);
        click_CSSSELECTOR_adminCourseinputnth_child2();
        click_CSSSELECTOR_tbodynth_child2tdnth_child2();
        set_CSSSELECTOR_ab();
    }

    public String set_CSSSELECTOR_ab_1() {
        By elem = By.cssSelector("a > b");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public String set_ID_L0() {
        By elem = By.id("L0");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public void click_LINKTEXT_001_Course001() {
        By elem = By.linkText("001 - Course001");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_ID_CLCAL() {
        By elem = By.id("CLCAL");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Addanevent() {
        By elem = By.linkText("Add an event");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_title(String key3) {
        By elem = By.id("title");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key3);
    }

    public void click_ID_fday(String key4) {
        By elem = By.id("fday");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key4 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_fdayoptionnth_child31() {
        By elem = By.cssSelector("#fday > option:nth-child(31)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_ID_fmonth(String key5) {
        By elem = By.id("fmonth");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key5 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_fmonthoptionnth_child5() {
        By elem = By.cssSelector("#fmonth > option:nth-child(5)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_ID_fyear(String key6) {
        By elem = By.id("fyear");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        {
            WebElement dropdown = driver.findElement(elem);
            elem = By.xpath("//option[. = '" + key6 + "']");
            MyUtils.WaitForElementLoaded(driver, elem);
            dropdown.findElement(elem).click();
        }
    }

    public void click_CSSSELECTOR_fyearoptionnth_child2() {
        By elem = By.cssSelector("#fyear > option:nth-child(2)");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_location(String key7) {
        By elem = By.id("location");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key7);
    }

    public void click_NAME_submitEvent() {
        By elem = By.name("submitEvent");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void addEvent(String key1, String key2, String key3, String key4, String key5, String key6, String key7) {
        set_ID_login(key1);
        set_ID_password(key2);
        click_CSSSELECTOR_buttonnth_child11();
        click_LINKTEXT_001_Course001();
        click_ID_CLCAL();
        click_LINKTEXT_Addanevent();
        set_ID_title(key3);
        click_ID_fday(key4);
        click_CSSSELECTOR_fdayoptionnth_child31();
        click_ID_fmonth(key5);
        click_CSSSELECTOR_fmonthoptionnth_child5();
        click_ID_fyear(key6);
        click_CSSSELECTOR_fyearoptionnth_child2();
        set_ID_location(key7);
        click_NAME_submitEvent();
        click_CSSSELECTOR_claroDialogMsg();
    }

    public String set_CSSSELECTOR_claroDialogMsg() {
        By elem = By.cssSelector(".claroDialogMsg");
        MyUtils.WaitForElementLoaded(driver, elem);
        return driver.findElement(elem).getText();
    }

    public void set_ID_login_1(String key1) {
        By elem = By.id("login");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key1);
    }

    public void click_LINKTEXT_Enrolonanewcourse() {
        By elem = By.linkText("Enrol on a new course");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_ID_coursesearchbox_keyword(String key3) {
        By elem = By.id("coursesearchbox_keyword");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key3);
    }

    public void click_CSSSELECTOR_button() {
        By elem = By.cssSelector("button");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_enrolment() {
        By elem = By.cssSelector(".enrolment");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void enrolCourse(String key1, String key2, String key3) {
        set_ID_login_1(key1);
        set_ID_password(key2);
        click_CSSSELECTOR_buttonnth_child11();
        click_LINKTEXT_Enrolonanewcourse();
        set_ID_coursesearchbox_keyword(key3);
        click_CSSSELECTOR_button();
        click_CSSSELECTOR_enrolment();
        click_CSSSELECTOR_claroDialogMsg();
    }

    public void click_ID_CLQWZ() {
        By elem = By.id("CLQWZ");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Newexercise() {
        By elem = By.linkText("New exercise");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_divinput() {
        By elem = By.cssSelector("div > input");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_CSSSELECTOR_invisiblenth_child3tdnth_child2img() {
        By elem = By.cssSelector(".invisible:nth-child(3) > td:nth-child(2) img");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Newquestion() {
        By elem = By.linkText("New question");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_ID_MCUA() {
        By elem = By.id("MCUA");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void addExercise(String key1, String key2, String key3) {
        set_ID_login_1(key1);
        set_ID_password(key2);
        click_CSSSELECTOR_buttonnth_child11();
        click_LINKTEXT_001_Course001();
        click_ID_CLQWZ();
        click_LINKTEXT_Newexercise();
        set_ID_title(key3);
        click_CSSSELECTOR_divinput();
        click_CSSSELECTOR_claroDialogMsg();
    }

    public void click_ID_correct_1() {
        By elem = By.id("correct_1");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void set_NAME_grade_1(String key4) {
        By elem = By.name("grade_1");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key4);
    }

    public void set_NAME_grade_2(String key5) {
        By elem = By.name("grade_2");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
        driver.findElement(elem).clear();
        driver.findElement(elem).sendKeys(key5);
    }

    public void click_NAME_cmdOk() {
        By elem = By.name("cmdOk");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void click_LINKTEXT_Exercise001() {
        By elem = By.linkText("Exercise 001");
        MyUtils.WaitForElementLoaded(driver, elem);
        driver.findElement(elem).click();
    }

    public void makeVisible(String key1, String key2) {
        set_ID_login(key1);
        set_ID_password(key2);
        click_CSSSELECTOR_buttonnth_child11();
        click_LINKTEXT_001_Course001();
        click_ID_CLQWZ();
        click_LINKTEXT_Logout();
    }

    public void addQuestions(String key1, String key2) {
        set_ID_login(key1);
        set_ID_password(key2);
        click_CSSSELECTOR_buttonnth_child11();
        click_LINKTEXT_001_Course001();
        click_ID_CLQWZ();
        click_CSSSELECTOR_invisiblenth_child3tdnth_child2img();
    }

    public void addQuestion(String key3, String key4, String key5) {
        click_LINKTEXT_Newquestion();
        set_ID_title(key3);
        click_ID_MCUA();
        click_CSSSELECTOR_divinput();
        click_ID_correct_1();
        set_NAME_grade_1(key4);
        set_NAME_grade_2(key5);
        click_NAME_cmdOk();
    }
}
