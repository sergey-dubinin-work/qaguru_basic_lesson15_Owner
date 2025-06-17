package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.credentialsConfig.CredentialsConfig;

public class CredentialsTest {

    @Test
    void credentialsTest() {
        CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
        String login = config.login();
        String password = config.password();

        String message = String.format("Log in with '%s' login and '%s' password", login, password);

        System.out.println(message);
    }
}
