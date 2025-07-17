package com.the_internet.test;

import com.the_internet.pages.HomePage;
import com.the_internet.pages.frames.NestedFramesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFramesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectFrames();
        new NestedFramesPage(driver).selectNestedFrames();
    }

    @Test
    public void nestedFramesTest() {
        new NestedFramesPage(driver).returnListOfFrames();
        new NestedFramesPage(driver).verifyFrameContent("BOTTOM");
    }
}
