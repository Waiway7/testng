import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/ugp/Documents/chromedriver");
		
		driver = new ChromeDriver();
		String url = "http://google.com";
		driver.navigate().to(url);
		
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	@Test
	public void launchChromeDriver() {
		Assert.assertEquals(driver.getTitle(), "Google", "An incorrect page was loaded.");
	}
	
	@Test
	public void canClickButton() {
		
		WebElement element = driver.findElement(By.id("gbqfbb"));
		
		element.click();
		
	}
	
	private WebDriver driver;
}