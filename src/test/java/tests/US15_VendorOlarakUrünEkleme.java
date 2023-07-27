package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US15_VendorOlarakUrünEkleme {


    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
}
