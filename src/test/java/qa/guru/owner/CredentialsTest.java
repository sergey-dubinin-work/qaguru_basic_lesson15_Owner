package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import qa.guru.owner.credentialsConfig.CredentialsConfig;

public class CredentialsTest {

    private static final Logger LOGGER = LogManager.getLogger(CredentialsTest.class);

    @Test
    void credentialsTest() {
        CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);
        String login = config.login();
        String password = config.password();

        String message = String.format("Log in with '%s' login and '%s' password", login, password);

        LOGGER.info(message);
    }
}
