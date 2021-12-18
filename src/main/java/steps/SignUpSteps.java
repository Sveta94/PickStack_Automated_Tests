package steps;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumDriver;
import pages.AbstractScreen;
import pages.enterappscreens.AuthorizationScreen;
import pages.enterappscreens.SignUpScreen;

import java.util.Locale;

public class SignUpSteps extends AbstractScreen {

    AuthorizationScreen authorizationScreen;
    SignUpScreen signUpScreen;


    public SignUpSteps(AppiumDriver driver) {
        super(driver);

        signUpScreen = new SignUpScreen(driver);
        authorizationScreen = new AuthorizationScreen(driver);
    }


    public void createNewUser(String email, String password) {

        signUpScreen.setEmail(email);
        signUpScreen.setPassword(password);
        signUpScreen.tapCreateAccountButton();
    }

    public void createNewUser() {
        Faker fakerEng = new Faker(new Locale("eng"));
        String firstName = fakerEng.name().firstName();
        int randomInt = ((int)(Math.random()*9000)+1000);
        String email = "svetlana+" + firstName.toLowerCase() + randomInt +"@gojilabs.com";
        String password = "Autotest00223344!";
        String username = firstName + randomInt;

        authorizationScreen.tapSignUpButton();
        signUpScreen.setEmail(email);
        signUpScreen.setPassword(password);
        signUpScreen.tapCreateAccountButton();
        signUpScreen.tapContinueButton();
        signUpScreen.setFullName(firstName);
        signUpScreen.tapContinueButton();
        signUpScreen.setUsername(username);
        signUpScreen.tapContinueButton();

    }

    public void choosePhotoFromLibrary(){
        signUpScreen.tapUploadPhotoButton();
        signUpScreen.tapChooseFromLibraryButton();
        signUpScreen.tapChoosePhotoButton();
        signUpScreen.tapConfirmChoosePhotoButton();
        signUpScreen.tapContinueButton();

    }

}