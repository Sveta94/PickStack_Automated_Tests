package pages.pickandstackscreens.pickscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class EditPickImageScreen extends AbstractScreen {
    public EditPickImageScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Select photo\"`]")
    private WebElement SELECT_PHOTO_TEXT;

    @iOSXCUITFindBy(accessibility = "Cancel")
    private WebElement CANCEL_BUTTON;

    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement DONE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeImage")
    private WebElement MAIN_PHOTO;

    @iOSXCUITFindBy(accessibility = "From webpage")
    private WebElement FROM_WEBPAGE_TAB;

    @iOSXCUITFindBy(accessibility = "Camera Roll")
    private WebElement CAMERA_ROLL_TAB;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeImage")
    private WebElement WEBPAGE_PHOTO1;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeImage")
    private WebElement WEBPAGE_PHOTO2;

    //Methods
    public String getSelectPhotoText() {
        return appiumUtils.getText(SELECT_PHOTO_TEXT);
    }
    public EditPickImageScreen tapCancelButton() {
        appiumUtils.click(CANCEL_BUTTON);
        return this;
    }

    public EditPickImageScreen tapDoneButton() {
        appiumUtils.click(DONE_BUTTON);
        return this;
    }

    public boolean isMainPhotoDisplayed(){
      return appiumUtils.isVisable(MAIN_PHOTO);
    }

    public EditPickImageScreen tapFromWebpage() {
        appiumUtils.click(FROM_WEBPAGE_TAB);
        return this;
    }

    public EditPickImageScreen tapCameraRoll() {
        appiumUtils.click(CAMERA_ROLL_TAB);
        return this;
    }

    public EditPickImageScreen tapWebpagePhoto1() {
        appiumUtils.click(WEBPAGE_PHOTO1);
        return this;
    }

    public EditPickImageScreen tapWebpagePhoto2() {
        appiumUtils.click(WEBPAGE_PHOTO2);
        return this;
    }


}
