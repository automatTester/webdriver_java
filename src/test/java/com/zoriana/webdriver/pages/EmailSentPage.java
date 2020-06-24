package com.zoriana.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;
    private By emailSentMessage = By.id("content");

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    public String getEmailSentMessage() {
        return driver.findElement(emailSentMessage).getText();
    }
}
