package pages.intentionsscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class ProfileIntentionsScreen extends AbstractScreen {

    public ProfileIntentionsScreen(AppiumDriver driver) {
        super(driver);
    }


    // Elements
    @iOSXCUITFindBy(accessibility = "logo")
    private WebElement LOGO;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Add your intentions\"`][1]")
    private WebElement ADD_INTENTIONS_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Select 3 or more intentions below.\"`][1]")
    private WebElement SELECT_INTENTIONS_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]" )
    private WebElement TRAVEL_SMARTER_CHECKBOX;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[20]")
    private WebElement BE_SUCCESSFUL_CHECKBOX;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Finish\"`]")
    private WebElement FINISH_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip & Finish\"]")
    private WebElement SKIP_AND_FINISH_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"circle_checked\"`][1]")
    private WebElement TRAVEL_SMARTER_CIRCLE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"circle_checked\"`][2]")
    private WebElement BE_SUCCESSFUL_CIRCLE;

    //Sign up Intentions
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther" )
    private WebElement SIGNUP_TRAVEL_SMARTER_CHECKBOX;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[17]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private WebElement SIGNUP_BE_SUCCESSFUL_CHECKBOX;

    //Methods
    public String getAddIntentionsText() {
        return appiumUtils.getText(ADD_INTENTIONS_TEXT);
    }

    public String getSelectIntentionsText() {
        return appiumUtils.getText(SELECT_INTENTIONS_TEXT);
    }

    public ProfileIntentionsScreen tapTravelSmarterCheckbox() {
        appiumUtils.click(TRAVEL_SMARTER_CHECKBOX);
        return this;
    }

    public ProfileIntentionsScreen tapBeSuccessfulCheckbox() {
        appiumUtils.click(BE_SUCCESSFUL_CHECKBOX);
        return this;
    }

    public ProfileIntentionsScreen tapSignUpTravelSmarterCheckbox() {
        appiumUtils.click(SIGNUP_TRAVEL_SMARTER_CHECKBOX);
        return this;
    }

    public ProfileIntentionsScreen tapSignUpBeSuccessfulCheckbox() {
        appiumUtils.click(SIGNUP_BE_SUCCESSFUL_CHECKBOX);
        return this;
    }

    public ProfileIntentionsScreen tapFinishButton() {
        appiumUtils.click(FINISH_BUTTON);
        return this;
    }

    public ProfileIntentionsScreen tapSkipAndFinishButton() {
        appiumUtils.click(SKIP_AND_FINISH_BUTTON);
        return this;
    }

    public boolean isTravelSmarterCircleChecked(){
        return appiumUtils.isEnabled(TRAVEL_SMARTER_CIRCLE);
    }

    public boolean isBeSuccessfulCircleChecked(){
        return appiumUtils.isEnabled(BE_SUCCESSFUL_CIRCLE);
    }

}
