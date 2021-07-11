import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

import com.crm.GenericsUtil.JavaUtility;

	public class VtigerPractice {
		@Test
		public void createOrganisationTest1() throws Throwable {
			PropertyUtility pUtil=new PropertyUtility();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(pUtil.getPropertyKeyValue("url"));
			driver.findElement(By.name("user_name")).sendKeys(pUtil.getPropertyKeyValue("username"));
			driver.findElement(By.name("user_password")).sendKeys(pUtil.getPropertyKeyValue("password"));
			driver.findElement(By.id("submitButton")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Organizations")).click();
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			driver.findElement(By.xpath("accountname")).sendKeys("TCS"+JavaUtility+.getRandomData());
			driver.findElement(By.xpath("//input[@title='Save[Alt+S]']")).click();
		}
	}


