package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;


public class US01_KullanıcıKayıtOlma {




    @Test
    public void testSiteyeLoginOlma() throws InterruptedException {


        //Go to home page



        //Register butonunu tıkla
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.anasayfaRegister.click();
        ReusableMethods.bekle(3);
        //Username>email>Password>I agree to textini seç>SIGN UP ile onayla
        Faker faker=new Faker();
        String fakeUserName=faker.name().username();
        String fakeEmail=faker.internet().emailAddress();
        alloverCommercePage.fakeUserName.sendKeys(fakeUserName);
        alloverCommercePage.fakeEmail.sendKeys(fakeEmail);
        alloverCommercePage.signUpPassword.sendKeys(ConfigReader.getProperty("kullaniciPassWord"));
        alloverCommercePage.IagreeToText.click();
        alloverCommercePage.SignUpOnay.click();
        //Sign Out yazısının göründüğünü doğrula
       Assert.assertTrue(alloverCommercePage.verify.isDisplayed());
       Driver.closeDriver();


    }

    @Test
    public void testEksikIslemleLoginOlamama() {
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
        alloverCommercePage.SignUpOnay.click();
        ReusableMethods.bekle(5);
        //İlerlemek istiyorsanız lütfen kutuyu işaretleyin mesajını göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.IagreeToText.isDisplayed());
        Driver.closeDriver();


    }
}
