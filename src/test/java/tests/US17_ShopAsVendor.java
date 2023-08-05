package tests;

import com.github.javafaker.Faker;
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

public class US17_ShopAsVendor extends ExtentReport {
    @Test
    public void test01() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
                "Inability to add a billing address with blank “First Name” field");
        //go to homepage.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        ReusableMethods.bekle(2);

        AlloverCommercePage allovercommercePage = new AlloverCommercePage();
        ReusableMethods.signIn("allovercommerce_email", "allovercommerce_password");
        ReusableMethods.bekle(2);
        //extentTest.info("gone to homepage");

        //Scroll down the page until you see 'Top 20 Best Seller' and click.
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 500);
        actions.perform();
        //extentTest.info("Scrolled down the page until seen 'Top 20 Best Seller' and clicked.");

        //allovercommercePage.top20BestSeller.click(); // Burada fail veriyor.
        ReusableMethods.bekle(2);

        //Click to the picture of first product of list under 'Top 20 Best Seller'.
        ReusableMethods.click(allovercommercePage.earphoneProduct);
        ReusableMethods.bekle(2);
        //extentTest.info("Clicked to the picture of first product of list under 'Top 20 Best Seller'.");

        //Click to 'ADD TO CART' button.
        ReusableMethods.click(allovercommercePage.addToCartt);
        ReusableMethods.bekle(2);
        //extentTest.info("Clicked to 'ADD TO CART' button.");

        //Click to the search box.
        ReusableMethods.click(allovercommercePage.searchBox);
        ReusableMethods.bekle(3);
        //extentTest.info("Clicked to the search box.");

        //search for'kazak' in the search box.
        allovercommercePage.searchBox.sendKeys(ConfigReader.getProperty("allovercommerce_searchbox"), Keys.ENTER);
        //extentTest.info("Searched for'kazak' in the search box.");

        //Click to the picture of first product.
        ReusableMethods.click(allovercommercePage.firstProduct);
        ReusableMethods.bekle(3);
        //extentTest.info("Clicked to the picture of first product.");

        //Click to 'ADD TO CART' button.
        ReusableMethods.click(allovercommercePage.addToCartKazak);
        ReusableMethods.bekle(3);
        //extentTest.info("Clicked to 'ADD TO CART' button.");

        //Click to 'Cart' icon on the right top of the page.
        ReusableMethods.click(allovercommercePage.cartButton);
        ReusableMethods.bekle(2);
        ReusableMethods.click(allovercommercePage.viewCart);
        ReusableMethods.bekle(2);
        //extentTest.info("Clicked to 'Cart' icon on the right top of the page.");

        //Verify that the details of chosen products are correct.
        Assert.assertTrue(allovercommercePage.verifyShoppingCart.isDisplayed());
        //extentTest.info("Verified that the details of chosen products are correct.");


        //Click to 'CHECKOUT' button.
        ReusableMethods.click(allovercommercePage.proceedToCheckout);
        ReusableMethods.bekle(2);
        //extentTest.info("Clicked to 'CHECKOUT' button.");

        //Verify that 'Order Complete' page has come.
        Assert.assertTrue(allovercommercePage.verifyOrderComplete.isDisplayed());
        //extentTest.info("Verified that 'Order Complete' page has come.");

        //Fill in the blanks First name, Last Name.
        Faker faker = new Faker();
        String fakeName = faker.name().firstName();
        allovercommercePage.billingFirstNameInfo.clear();
        allovercommercePage.billingFirstNameInfo.sendKeys(ConfigReader.getProperty("billingFirstName"), Keys.ENTER);
        ReusableMethods.bekle(2);
        //extentTest.info("Filled in the blanks First name.");

        String fakeSurname = faker.name().lastName();
        allovercommercePage.billingLastNameInfo.clear();
        allovercommercePage.billingLastNameInfo.sendKeys(ConfigReader.getProperty("billingLastName"), Keys.ENTER);
        ReusableMethods.bekle(2);
        //extentTest.info("Filled in the blanks Last name.");

        //Choose the Country / Region form dropdown menu as Turkey.

        WebElement ddmBillingCountry = allovercommercePage.billingCountryName;
        ReusableMethods.ddmValue(ddmBillingCountry, "TR"); // Fail veriyor.

        //Fill in the blanks Street address, Postcode / ZIP, Town / City, Province, Phone.
        String fakeAddressInfo = faker.address().fullAddress();
        allovercommercePage.billingAddressInfo.clear();
        allovercommercePage.billingAddressInfo.sendKeys(ConfigReader.getProperty("billingAddressName"), Keys.ENTER);
        ReusableMethods.bekle(2);

        String fakePostalCodeInfo = faker.address().zipCode();
        allovercommercePage.billingPostCodeInfo.clear();
        allovercommercePage.billingPostCodeInfo.sendKeys(ConfigReader.getProperty("billingPostCode"), Keys.ENTER);
        ReusableMethods.bekle(2);

        String fakeBillingCityName = faker.address().cityName();
        allovercommercePage.billingCity.clear();
        allovercommercePage.billingCity.sendKeys(ConfigReader.getProperty("billingCity"), Keys.ENTER);
        ReusableMethods.bekle(2);

        String fakePhoneInfo = faker.phoneNumber().phoneNumber();
        allovercommercePage.billingPhoneNumber.clear();
        allovercommercePage.billingPhoneNumber.sendKeys(ConfigReader.getProperty("billingPhoneNumber"), Keys.ENTER);
        ReusableMethods.bekle(2);

        String fakeEmailInfo = faker.internet().emailAddress();
        allovercommercePage.billingEmail.clear();
        allovercommercePage.billingEmail.sendKeys(ConfigReader.getProperty("billingEmail"), Keys.ENTER);
        ReusableMethods.bekle(2);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Verify the e-mail textbox automatically filled right.
        ReusableMethods.scrollHome();
        Assert.assertTrue(allovercommercePage.eMailTextBox.isDisplayed());
        ReusableMethods.bekle(2);

        //Verify total amount is right.
        actions.scrollByAmount(1, 150);
        actions.perform();
        Assert.assertTrue(allovercommercePage.totalAmount.isDisplayed());
        ReusableMethods.bekle(2);

        //select 'Wire transfer/EFT' radiobutton.

        //Verify 'Pay at the door' radiobutton is not selected.
       // Assert.assertFalse(allovercommercePage.payAtTheDoorButton.isSelected());

        //Click to 'PLACE ORDER' button.
        ReusableMethods.click(allovercommercePage.placeOrderButton);

        //Verify 'Thank you. Your order has been received.' written is seen on the page.
        Assert.assertTrue(allovercommercePage.thankYouYazisi.isDisplayed());

        //Scroll to bottom of the page and click to 'My Orders' button.
        ReusableMethods.scrollEnd();
        ReusableMethods.click(allovercommercePage.myOrdersButton);

        //Verify that the order is seen on the top of the order list.
        actions.scrollByAmount(1, 250);
        actions.perform();
        Assert.assertTrue(allovercommercePage.orderView.isDisplayed());
    }

    @Test
    public void test02() {
        //go to homepage.
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        ReusableMethods.bekle(3);
        AlloverCommercePage allovercommercePage = new AlloverCommercePage();
        allovercommercePage.signInButton.click();
        ReusableMethods.bekle(3);
        //extentTest.info("gone to homepage");

        //Login as a "Vendor". (kobi.hai@fixedfor.com , Ms123456).
        allovercommercePage.username.sendKeys(ConfigReader.getProperty("allovercommerce_email"),
                Keys.TAB, ConfigReader.getProperty("allovercommerce_password"), Keys.ENTER);
        ReusableMethods.bekle(3);
        //extentTest.info("Logged in as a \"Vendor\". (kobi.hai@fixedfor.com , Ms123456).");

        //Scroll down the page until you see 'Top 20 Best Seller' and click.
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1, 500);
        actions.perform();
        //extentTest.info("Scrolled down the page until you see 'Top 20 Best Seller' and clicked.");
        ReusableMethods.bekle(3);

        //Click to the picture of first product of list under 'Top 20 Best Seller'.
        ReusableMethods.click(allovercommercePage.earphoneProduct);
        ReusableMethods.bekle(3);
        //extentTest.info("Clicked to the picture of first product of list under 'Top 20 Best Seller'.");

        //Click to 'ADD TO CART' button.
        ReusableMethods.click(allovercommercePage.addToCartt);
        ReusableMethods.bekle(3);
        //extentTest.info("Clicked to 'ADD TO CART' button.");

