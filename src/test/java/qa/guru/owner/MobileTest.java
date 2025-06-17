package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.mobileConfig.MobileConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class MobileTest {

    @Test
    void testAndroidCommonConfig() {
        System.setProperty("device", "pixel");

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("Google Pixel XL");
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("17.0");
    }

    @Test
    void testIOSCommonConfig() {
        System.setProperty("device", "iphone");

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("iPhone 16 Pro Max");
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("15.0");
    }

}
