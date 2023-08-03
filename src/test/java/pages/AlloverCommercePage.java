package pages;



import org.openqa.selenium.By;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlloverCommercePage {
public AlloverCommercePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    //Ahmet Gul
    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement login;

    @FindBy(xpath = "(//*[@name='username'])[1]")
    public WebElement username;

    @FindBy(xpath = "//*[@id='menu-item-1079']")
    public WebElement myAccount;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public WebElement storeManager;

    @FindBy(xpath = "//*[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement products;

    @FindBy(xpath = "//*[@id='add_new_product_dashboard']")
    public WebElement addNew;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[1]")
    public WebElement inventory;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[4]")
    public WebElement shipping;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[7]")
    public WebElement linked;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[8]")
    public WebElement seo;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[8]")
    public WebElement advanced;

    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement productTitle;

    @FindBy(xpath = "//*[@id='sku']")
    public WebElement sku;

    @FindBy(xpath = "//*[@id='manage_stock']")
    public WebElement manageStock;

    @FindBy(xpath = "(//*[@type='number'])[3]")
    public WebElement stockStatus;

    @FindBy(xpath = "//*[@id='sold_individually']")
    public WebElement soldIndividually;

    @FindBy(xpath = "//*[@name='draft-data']")
    public WebElement draftData;

    @FindBy(css = "span[class='wcicon-status-completed']")
    public WebElement productSuccess;

    @FindBy(xpath = "//*[@id=\"wcfm-products\"]/tbody/tr/td[4]")
    public WebElement skugorunmesi;

    @FindBy(xpath = "//*[@class='instock']")
    public WebElement inStockOnline;

    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_shipping_head\"]/div")
    public WebElement shipp1;

    @FindBy(xpath = "//select[@id='_wcfmmp_processing_time']")
    public WebElement processingTime;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[5]")
    public WebElement attributes;

    @FindBy(xpath = "(//*[@class='wcfm-text wcfm_ele simple variable booking'])[1]")
    public WebElement weight;

    @FindBy(xpath = "//*[@value='Preview']")
    public WebElement preview;

    @FindBy(xpath = "//*[@class='nav-item additional_information_tab']")
    public WebElement spefication;

    @FindBy(xpath = "(//*[@class='woocommerce-product-attributes-item__value'])[1]")
    public WebElement specsdisplay1;

    @FindBy(xpath = "(//*[@class='woocommerce-product-attributes-item__value'])[2]")
    public WebElement specsdisplay2;

    @FindBy(xpath = "//*[@id='attributes_is_active_1']")
    public WebElement colorSelected;

    @FindBy(xpath = "//*[@title='Check to associate this attribute with the product']")
    public WebElement activeSelected;

    @FindBy(xpath = "(//*[@class='select2-selection select2-selection--multiple'])[2]")
    public WebElement colorSec;

    @FindBy(xpath = "//*[@id='attributes_is_active_2']")
    public WebElement sizeSelected;

    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement virtualSelected;

    @FindBy(xpath = "//*[@id='is_downloadable']")
    public WebElement downloadedselected;

    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement sales;

    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement prices;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[3]")
    public WebElement accessories;

    @FindBy(xpath = "//*[@id='product_cats_checklist']")
    public WebElement checklist;

    @FindBy(xpath = "//*[@id=\"menu-item-browse\"]")
    public WebElement mediaLibrary;

    @FindBy(xpath = "//*[@id=\"__attachments-view-54\"]/li[3]/div/div/div/img")
    public WebElement resimIcon;

    @FindBy(xpath = "//*[@id=\"__attachments-view-128\"]/li[3]/div/div/div/img")
    public WebElement resimIcon2;
    @FindBy(xpath = "//*[@id='featured_img_display']")
    public WebElement resimsec;
    @FindBy(xpath = "//*[@id='gallery_img_gimage_0_display']")
    public WebElement resimsec2;
    @FindBy(xpath = "//*[@class='button media-button button-primary button-large media-button-select']")
    public WebElement selectButton;

    @FindBy(xpath = "//*[@class='wcfm_product_manager_general_fields']")
    public WebElement urunGorunumStatus;

    @FindBy(css = "div[id='wcfm_products_simple_submit']")
    public WebElement imgfailed;

    @FindBy(xpath = "//*[@name='submit-data']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Product Successfully Saved.']")
    public WebElement productSucces;

    @FindBy(xpath = "//*[text()='Product cat: This field is required.']")
    public WebElement productTitleFailed1;

    @FindBy(xpath = "//*[text()='Featured img: This field is required.']")
    public WebElement imgFailed1;

    @FindBy(xpath = "//*[text()='Gallery Images: This field is required.']")
    public WebElement galleryİmage;


































  //Ahmet Gul
  // Emre Yilmaz
    @FindBy(xpath = "//*[@name='login']")
    public WebElement loginButton;
    @FindBy(xpath = "//a[text()='Addresses']")
    public WebElement addresses;
    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement billingAddressAdd;
    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement shipingAddressAdd;
    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement billingFirstName;
    @FindBy(xpath = "//input[@id='shipping_first_name']")
    public WebElement shippingFirstName;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement billingLastName;
    @FindBy(xpath = "//input[@id='shipping_last_name']")
    public WebElement shippingLastName;
    @FindBy(xpath = "(//select)[1]")
    public WebElement billingCountry;
    @FindBy(xpath = "(//select)[1]")
    public WebElement shippingCountry;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement billingStreet;
    @FindBy(xpath = "//input[@id='shipping_address_1']")
    public WebElement shippingStreet;
    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement billingCity;
    @FindBy(xpath = "//input[@id='shipping_city']")
    public WebElement shippingCity;
    @FindBy(xpath = "(//select)[2]")
    public WebElement billingState;
    @FindBy(xpath = "(//select)[2]")
    public WebElement shippingState;
    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement billingZipCode;
    @FindBy(xpath = "//input[@id='shipping_postcode']")
    public WebElement shippingZipCode;
    @FindBy(xpath = "//input[@id='billing_phone']")
    public WebElement billingPhone;
    @FindBy(xpath = "//input[@id='billing_email']")
    public WebElement billingEmail;
    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement saveAddress;
    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement anaSayfaMyAccount;
    @FindBy(xpath = "//*[@class=' alert alert-simple alert-icon alert-close-top alert-danger']")
    public WebElement warningNegative;
    @FindBy(xpath = "//a[text()='Edit Your Billing Address']")
    public WebElement editYourBillingAddressButton;
    @FindBy(xpath = "//*[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement warningPozitive;




















































































































































    //Emre Yilmaz
    //Suleyman Nasirdinov




























































































    









































































































    //Suleyman Nasirdinov
   //Demir Bilmez






































































































































































































    //Demir Bilmez
    //Hafize Aktas
    @FindBy (xpath = "(//span)[14]" )
    public WebElement register;
    @FindBy (xpath = "//*[@class = 'register_as_vendor']")
    public WebElement signUpAsVendor;
    @FindBy (xpath = "//*[@id = 'user_email']")
    public WebElement email;
    @FindBy (id = "passoword")
    public WebElement password;
    @FindBy (xpath = "(//div)[67]")
    public WebElement codeSentMessage;
    @FindBy(xpath = "//*[@id = 'confirm_pwd']")
    public WebElement confirmPassword;
    @FindBy (xpath = "(//input)[4]")
    public WebElement verificationCode;
    @FindBy (xpath = "(//input)[5]")
    public WebElement resendCode;

    @FindBy (id = "password_strength")
    public WebElement tooShort;
    @FindBy (id = "password_strength")
    public WebElement weak;
    @FindBy (id = "password_strength")
    public WebElement good;
    @FindBy (id = "password_strength")
    public WebElement strong;


 
  
  
  
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  //Hafize Aktas
  //Ibrahim 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    //Ibrahim
    //Mehmet Ali Obuz
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
      
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  
    //Mehmet Ali Obuz
    // Mecid






































































































































































































     //Mecid
    //Nalan Demir






































































































































































































    //Nalan Demir
    //Sema Malkoc
    @FindBy(xpath ="(//a[@class='nav-link active'])[2]")
    public WebElement kullaniciUserName;
    @FindBy(xpath="//*[@name='password']" )
    public WebElement kullaniciPassWord;
    @FindBy(xpath ="" )
    public WebElement kullaniciEmail;
    @FindBy(xpath ="//a[@class='login inline-type']" )
    public WebElement anasayfaSignIn;
    @FindBy(xpath ="//a[@class='register inline-type']" )
    public WebElement anasayfaRegister;

    @FindBy(xpath ="//*[@name='rememberme']" )
    public WebElement rememberMeBox;

    @FindBy(xpath ="" )
    public WebElement lostYourPasswordText;
    @FindBy(xpath ="(//p[@class='submit-status'])[1]" )
    public WebElement wrongUsernameOrPasswordText;
    @FindBy(xpath ="(//button[@type='submit'])[2]" )
    public WebElement SignInOnay;
    @FindBy(xpath ="(//a[@class='nav-link active'])[1]" )
    public WebElement signInButton;

    @FindBy(xpath ="//a[@href='signup']" )
    public WebElement signUpButton;

    @FindBy(id="reg_username")
    public WebElement fakeUserName;
    @FindBy(xpath ="//*[@name='email']" )
    public WebElement fakeEmail;
    @FindBy(xpath ="(//*[@name='password'])[2]" )
    public WebElement signUpPassword;
    @FindBy(xpath ="//*[@id='register-policy']" )
    public WebElement IagreeToText;

    @FindBy(linkText ="Become a Vendor" )
    public WebElement becomeAvendorText;
    @FindBy(xpath ="//*[@name='register']" )
    public WebElement SignUpOnay;
    @FindBy(xpath ="//*[text()='Sign Out']" )
    public WebElement verify;
    @FindBy(id ="reg_username" )
    public WebElement kayitliUserName;

    @FindBy(xpath="(//*[@class='submit-status'])[2]" )
    public WebElement negativeVerify;
    @FindBy(xpath ="//*[@name='email']" )
    public WebElement kayitliEmail;






















































































































































   //Sema Malkoc

}
