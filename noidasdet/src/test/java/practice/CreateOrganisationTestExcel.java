package practice;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

//import com.crm.GenericsUtil.ExcelUtility;
//import com.crm.GenericsUtil.JavaUtility;
import com.crm.GenericsUtil.PropertUtility;
//import com.crm.GenericsUtil.WebDriverUtility;

public class CreateOrganisationTestExcel {
	@Test

	public void createOrganizationTestExcel() throws Throwable
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
		
		driver.findElement(By.name("firstname")).sendKeys("DIVISHT");
		driver.findElement(By.name("lastname")).sendKeys("Adlakha");
		driver.findElement(By.name("account_name")).sendKeys("HCL");
		//driver.findElement(By.xpath("//img[@alt='Select']")).click();
		//driver.findElement(By.linkText("javascript:window.close()")).click();
		
	
		
		
		driver.findElement(By.id("mobile")).sendKeys("8800805524");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		
	
		driver.findElement(By.xpath("//img[@alt='Export Contacts']")).click();
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
	}


