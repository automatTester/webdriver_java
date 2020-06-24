package com.zoriana.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By theBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickTheBox(){
        Actions actions = new Actions(driver);
        WebElement theBoxToClick = driver.findElement(theBox);
        actions.contextClick(theBoxToClick).perform();
    }

    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }

    public void alertAccept(){
        driver.switchTo().alert().accept();
    }
}
