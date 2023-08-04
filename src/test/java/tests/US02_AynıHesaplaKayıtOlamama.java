package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;



public class US02_AynıHesaplaKayıtOlamama extends ExtentReport {
    @Test
    public void testUnableToRegisterWithRegisteredUserName() {
        extentTest = extentReports.createTest("Gecersiz kullanici adi ile kayit olamama.",
                "Kullanici kayit olustururken hata almalı.");
        // Anasayfaya git
        ReusableMethods.giris();
        extentTest.info("Anasayfaya gidildi");

        //Register butonunu tıkla
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.anasayfaRegister.click();
        ReusableMethods.bekle(3);
        extentTest.info("Register butonuna tiklandi.");

        //Kayıtlı Username>Geçerli email>GeçerliPassword>SIGN UP ile onayla
        Faker faker=new Faker();
        String fakeUserName=faker.name().username();
        String fakeEmail=faker.internet().emailAddress();
        alloverCommercePage.kayitliUserName.sendKeys(ConfigReader.getProperty("kullaniciUserName"));
        alloverCommercePage.fakeEmail.sendKeys(fakeEmail);
        alloverCommercePage.signUpPassword.sendKeys(ConfigReader.getProperty("kullaniciPassWord"));
        extentTest.info("Hesap bilgilerine kayitli kullanici adi girildi");

        //"I agree to the privacy policy" kutucuğuna tıkla
        alloverCommercePage.IagreeToText.click();
        alloverCommercePage.SignUpOnay.click();
        extentTest.info("'Güvenlik politikasını kabul ediyorum.' yazisi tiklandi");

        // "An account is already registered with your email address."mesajı göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.negativeVerify.isDisplayed());
        extentTest.info("An account is already registered with your email address mesaji görüldü");
        extentTest.info("Başarili bir kayit işlemi gerçekleştirilemedi");

    }

    @Test
    public void testUnableToRegisterWithRegisteredEmail() {
        extentTest = extentReports.createTest("gecersiz email ile kayit olamama",
                "Kullanıcı kayit olustururken hata almalı");

        // Anasayfaya git
        ReusableMethods.giris();
        extentTest.info("Anasayfaya gidildi");

        //Register butonunu tıkla
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.anasayfaRegister.click();
        ReusableMethods.bekle(3);
        extentTest.info("'Register' butonuna tiklandi.");

        //Geçerli Username>Kayıtlı email>GeçerliPassword>SIGN UP ile onayla
        Faker faker=new Faker();
        String fakeUserName=faker.name().username();
        String fakeEmail=faker.internet().emailAddress();
        alloverCommercePage.fakeUserName.sendKeys(fakeUserName);
        alloverCommercePage.kayitliEmail.sendKeys(ConfigReader.getProperty("kullaniciEmail"));
        alloverCommercePage.signUpPassword.sendKeys(ConfigReader.getProperty("kullaniciPassWord"));
        extentTest.info("Hesap bilgilerine kayitli email adresi girildi");

        //"I agree to the privacy policy" kutucuğuna tıkla
        alloverCommercePage.IagreeToText.click();
        extentTest.info("'Güvenlik politikasını kabul ediyorum.' yazisi tiklandi");
        //Kayit ol butonuna tikla
        alloverCommercePage.SignUpOnay.click();
        extentTest.info("'Kayit ol' butonuna tiklandi.");

        // "An account is already registered with your email address."mesajı göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.negativeVerify.isDisplayed());
        extentTest.info("An account is already registered with your email address'yazısı görüldü");
        extentTest.info("Başarili bir kayit işlemi gerçekleştirilemedi");
    }
}
