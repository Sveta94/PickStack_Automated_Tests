package pages.followscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class FollowMainScreen extends AbstractScreen {
    public FollowMainScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
    private WebElement USERNAME_TEXT;

    @iOSXCUITFindBy(accessibility = "invite users")
    private WebElement INVITE_USERS_BUTTON;

    @iOSXCUITFindBy(accessibility = "close icon")
    private WebElement CLOSE_BUTTON;

    @iOSXCUITFindBy(accessibility = "Followers")
    private WebElement FOLLOWERS_TAB ;

    @iOSXCUITFindBy(accessibility = "Following")
    private WebElement FOLLOWING_TAB;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[`name == \"UIActivityContentView\"`]/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement INVITATION_LINK;


    //Methods

    public String getUsername() {
        return appiumUtils.getText(USERNAME_TEXT);
    }

    public FollowMainScreen tapInviteUserButton() {
        appiumUtils.click(INVITE_USERS_BUTTON);
        return this;
    }

    public FollowMainScreen tapCloseButton() {
        appiumUtils.click(CLOSE_BUTTON);
        return this;
    }

    public FollowMainScreen tapFollowersTab() {
        appiumUtils.click(FOLLOWERS_TAB);
        return this;
    }

    public FollowMainScreen tapFollowingTab() {
        appiumUtils.click(FOLLOWING_TAB);
        return this;
    }
    public String getInvitationLink() {
        return appiumUtils.getText(INVITATION_LINK);
    }


}
