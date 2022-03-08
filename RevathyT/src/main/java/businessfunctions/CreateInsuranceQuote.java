package businessfunctions;

import pagerepository.BuyInsurance;

public class CreateInsuranceQuote {

	public static void InputForInsuranceQuote()
	{
		BuyInsurance.SelectCoverageAmount();
		BuyInsurance.enterZipCode1();
		BuyInsurance.enterbirthdate();
		BuyInsurance.selectGender();
		BuyInsurance.enterFeet();
		BuyInsurance.enterInch();
		BuyInsurance.enterWeight();
		BuyInsurance.clickone();
		BuyInsurance.clicktwo();
		BuyInsurance.chechbox();
	}
}
