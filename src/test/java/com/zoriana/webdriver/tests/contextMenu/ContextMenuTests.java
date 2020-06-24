package com.zoriana.webdriver.tests.contextMenu;

import com.zoriana.webdriver.tests.base.BaseTests;
import org.testng.annotations.Test;
import com.zoriana.webdriver.pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testPopUpText(){
        String text = "You selected a context menu";
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickTheBox();
        assertEquals(contextMenuPage.getPopUpText(), text, "Pop-up message text incorrect");
        contextMenuPage.alertAccept();
    }
}
