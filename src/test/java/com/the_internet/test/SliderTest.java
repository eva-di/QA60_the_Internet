package com.the_internet.test;

import com.the_internet.pages.HomePage;
import com.the_internet.pages.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectSlider();
    }

    @Test
    public void moveSliderTest() {
        new HorizontalSliderPage(driver).changeSliderValue();
    }
    @Test
    public void moveSliderTest2() {
        new HorizontalSliderPage(driver).changeSliderValue2().verifySliderValue("5");
    }

}
