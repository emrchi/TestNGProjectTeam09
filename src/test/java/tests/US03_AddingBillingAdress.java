package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.ExtentReport;

public class US03_AddingBillingAdress extends ExtentReport {

    @Test
    public void TC01() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
                "Inability to add a billing address with blank “First Name” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.billingAddressAdd("blank","surname","United States (US)","street",
                                          "city","Louisiana","zipCode","phone");

        //Verify that address is not added below “Billing Address” section
        ReusableMethods.negativeVerify("First Name");
    }
    @Test
    public void TC02() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
                "Inability to add a billing address with blank “Last Name” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.billingAddressAdd("name","blank","United States (US)","street",
                "city","Louisiana","zipCode","phone");

        //Verify that address is not added below “Billing Address” section
        ReusableMethods.negativeVerify("Last Name");
    }
    @Test
    public void TC03() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
              "Inability to add a billing address with blank Country/Region field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.billingAddressAdd("name","surname","Select a country / region…","street",
                "city","Louisiana","zipCode","phone");

        //Verify that address is not added below “Billing Address” section
        ReusableMethods.negativeVerify("Country/Region");
    }

    @Test
    public void TC04() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
                "Inability to add a billing address with blank “Street Address” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.billingAddressAdd("name","surname","United States (US)","blank",
                "city","Louisiana","zipCode","phone");

        //Verify that address is not added below “Billing Address” section
        ReusableMethods.negativeVerify("Street Address");
    }

    @Test
    public void TC05() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
                "Inability to add a billing address with blank “Zip Code” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.billingAddressAdd("name","surname","United States (US)","street",
                "city","Louisiana","blank","phone");

        //Verify that address is not added below “Billing Address” section
        ReusableMethods.negativeVerify("Zip Code");
    }

    @Test
    public void TC06() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
                "Inability to add a billing address with blank “Town/City” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.billingAddressAdd("name","surname","United States (US)","street",
                "blank","Louisiana","zipCode","phone");

        //Verify that address is not added below “Billing Address” section
        ReusableMethods.negativeVerify("Town/City");
    }

    @Test
    public void TC07() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
                "Inability to add a billing address with blank “State” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.billingAddressAdd("name","surname","United States (US)","street",
                "city","Select an option…","zipCode","phone");

        //Verify that address is not added below “Billing Address” section
        ReusableMethods.negativeVerify("State");
    }

    @Test
    public void TC08() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
                "Inability to add a billing address with blank “Phone” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.billingAddressAdd("name","surname","United States (US)","street",
                "city","Louisiana","zipCode","blank");

        //Verify that address is not added below “Billing Address” section
        ReusableMethods.negativeVerify("Phone");
    }

    @Test
    public void TC09() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
                "Inability to add a billing address with  alphabetic data in the “Phone” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.billingAddressAdd("name","surname","United States (US)","street",
                "city","Louisiana","zipCode","alphabeticPhone");

        //Verify that address is not added below “Billing Address” section
        ReusableMethods.negativeVerify("phone");
    }

    @Test
    public void TC10() {
        extentTest = extentReports.createTest("Billing Address Negative Adding Test",
                "Inability to add a billing address with  alphabetic data in the “Phone” field");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");

        //Fill the Billing Addresses data's
        ReusableMethods.billingAddressAdd("name","surname","United States (US)","street",
                "city","Louisiana","zipCode","sembolPhone");

        //Verify that address is not added below “Billing Address” section
        ReusableMethods.negativeVerify("phone");
    }

    @Test
    public void TC11() {
        extentTest = extentReports.createTest("Billing Address Adding Test",
                "Adding a user billing address (Invoice Address)");

        //Go to home page
        ReusableMethods.giris();

        //Navigate to “Sign in” page and Sign in
        ReusableMethods.signIn("userName", "userPassword");



        //Fill the Billing Addresses data's
        ReusableMethods.billingAddressAdd("name","surname","United States (US)","street",
                "city","Louisiana","zipCode","phone");

        //Email address; It should come automatically as the registered e-mail address
        AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
        String email = alloverCommercePage.billingEmail.getAttribute("value");
        Assert.assertEquals(email, ConfigReader.getProperty("userEmail"));
        ReusableMethods.bekle(5);

        //Verify that the address is successfully registered
        ReusableMethods.pozitiveVerify();
        //Verify that the address is successfully registered
        ReusableMethods.pozitiveVerify();
    }
}

