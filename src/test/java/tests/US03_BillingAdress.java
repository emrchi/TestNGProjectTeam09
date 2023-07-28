package tests;

import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.signIn;

public class US03_BillingAdress extends ExtentReport{
    @Test
    public void TC01() {
        AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
        extentTest=extentReports.createTest("tradylinn sitesine girme","urun test");

        //Go to home page
        ReusableMethods.giris();
        extentTest.info("allovercommerce anasayfasina gidildi.");


        //Navigate to “Sign in” page
        //Sign in
        ReusableMethods.signIn(ConfigReader.getProperty("kullaniciUserName"),ConfigReader.getProperty("kullaniciPassWord"));

        //Click on “My Account” button
        alloverCommercePage.myAccount.click();

        //Click on “Addresses" button
        //Click on “ADD” button below “Billing Address"
        //Leave “First Name” field blank
        //Enter “Last Name” in the last name field
        //Select Country/Region
        //Enter Street Adress in street adress field
        //Enter PostCode/ZIP in postcode/zip field
        //Enter Town/City in town/city field
        //Select State
        //Enter Phone Number in phone number field
        //Click on “Save Address” button
        //See “First Name is a required field” message
        //Click on “Addresses" button
        //Verify that address is not added below “Billing Address” section




    }
}
