import org.openqa.selenium.WebDriver;

public class demo() {
	
		System.setProperty("webdriver.crome.driver", "C:\\Users\\HOME\\eclipse-workspace\\demo\\src\\driversver\\chromedriver.exe")
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
	}

}
