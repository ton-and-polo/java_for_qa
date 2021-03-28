package com.github.addressbook.appmanager;

import com.github.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends BaseHelper {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }


    // Creation:
    public void startGroupCreation() {
        clickFormInput(By.name("new"));
    }

    public void createNewGroup(GroupData group) {
        startGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
    }

    public void fillGroupForm(GroupData groupData) {
        fillFormInput(By.name("group_name"), groupData.getName());
        fillFormInput(By.name("group_header"), groupData.getHeader());
        fillFormInput(By.name("group_footer"), groupData.getFooter());
    }

    public void submitGroupCreation() {
        clickFormInput(By.name("submit"));
    }

    // Modification:
    public void startEditingGroup() {
        clickFormInput(By.name("edit"));
    }

    public void submitGroupModification() {
        clickFormInput(By.name("update"));
    }

    // Deletion:
    public void selectGroup() {
        clickFormInput(By.name("selected[]"));
    }

    public void deleteSelectedGroup() {
        clickFormInput(By.name("delete"));
    }


    public boolean groupIsPresent() {
        return isElementPresent(By.name("selected[]"));
    }
}
