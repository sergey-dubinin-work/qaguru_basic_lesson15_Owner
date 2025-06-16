package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.Browser;
import qa.guru.owner.config.TypesConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class TypeConfigTest {

    @Test
    void testInteger() {
        System.setProperty("integer", "10");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());

        assertThat(config.getInteger()).isEqualTo(10);
    }

    @Test
    void testDouble() {
        System.setProperty("double", "10.10");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());

        assertThat(config.getDouble()).isEqualTo(10.10);
    }

    @Test
    void testBooleanTrue() {
        System.setProperty("boolean", "true");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());

        assertThat(config.getBoolean()).isTrue();
    }

    @Test
    void testBooleanFalse() {
        System.setProperty("boolean", "false");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());

        assertThat(config.getBoolean()).isFalse();
    }

    @Test
    void testEnum() {
        System.setProperty("enum", "FIREFOX");

        TypesConfig config = ConfigFactory.create(TypesConfig.class, System.getProperties());

        assertThat(config.getEnum()).isEqualTo(Browser.FIREFOX );
    }


}
