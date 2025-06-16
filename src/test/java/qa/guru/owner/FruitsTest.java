package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.FruitsConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTest {

    @Test
    void testArray() {
        System.setProperty("array", "orange,apple,banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsArray())
                .contains("orange", "apple", "banana");
    }

    @Test
    void testList() {
        System.setProperty("list", "orange,apple,banana");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsList())
                .contains("orange", "apple", "banana");
    }

    @Test
    void testListWithDefaultValue() {
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsListWithDefault())
                .contains("orange", "apple");
    }

    @Test
    void testListWithSeparator() {
        System.setProperty("list-with-separator", "orange; apple");

        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

        assertThat(config.getFruitsListWithSeparator())
                .contains("orange", "apple");
    }

}
