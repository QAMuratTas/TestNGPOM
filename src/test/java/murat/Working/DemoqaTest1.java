package murat.Working;

import murat.pages.DemoqaPage;
import murat.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoqaTest1 {

@Test
    public void test(){

    Driver.getDriver().get("https://www.demoqa.com/");
    DemoqaPage dq = new DemoqaPage();
    dq.interaction.click();
    dq.droppable.click();
    Actions act = new Actions(Driver.getDriver());
    act.dragAndDrop(dq.draggable, dq.drophere);

}



}
