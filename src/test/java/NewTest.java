import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	@BeforeTest
	public void beforeTest() {
		driver = getWebDriver();
	}
	
	private WebDriver getWebDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/ugp/Documents/chromedriver");
		
		WebDriver driver = new ChromeDriver();
//		String url = "http://the-internet.herokuapp.com/login";
		String url = "http://the-internet.herokuapp.com/dropdown";
		driver.navigate().to(url);
		
		return driver;
	}
	
//	@Test 
//	public void canLogIn() {
//		//arrange
//		String userName = new String("tomsmith");
//		String password = new String("SuperSecretPassword!");
//		
//		//act
//		WebElement userNameTextBox = driver.findElement(By.id("username"));
//		WebElement passwordTextBox = driver.findElement(By.id("password"));
//		WebElement submitButton = driver.findElement(By.className("radius"));
//		// driver.findElement(By.tagName("button"))
//		
//		userNameTextBox.sendKeys(userName);
//		passwordTextBox.sendKeys(password);
//		submitButton.submit();
//		
//		//assert
//		WebElement verificationLoggedIn = driver.findElement(By.className("icon-signout"));
//		String expectedText = new String("Logout");
////		boolean verification = verificationLoggedIn.getText() == expectedText;
//		
//		Assert.assertEquals(verificationLoggedIn.getText(), expectedText, "Cannot Login");
//	}
	
	@Test
	public void canSelectOptionTwo() {
		//arrange
		Select dropOption = new Select(driver.findElement(By.id("dropdown")));
		//act
		dropOption.selectByValue("2");
		//assert
		String expectedText = new String("Option 2");
		Assert.assertEquals(dropOption.getFirstSelectedOption().getText()
, expectedText, "Selected was not option 2");
	}
	
	@AfterTest
	public void afterTest() {
//		driver.quit();
		System.out.println("hello world");
	}
	
//	@Test
//	public void launchChromeDriver() {
//		Assert.assertEquals(driver.getTitle(), "Google", "An incorrect page was loaded.");
//	}
	
//	@Test
//	public void canClickButton() {
//		
//		WebElement element = driver.findElement(By.id("gbqfbb"));
//		
//		element.click();
//		
//	}
	
	private WebDriver driver;
}