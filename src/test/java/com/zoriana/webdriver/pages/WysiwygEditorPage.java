package com.zoriana.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By editorArea = By.id("tinymce");
    private By decreaseIndentButton = By.id("mceu_12");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(editorArea).clear();
        switchToMainArea();
    }

    public void editTextArea(String text){
        switchToEditArea();
        driver.findElement(editorArea).sendKeys(text);
        switchToMainArea();
    }

    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(editorArea).getText();
        switchToMainArea();
        return text;
    }
}
