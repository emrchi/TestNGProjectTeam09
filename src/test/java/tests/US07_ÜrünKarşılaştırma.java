package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US07_ÜrünKarşılaştırma {
    @Test
    public void test01() {

     // 1- Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));

     //  2- Login ol
        AlloverCommercePage page = new AlloverCommercePage();
        page.anasayfaSignIn.click();
        page.signupUpUserName.sendKeys(ConfigReader.getProperty("userName"),Keys.TAB,
                ConfigReader.getProperty("userPassword"),Keys.TAB,Keys.SPACE,Keys.TAB,Keys.ENTER);
     //  3- Arama alanına aranacak ürünü yaz
     //  4- Ara ikonuna tıkla
        page.aramaKutusu.sendKeys("kazak",Keys.ENTER);
        ReusableMethods.bekle(2);
        ReusableMethods.scrollEnd();
        ReusableMethods.scrollHome();

     //  5- Listelenen ürünlerden ilkinin üzerindeki compare ikonuna tıkla
        page.ilkUrunCompareIkonu.click();
        ReusableMethods.scrollEnd();
        ReusableMethods.scrollHome();

     // 6- Compare Products bölümüne eklendiğini doğrula
        Assert.assertTrue(page.eklendiVerify1.isDisplayed());
        ReusableMethods.bekle(2);

     //  7- Compare products alanı dışında boş bir alana tıkla
       // page.boşBirAlan.click();
       // ReusableMethods.bekle(2);

     //  8- Listelenen ürünlerden ikincisinin üzerindeki compare ikonunu seç
        page.ikinciUrunCompareIkonu.click();
        ReusableMethods.scrollEnd();
        ReusableMethods.scrollHome();

     //  9- Compare Products bölümüne eklendiğini doğrula
        Assert.assertTrue(page.eklendiVerify2.isDisplayed());
        ReusableMethods.bekle(2);

     //  10- Compare products alanı dışında boş bir alana tıkla
        page.boşBirAlan.click();
        ReusableMethods.bekle(2);

     //  11- Listelenen ürünlerden üçüncüsünün üzerindeki compare ikonunu seç
        page.üçüncüUrunCompareIkonu.click();
        ReusableMethods.scrollEnd();
        ReusableMethods.scrollHome();

     //  12- Compare Products bölümüne eklendiğini doğrula
        Assert.assertTrue(page.eklendiVerify3.isDisplayed());
        ReusableMethods.bekle(2);

     //  13- Compare products alanı dışında boş bir alana tıkla
        page.boşBirAlan.click();
        ReusableMethods.bekle(2);

     //  14- Listelenen ürünlerden dördüncüsünün üzerindeki compare ikonunu seç
        page.dördüncüUrunCompareIkonu.click();
        ReusableMethods.scrollEnd();
        ReusableMethods.scrollHome();

     // 15-  Compare Products bölümüne eklendiğini doğrula
        Assert.assertTrue(page.eklendiVerify4.isDisplayed());
        ReusableMethods.bekle(2);

     // 16-  Compare products alanı dışında boş bir alana tıkla
        page.boşBirAlan.click();
        ReusableMethods.bekle(2);

     // 17-  Listelenen ürünlerden beşincisinin üzerindeki compare ikonunu seç
        page.beşinciUrunCompareIkonu.click();
        ReusableMethods.scrollEnd();
        ReusableMethods.scrollHome();

     // 18- Compare Products bölümüne eklendiğini doğrula
        Assert.assertTrue(page.verify.isDisplayed());

     // 19- Compare Products bölümüne ilk eklenen ürünün otomatik olarak listeden çıkarıldığını dogrula

     // 20- Compare Products bölümüne eklenen ürün sayısının en fazla 4 olduğunu doğrula

     // 21- Start Compare! Butonuna tıkla
        page.startCompareButonu.click();

     // 22- Compare sayfasındaki ilk ürün fotoğrafının üzerindeki X e tıkla
        page.ilkUrünüKapat.click();

     // 23- Ürünün Compare sayfasından silindiğini doğrula
        Assert.assertTrue(page.ilkUrünKapatVerify1.isDisplayed());
     // 24- ürün ara
        page.aramaKutusu.sendKeys("kazak",Keys.ENTER);

     // 25- Listelenen ürünlerden ilkinin üzerindeki compare ikonunu seç
        page.ilkUrunCompareIkonu.click();

     // 26- Compare Products bölümüne eklendiğini doğrula
        Assert.assertTrue(page.eklendiVerify1.isDisplayed());

     // 27- Start Compare! Butonuna tıkla
        page.startCompareButonu.click();

     // 28- Seçtiği 4 ürünün karşılaştırılabildiğini doğrula
        Assert.assertTrue(page.karsılastırmaVerify.isDisplayed());

     // 29- Compare sayfasındaki ilk ürün fotoğrafının üzerindeki X butonuna tıkla
        page.ilkUrünüKapat.click();

     // 30- Ürünün Compare sayfasından kaldırıldığını doğrula
        Assert.assertTrue(page.ilkUrünKapatVerify1.isDisplayed());

     // 31- Compare sayfasındaki ilk ürün fotoğrafının üzerindeki X butonuna tıkla
        page.ikinciUrünüKapat.click();

     // 32- Ürünün Compare sayfasından kaldırıldığını doğrula
        Assert.assertTrue(page.ikinciUrünKapatVerify2.isDisplayed());

     // 33- Compare sayfasındaki ilk ürün fotoğrafının üzerindeki X butonuna tıkla
        page.üçünncüUrünüKapat.click();

     // 34- Ürünün Compare sayfasından kaldırıldığını doğrula
        Assert.assertTrue(page.üçüncüUrünKapatVerify3.isDisplayed());

     // 35- Compare sayfasındaki ilk ürün fotoğrafının üzerindeki X butonuna tıkla
        page.dördüncüUrünüKapat.click();

     // 36- Compare sayfasında ürün olmadığını doğrula
        Assert.assertTrue(page.ürünKalmadıVerify5.isDisplayed());


   }
}
