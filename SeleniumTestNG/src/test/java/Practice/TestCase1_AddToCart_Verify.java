package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1_AddToCart_Verify {

    // Global WebDriver
    WebDriver driver = null;

    @Test(priority = -1)
    public void launchingBrowser() {

        // Launching the browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 0, dependsOnMethods = "launchingBrowser")
    public void logIn() {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Product page Verification
        String expectedTitle = "Products";
        String actualTitle = driver.findElement(By.className("title")).getText();

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 1, dependsOnMethods = "logIn")
    public void addToCart() {

        // Adding products to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();

        // Open cart
        driver.findElement(By.id("shopping_cart_container")).click();

        // Get cart items
        List<WebElement> productsInCart = driver.findElements(By.className("inventory_item_name"));

        // Verify product names
        Assert.assertEquals(productsInCart.get(0).getText(), "Sauce Labs Backpack");
        Assert.assertEquals(productsInCart.get(1).getText(), "Sauce Labs Bolt T-Shirt");
    }

    @Test(priority = 2, dependsOnMethods = "addToCart")
    public void checkout() {

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Libeya");
        driver.findElement(By.id("last-name")).sendKeys("Mary");
        driver.findElement(By.id("postal-code")).sendKeys("600037");

        driver.findElement(By.id("continue")).click();
    }

    // Validate price and complete order
    @Test(priority = 3, dependsOnMethods = "checkout")
    public void priceOrder() {

        String expectedValue = "Total: $49.66";
        String actualValue = driver.findElement(By.className("summary_total_label")).getText();

        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test(priority = 4, dependsOnMethods = "priceOrder")
    public void logOut() {

        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();
    }

    @Test(priority = 5, dependsOnMethods = "logOut")
    public void closeBrowser() {

        driver.quit();
    }
}