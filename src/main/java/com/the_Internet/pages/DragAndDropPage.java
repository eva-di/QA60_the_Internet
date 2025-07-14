package com.the_Internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "column-a")
    WebElement columnA;
    @FindBy(id = "column-b")
    WebElement columnB;

    public DragAndDropPage dragAToB() {
        new Actions(driver).dragAndDrop(columnA, columnB).perform();
        return this;
    }

    public DragAndDropPage verifyColumnAHasTextB() {
        new DragAndDropPage(driver).shouldHaveText(columnA, "B", 5);
        return this;
    }
}
