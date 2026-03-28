package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
	
	@DataProvider(name = "KeyvalueData")
	Object[][] getData() {
		return new Object[][] { { "key", "value" }, 
			{ "username", "Admin" }, 
			{ "password", "admin123" }
			};
	}
		@DataProvider(name = "KeyvalueData1")
		Object[][]getInfo(){
     return new Object[][] {
    	 {"Browser","Firefox","1"},
    	 {"Username","user","2"},
    	 {"Password","user123","3"},
     };
		}

	@Test(dataProvider = "KeyvalueData1")
	public void readingFromDataProvider(String key, String value, String data) {
		System.out.println("My key is: " + key + "=======>My value is: " + value + "=====>" + data );
	}

}
