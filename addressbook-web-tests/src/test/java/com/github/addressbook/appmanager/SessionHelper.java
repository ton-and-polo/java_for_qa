package com.github.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper {
    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String userName, String password) {

        fillFormInput(By.name("user"), userName);
        fillFormInput(By.name("pass"), password);
        submitForm(By.id("LoginForm"));
    }

    public void logout() {
        clickFormInput(By.linkText("Logout"));
    }
}
