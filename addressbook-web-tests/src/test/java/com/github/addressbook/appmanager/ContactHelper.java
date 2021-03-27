package com.github.addressbook.appmanager;

import com.github.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends BaseHelper {
    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        // Refactor all this lines by: fillFormInput() method:
        fillFormInput(By.name("firstname"), contactData.getFirstName());
        fillFormInput(By.name("middlename"), contactData.getMiddleName());
        fillFormInput(By.name("lastname"), contactData.getLastName());
        fillFormInput(By.name("nickname"), contactData.getNickName());
        fillFormInput(By.name("title"), contactData.getTitle());
        fillFormInput(By.name("company"), contactData.getCompany());
        fillFormInput(By.name("address"), contactData.getAddress());
        fillFormInput(By.name("home"), contactData.getHomePhone());
        fillFormInput(By.name("mobile"), contactData.getMobilePhone());
        fillFormInput(By.name("work"), contactData.getWorkPhone());
        fillFormInput(By.name("fax"), contactData.getFax());
        fillFormInput(By.name("email"), contactData.getFirstEmail());
        fillFormInput(By.name("email2"), contactData.getSecondEmail());
        fillFormInput(By.name("email3"), contactData.getThirdEmail());
        fillFormInput(By.name("homepage"), contactData.getHomePage());



        // Note you have to create a new method for Base
        // bday:
        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getDay());
        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getMonth());
        wd.findElement(By.name("byear")).sendKeys(contactData.getYear());
        // aday:
        new Select(wd.findElement(By.name("aday"))).selectByVisibleText(contactData.getAnniversaryDay());
        new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(contactData.getAnniversaryMonth());
        wd.findElement(By.name("ayear")).sendKeys(contactData.getAnniversaryYear());

        fillFormInput(By.name("address2"), contactData.getSecondAddress());
        fillFormInput(By.name("phone2"), contactData.getSecondPhone());
        fillFormInput(By.name("notes"), contactData.getNotes());
    }

    public void submitContactCreationForm() {
        clickFormInput(By.name("submit"));
    }

    public void selectContact() {
        clickFormInput(By.name("selected[]"));
    }

    public void deleteSelectedContact() {
        clickFormInput(By.xpath("//input[@value='Delete']"));
        submitAlertPopUp();
    }

    public void goToContactModificationPage() {
        clickFormInput(By.xpath("//img[@alt='Edit']"));
    }

    public void submitContactModificationForm() {
        clickFormInput(By.name("update"));
    }
}
