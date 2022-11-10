package mavensecond;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	
	public static String url="https://demoqa.com/alerts/";
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to(url);

		driver.manage().window().fullscreen();;
		
	}
	
	@Test(enabled=true,priority=0)
	public void alert1() throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		
		Alert M=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Clicked on the first Alert");
		String text=M.getText();
		System.out.println(text);
		M.accept();
		
		
		
		
	}
	@Test(enabled=true,priority=1)
	public void alert2() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		Thread.sleep(5000);
		
		Alert L=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Clicked on the Second Alert");
		String text=L.getText();
		System.out.println(text);
		L.accept();
		
	}
	@Test(enabled=true,priority=2)
	public void alert3() throws InterruptedException
	{

		Thread.sleep(10000);

		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(5000);
		Alert K=driver.switchTo().alert();
		System.out.println("Clicked on the third Alert");
		String text=K.getText();
		System.out.println(text);
		K.dismiss();
	}
	
	@Test(enabled=true,priority=3)
	public void alert4() throws InterruptedException
	{
		Thread.sleep(10000);
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(5000);
		
		Alert N=driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println("Clicked on the fourth Alert");
		String text=N.getText();
		System.out.println(text);
		
		N.sendKeys("madhavi");
		Thread.sleep(5000);
		N.accept();
	}
	
	
	
}
