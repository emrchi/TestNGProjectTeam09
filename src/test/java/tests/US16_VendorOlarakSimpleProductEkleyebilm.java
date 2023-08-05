package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import static utilities.Driver.driver;
import static utilities.ReusableMethods.scrollEnd;

public class US16_VendorOlarakSimpleProductEkleyebilm extends ExtentReport {


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
        sourcePage.myAccount.click();
        //6 Mağaza Yöneticisine tıklayın
       sourcePage.storeManager.click();
        //8 Ürünler'in üzerine geldiğinizde görünen Yeni Ekle'ye tıklayın.
        sourcePage.products.click();
        sourcePage.addNew.click();
//        6 Simple Product'ın varsayılan olarak geldiğini doğrulayın
        WebElement ddmSelectaState = driver.findElement(By.xpath("//select[@id='product_type']"));
        Select select = new Select(ddmSelectaState);
        select.getFirstSelectedOption().isDisplayed();

//        7 Sanal ve İndirilebilir onay kutularının seçilebilir olduğunu doğrulayın
        sourcePage.virtualSelected.isSelected();
        sourcePage.downloadedselected.isSelected();
//        8 Sanal onay kutunuzu seçin
        ReusableMethods.click(sourcePage.virtualSelected);
//        9 Fiyat ve Satış Fiyatı metin kutularının erişilebilir olduğunu doğrulayın
        sourcePage.prices.isEnabled();
        sourcePage.sales.isEnabled();
//        10 Fiyat ve Satış Fiyatı metin kutularına bir değer girin
        sourcePage.sales.sendKeys("5",Keys.ENTER);
        sourcePage.prices.sendKeys("3",Keys.ENTER);
//        11 Ürün Başlığı metin kutusunun erişilebilir olduğunu doğrulayın
        sourcePage.productTitle.isEnabled();
//        12 Ürün Başlığı metin kutusuna bir değer girin
        sourcePage.productTitle.sendKeys("EyeGlass4");
//        13 Kategoriler altındaki kategorilerin seçilebilir olduğunu doğrulayın
        sourcePage.checklist.isEnabled();
//        14 Kategoriler'den bir kategori seçin
        ReusableMethods.click(sourcePage.accessories);
//        15 Sağ taraftaki resim ekle düğmesine tıklayın ve resim ekleyin
        ReusableMethods.click(sourcePage.resimsec);
        ReusableMethods.click(sourcePage.mediaLibrary);
        ReusableMethods.click(sourcePage.resimIcon);
        ReusableMethods.click(sourcePage.selectButton);
        ReusableMethods.bekle(2);
//        16 En alttaki Gönder düğmesine tıklayın.
        ReusableMethods.click(sourcePage.draftData);
//        17 Ürün Başarıyla Yayınlandı'nın görünür olduğunu doğrulayın
        Assert.assertTrue(sourcePage.productSucces.getText().contains("Product Successfully Saved."));

//        18 Ürünün eklendiğini Ürün bölümünde görebilmelisiniz Ürün Başarıyla Yayınlandı
        ReusableMethods.bekle(2);
        ReusableMethods.click(sourcePage.products);
        Assert.assertTrue(sourcePage.inStockOnline.isDisplayed());


    }

    @Test
    public void testTc02() {
        extentTest = extentReports.createTest("allovercommerce sitesine girme", "Vendor olarak ürün ekleme testi");
        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));
        AlloverCommercePage sourcePage = new AlloverCommercePage();

        //1 https://allovercommerce.com/ adresine gidin
        extentTest.info("allovercommerce anasayfasina gidildi.");
        sourcePage.login.click();
        //2 Kayıtlı satıcı e-postası ve şifresi ile giriş yapın
        sourcePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB, ConfigReader.getProperty("vendorpassword"), Keys.ENTER);
        extentTest.info("Vendor olarak Giriş Yapıldı.");
        ReusableMethods.bekle(2);
        scrollEnd();
        ReusableMethods.bekle(2);
        sourcePage.myAccount.click();
        //2 Mağaza Yöneticisine tıklayın
        sourcePage.storeManager.click();
        //3 Ürünler'in üzerine geldiğinizde görünen Yeni Ekle'ye tıklayın.
        sourcePage.products.click();
        sourcePage.addNew.click();
//        8 "Sanal" onay kutusunu seçin
        ReusableMethods.click(sourcePage.virtualSelected);
//        10 Fiyat ve Satış Fiyatı metin kutularına bir değer girin
        sourcePage.sales.sendKeys("5", Keys.ENTER);
        sourcePage.prices.sendKeys("3", Keys.ENTER);
//        12 Ürün Başlığı metin kutusuna bir değer girin
        sourcePage.productTitle.sendKeys("EyeGlass5");
//        14 Kategoriler'den bir kategori seçin
        ReusableMethods.click(sourcePage.accessories);
//        15 En alttaki Gönder düğmesine tıklayın.
        ReusableMethods.click(sourcePage.submitButton);
