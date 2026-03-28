package Handling_PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1.navigate to webpage
        driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
        Thread.sleep(2000);

        // 2.clicking on view more of laptops
        driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();

        // Switching to child window
        String parentId = driver.getWindowHandle();
        Set<String> allWindowId = driver.getWindowHandles();

        allWindowId.remove(parentId);

        for (String childId : allWindowId) {
            driver.switchTo().window(childId);
        }

        WebElement addToCart = driver.findElement(By.tagName("button"));
        addToCart.click();
        addToCart.click();

        Thread.sleep(2000);

        WebElement cartlogo = driver.findElement(By.xpath("//*[local-name()='svg']"));
        cartlogo.click();

        Thread.sleep(2000);

        WebElement shoppingCartList = driver.findElement(By.tagName("h2"));

        if (shoppingCartList.isDisplayed()) {
            System.out.println("Test case status: Pass");
        } else {
            System.out.println("Test case status: Fail");
        }

        driver.close();
    }
}