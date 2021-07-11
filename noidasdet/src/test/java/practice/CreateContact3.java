package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.GenericsUtil.PropertUtility;
import com.crm.GenericsUtil.WebDriverUtility;

public class CreateContact3 {
	@Test

	public void createContact3() throws Throwable
	{
PropertUtility pUtil=new PropertUtility();
		
		//ExcelUtility eUtil=new ExcelUtility();
		//String orgName=eUtil.getExcelData("sheet1", 1, 2);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get(pUtil.getPropertyKeyValue("url"));
		driver.findElement(By.name("user_name")).sendKeys(pUtil.getPropertyKeyValue("username"));
		driver.findElement(By.name("user_password")).sendKeys(pUtil.getPropertyKeyValue("password"));
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		
       WebElement listbox=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		
		Select sel=new Select(listbox);
		sel.selectByVisibleText("Mr.");
		WebElement st=driver.findElement(By.name("leadsource"));
		Select s=new Select(st);
		s.selectByValue(cold call);
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	  Thread.sleep(2000);
	    
	Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
		driver.findElement(By.linkText("Sign Out")).click();

}