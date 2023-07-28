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
        public void faker() {
            Faker faker=new Faker();
            Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
            AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
            alloverCommercePage.anasayfaRegister.click();
            ReusableMethods.bekle(3);
            alloverCommercePage.signUpUsername.sendKeys(faker.name().firstName());
                   // Keys.TAB,alloverCommercePage.signUpEmail.sendKeys(faker.name().);
    }

    @Test
    public void test01() throws InterruptedException {
        //Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        //Register butonunu tıkla
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.anasayfaRegister.click();
        ReusableMethods.bekle(3);
        //Username>email>Password>I agree to textini seç>SIGN UP ile onayla
        alloverCommercePage.signUpUsername.sendKeys(ConfigReader.getProperty("kullaniciUserName"),
                Keys.TAB,ConfigReader.getProperty("kullaniciEmail"),
                Keys.TAB,ConfigReader.getProperty("kullaniciPassWord"),Keys.ENTER);
        alloverCommercePage.IagreeToText.click();
        alloverCommercePage.SignUpOnay.click();
        Driver.closeDriver();
        //Sign Out yazısının göründüğünü doğrula
       // Assert.assertTrue(alloverCommercePage.verify.isDisplayed());




    }
}
