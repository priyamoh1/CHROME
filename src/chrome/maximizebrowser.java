package chrome;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver .manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.manage().window().getSize());//change the browser size
		Dimension d=new Dimension(300,300);
		driver.manage().window().setSize(d);//set the browser size
	}

}
