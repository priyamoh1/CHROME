package assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoocreate2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?");
		driver.findElement(By.cssSelector("input[id=\"usernamereg-firstName\"]")).sendKeys("priyaranjan");
		driver.findElement(By.cssSelector("input[id=\"usernamereg-lastName\"]")).sendKeys("mohanty");
		driver.findElement(By.cssSelector("input[id=\"usernamereg-yid\"]")).sendKeys("pmohantyx");
		driver.findElement(By.cssSelector("input[id=\"usernamereg-phone\"]")).sendKeys("9853173565");
		driver.findElement(By.cssSelector("input[id=\"usernamereg-day\"]")).sendKeys("02");
		driver.findElement(By.cssSelector("input[id=\"usernamereg-year\"]")).sendKeys("1991");
		
	}

	}


