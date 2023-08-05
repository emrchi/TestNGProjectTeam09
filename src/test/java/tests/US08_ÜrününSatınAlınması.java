package tests;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US08_ÜrününSatınAlınması {
    @Test
    public void test01() {

      // 1- Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
      // 2- Login ol
        AlloverCommercePage page = new AlloverCommercePage();
        page.anasayfaSignIn.click();
        page.signupUpUserName.sendKeys(ConfigReader.getProperty("userName"), Keys.TAB,
                ConfigReader.getProperty("userPassword"),Keys.TAB,Keys.SPACE,Keys.TAB,Keys.ENTER);
      // 3- Arama alanına aranacak ürünü yaz
      // 4- Ara ikonuna tıkla
        page.aramaKutusu.sendKeys("kazak",Keys.ENTER);
        ReusableMethods.scrollEnd();
        ReusableMethods.scrollHome();

      // 5- Listelenen ürünlerden ilkinin üzerindeki kalp ikonuna tıkla
        page.ilkÜrünKalpIkonu.click();

      // 6- Listelenen ürünlerden ikincisinin üzerindeki kalp ikonuna tıkla
        page.ikinciÜrünKalpIkonu.click();

      // 7- Aynı ekranda sağ üstte bulunan wishlist yazılı kalp ikonuna tıkla
        page.wishlistIkonu.click();

      // 8- Eklenen ürünlerin wishlist sayfasında göründüğünü doğrula
        Assert.assertTrue(page.wishlistVerify.isDisplayed());

      // 9- seçilen ürünün özelliklerini görebilmek için Quick View’e tıkla
        ReusableMethods.click(page.quickView1);

      // 10- seçilen ürünün özelliklerinin göründüğünü doğrula
        Assert.assertTrue(page.seçilenUrünÖzellikleriVerify.isDisplayed());

    }

    @Test
    public void test02() {
        // 1- Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        // 2- Login ol
        AlloverCommercePage page = new AlloverCommercePage();
        page.anasayfaSignIn.click();
        page.signupUpUserName.sendKeys(ConfigReader.getProperty("userName"),Keys.TAB,
                ConfigReader.getProperty("userPassword"),Keys.TAB,Keys.SPACE,Keys.TAB,Keys.ENTER);
        // 3- Arama alanına aranacak ürünü yaz
        // 4- Ara ikonuna tıkla
        page.aramaKutusu.sendKeys("kazak",Keys.ENTER);

        // 5- Listelenen ürünlerden ilkinin üzerindeki kalp ikonuna tıkla
        page.ilkÜrünKalpIkonu.click();

        // 6- Listelenen ürünlerden ikincisinin üzerindeki kalp ikonuna tıkla
        page.ikinciÜrünKalpIkonu.click();

        // 7- Aynı ekranda sağ üstte bulunan wishlist yazılı kalp ikonuna tıkla
        page.wishlistIkonu.click();

        // 8- Beğenilen ürünlerin wishlist sayfasında göründüğünü doğrula
        Assert.assertTrue(page.wishlistVerify.isDisplayed());

        // 9- seçilen ürünün özelliklerini görebilmek için Quick View’e tıkla
        page.quickView1.click();

        // 10- seçilen ürünün özelliklerinin göründüğünü doğrula
        Assert.assertTrue(page.seçilenUrünÖzellikleriVerify.isDisplayed());

        // 11- Add to cart butonuna tıkla
        page.addToCartButton.click();

        // 12- Açılan popup mesajında view cart butonuna tıkla
        page.viewCartButton.click();

        // 13- seçilen ürünün sepete eklendiğini doğrula
        Assert.assertTrue(page.sepettekiÜrünVerify.isDisplayed());

        // 14- ürün adetinin 1 olduğunu doğrula
        Assert.assertTrue(page.sepettekiÜrünSayısıVerify.isDisplayed());

        // 15- proceed to checkout butonuna tıkla
        page.procedToCheckoutButton.click();

        // 16- Ödeme ekranında fatura adres bilgilerinin otomatik olarak geldiğini doğrula
        Assert.assertTrue(page.ödemeAdresBilgileriEkranıCheckoutVerify.isDisplayed());

        // 17- Ship to a different address? kutucuğunun seçili olmadığını doğrula
        //Ship to a different address? kutucuğu YOKK!!!!

        // 18- WIRE TRANSFER EFT seçeneğini tıkla
        page.wireTransferEftButton.click();

        // 19- Place order butonuna tıkla
        page.placeOrderButton.click();


        // 20- satın alma işleminin gerçekleştiğini doğrula

    }

    @Test
    public void test03() {
        // 1- Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
        // 2- Login ol
        AlloverCommercePage page = new AlloverCommercePage();
        page.anasayfaSignIn.click();
        page.signupUpUserName.sendKeys(ConfigReader.getProperty("userName"),Keys.TAB,
                ConfigReader.getProperty("userPassword"),Keys.TAB,Keys.SPACE,Keys.TAB,Keys.ENTER);
        // 3- Arama alanına aranacak ürünü yaz
        // 4- Ara ikonuna tıkla
        page.aramaKutusu.sendKeys("kazak",Keys.ENTER);

        // 5- Listelenen ürünlerden ilkinin üzerindeki kalp ikonuna tıkla
        page.ilkÜrünKalpIkonu.click();

        // 6- Listelenen ürünlerden ikincisinin üzerindeki kalp ikonuna tıkla
        page.ikinciÜrünKalpIkonu.click();

        // 7- Aynı ekranda sağ üstte bulunan wishlist yazılı kalp ikonuna tıkla
        page.wishlistIkonu.click();

        // 8- Beğenilen ürünlerin wishlist sayfasında göründüğünü doğrula
        Assert.assertTrue(page.wishlistVerify.isDisplayed());

        // 9- seçilen ürünün özelliklerini görebilmek için Quick View’e tıkla
        page.quickView1.click();

        // 10- seçilen ürünün özelliklerinin göründüğünü doğrula
        Assert.assertTrue(page.seçilenUrünÖzellikleriVerify.isDisplayed());

        // 11- Add to cart butonuna tıkla
        page.addToCartButton.click();

        // 12- Açılan popup mesajında view cart butonuna tıkla
        page.viewCartButton.click();

        // 13- seçilen ürünün sepete eklendiğini doğrula
        Assert.assertTrue(page.sepettekiÜrünVerify.isDisplayed());

        // 14- ürün adetinin 1 olduğunu doğrula
        Assert.assertTrue(page.sepettekiÜrünSayısıVerify.isDisplayed());

        // 15- proceed to checkout butonuna tıkla
        page.procedToCheckoutButton.click();

        // 16- Ödeme ekranında fatura adres bilgilerinin otomatik olarak geldiğini doğrula
        Assert.assertTrue(page.ödemeAdresBilgileriEkranıCheckoutVerify.isDisplayed());

        // 17- Ship to a different address? kutucuğunun seçili olmadığını doğrula
        //Ship to a different address? kutucuğu YOKK!!!!

        // 18- Pay at the door seçeneğini tıkla
        page.payAtTheDorButton.click();

        // 19- Place order butonuna tıkla
        page.placeOrderButton.click();

        // 20- satın alma işleminin gerçekleştiğini doğrula

    }

    @Test
    public void test04() {

      // 1- Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
      // 2- Login ol
        AlloverCommercePage page = new AlloverCommercePage();
        page.anasayfaSignIn.click();
        page.signupUpUserName.sendKeys(ConfigReader.getProperty("userName"),Keys.TAB,
                ConfigReader.getProperty("userPassword"),Keys.TAB,Keys.SPACE,Keys.TAB,Keys.ENTER);
      // 3- Arama alanına aranacak ürünü yaz
      // 4- Ara ikonuna tıkla
        page.aramaKutusu.sendKeys("kazak",Keys.ENTER);

      // 5- Listelenen ürünlerden ilkinin üzerindeki kalp ikonuna tıkla
        page.ilkÜrünKalpIkonu.click();

      // 6- Listelenen ürünlerden ikincisinin üzerindeki kalp ikonuna tıkla
        page.ikinciÜrünKalpIkonu.click();

      // 7- Aynı ekranda sağ üstte bulunan wishlist yazılı kalp ikonuna tıkla
        page.wishlistIkonu.click();

      // 8- Beğenilen ürünlerin wishlist sayfasında göründüğünü doğrula
        Assert.assertTrue(page.wishlistVerify.isDisplayed());

      // 9- seçilen ürünün özelliklerini görebilmek için Quick View’e tıkla
        page.quickView1.click();

      // 10- seçilen ürünün özelliklerinin göründüğünü doğrula
        Assert.assertTrue(page.seçilenUrünÖzellikleriVerify.isDisplayed());

      // 11- Add to cart butonuna tıkla
        page.addToCartButton.click();

      // 12- Açılan popup mesajında view cart butonuna tıkla
        page.viewCartButton.click();

      // 13- seçilen ürünün sepete eklendiğini doğrula
        Assert.assertTrue(page.sepettekiÜrünVerify.isDisplayed());

      // 14- ürün adetinin 1 olduğunu doğrula
        Assert.assertTrue(page.sepettekiÜrünSayısıVerify.isDisplayed());

      // 15- proceed to checkout butonuna tıkla
        page.procedToCheckoutButton.click();

      // 16- Ödeme ekranında fatura adres bilgilerinin otomatik olarak geldiğini doğrula
        Assert.assertTrue(page.ödemeAdresBilgileriEkranıCheckoutVerify.isDisplayed());

      // 17- Ship to a different address? kutucuğunun seçili olduğunu doğrula
        //Ship to a different address? kutucuğu YOKK!!!!

      // 18- Ödeme ekranında shipping bilgilerinin otomatik olarak geldiğini doğrula

      // 19- WIRE TRANSFER EFT seçeneğini tıkla
        page.wireTransferEftButton.click();

      // 20- Place order butonuna tıkla
        page.placeOrderButton.click();

      // 21- satın alma işleminin gerçekleştiğini doğrula

    }

    @Test
    public void test05() {

      // 1- Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
      // 2- Login ol
        AlloverCommercePage page = new AlloverCommercePage();
        page.anasayfaSignIn.click();
        page.signupUpUserName.sendKeys(ConfigReader.getProperty("userName"),Keys.TAB,
                ConfigReader.getProperty("userPassword"),Keys.TAB,Keys.SPACE,Keys.TAB,Keys.ENTER);
      // 3- Arama alanına aranacak ürünü yaz
      // 4- Ara ikonuna tıkla
        page.aramaKutusu.sendKeys("kazak",Keys.ENTER);

      // 5- Listelenen ürünlerden ilkinin üzerindeki kalp ikonuna tıkla
        page.ilkÜrünKalpIkonu.click();

      // 6- Listelenen ürünlerden ikincisinin üzerindeki kalp ikonuna tıkla
        page.ikinciÜrünKalpIkonu.click();

      // 7- Aynı ekranda sağ üstte bulunan wishlist yazılı kalp ikonuna tıkla
        page.wishlistIkonu.click();

      // 8- Beğenilen ürünlerin wishlist sayfasında göründüğünü doğrula
        Assert.assertTrue(page.wishlistVerify.isDisplayed());

      // 9- seçilen ürünün özelliklerini görebilmek için Quick View’e tıkla
        page.quickView1.click();

      // 10- seçilen ürünün özelliklerinin göründüğünü doğrula
        Assert.assertTrue(page.seçilenUrünÖzellikleriVerify.isDisplayed());

      // 11- Add to cart butonuna tıkla
        page.addToCartButton.click();

      // 12- Açılan popup mesajında view cart butonuna tıkla
        page.viewCartButton.click();

      // 13- seçilen ürünün sepete eklendiğini doğrula
        Assert.assertTrue(page.sepettekiÜrünVerify.isDisplayed());

      // 14- ürün adetinin 1 olduğunu doğrula
        Assert.assertTrue(page.sepettekiÜrünSayısıVerify.isDisplayed());

      // 15- proceed to checkout butonuna tıkla
        page.procedToCheckoutButton.click();

      // 16- Ödeme ekranında fatura adres bilgilerinin otomatik olarak geldiğini doğrula
        Assert.assertTrue(page.ödemeAdresBilgileriEkranıCheckoutVerify.isDisplayed());

      // 17- Ship to a different address? kutucuğunun seçili olduğunu doğrula
        //Ship to a different address? kutucuğu YOKK!!!!

      // 18- Ödeme ekranında shipping bilgilerinin otomatik olarak geldiğini doğrula

      // 19- Pay at the door seçeneğini tıkla
        page.payAtTheDorButton.click();

      // 20- Place order butonuna tıkla
        page.placeOrderButton.click();

      // 21- satın alma işleminin gerçekleştiğini doğrula

    }
}
