package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;


public class US01_KullanıcıKayıtOlma extends ExtentReport {



    @Test
    public void testRegister() throws InterruptedException {
        extentTest = extentReports.createTest("Register Test",
                "Kullanıcı başarili bir şekilde kayit olmali");

        //Anasayfaya git
        ReusableMethods.giris();
        //Kullanici kaydi oluştur
        ReusableMethods.register();
        //Sign Out yazısının göründüğünü doğrula
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        Assert.assertTrue(alloverCommercePage.verify.isDisplayed());
        extentTest.info("Sign Out Yazisinin görüldüğü doğrulandı");

    }
    @Test
    public void testFailToRegister() {
        //*****'I agree to the privacy policy' textini işaretlemeden kayıt olamama *******
        extentTest = extentReports.createTest("Register Test",
                "Kullanıcı başarili bir şekilde kayit olmali");

        //Anasayfaya git
        ReusableMethods.giris();
        extentTest.info("Anasayfaya gidildi.");

        //Register butonunu tıkla
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.anasayfaRegister.click();
        ReusableMethods.bekle(3);
        extentTest.info("Register butonuna tiklandi.");

        //Username>email>Password bilgilerini gir
        Faker faker=new Faker();
        String fakeUserName=faker.name().username();
        String fakeEmail=faker.internet().emailAddress();
        alloverCommercePage.fakeUserName.sendKeys(fakeUserName);
        alloverCommercePage.fakeEmail.sendKeys(fakeEmail);
        alloverCommercePage.signUpPassword.sendKeys(ConfigReader.getProperty("kullaniciPassWord"));
        extentTest.info("Hesap bilgileri girildi.");

        //'I agree to the privacy policy' uyarı kutusunun seçili olmadığını doğrula
        Assert.assertFalse(alloverCommercePage.IagreeToText.isSelected());
        alloverCommercePage.SignUpOnay.click();
        ReusableMethods.bekle(5);
        extentTest.info("'Gizlilik politikasını kabul ediyorum.' kutusunun seçili olmadığı doğrulandı");

        //İlerlemek istiyorsanız lütfen kutuyu işaretleyin mesajını göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.IagreeToText.isDisplayed());
        extentTest.info("Ilerlemek istiyorsaniz lütfen kutuyu isaretleyin mesajinin goründüğünü doğrula");

        //'I agree to ..' textini seç
        alloverCommercePage.IagreeToText.click();
        alloverCommercePage.SignUpOnay.click();
        extentTest.info("Gizlilik politikasını kabul ediyorum'yazısı seçildi");

        //Başarılı bir kayıt yapıldığını doğrula
        Assert.assertTrue(alloverCommercePage.myaccount.isDisplayed());
        extentTest.info("Başarili bir kullanici kaydi olusturuldu.");




    }
}
