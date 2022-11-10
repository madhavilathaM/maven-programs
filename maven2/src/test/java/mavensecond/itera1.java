package mavensecond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class itera1 {

	public static String url="https://itera-qa.azurewebsites.net/home/automation";
	WebDriver test;
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		test=new ChromeDriver();
		test.get(url);
		test.navigate().to(url);
		Thread.sleep(3000);
		//test.getTitle();
		System.out.print("the title of page "+test.getTitle());
	}
	@Test
	public void Teatcase() throws InterruptedException
	{
		test.findElement(By.id("name")).sendKeys("Madhavilatha");
		test.findElement(By.id("phone")).sendKeys("4478899");
		test.findElement(By.id("email")).sendKeys("Madhavilatha23@gmail.com");
		test.findElement(By.id("password")).sendKeys("Madhavilatha");
		test.findElement(By.id("address")).sendKeys("Bangalore");
		Thread.sleep(3000);
		test.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		test.findElements(By.xpath("//*[@class='card border-success mb-3']")).get(2).click();
		Thread.sleep(3000);
		test.findElement(By.xpath("//*[@class='card-body']/label[1]")).click();
		Thread.sleep(3000);
		test.findElements(By.xpath("//*[@class='form-check']")).get(2).click();
		Thread.sleep(3000);
		test.findElements(By.xpath("//*[@class='form-check-label']")).get(2).click();
		Thread.sleep(3000);
		test.findElements(By.xpath("//*[@class='form-check-input']")).get(2).click();
	}
}