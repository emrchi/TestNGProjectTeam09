package pages;

<<<<<<< HEAD
=======
import org.openqa.selenium.By;
>>>>>>> main
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlloverCommercePage {
public AlloverCommercePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    public AlloverCommercePage(){PageFactory.initElements(Driver.getDriver(),this);}

    //Ahmet Gul







































  //Ahmet Gul
  //Emre Yilmaz
















































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

    @FindBy (xpath = "//*[@id = 'passoword']")
    public WebElement password;

    @FindBy(xpath = "//*[@id = 'confirm_pwd']")
    public WebElement confirmPassword;

    @FindBy (xpath = "(//input)[4]")
    public WebElement verificationCode;

    @FindBy (xpath = "(//input)[5]")
    public WebElement resendCode;




















































    //Hafize Aktas
    //Ibrahim Akcal
















































    //Ibrahim Akcal
    //Mehmet Ali Obuz
















































    //Mehmet Ali Obuz
    //Mecid
















































    //Mecid
    //Nalan Demir
















































    //Nalan Demir
    //Sema Malkoc
    @FindBy(xpath ="(//a[@class='nav-link active'])[2]" )
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
