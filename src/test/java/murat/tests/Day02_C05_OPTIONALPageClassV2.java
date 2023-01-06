package murat.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import murat.pages.AmazonHomePageV1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day02_C05_OPTIONALPageClassV2 {




    @Test
    public void test(){

        WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");

        AmazonHomePageV1 homePage = new AmazonHomePageV1();

        homePage.searchFor("modem");



    }


}
