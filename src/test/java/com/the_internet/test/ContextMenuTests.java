package com.the_internet.test;

import com.the_Internet.pages.ContextMenuPage;
import com.the_Internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContextMenuTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectContextMenu();
    }


    @Test
    public void contxtMenuTest() {
        new ContextMenuPage(driver).rightClickOntheBox().verifyAlertOsPresent();
    }
}
