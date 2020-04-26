package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");


    public WYSIWYGEditorPage (WebDriver driver){
        this.driver = driver;
    }

    public void clearTextArea(){
        switchTOEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void decreaseIndentation(){
        driver.findElement(decreaseIndentButton).click();
    }

    public void setTextArea(String text){
        switchTOEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor(){
        switchTOEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    private void switchTOEditArea(){
        driver.switchTo().frame(editorIframeId);

    }
}
