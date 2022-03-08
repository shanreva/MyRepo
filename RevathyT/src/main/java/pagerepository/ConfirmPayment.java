package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class ConfirmPayment extends BaseClass {
	
	static By PayNow = By.id("MDPayBtn");
	
	public static void clickPayNowButton()
	{
		d.findElement(PayNow).click();
	}

}
