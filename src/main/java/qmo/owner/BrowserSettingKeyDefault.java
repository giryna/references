package qmo.owner;

import org.aeonbits.owner.Config;
import org.openqa.selenium.Platform;

public interface BrowserSettingKeyDefault extends Config {

    @Key("browser.name")
    @DefaultValue("FIREFOX")
    String browserName();

    @DefaultValue("57")
    String version();

    @DefaultValue("LINUX") // type conversion
    Platform platform();

    @DefaultValue("false")
    boolean isRemote();

    @DefaultValue("true")
    boolean javascriptEnabled();

    @DefaultValue("false")
    boolean acceptSslCerts();
}