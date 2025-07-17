package com.the_internet.config;

import com.the_internet.utils.MyListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import java.time.Duration;

public class ApplicationManager {

    WebDriver driver;
    String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public WebDriver startTest() {
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        }else if(browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if(browser != null && !browser.equals("chrome") && !browser.equals("firefox")) {
            throw new IllegalArgumentException("Browser is not correct");
        }
        driver = new EventFiringDecorator(new MyListener()).decorate(driver);
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public WebDriver stopTest() {
        driver.quit();
        return driver;
    }
}
