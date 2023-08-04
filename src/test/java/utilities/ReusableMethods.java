package utilities;
import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.AlloverCommercePage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




import static utilities.ExtentReport.extentTest;


public class ReusableMethods {





        //Shipping adress ekleme
        public static void shippingAddressAdd (String name, String surname, String country, String street, String
        city, String state, String zipcode){
            AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
            //Click on “My Account” button
            ReusableMethods.click(alloverCommercePage.anaSayfaMyAccount);
            extentTest.info("“My Account” button has been clicked.");
            //Click on “Addresses" button
            alloverCommercePage.addresses.click();
            extentTest.info("“Addresses” button has been clicked.");
            //Click on “ADD” button below “Billing Address"
            alloverCommercePage.shipingAddressAdd.click();
            extentTest.info("“Add” button has been clicked.");
            //Enter “First Name” field blank
            alloverCommercePage.shippingFirstName.sendKeys(ConfigReader.getProperty(name));
            extentTest.info("“First Name” has entered in the first name field");
            //Enter “Last Name” in the last name field
            alloverCommercePage.shippingLastName.sendKeys(ConfigReader.getProperty(surname));
            extentTest.info("“Last Name” has entered in the last name field");
            //Select Country/Region
            WebElement ddmCountry = alloverCommercePage.shippingCountry;
            ReusableMethods.ddmVisibleText(ddmCountry, country);
            extentTest.info("Country/Region has selected.");
            //Enter Street Adress in street address field
            alloverCommercePage.shippingStreet.sendKeys(ConfigReader.getProperty(street));
            extentTest.info("“Street Adddress” has entered in the street address field");
            //Enter Town/City in town/city field
            alloverCommercePage.shippingCity.sendKeys(ConfigReader.getProperty(city));
            extentTest.info("“Town/City” has entered in the Town/City field");
            //Select State
            WebElement ddmState = alloverCommercePage.shippingState;
            ReusableMethods.ddmVisibleText(ddmState, state);
            extentTest.info("State has selected.");
            //Enter PostCode/ZIP in postcode/zip field
            alloverCommercePage.shippingZipCode.sendKeys(ConfigReader.getProperty(zipcode));
            extentTest.info("“PostCode/ZIP” has entered in the PostCode/ZIP field");
            extentTest.info("Filled the Shipping Addresses data's successfully");

        }

