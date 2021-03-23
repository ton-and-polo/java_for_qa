package com.github.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper  extends BaseHelper {
    private ChromeDriver wd;

    public NavigationHelper(ChromeDriver wd) {
        super(wd);
    }

    // Navigation:
    public void goToContactPage() {
        clickFormInput(By.linkText("add new"));
    }

    public void goToGroupPage() {
        clickFormInput(By.linkText("groups"));
    }

    public void goToHomePage() {
        clickFormInput(By.linkText("home"));
    }
}
