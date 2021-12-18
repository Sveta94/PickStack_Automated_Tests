package pages.profilescreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class MyAccountScreen extends AbstractScreen {
    public MyAccountScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Account\"`]")
    private WebElement ACCOUNT_TEXT;

    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement DONE_BUTTON;

    @iOSXCUITFindBy(accessibility = "Cancel")
    private WebElement CANCEL_BUTTON;

    @iOSXCUITFindBy(accessibility = "Email")
    private WebElement EMAIL_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextView")
    private WebElement EMAIL_FIELD;

    @iOSXCUITFindBy(accessibility = "Password")
    private WebElement PASSWORD_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextView")
    private WebElement CHANGE_PASSWORD_TEXT;


    //Methods

    public String getEditProfileText() {
        return appiumUtils.getText(ACCOUNT_TEXT);
    }

    public MyAccountScreen tapCancelButton(){
        appiumUtils.click(CANCEL_BUTTON);
        return this;
    }

    public MyAccountScreen tapDoneButton(){
        appiumUtils.click(DONE_BUTTON);
        return this;
    }

    public String getEmailText() {
        return appiumUtils.getText(EMAIL_TEXT);
    }

    public MyAccountScreen setEmailField(String newEmail) {
        appiumUtils.sendText(EMAIL_FIELD,newEmail);
        return this;
    }

    public String getPasswordText() {
        return appiumUtils.getText(PASSWORD_TEXT);
    }

    public String getChangePasswordText() {
        return appiumUtils.getText(CHANGE_PASSWORD_TEXT);
    }


}
