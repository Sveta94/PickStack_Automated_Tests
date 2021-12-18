package pages.profilescreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class UsersProfileScreen extends AbstractScreen {
    public UsersProfileScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
    private WebElement PROFILE_PHOTO;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
    private WebElement NAME_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
    private WebElement USERNAME_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
    private WebElement BIO_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Following\"`]")
    private WebElement FOLLOWING_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Follow\"`]")
    private WebElement FOLLOW_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView/XCUIElementTypeStaticText")
    private WebElement FOLLOWED_BY_TEXT;

    //Methods


    public boolean isProfilePhotoDisplayed() {
        return appiumUtils.isVisable(PROFILE_PHOTO);
    }

    public String getName() {
        return appiumUtils.getText(NAME_TEXT);
    }

    public String getUsername() {
        return appiumUtils.getText(USERNAME_TEXT);
    }


    public String getBio() {
        return appiumUtils.getText(BIO_TEXT);
    }

    public UsersProfileScreen tapFollowButton() {
        appiumUtils.click(FOLLOW_BUTTON);
        return this;
    }

    public UsersProfileScreen tapFollowingButton() {
        appiumUtils.click(FOLLOWING_BUTTON);
        return this;
    }

    public String getFollowedByText() {
        return appiumUtils.getText(FOLLOWED_BY_TEXT);
    }

}
