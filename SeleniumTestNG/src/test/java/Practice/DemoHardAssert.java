package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert {
	
	@Test
	public void Test()
	{
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		String expectedTitle="Google";
		
		String actualTitle=driver.getTitle();
		
		
		//Hard Assertion
		Assert.assertEquals(actualTitle, expectedTitle);
		if(expectedTitle.equals(actualTitle))
		System.out.println("Test Cases  Passed");
		else
			System.out.println("Test Case Failed");
		Assert.assertTrue(expectedTitle.equals(actualTitle));
	}

}
