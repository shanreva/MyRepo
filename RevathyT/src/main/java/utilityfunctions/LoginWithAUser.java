package utilityfunctions;

import businessfunctions.LoginRegisteredPerson;
import configuration.MyConfiguration;
import pagerepository.HomePage;
import pagerepository.LoginPage;

public class LoginWithAUser {
	
	public static void LoginUserDetails()
	{
		HomePage.ClickLogin();
		
		LoginRegisteredPerson.LoginforRegisteredPerson(MyConfiguration.passProperties("NewEmailAddress"),MyConfiguration.passProperties("NewPassword"));
		LoginPage.clickLoginButton();
	}

}
