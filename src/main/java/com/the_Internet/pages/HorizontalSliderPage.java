package com.the_Internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class HorizontalSliderPage extends BasePage {

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type='range']")
    WebElement slider;

    @FindBy(id = "range")
    WebElement range;

    public HorizontalSliderPage changeSliderValue() {
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider)
                .moveByOffset(55, 0)
                .release()
                .perform();

        Assert.assertTrue(range.getText().contains("5"));
        return this;

    }


}
