package chrome;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsetbrowserposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver .manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.manage().window().getPosition());
		Point p=new Point(130,130);
		driver.manage().window().setPosition(p);
		
		
	}

}
