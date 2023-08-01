package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import java.security.Key;
import java.util.Collections;
import java.util.Set;

import static utilities.Driver.driver;
import static utilities.ReusableMethods.scrollEnd;

public class US15_VendorOlarakUrünEkleme extends ExtentReport{


    @Test
    public void testTc01() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));
        AlloverCommercePage sourcePage = new AlloverCommercePage();
        extentTest = extentReports.createTest("allovercommerce sitesine girme", "Vendor olarak ürün ekleme testi");
        //1 https://allovercommerce.com/ adresine gidin
        extentTest.info("allovercommerce anasayfasina gidildi.");
        sourcePage.login.click();
        //2 Kayıtlı satıcı e-postası ve şifresi ile giriş yapın
        sourcePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB,ConfigReader.getProperty("vendorpassword"),Keys.ENTER);
        extentTest.info("Vendor olarak Giriş Yapıldı.");
        ReusableMethods.bekle(3);

        scrollEnd();

        ReusableMethods.bekle(3);
        //3 Sayfanın altındaki Hesabım bölümünün görünür olduğunu doğrulayın
        Assert.assertTrue(sourcePage.myAccount.isDisplayed());
        extentTest.info("MyAccount görüldüğünün doğrulaması yapıldı");
        //4 Hesabım sekmesi altında Hesabım'a tıklayın
        sourcePage.myAccount.click();
        extentTest.info("My Account Bölümüne Gidildi.");
        //5 Açılan Hesabım sayfasında Mağaza Yöneticisi Bölümünün görünür olduğunu doğrulayın
        Assert.assertTrue(sourcePage.storeManager.isDisplayed());
        extentTest.info("StoreManager görülüdüğünün doğrulaması yapıldı");
        //6 Mağaza Yöneticisine tıklayın
        sourcePage.storeManager.click();
        //7 Açılan Mağaza Yöneticisi sayfasında Ürünler bölümünün görünür olduğunu doğrulayın
        Assert.assertTrue(sourcePage.products.isDisplayed());
        extentTest.info("Products görüldüğünün doğrulaması yapıldı");
        //8 Ürünler'in üzerine geldiğinizde görünen Yeni Ekle'ye tıklayın.
        sourcePage.products.click();
        sourcePage.addNew.click();
        //9 Sayfanın altındaki Envanter menüsünün görünürlüğünü doğrulayın
        Assert.assertTrue(sourcePage.inventory.isDisplayed());
        extentTest.info("Inventory bölümünün görüldüğünün doğrulaması yapıldı");
        //10 Sayfanın altındaki Nakliye menüsünün görünürlüğünü doğrulayın
        Assert.assertTrue(sourcePage.shipping.isDisplayed());
        extentTest.info("Shipping bölümünün görüldüğünün doğrulaması yapıldı");
        //11 Sayfanın altındaki Bağlantılı menünün görünürlüğünü doğrulayın
        Assert.assertTrue(sourcePage.linked.isDisplayed());
        extentTest.info("Linked bölümünün görüldüğünün doğrulaması yapıldı");
        //12 Sayfanın altındaki Seo menüsünün görünürlüğünü doğrulayın
        Assert.assertTrue(sourcePage.seo.isDisplayed());
        extentTest.info("Seo bölümünün görüldüğünün doğrulaması yapıldı");
        //13 Sayfanın altındaki Gelişmiş menüsünün görünürlüğünü doğrulayın
        Assert.assertTrue(sourcePage.advanced.isDisplayed());
        extentTest.info("Advanced bölümünün görüldüğünün doğrulaması yapıldı");
    }

    @Test
    public void testTc02() {

        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));
        AlloverCommercePage sourcePage = new AlloverCommercePage();
        extentTest = extentReports.createTest("allovercommerce sitesine girme", "Vendor olarak ürün ekleme testi");
        //1 https://allovercommerce.com/ adresine gidin
        extentTest.info("allovercommerce anasayfasina gidildi.");
        sourcePage.login.click();
        //2 Kayıtlı satıcı e-postası ve şifresi ile giriş yapın
        sourcePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB,ConfigReader.getProperty("vendorpassword"),Keys.ENTER);
        extentTest.info("Vendor olarak Giriş Yapıldı.");
        ReusableMethods.bekle(3);

        scrollEnd();

        ReusableMethods.bekle(3);
        //3 Sayfanın altındaki Hesabım bölümünün görünür olduğunu doğrulayın

        extentTest.info("MyAccount görüldüğünün doğrulaması yapıldı");
        //4 Hesabım sekmesi altında Hesabım'a tıklayın
        sourcePage.myAccount.click();
        extentTest.info("My Account Bölümüne Gidildi.");
        //5 Açılan Hesabım sayfasında Mağaza Yöneticisi Bölümünün görünür olduğunu doğrulayın

        //6 Mağaza Yöneticisine tıklayın
        sourcePage.storeManager.click();
        //7 Açılan Mağaza Yöneticisi sayfasında Ürünler bölümünün görünür olduğunu doğrulayın

        extentTest.info("Products görüldüğünün doğrulaması yapıldı");
        //8 Ürünler'in üzerine geldiğinizde görünen Yeni Ekle'ye tıklayın.
        sourcePage.products.click();
        sourcePage.addNew.click();
