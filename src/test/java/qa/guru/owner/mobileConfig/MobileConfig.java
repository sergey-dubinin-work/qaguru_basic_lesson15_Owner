package qa.guru.owner.mobileConfig;

import org.aeonbits.owner.Config;

@Config.Sources(
        "classpath:${device}.properties"
)
public interface MobileConfig extends Config {

    @Key("device.name")
    String deviceName();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();

}
