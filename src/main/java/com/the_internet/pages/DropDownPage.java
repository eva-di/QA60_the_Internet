package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage extends BasePage {
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropDownEl;
    public DropDownPage clickOnDropDown() {
        new DropDownPage(driver).click(dropDownEl);

        return this;
    }

    public DropDownPage selectOption2(String text) {
        pause(1000);
        Select dropdown = new Select(dropDownEl);
        dropdown.selectByVisibleText(text);
        return this;
    }

    public DropDownPage verifyText() {
        String selectOption = new Select(dropDownEl).getFirstSelectedOption().getText();
        Assert.assertTrue(shouldHaveText(dropDownEl, selectOption, 5));
        return this;
    }
}
