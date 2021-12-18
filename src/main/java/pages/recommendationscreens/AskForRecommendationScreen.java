package pages.recommendationscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class AskForRecommendationScreen extends AbstractScreen {

    public AskForRecommendationScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"I am looking for...\"`]")
    private WebElement LOOKING_FOR_TEXT;

    @iOSXCUITFindBy(accessibility = "✕")
    private WebElement CLOSE_RECOMMENDATIONS_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    private WebElement RECOMMENDATION_TITLE_FIELD;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private WebElement RECOMMENDATION_DESCRIPTION_FIELD;

    @iOSXCUITFindBy(accessibility = "This will help me... (optional)")
    private WebElement RECOMMENDATION_INTENTIONS_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Create recommendation request\"`]")
    private WebElement CREATE_REQUEST_BUTTON;


    //Methods

    public boolean isImLookingForTextDisplayed(){
        return appiumUtils.isVisable(LOOKING_FOR_TEXT);
    }

    public AskForRecommendationScreen tapCloseStackButton(){
        appiumUtils.click(CLOSE_RECOMMENDATIONS_BUTTON);
        return this;
    }

    public AskForRecommendationScreen setRecommendationTitle(String title){
        appiumUtils.sendText(RECOMMENDATION_TITLE_FIELD,title);
        return this;
    }

    public AskForRecommendationScreen setRecommendationDescription(String description){
        appiumUtils.sendText(RECOMMENDATION_DESCRIPTION_FIELD,description);
        return this;
    }

    public AskForRecommendationScreen tapRecommendationIntentionsButton(){
        appiumUtils.click(RECOMMENDATION_INTENTIONS_BUTTON);
        return this;
    }

    public AskForRecommendationScreen tapCreateRecommendationButton(){
        appiumUtils.click(CLOSE_RECOMMENDATIONS_BUTTON);
        return this;
    }


}
