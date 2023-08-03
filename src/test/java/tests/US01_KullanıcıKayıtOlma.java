package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import java.security.Key;


public class US01_KullanıcıKayıtOlma extends ExtentReport {



    @Test
    public void testRegister() throws InterruptedException {
        //Anasayfaya git
        ReusableMethods.giris();

        //Kullanici kaydi oluştur
        ReusableMethods.register();
        //Sign Out yazısının göründüğünü doğrula
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        Assert.assertTrue(alloverCommercePage.verify.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void testFailToRegister() {
        //*****'I agree to the privacy policy' textini işaretlemeden kayıt olamama *******
        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Register butonunu tıkla
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.anasayfaRegister.click();
        ReusableMethods.bekle(3);
        //Username>email>Password>SIGN UP ile onayla
        Faker faker=new Faker();
        String fakeUserName=faker.name().username();
        String fakeEmail=faker.internet().emailAddress();
        alloverCommercePage.fakeUserName.sendKeys(fakeUserName);
        alloverCommercePage.fakeEmail.sendKeys(fakeEmail);
        alloverCommercePage.signUpPassword.sendKeys(ConfigReader.getProperty("kullaniciPassWord"));
        //'I agree to the privacy policy' uyarı kutusunun seçili olmadığını doğrula
        Assert.assertFalse(alloverCommercePage.IagreeToText.isSelected());
        alloverCommercePage.SignUpOnay.click();
        ReusableMethods.bekle(5);
        //İlerlemek istiyorsanız lütfen kutuyu işaretleyin mesajını göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.IagreeToText.isDisplayed());
        Driver.closeDriver();


    }
}
