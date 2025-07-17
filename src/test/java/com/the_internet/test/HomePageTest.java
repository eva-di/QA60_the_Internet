package com.the_internet.test;

import com.the_internet.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {


    @Test
    public void testPageTitle() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getTitleText(), "Available Examples");
    }

}