//        9 Ürün başlığı alanına eklemek istediğiniz ürün adını girin
        sourcePage.productTitle.sendKeys("EyeGlass");
//      11 Kategori Bölümünden eklenen ürünün ait olduğu kategoriyi işaretler

//      12 Sayfanın altındaki Envanter eylemini seçin
        ReusableMethods.scrollEnd();
        ReusableMethods.bekle(2);
//      13 SKU değerini girin

        sourcePage.sku.sendKeys("Ab123");
        ReusableMethods.bekle(2);
//      14 Stok Yönet onay kutusuna tıklar
        sourcePage.manageStock.click();
        ReusableMethods.bekle(2);

//      15 Stok Miktarı alanının göründüğünü doğrulayın.
        Assert.assertTrue(sourcePage.manageStock.isDisplayed());
//      16 Stok Miktarı alanına stok miktarını girin
        sourcePage.stockStatus.clear();
        sourcePage.stockStatus.sendKeys("2");
//      17 Tek tek satılır onay kutusunu tıklayın
        sourcePage.soldIndividually.click();
//        18 Gönder'e tıklayın
        sourcePage.draftData.click();
//        19 Ürün Başarıyla Yayınlandı'nın görünür olduğunu doğrulayın

        Assert.assertTrue(sourcePage.productSuccess.isDisplayed());
         ReusableMethods.bekle(3);
//        20 Sayfanın sol tarafındaki Ürünler öğesine tıklayın.
          sourcePage.products.click();
          ReusableMethods.bekle(4);
//        21 Envanter işleminde girilen SKU değerinin bu sayfada görünür olduğunu doğrulayın
            Assert.assertEquals(sourcePage.skugorunmesi.getAttribute("Ab123"), sourcePage.sku.getAttribute("Ab123"));


    }

    @Test
    public void testTc03() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));
        AlloverCommercePage sourcePage = new AlloverCommercePage();
        extentTest = extentReports.createTest("allovercommerce sitesine girme", "Vendor olarak ürün ekleme testi");
        //1 https://allovercommerce.com/ adresine gidin
        extentTest.info("allovercommerce anasayfasina gidildi.");
        sourcePage.login.click();
        //2 Kayıtlı satıcı e-postası ve şifresi ile giriş yapın
        sourcePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB,ConfigReader.getProperty("vendorpassword"),Keys.ENTER);
        extentTest.info("Vendor olarak Giriş Yapıldı.");
        ReusableMethods.bekle(3);
        scrollEnd();
        ReusableMethods.bekle(3);
        //4 Hesabım sekmesi altında Hesabım'a tıklayın
        sourcePage.myAccount.click();
        extentTest.info("My Account Bölümüne Gidildi.");

        //5 Mağaza Yöneticisine tıklayın
        sourcePage.storeManager.click();
        //6 Ürünler'in üzerine geldiğinizde görünen Yeni Ekle'ye tıklayın.
        sourcePage.products.click();
        sourcePage.addNew.click();
