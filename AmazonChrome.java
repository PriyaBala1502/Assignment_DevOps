package devopsAssign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonChrome {

	public static void main(String[] args) {

		String baseurl ="https://www.amazon.com/";
		
		System.setProperty("webdriver.chrome.driver","C:\\SelinuiumSoft\\chromedriver-win64 -123\\chromedriver-win64\\chromedriver.exe");	
			 					
		WebDriver driver =new ChromeDriver();
		
	       driver.get(baseurl);
		
		driver.manage().window().maximize();
		
		 String title = driver.getTitle();
		   System.out.println(title);
	
	    //driver.quit();
	  
	}

}
