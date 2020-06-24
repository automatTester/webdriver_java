package com.zoriana.webdriver.tests.alerts;

import com.zoriana.webdriver.tests.base.BaseTests;
import org.testng.annotations.Test;
import com.zoriana.webdriver.pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Alert text in incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.alert_getText(), "I am a JS Confirm", "Alert text incorrect");
        alertsPage.alert_clickToDismiss();
    }

    @Test
    public void testDismissAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        alertsPage.alert_clickToDismiss();
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "Alert text incorrect");
    }

    @Test
    public void testEnterInputInPrompt(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "I am rock!";
        alertsPage.alert_enterText(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Results text incorrect");
    }
}
