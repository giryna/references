package qmo.owner;

import org.aeonbits.owner.Config;
import org.openqa.selenium.Platform;

public interface BrowserSetting extends Config {
    String browserName();

    String version();

    Platform platform();

    String driverPath();

    boolean isRemote();

    boolean javascriptEnabled();

    boolean acceptSslCerts();
}