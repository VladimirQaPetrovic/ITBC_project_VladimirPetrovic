package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonTest extends BaseTest{

   @BeforeMethod
    public void verifyButtonsField() {
       getButtonPage().openButtonPage();
    }
    @Test
    public void doubleClickMeButton(){
       getActions().doubleClick(getButtonPage().getDoubleClickMeButton()).perform();
       String message = "You have done a double click";
        Assert.assertEquals(getButtonPage().getDoubleClickMeMessage().getText(),message);
    }
    @Test
    public void rightClickMeButton(){
       getActions().contextClick(getButtonPage().getRightClickMeButton()).perform();
       String message = "You have done a right click";
       Assert.assertEquals(getButtonPage().getRightClickMeMessage().getText(), message);
    }
    @Test
    public void clickMe(){
       getActions().click(getButtonPage().getClickMeButton()).perform();
       String message = "You have done a dynamic click";
       Assert.assertEquals(getButtonPage().getClickMeMessage().getText(),message);
    }
}