package com.the_Internet.pages.frames;

import com.the_Internet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class IFramesPage extends BasePage  {
    public IFramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='iFrame']")
    WebElement iFrame;

    public IFramesPage selectIFrames() {
        click(iFrame);
        return this;
    }
    @FindBy(tagName = "iframe")
    List<WebElement> iFrames;
    public IFramesPage returnListOfFrames() {
        System.out.println("The total number: " + iFrames.size());

        return this;
    }



    @FindBy(css = "body>div:nth-child(4)>div")
    WebElement notification;
    @FindBy(css = "body>div:nth-child(4)>div>div>button")
    WebElement closeButton;

    public IFramesPage closeNotification() {
        if(notification != null) {
            new Actions(driver).moveToElement(notification).click(closeButton).perform();
        }
        return this;
    }

//    @FindBy(xpath = "//body//p")
//    WebElement textInIFrame;
//    public IFramesPage verifyIframeByText(String text) {
//        Assert.assertTrue(shouldHaveText(textInIFrame, text, 5));
//        return this;
//    }

    @FindBy(id = "mce_0_ifr")
    WebElement iFrameTextArea;
    @FindBy(id = "tinymce")
    WebElement body;

    public IFramesPage verifyContentByText(String text) {
        driver.switchTo().frame(iFrameTextArea);
        Assert.assertEquals(body.getText(), text);
        System.out.println("The text in iFrame is " + "'" + body.getText() + "'");

        return this;
    }
}
