package com.zoriana.webdriver.tests.login;

import com.zoriana.webdriver.tests.base.BaseTests;
import org.testng.annotations.Test;
import com.zoriana.webdriver.pages.LoginPage;
import com.zoriana.webdriver.pages.SecureAreaPage;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        String userName = "tomsmith";
        String password = "SuperSecretPassword!";
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername(userName);
        loginPage.setPassword(password);
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");

    }
}
