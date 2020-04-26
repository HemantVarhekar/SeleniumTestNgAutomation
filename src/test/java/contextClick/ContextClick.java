package contextClick;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextClick extends BaseTests {

    @Test
    public void contextClickText(){
        var contextClick = homePage.clickContextmenu();
        contextClick.rightClickAction();
        String messageText = contextClick.getAlert();
        contextClick.acceptAlert();
        assertEquals(messageText, "You selected a context menu", "Context menu is not selected");

    }
}
