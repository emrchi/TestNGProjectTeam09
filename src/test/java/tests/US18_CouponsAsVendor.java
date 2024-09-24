package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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
        extentTest.info("gone to homepage.");

        AlloverCommercePage allovercommercePage = new AlloverCommercePage();
        ReusableMethods.signIn("allovercommerce_email", "allovercommerce_password");
        ReusableMethods.bekle(2);

        //Click 'Store Manager' button.
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 4200);
        actions.perform();
        ReusableMethods.click(allovercommercePage.myOrdersButton);
        ReusableMethods.bekle(2);
        extentTest.info("Clicked 'Store Manager' button.");

        actions.scrollByAmount(1, 150);
        actions.perform();
        ReusableMethods.click(allovercommercePage.storeManagerButton);
        ReusableMethods.bekle(2);

        //Click 'Coupons'  button.
        actions.scrollByAmount(1, 500);
        actions.perform();
        ReusableMethods.click(allovercommercePage.couponsButton);
        ReusableMethods.bekle(2);
        extentTest.info("Clicked 'Coupons'  button.");

        //Click 'Add New' button.
        ReusableMethods.click(allovercommercePage.addCouponsButton);
        ReusableMethods.bekle(2);
        extentTest.info("Clicked 'Add New' button.");

        //Write a unique code to 'Code' box.
        actions.scrollByAmount(1, 250);
        actions.perform();
        allovercommercePage.codeButton.sendKeys(ConfigReader.getProperty("allovercommerceCouponCode"), Keys.ENTER);
        ReusableMethods.bekle(2);
        extentTest.info("Written a unique code to 'Code' box.");

        //Write a description to 'Description' box.
        allovercommercePage.descriptionButton.
                sendKeys(ConfigReader.getProperty("allovercommerceCouponDescription"), Keys.ENTER);
        ReusableMethods.bekle(2);
        extentTest.info("Written a description to 'Description' box.");

        //Click 'Discount Type' dropdown and choose 'Percentage discount'.
        WebElement ddmDiscountPercentage = allovercommercePage.percentageDiscount;
        ReusableMethods.ddmIndex(ddmDiscountPercentage, 0);
        extentTest.info("Clicked 'Discount Type' dropdown and choosen 'Percentage discount'.");

        //Write coupon amount to 'Coupon Amount' box.
        allovercommercePage.couponAmountButton.clear();
        allovercommercePage.couponAmountButton.sendKeys(ConfigReader.getProperty("couponAmount"), Keys.ENTER);
        ReusableMethods.bekle(2);
        extentTest.info("Written coupon amount to 'Coupon Amount' box.");

        //Click 'Coupon expiry date' box and choose date from callender.
        allovercommercePage.expiryDateButonu.sendKeys(ConfigReader.getProperty("expiryDateinfo"), Keys.TAB);
        ReusableMethods.bekle(2);
        extentTest.info("Clicked 'Coupon expiry date' box and chosen date from callender.");

        //Choose 'Allow free shipping' checkbox.
        actions.scrollByAmount(1, 140);
        actions.perform();
        if (!allovercommercePage.allowFreeShippingCheckBoxButton.isSelected()) {
            allovercommercePage.allowFreeShippingCheckBoxButton.click();
        }
        ReusableMethods.bekle(2);
        extentTest.info("Chosen 'Allow free shipping' checkbox.");

        //Choose 'Show on store' checkbox.
        if (!allovercommercePage.showOnStoreCheckBoxButton.isSelected()) {
            allovercommercePage.showOnStoreCheckBoxButton.click();
        }
        ReusableMethods.bekle(2);
        extentTest.info("Chosen 'Show on store' checkbox.");

        //Click to 'CHECKOUT' button.
        //Verify that 'Order Complete' page has come.
        extentTest.info("'CHECKOUT' ve 'Order Complete' butonlari bulunmamaktadir.");

        //Scroll page down and click 'Submit' button.
        ReusableMethods.click(allovercommercePage.finalSubmitButton);
        ReusableMethods.bekle(2);
        extentTest.info("Scrolled page down and clicked 'Submit' button.");

        //Verify 'Coupon Successfully Published.' is seen.
        Assert.assertTrue(allovercommercePage.coSuPu.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.info("Verified 'Coupon Successfully Published.' is seen");

    }

    @Test
    public void TestCase02() {
        //go to homepage.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        ReusableMethods.bekle(2);
        extentTest.info("gone to homepage.");

        AlloverCommercePage allovercommercePage = new AlloverCommercePage();
        allovercommercePage.signInButton.click();
        ReusableMethods.bekle(2);

        //Login as a "Vendor". (kobi.hai@fixedfor.com , Ms123456).
        allovercommercePage.username.sendKeys(ConfigReader.getProperty("allovercommerce_email"),
                Keys.TAB, ConfigReader.getProperty("allovercommerce_password"), Keys.ENTER);
        ReusableMethods.bekle(2);
        extentTest.info("Logged in as a \"Vendor\".");

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
        extentTest.info("Clicked 'Store Manager' button.");

        //Click 'Coupons'  button.
        actions.scrollByAmount(1, 500);
        actions.perform();
        ReusableMethods.click(allovercommercePage.couponsButton);
        ReusableMethods.bekle(2);
        extentTest.info("Clicked 'Coupons'  button.");


        //Click 'Add New' button.
        ReusableMethods.click(allovercommercePage.addCouponsButton);
        ReusableMethods.bekle(2);
        extentTest.info("Clicked 'Add New' button.");

        //Write a unique code to 'Code' box.
        actions.scrollByAmount(1, 250);
        actions.perform();
        allovercommercePage.codeButton.sendKeys(ConfigReader.getProperty("allovercommerceCouponCode"), Keys.ENTER);
        ReusableMethods.bekle(2);
        extentTest.info("Written a unique code to 'Code' box.");

        //Write a description to 'Description' box.
        allovercommercePage.descriptionButton.
                sendKeys(ConfigReader.getProperty("allovercommerceCouponDescription"), Keys.ENTER);
        ReusableMethods.bekle(2);
        extentTest.info("Written a description to 'Description' box.");

        //Click 'Discount Type' dropdown and choose 'Fixed Product discount'.
        WebElement ddmDiscountPercentage = allovercommercePage.fixedProductDiscountButton;
        ReusableMethods.ddmIndex(ddmDiscountPercentage, 1);
        ReusableMethods.bekle(2);
        extentTest.info("Clicked 'Discount Type' dropdown and chosen 'Fixed Product discount'.");

        //Write coupon amount to 'Coupon Amount' box.
        allovercommercePage.couponAmountButton.clear();
        allovercommercePage.couponAmountButton.sendKeys(ConfigReader.getProperty("couponAmount"), Keys.ENTER);
        ReusableMethods.bekle(2);
        extentTest.info("Written coupon amount to 'Coupon Amount' box.");

        //Click 'Coupon expiry date' box and choose date from calender.
        allovercommercePage.expiryDateButonu.sendKeys(ConfigReader.getProperty("expiryDateinfo"), Keys.TAB);
        ReusableMethods.bekle(2);
        extentTest.info("Clicked 'Coupon expiry date' box and choose date from calender.");

        //Choose 'Allow free shipping' checkbox.
        actions.scrollByAmount(1, 150);
        actions.perform();
        if (!allovercommercePage.allowFreeShippingCheckBoxButton.isSelected()) {
            allovercommercePage.allowFreeShippingCheckBoxButton.click();
        }
        ReusableMethods.bekle(2);
        extentTest.info("//Choosen 'Allow free shipping' checkbox.");

        //Choose 'Show on store' checkbox.
        if (!allovercommercePage.showOnStoreCheckBoxButton.isSelected()) {
            allovercommercePage.showOnStoreCheckBoxButton.click();
        }
        ReusableMethods.bekle(2);
        extentTest.info("Chosen 'Show on store' checkbox.");

        //Click to 'CHECKOUT' button.
        //Verify that 'Order Complete' page has come.
        extentTest.info("'CHECKOUT' ve 'Order Complete' butonlari bulunmamaktadir.");

        //Scroll page down and click 'Submit' button.
        ReusableMethods.click(allovercommercePage.finalSubmitButton);
        ReusableMethods.bekle(2);
        extentTest.info("Scrolled page down and clicked 'Submit' button.");

        //Verify 'Coupon Successfully Published.' is seen.
        Assert.assertTrue(allovercommercePage.coSuPu.isDisplayed());
        ReusableMethods.bekle(2);
        extentTest.info("Verified 'Coupon Successfully Published.' is seen.");
    }
}
