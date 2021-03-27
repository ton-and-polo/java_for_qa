package com.github.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper  extends BaseHelper {
    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    // Navigation:
    public void goToContactPage() {
        clickFormInput(By.linkText("add new"));
    }

    public void goToGroupPage() {
        clickFormInput(By.xpath("//a[@href='group.php']"));
    }

    public void goToHomePage() {
        clickFormInput(By.linkText("home"));
    }
}
