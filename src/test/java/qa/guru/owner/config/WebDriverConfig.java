package qa.guru.owner.config;

public class WebDriverConfig {

    public Browser getBrowser(){
        String browserString = System.getProperty("browser", "CHROME");
        return Browser.valueOf(browserString);
    }

    public String getBaseUrl(){
        return System.getProperty("baseUrl", "https://github.com/");
    }

}
