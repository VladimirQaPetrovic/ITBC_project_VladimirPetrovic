package tests;

import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest{
    @Test
    public void verifyYesMessage(){
        getRadioButtonPage().openRadioButtonPage()
                .clickYesButton();
    }
    @Test
    public void verifyImpressiveMessage(){
        getRadioButtonPage().openRadioButtonPage()
                .clickImpressiveButton();
    }
}
