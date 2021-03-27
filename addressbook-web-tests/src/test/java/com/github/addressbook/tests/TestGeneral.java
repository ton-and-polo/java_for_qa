package com.github.addressbook.tests;

import com.github.addressbook.appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestGeneral {

    // Here you can specify your browser:
    protected final ApplicationManager application = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        application.start();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        application.stop();
    }


}
