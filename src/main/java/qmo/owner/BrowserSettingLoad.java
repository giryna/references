package qmo.owner;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.HotReload;
import org.openqa.selenium.Platform;

@HotReload
public interface BrowserSettingLoad extends Config {
    String browserName();

    String version();

    Platform platform();

    String driverPath();

    boolean isRemote();

    boolean javascriptEnabled();

    boolean acceptSslCerts();
}