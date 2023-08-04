package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

public class US09_VendorRegistration extends ExtentReport {

    @Test
    public void vendorKaydi() {
        extentTest = extentReports.createTest("testng","Başarılı Vendor Kaydı");

        // Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Anasayfaya başarılı bir şekilde gidildi");

        // Register butonuna tıkla
        AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
        alloverCommercePage.register.click();
        extentTest.info("Register butonuna tıklandı");

        // "Become a vendor" butonuna tıkla
        alloverCommercePage.signUpAsVendor.click();
        extentTest.info("Sign up as a vendor sayfasına gidildi");

        // Email gir
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1,250);
        actions.perform();
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        alloverCommercePage.fakeMailCopy.click();
        ReusableMethods.switchToWindow(0);
        alloverCommercePage.email.sendKeys(Keys.CONTROL,"v");
        alloverCommercePage.email.sendKeys(Keys.TAB);
        ReusableMethods.bekle(8);
        extentTest.info("Daha öncesinde kayıt yapılmamış bir email adresi girildi");

        // Verification code sent to your email: görünürlüğünü doğrula
        Assert.assertTrue(alloverCommercePage.codeSentMessage.isDisplayed());
        extentTest.info("Verification code'un email adresine ulaştığı doğrulandı");

       // Büyük- küçük harf,rakam ve special karakter içeren Password gir
        alloverCommercePage.password.sendKeys(ConfigReader.getProperty("strongSifre"));
        extentTest.info("Güçlü seviyesine uygun bir şifre girildi");

        // Confirm password gir
        alloverCommercePage.confirmPassword.sendKeys(ConfigReader.getProperty("strongSifre"));
        extentTest.info("Aynı şifre 'confirm password' alanına girildi");

        // Emaile gönderilen kodu re-send code yap ve verification code alanına gir
        alloverCommercePage.resendCode.click();
        ReusableMethods.window(1);
        ReusableMethods.bekle(5);
        ReusableMethods.refresh(Driver.getDriver());
        alloverCommercePage.mailVerificationCode.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().frame(alloverCommercePage.iframeFakeMail);
        actions.doubleClick().doubleClick(alloverCommercePage.verificationCode).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").release().perform();
        ReusableMethods.bekle(5);
        ReusableMethods.window(0);
        alloverCommercePage.verificationCodeAlani.click();
        actions.keyDown(Keys.CONTROL).sendKeys("v").perform();
        extentTest.info("Email adresine ulaşan code, verification code alanına girildi");

        // Register'a tıklayarak kaydı tamamla
        alloverCommercePage.registerFinalButton.click();
        extentTest.info("Register butonuna tıklandı ve kayıt tamamlandı");

        // Register succesfull completed mesajını gördüğünü doğrula
        Assert.assertTrue(alloverCommercePage.registrationSuccessful.isDisplayed());
        extentTest.info("'Register succesfull completed' mesajı görüntülendi");

        // Welcome to Allover Commerce! Not Right Now'a tıkla
        ReusableMethods.bekle(5);
        alloverCommercePage.notRightNowButton.click();
        ReusableMethods.switchToWindow(2);

        // Sign out butonuna tıkla
        alloverCommercePage.signOutButton.click();
        ReusableMethods.switchToWindow(3);

        // Are you sure you want to log out? Confirm and log out çıkış yap
        alloverCommercePage.confirmAndLogOut.click();
        ReusableMethods.bekle(5);
        ReusableMethods.switchToWindow(4);
        extentTest.info("Başarılı bir şekilde hesaptan çıkış yapıldı");

        Driver.quitDriver();
        extentTest.pass("Başarılı kayıt ve çıkış yapıldıktan sonra sayfa kapatıldı");

    }

    @Test
    public void ayniEmailKayitOlmama() {

        extentTest = extentReports.createTest("testng","Aynı Email Adresi ile Tekrar Kayıt Olamama");

        // Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        extentTest.info("Başarılı bir şekilde anasayfaya gidildi");

        // Register butonuna tıkla
        AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
        alloverCommercePage.register.click();
        extentTest.info("Register butonuna tıklandı");

        // "Become a vendor" butonuna tıkla
        alloverCommercePage.signUpAsVendor.click();
        extentTest.info("Vendor olarak kayıt olacağımız sayfaya başarılı bir şekilde ulaşıldı");

        // Email gir
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1,350);
        actions.perform();
        // Kayıtlı email'i gir
        ReusableMethods.bekle(2);
        alloverCommercePage.email.sendKeys(ConfigReader.getProperty("kayitliEmail"),Keys.TAB);
        ReusableMethods.bekle(8);
        extentTest.info("Zaten kayıtlı olan email adresi girildi");

        // Emaile gönderilen kodu re-send code yap
        alloverCommercePage.verificationCodeAlani.sendKeys(ConfigReader.getProperty("verificationCode"));
        extentTest.info("Email adresine gelen kod 'verification code' alanına girildi");

        // Password gir
        alloverCommercePage.password.sendKeys(ConfigReader.getProperty("strongSifre"));
        extentTest.info("Güçlü seviyesine uygun bir şifre girildi");

        // Confirm password gir
        alloverCommercePage.confirmPassword.sendKeys(ConfigReader.getProperty("strongSifre"));
        extentTest.info("Aynı şifre 'confirm password' alanına girildi");

        // Register butonuna tıkla
        alloverCommercePage.registerFinalButton.click();
        ReusableMethods.bekle(5);
        extentTest.info("Register butonuna tıklandı");
        // "This Email already exists. Please login to the site and apply as vendor." mesajının göründüğünü doğrula.
        Assert.assertTrue(alloverCommercePage.alreadyRegisteredMessage.isDisplayed());
        extentTest.pass("'This Email already exists. Please login to the site and apply as vendor.' mesajı görüntülendi");
        Driver.quitDriver();
        extentTest.pass("Zaten kayıtlı olan email ile kayıt yapılamadı, sayfa kapatıldı");

    }
}
