package murat.pages;

import murat.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage {

    // initElements methodu Page class i initialize etmek adına kullanılır
    public SauceDemoLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


}
