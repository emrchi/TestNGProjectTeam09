package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US02_AynıHesaplaKayıtOlamama {
    @Test
    public void testUnableToRegisterWithRegisteredUserName() {
        // Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Register butonunu tıkla
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.anasayfaRegister.click();
        ReusableMethods.bekle(3);
        //Kayıtlı Username>Geçerli email>GeçerliPassword>SIGN UP ile onayla
        Faker faker=new Faker();
        String fakeUserName=faker.name().username();
        String fakeEmail=faker.internet().emailAddress();
        alloverCommercePage.kayitliUserName.sendKeys(ConfigReader.getProperty("kullaniciUserName"));
        alloverCommercePage.fakeEmail.sendKeys(fakeEmail);
        alloverCommercePage.signUpPassword.sendKeys(ConfigReader.getProperty("kullaniciPassWord"));
        //"I agree to the privacy policy" kutucuğuna tıkla
        alloverCommercePage.IagreeToText.click();
        alloverCommercePage.SignUpOnay.click();
        // "An account is already registered with your email address."mesajı göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.negativeVerify.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void testUnableToRegisterWithRegisteredEmail() {
        // Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Register butonunu tıkla
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.anasayfaRegister.click();
        ReusableMethods.bekle(3);
        //Geçerli Username>Kayıtlı email>GeçerliPassword>SIGN UP ile onayla
        Faker faker=new Faker();
        String fakeUserName=faker.name().username();
        String fakeEmail=faker.internet().emailAddress();
        alloverCommercePage.fakeUserName.sendKeys(fakeUserName);
        alloverCommercePage.kayitliEmail.sendKeys(ConfigReader.getProperty("kullaniciEmail"));
        alloverCommercePage.signUpPassword.sendKeys(ConfigReader.getProperty("kullaniciPassWord"));
        //"I agree to the privacy policy" kutucuğuna tıkla
        alloverCommercePage.IagreeToText.click();
        alloverCommercePage.SignUpOnay.click();
        // "An account is already registered with your email address."mesajı göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.negativeVerify.isDisplayed());
    }
}
