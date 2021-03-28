package com.github.addressbook.tests;

import com.github.addressbook.model.GroupData;
import org.testng.annotations.*;

public class GroupDeletionTest extends TestGeneral {

    @Test
    public void testGroupDeletion() throws Exception {
        application.getNavigationHelper().goToGroupPage();
        // Create new group if there isn't any:
        if (! application.getGroupHelper().groupIsPresent()) {
            application.getGroupHelper().createNewGroup(
                    new GroupData("test_group", "test_header", null
                    ));
        }
        application.getGroupHelper().selectGroup();
        application.getGroupHelper().deleteSelectedGroup();
        application.getNavigationHelper().goToGroupPage();
    }

}
