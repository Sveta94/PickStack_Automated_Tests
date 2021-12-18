package steps;

import io.appium.java_client.AppiumDriver;
import pages.AbstractScreen;
import pages.enterappscreens.AuthorizationScreen;
import pages.mainscreens.AddScreen;
import pages.mainscreens.FeedScreen;
import pages.mainscreens.SearchTheCollectiveScreen;
import pages.pickandstackscreens.pickscreens.PickWebSearchScreen;
import utils.AppiumUtils;

public class AddPickSteps extends AbstractScreen {


        AuthorizationScreen authorizationScreen;
        SearchTheCollectiveScreen searchTheCollectiveScreen;
        FeedScreen feedScreen;
        AddScreen addScreen;
        PickWebSearchScreen pickWebSearchScreen;
        AppiumUtils appiumUtils;

    public AddPickSteps(AppiumDriver driver) {
        super(driver);

        authorizationScreen = new AuthorizationScreen(driver);
        addScreen = new AddScreen(driver);
        feedScreen = new FeedScreen(driver);
        pickWebSearchScreen = new PickWebSearchScreen(driver);
        searchTheCollectiveScreen = new SearchTheCollectiveScreen(driver);
        appiumUtils = new AppiumUtils(driver);
    }

    public void addPick(String url){
        feedScreen.navigateToAddPick();
        addScreen.tapShareSomethingYouLoveButton();
        pickWebSearchScreen.tapCloseHintButton();
        pickWebSearchScreen.setSearchFieldText(url);
        pickWebSearchScreen.tapCreatePickButton();
    }



}
