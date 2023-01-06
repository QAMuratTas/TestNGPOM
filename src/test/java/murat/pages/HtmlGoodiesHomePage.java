package murat.pages;

import murat.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HtmlGoodiesHomePage {

    public HtmlGoodiesHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
         }
    @FindBy(id = "box1")
    public WebElement Oslo;
    @FindBy(id = "box2")
    public WebElement Stockholm;
    @FindBy(id = "box3")
    public WebElement Washington;
    @FindBy(id = "box4")
    public WebElement Copenhag;
    @FindBy(id = "box5")
    public WebElement Seoul;
    @FindBy(id = "box6")
    public WebElement Rome;
    @FindBy(id = "box7")
    public WebElement Madrid;



}
