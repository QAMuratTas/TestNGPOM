package murat.pages;

import murat.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage {

    // initElements methodu Page class i initialize etmek adına kullanılır
    public SauceDemoLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id="user-name")
    public WebElement txtUsername;
    @FindBy(id="password")
    public WebElement txtPassword;
    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement btnLogin;


}
