package pages.mainscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class ShareScreen extends AbstractScreen {

    public ShareScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"clips icon\"])[1]")
    private WebElement CLIP_PICK_BUTTON;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"share logo icon\"])[1]")
    private WebElement SHARE_PICK_BUTTON;

    @iOSXCUITFindBy(accessibility = "Share with Collective")
    private WebElement SHARE_WITH_COLLECTIVE_BUTTON;

    @iOSXCUITFindBy(accessibility = "Send to someone...")
    private WebElement SEND_TO_SOMEONE_TEXT;

    @iOSXCUITFindBy(accessibility = "Inside the Collective")
    private WebElement SEND_INSIDE_THE_COLLECTIVE_BUTTON;

    @iOSXCUITFindBy(accessibility = "Outside the Collective")
    private WebElement SEND_OUTSIDE_THE_COLLECTIVE_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSheet[@name=\" \"]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement CANCEL_SHARE_BUTTON;


    //Methods
    public ShareScreen tapClipPickButton() {
        appiumUtils.click(CLIP_PICK_BUTTON);
        return this;
    }

    public ShareScreen tapShareButton() {
        appiumUtils.click(SHARE_PICK_BUTTON);
        return this;
    }

    public ShareScreen tapShareWithCollectiveButton() {
        appiumUtils.click(SHARE_WITH_COLLECTIVE_BUTTON);
        return this;
    }


    public ShareScreen tapSendToSomeoneButton() {
        appiumUtils.click(SEND_TO_SOMEONE_TEXT);
        return this;
    }


    public ShareScreen tapSendInsideTheCollectiveButton() {
        appiumUtils.click(SEND_INSIDE_THE_COLLECTIVE_BUTTON);
        return this;
    }


    public ShareScreen tapSendOutsideTheCollectiveButton() {
        appiumUtils.click(SEND_OUTSIDE_THE_COLLECTIVE_BUTTON);
        return this;
    }

    public ShareScreen tapCancelShareButton() {
        appiumUtils.click(CANCEL_SHARE_BUTTON);
        return this;
    }

}