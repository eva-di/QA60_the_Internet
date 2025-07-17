package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@class='figure'][2]//img")
    WebElement secondAvatar;
    public HoversPage hoverToSecondAvatar() {
        new Actions(driver).moveToElement(secondAvatar).perform();
        return this;
    }

    @FindBy(xpath = "//h5[contains(.,'name: user2')]")
    WebElement user2;
    public HoversPage verifyUser2(String text) {
        Assert.assertTrue(shouldHaveText(user2, text, 5));
        return this;
    }
}
