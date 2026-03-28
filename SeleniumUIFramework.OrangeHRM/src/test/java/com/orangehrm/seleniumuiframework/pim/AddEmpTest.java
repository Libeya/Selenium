package com.orangehrm.seleniumuiframework.pim;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.AddEmployeePage;
import com.orangehrm.seleniumuiframework.object_repository.DashboardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;
import com.orangehrm.seleniumuiframework.object_repository.PIMPage;

public class AddEmpTest {
	
WebDriver driver;
	
	@Test
	public void AddEmployee() {
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 LoginPage lp=new LoginPage(driver);
		 DashboardPage dbp = new DashboardPage(driver);
		 PIMPage pp = new PIMPage(driver);
		 AddEmployeePage aep = new AddEmployeePage(driver);
		 
		 //Login
		 lp.login("Admin", "admin123");
		//Navigate to PIM 
		dbp.clickPim_module();
		//Add user
		pp.clickAdd_btn();
//		//Add Emp
		aep.addEmp("Roha", "K", "Krisha", "140");
		aep.createCreditionals("rohakrish", "rohan123");
	}

}
