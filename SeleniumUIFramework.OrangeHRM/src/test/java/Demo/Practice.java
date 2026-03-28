package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Practice { 
	@Test
	
	public void readData() throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/main/resources/OrangeHRM_Common_Data/Commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String URL=prop.getProperty("url");
		
		String Browser=prop.getProperty("browser");
		
		String ValidUserName=prop.getProperty("username");
		
		String ValidPassword=prop.getProperty("password");
		
		System.out.println("The default browser for testing is: "+ Browser);
		
		System.out.println("The Url of the application for testing is: "+URL);
		
		System.out.println("The valid username for the application is: "+ValidUserName);
		
		System.out.println("The valid password for the application  is: "+ValidPassword);
		
		FileOutputStream fos = new FileOutputStream("./src/main/resources/OrangeHRM_Common_Data/Commondata.properties");
		
		prop.setProperty("CandidateName", "Jones");
		
		prop.store(fos, null);
		
	}

}
