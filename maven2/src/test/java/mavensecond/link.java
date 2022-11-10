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

public class link {
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	public static String url2="https://www.youtube.com/";
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
		
		
	}
	
	@Test(enabled=true,priority=0)
	public void Testcase() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
	}
	@Test(enabled=true,priority=1)
	public void Testcase1()//Hyperlink
	{
	
		
	List<WebElement> links=	driver.findElements((By.tagName("a")));
	
	System.out.println("Total number of lins  "+links.size());
	
	
	
	for(int i=0;i<links.size();i++)
	{
		System.out.println(links.get(i).getText());
		
		System.out.println(links.get(i).getAttribute("href"));
	}
		
	}
	
	@Test(enabled=false,priority=2)//window Handles
	public void Testcase2()
	{
		driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);

		driver.navigate().to(url2);
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(url);
		//driver.quit();
		
	}
}
