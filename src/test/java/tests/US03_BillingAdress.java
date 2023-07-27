package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US03_BillingAdress {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        //emre

    }
}
