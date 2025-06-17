package qa.guru.owner.authConfig;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:D:\\auth.properties", // it works only if file present, another way - take props from classpath
        "classpath:auth.properties"
})
public interface AuthConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();
}
