package mavenParameter;

import org.testng.annotations.Test;

public class ToReadDataFromMaven {

	@Test
	public void readData() {
		
		String urlData = System.getProperty("Url");
		String bName = System.getProperty("browserName");
		
		System.out.println(urlData);
		System.out.println(bName);
	
	}
}
