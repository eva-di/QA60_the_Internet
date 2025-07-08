package com.the_Internet.pages.JavaScriptAlerts;

import com.the_Internet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement jsAlert;

    public AlertsPage clickForJsAlert() {
        click(jsAlert);
        if (jsAlert != null) {
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement jsConfirm;

    public AlertsPage clickForJsConfirm() {
        click(jsConfirm);
        if (jsConfirm != null) {
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    WebElement promptButton;
    public AlertsPage sendMessageToAlert(String message) {
        click(promptButton);
        if(message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }
    @FindBy(id = "result")
    WebElement promptResult;
    public AlertsPage verifyMessage(String text) {
        Assert.assertTrue(promptResult.getText().contains(text));
        return this;
    }

    @FindBy(id = "result")
    static WebElement result;

    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }
}
