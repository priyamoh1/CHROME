package dixpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dixpath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qspiders.com/contact");
		WebElement Noidacontactno=driver.findElement(By.xpath("(//p[contains(text(),'Noida')]/../..//span[contains(text(),'+91')])[1]"));
		System.out.println(Noidacontactno.getText());	}

}
