package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class LoginPage extends BaseClass{
	
	static By loginemailaddress = By.name("LEmail");
	static By loginpassword = By.name("LPwd");
	static By loginbutton = By.id("LBtn");
	
	public static void LogInEmail(String Emailaddress)
	{
		d.findElement(loginemailaddress).sendKeys(Emailaddress);
	}
	
	public static void LogInPassword(String Password)
	{
		d.findElement(loginpassword).sendKeys(Password);
	}
	public static void clickLoginButton()
	{
		d.findElement(loginbutton).click();
	}
}