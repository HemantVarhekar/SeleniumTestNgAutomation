package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DynamicScrollPage {

    private WebDriver driver;
    By textBlock = By.className("jscroll-added");

    public DynamicScrollPage(WebDriver driver){
        this.driver = driver;
    }

    /*
    *@Param index
    *
    *
     */


    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;

        while(getParagraphNumber() < index){
            jsExecutor.executeScript(script);
        }
    }

    private int getParagraphNumber(){
        return driver.findElements(textBlock).size();

    }

}