//       7 Ürün başlığı alanına eklemek istediğiniz ürün adını girin
        sourcePage.productTitle.sendKeys("EyeGlass2");
//      8 Sayfanın altındaki Envanter eylemini seçin
        scrollEnd();
        ReusableMethods.bekle(2);
//      9 SKU değerini girin
        sourcePage.sku.sendKeys("Ab1234");
        ReusableMethods.bekle(2);
//      10  Stok Durumu açılır menüsünden stok durumunu seçin
        WebElement ddmSelectaState = driver.findElement(By.xpath("//select[@id='stock_status']"));
        Select select = new Select(ddmSelectaState);
        select.selectByVisibleText("In stock");
        sourcePage.soldIndividually.click();
//      11 Gönder'e tıklayın
        sourcePage.draftData.click();
//      12 Ürün Başarıyla Yayınlandı'nın görünür olduğunu doğrulayın
        Assert.assertTrue(sourcePage.productSuccess.isDisplayed());
        ReusableMethods.bekle(3);

//      13 Sayfanın sol tarafındaki Ürünler öğesine tıklayın.
        sourcePage.products.click();
        ReusableMethods.bekle(4);
//      14 Envanter işleminde seçilen stok durumunun bu sayfada görünür olduğunu doğrulayın
        System.out.println(sourcePage.inStockOnline.getText());
        Assert.assertTrue(sourcePage.inStockOnline.isDisplayed());
    }

    @Test
    public void testTc04() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));
        AlloverCommercePage sourcePage = new AlloverCommercePage();
        extentTest = extentReports.createTest("allovercommerce sitesine girme", "Vendor olarak ürün ekleme testi");
        //1 https://allovercommerce.com/ adresine gidin
        extentTest.info("allovercommerce anasayfasina gidildi.");
        sourcePage.login.click();
        //2 Kayıtlı satıcı e-postası ve şifresi ile giriş yapın
        sourcePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB,ConfigReader.getProperty("vendorpassword"),Keys.ENTER);
        extentTest.info("Vendor olarak Giriş Yapıldı.");
        ReusableMethods.bekle(3);
        scrollEnd();
        ReusableMethods.bekle(3);
        //4 Hesabım sekmesi altında Hesabım'a tıklayın
        sourcePage.myAccount.click();
        extentTest.info("My Account Bölümüne Gidildi.");

        //5 Mağaza Yöneticisine tıklayın
        sourcePage.storeManager.click();
        //6 Ürünler'in üzerine geldiğinizde görünen Yeni Ekle'ye tıklayın.
        sourcePage.products.click();
        sourcePage.addNew.click();
//       7 Ürün başlığı alanına eklemek istediğiniz ürün adını girin
        sourcePage.productTitle.sendKeys("EyeGlass3");

//      8 Sayfanın altındaki Gönderi eylemini seçin
        ReusableMethods.scroll(sourcePage.shipp1);
        ReusableMethods.click(sourcePage.shipp1);
        ReusableMethods.bekle(2);
//      9 Ağırlık bölümüne bir değer girin
//      10 Boyutlar bölümüne uzunluk, genişlik ve yükseklik değerlerini girin
         sourcePage.weight.sendKeys("2",Keys.TAB, "1",Keys.TAB, "2",Keys.TAB, "3");

//      11 İşlem süresi bölümünden zaman seçin
        ReusableMethods.ddmIndex(sourcePage.processingTime, 1);
//      12 Gönder düğmesine tıklayın
        ReusableMethods.click(sourcePage.draftData);
        ReusableMethods.bekle(3);
        ReusableMethods.scrollEnd();
//      13 Yenilenen sayfada gönder butonunun yanında bulunan görüntüle butonuna tıklayınız.
        ReusableMethods.click(sourcePage.preview);
        ReusableMethods.bekle(5);
//      14 Açılan sayfada ürün resminin altındaki spesifikasyona tıklayın.
        String ilkSayfaHandle = driver.getWindowHandle();
        Set<String> pencereler = driver.getWindowHandles();
        for (String w : pencereler) {

            if (!w.equals(ilkSayfaHandle)) {
                driver.switchTo().window(w);
            }
        }
        ReusableMethods.scrollEnd();
        ReusableMethods.click(sourcePage.spefication);
        ReusableMethods.bekle(1);

