package practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class LoginLogoutFromVtiger {
	@Test
public void loginLogoutTest() throws InterruptedException {	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	
	driver.get("http://localhost:8888");
	
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(@href,\"index.php?module=Contacts&action=index\")]")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//img[@alt=\"Create Contact...\"]")).click();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement dropdown=driver.findElement(By.name("salutationtype"));
	
	Select salutationtype_dd=new Select(dropdown);
	salutationtype_dd.selectByVisibleText("Mr.");
	
	driver.findElement(By.name("firstname")).sendKeys("divisht");
	driver.findElement(By.name("lastname")).sendKeys("adlakha");
	
	Thread.sleep(2000);
	// Logout
    
    Actions actions=new Actions(driver);
    actions.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
}

	
	
	
	
	
	
}