        //Billing adress ekleme
        public static void billingAddressAdd (String name, String surname, String country, String street, String
        city, String state, String zipcode, String phone){
            AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
            //Click on “My Account” button
            ReusableMethods.click(alloverCommercePage.anaSayfaMyAccount);
            extentTest.info("“My Account” button has been clicked.");
            //Click on “Addresses" button
            alloverCommercePage.addresses.click();
            extentTest.info("“Addresses” button has been clicked.");
            Actions actions = new Actions(Driver.getDriver());
            actions.scrollByAmount(1,250);
            actions.perform();
            //Click on “ADD” button below “Billing Address"
            alloverCommercePage.billingAddressAdd.click();
            extentTest.info("“Add” button has been clicked.");
            //Enter “First Name” field blank
            alloverCommercePage.billingFirstName.sendKeys(ConfigReader.getProperty(name));
            extentTest.info("“First Name” has entered in the first name field");
            //Enter “Last Name” in the last name field
            alloverCommercePage.billingLastName.sendKeys(ConfigReader.getProperty(surname));
            extentTest.info("“Last Name” has entered in the last name field");
            //Select Country/Region
            WebElement ddmCountry = alloverCommercePage.billingCountry;
            ReusableMethods.ddmVisibleText(ddmCountry, country);
            extentTest.info("Country/Region has selected.");
            //Enter Street Adress in street address field
            alloverCommercePage.billingStreet.sendKeys(ConfigReader.getProperty(street));
            extentTest.info("“Street Adddress” has entered in the street address field");
            //Enter Town/City in town/city field
            alloverCommercePage.billingCity.sendKeys(ConfigReader.getProperty(city));
            extentTest.info("“Town/City” has entered in the Town/City field");
            //Select State
            WebElement ddmState = alloverCommercePage.billingState;
            ReusableMethods.ddmVisibleText(ddmState, state);
            extentTest.info("State has selected.");
            //Enter PostCode/ZIP in postcode/zip field
            alloverCommercePage.billingZipCode.sendKeys(ConfigReader.getProperty(zipcode));
            extentTest.info("“PostCode/ZIP” has entered in the PostCode/ZIP field");
            //Enter Phone Number in phone number field
            alloverCommercePage.billingPhone.sendKeys(ConfigReader.getProperty(phone));
            extentTest.info("“Phone Number” has entered in the Phone Number field");
            extentTest.info("Filled the Billing Addresses data's successfully");

        }
        //Negatif Dogrulama
        public static void negativeVerify (String webelementName){
            AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
            //Click on “Save Address” button
            alloverCommercePage.saveAddress.submit();
            extentTest.info("Clicked on “Save Address” button successfully");
            //See required field message
            ReusableMethods.bekle(3);
            Assert.assertTrue(alloverCommercePage.warningNegative.isDisplayed());
            ReusableMethods.webElementResmi(alloverCommercePage.warningNegative);
            extentTest.info(webelementName + " is a required field” message has seen successfuly.");
            //Click on “Addresses" button
            alloverCommercePage.addresses.click();
            extentTest.info("Clicked on “Addresses” button successfully");
            //Verify that address is not added below “Billing Address” section
            Assert.assertTrue(alloverCommercePage.billingAddressAdd.isEnabled());
            ReusableMethods.tumSayfaResmi("Address Info Page");
            extentTest.pass("Verifed that address is not added below “Billing or Shipping Address” section");
        }
        //Pozitif Dogrulama
        public static void pozitiveVerify () {
            AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
            //Click on “Save Address” button
            alloverCommercePage.saveAddress.submit();
            extentTest.info("Clicked on “Save Address” button successfully");
            //Verify that the address is successfully registered
            ReusableMethods.bekle(3);
            ReusableMethods.webElementResmi(alloverCommercePage.warningPozitive);
            Assert.assertTrue(alloverCommercePage.warningPozitive.isDisplayed());
            extentTest.pass("Verified that the address is successfully registered");
        }

