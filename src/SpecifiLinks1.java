
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpecifiLinks1 {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new FirefoxDriver();


		driver.get("http://bbc.com");

String x  = "//*[@id='page']/section[5]/div/div/div[1]/ul/li[";
String  y ="]/div/a";
System.out.println("*****************");
for(int i=1;i<5;i++){
	driver.findElement(By.xpath(x+i+y)).click();
	System.out.println("*****************");
System.out.println(driver.getTitle());
Thread.sleep(3000);

driver.get("http://bbc.com");
Thread.sleep(3000);

	}
/*Everything in the above java code is perfect.The only issue is we have to manually
find the no of links (in this case 5) before starting the for loop*/

/*So question is if we don t know how many no of links are there how do we do that
because if a enter a random no like 7 and link no 7 does not exist on the website it
will throw an error*/
/*so inorder to tackle this problem we make a static function(static so that we can 
call in from main fucntion and pass to it the xpath.if xpath is there it returns tru and the w
while loop runs and i keeps on incrementing

if at some point i is not there that is xpath is not present the fucntion returns false and
while loop will not run.*/

/*int i =1;
while(isElementPresent(x+i+y)){
	driver.findElement(By.xpath(x+i+y)).click();
	System.out.println("*****************");
System.out.println(driver.getTitle());
Thread.sleep(1000);

driver.get("http://bbc.com");
Thread.sleep(1000);
i++;
	}

	}
	//so in order
	public static  boolean isElementPresent(String element_xpath){
		int count = driver.findElements(By.xpath(element_xpath)).size();
	if(count==1)
		return true;
	else 
		return false;

		
	}*/
	}
}
	


