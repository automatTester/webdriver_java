package com.zoriana.webdriver.tests.wait;

import com.zoriana.webdriver.tests.base.BaseTests;
import org.testng.annotations.Test;
import com.zoriana.webdriver.pages.DynamicLoadingExample1Page;
import com.zoriana.webdriver.pages.DynamicLoadingExample2Page;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void waitUntilHidden(){
        DynamicLoadingExample1Page dynamicLoadingPage = homePage.clickDynamicLoading().clickExample1();
        dynamicLoadingPage.clickStart();
        assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void waitUntilRendered(){
        DynamicLoadingExample2Page dynamicLoadingPage = homePage.clickDynamicLoading().clickExample2();
        dynamicLoadingPage.clickStart();
        assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

}
