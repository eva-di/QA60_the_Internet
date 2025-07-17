package com.the_internet.pages.frames;

import com.the_internet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='Nested Frames']")
    WebElement nestedFrames;

    public NestedFramesPage selectNestedFrames() {
        click(nestedFrames);
        return this;
    }

    @FindBy(tagName = "frame")
    List<WebElement> frame;


    public NestedFramesPage returnListOfFrames() {
        System.out.println("The total number of frames is: " + frame.size());
        return this;
    }

    @FindBy(name = "frame-top")
    WebElement topFrame;
    @FindBy(css = "body")
    WebElement body;

    public NestedFramesPage verifyFrameContent(String frameText) {

            if (frameText.equals("LEFT")) {
                driver.switchTo().frame(0).switchTo().frame(0);
            } else if (frameText.equals("MIDDLE")) {
                driver.switchTo().frame(0).switchTo().frame(1);
            } else if (frameText.equals("RIGHT")) {
                driver.switchTo().frame(0).switchTo().frame(2);
            } else if (frameText.equals("BOTTOM")) {
                driver.switchTo().frame(1);
            }
            String text = body.getText();
            System.out.println("Frame text: " + text);
            return this;
    }

}
