package com.the_Internet.pages;

import com.the_Internet.pages.JavaScriptAlerts.AlertsPage;
import com.the_Internet.pages.frames.NestedFramesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.constant.Constable;

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

    @FindBy(xpath = "//a[.='Frames']")
    WebElement frames;
    public NestedFramesPage selectFrames() {
        click(frames);
        return new NestedFramesPage(driver);

    }

    @FindBy(xpath = "//a[.='Hovers']")
    WebElement hovers;
    public HoversPage selectHovers() {
        click(hovers);
        return new HoversPage(driver);

    }

    @FindBy(xpath = "//a[.='Drag and Drop']")
    WebElement dragAndDrop;
    public DragAndDropPage selectDragAndDrop() {
        click(dragAndDrop);
        return new DragAndDropPage(driver);

    }

    @FindBy(xpath = "//a[.='Context Menu']")
    WebElement contextMenu;
    public ContextMenuPage selectContextMenu() {
        click(contextMenu);
        return new ContextMenuPage(driver);

    }

    @FindBy(xpath = "//a[.='Dropdown']")
    WebElement dropDown;
    public DropDownPage selectDropDown() {
        click(dropDown);
        return new DropDownPage(driver);

    }
}
