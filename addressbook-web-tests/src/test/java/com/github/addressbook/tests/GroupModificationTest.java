package com.github.addressbook.tests;

import com.github.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestGeneral {
    @Test
    public void testGroupModification() throws Exception {
        application.getNavigationHelper().goToGroupPage();
        application.getGroupHelper().selectGroup();
        application.getGroupHelper().startEditingGroup();
        application.getGroupHelper().fillGroupForm(
                new GroupData(
                        "edit_group",
                        "edit_logo",
                        "edit_footer"
                )
        );
        application.getGroupHelper().submitGroupModification();
        application.getNavigationHelper().goToGroupPage();
    }
}
