package qa.guru.owner.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class HugeOldWebDriverConfig {

    public URL getRemoteUrl(){
        String remoteUrl = System.getProperty("remoteUrl");
        if (Objects.nonNull(remoteUrl)){
            try {
                return new URL(remoteUrl);
            } catch (MalformedURLException e) {
                throw new RuntimeException("Bad Url");
            }
        } else {
            return null;
        }
    }

    public Browser getBrowser(){
        String browserString = System.getProperty("browser", "CHROME");
        return Browser.valueOf(browserString);
    }

    public String getBaseUrl(){
        return System.getProperty("baseUrl", "https://github.com/");
    }

}
