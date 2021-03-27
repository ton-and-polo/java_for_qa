package com.github.addressbook.tests;

import com.github.addressbook.model.GroupData;
import org.testng.annotations.*;

public class GroupCreationTest extends TestGeneral {

    @Test
    public void testGroupCreation() throws Exception {
        application.getNavigationHelper().goToGroupPage();
        application.getGroupHelper().createNewGroup();
        application.getGroupHelper().fillGroupForm(
                new GroupData(
                        "test_group",
                        null,
                        null
                )
        );
        application.getGroupHelper().submitGroupCreation();
        application.getNavigationHelper().goToGroupPage();
    }

}
