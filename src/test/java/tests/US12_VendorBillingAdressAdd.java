package tests;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.C;
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

import static utilities.ReusableMethods.scrollEnd;

public class US12_VendorBillingAdressAdd extends ExtentReport {
    @Test
    public void testFaturaAdresiEkleme() {


        extentTest = extentReports.createTest("Fatura adresi ekleme", "Vendor olarak ürün ekleme testi");
        //Anasayfaya git
        ReusableMethods.giris();
        extentTest.info("Anasayfaya gidildi");

        //Kayıtlı satıcı hesabına giriş yap
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.anasayfaSignIn.click();
        alloverCommercePage.username.sendKeys(ConfigReader.getProperty("saticiMail"),
                Keys.TAB, ConfigReader.getProperty("saticiPassword"));
        alloverCommercePage.loginButton.click();
        ReusableMethods.bekle(3);
        scrollEnd();
        ReusableMethods.bekle(3);
        extentTest.info("Vendor olarak Giriş Yapıldı.");

        //Click on “My Account” button
        ReusableMethods.click(alloverCommercePage.anaSayfaMyAccount);
        extentTest.info("“My Account” butonuna tıklandı.");

        //Click on “Addresses" button
        alloverCommercePage.addresses.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1,250);
        actions.perform();
        extentTest.info("“Addresses” bbutonuna tıklandı.");

        //Click on “ADD” button below “Billing Address"
        alloverCommercePage.billingAddressAdd.click();
        actions.scrollByAmount(1,650);
        actions.perform();
        extentTest.info("“Add” butonuna tıklandı.");

        //Enter Street Adress in street address field
        Faker faker=new Faker();
        String street=faker.address().streetAddress();
        alloverCommercePage.billingStreet.clear();
        alloverCommercePage.billingStreet.sendKeys(street);
        extentTest.info("“Street Address” bilgileri eklendi");

        //Enter Town/City in town/city field
        alloverCommercePage.billingCity.clear();
        String city=faker.address().cityName();
        alloverCommercePage.billingCity.sendKeys(city);
        extentTest.info("“Town/City” bilgileri eklendi");

        //Enter PostCode/ZIP in postcode/zip field
        alloverCommercePage.billingZipCode.clear();
        String zipCode=faker.address().zipCode();
        alloverCommercePage.billingZipCode.sendKeys(zipCode);
        extentTest.info("“PostCode/ZIP” bilgileri eklendi");

        //Enter Phone Number in phone number field
        alloverCommercePage.billingPhone.clear();
        String phone=faker.phoneNumber().cellPhone();
        alloverCommercePage.billingPhone.sendKeys(phone);
        alloverCommercePage.saveAddress.click();
        extentTest.info("“Phone Number” bilgileri eklendi");

        //'Adress changed successfully' yazısının göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.adressVerifyText.isDisplayed());
        extentTest.info("'Adres başarılı bir şekilde değiştirildi' yazısı görüldü");
        extentTest.info("Fatura adresi basarili bir sekilde eklendi.");

    }
}