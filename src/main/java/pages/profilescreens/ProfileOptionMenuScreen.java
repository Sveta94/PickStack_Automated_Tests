package pages.profilescreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class ProfileOptionMenuScreen extends AbstractScreen {
    public ProfileOptionMenuScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(accessibility = "pencil_icon")
    private WebElement PENCIL_ICON;

    @iOSXCUITFindBy(accessibility = "Edit profile")
    private WebElement EDIT_PROFILE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"user_gold_icon\"`][1]")
    private WebElement ACCOUNT_ICON;

    @iOSXCUITFindBy(accessibility = "Account")
    private WebElement ACCOUNT_BUTTON;

    @iOSXCUITFindBy(accessibility = "**/XCUIElementTypeImage[`name == \"user_gold_icon\"`][2]")
    private WebElement TUTORIAL_ICON;

    @iOSXCUITFindBy(accessibility = "Tutorial")
    private WebElement TUTORIAL_BUTTON;

    @iOSXCUITFindBy(accessibility = "logout_icon")
    private WebElement LOGOUT_ICON ;

    @iOSXCUITFindBy(accessibility = "Log out")
    private WebElement LOGOUT_BUTTON ;

    //Methods

    public ProfileOptionMenuScreen tapEditProfileButton() {
        appiumUtils.click(EDIT_PROFILE_BUTTON);
        return this;
    }
    public ProfileOptionMenuScreen tapAccountButton() {
        appiumUtils.click(ACCOUNT_BUTTON);
        return this;
    }
    public ProfileOptionMenuScreen tapTutorialButton() {
        appiumUtils.click(TUTORIAL_BUTTON);
        return this;
    }
    public ProfileOptionMenuScreen tapLogOutButton() {
        appiumUtils.click(LOGOUT_BUTTON);
        return this;
    }

    public boolean isEditProfileIconDisplayed() {
        return appiumUtils.isVisable(PENCIL_ICON);
    }

    public boolean isAccountIconDisplayed() {
        return appiumUtils.isVisable(ACCOUNT_ICON);
    }

    public boolean isTutorialIconDisplayed() {
        return appiumUtils.isVisable(TUTORIAL_ICON);
    }

    public boolean isLogOutIconDisplayed() {
        return appiumUtils.isVisable(LOGOUT_ICON);
    }
}
