package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class US19_ShopWithCouponsAsClient  extends ExtentReport{


    @Test
    public void test01() {
        extentTest = extentReports.createTest("Shopping with coupons without login",
                "User should be able to shop as a Customer with the created Coupon");
        // Go to the page "https://allovercommerce.com/"
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("allovercommerce webpage is visited.");

        // Click SearchBox line.// Write Penapen.
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.searchBox01.sendKeys(ConfigReader.getProperty("searchForProduct"));
        extentTest.info("Penapen is written on the searchBox");

        // Click search button.
        alloverCommercePage.searchButton.click();
        ReusableMethods.bekle(3);
        extentTest.info("Search button is clicked");

        //Click second item image.
        alloverCommercePage.searchForPenapenSecondImg.click();
        extentTest.info("Second item is clicked among search result");

        //Click "Add to cart" button.
        alloverCommercePage.addToCartButton.click();
        extentTest.info("Product is added to cart");

        //Click "Cart" button.
        alloverCommercePage.cartButton.click();
        ReusableMethods.bekle(3);
        extentTest.info("Cart button is clicked");

        //Click "View cart" button.
        alloverCommercePage.viewCartButton.click();
        extentTest.info("View Cart button is clicked");

        //Two times click quantity plus(+) button.
        alloverCommercePage.plussButton.click();
        alloverCommercePage.plussButton.click();
        extentTest.info("Two times clicked on plus button to increase the quantity");

        //Click "Update cart" button.
        alloverCommercePage.updateCartButton.click();
        ReusableMethods.bekle(7);
        extentTest.info("Cart is updated by clicking to the update cart button");

        //Click "Proceed to Checkout" button.
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0,700).perform();
        ReusableMethods.click(alloverCommercePage.proceedToCheckOutButton);
        ReusableMethods.bekle(5);
        extentTest.info("Proceed to Checkout button is clicked");

        //Click "Pay at the door" button in your order menu.
        actions.scrollByAmount(0,700).perform();
        alloverCommercePage.payAtTheDoorRadioButton.click();
        extentTest.info("Pay at the door radio button is selected");

       //Click first name and write your firtname
        ReusableMethods.scroll(alloverCommercePage.billingFirstName);
        alloverCommercePage.billingFirstName.sendKeys(ConfigReader.getProperty("firstName"));
        extentTest.info("First name entered on first name filed");

       //Click last name and write your lastname
        alloverCommercePage.billingLastName.sendKeys(ConfigReader.getProperty("lastName"));
        ReusableMethods.bekle(2);
        extentTest.info("Last name entered on last name filed");

        //Click country/region.
        ReusableMethods.ddmVisibleText(alloverCommercePage.billingCountry, "Turkey");
        extentTest.info("Country is selected");

       //Click Street adress menu.//Write your adress.
        alloverCommercePage.billingStreet.sendKeys(ConfigReader.getProperty("streetAddress"));
        extentTest.info("Address is entered");

        //Click Postcode/Zip.//Write your Postcode
        alloverCommercePage.billingZipCode.sendKeys(ConfigReader.getProperty("postCode"));
        extentTest.info("Postcode is entered");

        //Click Town/City. //Write your town.
        alloverCommercePage.billingCity.sendKeys(ConfigReader.getProperty("town/city"));
        extentTest.info("Town is entered");

        //Click province. //Choose your province
        ReusableMethods.ddmVisibleText(alloverCommercePage.billingProvince, "İzmir");
        extentTest.info("Province is selected");

        //Click Phone and write your phone number
        alloverCommercePage.billingPhone.sendKeys(ConfigReader.getProperty("phone"));
        extentTest.info("Phone number is entered");

        //Click email adress and write your email adress.
        alloverCommercePage.billingEmail.sendKeys(ConfigReader.getProperty("emailAdress"));
        extentTest.info("Email is entered");

        //Click "ENTER YOUR CODE" section.
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(2);
        alloverCommercePage.billingEnterYourCodeLink.click();
        extentTest.info("ENTER YOUR CODE link is clicked");

        //Write your code.
        alloverCommercePage.billingCouponCodeField.sendKeys(ConfigReader.getProperty("couponCode"));
        extentTest.info("Code is entered");

        //Click "Apply Button"  and assert coupon applied succesfully
        alloverCommercePage.billingApplyCouponButton.click();
        Assert.assertTrue(alloverCommercePage.couponAppliedSuccessfullyText.isDisplayed());
        extentTest.info("Apply Button is clicked and coupon applied succesfully");

        //Click "Place Order" button and assert order recieved succesfully
        ReusableMethods.scroll(alloverCommercePage.billingPlaceOrderButton);
        ReusableMethods.bekle(3);
        alloverCommercePage.billingPlaceOrderButton.click();
        ReusableMethods.bekle(7);
        Assert.assertTrue(alloverCommercePage.orderRecievedSuccessfullyText.isDisplayed());
        extentTest.pass("Place Order is clicked and order recieved succesfully");

        Driver.closeDriver();
        ReusableMethods.bekle(3);

    }

    @Test
    public void test02() {
        extentTest = extentReports.createTest("Shopping with coupons as a registered customer",
                "User should be able to shop as a Customer with the created Coupon");
        //Go to the page "https://allovercommerce.com/"
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("allovercommerce webpage is visited.");

        //Click sign in button.
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.anasayfaSignIn.click();
        extentTest.info("Signin link is clicked");

        //Click username or email adress section and write your email.
        //Click password and write your password
        alloverCommercePage.username.sendKeys(ConfigReader.getProperty("signInUserName"),
                Keys.TAB, ConfigReader.getProperty("signInPassword"));
        extentTest.info("User email and password is entered");

        //Click sign in button.
        alloverCommercePage.loginButton.click();
        ReusableMethods.bekle(3);
        extentTest.info("Login button is clicked");

        //Click SearchBox line.//Write Penapen.
        alloverCommercePage.searchBox01.sendKeys(ConfigReader.getProperty("searchForProduct"));
        extentTest.info("Penapen is written on the searchBox");

        //Click search buton.
        alloverCommercePage.searchButton.click();
        ReusableMethods.bekle(3);
        extentTest.info("Search button is clicked");

        //Click second item image.
        alloverCommercePage.searchForPenapenLoginSecondImg.click();
        extentTest.info("Second item is clicked among search result");

        //Click "Add to cart" button.
        alloverCommercePage.addToCartButton.click();
        extentTest.info("Product is added to cart");

        //Click "Cart" button.
        alloverCommercePage.cartButton.click();
        ReusableMethods.bekle(3);
        extentTest.info("Cart button is clicked");

        //Click "View cart" button.
        alloverCommercePage.viewCartButton.click();
        extentTest.info("View Cart button is clicked");

        //Two times click quantity plus(+) button.
        alloverCommercePage.plussButton.click();
        alloverCommercePage.plussButton.click();
        extentTest.info("Two times clicked on plus button to increase the quantity");

        //Click "Update cart" button.
        alloverCommercePage.updateCartButton.click();
        ReusableMethods.bekle(7);
        extentTest.info("Cart is updated by clicking to the update cart button");

        //Click "Proceed to Checkout" button.
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0,700).perform();
        ReusableMethods.click(alloverCommercePage.proceedToCheckOutButton);
        ReusableMethods.bekle(5);
        extentTest.info("Proceed to Checkout button is clicked");

        //Click "Pay at the door" button in your order menu.
        actions.scrollByAmount(0,700).perform();
        alloverCommercePage.payAtTheDoorRadioButton.click();
        extentTest.info("Pay at the door radio button is selected");

        //Click first name and write your firstname
        ReusableMethods.scroll(alloverCommercePage.billingFirstName);
        alloverCommercePage.billingFirstName.clear();
        alloverCommercePage.billingFirstName.sendKeys(ConfigReader.getProperty("firstName"));
        extentTest.info("First name entered on first name filed");

        //Click last name and write your lastname
        alloverCommercePage.billingLastName.clear();
        alloverCommercePage.billingLastName.sendKeys(ConfigReader.getProperty("lastName"));
        extentTest.info("Last name entered on last name filed");

        //Click country/region.
        ReusableMethods.ddmVisibleText(alloverCommercePage.billingCountry, "Turkey");
        extentTest.info("Country is selected");

        //Click Street adress menu.//Write your adress.
        alloverCommercePage.billingStreet.clear();
        alloverCommercePage.billingStreet.sendKeys(ConfigReader.getProperty("streetAddress"));
        extentTest.info("Address is entered");

        //Click Postcode/Zip.//Write your Postcode
        alloverCommercePage.billingZipCode.clear();
        alloverCommercePage.billingZipCode.sendKeys(ConfigReader.getProperty("postCode"));
        extentTest.info("Postcode is entered");

        //Click Town/City. //Write your town.
        alloverCommercePage.billingCity.clear();
        alloverCommercePage.billingCity.sendKeys(ConfigReader.getProperty("town/city"));
        extentTest.info("Town is entered");

        //Click province. //Choose your province
        ReusableMethods.ddmVisibleText(alloverCommercePage.billingProvince, "İzmir");
        extentTest.info("Province is selected");

        //Click Phone and write your phone number
        alloverCommercePage.billingPhone.clear();
        alloverCommercePage.billingPhone.sendKeys(ConfigReader.getProperty("phone"));
        extentTest.info("Phone number is entered");

        //Click email adress and write your email adress.
        alloverCommercePage.billingEmail.clear();
        alloverCommercePage.billingEmail.sendKeys(ConfigReader.getProperty("emailAdress"));
        extentTest.info("Email is entered");

        //Click "ENTER YOUR CODE" section.
        ReusableMethods.scrollHome();
        ReusableMethods.bekle(2);
        alloverCommercePage.billingEnterYourCodeLink.click();
        ReusableMethods.bekle(2);
        extentTest.info("ENTER YOUR CODE link is clicked");

        //Write your code.
        alloverCommercePage.billingCouponCodeField.clear();
        alloverCommercePage.billingCouponCodeField.sendKeys(ConfigReader.getProperty("couponCode"));
        ReusableMethods.bekle(3);
        extentTest.info("Code is entered");

        //Click "Apply Button" and assert coupon applied succesfully
        alloverCommercePage.billingApplyCouponButton.click();
        Assert.assertTrue(alloverCommercePage.couponAppliedSuccessfullyText.isDisplayed());
        extentTest.info("Apply Button is clicked and coupon applied succesfully");

        //Click "Place Order" button and assert order recieved succesfully
        ReusableMethods.scroll(alloverCommercePage.billingPlaceOrderButton);
        ReusableMethods.bekle(3);
        alloverCommercePage.billingPlaceOrderButton.click();
        ReusableMethods.bekle(7);
        Assert.assertTrue(alloverCommercePage.orderRecievedSuccessfullyText.isDisplayed());
        extentTest.pass("Place Order is clicked and order recieved succesfully");

        Driver.closeDriver();
        ReusableMethods.bekle(3);

    }
}
