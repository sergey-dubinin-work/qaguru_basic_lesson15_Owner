package qa.guru.owner.config;

public class WebDriverConfig {

    public Browser getBrowser(){
        return Browser.CHROME;
    }

    public String getBaseUrl(){
        return "https://github.com/";
    }

}
