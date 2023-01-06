package murat.pages;

import murat.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    // örnek olması açısından @findAll anotation kullanımı , Page

    @FindAll(
            {
                    @FindBy(id ="user-name"),
                    @FindBy(id ="password"),
                    @FindBy(xpath = "//*[@id='login-button']")
            }
    )
    public List<WebElement> inputElements;

}
