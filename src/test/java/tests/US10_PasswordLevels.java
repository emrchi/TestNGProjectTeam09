package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US10_PasswordLevels {

    @Test
    public void passwordLevels() {
        // Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));

        // Register butonuna tıkla
        AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
        alloverCommercePage.register.click();

        // "Signup as a vendor" tıkla
        alloverCommercePage.signUpAsVendor.click();

        // Kayıtlı mail adresini gir
        alloverCommercePage.email.sendKeys(ConfigReader.getProperty("kayitliMail"));
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1,250);
        actions.perform();

        // Kullanıcı 5 karakterden kısa hem harf hem sayı girmelidir
        alloverCommercePage.password.sendKeys(ConfigReader.getProperty("tooShortSifre"));
        ReusableMethods.bekle(2);
        // "too short" seviyesinin görüntülendiğini doğrula
        Assert.assertTrue(alloverCommercePage.tooShort.isDisplayed());

        alloverCommercePage.password.clear();
        // Kullanıcı 5 karakterden uzun hem sayı hem harf girmelidir
        alloverCommercePage.password.sendKeys(ConfigReader.getProperty("weakSifre"));
        // "weak" seviyesinin görüntülendiğini doğrula
        Assert.assertTrue(alloverCommercePage.weak.isDisplayed());

        alloverCommercePage.password.clear();
        // Kullanıcı 7 karakterden uzun hem sayı hem harf girmelidir
        alloverCommercePage.password.sendKeys(ConfigReader.getProperty("goodSifre"));
        // "good" seviyesinin görüntülendiğini doğrula
        Assert.assertTrue(alloverCommercePage.good.isDisplayed());

        alloverCommercePage.password.clear();
        // Kullanıcı büyük-küçük harf, rakam ve sayıları içeren şifreyi girmelidir.
        alloverCommercePage.password.sendKeys(ConfigReader.getProperty("strongSifre"));
        // "strong" seviyesinin görüntülendiğini doğrula
        Assert.assertTrue(alloverCommercePage.strong.isDisplayed());

    }
}
