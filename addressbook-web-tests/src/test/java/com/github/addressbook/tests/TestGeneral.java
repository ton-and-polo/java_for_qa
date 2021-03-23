package com.github.addressbook.tests;

import com.github.addressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestGeneral {

    protected final ApplicationManager application = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        application.start();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        application.stop();
    }


}
