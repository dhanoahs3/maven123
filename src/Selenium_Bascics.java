import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Bascics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//FirefoxDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//driver.get("http://gmail.com");
		//HtmlUnitDriver htm = new HtmlUnitDriver();
		//htm.get("http://gmail.com");
		//System.out.println(htm.getTitle());
		
		
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		//System.out.println(htm.getTitle());
	}

}
