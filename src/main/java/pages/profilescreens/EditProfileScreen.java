package pages.profilescreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class EditProfileScreen extends AbstractScreen {
    public EditProfileScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Edit Profile\"`]")
    private WebElement EDIT_PROFILE_TEXT;

    @iOSXCUITFindBy(accessibility = "Cancel")
    private WebElement CANCEL_BUTTON;

    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement DONE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeImage")
    private WebElement PROFILE_IMAGE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Edit Photo\"`]")
    private WebElement EDIT_PHOTO;

    @iOSXCUITFindBy(accessibility = "Name")
    private WebElement NAME_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextView")
    private WebElement NAME_FIELD;

    @iOSXCUITFindBy(accessibility = "Username")
    private WebElement USERNAME_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextView")
    private WebElement USERNAME_FIELD;

    @iOSXCUITFindBy(accessibility = "Bio")
    private WebElement BIO_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTextView")
    private WebElement BIO_FIELD;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Top intentions\"`]")
    private WebElement TOP_INTENTIONS_TEXT;

    //Methods

    public String getEditProfileText() {
        return appiumUtils.getText(EDIT_PROFILE_TEXT);
    }

    public EditProfileScreen tapCancelButton() {
        appiumUtils.click(CANCEL_BUTTON);
        return this;
    }

    public EditProfileScreen tapDoneButton() {
        appiumUtils.click(DONE_BUTTON);
        return this;
    }

    public boolean isProfileImageDisplayed() {
        return appiumUtils.isVisable(PROFILE_IMAGE);
    }

    public EditProfileScreen tapEditPhotoButton() {
        appiumUtils.click(EDIT_PHOTO);
        return this;
    }

    public String getBioText() {
        return appiumUtils.getText(BIO_FIELD);
    }

    public EditProfileScreen setBioField(String newBio) {
        appiumUtils.sendText(BIO_FIELD, newBio);
        return this;
    }

    public String getUsernameText() {
        return appiumUtils.getText(USERNAME_TEXT);
    }

    public EditProfileScreen setUsernameField(String newUsername) {
        appiumUtils.sendText(USERNAME_FIELD, newUsername);
        return this;
    }

    public String getNameText() {
        return appiumUtils.getText(NAME_TEXT);
    }

    public EditProfileScreen setNameField(String newName) {
        appiumUtils.sendText(NAME_FIELD, newName);
        return this;
    }

    public String getTopIntentionsText() {
        return appiumUtils.getText(TOP_INTENTIONS_TEXT);
    }

}
