package pages.photoaccessscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class PhotoAccessScreen extends AbstractScreen {
    public PhotoAccessScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"“Pickstack” Would Like to Access Your Photos\"`]")
    private WebElement ACCESS_PHOTOS_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "Enable access so you can use photos for creating your Picks and Stacks")
    private WebElement ENABLE_ACCESS_TEXT;

    @iOSXCUITFindBy(accessibility = "Select Photos…")
    private WebElement SELECT_PHOTOS_BUTTON;

    @iOSXCUITFindBy(accessibility = "Allow Access to All Photos")
    private WebElement ALLOW_ALL_PHOTOS_BUTTON;

    @iOSXCUITFindBy(accessibility = "Don’t Allow")
    private WebElement DONT_ALLOW_BUTTON;

    @iOSXCUITFindBy(accessibility = "Photo, March 30, 2018, 8:14 PM")
    private WebElement FIRST_PHOTO;

    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement DONE_BUTTON;

    @iOSXCUITFindBy(accessibility = "Camera roll is empty.")
    private WebElement EMPTY_CAM_ROLL_TEXT;

    @iOSXCUITFindBy(accessibility = "Recent Photos")
    private WebElement RECENT_PHOTOS_TAB;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"All Photos\"`]")
    private WebElement ALL_PHOTOS_TAB;

    @iOSXCUITFindBy(accessibility = "camera")
    private WebElement CAMERA_BUTTON;

    @iOSXCUITFindBy(accessibility= "Select more photos...")
    private WebElement SELECT_MORE_PHOTOS_BUTTON;

    @iOSXCUITFindBy(accessibility = "Change settings")
    private WebElement CHANGE_SETTINGS_BUTTON;

    @iOSXCUITFindBy(accessibility = "Please allow access in settings")
    private WebElement ALLOW_ACCESS_IN_SETTINGS_TEXT;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement OK_BUTTON;



    //Methods

    public String getCameraAccessText() {
        return appiumUtils.getText(ACCESS_PHOTOS_TEXT);
    }

    public String getEnableAccessText(){
        return appiumUtils.getText(ENABLE_ACCESS_TEXT);
    }

    public PhotoAccessScreen tapSelectPhotosButton() {
        appiumUtils.click(SELECT_PHOTOS_BUTTON);
        return this;
    }

    public PhotoAccessScreen tapAllowAllPhotosButton() {
        appiumUtils.click(ALLOW_ALL_PHOTOS_BUTTON);
        return this;
    }

    public PhotoAccessScreen tapDontAllowButton() {
        appiumUtils.click(DONT_ALLOW_BUTTON);
        return this;
    }

    public PhotoAccessScreen tapFirstPhotosButton() {
        appiumUtils.click(FIRST_PHOTO);
        return this;
    }

    public PhotoAccessScreen tapDoneButton() {
        appiumUtils.click(DONE_BUTTON);
        return this;
    }

    public String getEmptyCamRollText(){
        return appiumUtils.getText(EMPTY_CAM_ROLL_TEXT);
    }


    public PhotoAccessScreen tapRecentPhotosTab() {
        appiumUtils.click(RECENT_PHOTOS_TAB);
        return this;
    }

    public PhotoAccessScreen tapAllPhotosTab() {
        appiumUtils.click(ALL_PHOTOS_TAB);
        return this;
    }

    public PhotoAccessScreen tapCameraButton() {
        appiumUtils.click(CAMERA_BUTTON);
        return this;
    }

    public PhotoAccessScreen tapSelectMorePhotosButton() {
        appiumUtils.click(SELECT_MORE_PHOTOS_BUTTON);
        return this;
    }

    public PhotoAccessScreen tapChangeSettingsButton() {
        appiumUtils.click(CHANGE_SETTINGS_BUTTON);
        return this;
    }

    public String AllowAccessInSettingsText(){
        return appiumUtils.getText(ALLOW_ACCESS_IN_SETTINGS_TEXT);
    }

    public PhotoAccessScreen tapOkButton() {
        appiumUtils.click(OK_BUTTON);
        return this;
    }


}




