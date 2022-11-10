package mavensecond;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {
	
	
	public static String Url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	String child_url="https://www.google.com/";
	String parent_url="https://www.youtube.com";
	public static String url2="https://demoqa.com/alerts/";
	
	@BeforeTest
	public void beforetest()
	{ 
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.navigate().to(Url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		}

	/*@Test
	public void test()
	{
		
		driver.getWindowHandle();
		
		//driver.getWindowHandles();
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get(parent_url);
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(child_url);
		System.out.println(driver.getTitle());
		
		//driver.close();
		
		
		//ArrayList<String> newtab1=new ArrayList<String>(driver.getWindowHandle());
		
		
	}*/
	
	@Test
	public void windowhandles()
	{
	
		Set<String> parenttab=driver.getWindowHandles();
		System.out.println(parenttab.size());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(parent_url);
		System.out.println("you ar in parent url vibgyor  " + driver.getTitle());
		
		Set<String> childtab=driver.getWindowHandles();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(child_url);
		
		System.out.println("you are in guru website " + driver.getTitle());
		//driver.close();
		
		
		ArrayList<String> newtab=new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(newtab);
		driver.switchTo().window(newtab.get(0));
				System.out.println(driver.getTitle());
				driver.close();
		driver.switchTo().window(newtab.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(newtab.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
