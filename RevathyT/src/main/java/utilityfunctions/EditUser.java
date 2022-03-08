package utilityfunctions;

import pagerepository.MyDashboard;
import pagerepository.UpdateProfile;

public class EditUser {
	
	public static void EditWithNewInformation()
	{
		MyDashboard.clickMyAccount();
		MyDashboard.clickMyProfile();
		UpdateProfile.newName();
		UpdateProfile.newAddress1();
		UpdateProfile.newAddress2();
		//Thread.sleep(5000);
		UpdateProfile.clickUpdateProfileButton();
	}

}
