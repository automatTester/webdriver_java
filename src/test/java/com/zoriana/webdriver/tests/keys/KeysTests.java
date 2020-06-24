package com.zoriana.webdriver.tests.keys;

import com.zoriana.webdriver.tests.base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.zoriana.webdriver.pages.KeyPage;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        KeyPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE", "Text message incorrect");
    }

    @Test
    public void testPi(){
        KeyPage keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
        assertEquals(keyPage.getResult(), "You entered: 4", "Text message incorrect");
    }
}
