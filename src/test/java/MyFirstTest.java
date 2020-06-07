import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyFirstTest {
    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suler\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void quit(){
        driver.quit();
    }

    @Test
    public void test(){
        driver.get( "https://google.com" );
    }
}
