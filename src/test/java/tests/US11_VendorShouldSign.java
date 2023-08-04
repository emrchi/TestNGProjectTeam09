package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class US11_VendorShouldSign extends ExtentReport {
    @Test
    public void testSaticiHesabiGiris() {
        extentTest = extentReports.createTest("Vendor Register Test",
                "Kullanıcı başarili bir şekilde satıcı kaydı oluşturabilmeli");
        //Anasayfaya git
        ReusableMethods.giris();
        extentTest.info("anasayfaya gidildi");

        //Satici hesabina giriş
        AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
        alloverCommercePage.anasayfaSignIn.click();
        alloverCommercePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB,ConfigReader.getProperty("vendorpassword"),Keys.ENTER);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        extentTest.info("Satıcı Hesabına giriş yapıldı");

        // 'My Account' yazısının göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.myAccount.isDisplayed());
        extentTest.info("My account yazısı görüldü");
        alloverCommercePage.myaccount.click();
    }

    @Test
    public void testHesabimdakiAnabasliklarGorunmeli() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));
        AlloverCommercePage sourcePage = new AlloverCommercePage();
        extentTest = extentReports.createTest("Vendor Register Test",
                "'Hesabım'daki  anabaşlıklar görünmeli");
        //Anasayfaya git
        ReusableMethods.giris();
        extentTest.info("anasayfaya gidildi");

        //Satici hesabina giriş
        AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
        alloverCommercePage.anasayfaSignIn.click();
        alloverCommercePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB, ConfigReader.getProperty("vendorpassword"), Keys.ENTER);
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(3);
        extentTest.info("Satıcı Hesabına giriş yapıldı");

        // 'My Account' yazısının göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.myAccount.isDisplayed());
        extentTest.info("My account yazısı görüldü");
        alloverCommercePage.myaccount.click();

        //'Dashboard ' yazısının görüldüğü doğrulandı
        Assert.assertTrue(alloverCommercePage.dashboard.isDisplayed());
        extentTest.info("Dashboard yazısı görüldü");

        //Dashboard'da 'Store Manager yazısının görüldüğünü doğrulayın
        Assert.assertTrue(alloverCommercePage.storeManager.isDisplayed());
        extentTest.info("Store Manager yazısı görüldü");

        //Dashboard'da Orders' ın görüldüğünü doğrula
        Assert.assertTrue(alloverCommercePage.placeOrder.isDisplayed());
        extentTest.info("Orders yazısı görüldü");

        //Dashboard da 'downloads'ın göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.downloadedselected.isDisplayed());
        extentTest.info("Downloads yazısı görüldü");

        //Dashboard da 'address' yazısının göründüğünü  doğrula
        Assert.assertTrue(alloverCommercePage.addresses.isDisplayed());
        extentTest.info("Address yazısı görüldü");

        //Dashboard da 'Account details' yazısının göründüğünü  doğrula
        Assert.assertTrue(alloverCommercePage.accountDetails.isDisplayed());
        extentTest.info("Account Details yazısı görüldü");

        //Dashboard da 'Wishlist' yazısının göründüğünü  doğrula
        Assert.assertTrue(alloverCommercePage.wishlist.isDisplayed());
        extentTest.info("Wishlist yazısı görüldü");

        //Dashboard da 'Support Tickets' yazısının göründüğünü  doğrula
        Assert.assertTrue(alloverCommercePage.supportTickets.isDisplayed());
        extentTest.info("Support Tickets yazısı göründü");

        //Dashboard da 'Followings' yazısının göründüğünü  doğrula
        Assert.assertTrue(alloverCommercePage.followings.isDisplayed());
        extentTest.info("Followings yazısı göründü");

        //Dashboard da 'Log Out' yazısının göründüğünü  doğrula
        Assert.assertTrue(alloverCommercePage.logOut.isDisplayed());
        extentTest.info("Log Out yazısı göründü");
        extentTest.info("'Hesabim' sekmesindeki anabaşliklar başarili bir sekilde görüldü. ");

    }

}