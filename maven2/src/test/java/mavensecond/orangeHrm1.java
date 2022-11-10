package mavensecond;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHrm1 {

	
	public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	WebDriver Driver;
		
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		Driver=new ChromeDriver();
		//Driver.get(url);
		Driver.navigate().to(url);//
		Thread.sleep(2000);
	}
	@Test(enabled=true,priority=0)
	public void Testcase1() throws InterruptedException
	{
		WebElement username=Driver.findElement(By.name("username"));
		if(username.isEnabled())
		{
			username.sendKeys("Admin");
			Thread.sleep(2000);
		}
		WebElement password=Driver.findElement(By.name("password"));
		if(password.isDisplayed())
		{
			password.sendKeys("admin123");
		}
		WebElement login=Driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		if(login.isEnabled())
		{
			login.click();
			Thread.sleep(2000);
		}
	}
	@Test(enabled=false,priority=1)//pim
	public void Testcase2() throws InterruptedException
	{
		
		Driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[2]/a")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab-item']/i")).click();
		Thread.sleep(3000);
		Driver.manage().window().maximize();
		
		WebElement R=Driver.findElement(By.linkText("Optional Fields"));
		
		Actions act=new Actions(Driver);
		act.moveToElement(R).click().perform();
		
		//Driver.findElement(By.linkText("Optional Fields")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//*[@class='oxd-form']")).click();
		Thread.sleep(3000);
		Driver.findElements(By.xpath("//*[@class='oxd-form-row']")).get(1).click();
		Thread.sleep(3000);
		
		((JavascriptExecutor) Driver).executeScript("scroll(0,300)");
		
		WebElement S=Driver.findElements(By.xpath("//*[@class='oxd-switch-input oxd-switch-input--active --label-right']")).get(2);
		
		act.moveToElement(S).click().perform();
		//Driver.findElements(By.xpath("//*[@class='oxd-switch-input oxd-switch-input--active --label-right']")).get(2).click();
		Thread.sleep(3000);
		
		WebElement C=Driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		act.moveToElement(C).click().perform();
		//Driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		
		
		
	}
	@Test
	public void testcase7()
	{
		Actions act=new Actions(Driver);
		act.moveToElement(Driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a"))).click().build().perform();
		
		
	}
	@AfterTest(enabled=false)
	public void aftertest() throws InterruptedException
	{
		WebElement dropdown=Driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		if(dropdown.isEnabled())
		{
			dropdown.click();
			Thread.sleep(3000);
		}
		
		WebElement logout=Driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a"));
		if(logout.isDisplayed())
		{
			logout.click();
			Driver.close();
		}
	}
	
	
}
