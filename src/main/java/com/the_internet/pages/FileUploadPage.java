package com.the_internet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploadPage extends BasePage {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "input[type='file']")
    WebElement chooseFile;
    public FileUploadPage uploadFile(String path) {
//        click(chooseFile);
        chooseFile.sendKeys(path);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement submitButton;
    public FileUploadPage clickUpload() {
        click(submitButton);
        return this;
    }
    @FindBy(css = "div h3")
    WebElement uploadResult;
    public FileUploadPage verifyFileUploaded(String text) {
        Assert.assertTrue(shouldHaveText(uploadResult, text, 5));
        return this;
    }
}
