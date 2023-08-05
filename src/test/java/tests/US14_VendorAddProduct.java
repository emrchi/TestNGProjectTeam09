package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US14_VendorAddProduct {
AlloverCommercePage allover=new AlloverCommercePage();
    @Test
    public void TC01() {
        Driver.getDriver().get(ConfigReader.getProperty("AlloverCommerceUrl"));
        ReusableMethods.bekle(3);
        allover.signInButton.click();
        ReusableMethods.bekle(3);
        allover.userNameArea.sendKeys(ConfigReader.getProperty("AlloverCommerceEmail"), Keys.TAB,ConfigReader.getProperty("AlloverCommercePassword"));
        ReusableMethods.bekle(3);
        allover.signInSubmit.click();
        ReusableMethods.bekle(3);
        //Scroll down the page until you see 'My account't and click.
        ReusableMethods.scroll(allover.myAccount);
        ReusableMethods.click(allover.myAccount);
        //Click 'Store Manager'
        allover.storManager.click();
        //Actions actions=new Actions(Driver.getDriver());
        //actions.scrollByAmount(0,1400);
        //ReusableMethods.bekle(1);
        ReusableMethods.scroll(allover.productTypeDdm);
        //Click 'Products'
        allover.products1.click();
        ReusableMethods.bekle(1);
        //Click 'Add New' button
        allover.addNew1.click();
        ReusableMethods.bekle(1);
        //actions.moveToElement(allover.productTypeDdm);
        ReusableMethods.bekle(1);
        //Select Product Type as "Simple Product"
        Select select=new Select(allover.productTypeDdm);
        select.selectByVisibleText("Simple Product");
        //Click on bigger(Featured img) image button
        allover.biggerImageButton.click();

        //Click on Select Files
        allover.selectFilesButton.click();
        //Upload photo
        ReusableMethods.bekle(2);
        ReusableMethods.uploadFile("\"C:\\Users\\demir\\OneDrive\\Masaüstü\\istockphoto-1157789866-612x612.jpg\"");
        ReusableMethods.bekle(10);
        allover.selectPhoto.click();
        //  ReusableMethods.bekle(5);
        //Enter Product Title
        allover.productTitle1.sendKeys("Laptop",Keys.TAB,"1200",Keys.TAB,"1350",Keys.ENTER);
        //Enter Product Short Description
        Driver.getDriver().switchTo().frame(allover.iframe1);
        allover.shortDescription.sendKeys("Excalibur Laptop");
        //Enter Product Description
        Driver.getDriver().switchTo().parentFrame();
        Driver.getDriver().switchTo().frame(allover.iframe2);
        allover.description.sendKeys("Excalibur 512 SSD,8GB RAM,RTX3050Ti");
        Driver.getDriver().switchTo().parentFrame();


        //Categories Field'a tiklanip yeni kategori eklenir
        ReusableMethods.scroll(allover.addNewButton);
        ReusableMethods.bekle(2);
        ReusableMethods.click(allover.addNewButton);
        allover.categoryName.sendKeys("Casper");
        allover.categoryAdd.click();
        ReusableMethods.alertAccept();
        ReusableMethods.bekle(5);
        ReusableMethods.alertAccept();
        ReusableMethods.bekle(2);
        ReusableMethods.webElementResmi(allover.categoryAdd);


//Yeni Product brands ekler
        allover.addProductBrands.click();
        allover.productBrandsName.sendKeys("Tech");
        allover.productBrandsAdd.click();
        ReusableMethods.alertAccept();
        ReusableMethods.webElementResmi(allover.productBrands);


    }
}



