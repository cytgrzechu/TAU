import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class MoreleSeleniumTest {
    WebDriver chromeDriver;
    WebDriver mozillaDriver;
    WebDriver operaDriver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\studia\\sem6\\TAU\\TAU\\TAU\\2\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        // System.setProperty("webdriver.firefox.driver", "../geckodriver.exe");
        // mozillaDriver = new FirefoxDriver();
        // System.setProperty("webdriver.opera.driver", "../operadriver.exe");
        //operaDriver = new OperaDriver();

    }
@Test
    public void findProductTest() throws InterruptedException {
        chromeDriver.get("https://morele.net");
        chromeDriver.findElement(By.className("quick-search-autocomplete")).sendKeys("Esperanza Rysik EA140 Miks kolorów");
        Thread.sleep(2000);
        chromeDriver.findElement(By.className("h-quick-search-submit")).click();
    }

    @Test
    public void clickCookiesTest(){
        chromeDriver.get("https://morele.net");
        chromeDriver.findElement(By.className("close-cookie-box")).click();
        chromeDriver.close();

    }

    @Test
    public void addAndDeleteCartTest() throws InterruptedException {
        findProductTest();
        chromeDriver.findElement(By.className("pushAddToBasketData")).click();
        Thread.sleep(2000);
        chromeDriver.findElement(By.linkText("Zobacz koszyk")).click();
        chromeDriver.findElement(By.className("item-remove")).click();
    }

    @Test
    public void failedLoginTest(){
        chromeDriver.get("https://morele.net");
        chromeDriver.findElement(By.className("h-user-control")).click();
        chromeDriver.findElement(By.id("username")).sendKeys("test@test.pl");
        chromeDriver.findElement(By.id("password-log")).sendKeys("asd");
        chromeDriver.findElement(By.className("input")).click();
        chromeDriver.findElement(By.id("login_form")).click();
        //chromeDriver.close();

    }

    @Test
    public void passwordReminderTest() throws InterruptedException {
        chromeDriver.get("https://morele.net");
        chromeDriver.findElement(By.className("h-user-control")).click();
        chromeDriver.findElement(By.linkText("Nie pamiętam hasła")).click();
        chromeDriver.findElement(By.id("reset_password_email")).sendKeys("test@wp.pl");
        Thread.sleep(2000);
        chromeDriver.findElement(By.id("resetPassword_email")).click();
        chromeDriver.close();
    }

}
