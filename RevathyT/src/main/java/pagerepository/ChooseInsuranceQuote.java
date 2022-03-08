package pagerepository;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import businessfunctions.BaseClass;

public class ChooseInsuranceQuote extends BaseClass {

	static By premiummode1 = By.id("PremMode");
	static By premiummode2 = By.id("PlanType");
	static By paypremium = By.xpath("//*[@id=\"InsurerTbl\"]/tr/td[5]/button");
	
	public static void Mode1()
	{
		Select a1 = new Select(d.findElement(premiummode1));
		a1.selectByIndex(2);
	}
	
	public static void Mode2()
	{
		Select a2 = new Select(d.findElement(premiummode2));
		a2.selectByIndex(1);
	}
	
	public static void clickPayPremium()
	{
		d.findElement(paypremium).click();
	}
}
