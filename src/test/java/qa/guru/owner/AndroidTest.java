package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.mobileConfig.AndroidConfig;


import static org.assertj.core.api.Assertions.assertThat;

public class AndroidTest {

    @Test
    void testAndroid() {
        AndroidConfig config = ConfigFactory.create(AndroidConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("Google Pixel XL");
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("17.0");

    }
}
