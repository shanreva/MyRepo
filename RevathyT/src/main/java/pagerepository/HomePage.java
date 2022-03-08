package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class HomePage extends BaseClass {

	static By loginlink = By.linkText("LOGIN");
	
	public static void ClickLogin()
	{
		d.findElement(loginlink).click();
	}
}
