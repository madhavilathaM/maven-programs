package mavensecond;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts2 {
	
	  WebDriver driver;
		 @BeforeTest
		 public void beforetest() throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
				driver.get("https://demoqa.com/alerts");
				driver.manage().window().maximize();
				
				Thread.sleep(5000);
		 }
				@Test
				public void Testcase2() throws InterruptedException {
					
				//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
				Alert ss=driver.switchTo().alert();
				String sg=ss.getText();
				System.out.println(sg);
				Thread.sleep(5000);
				ss.accept();
				Thread.sleep(3000);
				System.out.println("the alert is clicked");
					
	}
				
				
	 @Test
	 public void Testcase4() throws InterruptedException
	 { // // driver.getWindowHandle();
		 Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
			Alert se=driver.switchTo().alert();
			String st=se.getText();
			System.out.println(st);
			se.accept();
			Thread.sleep(3000);
			System.out.println("the time alert is clicked");
	 			
				
	 }		
	 @AfterTest
	 public void Test6() {
		 driver.close();
	 }

}
