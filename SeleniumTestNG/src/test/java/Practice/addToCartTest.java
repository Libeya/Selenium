package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class addToCartTest {
	
	WebDriver driver=null;
	
	@Test(priority = -1)
	public void launchingBrowser()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
    @Test(priority = 1, dependsOnMethods = "launchingBrowser")
	public void logIn()

	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("error_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//verification
		WebElement swagLabsText=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		if(swagLabsText.getText().contains("Swag Labs"))
		{
			System.out.println("Login Successfull");
		}
		
		else
		{
			System.out.println("Login Failed");
		}
	}
	@Test(priority = 2)
    
    public void addToCart()
    {
		
		//adding to cart 
		
    	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    	
    	//verifying
    	
    	driver.findElement(By.id("shopping_cart_container")).click();
    	List<WebElement> productsInTheCart = driver.findElements(By.className("cart_item"));;
    	String addToCartVerify="";
    	
    	for(WebElement cartproducts: productsInTheCart)
    	{
    		addToCartVerify+=cartproducts.getText();
    		
    	}
    	if(addToCartVerify.contains("Sauce Labs Bike Light") && addToCartVerify.contains("Sauce Labs Backup"))
    	{
    		 System.out.println("Status : Pass");
    	}
    	
    	else
    	{
    		System.out.println("Status : Fail");
    	}
    	
    }
	
	@Test(priority = 3, dependsOnMethods = "logIn")
	public void logOut()
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
}
