package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonPage extends BasePage{
    private WebElement buttonsField;
    private WebElement doubleClickMeButton;
    private WebElement rightClickMeButton;
    private WebElement clickMeButton;
    private WebElement doubleClickMeMessage;
    private WebElement rightClickMeMessage;
    private WebElement clickMeMessage;
    public ButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getButtonsField(){
       buttonsField = getDriver().findElement(By.xpath("//span[contains(text(), 'Buttons')]"));
        return buttonsField;
    }
    public WebElement getDoubleClickMeButton(){
       doubleClickMeButton =  getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickMeButton;
    }
    public WebElement getRightClickMeButton(){
       rightClickMeButton = getDriver().findElement(By.id("rightClickBtn"));
        return rightClickMeButton;
    }
    public WebElement getClickMeButton(){
      clickMeButton =  getDriver().findElement(By.xpath("//button[text() = 'Click Me']"));
        return clickMeButton;
    }
    public WebElement getDoubleClickMeMessage(){
       doubleClickMeMessage= getDriver().findElement(By.id("doubleClickMessage"));
        return doubleClickMeMessage;
    }
    public WebElement getRightClickMeMessage(){
      rightClickMeMessage =  getDriver().findElement(By.id("rightClickMessage"));
        return rightClickMeMessage;
    }
    public WebElement getClickMeMessage(){
       clickMeMessage = getDriver().findElement(By.id("dynamicClickMessage"));
        return clickMeMessage;
    }
    public ButtonPage openButtonPage(){
        getDriver().get("https://demoqa.com/buttons");
        return this;
    }
    public ButtonPage clickButtonsPage(){
        getButtonsField().click();
        return this;
    }


}
