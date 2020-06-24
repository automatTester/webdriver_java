package com.zoriana.webdriver.tests.forgotPassword;

import com.zoriana.webdriver.tests.base.BaseTests;
import org.testng.annotations.Test;
import com.zoriana.webdriver.pages.EmailSentPage;
import com.zoriana.webdriver.pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPasswordEmailSent() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.getEmailSentMessage()
                        .contains("Your e-mail's been sent!"),
                "Confirmation message text is incorrect");
    }
}
