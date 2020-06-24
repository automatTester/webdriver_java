package com.zoriana.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SliderPage {
    private WebDriver driver;
    private By sliderBar = By.cssSelector(".sliderContainer input");
    private By resultText = By.id("range");

    public SliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSliderBar(String value){
        while (!getResult().equals(value)){
            driver.findElement(sliderBar).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getResult(){
        return driver.findElement(resultText).getText();
    }

}
