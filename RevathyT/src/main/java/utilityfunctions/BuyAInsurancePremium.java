package utilityfunctions;

import businessfunctions.CreateInsuranceQuote;
import businessfunctions.PremiumMode;
import pagerepository.BuyInsurance;
import pagerepository.ConfirmPayment;
import pagerepository.MyDashboard;
import pagerepository.PayPremium;

public class BuyAInsurancePremium {

	public static void BuyandPayaPremium() throws InterruptedException
	{
		MyDashboard.clickInsurance();
		MyDashboard.clickApplyLifeInsurance();
		
		CreateInsuranceQuote.InputForInsuranceQuote();
		
		BuyInsurance.clickGetInstantQuotesButton();
		//Thread.sleep(5000);
		
		PremiumMode.SelecturPremiumType();
		
		//Thread.sleep(5000);
		PayPremium.clickPayPremiumButton();
		//Thread.sleep(5000);
		ConfirmPayment.clickPayNowButton();

	}
}
