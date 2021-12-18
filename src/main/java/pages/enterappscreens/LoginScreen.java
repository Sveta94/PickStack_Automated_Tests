package pages.enterappscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class LoginScreen extends AbstractScreen {

    public LoginScreen(AppiumDriver driver) {

        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"logo\"]")
    private WebElement LOGO;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Log In\"`][1]")
    private WebElement LOGIN_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    private WebElement EMAIL_FIELD;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
    private WebElement PASSWORD_FIELD;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Log In\"`]")
    private WebElement LOGIN_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Forgot password?\"`]")
    private WebElement FORGOT_PASSWORD_BUTTON;

    @iOSXCUITFindBy(accessibility = "Sign in with Apple")
    private WebElement SIGNIN_APPLE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Don’t have an account? Sign Up\"`]")
    private WebElement SUGNUP_FROM_LOGIN_BUTTON;

    @iOSXCUITFindBy(accessibility = "Please, enter valid email address")
    private WebElement WRONG_EMAIL_TEXT;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement OK_BUTTON;

    @iOSXCUITFindBy(accessibility = "Password should be at least 6 characters long")
    private WebElement WRONG_PASSWORD_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"“Pickstack” Would Like to Send You Notifications\"`]")
    private WebElement SEND_NOTIFICATIONS_TEXT;

    @iOSXCUITFindBy(accessibility = "Allow")
    private WebElement ALLOW_BUTTON;

    @iOSXCUITFindBy(accessibility = "Don’t Allow")
    private WebElement DONT_ALLOW_BUTTON;

    //Methods

    public boolean isLogoDisplayed(){
      return appiumUtils.isVisable(LOGO);
    }

    public String getLoginText(){
       return appiumUtils.getText(LOGIN_TEXT);
    }

    public LoginScreen setEmail(String email){
        appiumUtils.sendText(EMAIL_FIELD, email);
        return this;
    }

    public  LoginScreen clearPasswordField(){
        PASSWORD_FIELD.click();
        PASSWORD_FIELD.sendKeys(Keys.DELETE);
        return this;
    }
    public LoginScreen setPassword(String password){
        appiumUtils.sendText(PASSWORD_FIELD, password);
        return this;
    }

    public LoginScreen tapLoginButton(){
        appiumUtils.click(LOGIN_BUTTON);
        return this;
    }

    public LoginScreen tapForgotPasswordButton(){
        appiumUtils.click(FORGOT_PASSWORD_BUTTON);
        return this;
    }

    public LoginScreen tapSignInWithAppleButton(){
        appiumUtils.click(SIGNIN_APPLE_BUTTON);
        return this;
    }

    public LoginScreen tapSignUpFromLoginPageButton(){
        appiumUtils.click(SUGNUP_FROM_LOGIN_BUTTON);
        return this;
    }
    public String getWrongEmailText(){
        return appiumUtils.getText(WRONG_EMAIL_TEXT);
    }

    public String getWrongPasswordText(){
        return appiumUtils.getText(WRONG_PASSWORD_TEXT);
    }

    public LoginScreen tapOkButton(){
        appiumUtils.click(OK_BUTTON);
        return this;
    }
    public String getSendNotificationText(){
        return appiumUtils.getText(SEND_NOTIFICATIONS_TEXT);
    }

    public LoginScreen tapAllowButton(){
        appiumUtils.click(ALLOW_BUTTON);
        return this;
    }
    public LoginScreen tapDontAllowButton(){
        appiumUtils.click(DONT_ALLOW_BUTTON);
        return this;
    }

}