package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class US10_PasswordLevels extends ExtentReport {

    @Test
    public void passwordLevels() {
        extentTest = extentReports.createTest("testng","Password Seviyelerinin Görüntülenebilmesi");

        // Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Anasayfaya başarılı bir şekilde gidildi");

        // Register butonuna tıkla
        AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
        alloverCommercePage.register.click();
        extentTest.info("Register butonuna tıklandı");

        // "Signup as a vendor" tıkla
        alloverCommercePage.signUpAsVendor.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1,250);
        actions.perform();
        extentTest.info("Sign up as a vendor sayfasına gidildi");

        // Kayıtlı mail adresini gir
        alloverCommercePage.email.sendKeys(ConfigReader.getProperty("kayitliEmail"));
        extentTest.info("Email alanına email adresi girildi");

        // Kullanıcı 5 karakterden kısa hem harf hem sayı girmelidir
        alloverCommercePage.password.sendKeys(ConfigReader.getProperty("tooShortSifre"));
        ReusableMethods.bekle(2);
        // "too short" seviyesinin görüntülendiğini doğrula
        Assert.assertTrue(alloverCommercePage.tooShort.isDisplayed());
        extentTest.info("too short seviyesi görüntülendi");

        alloverCommercePage.password.clear();
        // Kullanıcı 5 karakterden uzun hem sayı hem harf girmelidir
        alloverCommercePage.password.sendKeys(ConfigReader.getProperty("weakSifre"));
        // "weak" seviyesinin görüntülendiğini doğrula
        Assert.assertTrue(alloverCommercePage.weak.isDisplayed());
        extentTest.info("weak seviyesi görüntülendi");

        alloverCommercePage.password.clear();
        // Kullanıcı 7 karakterden uzun hem sayı hem harf girmelidir
        alloverCommercePage.password.sendKeys(ConfigReader.getProperty("goodSifre"));
        // "good" seviyesinin görüntülendiğini doğrula
        Assert.assertTrue(alloverCommercePage.good.isDisplayed());
        extentTest.info("good seviyesi görüntülendi");

        alloverCommercePage.password.clear();
        // Kullanıcı büyük-küçük harf, rakam ve sayıları içeren şifreyi girmelidir.
        alloverCommercePage.password.sendKeys(ConfigReader.getProperty("strongSifre"));
        // "strong" seviyesinin görüntülendiğini doğrula
        Assert.assertTrue(alloverCommercePage.strong.isDisplayed());
        extentTest.info("strong seviyesi görüntülendi");

        Driver.quitDriver();
        extentTest.pass("Bütün seviyelerin görüntülendiği doğrulandı");
        extentTest.pass("Sayfa kapatıldı");
    }
}
