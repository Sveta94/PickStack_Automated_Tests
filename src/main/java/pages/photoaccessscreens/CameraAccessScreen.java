package pages.photoaccessscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class CameraAccessScreen extends AbstractScreen {
    public CameraAccessScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeAlert[`label == \"“Pickstack” Would Like to Access the Camera\"`]")
    private WebElement CAMERA_ACCESS_TEXT;

    @iOSXCUITFindBy(accessibility = "Enable access so you can start taking photos and use them for your Picks and Stacks")
    private WebElement ENABLE_ACCESS_TEXT;

    @iOSXCUITFindBy(accessibility = "Don’t Allow")
    private WebElement DONT_ALLOW_BUTTON;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement OK_BUTTON;

    //Methods

    public CameraAccessScreen tapOkButton() {
        appiumUtils.click(OK_BUTTON);
        return this;
    }

    public CameraAccessScreen tapDontAllowButton() {
        appiumUtils.click(DONT_ALLOW_BUTTON);
        return this;
    }

    public String getCameraAccessText() {
        return appiumUtils.getText(CAMERA_ACCESS_TEXT);
    }

    public String getEnableAccessText(){
        return appiumUtils.getText(ENABLE_ACCESS_TEXT);
    }
}
