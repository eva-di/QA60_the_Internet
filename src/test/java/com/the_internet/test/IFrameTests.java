package com.the_internet.test;

import com.the_internet.pages.HomePage;
import com.the_internet.pages.frames.IFramesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectFrames();
        new IFramesPage(driver).selectIFrames();
    }

    @Test
    public void iFramesTests() {
        new IFramesPage(driver).closeNotification().verifyContentByText("Your content goes here.");
    }
}
