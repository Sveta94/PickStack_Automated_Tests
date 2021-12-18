package steps;

import io.appium.java_client.AppiumDriver;
import pages.AbstractScreen;
import pages.enterappscreens.AuthorizationScreen;
import pages.enterappscreens.LoginScreen;
import pages.mainscreens.FeedScreen;
import pages.profilescreens.ProfileMainScreen;
import pages.profilescreens.ProfileOptionMenuScreen;

public class LoginSteps extends AbstractScreen {
    LoginScreen loginScreen;
    AuthorizationScreen authorizationScreen;
    FeedScreen feedScreen;
    ProfileMainScreen profileMainScreen;
    ProfileOptionMenuScreen profileOptionMenuScreen;

    public LoginSteps(AppiumDriver driver) {
        super(driver);
        loginScreen = new LoginScreen(driver);
        authorizationScreen = new AuthorizationScreen(driver);
        feedScreen = new FeedScreen(driver);
        profileMainScreen = new ProfileMainScreen(driver);
        profileOptionMenuScreen = new ProfileOptionMenuScreen(driver);
    }

    public void login(String email, String password){
       loginScreen.setEmail(email);
       loginScreen.setPassword(password);
       loginScreen.tapLoginButton();
    }

    public void logout(){
        feedScreen.navigateToProfile();
        profileMainScreen.tapOptionMenuButton();
        profileOptionMenuScreen.tapLogOutButton();
        authorizationScreen.tapLoginButton();
    }
}