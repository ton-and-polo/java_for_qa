package com.github.addressbook.tests;

import com.github.addressbook.model.GroupData;
import org.testng.annotations.*;

public class GroupCreationTest extends TestGeneral {

    @Test
    public void testGroupCreation() throws Exception {
        application.getNavigationHelper().goToGroupPage();
        application.getGroupHelper().createNewGroup(
            new GroupData(
                    "test_group",
                    "test_header",
                    null
            )
        );
        application.getNavigationHelper().goToGroupPage();
    }

}
