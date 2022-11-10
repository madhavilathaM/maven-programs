package mavensecond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trail2 {
	
	public static String xyz="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
	
	WebDriver Bank;
	@Test
	public  void Testcase() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	Bank=new ChromeDriver();
	Bank.get(xyz);
	Thread.sleep(2000);
	Bank.findElement(By.xpath("//*[@class='btn btn-primary btn-lg']")).click();
	Thread.sleep(2000);
	//Bank.findElement(By.name("userSelect")).click();
	//Thread.sleep(2000);
	Select Name=new Select(Bank.findElement(By.name("userSelect")));
		Name.selectByValue("2");
	//Bank.findElement(By.xpath("//*[@value='2']")).click();
	Thread.sleep(2000);
	Bank.findElement(By.xpath("//*[@class='btn btn-default']")).click();
	Thread.sleep(2000);
	Bank.findElement(By.xpath("//*[@class='center'][2]/button[2]")).click();
	Bank.findElement(By.xpath("//*[@type='number']")).click();
	
	
	}
}
