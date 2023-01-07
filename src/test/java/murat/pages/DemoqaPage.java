package murat.pages;

import murat.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DemoqaPage {

    public DemoqaPage() {


        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//h5[.='Interactions']")
    public WebElement interaction;
    @FindBy(xpath = "//span[.='Droppable']")
    public WebElement droppable;
    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement draggable;
    @FindBy(id = "droppable")
    public WebElement drophere;



}
