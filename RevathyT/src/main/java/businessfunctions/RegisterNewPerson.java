package businessfunctions;

import pagerepository.NewUser;

public class RegisterNewPerson extends BaseClass{
	
	public static void PassingNewPersonDetails(String email, String pwd)
	{
		NewUser.EnterEmailAddreess(email);
		NewUser.EnterPassword(pwd);
		NewUser.EnterFullName();
		NewUser.EnterMobileNumber();
		NewUser.SelectGender();
		NewUser.EnterDOB();
		NewUser.EnterAddress();
		NewUser.EnterCity();
		NewUser.EnterState();
		NewUser.EnterZipcode();
	}
}
