package tests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;

public class US06_SitedeAlısverisYapabilme extends ExtentReport {
    @Test
    public void testName() {
        extentTest = extentReports.createTest("Sign In Test",
                "Kullanıcı başarili bir şekilde giris yapabilmeli");
        //Anasayfaya git
        ReusableMethods.giris();
        extentTest.info("Anasayfaya gidildi");
        //Giriş yap
        ReusableMethods.signIn("userName", "password");
        extentTest.info("Başarili bir giris yapildi");
        //Arama kutusunda 'shoes' arat
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        ReusableMethods.bekle(3);
        alloverCommercePage.searchBox1.sendKeys(ConfigReader.getProperty("product"), Keys.ENTER);
        extentTest.info("Arama kutusunda ürün aratildi.");
        //Çıkan ilk ürünü seç
        ReusableMethods.bekle(3);
        alloverCommercePage.product.click();
        extentTest.info("Çıkan ilk ürün seçildi.");
        //Seçilen ürünün miktarında değişiklik yap
        alloverCommercePage.urunArttirma.click();
        extentTest.info("Ürün miktari arttirildi.");
        alloverCommercePage.urunAzaltma.click();
        extentTest.info("Ürün miktari azaltildi");
        //Sepete ürünü ekle
        alloverCommercePage.addToCart.click();
        extentTest.info("Ürün sepete eklendi.");
        //Sepetime tikla
        alloverCommercePage.cartIcon.click();
        extentTest.info("Sepetime tiklandi.");
        //Ürünün sepette göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.cartProduct.isDisplayed());
        extentTest.info("Ürünün sepette olduğu doğrulandi.");
        //Checkout a tikla
        alloverCommercePage.checkout.click();
        extentTest.info("Checkout'a tiklandi.");
        //Satın alma için fatura adresinin göründüğünü doğrula
        Assert.assertTrue(alloverCommercePage.billingDeteils.isDisplayed());
        extentTest.info("Satin almak için fatura adresi görüldü");
        //Ödeme Seçenekleri görünmeli
        Assert.assertTrue(alloverCommercePage.paymentMethod.isDisplayed());
        extentTest.info("Ödeme seçenekleri görüldü.");
        //Ödeme seçeneklerinden seçilebilir olmali
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(1,650);
        actions.perform();
        ReusableMethods.bekle(3);
        Assert.assertTrue(alloverCommercePage.transferEFT.isSelected());
        alloverCommercePage.payAtTheDoor.click();
        Assert.assertTrue(alloverCommercePage.payAtTheDoor.isSelected());
        extentTest.info("EFT yöntemi seçilebilir olduğu doğrulandi.");
        extentTest.info("Diğer ödeme şeklinin seçilebilir olduğu doğrulandi.");
        //Ödeme seçeneklerinde EFT' yi seç
        alloverCommercePage.transferEFT.click();
        extentTest.info("Ödeme yöntemlerinden EFT seçildi.");
        //Sipariş ver butonuna tikla
        alloverCommercePage.placeOrder.click();
        extentTest.info("Sipariş ver ikonuna tiklandi.");
        //Satın alma işleminin başarılı bir şekilde gerçekleştiğini doğrula
        ReusableMethods.bekle(10);
        Assert.assertTrue(alloverCommercePage.thankYouText.isDisplayed());
        extentTest.info("'Thank you. Your order has been received.' yazisi görüldü.");
        extentTest.pass("Satin alma işleminin başarili bir şekilde gerçekleştiği doğrulandi.");
    }
}
