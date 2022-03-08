package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class UpdateProfile extends BaseClass {
	
	static By myFullName = By.name("ctl00$YMContents$UName");
	static By myNewAddress = By.name("ctl00$YMContents$UAddress_1");
	static By myLocation = By.name("ctl00$YMContents$UAddress_2");
	static By myButton = By.xpath("//*[@id=\"UBtn\"]");


	public static void newName()
	{
		d.findElement(myFullName).clear();
		d.findElement(myFullName).sendKeys("My New Name");
	}
	
	public static void newAddress1()
	{
		d.findElement(myNewAddress).clear();
		d.findElement(myNewAddress).sendKeys("My New Address");
	}
	
	public static void newAddress2()
	{
		d.findElement(myLocation).clear();
		d.findElement(myLocation).sendKeys("My New Address 2");
	}
	
	public static void clickUpdateProfileButton()
	{
		d.findElement(myButton).click();
	}
	
	
}