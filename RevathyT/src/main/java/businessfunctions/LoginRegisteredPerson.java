package businessfunctions;

import pagerepository.LoginPage;

public class LoginRegisteredPerson extends BaseClass{

	public static void LoginforRegisteredPerson(String email, String pwd)
	{
		LoginPage.LogInEmail(email);
		LoginPage.LogInPassword(pwd);
	}
}
