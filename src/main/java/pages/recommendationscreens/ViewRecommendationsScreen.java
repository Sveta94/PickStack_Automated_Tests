package pages.recommendationscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class ViewRecommendationsScreen extends AbstractScreen {

    public ViewRecommendationsScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(accessibility = "arrow left")
    private WebElement BACK_TO_CLIPS_BUTTON;

    @iOSXCUITFindBy(accessibility = "dots big")
    private WebElement OPTION_MENU_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeImage[1]")
    private WebElement PROFILE_PHOTO_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeButton[1]")
    private WebElement PROFILE_USERNAME_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementStaticText[1]")
    private WebElement RECOMMENDATION_TITLE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementStaticText[2]")
    private WebElement RECOMMENDATION_DESCRIPTION;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton[1]")
    private WebElement RECOMMENDED_PICK_USERNAME_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton[6]")
    private WebElement RECOMMENDED_PICK_PHOTO_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton[2]")
    private WebElement RECOMMENDED_PICK_CLIP_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeButton[3]")
    private WebElement RECOMMENDED_PICK_SHARE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
    private WebElement RECOMMENDED_PICK_TITLE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[4]")
    private WebElement RECOMMENDED_PICK_DESCRIPTION;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"See all comments\"`]")
    private WebElement RECOMMENDED_PICK_COMMENTS_BUTTON;



    //Methods

    public ViewRecommendationsScreen tapBackToClipsButton(){
        appiumUtils.click(BACK_TO_CLIPS_BUTTON);
        return this;
    }

    public ViewRecommendationsScreen tapMoreOptionsButton(){
        appiumUtils.click(BACK_TO_CLIPS_BUTTON);
        return this;
    }

    public ViewRecommendationsScreen tapProfilePhotoButton(){
        appiumUtils.click(PROFILE_PHOTO_BUTTON);
        return this;
    }

    public ViewRecommendationsScreen tapProfileUsernameButton(){
        appiumUtils.click(PROFILE_USERNAME_BUTTON);
        return this;
    }

    public String getRecommendationTitle(){
        return appiumUtils.getText(RECOMMENDATION_TITLE);
    }

    public String getRecommendationDescription(){
        return appiumUtils.getText(RECOMMENDATION_DESCRIPTION);
    }

    public ViewRecommendationsScreen tapRecommendedPickUsernameButton(){
        appiumUtils.click(RECOMMENDED_PICK_USERNAME_BUTTON);
        return this;
    }

    public ViewRecommendationsScreen tapRecommendedPickPhotoButton(){
        appiumUtils.click(RECOMMENDED_PICK_PHOTO_BUTTON);
        return this;
    }

    public ViewRecommendationsScreen tapRecommendedPickShareButton(){
        appiumUtils.click(RECOMMENDED_PICK_SHARE_BUTTON);
        return this;
    }

    public ViewRecommendationsScreen tapRecommendedPickClipButton(){
        appiumUtils.click(RECOMMENDED_PICK_CLIP_BUTTON);
        return this;
    }

    public String getRecommendedPickTitle(){
        return appiumUtils.getText(RECOMMENDED_PICK_TITLE);
    }

    public String getRecommendedPickDescription(){
        return appiumUtils.getText(RECOMMENDED_PICK_DESCRIPTION);
    }

    public ViewRecommendationsScreen tapRecommendedPickCommentsButton(){
        appiumUtils.click(RECOMMENDED_PICK_COMMENTS_BUTTON);
        return this;
    }

}
