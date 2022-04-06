import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TitsaTest {
    WebDriver chromeDriver;
    WebDriver mozillaDriver;
    WebDriver operaDriver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\studia\\sem6\\TAU\\TAU\\TAU\\2\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        // System.setProperty("webdriver.firefox.driver", "../geckodriver.exe");
        //mozillaDriver = new FirefoxDriver();
        //System.setProperty("webdriver.opera.driver", "../operadriver.exe");
        // operaDriver = new OperaDriver();

    }
    @Test
    public void find_Bus() {
        chromeDriver.get("https://titsa.com/index.php/en");
        Select city_from = new Select(chromeDriver.findElement(By.id("origin-city")));
        city_from.selectByVisibleText("Fasnia");
        chromeDriver.findElement(By.id("origin-address")).sendKeys("tkopalniana");
        chromeDriver.findElement(By.id("origin-number")).sendKeys("16");
        Select city_to = new Select(chromeDriver.findElement(By.id("destination-city")));
        city_to.selectByVisibleText("Arona");
        chromeDriver.findElement(By.id("destination-address")).sendKeys("todskas");
        chromeDriver.findElement(By.id("destination-number")).sendKeys("15");
        chromeDriver.findElement(By.id("submit")).click();
        chromeDriver.close();

    }

    @Test
    public void confirm_Cookies() {
        chromeDriver.get("https://titsa.com/index.php/en");
        chromeDriver.findElement(By.className("accept")).click();
        chromeDriver.close();
    }
    @Test
    public void search_Tekst() {
        chromeDriver.get("https://titsa.com/index.php/en");
        chromeDriver.findElement(By.className("mod-search_searchword")).sendKeys("Bus do domu");
        chromeDriver.findElement(By.linkText( "Staff")).click();
        chromeDriver.close();
    }
}
