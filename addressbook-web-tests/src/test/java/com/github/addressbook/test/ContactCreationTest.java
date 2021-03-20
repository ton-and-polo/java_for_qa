package com.github.addressbook.test;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactCreationTest {
    private WebDriver wd;
    private WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
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
    public void testContactCreation() throws Exception {
        goToContactPage();
        fillContactForm(
                new ContactData(
                        "test_name",
                        "test_middle_name",
                        "test_last_name",
                        "test_nickname",
                        "test_tiltel",
                        "test_company",
                        "test_address",
                        "123456789",
                        "123456789",
                        "test_work",
                        "123456789",
                        "test@email.com",
                        "test2@email.com",
                        "test3@email.com",
                        "test_homepage",
                        "1",
                        "January",
                        "1960",
                        "1",
                        "May",
                        "1980",
                        "test_secondary_address",
                        "123456789",
                        "test_notes")
        );
        submitContactCreationForm();
        returnToHomePage();
    }

    private void logout() {
        wd.findElement(By.linkText("Logout")).click();
    }

    private void returnToHomePage() {
        wd.findElement(By.linkText("home")).click();
    }

    private void submitContactCreationForm() {
        wd.findElement(By.name("submit")).click();
    }

    private void fillContactForm(ContactData contactData) {
        wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
        wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddleName());
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
        wd.findElement(By.name("nickname")).sendKeys(contactData.getNickName());
        wd.findElement(By.name("title")).sendKeys(contactData.getTitle());
        wd.findElement(By.name("company")).sendKeys(contactData.getCompany());
        wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
        wd.findElement(By.name("home")).sendKeys(contactData.getHomePhone());
        wd.findElement(By.name("mobile")).sendKeys(contactData.getMobilePhone());
        wd.findElement(By.name("work")).sendKeys(contactData.getWorkPhone());
        wd.findElement(By.name("fax")).sendKeys(contactData.getFax());
        wd.findElement(By.name("email")).sendKeys(contactData.getFirstEmail());
        wd.findElement(By.name("email2")).sendKeys(contactData.getSecondEmail());
        wd.findElement(By.name("email3")).sendKeys(contactData.getThirdEmail());
        wd.findElement(By.name("homepage")).sendKeys(contactData.getHomePage());
        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getDay());
        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getMonth());
        wd.findElement(By.name("byear")).sendKeys(contactData.getYear());
        new Select(wd.findElement(By.name("aday"))).selectByVisibleText(contactData.getAnniversaryDay());
        new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(contactData.getAnniversaryMonth());
        wd.findElement(By.name("ayear")).sendKeys(contactData.getAnniversaryYear());
        wd.findElement(By.name("address2")).sendKeys(contactData.getSecondAddress());
        wd.findElement(By.name("phone2")).sendKeys(contactData.getSecondPhone());
        wd.findElement(By.name("notes")).sendKeys(contactData.getNotes());
    }

    private void goToContactPage() {
        wd.findElement(By.linkText("add new")).click();
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
