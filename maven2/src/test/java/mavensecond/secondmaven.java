package mavensecond;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secondmaven {
	
	public static String browser="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
@Test
	public  void testcase2() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver hrm =new ChromeDriver();
		hrm.get(browser);
		Thread.sleep(2000);
		hrm.findElement(By.name("username")).sendKeys("Admin");
		hrm.findElement(By.name("password")).sendKeys("admin123");
		hrm.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(2000);
		//hrm.findElement(By.xpath("//*[text()='Maintenance']")).click();
		//hrm.findElement(By.xpath("//*[text()='Maintenance'])")).click();
		//hrm.findElement(By.xpath("//*[@class='oxd-main-menu']/li[10]/a")).click();
		//hrm.findElement(By.name("password")).sendKeys("admin123");
		//hrm.findElement(By.xpath("//*[@class='oxd-form-row'][2]/div/div[2]/input")).sendKeys("admin123");
	  //hrm.findElement(By.xpath("//*[@type='submit']")).click();
		//hrm.findElement(By.xpath("//*[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-admin-access-button']")).click();
		
		hrm.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(2000);
		//hrm.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[1]/div/div[2]/input")).sendKeys("madhavi");
		Actions action = new Actions(hrm);
		WebElement element =hrm.findElement(By.xpath("//*[@class='oxd-select-wrapper']"));
		action.click(element).perform();
		action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
		//action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
		action.sendKeys(element,Keys.ENTER).click().perform();
		Thread.sleep(6000);
		hrm.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		
		//hrm.findElement(By.linkText("Nationalities")).click();
		
		//hrm.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		Thread.sleep(3000);
		//hrm.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		
		
		//hrm.close();
		

	}

}
