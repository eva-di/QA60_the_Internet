package com.the_Internet.pages;

import com.the_Internet.pages.JavaScriptAlerts.AlertsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h2")
    WebElement pageTitle;

    public String getTitleText() {
        return pageTitle.getText();
    }

    @FindBy(xpath = "//a[text()='JavaScript Alerts']")
    WebElement alerts;
    public AlertsPage selectAlerts() {
        click(alerts);
        return new AlertsPage(driver);

    }

    @FindBy(xpath = "//a[text()='Horizontal Slider']")
    WebElement slider;
    public HorizontalSliderPage selectSlider() {
        click(slider);
        return new HorizontalSliderPage(driver);

    }
}
