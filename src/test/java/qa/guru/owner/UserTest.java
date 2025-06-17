package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.authConfig.AuthConfig;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @Test // it works only is local file absent - then take props from classpath
    void testLocalFile() {

        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());

        assertThat(config.username()).isEqualTo("akadaemon");
        assertThat(config.password()).isEqualTo("123456");

    }

    @Test // it works only if local file present
    void testRemoteFile() throws IOException {
        String localFileContent = """
                username=akado
                password=1234567890
                """;

        Path props = Paths.get("D:\\auth.properties");
        Files.write(props, localFileContent.getBytes(StandardCharsets.UTF_8));

        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());

        assertThat(config.username()).isEqualTo("akado");
        assertThat(config.password()).isEqualTo("1234567890");

        Files.delete(props);

    }

}
