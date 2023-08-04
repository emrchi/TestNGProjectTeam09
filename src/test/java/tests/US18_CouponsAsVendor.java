package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import utilities.ExtentReport;

public class US18_CouponsAsVendor extends ExtentReport {

    @Test
    public void TestCase01() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
                "Inability to add a billing address with blank “First Name” field");
        //go to homepage.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        ReusableMethods.bekle(2);

        AlloverCommercePage allovercommercePage = new AlloverCommercePage();
        ReusableMethods.signIn("allovercommerce_email", "allovercommerce_password" );
        ReusableMethods.bekle(2);

        //Click 'Store Manager' button.
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 4200);
        actions.perform();
        ReusableMethods.click(allovercommercePage.myOrdersButton);
        ReusableMethods.bekle(2);

        actions.scrollByAmount(1, 150);
        actions.perform();
        ReusableMethods.click(allovercommercePage.storeManagerButton);
        ReusableMethods.bekle(2);

        //Click 'Coupons'  button.
        actions.scrollByAmount(1, 500);
        actions.perform();
        ReusableMethods.click(allovercommercePage.couponsButton);
        ReusableMethods.bekle(2);

        //Click 'Add New' button.
        ReusableMethods.click(allovercommercePage.addCouponsButton);
        ReusableMethods.bekle(2);

        //Write a unique code to 'Code' box.
        actions.scrollByAmount(1, 250);
        actions.perform();
        allovercommercePage.codeButton.sendKeys(ConfigReader.getProperty("allovercommerceCouponCode"), Keys.ENTER);
        ReusableMethods.bekle(2);

        //Write a description to 'Description' box.
        allovercommercePage.descriptionButton.
                sendKeys(ConfigReader.getProperty("allovercommerceCouponDescription"), Keys.ENTER);

        //Click 'Discount Type' dropdown and choose 'Percentage discount'.
        //allovercommercePage.percentageDiscount.clear();

        WebElement ddmDiscountPercentage = allovercommercePage.percentageDiscount;
        ReusableMethods.ddmIndex(ddmDiscountPercentage, 0);

        //Write coupon amount to 'Coupon Amount' box.
        //Click 'Coupon expiry date' box and choose date from callender
        //Choose 'Allow free shipping' checkbox
        //Choose 'Show on store' checkbox
        //Click to 'CHECKOUT' button
        //Verify that 'Order Complete' page has come
        //Scroll page down and click 'Submit' button
        //Verify 'Coupon Successfully Published.' is seen
    }

    @Test
    public void TestCase02() {
        //go to homepage.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        ReusableMethods.bekle(2);

        AlloverCommercePage allovercommercePage = new AlloverCommercePage();
        allovercommercePage.signInButton.click();
        ReusableMethods.bekle(2);

        //Login as a "Vendor". (kobi.hai@fixedfor.com , Ms123456).
        allovercommercePage.username.sendKeys(ConfigReader.getProperty("allovercommerce_email"),
                Keys.TAB, ConfigReader.getProperty("allovercommerce_password"), Keys.ENTER);
        ReusableMethods.bekle(2);

        //Click 'Store Manager' button.
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 4200);
        actions.perform();
        ReusableMethods.click(allovercommercePage.myOrdersButton);
        ReusableMethods.bekle(2);

        actions.scrollByAmount(1, 150);
        actions.perform();
        ReusableMethods.click(allovercommercePage.storeManagerButton);
        ReusableMethods.bekle(2);

        //Click 'Coupons'  button.
        actions.scrollByAmount(1, 500);
        actions.perform();
        ReusableMethods.click(allovercommercePage.couponsButton);
        ReusableMethods.bekle(2);


        //Click 'Add New' button.
        ReusableMethods.click(allovercommercePage.addCouponsButton);
        ReusableMethods.bekle(2);

        //Write a unique code to 'Code' box.
        actions.scrollByAmount(1, 250);
        actions.perform();
        allovercommercePage.codeButton.sendKeys(ConfigReader.getProperty("allovercommerceCouponCode"), Keys.ENTER);
        ReusableMethods.bekle(2);


        //Write a description to 'Description' box.
        //Write a description to 'Description' box.
        allovercommercePage.descriptionButton.
                sendKeys(ConfigReader.getProperty("allovercommerceCouponDescription"), Keys.ENTER);

        //Click 'Discount Type' dropdown and choose 'Fixed Product discount'
        //Write coupon amount to 'Coupon Amount' box
        //Click 'Coupon expiry date' box and choose date from callender
        //Choose 'Allow free shipping' checkbox
        //Choose 'Show on store' checkbox
        //Click to 'CHECKOUT' button
        //Verify that 'Order Complete' page has come
        //Scroll page down and click 'Submit' button
        //Verify 'Coupon Successfully Published.' is seen

    }
}