//        16 "Öne çıkan img: Bu alan zorunludur.
//        Galeri Görselleri: Bu alan gereklidir."
        ReusableMethods.bekle(2);
       Assert.assertTrue(sourcePage.imgFailed1.isDisplayed());
       Assert.assertTrue(sourcePage.galleryİmage.isDisplayed());
        ReusableMethods.bekle(3);

    }

    @Test
    public void testTc03() {
        extentTest = extentReports.createTest("allovercommerce sitesine girme", "Vendor olarak ürün ekleme testi");
        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));
        AlloverCommercePage sourcePage = new AlloverCommercePage();

        //1 https://allovercommerce.com/ adresine gidin
        extentTest.info("allovercommerce anasayfasina gidildi.");
        sourcePage.login.click();
        //2 Kayıtlı satıcı e-postası ve şifresi ile giriş yapın
        sourcePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB, ConfigReader.getProperty("vendorpassword"), Keys.ENTER);
        extentTest.info("Vendor olarak Giriş Yapıldı.");
        ReusableMethods.bekle(2);
        scrollEnd();
        ReusableMethods.bekle(2);
        sourcePage.myAccount.click();
        //2 Mağaza Yöneticisine tıklayın
        sourcePage.storeManager.click();
        //3 Ürünler'in üzerine geldiğinizde görünen Yeni Ekle'ye tıklayın.
        sourcePage.products.click();
        sourcePage.addNew.click();
//        8 "Sanal" onay kutusunu seçin
        ReusableMethods.click(sourcePage.downloadedselected);
//        10 Fiyat ve Satış Fiyatı metin kutularına bir değer girin
        sourcePage.sales.sendKeys("5", Keys.ENTER);
        sourcePage.prices.sendKeys("3", Keys.ENTER);
//        12 Ürün Başlığı metin kutusuna bir değer girin
        sourcePage.productTitle.sendKeys("EyeGlass6");
//        14 Kategoriler'den bir kategori seçin
        ReusableMethods.click(sourcePage.accessories);
//        15 Sağ taraftaki resim ekle düğmesine tıklayın ve resim ekleyin
        ReusableMethods.click(sourcePage.resimsec);
        ReusableMethods.click(sourcePage.mediaLibrary);
        ReusableMethods.click(sourcePage.resimIcon);
        ReusableMethods.click(sourcePage.selectButton);
//        16 En alttaki Gönder düğmesine tıklayın.
        ReusableMethods.click(sourcePage.draftData);
//        17 Ürünün Ürün bölümüne eklendiğini görebilmeniz gerekir
        ReusableMethods.bekle(2);
        ReusableMethods.click(sourcePage.products);
        ReusableMethods.bekle(3);
        Assert.assertTrue(sourcePage.inStockOnline.isDisplayed());
    }

    @Test
    public void testTc04() {
        extentTest = extentReports.createTest("allovercommerce sitesine girme", "Vendor olarak ürün ekleme testi");
        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));
        AlloverCommercePage sourcePage = new AlloverCommercePage();

        //1 https://allovercommerce.com/ adresine gidin
        extentTest.info("allovercommerce anasayfasina gidildi.");
        sourcePage.login.click();
        //2 Kayıtlı satıcı e-postası ve şifresi ile giriş yapın
        sourcePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB, ConfigReader.getProperty("vendorpassword"), Keys.ENTER);
        extentTest.info("Vendor olarak Giriş Yapıldı.");
        ReusableMethods.bekle(2);
        scrollEnd();
        ReusableMethods.bekle(2);
        sourcePage.myAccount.click();
        //2 Mağaza Yöneticisine tıklayın
        sourcePage.storeManager.click();
        //3 Ürünler'in üzerine geldiğinizde görünen Yeni Ekle'ye tıklayın.
        sourcePage.products.click();
        sourcePage.addNew.click();
//        8 Hem "Sanal" onay kutusunu hemde indirilebilir onay kutusunu seçin
        ReusableMethods.click(sourcePage.downloadedselected);
        ReusableMethods.click(sourcePage.virtualSelected);
//        10 Fiyat ve Satış Fiyatı metin kutularına bir değer girin
        sourcePage.sales.sendKeys("5", Keys.ENTER);
        sourcePage.prices.sendKeys("3", Keys.ENTER);
//        12 Ürün Başlığı metin kutusuna bir değer girin
        sourcePage.productTitle.sendKeys("EyeGlass7");
//        14 Kategoriler'den bir kategori seçin
        ReusableMethods.click(sourcePage.accessories);
//        15 Sağ taraftaki resim ekle düğmesine tıklayın ve resim ekleyin
        ReusableMethods.click(sourcePage.resimsec);
        ReusableMethods.click(sourcePage.mediaLibrary);
        ReusableMethods.click(sourcePage.resimIcon);
        ReusableMethods.click(sourcePage.selectButton);
//        16 En alttaki Gönder düğmesine tıklayın.
        ReusableMethods.click(sourcePage.draftData);
//        17 Ürünün Ürün bölümüne eklendiğini görebilmeniz gerekir
        ReusableMethods.bekle(2);
        ReusableMethods.click(sourcePage.products);
        ReusableMethods.bekle(3);
        Assert.assertTrue(sourcePage.inStockOnline.isDisplayed());

    }

    @Test
    public void testTc05() {
         extentTest = extentReports.createTest("allovercommerce sitesine girme", "Vendor olarak ürün ekleme testi");
        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));
       AlloverCommercePage sourcePage = new AlloverCommercePage();
