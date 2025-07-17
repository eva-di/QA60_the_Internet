package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
                .sendKeys(range, "5")
                .release()
                .perform();

        Assert.assertTrue(range.getText().contains("5"));
        return this;

    }
    public HorizontalSliderPage changeSliderValue2() {
//        pause(1000);
//        moveWithJS(0, 200);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, 60, 0)
                .perform();
        return this;

    }

    public HorizontalSliderPage verifySliderValue(String number) {
        Assert.assertEquals(range.getText(), "5");
        return this;
    }


}
