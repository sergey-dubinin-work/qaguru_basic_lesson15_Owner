package qa.guru.owner;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver = new ChromeDriver();

    @Test
    void testGithubTitleChrome() {
        driver.get("https://github.com/");

        System.out.println(driver.getTitle());

        assertEquals("GitHub · Build and ship software on a single, collaborative platform · GitHub", driver.getTitle());

        driver.quit();
    }


    @Test
    void testGithubTitleFireFox () {
        driver.get("https://github.com/");

        System.out.println(driver.getTitle());

        assertEquals("GitHub · Build and ship software on a single, collaborative platform · GitHub", driver.getTitle());

        driver.quit();
    }

}