//        //1 https://allovercommerce.com/ adresine gidin
        extentTest.info("allovercommerce anasayfasina gidildi.");
        sourcePage.login.click();
//        //2 Kayıtlı satıcı e-postası ve şifresi ile giriş yapın
        sourcePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB, ConfigReader.getProperty("vendorpassword"), Keys.ENTER);
        extentTest.info("Vendor olarak Giriş Yapıldı.");
        ReusableMethods.bekle(2);
        scrollEnd();
        ReusableMethods.bekle(2);
        sourcePage.myAccount.click();
//        //2 Mağaza Yöneticisine tıklayın
        sourcePage.storeManager.click();
//        //3 Ürünler'in üzerine geldiğinizde görünen Yeni Ekle'ye tıklayın.
        sourcePage.products.click();
        sourcePage.addNew.click();
////        8 Hem "Sanal" onay kutusunu hemde indirilebilir onay kutusunu seçin
        ReusableMethods.click(sourcePage.downloadedselected);
        ReusableMethods.click(sourcePage.virtualSelected);
////        10 Fiyat ve Satış Fiyatı metin kutularına bir değer girin
        sourcePage.sales.sendKeys("5", Keys.ENTER);
        sourcePage.prices.sendKeys("3", Keys.ENTER);
////        12 Ürün Başlığı metin kutusuna bir değer girin
        sourcePage.productTitle.sendKeys("EyeGlass7");
////        14 Kategoriler'den bir kategori seçin
        ReusableMethods.click(sourcePage.accessories);
////        15 Sağ taraftaki resim ekle düğmesine tıklayın ve resim ekleyin
        ReusableMethods.click(sourcePage.resimsec);
        ReusableMethods.click(sourcePage.mediaLibrary);
        ReusableMethods.click(sourcePage.resimIcon);
        ReusableMethods.click(sourcePage.selectButton);
////        16 En alttaki Gönder düğmesine tıklayın.
        ReusableMethods.click(sourcePage.draftData);
//        17 "Lütfen göndermeden önce Ürün Başlığını girin" ifadesini doğrulayın.
        ReusableMethods.bekle(2);
       Assert.assertTrue(sourcePage.imgfailed.isDisplayed());

    }

    @Test
    public void testTc06() {

        extentTest = extentReports.createTest("allovercommerce sitesine girme", "Vendor olarak ürün ekleme testi");
        Driver.getDriver().get(ConfigReader.getProperty("alloverVendorUrl"));
        AlloverCommercePage sourcePage = new AlloverCommercePage();
//
//        //1 https://allovercommerce.com/ adresine gidin
        extentTest.info("allovercommerce anasayfasina gidildi.");
        sourcePage.login.click();
//        //2 Kayıtlı satıcı e-postası ve şifresi ile giriş yapın
        sourcePage.username.sendKeys(ConfigReader.getProperty("vendoremail"),
                Keys.TAB, ConfigReader.getProperty("vendorpassword"), Keys.ENTER);
        extentTest.info("Vendor olarak Giriş Yapıldı.");
        ReusableMethods.bekle(2);
        scrollEnd();
        ReusableMethods.bekle(2);
        sourcePage.myAccount.click();
//        //2 Mağaza Yöneticisine tıklayın
        sourcePage.storeManager.click();
//        //3 Ürünler'in üzerine geldiğinizde görünen Yeni Ekle'ye tıklayın.
        sourcePage.products.click();
        sourcePage.addNew.click();
////        8 Hem "Sanal" onay kutusunu hemde indirilebilir onay kutusunu seçin
        ReusableMethods.click(sourcePage.virtualSelected);
////        10 Fiyat ve Satış Fiyatı metin kutularına bir değer girin
        sourcePage.sales.sendKeys("5", Keys.ENTER);
        sourcePage.prices.sendKeys("3", Keys.ENTER);
////        12 Ürün Başlığı metin kutusuna bir değer girin
        sourcePage.productTitle.sendKeys("EyeGlass8");
////        14 Kategoriler'den bir kategori seçmedik

////        15 Sağ taraftaki resim ekle düğmesine tıklayın ve resim ekleyin 1.resim
        ReusableMethods.click(sourcePage.resimsec);
        ReusableMethods.click(sourcePage.mediaLibrary);
        ReusableMethods.bekle(2);
        ReusableMethods.click(sourcePage.resimIcon);
        ReusableMethods.click(sourcePage.selectButton);
        ReusableMethods.bekle(1);
////        16 En alttaki Gönder düğmesine tıklayın.
        ReusableMethods.scroll(sourcePage.submitButton);
        ReusableMethods.click(sourcePage.submitButton);
        ReusableMethods.bekle(2);
//        17 "Product cat: This field is required." ifadesinin görünür olduğunu doğrulayın
        System.out.println(sourcePage.productTitleFailed1.getText());
        Assert.assertTrue(sourcePage.productTitleFailed1.getText().contains("Product cat: This field is required."));



    }
}
