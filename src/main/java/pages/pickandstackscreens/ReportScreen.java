package pages.pickandstackscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class ReportScreen extends AbstractScreen {

    public ReportScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(accessibility = "Why are you reporting this?")
    private WebElement WHY_REPORTING_TEXT;

    @iOSXCUITFindBy(accessibility = "Your report is anonymous.?")
    private WebElement ANONYMOUS_TEXT;

    @iOSXCUITFindBy(accessibility = "Suspect paid endorsement")
    private WebElement PAID_ENDORSEMENT_CHECKBOX;

    @iOSXCUITFindBy(accessibility = "It’s inappropriate")
    private WebElement INAPPROPRIATE_CHECKBOX;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"circle\"`][1]")
    private WebElement CHECKBOX1;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"circle\"`][2]")
    private WebElement CHECKBOX2;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextView[`value == \"Add more information...\"`]")
    private WebElement ADD_INFO_FIELD;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Send Report\"`]")
    private WebElement SEND_REPORT_BUTTON;

    //Methods
    public String getReportingHeaderText(){
        return appiumUtils.getText(WHY_REPORTING_TEXT);
    }
    public String getAnonymousText(){
        return appiumUtils.getText(ANONYMOUS_TEXT);
    }
    public String getPaidEndorsementText(){
        return appiumUtils.getText(PAID_ENDORSEMENT_CHECKBOX);
    }

    public String getInappropriateText(){
        return appiumUtils.getText(INAPPROPRIATE_CHECKBOX);
    }


    public ReportScreen tapCheckbox(int num){
        if(num ==1) {
            appiumUtils.click(CHECKBOX1);
        }
        if(num ==2) {
            appiumUtils.click(CHECKBOX2);
        }
        return this;
    }

    public ReportScreen setAddInfoField(String reportInfo){
        appiumUtils.sendText(ADD_INFO_FIELD,reportInfo);
        return this;
    }

    public ReportScreen tapSendReportButton(){
        appiumUtils.click(SEND_REPORT_BUTTON);
        return this;
    }
}
