package tests;

import businessfunctions.BaseClass;
import pagerepository.MyDashboard;
import utilityfunctions.BuyAInsurancePremium;
import utilityfunctions.EditUser;
import utilityfunctions.LoginWithAUser;
import utilityfunctions.NewPerson;

public class InsuranceInternshipFramewok extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BaseClass.OpenBrowser();
		
		NewPerson.RegisterForNewPerson();
		
		Thread.sleep(5000);
		
		LoginWithAUser.LoginUserDetails();
		
		Thread.sleep(5000);
		
		MyDashboard.updatetoNewLocation();
		
		Thread.sleep(5000);

		EditUser.EditWithNewInformation();
		
		Thread.sleep(5000);
		
		BuyAInsurancePremium.BuyandPayaPremium();
		
		Thread.sleep(5000);
		
		BaseClass.CloseBrowser();
	}

}
