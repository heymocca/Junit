package Junit;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class junit4WebDriverDemo {
	public WebDriver driver;
	//String baseUrl = "http://www.google.com";
	

	@Before
	public void setUp() throws Exception {
		//System.setProperty("webdriver.gecko.driver", "D:\\Download\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver.exe");
		//driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.navigate().to("https://www.baidu.com/");
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();

		
	}

}
