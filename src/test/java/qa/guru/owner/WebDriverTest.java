package qa.guru.owner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import qa.guru.owner.config.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

//    private WebDriver driver = new WebDriverProvider().get();

    @Disabled("Only local")
    @Test
    void testGithubTitle() {
//        assertEquals("GitHub · Build and ship software on a single, collaborative platform · GitHub", driver.getTitle());
//        driver.quit();
    }

}
