package pages.followscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class FollowersScreen extends AbstractScreen {

    public FollowersScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeImage")
    private WebElement FIRST_FOLLOWER_PHOTO;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    private WebElement FIRST_FOLLOWER_NAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    private WebElement FIRST_FOLLOWER_USERNAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"dots\"`][1]")
    private WebElement FIRST_FOLLOWER_OPTIONS;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeImage")
    private WebElement SECOND_FOLLOWER_PHOTO;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
    private WebElement SECOND_FOLLOWER_NAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
    private WebElement SECOND_FOLLOWER_USERNAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"dots\"`][2]")
    private WebElement SECOND_FOLLOWER_OPTIONS;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Follow\"`][1]")
    private WebElement FOLLOW1_BUTTON;

    //Methods


    public boolean isFollowerPhotoDisplayed(int num) {
        if (num == 1) {
            return appiumUtils.isVisable(FIRST_FOLLOWER_PHOTO);
        }
        if (num == 2) {
            return appiumUtils.isVisable(SECOND_FOLLOWER_PHOTO);
        }
        else return false;
    }

    public String  getFollower1Name() {
     return appiumUtils.getText(FIRST_FOLLOWER_NAME);
    }

    public String  getFollower1Username() {
        return appiumUtils.getText(FIRST_FOLLOWER_USERNAME);
    }

    public FollowersScreen tapFollower1Options(){
        appiumUtils.click(FIRST_FOLLOWER_OPTIONS);
        return this;
    }

    public String  getFollower2Name() {
        return appiumUtils.getText(SECOND_FOLLOWER_NAME);
    }

    public String  getFollower2Username() {
        return appiumUtils.getText(SECOND_FOLLOWER_USERNAME);
    }

    public FollowersScreen tapFollower2Options(){
        appiumUtils.click(SECOND_FOLLOWER_OPTIONS);
        return this;
    }

    public FollowersScreen tapFollow1Button(){
        appiumUtils.click(FOLLOW1_BUTTON);
        return this;
    }

}
