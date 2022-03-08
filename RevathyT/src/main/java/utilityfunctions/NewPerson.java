package utilityfunctions;

import businessfunctions.RegisterNewPerson;
import configuration.MyConfiguration;
import pagerepository.HomePage;
import pagerepository.MyDashboard;
import pagerepository.NewUser;

public class NewPerson {
	
	public static void RegisterForNewPerson()
	{
		HomePage.ClickLogin();
		RegisterNewPerson.PassingNewPersonDetails(MyConfiguration.passProperties("NewEmailAddress"),MyConfiguration.passProperties("NewPassword"));
		NewUser.clickRegisterButton();
		
		MyDashboard.clickMyAccount();
		MyDashboard.clickLogout();
	}
	
	

}
