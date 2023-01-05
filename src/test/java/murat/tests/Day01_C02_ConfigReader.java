package murat.tests;

import murat.utilities.ConfigReader;
import murat.utilities.Driver;
import org.testng.annotations.Test;

public class Day01_C02_ConfigReader {


    @Test
    public void readConfig() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

        Driver.closeDriver();

    }
}
