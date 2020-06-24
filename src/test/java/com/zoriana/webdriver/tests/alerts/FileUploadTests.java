package com.zoriana.webdriver.tests.alerts;

import com.zoriana.webdriver.tests.base.BaseTests;
import org.testng.annotations.Test;
import com.zoriana.webdriver.pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("/Users/Zorianka/IdeaProjects/webdriver_java/resources/chromedriver");
        assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver", "Uploaded file name incorrect");
    }
}
