package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AlloverCommercePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US19_ShopWithCouponsAsClient {

    @Test
    public void test01() {
        // Go to the page "https://allovercommerce.com/"
        Driver.getDriver().get(ConfigReader.getProperty("allovercommerceUrl"));

        // Click SearchBox line.
        // Write Penapen.
        AlloverCommercePage alloverCommercePage=new AlloverCommercePage();
        alloverCommercePage.searchBox.sendKeys("Penapen");

        // Click search buton.
        alloverCommercePage.searchButton.click();
        //ReusableMethods.bekle(3);

        //Click first item image.
        alloverCommercePage.searchForPenapenSecondImg.click();

        //Click "Add to cart" button.
        alloverCommercePage.addToCartButton.click();

        //Click "Cart" button.
        alloverCommercePage.cartButton.click();
        ReusableMethods.bekle(3);

        //Click "View cart" button.
        alloverCommercePage.viewCartButton.click();

        //Two times click quantity plus(+) button.
        alloverCommercePage.plussButton.click();
        alloverCommercePage.plussButton.click();

        //Click "Update cart" button.
        alloverCommercePage.updateCartButton.click();
        ReusableMethods.bekle(6);

        //Click "Proceed to Checkout" button.
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0,700).perform();
        ReusableMethods.click(alloverCommercePage.proceedToCheckOutButton);

        //Click "Pay at the door" button in your order menu.
        actions.scrollByAmount(0,700).perform();
        alloverCommercePage.payAtTheDoorRadioButton.click();

       //Click first name and write your firtname
        alloverCommercePage.billingFirstName.sendKeys("Alex");
       //Click last name and write your lastname
       //Click country/region.
       //Click Street adress menu.
       //Write your adress.
       //Click Postcode/Zip.
       //Write your Postcode
       //Click Town/City.
       //Write your town.
       //Click province.
       //Write your city
       //Click Phone and write your phone number
       //Click email adress and write your email adress.
       //Click "ENTER YOUR CODE" section.
       // Write your code.
       //Click "Apply Button"
       //Click "Place Order" button.
    }

    @Test
    public void test02() {
        //Go to the page "https://allovercommerce.com/"
        //Click sign in button.
        //Click username or email adress section and write your email.
        //Click password and write your password
        //Click sign in button.
        //Click SearchBox line.
        //Write Penapen.
        //Click search buton.
        //Click first item image.
        //Click "Add to cart" button.
        //Click "Cart" button.
        //Click "View cart" button.
        //Two times click quantity plus(+) button.
        //Click "Update cart" button.
        //Click "Proceed to Checkout" button.
        //Click "Pay at the door" button in your order menu.
        //Click first name and write your firtname
        //Click last name and write your lastname
        //Click country/region.
        //Click Street adress menu.
        //Write your adress.
        //Click Postcode/Zip.
        //Write your Postcode
        //Click Town/City.
        //Write your town.
        //Click province.
        //Write your city
        //Click Phone and write your phone number
        //Click email adress and write your email adress.
        //Click "ENTER YOUR CODE" section.
        //Write your code.
        //Click "Apply Button"
    }
}
