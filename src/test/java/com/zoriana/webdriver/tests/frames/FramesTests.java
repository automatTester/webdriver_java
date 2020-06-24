package com.zoriana.webdriver.tests.frames;

import com.zoriana.webdriver.tests.base.BaseTests;
import org.testng.annotations.Test;
import com.zoriana.webdriver.pages.FramesPage;
import com.zoriana.webdriver.pages.NestedFramesPage;
import com.zoriana.webdriver.pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FramesTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwigEditor();
        wysiwygEditorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "world!";

        wysiwygEditorPage.editTextArea(text1);
        wysiwygEditorPage.decreaseIndention();
        wysiwygEditorPage.editTextArea(text2);

        assertEquals(wysiwygEditorPage.getTextFromEditor(), text1 + text2, "Text from the editor is incorrect");
    }

    @Test
    public void testNestedFrames(){
        String text1 = "LEFT";
        String text2 = "BOTTOM";
        FramesPage framesPage = homePage.clickFrames();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.switchToLeftFrame(), text1, "Text is incorrect");
        assertEquals(nestedFramesPage.switchToBottomFrame(), text2, "Text is incorrect");
    }
}
