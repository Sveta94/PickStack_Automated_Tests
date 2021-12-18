package pages.profilescreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class ChangePasswordScreen extends AbstractScreen {
    public ChangePasswordScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Change Password\"`]")
    private WebElement CHANGE_PASSWORD_TEXT;

    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement DONE_BUTTON;

    @iOSXCUITFindBy(accessibility = "Cancel")
    private WebElement CANCEL_BUTTON;

    @iOSXCUITFindBy(accessibility = "Current Password")
    private WebElement CURRENT_PASSWORD_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`value == \"Password\"`][1]")
    private WebElement CURRENT_PASSWORD_FIELD;

    @iOSXCUITFindBy(accessibility = "New Password")
    private WebElement NEW_PASSWORD_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`value == \"Password\"`][2]")
    private WebElement NEW_PASSWORD_FIELD;

    @iOSXCUITFindBy(accessibility = "Confirm Password")
    private WebElement CONFIRM_PASSWORD_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`value == \"Confirm new password\"`]")
    private WebElement CONFIRM_PASSWORD_FIELD;

    //Methods

    public String getEditProfileText() {
        return appiumUtils.getText(CHANGE_PASSWORD_TEXT);
    }

    public ChangePasswordScreen tapCancelButton(){
        appiumUtils.click(CANCEL_BUTTON);
        return this;
    }

    public ChangePasswordScreen tapDoneButton(){
        appiumUtils.click(DONE_BUTTON);
        return this;
    }

    public String getCurrentPasswordText() {
        return appiumUtils.getText(CURRENT_PASSWORD_TEXT);
    }

    public ChangePasswordScreen setCurrentPasswordField(String newCurrentPassword){
        appiumUtils.sendText(CURRENT_PASSWORD_FIELD, newCurrentPassword);
        return this;
    }

    public String getNewtPasswordText() {
        return appiumUtils.getText(NEW_PASSWORD_TEXT);
    }

    public ChangePasswordScreen setNewPasswordField(String newPassword){
        appiumUtils.sendText(NEW_PASSWORD_FIELD, newPassword);
        return this;
    }
    public String getConfirmPasswordText() {
        return appiumUtils.getText(NEW_PASSWORD_TEXT);
    }

    public ChangePasswordScreen setConfirmPasswordField(String confirmNewPassword){
        appiumUtils.sendText(CONFIRM_PASSWORD_FIELD, confirmNewPassword);
        return this;
    }

}
