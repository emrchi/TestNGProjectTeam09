package pages;


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




        @FindBy(xpath = "//*[@id='username']")
        public WebElement userName;

        @FindBy(xpath = "//*[@value='Sign In']")
        public WebElement signIn;

        @FindBy(xpath = "//*[@value='Sign In']")
        public WebElement signInButonu;

        @FindBy(xpath = "(//h2)[12]")
        public WebElement top20BestSeller;

        @FindBy(xpath = "//h3//a")
        public WebElement earphoneProduct;

        @FindBy(xpath = "//*[@name='add-to-cart']")
        public WebElement addToCartt;

        @FindBy(xpath = "//*[@type='search']")
        public WebElement searchBox;

        @FindBy(xpath = "(//img)[3]")
        public WebElement firstProduct;

        @FindBy(xpath = "//*[@name='add-to-cart']")
        public WebElement addToCartKazak;

//        @FindBy(xpath = "(//i)[6]")
//        public WebElement cartButton;

        @FindBy(xpath = "(//p//a)[1]")
        public WebElement viewCart;

        @FindBy(xpath = "(//*[text()='Shopping Cart'])[2]")
        public WebElement verifyShoppingCart;

        @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
        public WebElement proceedToCheckout;

        @FindBy(xpath = "//*[text()='Order Complete']")
        public WebElement verifyOrderComplete;

        @FindBy(xpath = "//*[@id='billing_first_name']")
        public WebElement billingFirstNameInfo;

        @FindBy(xpath = "//*[@id='billing_last_name']")
        public WebElement billingLastNameInfo;
        @FindBy(xpath = "(//select)[1]")
        public WebElement billingCountryName;
        @FindBy(xpath = "//*[@id='billing_address_1']")
        public WebElement billingAddressInfo;

        @FindBy(xpath = "//*[@name='billing_postcode']")
        public WebElement billingPostCodeInfo;

        @FindBy(xpath = "//*[@name='billing_city']")
        public WebElement billingCityName;

        @FindBy(xpath = "//*[@title='İzmir']")
        public WebElement billingCityNamee;

        @FindBy(xpath = "//*[@name='billing_phone']")
        public WebElement billingPhoneNumber;

        @FindBy(xpath = "//*[@name='billing_email']")
        public WebElement billingEmailInfo;

        @FindBy(xpath = "//*[text()='info@allovercommerce.com']")
        public WebElement eMailTextBox;

        @FindBy(xpath = "(//h3)[3]")
        public WebElement totalAmount;
        @FindBy(xpath = "(//*[@type='radio'])[1]")
        public WebElement selectRadioButton;

        @FindBy(xpath = "(//label)[20]")
        public WebElement payAtTheDoorButton;

        @FindBy(xpath = "//*[@data-value='Place order']")
        public WebElement placeOrderButton;

        @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
        public WebElement thankYouYazisi;

        @FindBy(xpath = "//a[text()='My Orders']")
        public WebElement myOrdersButton;

        @FindBy(xpath = "(//h4)[2]")
        public WebElement orderView;

        @FindBy(xpath = "(//*[@id='menu-item-1079']")
        public WebElement myAccountButton;

        @FindBy(xpath = "//*[text()='Store Manager']")
        public WebElement storeManagerButton;

        @FindBy(xpath = "(//*[@class='text'])[6]")
        public WebElement couponsButton;

        @FindBy(xpath = "(//*[@class='text'])[18]")
        public WebElement addCouponsButton;

        @FindBy(xpath = "(//*[@class='wcfm-text wcfm_ele'])[1]")
        public WebElement codeButton;

        @FindBy(xpath = "//*[@name='description']")
        public WebElement descriptionButton;

        @FindBy(xpath = "(//select)[1]")
        public WebElement percentageDiscount;

        @FindBy(xpath = "(//*[@class='text'])[18]")
        public WebElement e;

















































































 //Suleyman Nasirdinov
