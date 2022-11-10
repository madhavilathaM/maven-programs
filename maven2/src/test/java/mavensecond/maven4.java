package mavensecond;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven4 {
	
	public static String browser="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver hrm ;
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		hrm =new ChromeDriver();
		hrm.get(browser);
		Thread.sleep(3000);
	}
	@Test(enabled=false,priority=0)//login
	public void Testcase1() throws InterruptedException
	{
		hrm.findElement(By.name("username")).sendKeys("Admin");
		hrm.findElement(By.name("password")).sendKeys("admin123");
		hrm.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
	}
	@Test(enabled=true,priority=0)//login
	public void testcase5() throws InterruptedException
	{
		WebElement username=hrm.findElement(By.name("username"));
		if(username.isEnabled())
		{
			username.sendKeys("Admin");
			Thread.sleep(2000);
		}
		WebElement password=hrm.findElement(By.name("password"));
		if(password.isDisplayed())
		{
			password.sendKeys("admin123");
		}
		WebElement login=hrm.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		if(login.isEnabled())
		{
			login.click();
		}
	}
	
	@Test(enabled=true,priority=1)
	public void Testcase2() throws InterruptedException
	{
		//hrm.findElement(By.xpath("//*[@class='oxd-main-menu']/li[10]/a")).click();
		//hrm.findElement(By.xpath("//*[@class='oxd-form-row'][2]/div/div[2]/input")).sendKeys("admin123");
		//hrm.findElement(By.xpath("//*[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-admin-access-button']")).click();
		hrm.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();//admin
		Thread.sleep(5000);
		hrm.manage().window().maximize();
		
		
		List<WebElement> Li=hrm.findElements(By.xpath("//*[@class='oxd-table-card']"));
		System.out.println("Number of Users "+Li.size());
		
		hrm.findElements(By.xpath("//*[@class='oxd-table-card']")).get(7).click();//click user name
		Thread.sleep(3000);
		System.out.println(hrm.findElements(By.xpath("//*[@class='oxd-table-card']")).get(7).getText());
		
		hrm.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(7).click();
		Thread.sleep(3000);
		//System.out.println(hrm.findElement(By.xpath("//*[@class='oxd-table-cell oxd-padding-cell'][2]/div")).getText());
		
		hrm.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(7).click();//click delete
		Thread.sleep(3000);
		hrm.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();

		
	}
	@Test(enabled=false,priority=2)//logout
	public void Testcase3() throws InterruptedException
	{
		hrm.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(3000);
		hrm.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
	}
	@Test(enabled=false,priority=1)//logout
	public void testcase6() throws InterruptedException
	{
		WebElement dropdown=hrm.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		if(dropdown.isEnabled())
		{
			dropdown.click();
			Thread.sleep(3000);
		}
		
		WebElement logout=hrm.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a"));
		if(logout.isDisplayed())
		{
			logout.click();
		}
	}
	
	@AfterTest(enabled=false)
	public void aftertest() throws InterruptedException
	{
		Thread.sleep(3000);
		hrm.close();
	}
}
