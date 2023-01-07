package murat.Working;

import murat.pages.DemoqaPage;
import murat.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoqaTest1 {

@Test
    public void test(){
    Actions act = new Actions(Driver.getDriver());
    Driver.getDriver().get("https://demoqa.com/");
    act.sendKeys(Keys.PAGE_DOWN).perform();
    DemoqaPage dq = new DemoqaPage();
    dq.interaction.click();
    dq.droppable.click();

    act.dragAndDrop(dq.draggable, dq.drophere).perform();

}



}