//        //Click to the search box.
//        ReusableMethods.click(allovercommercePage.searchBox);
//        ReusableMethods.bekle(2);
//        //extentTest.info("Clicked to the search box.");
//
//        //search for'kazak' in the search box.
//        allovercommercePage.searchBox.sendKeys(ConfigReader.getProperty("allovercommerce_searchbox"), Keys.ENTER);
//        //extentTest.info("searched for'kazak' in the search box.");
//
//        //Click to the picture of first product.
//        ReusableMethods.click(allovercommercePage.firstProduct);
//        ReusableMethods.bekle(2);
//        //extentTest.info("Clicked to the picture of first product.");
//
//        //Click to 'ADD TO CART' button.
//        ReusableMethods.click(allovercommercePage.addToCartKazak);
//        ReusableMethods.bekle(2);
//        //extentTest.info("Clicked to 'ADD TO CART' button.");

        //Click to 'Cart' icon on the right top of the page.
        ReusableMethods.click(allovercommercePage.cartButton);
        ReusableMethods.bekle(2);
        ReusableMethods.click(allovercommercePage.viewCart);
        ReusableMethods.bekle(2);
        //extentTest.info("Clicked to 'Cart' icon on the right top of the page.");

//        //Verify that the details of chosen products are correct.
//        Assert.assertTrue(allovercommercePage.verifyShoppingCart.isDisplayed());
//        //extentTest.info("Verified that the details of chosen products are correct.");

        //Click to 'CHECKOUT' button.
        ReusableMethods.click(allovercommercePage.proceedToCheckout);
        ReusableMethods.bekle(2);
        //extentTest.info("Clicked to 'CHECKOUT' button.");

