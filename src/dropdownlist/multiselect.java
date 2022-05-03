package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/-hp-/Desktop/SELLENIUM/CHROME/html/multiselect.html");
		WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='students']"));
		Select sel=new Select(dropdownlist);
		//sel.selectByVisibleText("arup das");
		//sel.selectByValue("SUBRAT");
		//sel.selectByIndex(4);
		//sel.selectByVisibleText("lalal");
		sel.selectByVisibleText("arup das");
	}
	}


