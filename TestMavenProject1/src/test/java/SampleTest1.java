import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahi\\Downloads\\Workspace\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title is: " + driver.getTitle());
		
		driver.quit();
	}

}
