package devopsAssign;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;




public class AmazonFirefox {

	
	public static void main(String[] args) {
		
		    String driverPath = "C:\\SelinuiumSoft\\geckodriver.exe";

		    		    
			String baseurl ="https://www.amazon.com/";
			
			System.setProperty("webdriver.gecko.driver",driverPath);
		
			
			WebDriver driver =new FirefoxDriver();
			
			driver .manage().window().maximize();
			
	       driver.get(baseurl);
		
		  
		   String title = driver.getTitle();
		   System.out.println(title);
		   driver.quit();
		
	}

}