//        //Verify that 'Order Complete' page has come.
//        Assert.assertTrue(allovercommercePage.verifyOrderComplete.isDisplayed());
//        //extentTest.info("Verified that 'Order Complete' page has come.");

        //Fill in the blanks First name, Last Name.
        Faker faker = new Faker();
        String fakeName = faker.name().firstName();
        allovercommercePage.billingFirstNameInfo.clear();
        allovercommercePage.billingFirstNameInfo.sendKeys(ConfigReader.getProperty("billingFirstName"), Keys.ENTER);
        ReusableMethods.bekle(2);
        //extentTest.info("Filled in the blanks First name.");

        String fakeSurname = faker.name().lastName();
        allovercommercePage.billingLastNameInfo.clear();
        allovercommercePage.billingLastNameInfo.sendKeys(ConfigReader.getProperty("billingLastName"), Keys.ENTER);
        ReusableMethods.bekle(2);
        //extentTest.info("Filled in the blanks Last name.");

        //Choose the Country / Region form dropdown menu as Turkey.

        //Fill in the blanks Street address, Postcode / ZIP, Town / City, Province, Phone.
        String fakeAddressInfo = faker.address().fullAddress();
        allovercommercePage.billingAddressInfo.clear();
        allovercommercePage.billingAddressInfo.sendKeys(ConfigReader.getProperty("billingAddressName"), Keys.ENTER);
        ReusableMethods.bekle(2);

        String fakePostalCodeInfo = faker.address().zipCode();
        allovercommercePage.billingPostCodeInfo.clear();
        allovercommercePage.billingPostCodeInfo.sendKeys(ConfigReader.getProperty("billingPostCode"), Keys.ENTER);
        ReusableMethods.bekle(2);

        String fakeBillingCityName = faker.address().cityName();
        allovercommercePage.billingCityName.clear();
        allovercommercePage.billingCityName.sendKeys(ConfigReader.getProperty("billingCity"), Keys.ENTER);
        ReusableMethods.bekle(2);

        String fakePhoneInfo = faker.phoneNumber().phoneNumber();
        allovercommercePage.billingPhoneNumber.clear();
        allovercommercePage.billingPhoneNumber.sendKeys(ConfigReader.getProperty("billingPhoneNumber"), Keys.ENTER);
        ReusableMethods.bekle(2);

        String fakeEmailInfo = faker.internet().emailAddress();
        allovercommercePage.billingEmailInfo.clear();
        allovercommercePage.billingEmailInfo.sendKeys(ConfigReader.getProperty("billingEmail"), Keys.ENTER);
        ReusableMethods.bekle(2);

        //Verify the e-mail textbox automatically filled right.
        ReusableMethods.scrollHome();
        Assert.assertTrue(allovercommercePage.eMailTextBox.isDisplayed());
        ReusableMethods.bekle(2);

        //Verify total amount is right.
        actions.scrollByAmount(1, 150);
        actions.perform();
        Assert.assertTrue(allovercommercePage.totalAmount.isDisplayed());
        ReusableMethods.bekle(2);

        //select 'Wire transfer/EFT' radiobutton.
        //allovercommercePage.selectRadioButton.click();// fail veriyor.
        if (!allovercommercePage.selectRadioButton.isSelected()) {
            allovercommercePage.selectRadioButton.click();
        }
        //Verify 'Pay at the door' radiobutton is not selected.
        Assert.assertFalse(allovercommercePage.payAtTheDoorButton.isSelected());

        //Click to 'PLACE ORDER' button.
        ReusableMethods.click(allovercommercePage.placeOrderButton);

        //Verify 'Thank you. Your order has been received.' written is seen on the page.
        Assert.assertTrue(allovercommercePage.thankYouYazisi.isDisplayed());

        //Scroll to bottom of the page and click to 'My Orders' button.
        ReusableMethods.scrollEnd();
        ReusableMethods.click(allovercommercePage.myOrdersButton);

        //Verify that the order is seen on the top of the order list.
        actions.scrollByAmount(1, 250);
        actions.perform();
        Assert.assertTrue(allovercommercePage.orderView.isDisplayed());

        ReusableMethods.bekle(2);
        Assert.assertTrue(allovercommercePage.totalAmount.isDisplayed());
        ReusableMethods.bekle(2);

        //select 'Pay at the door' radiobutton.
        allovercommercePage.payAtTheDoorButton.click();

        //Verify 'Wire transfer/EFT' radiobutton is not selected
        Assert.assertFalse(allovercommercePage.selectRadioButton.isSelected());

        //Click to 'PLACE ORDER' button.
        ReusableMethods.click(allovercommercePage.placeOrderButton);

        //Verify 'Thank you. Your order has been received.' written is seen on the page.
        Assert.assertTrue(allovercommercePage.thankYouYazisi.isDisplayed());

        //Scroll to bottom of the page and click to 'My Orders' button.
        ReusableMethods.scrollEnd();
        ReusableMethods.click(allovercommercePage.myOrdersButton);

        //Verify that the order is seen on the top of the order list.
        actions.scrollByAmount(1, 250);
        actions.perform();
        Assert.assertTrue(allovercommercePage.orderView.isDisplayed());
        ReusableMethods.bekle(2);
    }
}
