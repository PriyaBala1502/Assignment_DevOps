package devopsAssign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeAmazon {

	public static void main(String[] args) {
		
		//String driverPath = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
		
		String driverPath ="C:\\SelinuiumSoft\\msedgedriver.exe";
	    
		String baseurl ="https://www.amazon.in";
		
		System.setProperty("webdriver.edge.driver",driverPath);
						
		WebDriver driver =new EdgeDriver();
		
	      driver.get(baseurl);
	       
	      driver.manage().window().maximize();
		
		 String title = driver.getTitle();
		 
		   System.out.println(title);
	
	    driver.quit();
	  

	}

}
