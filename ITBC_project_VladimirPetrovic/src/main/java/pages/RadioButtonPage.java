package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage{
    private WebElement yesBtn;

    private WebElement impressiveBtn;

    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getYesBtn(){
        yesBtn = getDriver().findElement(By.xpath("//label[@for='yesRadio']"));
        return yesBtn;
    }

    public WebElement getImpressiveBtn(){
        impressiveBtn = getDriver().findElement(By.xpath("//label[@for='impressiveRadio']"));
        return impressiveBtn;
    }

    public RadioButtonPage openRadioButtonPage(){
        getDriver().get("https://demoqa.com/radio-button");
        return this;
    }
    public RadioButtonPage clickYesButton(){
        getYesBtn().click();
        return this;
    }
    public RadioButtonPage clickImpressiveButton(){
        getImpressiveBtn().click();
        return this;
    }
}