//      15 Girilen ağırlık ve boyut değerlerinin görünür olduğunu doğrulayın
        Assert.assertTrue(sourcePage.specsdisplay1.isDisplayed() || sourcePage.specsdisplay2.isDisplayed());
    }

    @Test
    public void testTc05() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));
        AlloverCommercePage sourcePage = new AlloverCommercePage();
        extentTest = extentReports.createTest("allovercommerce sitesine girme", "Vendor olarak ürün ekleme testi");
        //1 https://allovercommerce.com/ adresine gidin
        extentTest.info("allovercommerce anasayfasina gidildi.");
        sourcePage.login.click();
        //2 Kayıtlı satıcı e-postası ve şifresi ile giriş yapın
        sourcePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB,ConfigReader.getProperty("vendorpassword"),Keys.ENTER);
        extentTest.info("Vendor olarak Giriş Yapıldı.");
        ReusableMethods.bekle(3);
        scrollEnd();
        ReusableMethods.bekle(3);
        //4 Hesabım sekmesi altında Hesabım'a tıklayın
        sourcePage.myAccount.click();
        extentTest.info("My Account Bölümüne Gidildi.");

        //5 Mağaza Yöneticisine tıklayın
        sourcePage.storeManager.click();
        //6 Ürünler'in üzerine geldiğinizde görünen Yeni Ekle'ye tıklayın.
        sourcePage.products.click();
        sourcePage.addNew.click();
//       7 Ürün başlığı alanına eklemek istediğiniz ürün adını girin
        sourcePage.productTitle.sendKeys("EyeGlass3");

//       8 Sayfanın altındaki Öznitelik'e tıklayın
        ReusableMethods.click(sourcePage.attributes);

//       9 Açılır bölümdeki renk onay kutusuna tıklayın
        ReusableMethods.click(sourcePage.colorSelected);
        ReusableMethods.bekle(2);
//       10 Etkin onay kutusunu seçili göster
        Assert.assertTrue(sourcePage.activeSelected.isSelected());
//       11 Renk kutusuna tıklayın ve bir renk seçin (Mavi/sarı)
        ReusableMethods.scroll(sourcePage.colorSec);
        WebElement ddmSelectaState = driver.findElement(By.xpath("//select[@id='attributes_value_1']"));
        Select select = new Select(ddmSelectaState);
        select.selectByVisibleText("Black");
        ReusableMethods.bekle(1);
//       12 Boyut özniteliği onay kutusuna tıklayın
        ReusableMethods.click(sourcePage.sizeSelected);
        ReusableMethods.bekle(1);
//       13 Etkin onay kutusunu seçili göster
        Assert.assertTrue(sourcePage.sizeSelected.isSelected());
//       14 Boyut kutusuna tıklayın ve boyutu seçin (Ekstra Büyük)
        WebElement ddmSelectaState1 = driver.findElement(By.xpath("//select[@id='attributes_value_2']"));
        Select select1 = new Select(ddmSelectaState1);
        select1.selectByVisibleText("XXL");
        ReusableMethods.bekle(2);

//       15 Gönder düğmesine tıklayın
        ReusableMethods.click(sourcePage.draftData);
//       16 Yenilenen sayfada gönder butonunun yanında bulunan görüntüle butonuna tıklayınız.
        ReusableMethods.click(sourcePage.preview);
//       17 Açılan sayfada ürün resminin altındaki spesifikasyona tıklayın.
        String ilkSayfaHandle = driver.getWindowHandle();
        Set<String> pencereler = driver.getWindowHandles();
        for (String w : pencereler) {
            if (!w.equals(ilkSayfaHandle)) {
                driver.switchTo().window(w);
            }
        }
        ReusableMethods.scrollEnd();
        ReusableMethods.click(sourcePage.spefication);
        ReusableMethods.bekle(1);
//       18 Girilen renk ve beden değerlerinin görünür olduğunu doğrulayın
        Assert.assertTrue(sourcePage.specsdisplay1.isDisplayed() || sourcePage.specsdisplay2.isDisplayed());

    }
}
