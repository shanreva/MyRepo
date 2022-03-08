package pagerepository;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import businessfunctions.BaseClass;

public class BuyInsurance extends BaseClass{

	static By coverageamount = By.name("ctl00$YMContents$LQCoverage");
	static By zipcode1 = By.name("ctl00$YMContents$LQZip");
	static By birthdate1 = By.name("LQDob");
	static By Gender = By.xpath("//*[@id=\"LQForm\"]/div[3]/div[1]/div[1]/label");
	static By feet = By.name("LQHeightF");
	static By inch = By.name("LQHeightI");
	static By weight = By.name("LQWeight");
	static By option1 = By.xpath("//*[@id=\"LQForm\"]/div[4]/div[2]/div[1]/label");
	static By option2 = By.xpath("//*[@id=\"LQForm\"]/div[5]/div[2]/div[2]/label");
	static By chk1 = By.xpath("//*[@id=\"LQForm\"]/div[7]/label");
	static By button = By.id("LQBtn");

	public static void SelectCoverageAmount()
	{
		Select a1 = new Select (d.findElement(coverageamount));
		a1.selectByVisibleText("$ 80000");
	}
	
	public static void enterZipCode1()
	{
		d.findElement(zipcode1).sendKeys("60060");
	}
	
	public static void enterbirthdate()
	{
		d.findElement(birthdate1).sendKeys("12/12/1990");
	}
	
	public static void selectGender()
	{
		d.findElement(Gender).click();
	}
	
	public static void enterFeet()
	{
		d.findElement(feet).sendKeys("6");
	}
	public static void enterInch()
	{
		d.findElement(inch).sendKeys("3");
	}
	
	public static void enterWeight()
	{
		d.findElement(weight).sendKeys("140");
	}
	
	public static void clickone()
	{
		d.findElement(option1).click();
	}
	
	public static void clicktwo()
	{
		d.findElement(option2).click();
	}
	
	public static void chechbox()
	{
		d.findElement(chk1).click();
	}

	public static void clickGetInstantQuotesButton()
	{
		d.findElement(button).click();
	}
}