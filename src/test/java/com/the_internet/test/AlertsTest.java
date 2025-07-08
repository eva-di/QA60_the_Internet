package com.the_internet.test;

import com.the_Internet.pages.HomePage;
import com.the_Internet.pages.JavaScriptAlerts.AlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).selectAlerts();
    }

    @Test
    public void clickForJSAlert() {
        new AlertsPage(driver).clickForJsAlert().verifyResult("You successfully clicked an alert");
    }

    @Test
    public void clickForJSConfirm() {
        new AlertsPage(driver).clickForJsConfirm().verifyResult("You clicked: Ok");
    }

    @Test
    public void clickForJSPrompt() {
        new AlertsPage(driver).sendMessageToAlert("Hello, World!").verifyMessage("Hello, World!");
    }


}
