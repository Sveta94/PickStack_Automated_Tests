package pages.recommendationscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class ViewRecommendationsMoreOptionsScreen extends AbstractScreen {
    public ViewRecommendationsMoreOptionsScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeImage[1]")
    private WebElement USER_PROFILE_PIC_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeButton[1]")
    private WebElement USERNAME_BUTTON;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeStaticText[1]")
    private WebElement PICK_TITLE;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeStaticText[1]")
    private WebElement PICK_DESCRIPTION;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeButton[1]")
    private WebElement PICK_INTENTION1;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeButton[2]")
    private WebElement PICK_INTENTION2;

    @iOSXCUITFindBy(iOSClassChain ="**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeButton[3]")
    private WebElement PICK_INTENTION3;

    @iOSXCUITFindBy(accessibility = "share_gold_icon")
    private WebElement SHARE_GOLD_ICON_BUTTON;

    @iOSXCUITFindBy(accessibility = "Share with Collective")
    private WebElement SHARE_WITH_COLLECTIVE_TEXT;

    @iOSXCUITFindBy(accessibility = "pencil_icon")
    private WebElement EDIT_BUTTON;

    @iOSXCUITFindBy(accessibility = "Edit details")
    private WebElement EDIT_DETAILS_TEXT;

    @iOSXCUITFindBy(accessibility = "trash_icon")
    private WebElement TRASH_ICON;

    @iOSXCUITFindBy(accessibility = "Delete")
    private WebElement DELETE_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Close\"`]")
    private WebElement CLOSE_BUTTON;


    //Methods
    public boolean isProfilePhotoDisplayed(){
        return appiumUtils.isVisable(USER_PROFILE_PIC_BUTTON);
    }

    public String getUsernameText() {
        return appiumUtils.getText(USERNAME_BUTTON);
    }

    public String getPickTitle() {
        return appiumUtils.getText(PICK_TITLE);
    }

    public String getPickDescription() {
        return appiumUtils.getText(PICK_DESCRIPTION);
    }

    public boolean isIntention1Displayed(){
        return appiumUtils.isVisable(PICK_INTENTION1);
    }

    public boolean isIntention2Displayed(){
        return appiumUtils.isVisable(PICK_INTENTION2);
    }

    public boolean isIntention3Displayed(){
        return appiumUtils.isVisable(PICK_INTENTION3);
    }

    public ViewRecommendationsMoreOptionsScreen tapShareButton(){
        appiumUtils.click(SHARE_GOLD_ICON_BUTTON);
        return this;
    }

    public String getShareWithCollectiveText(){
       return appiumUtils.getText(SHARE_WITH_COLLECTIVE_TEXT);
    }
    public ViewRecommendationsMoreOptionsScreen tapEditButton(){
        appiumUtils.click(EDIT_BUTTON);
        return this;
    }
    public String getEditText(){
        return appiumUtils.getText(EDIT_DETAILS_TEXT);
    }

    public ViewRecommendationsMoreOptionsScreen tapDeleteButton(){
        appiumUtils.click(TRASH_ICON);
        return this;
    }

    public String getDeleteText(){
        return appiumUtils.getText(DELETE_TEXT);
    }

    public ViewRecommendationsMoreOptionsScreen tapCloseButton(){
        appiumUtils.click(CLOSE_BUTTON);
        return this;
    }

}
