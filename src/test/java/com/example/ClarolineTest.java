package com.example;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
// Generated by Selenium IDE
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.POs.claroline.ClarolineCoursePO;
import com.POs.claroline.ClarolineLoginPO;
import com.POs.claroline.ClarolineUserPO;

public class ClarolineTest {

    @BeforeClass()
    public static void setup() {
        System.setProperty("webdriver.gecko.driver", "/Users/nomundarierdenebileg/Downloads/geckodriver");
    }

    private WebDriver driver;

    private Map<String, Object> vars;

    private JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void login() {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.manage().window().setSize(new Dimension(1470, 866));
        ClarolineLoginPO _LoginPO = new ClarolineLoginPO(driver, js, vars);
        _LoginPO.login("admin", "admin");
    }

    @Test
    public void addUser() {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.manage().window().setSize(new Dimension(1470, 866));
        ClarolineUserPO _UserPO = new ClarolineUserPO(driver, js, vars);
        _UserPO.addUser("admin", "admin", "Name0011", "firstname0011", "user0011", "password001", "password001");
        assertThat(_UserPO.set_CSSSELECTOR_msgSuccess_1(), is("The new user has been sucessfully created"));
        _UserPO.click_LINKTEXT_Logout();
    }


    @Test
    public void loginUser() {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.manage().window().setSize(new Dimension(1470, 866));
        ClarolineLoginPO _ClarolineLoginPO = new ClarolineLoginPO(driver, js, vars);
        _ClarolineLoginPO.userLogin("user001", "password001");
        assertThat(_ClarolineLoginPO.set_CSSSELECTOR_blockHeaderuserName_1(), is("firstname001 Name001"));
        _ClarolineLoginPO.click_LINKTEXT_Logout();
    }

    @Test
    public void searchUser() {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.manage().window().setSize(new Dimension(1470, 866));
        ClarolineUserPO _ClarolineUserPO = new ClarolineUserPO(driver, js, vars);
        _ClarolineUserPO.searchUser("admin", "admin", "user001");
        assertThat(_ClarolineUserPO.set_ID_L0_1(), is("Name001"));
        assertThat(_ClarolineUserPO.set_CSSSELECTOR_tdnth_child3(), is("firstname001"));
        assertThat(_ClarolineUserPO.set_CSSSELECTOR_tdnth_child6(), is("User"));
        _ClarolineUserPO.click_LINKTEXT_Logout();
    }

    @Test
    public void addCourse() {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.manage().window().setSize(new Dimension(1470, 866));
        ClarolineCoursePO _ClarolineCoursePO = new ClarolineCoursePO(driver, js, vars);
        _ClarolineCoursePO.createCourse("admin", "admin", "Course001", "001", "Sciences", "Economics");
        assertThat(_ClarolineCoursePO.set_CSSSELECTOR_strong_1(), is("001"));
        _ClarolineCoursePO.click_LINKTEXT_Logout();
    }

    @Test
    public void searchCourse() {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.manage().window().setSize(new Dimension(1470, 866));
        ClarolineCoursePO _ClarolineCoursePO = new ClarolineCoursePO(driver, js, vars);
        _ClarolineCoursePO.searchCourse("admin", "admin", "Course001");
        assertThat(_ClarolineCoursePO.set_CSSSELECTOR_ab_1(), is("Course001"));
        assertThat(_ClarolineCoursePO.set_ID_L0(), is("001"));
        _ClarolineCoursePO.click_LINKTEXT_Logout();
    }

    @Test
    public void addCourseEvent() {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.manage().window().setSize(new Dimension(1470, 866));
        ClarolineCoursePO _ClarolineCoursePO = new ClarolineCoursePO(driver, js, vars);
        _ClarolineCoursePO.addEvent("admin", "admin", "Exam 001", "31", "May", "2023", "Genoa");
        assertThat(_ClarolineCoursePO.set_CSSSELECTOR_claroDialogMsg(), is("Event added to the agenda."));
        _ClarolineCoursePO.click_LINKTEXT_Logout();
    }

    @Test
    public void enrolCourse() {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.manage().window().setSize(new Dimension(1470, 866));
        ClarolineCoursePO _ClarolineCoursePO = new ClarolineCoursePO(driver, js, vars);
        _ClarolineCoursePO.enrolCourse("user001", "password001", "Course001");
        assertThat(_ClarolineCoursePO.set_CSSSELECTOR_claroDialogMsg(), is("You've been enrolled on the course"));
        _ClarolineCoursePO.click_LINKTEXT_Logout();
    }

    @Test
    public void addCourseExercise() {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.manage().window().setSize(new Dimension(1470, 866));
        ClarolineCoursePO _ClarolineCoursePO = new ClarolineCoursePO(driver, js, vars);
        _ClarolineCoursePO.addExercise("admin", "admin", "Exercise 001");
        assertThat(_ClarolineCoursePO.set_CSSSELECTOR_claroDialogMsg(), is("Exercise added"));
        _ClarolineCoursePO.click_LINKTEXT_Logout();
    }

    @Test
    public void makeVisible() {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.manage().window().setSize(new Dimension(1470, 866));
        ClarolineCoursePO _ClarolineCoursePO = new ClarolineCoursePO(driver, js, vars);
        _ClarolineCoursePO.makeVisible("admin", "admin");
    }

    @Test
    public void addQuestions() {
        driver.get("http://localhost:3000/claroline11110/index.php");
        driver.manage().window().setSize(new Dimension(1470, 866));
        ClarolineCoursePO _ClarolineCoursePO = new ClarolineCoursePO(driver, js, vars);
        _ClarolineCoursePO.addQuestions("admin", "admin");
        _ClarolineCoursePO.addQuestion("Question 1", "3", "-3");
        _ClarolineCoursePO.addQuestion("Question 2", "3", "-3");
        _ClarolineCoursePO.addQuestion("Question 3", "3", "-3");
        _ClarolineCoursePO.click_LINKTEXT_Exercise001();
        _ClarolineCoursePO.click_LINKTEXT_Logout();
    }
}
