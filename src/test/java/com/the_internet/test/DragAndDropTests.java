package com.the_internet.test;

import com.the_internet.pages.DragAndDropPage;
import com.the_internet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectDragAndDrop();
    }

    @Test
    public void dragAndDropTest() {
        new DragAndDropPage(driver).dragAToB().verifyColumnAHasTextB();
    }
}
