package com.github.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseHelper {
    protected WebDriver wd;

    public BaseHelper(WebDriver wd) {
        this.wd = wd;
    }

    // Form methods:
    protected void clickFormInput(By locator) {
        wd.findElement(locator).click();
    }

    protected void fillFormInput(By locator, String inputData) {
        if (inputData != null) {
            String formValue = wd.findElement(locator).getAttribute("value");
            if (! formValue.equals(inputData)) {
                wd.findElement(locator).click();
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(inputData);
            }
        }
    }

    protected void submitForm(By locator) {
        wd.findElement(locator).submit();
    }

    protected void submitAlertPopUp() {
        wd.switchTo().alert().accept();
    }


    // Additional methods:
    public boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
