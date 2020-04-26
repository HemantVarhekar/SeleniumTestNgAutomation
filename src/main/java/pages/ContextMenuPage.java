package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By rightClickBox = By.id("hot-spot");



    public ContextMenuPage (WebDriver driver){
        this.driver = driver;
    }

    public void rightClickAction(){
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(rightClickBox)).perform();

    }

    public String getAlert(){
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
