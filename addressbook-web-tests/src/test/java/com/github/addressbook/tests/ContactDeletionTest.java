package com.github.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestGeneral {
    @Test
    public void testContactDeletion() throws Exception {
        application.getNavigationHelper().goToHomePage();
        application.getContactHelper().selectContact();
        application.getContactHelper().deleteSelectedContact();
        application.getNavigationHelper().goToHomePage();
    }

}
