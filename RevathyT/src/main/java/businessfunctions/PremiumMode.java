package businessfunctions;

import pagerepository.ChooseInsuranceQuote;

public class PremiumMode {

	public static void SelecturPremiumType() throws InterruptedException
	{
		ChooseInsuranceQuote.Mode1();
		ChooseInsuranceQuote.Mode2();
		Thread.sleep(5000);
		ChooseInsuranceQuote.clickPayPremium();
	}
}
