package pages.enterappscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class SignUpScreen extends AbstractScreen {

    public SignUpScreen(AppiumDriver driver) {

        super(driver);
    }


    // Main page elements
    @iOSXCUITFindBy(accessibility = "logo")
    private WebElement LOGO;

    @iOSXCUITFindBy(accessibility = "Sign Up")
    private WebElement SIGNUP_TEXT;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pickstack\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private WebElement EMAIL_FIELD;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pickstack\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]\n")
    private WebElement PASSWORD_FIELD;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Create account\"]")
    private WebElement CREATE_ACCOUNT_BUTTON;

    @iOSXCUITFindBy(accessibility = "Terms of Service")
    private WebElement TERMS_OF_SERVICE_LINK;

    @iOSXCUITFindBy(iOSClassChain =  "**/XCUIElementTypeStaticText[`label == \"Privacy & Terms\"`]")
    private WebElement PRIVACY_WEBPAGE;

    @iOSXCUITFindBy(accessibility =  "Sign up with Apple")
    private WebElement SIGNUP_WITH_APPLE_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Already have an account? Log In\"]")
    private WebElement LOGIN_FROM_SIGNUP_BUTTON;


    // Welcome page elements
    @iOSXCUITFindBy(accessibility =  "checkmark_large")
    private WebElement CHECKMARK_ICON;

    @iOSXCUITFindBy(accessibility =  "Welcome to the Collective")
    private WebElement WELCOME_TEXT;

    @iOSXCUITFindBy(accessibility =  "Thanks for joining us! Let’s create your profile.")
    private WebElement THANKS_TEXT;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    private WebElement CONTINUE_BUTTON;


    // Name page elements
    @iOSXCUITFindBy(accessibility =  "What’s your name?")
    private WebElement YOUR_NAME_TEXT;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pickstack\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private WebElement FULL_NAME_FIELD;


    // Username page elements
    @iOSXCUITFindBy(accessibility =  "Add a username")
    private WebElement ADD_USERNAME_TEXT;

    @iOSXCUITFindBy(accessibility = "Help people find you.")
    private WebElement FIND_YOU_TEXT;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pickstack\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private WebElement USERNAME;


    // Photo page elements
    @iOSXCUITFindBy(accessibility =  "Upload a profile photo")
    private WebElement UPLOAD_PHOTO_TEXT;

    @iOSXCUITFindBy(accessibility = "Help people recognize you.")
    private WebElement RECOGNIZE_YOU_TEXT;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add photo\"]")
    private WebElement UPLOAD_PHOTO_BUTTON;

    @iOSXCUITFindBy(accessibility = "Take photo")
    private WebElement TAKE_PHOTO_BUTTON;

    @iOSXCUITFindBy(accessibility = "Choose from library")
    private WebElement CHOOSE_FROM_LIBRARY_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSheet[@name=\" \"]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement CANCEL_BUTTON;

    @iOSXCUITFindBy(accessibility = "Photo, March 30, 2018, 8:14 PM")
    private WebElement CHOOSE_PHOTO_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Choose\"]")
    private WebElement CONFIRM_CHOOSE_PHOTO_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Change Photo\"]")
    private WebElement CHANGE_PHOTO_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Skip\"`]")
    private WebElement SKIP_BUTTON;




    //Bio page elements
    @iOSXCUITFindBy(accessibility = "Add a bio")
    private WebElement ADD_BIO_TEXT;

    @iOSXCUITFindBy(accessibility = "Tell us a little about yourself.")
    private WebElement ABOUT_YOU_TEXT;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pickstack\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextView")
    private WebElement ADD_BIO_FIELD;


    //Methods
    public boolean isLogoDisplayed(){
       return appiumUtils.isVisable(LOGO);
    }

    public String  getSignUpText(){
        return appiumUtils.getText(SIGNUP_TEXT);
    }

    public SignUpScreen setEmail(String email){
        appiumUtils.sendText(EMAIL_FIELD, email);
        return this;
    }

    public SignUpScreen setPassword(String password){
        appiumUtils.sendText(PASSWORD_FIELD, password);
        return this;
    }

    public SignUpScreen tapCreateAccountButton(){
        appiumUtils.click(CREATE_ACCOUNT_BUTTON);
        return this;
    }

    public SignUpScreen tapTermsOfServiceLink(){
        appiumUtils.click(TERMS_OF_SERVICE_LINK);
        return this;
    }

    public String getPrivacyTitle(){
        return appiumUtils.getText(PRIVACY_WEBPAGE);
    }

    public SignUpScreen tapSignUpWithAppleButton(){
        appiumUtils.click(SIGNUP_WITH_APPLE_BUTTON);
        return this;
    }

    public SignUpScreen tapLogInFromSignUpPageButton(){
        appiumUtils.click(LOGIN_FROM_SIGNUP_BUTTON);
        return this;
    }

    public SignUpScreen tapContinueButton(){
        appiumUtils.click(CONTINUE_BUTTON);
        return this;
    }

    public boolean isCheckmarkDisplayed(){
      return appiumUtils.isVisable(CHECKMARK_ICON);
    }

    public String getWelcomeText(){
       return appiumUtils.getText(WELCOME_TEXT);
    }

    public String getThanksText(){
        return appiumUtils.getText(THANKS_TEXT);
    }

    public String getYourNameText(){
        return appiumUtils.getText(YOUR_NAME_TEXT);
    }

    public SignUpScreen setFullName(String name){
        appiumUtils.sendText(FULL_NAME_FIELD, name);
        return this;
    }

    public String getAddUsernameText(){
       return appiumUtils.getText(ADD_USERNAME_TEXT);
    }

    public String getHelpFindYouText(){
       return appiumUtils.getText(FIND_YOU_TEXT);
    }

    public SignUpScreen setUsername(String username){
        appiumUtils.sendText(USERNAME,username);
        return this;
    }

    public String getUploadPhotoText(){
       return appiumUtils.getText(UPLOAD_PHOTO_TEXT);
    }

    public String getRecognizeYouText(){
     return appiumUtils.getText(RECOGNIZE_YOU_TEXT);
    }

    public SignUpScreen tapUploadPhotoButton(){
        appiumUtils.click(UPLOAD_PHOTO_BUTTON);
        return this;
    }

    public SignUpScreen tapTakePhotoButton(){
        appiumUtils.click(TAKE_PHOTO_BUTTON);
        return this;
    }

    public SignUpScreen tapChooseFromLibraryButton(){
        appiumUtils.click(CHOOSE_FROM_LIBRARY_BUTTON);
        return this;
    }

    public SignUpScreen tapCancelPhotoUpload(){
        appiumUtils.click(CANCEL_BUTTON);
        return this;
    }

    public SignUpScreen tapChoosePhotoButton(){
        appiumUtils.click(CHOOSE_PHOTO_BUTTON);
        return this;
    }
    public SignUpScreen tapConfirmChoosePhotoButton(){
        appiumUtils.click(CONFIRM_CHOOSE_PHOTO_BUTTON);
        return this;
    }

    public SignUpScreen tapChangePhotoButton(){
        appiumUtils.click(CHANGE_PHOTO_BUTTON);
        return this;
    }


    public String getAddBioText(){
       return appiumUtils.getText(ADD_BIO_TEXT);
    }

    public String getAboutYouText(){
       return appiumUtils.getText(ABOUT_YOU_TEXT);

    }

    public SignUpScreen setBio(String bio){
        appiumUtils.sendText(ADD_BIO_FIELD,bio);
        return this;
    }


    public SignUpScreen tapSkipButton(){
        appiumUtils.click(SKIP_BUTTON);
        return this;
    }


}