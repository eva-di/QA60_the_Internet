package com.the_internet.test;


import com.the_internet.pages.DropDownPage;
import com.the_internet.pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectDropDown();
    }

    @Test
    public void selectOption2Test() {
       new DropDownPage(driver).selectOption2("Option 2").verifyText();

    }


}
