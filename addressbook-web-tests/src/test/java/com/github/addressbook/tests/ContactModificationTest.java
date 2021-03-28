package com.github.addressbook.tests;

import com.github.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestGeneral {
    @Test
    public void testContactModification() {
        application.getNavigationHelper().goToHomePage();
        if (! application.getContactHelper().contactIsPresent()) {
            application.getNavigationHelper().goToContactPage();
            application.getContactHelper().createNewContact(
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
                            "test_notes"
                    )
            );
            application.getNavigationHelper().goToHomePage();
        }
        application.getContactHelper().selectContact();
        application.getContactHelper().goToContactModificationPage();
        application.getContactHelper().fillContactForm(
                new ContactData(
                        "modify_name",
                        "modify_middle_name",
                        "modify_last_name",
                        "modify_nickname",
                        "modify_tiltel",
                        "modify_company",
                        "modify_address",
                        "123456789",
                        "123456789",
                        "modify_work",
                        "123456789",
                        "modify@email.com",
                        "modify2@email.com",
                        "modify3@email.com",
                        "modify_homepage",
                        "1",
                        "January",
                        "1960",
                        "1",
                        "May",
                        "1980",
                        "modify_secondary_address",
                        "123456789",
                        "modify_notes"
                )
        );
        application.getContactHelper().submitContactModificationForm();
        application.getNavigationHelper().goToHomePage();
    }
}
