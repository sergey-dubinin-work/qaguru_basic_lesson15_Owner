package qa.guru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("remoteUrl")
    URL getRemoteUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

}
