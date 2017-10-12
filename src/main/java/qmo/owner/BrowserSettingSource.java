package qmo.owner;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;
import org.openqa.selenium.Platform;

@Sources({
        "file:src/main/java/qmo/owner/BrowserSetting.properties",
        "classpath:qmo/owner/BrowserSetting.properties"})
public interface BrowserSettingSource extends Config {
    String browserName();

    String version();

    Platform platform();

    String driverPath();

    boolean isRemote();

    boolean javascriptEnabled();

    boolean acceptSslCerts();
}