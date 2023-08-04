package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;
import static utilities.ReusableMethods.*;
public class US05_HesapBilgileriDüzenleme extends ExtentReport {
    @Test
    public void testbaşarili_giris() {
        extentTest = extentReports.createTest("Sign In Test",
                "Kullanıcı başarili bir şekilde giris yapabilmeli");
        //Anasayfaya git
        ReusableMethods.giris();
        extentTest.info("Anasayfaya gidildi");
        //Giriş yap
        ReusableMethods.signIn("userName", "userPassword");
        extentTest.info("Başarili bir giris yapildi");
    }
    @Test
    public void testHesapBilgileriDegistirme() {
        extentTest = extentReports.createTest("Hesap Bilgileri Değiştirme Testi",
                "Kullanıcı başarili bir şekilde hesap bilgilerini değiştirebilmeli");
        //Anasayfaya git
        ReusableMethods.giris();
        extentTest.info("Anasayfaya gidildi");
        //Giriş yap
        ReusableMethods.register();
        bekle(3);
        scrollEnd();
        bekle(3);
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.myaccount.click();
        extentTest.info("Siteye başarılı bir giriş yapıldı");
        //'Dashboard' yazısının göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.dashboard.isDisplayed());
        bekle(3);
        extentTest.info("Dashboard yazisi görüldü");
        //'Account Details' sayfasının göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.accountDetails.isDisplayed());
        extentTest.info("Account Details yazısı görüldü");
        // 'Account Details' e tıkla
        click(alloverCommercePage.accountDetails);
        extentTest.info("Account Details e tıklandı");
        //Firstname>Lastname>Displayname>Email için yeni değerler ata
        Faker faker=new Faker();
        String fakeFirstName=faker.name().firstName();
        String fakeLastName=faker.name().lastName();
        String fakeDisplayName=faker.name().name();
        String fakeEmail=faker.internet().emailAddress();
        alloverCommercePage.changeName.sendKeys(fakeFirstName);
        extentTest.info("Firstname başarılı bir şekilde değiştirildi");
        alloverCommercePage.changeLastName.sendKeys(fakeLastName);
        extentTest.info("Lastname başarılı bir şekilde değiştirildi");
        alloverCommercePage.displayName.sendKeys(fakeDisplayName);
        extentTest.info("Displayname başarılı bir şekilde değiştirildi");
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1,650);
        actions.perform();
        bekle(3);
        alloverCommercePage.changeEmail.clear();
        alloverCommercePage.changeEmail.sendKeys(fakeEmail);
        extentTest.info("Email adresi başarılı bir şekilde değiştirildi");
        //Biography kutusuna text gir
        alloverCommercePage.Text.click();
        alloverCommercePage.B.click();
        alloverCommercePage.biography.clear();
        alloverCommercePage.biography.sendKeys(ConfigReader.getProperty("biography"));
        extentTest.info("Biography kutusuna text girildi");
        actions.scrollByAmount(1,450);
        actions.perform();
        //Yeni password ata
        alloverCommercePage.changePasswrd1.sendKeys(ConfigReader.getProperty("kullaniciPassWord"),Keys.TAB,
                ConfigReader.getProperty("changePasswrd"),Keys.TAB,ConfigReader.getProperty("changePasswrd"),
                Keys.ENTER);
        extentTest.info("Password başarılı bir şekilde değiştirildi");
        //'Account details changed successfully' yazısının göründügünü doğrula
        Assert.assertTrue(alloverCommercePage.changeVerify.isDisplayed());
        extentTest.info("Hesap bilgileri başarılı bir şekilde değiştirildi");
    }
}