//Demir Bilmez

    @FindBy(xpath = "//span[text()='Sign In']")
    public WebElement signInButton;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameArea;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordArea;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmit;
    @FindBy(xpath = "(//*[text()='My Account'])[4]")
    public WebElement myAccountClick;
    @FindBy(xpath = "//*[@class='icon-box-icon icon-addresses']")
    public WebElement addressessButton;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement addShippingAddress;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
    public WebElement editYourshippingAdress;
    @FindBy(xpath = "//*[@id='shipping_first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//*[@id='shipping_last_name']")
    public WebElement lastName;
    @FindBy(xpath = "(//span[@class='select2-selection__placeholder'])[1]")
    public WebElement country;
    @FindBy(xpath = "//*[@class='select2-search__field']")
    public WebElement countryArea;
    @FindBy(xpath = "//*[@id='shipping_address_1']")
    public WebElement streetAddress;
    @FindBy(xpath = "//*[@id='shipping_city']")
    public WebElement shippingCity1;
    @FindBy(xpath = "(//*[@class='select2-selection__placeholder'])[2]")
    public WebElement stateClick;
    @FindBy(xpath = "//*[@class='select2-search__field']")
    public WebElement stateArea;
    @FindBy(xpath = "//*[@id='shipping_postcode']")
    public WebElement zipCodeArea;
    @FindBy(xpath = "//span[@class='select2-selection__placeholder']")
    public WebElement province;
    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement provinceArea;
    @FindBy(xpath = "//*[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement verifyMessage;

    @FindBy(xpath = "//select[@id='shipping_country']")
    public WebElement countryDdm;
    @FindBy(xpath = "//select[@id='shipping_state']")
    public WebElement provinceDdm;


    @FindBy(xpath = "//*[@class='btn btn-dark btn-rounded btn-sm']")
    public WebElement saveAddress1;

    @FindBy(xpath = "//select[@id='shipping_state']")
    public WebElement stateDdm;

    @FindBy(xpath = "//*[@class=' alert alert-simple alert-icon alert-close-top alert-danger']")
    public WebElement errorMessage;



























































    

















































































  
    //Demir Bilmez
    //Hafize Aktas
    @FindBy (xpath = "//*[.='Register'][1]" )
    public WebElement register;
    @FindBy (xpath = "//*[@class = 'register_as_vendor']")
    public WebElement signUpAsVendor;
    @FindBy (xpath = "//*[@id = 'user_email']")
    public WebElement email;
    @FindBy (xpath = "//*[@type='password'][1]")
    public WebElement password;
    @FindBy (xpath = "(//div)[67]")
    public WebElement codeSentMessage;
    @FindBy(xpath = "//*[@id = 'confirm_pwd']")
    public WebElement confirmPassword;
    @FindBy (xpath = "//*[@class='wcfm_submit_button']")
    public WebElement registerFinalButton;
    @FindBy (xpath = "(//input)[4]")
    public WebElement verificationCodeAlani;
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
    @FindBy (xpath = "//*[@class = 'color cetc']")
    public WebElement fakeMailCopy;
    @FindBy (xpath = "//*[@class='hidden-xs hidden-sm klikaciRadek newMail'][1]")
    public WebElement mailVerificationCode;
    @FindBy (xpath = "//div//p//b")
    public WebElement verificationCode;
    @FindBy (xpath = "//*[@class='wcfm-message wcfm-success']")
    public WebElement registrationSuccessful;
    @FindBy (xpath = "//*[@class='button button-large']")
    public WebElement notRightNowButton;
    @FindBy (xpath = "//*[.='Sign Out'][1]")
    public WebElement signOutButton;
    @FindBy (xpath = "//*[.='Log out']")
    public WebElement confirmAndLogOut;
    @FindBy (xpath = "(//iframe)[2]")
    public WebElement iframeFakeMail;
    @FindBy (xpath = "(//div)[72]")
    public WebElement alreadyRegisteredMessage;


























































































































































    //Hafize Aktas
    //Ibrahim






































































































































































































    //Ibrahim
    //Ferat Toktas
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement searchBox01;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement searchButton;
    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[4]")
    public WebElement searchForPenapenSecondImg;
    @FindBy(xpath = "//a[text()='PenaPEN']")
    public WebElement searchForPenapenLoginSecondImg;
    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addToCartButton;
    @FindBy(xpath = "(//i[@class='w-icon-cart'])[1]")
    public WebElement cartButton;
    @FindBy(xpath = "//*[text()='View cart']")
    public WebElement viewCartButton;
    @FindBy(xpath = "//button[@class='quantity-plus w-icon-plus']")
    public WebElement plussButton;
    @FindBy(xpath = "//button[@name='update_cart']")
    public WebElement updateCartButton;
    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']")
    public WebElement proceedToCheckOutButton;
    @FindBy(xpath = "(//input[@name='payment_method'])[2]")
    public WebElement payAtTheDoorRadioButton;
    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement billingProvince;
    @FindBy(xpath = "//a[text()='Enter your code']")
    public WebElement billingEnterYourCodeLink;
    @FindBy(xpath = "//input[@name='coupon_code']")
    public WebElement billingCouponCodeField;
    @FindBy(xpath = "//button[@name='apply_coupon']")
    public WebElement billingApplyCouponButton;
    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement billingPlaceOrderButton;
    @FindBy(xpath = "//a[text()='Orders']")
    public WebElement vendorOrderLink;
    @FindBy(xpath = "//div[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']    ")
    public WebElement couponAppliedSuccessfullyText;
    @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement orderRecievedSuccessfullyText;
    @FindBy(xpath = "//span[text()='Status']")
    public WebElement orderStatusText;
    @FindBy(xpath = "(//bdi)[6]")
    public WebElement totalAmountText;




























































































































































    //Ferat Toktas
    // Mecid
    @FindBy(xpath = "//*[@class='wcfm_menu_toggler wcfmfa fa-bars text_tip']")
    public WebElement orders;

    @FindBy(xpath = "(//*[text()='Downloads'])[2]")
    public WebElement downloads;

    @FindBy(xpath = "(//*[text()='Wishlist'])[2]")
    public WebElement wishlist;


    @FindBy(linkText = "https://allovercommerce.com/my-account-2/support-tickets/")
    public WebElement supportTickets;

    @FindBy(linkText = "https://allovercommerce.com/my-account-2/followings/")
    public WebElement followings;

    @FindBy(linkText = "https://allovercommerce.com/my-account-2/customer-logout/?_wpnonce=e46de17014")
    public WebElement logOut;

    @FindBy(xpath= "//h4[@class='icon-box-title text-normal']")
    public WebElement adressVerifyText;

















































































































































































    //Mecid
    //Nalan Demir
    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myaccount;
    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement dashboard;
    @FindBy(xpath = "(//*[text()='Account details'])[1]")
    public WebElement accountDetails;
    @FindBy(xpath = "(//*[@type='text'])[3]")
    public WebElement displayName;
    @FindBy(xpath = "(//*[@type='text'])[2]")
    public WebElement changeLastName;
    @FindBy(xpath = "(//*[@type='text'])[1]")
    public WebElement changeName;
    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement changeEmail;
    @FindBy(xpath ="//*[@id='user_description-html']")
    public WebElement Text;
    @FindBy(xpath="//*[@id='user_description']")
    public WebElement biography;
    @FindBy(xpath="(//*[@type='button'])[3]")
    public WebElement B;
    @FindBy(xpath="(//*[@type='password'])[1]")
    public WebElement changePasswrd1;
    @FindBy(xpath="(//*[@type='password'])[2]")
    public WebElement changePaswrd2;
    @FindBy(xpath="(//*[@type='password'])[3]")
    public WebElement changePasswrd3;
    @FindBy(xpath="//div[@ class=\"woocommerce-message alert alert-simple alert-icon alert-close-top alert-success\"]")
    public WebElement changeVerify;
    @FindBy(xpath="(//*[@type='search'])[1]")
    public WebElement searchBox1;
    @FindBy(xpath="//*[@alt='Pen']")
    public WebElement product;
    @FindBy(xpath="//*[@alt='Pen']")
    public WebElement addToCart;
    @FindBy(xpath="//*[@class='w-icon-cart']")
    public WebElement cartIcon;
    @FindBy(xpath="//*[@class='button checkout wc-forward']")
    public WebElement checkout;
    @FindBy(xpath="//*[@type='number']")
    public WebElement quantityBox;
    @FindBy(xpath="//*[@for='billing_country']")
    public WebElement country1;
    @FindBy(xpath="(//h4)[3]")
    public WebElement paymentMethods;
    @FindBy(xpath="//*[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement thankYouText;
    @FindBy(xpath="//*[@id='place_order']")
    public WebElement placeOrder;






















































































































































    //Nalan Demir
    //Sema Malkoc
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
