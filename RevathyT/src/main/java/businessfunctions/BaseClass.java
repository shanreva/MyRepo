package businessfunctions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver d = null;
	
	public static void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shant\\Desktop\\Revathy\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://tanchan-001-site3.btempurl.com/production/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	public static void CloseBrowser()
	{
		d.close();
		d.quit();
	}

}
