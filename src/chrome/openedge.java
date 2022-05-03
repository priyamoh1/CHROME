package chrome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openedge {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
		}


	}
