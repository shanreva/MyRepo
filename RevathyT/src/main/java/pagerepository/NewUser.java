package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class NewUser extends BaseClass{

	static By emailaddress = By.name("REmail");
	static By password = By.name("RPwd");
	static By name = By.name("RName");
	static By mobilenumber = By.name("RMobile");
	static By gender = By.xpath("//*[@id=\"RForm\"]/div[3]/div[1]/div[1]/label");
	static By dob = By.name("RDob");
	static By address = By.name("RAddress_1");
	static By city = By.name("ctl00$YMContents$RCity");
	static By state = By.name("ctl00$YMContents$RState");
	static By zipcode = By.name("ctl00$YMContents$RZip");
	static By registerButton = By.id("RBtn");
	
	public static void EnterEmailAddreess(String myEmail)
	{
		d.findElement(emailaddress).sendKeys(myEmail);
	}
	public static void EnterPassword(String myPwd)
	{
		d.findElement(password).sendKeys(myPwd);
	}
	public static void EnterFullName()
	{
		d.findElement(name).sendKeys("My Old Name");
	}
	public static void EnterMobileNumber()
	{
		d.findElement(mobilenumber).sendKeys("1112223333");
	}
	public static void SelectGender()
	{
		d.findElement(gender).click();
	}
	public static void EnterDOB()
	{
		d.findElement(dob).sendKeys("12/19/1990");
	}
	public static void EnterAddress()
	{
		d.findElement(address).sendKeys("123 Washington St.");
	}
	public static void EnterCity()
	{
		d.findElement(city).sendKeys("Washington");
	}
	public static void EnterState()
	{
		d.findElement(state).sendKeys("D.C");
	}
	public static void EnterZipcode()
	{
		d.findElement(zipcode).sendKeys("60060");
	}
	
	public static void clickRegisterButton()
	{
		d.findElement(registerButton).click();
	}
}
