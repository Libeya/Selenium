package Handling_PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1.navigate to webpage
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        
        //Launching a new window and switching the tool control simultaneously
        
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.oracle.com/in/");
        System.out.println(driver.getTitle());

	}

}
