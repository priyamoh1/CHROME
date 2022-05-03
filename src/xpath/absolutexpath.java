package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolutexpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/-hp-/Desktop/SELLENIUM/CHROME/html/AbsoluteRelativeXpath.html");
		driver.findElement(By.xpath("//input[1]")).sendKeys("pintu");
		driver.findElement(By.xpath("//input[2]")).sendKeys("mohanty");

	}

}
