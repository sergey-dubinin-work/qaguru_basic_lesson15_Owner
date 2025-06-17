package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.mobileConfig.AndroidConfig;
import qa.guru.owner.mobileConfig.IOSConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class IOSTest {

    @Test
    void testIOS() {
        IOSConfig config = ConfigFactory.create(IOSConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("iPhone 16 Pro Max");
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("15.0");

    }
}
