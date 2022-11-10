package mavensecond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gurudemo {
	
	public static String tour="https://demo.guru99.com/test/newtours/";
	WebDriver guru;
	String K;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		guru =new ChromeDriver();
		//guru.get(tour);
		guru.navigate().to(tour);
		Thread.sleep(3000);
		K=guru.getTitle();
		 System.out.println("The tile of the Page is " +K);
	}
	@Test(enabled=true,priority=0)
	public void Testcase1() throws InterruptedException
	{
		
		
		 		guru.findElement(By.name("userName")).sendKeys("user");
		guru.findElement(By.name("password")).sendKeys("user");
		guru.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	}
	@Test(enabled=false,priority=1)
	public void Testcase2() throws InterruptedException {
		guru.manage().window().maximize();
		
		guru.findElement(By.xpath("//*[@class='nav navbar-nav']/li[11]/a")).click();
		guru.findElement(By.linkText("Page-2")).click();
		Thread.sleep(10000);
		guru.findElement(By.xpath("//*[@class='table table-striped']"));
		guru.findElement(By.linkText("Become an Android Developer from Scratch")).click();
		Thread.sleep(10000);
		guru.findElement(By.xpath("//*[@class='udlite-heading-md intro-asset--overlay--3Z3co intro-asset--text--2vUCP']")).click();
		
//		WebElement Register=guru.findElement(By.linkText("REGISTER"));
//		Register.click();
//		Thread.sleep(2000);
//		guru.navigate().back();
//		Thread.sleep(2000);
//		guru.navigate().refresh();
//		Thread.sleep(2000);
//		guru.navigate().forward();
//		guru.findElement(By.name("firstName")).sendKeys("madhavi");
//		guru.findElement(By.name("lastName")).sendKeys("latha");
//		guru.findElement(By.name("phone")).sendKeys("961128903");
//		WebElement email=guru.findElement(By.name("userName"));
//		email.sendKeys("madhavilatha23@gmail.com");
//		Select M=new Select(guru.findElement(By.name("country")));
//		M.selectByIndex(6);
//		//M.selectByVisibleText("ANGOLA");
//		//M.selectByValue("ARGENTINA");
//		
//		guru.findElement(By.name("email")).sendKeys("madhavilatha23");
//		guru.findElement(By.name("password")).sendKeys("madhu@123");
//		guru.findElement(By.name("confirmPassword")).sendKeys("madhu@123");
//		guru.findElement(By.name("submit")).click();
//		Thread.sleep(10000);
//		guru.findElement(By.linkText("Flights")).click();
//		Thread.sleep(20000);
//		guru.findElement(By.xpath("//*[@value='roundtrip']")).click();
	
//		Select U=new Select(guru.findElement(By.name("passCount")));
//		U.selectByValue("2");
//		Select P=new Select(guru.findElement(By.name("fromPort")));
//		P.selectByValue("London");
//		Select L=new Select(guru.findElement(By.name("fromMonth")));
//		L.selectByValue("5");
//		Select D=new Select(guru.findElement(By.name("fromDay")));
//		D.selectByValue("9");
//				Select J=new Select(guru.findElement(By.name("toPort")));
//		J.selectByValue("Portland");
//		Select F=new Select(guru.findElement(By.name("toMonth")));
//		F.selectByValue("6");
//		Select G=new Select(guru.findElement(By.name("toDay")));
//		G.selectByValue("6");
//		Thread.sleep(3000);
//		guru.findElement(By.xpath("//*[@value='Business']")).click();
//		//guru.findElement(By.xpath("//*[@name='findflight']/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
//		Select H=new Select(guru.findElement(By.name("airline")));
//		H.selectByVisibleText("Blue Skies Airlines");
//		guru.findElement(By.xpath("//*[@type='image']")).click();
	}
		
	@AfterTest(enabled=false)
	public void aftertest() throws InterruptedException
	{
		
		System.out.println("Current URL "+guru.getCurrentUrl());
		
		guru.close();
		


}
}