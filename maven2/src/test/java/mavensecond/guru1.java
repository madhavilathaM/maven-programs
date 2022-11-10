package mavensecond;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru1 {

	
	public static String url="https://demo.guru99.com/test/newtours/";
	
	String Url2="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
		
	}
	@Test(enabled=true,priority=0)
	public void testcase()
	{
		

 		driver.findElement(By.name("userName")).sendKeys("user");
driver.findElement(By.name("password")).sendKeys("user");
driver.findElement(By.name("submit")).click();
driver.manage().window().maximize();
		
	}
	@Test(enabled=true,priority=1)
	public void testcase2()
	{
		
		List<WebElement> links1=driver.findElements(By.tagName("a"));
		System.out.print("total links   "+links1.size());
		
		
		for(int i=0;i<links1.size();i++)
		{
		
			
		//  System.out.println(links1.get(i).getText());
	 //System.out.println(links1.get(i).getAttribute("href"));
		  
		
		String uc=links1.get(i).getAttribute("href");
		
		String Uc1="https://demo.guru99.com/test/newtours/support.php";
		
	if(uc.equals(Uc1))
	{
	System.out.println("the link under construction  "  + links1.get(i).getText());
	}
	else
	{
		System.out.println("the link is working  "  +links1.get(i).getText());
	}
		}
		
		
		
		
	}
	
	@Test(enabled=false,priority=2)
	public void testcase3()
	{
		driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(Url2);;
		
	}
	
}
