package mavensecond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trail1 {
	
	public static String hotel="http://automationpractice.com/index.php";
	
	WebDriver User;
	@Test
	public void Testcase1() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		User=new ChromeDriver();
		User.get(hotel);
		Thread.sleep(2000);
		User.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
		User.findElement(By.name("submit_search")).click();
		User.findElement(By.id("selectProductSort")).click();
		User.findElement(By.xpath("//*[@value='price:desc']")).click();
		User.findElement(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default']")).click();
		Thread.sleep(2000);
		User.findElement(By.linkText("Proceed to checkout")).click();
		
		
		
		//User.findElement(By.id("search-icon-legacy")).click();
//		User.findElement(By.linkText("New User Register Here")).click();
//		User.findElement(By.name("username")).sendKeys("Madhavi");
//		User.findElement(By.name("password")).sendKeys("madhu@123");
//		User.findElement(By.name("re_password")).sendKeys("madhu@123");
//		User.findElement(By.id("full_name")).sendKeys("Madhavilatha");
//		User.findElement(By.id("email_add")).sendKeys("madhavilatha23@gmail.com");
//		
//		User.findElement(By.id("email_add")).sendKeys("madhavilatha23@gmail.com");
//		
	}
	

}