        //Sign in method
        public static void signIn (String username, String password){
            AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
            alloverCommercePage.anasayfaSignIn.click();
            alloverCommercePage.username.sendKeys(ConfigReader.getProperty(username),
                    Keys.TAB, ConfigReader.getProperty(password));
            alloverCommercePage.loginButton.click();
            extentTest.info("Navigated to “Sign in” page and Sign in successfully");
        }
        //Anasayfa Giris Method
        public static void giris () {

            Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));
            extentTest.info("Went to the homepage successfully");
        }
        public static void register () {
            AlloverCommercePage alloverCommercePage = new AlloverCommercePage();
            alloverCommercePage.anasayfaRegister.click();

            ReusableMethods.bekle(3);

            Faker faker = new Faker();
            String fakeUserName = faker.name().username();
            String fakeEmail = faker.internet().emailAddress();
            alloverCommercePage.fakeUserName.sendKeys(fakeUserName);
            alloverCommercePage.fakeEmail.sendKeys(fakeEmail);
            alloverCommercePage.signUpPassword.sendKeys(ConfigReader.getProperty("kullaniciPassWord"));
            alloverCommercePage.IagreeToText.click();
            alloverCommercePage.SignUpOnay.click();
        }


        //HARD WAIT METHOD
        public static void bekle ( int saniye){
            try {
                Thread.sleep(saniye * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //Alert ACCEPT
        public static void alertAccept () {
            Driver.getDriver().switchTo().alert().accept();
        }

        //Alert DISMISS
        public static void alertDismiss () {
            Driver.getDriver().switchTo().alert().dismiss();
        }

        //Alert getText()
        public static void alertText () {
            Driver.getDriver().switchTo().alert().getText();
        }

        //Alert promptBox
        public static void alertprompt (String text){
            Driver.getDriver().switchTo().alert().sendKeys(text);
        }

        //DropDown VisibleText
    /*
        Select select2 = new Select(gun);
        select2.selectByVisibleText("7");

        //ddmVisibleText(gun,"7"); --> Yukarıdaki kullanım yerine sadece method ile handle edebilirim
     */
        public static void ddmVisibleText (WebElement ddm, String secenek){
            Select select = new Select(ddm);
            select.selectByVisibleText(secenek);
        }

        //DropDown Index
        public static void ddmIndex (WebElement ddm,int index){
            Select select = new Select(ddm);
            select.selectByIndex(index);
        }

        //DropDown Value
        public static void ddmValue (WebElement ddm, String secenek){
            Select select = new Select(ddm);
            select.selectByValue(secenek);
        }
        //DropDown deselect
        public static void ddmDeselect (WebElement ddm, String secenek){
            Select select = new Select(ddm);
            select.deselectByVisibleText(secenek);
        }

        //SwitchToWindow1
        public static void switchToWindow ( int sayi){
            List<String> tumWindowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
            Driver.getDriver().switchTo().window(tumWindowHandles.get(sayi));
        }

        //SwitchToWindow2
        public static void window ( int sayi){
            Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[sayi].toString());
        }
        //EXPLICIT WAIT METHODS

        //Visible Wait
        public static void visibleWait (WebElement element,int sayi){
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
            wait.until(ExpectedConditions.visibilityOf(element));

        }

        //VisibleElementLocator Wait
        public static WebElement visibleWait (By locator,int sayi){
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        }

        //Alert Wait
        public static void alertWait ( int sayi){
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
            wait.until(ExpectedConditions.alertIsPresent());

        }

        //Tüm Sayfa ScreenShot
        public static String tumSayfaResmi (String name){
            String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
            String dosyaYolu = "TestOutput/screenshot/screenshot" + tarih + ".png";
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            try {
                FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return tarih;
        }

        //WebElement ScreenShot
        public static void webElementResmi (WebElement element){
            String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
            String dosyaYolu = "TestOutput/screenshot/webElementScreenshot" + tarih + ".png";

            try {
                FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //WebTable
        public static void printData ( int satir, int sutun){
            WebElement satirSutun = Driver.getDriver().findElement(By.xpath("(//tbody)[1]//tr[" + satir + "]//td[" + sutun + "]"));
            System.out.println(satirSutun.getText());
        }

        //Click Method
        public static void click (WebElement element){
            try {
                element.click();
            } catch (Exception e) {
                JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
                js.executeScript("arguments[0].click();", element);
            }
        }

        //JS Scroll
        public static void scroll (WebElement element){
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", element);
        }

        //JS Sayfa Sonu Scroll
        public static void scrollEnd () {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        }

        //JS Sayfa Başı Scroll
        public static void scrollHome () {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        }

        //JS SendKeys
        public static void sendKeysJS (WebElement element, String text){
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].value='" + text + "'", element);
        }

        //JS SendAttributeValue
        public static void sendAttributeJS (WebElement element, String text){
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
        }

        //JS GetAttributeValue
        public static void getValueByJS (String id, String attributeName){
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            String attribute_Value = (String) js.executeScript("return document.getElementById('" + id + "')." + attributeName);
            System.out.println("Attribute Value: = " + attribute_Value);

        }


        //File Upload Robot Class
        public static void uploadFile (String dosyaYolu){
            try {
                bekle(3);
                StringSelection stringSelection = new StringSelection(dosyaYolu);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                robot.delay(3000);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                robot.delay(3000);
            } catch (Exception ignored) {

            }
        }


    }
