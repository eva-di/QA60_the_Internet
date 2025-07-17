package com.the_internet.test;

import com.the_internet.pages.HomePage;
import com.the_internet.pages.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectHovers();
    }

    @Test
    public void hoversTest() {
        new HoversPage(driver).hoverToSecondAvatar()
                .verifyUser2("name: user2");
    }
}
