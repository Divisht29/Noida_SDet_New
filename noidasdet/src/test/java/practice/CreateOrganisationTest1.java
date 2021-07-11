package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import com.crm.GenericsUtil.ExcelUtility;
import com.crm.GenericsUtil.PropertUtility;

public class CreateOrganisationTest1 {
	@Test
	public void createOrganizationTest1() throws Throwable
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
		

		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();

		driver.findElement(By.name("accountname")).sendKeys("TCS12");
		driver.findElement(By.id("phone")).sendKeys("1234567");
		
		WebElement dropdown=driver.findElement(By.name("industry"));
		Select industry_dd=new Select(dropdown);
		industry_dd.selectByVisibleText("Banking");
		
		WebElement typedropdown=driver.findElement(By.name("accounttype"));
		Select type_dd=new Select(typedropdown);
		type_dd.selectByVisibleText("Customer");
		
		WebElement ratingdropdown=driver.findElement(By.name("rating"));
		Select rating_dd=new Select(ratingdropdown);
		rating_dd.selectByVisibleText("Active");
		
}
}