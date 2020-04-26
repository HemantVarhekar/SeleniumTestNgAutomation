package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class framesTest extends BaseTests {

    @Test
    public void testWizzywigEditor(){
        var editpage = homePage.clickWYSIWYGEditor();
        editpage.clearTextArea();
       String text1 = "Hello ";
       String text2 = "World";


       editpage.setTextArea(text1);
       editpage.decreaseIndentation();
        editpage.setTextArea(text2);
       assertEquals(editpage.getTextFromEditor(),text1+text2, "Text is incorrect");



    }
}
