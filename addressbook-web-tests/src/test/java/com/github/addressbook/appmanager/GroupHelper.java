package com.github.addressbook.appmanager;

import com.github.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupHelper extends BaseHelper {

    public GroupHelper(ChromeDriver wd) {
        super(wd);
    }

    public void createNewGroup() {
        clickFormInput(By.name("new"));
    }

    public void fillGroupForm(GroupData groupData) {
        fillFormInput(By.name("group_name"), groupData.getName());
        fillFormInput(By.name("group_header") ,groupData.getHeader());
        fillFormInput(By.name("group_footer") ,groupData.getFooter());
    }

    public void submitGroupCreation() {
        clickFormInput(By.name("submit"));
    }

    public void selectGroup() {
        clickFormInput(By.name("selected[]"));
    }

    public void deleteSelectedGroup() {
        clickFormInput(By.name("delete"));
    }

}
