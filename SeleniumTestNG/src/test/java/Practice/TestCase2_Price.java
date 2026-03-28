package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2_Price {
	WebDriver driver;

	@Test(priority = -1)
	public void LaunchingBrowser() {
		
		//Launching the browser
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(priority = 0, dependsOnMethods = "LaunchingBrowser")
	public void Login() {
		
		// Navigate to Swag Labs Website
		driver.get("https://www.saucedemo.com/");
		
		// Login  credentials
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

	}
	
	@Test(priority = 1, dependsOnMethods = "Login")
	public void sort() {
		
		//Sort Price low to high and then add to cart
		
		driver.findElement(By.xpath("//select[@class = 'product_sort_container']"
				+ "/option[. ='Price (low to high)']")).click();
		driver.findElement(By.xpath("//button[.= 'Add to cart']")).click();
		
		//Add to Cart
		
		driver.findElement(By.className("shopping_cart_link")).click();
		
		//Verify Product in Cart
		
		String res = "Sauce Labs Onesie";
		WebElement cart = driver.findElement(By.className("inventory_item_name"));
		Assert.assertEquals(cart.getText(), res);
	}
	@Test(priority = 2, dependsOnMethods = "sort")
	public void checkout() {
		
		//checkout 
		
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Libe");
		driver.findElement(By.id("last-name")).sendKeys("Mary");
		driver.findElement(By.id("postal-code")).sendKeys("600037");
        driver.findElement(By.name("continue")).click();
		
		
		//Verify Order Summary and Complete Order4
        
		WebElement price = driver.findElement(By.className("inventory_item_price"));
		String tot = "";
		double total = 0;
			String new_price = price.getText().replace("$", "");
			double num = Double.parseDouble(new_price);
			total = total + num;		
			total += 0.64;
			
		//Validate
			
		Assert.assertEquals(total, 8.63);
		driver.findElement(By.id("finish")).click();
		
	}
		@Test(priority=3, dependsOnMethods ="checkout" )
		public void logOut() {

	        driver.findElement(By.id("react-burger-menu-btn")).click();
	        driver.findElement(By.id("logout_sidebar_link")).click();
	    }

	    @Test(priority = 4, dependsOnMethods = "logOut")
	    public void closeBrowser() {

	        driver.quit();
	    }
	}



