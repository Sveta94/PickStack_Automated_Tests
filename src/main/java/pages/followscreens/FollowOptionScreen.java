package pages.followscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class FollowOptionScreen extends AbstractScreen {
    public FollowOptionScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \" \"`]")
    private WebElement FOLLOWER_INFO;

    @iOSXCUITFindBy(accessibility = "Remove follower")
    private WebElement REMOVE_FOLLOWER_BUTTON;

    @iOSXCUITFindBy(accessibility = "Follow back")
    private WebElement FOLLOW_BACK_BUTTON;

    @iOSXCUITFindBy(accessibility = "Cancel")
    private WebElement CANCEL_BUTTON;

    @iOSXCUITFindBy(accessibility = "Unfollow")
    private WebElement UNFOLLOW_BUTTON;


    //Methods

    public boolean isFollowerInfoDisplayed() {
      return appiumUtils.isVisable(FOLLOWER_INFO);
    }

    public FollowOptionScreen tapRemoveFollowerButton(){
        appiumUtils.click(REMOVE_FOLLOWER_BUTTON);
        return this;
    }

    public FollowOptionScreen tapFollowBackButton(){
        appiumUtils.click(FOLLOW_BACK_BUTTON);
        return this;
    }

    public FollowOptionScreen tapCancelButton(){
        appiumUtils.click(CANCEL_BUTTON);
        return this;
    }
    public FollowOptionScreen tapUnfollowButton(){
        appiumUtils.click(UNFOLLOW_BUTTON);
        return this;
    }
}
