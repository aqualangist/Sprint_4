package pageobject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//в данный класс вынесены действия, одинаковые для всех тестов
public class BaseUITest {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager
                .chromedriver()
                .setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
