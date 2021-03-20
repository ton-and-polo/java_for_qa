package com.github.addressbook.test;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupCreationTest {
    private WebDriver wd;
    private WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        // Create new browser driver instance:
        wd = new ChromeDriver();
        wait = new WebDriverWait(wd, Duration.ofSeconds(30));
        login("admin", "secret");
    }

    private void login(String userName, String password) {
        wd.get("http://localhost:81/addressbook/index.php");
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(userName);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.id("LoginForm")).submit();
    }

    @Test
    public void testGroupCreation() throws Exception {
        goToGroupPage();
        createNewGroup();
        fillGroupForm(new GroupData("test_group", "test_logo", "test_footer"));
        submitGroupCreation();
        returnToGroupPage();
    }

    private void logout() {
        wd.findElement(By.linkText("Logout")).click();
    }

    private void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    private void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    private void fillGroupForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    private void createNewGroup() {
        wd.findElement(By.name("new")).click();
    }

    private void goToGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        logout();
        wd.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

}
