package com.github.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTest extends TestGeneral {

    @Test
    public void testGroupDeletion() throws Exception {
        application.getNavigationHelper().goToGroupPage();
        application.getGroupHelper().selectGroup();
        application.getGroupHelper().deleteSelectedGroup();
        application.getNavigationHelper().goToGroupPage();
    }

}
