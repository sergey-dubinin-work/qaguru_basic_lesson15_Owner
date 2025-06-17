package qa.guru.owner.credentialsConfig;

import org.aeonbits.owner.Config;

@Config.Sources(
        "classpath:credentials/credentials.properties"
)
public interface CredentialsConfig extends Config {

    String login();

    String password();

}
