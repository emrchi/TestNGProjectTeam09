package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.scrollEnd;

public class US15_VendorOlarakUrünEkleme extends ExtentReport{


    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));

        AlloverCommercePage sourcePage = new AlloverCommercePage();
        sourcePage.login.click();

        sourcePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB,ConfigReader.getProperty("vendorpassword"),Keys.ENTER);

        ReusableMethods.bekle(3);

        scrollEnd();

        ReusableMethods.bekle(3);

        Assert.assertTrue(sourcePage.myAccount.isDisplayed());

        sourcePage.myAccount.click();

        Assert.assertTrue(sourcePage.storeManager.isDisplayed());

        sourcePage.storeManager.click();

        Assert.assertTrue(sourcePage.products.isDisplayed());

        sourcePage.products.click();

        sourcePage.addNew.click();

        Assert.assertTrue(sourcePage.inventory.isDisplayed());

        Assert.assertTrue(sourcePage.shipping.isDisplayed());

        Assert.assertTrue(sourcePage.linked.isDisplayed());

        Assert.assertTrue(sourcePage.seo.isDisplayed());

        Assert.assertTrue(sourcePage.advanced.isDisplayed());

        //ahmet 12











    }
}
