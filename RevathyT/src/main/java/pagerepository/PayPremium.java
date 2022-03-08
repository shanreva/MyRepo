package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class PayPremium extends BaseClass {
	
	static By PayPremiuim = By.id("PPBtn");

	public static void clickPayPremiumButton()
	{
		d.findElement(PayPremiuim).click();
	}
}
