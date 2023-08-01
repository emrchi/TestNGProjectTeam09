package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US09_VendorRegistration {

    @Test
    public void vendorKaydi() {
        // Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));

        // Register butonuna tıkla
        AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
        alloverCommercePage.register.click();

        // "Become a vendor" butonuna tıkla
        alloverCommercePage.signUpAsVendor.click();

        // Email gir
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1,250);
        actions.perform();
        ReusableMethods.bekle(2);
        alloverCommercePage.email.sendKeys(ConfigReader.getProperty("email"),Keys.TAB);
    }
}
