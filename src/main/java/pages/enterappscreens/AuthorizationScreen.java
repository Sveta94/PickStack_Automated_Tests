package pages.enterappscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class AuthorizationScreen extends AbstractScreen {

    public AuthorizationScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(accessibility = "login_logo")
    private WebElement AUTHORIZATION_PAGE_LOGO;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign Up\"]")
    private WebElement SIGNUP_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
    private WebElement LOGIN_BUTTON;

    //Methods

    public boolean isLogoDisplayed(){
        return appiumUtils.isVisable(AUTHORIZATION_PAGE_LOGO);
    }

    public AuthorizationScreen tapSignUpButton(){
        appiumUtils.click(SIGNUP_BUTTON);
        return this;
    }

    public AuthorizationScreen tapLoginButton(){
        appiumUtils.click(LOGIN_BUTTON);
        return this;
    }

}
