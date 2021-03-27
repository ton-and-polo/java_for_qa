package com.github.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    // Helpers:
    private GroupHelper groupHelper;
    private NavigationHelper navigationHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;

    // Variables:
    public WebDriver wd;
    public String browserType;

    // Class constructor:
    public ApplicationManager(String browserType) {
        this.browserType = browserType;
    }

    public void start() {
        // Define browser to run test:
        if (browserType.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browserType.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        }
        // Set timeout in case of delays in DOM:
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Helper initialization:
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        // Login to application:
        wd.get("http://localhost:81/addressbook/index.php");
        sessionHelper.login("admin", "secret");
    }

    public void stop() {
        sessionHelper.logout();
        wd.quit();
    }


    // Getters:
    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }


}
