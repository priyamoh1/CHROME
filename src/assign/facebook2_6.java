package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook2_6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://en-gb.facebook.com");
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.cssSelector("a[data-testid=\"open-registration-form-button\"]")).click();
		//driver.findElement(By.cssSelector("a[class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[aria-label='First name']")).sendKeys("priyaranjan");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[aria-label=\"Surname\"]")).sendKeys("mohanty");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("9853173565");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id=\"password_step_input\"]")).sendKeys("priya123");
		Thread.sleep(3000);
		

	}

}
