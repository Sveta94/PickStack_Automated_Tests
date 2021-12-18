package root;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class DeviceManager {

    public OS executionOS = OS.IOS;
    public enum OS {
        ANDROID,
        IOS,
    }

    DesiredCapabilities capabilities = new DesiredCapabilities();

    protected void deviceController() {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/Pickstack");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("autoDissmissAlerts", true);

        switch(executionOS){
            case ANDROID:
                File app = new File (appDir, "");
                capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.VERSION, "11.0");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_30_x86");
                capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "");
                capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "");
                break;

            case IOS:

                app = new File (appDir, "pickstack.app");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                capabilities.setCapability(MobileCapabilityType.VERSION, "14.5");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                capabilities.setCapability("useNewWDA", false);
                capabilities.setCapability("noReset", false);
                capabilities.setCapability("xcodeOrgId", "MVJ4MU9598");
                capabilities.setCapability("xcodeSigningId", "iPhone Developer");
                capabilities.setCapability(MobileCapabilityType.UDID, "F0A6E70B-1417-4EEB-AC0E-1B0D08ED4C4B");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
                capabilities.setCapability(MobileCapabilityType.APP, "//Users//svetlanaavetisyan//Desktop//Pickstack//Pickstack.app");
                //  capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, Boolean.TRUE);
                //  capabilities.setCapability("autoDissmissAlerts", "true");
                break;

            default:
                System.out.println("Wrong device is connected, check capabilities.");
        }
    }
}