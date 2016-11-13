import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
driver.get("http://fb.com");


List<WebElement> allLinks = driver.findElements(By.xpath("//input[@type='text']"));
System.out.println("All Links  "+ allLinks.size());
//allLinks.get(0).sendKeys("df");;
for(int i = 0;i<4;i++)
	
{allLinks.get(i).sendKeys("dfd");;
}
}



	}

