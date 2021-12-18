package pages.pickandstackscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class OtherUsersPickAndStacks extends AbstractScreen {
    public OtherUsersPickAndStacks(AppiumDriver driver) {
        super(driver);
    }


    //Elements
    @iOSXCUITFindBy(accessibility = "share_gold_default_icon")
    private WebElement SHARE_ICON;

    @iOSXCUITFindBy(accessibility = "Share with Collective")
    private WebElement SHARE_BUTTON;

    @iOSXCUITFindBy(accessibility = "clips_gold_icon")
    private WebElement CLIP_ICON;

    @iOSXCUITFindBy(accessibility = "Remove from clips")
    private WebElement REMOVE_FROM_CLIPS_BUTTON;

    @iOSXCUITFindBy(accessibility = "Add to clips")
    private WebElement ADD_TO_CLIPS_BUTTON;

    @iOSXCUITFindBy(accessibility = "flag_icon")
    private WebElement REPORT_ICON;

    @iOSXCUITFindBy(accessibility = "Report")
    private WebElement REPORT_BUTTON;

    //Methods
    public boolean isShareIconDisplayed(){
        return appiumUtils.isVisable(SHARE_ICON);
    }

    public OtherUsersPickAndStacks tapShareButton(){
        appiumUtils.click(SHARE_BUTTON);
        return this;
    }

    public boolean isClipIconDisplayed(){
        return appiumUtils.isVisable(CLIP_ICON);
    }

    public OtherUsersPickAndStacks tapAddToClipsButton(){
        appiumUtils.click(ADD_TO_CLIPS_BUTTON);
        return this;
    }

    public OtherUsersPickAndStacks tapRemoveFromClipsButton(){
        appiumUtils.click(REMOVE_FROM_CLIPS_BUTTON);
        return this;
    }
    public boolean isReportIconDisplayed(){
        return appiumUtils.isVisable(REPORT_ICON);
    }

    public OtherUsersPickAndStacks tapReportButton(){
        appiumUtils.click(REPORT_BUTTON);
        return this;
    }



}
