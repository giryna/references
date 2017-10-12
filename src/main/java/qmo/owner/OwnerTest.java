package qmo.owner;

import org.aeonbits.owner.ConfigFactory;

public class OwnerTest {
    public static void main(String[] args) {
        BrowserSetting browserSetting = ConfigFactory.create(BrowserSetting.class);

        System.out.println(browserSetting.browserName());
        System.out.println(browserSetting.platform());
        System.out.println(browserSetting.version());
        System.out.println(browserSetting.javascriptEnabled());
        System.out.println(browserSetting.acceptSslCerts());
    }
}
