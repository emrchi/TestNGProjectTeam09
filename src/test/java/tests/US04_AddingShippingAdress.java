package tests;

import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class US04_AddingShippingAdress extends ExtentReport {

    public static AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
    @Test
    public void TC01() {
        extentTest = extentReports.createTest("Shipping Address Negative Adding Test",
                "Inability to add a shipping address with blank “First Name” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.shippingAddressAdd("blank","surname","United States (US)","street",
                "city","Louisiana","zipCode");

        //Verify that address is not added below “Shipping Address” section
        ReusableMethods.negativeVerify("First Name");
    }
    @Test
    public void TC02() {
        extentTest = extentReports.createTest("Shipping Address Negative Adding Test",
                "Inability to add a shipping address with blank “Last Name” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.shippingAddressAdd("name","blank","United States (US)","street",
                "city","Louisiana","zipCode");

        //Verify that address is not added below “Shipping Address” section
        ReusableMethods.negativeVerify("Last Name");
    }
    @Test
    public void TC03() {
        extentTest = extentReports.createTest("Shipping Address Negative Adding Test",
                "Inability to add a shipping address with blank “Country/Region” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.shippingAddressAdd("name","surname","Select a country / region…","street",
                "city","Louisiana","zipCode");

        //Verify that address is not added below “Shipping Address” section
        ReusableMethods.negativeVerify("Country/Region");
    }
    @Test
    public void TC04() {
        extentTest = extentReports.createTest("Shipping Address Negative Adding Test",
                "Inability to add a shipping address with blank “Street Address” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.shippingAddressAdd("name","surname","United States (US)","blank",
                "city","Louisiana","zipCode");

        //Verify that address is not added below “Shipping Address” section
        ReusableMethods.negativeVerify("Street Address");
    }
    @Test
    public void TC05() {
        extentTest = extentReports.createTest("Shipping Address Negative Adding Test",
                "Inability to add a shipping address with blank “Zip Code” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.shippingAddressAdd("name","surname","United States (US)","street",
                "city","Louisiana","blank");

        //Verify that address is not added below “Shipping Address” section
        ReusableMethods.negativeVerify("Zip Code");
    }
    @Test
    public void TC06() {
        extentTest = extentReports.createTest("Shipping Address Negative Adding Test",
                "Inability to add a shipping address with blank “Town/City” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.shippingAddressAdd("name","surname","United States (US)","street",
                "blank","Louisiana","zipCode");

        //Verify that address is not added below “Shipping Address” section
        ReusableMethods.negativeVerify("Town/City");
    }
    @Test
    public void TC07(){
        extentTest = extentReports.createTest("Shipping Address Negative Adding Test",
                "Inability to add a shipping address with blank “State” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.shippingAddressAdd("name","surname","United States (US)","street",
                "city","Select an option…","zipCode");

        //Verify that address is not added below “Shipping Address” section
        ReusableMethods.negativeVerify("State");
    }
    @Test
    public void TC08() {
        extentTest = extentReports.createTest("Shipping Address Adding Test",
                "Adding a user shipping address (Invoice Address)");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.shippingAddressAdd("name","surname","United States (US)","street",
                "city","Louisiana","zipCode");

        //Verify that the address is successfully registered
        ReusableMethods.pozitiveVerify();
    }
}
