package pagerepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class MyDashboard extends BaseClass {

	static By myAccount = By.id("dropdown03");
	static By logout = By.xpath("//*[@id=\"AuthLink\"]/div/a[3]");
	static By insurance = By.xpath("//*[@id=\"dropdown01\"]");
	static By applyLifeInsurance = By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[2]/div/a");
	static By updatelocation = By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[4]/a");
	static By myProfile = By.xpath("//*[@id=\"AuthLink\"]/div/a[2]");
	
	public static void clickMyAccount()
	{
		d.findElement(myAccount).click();
	}
	
	public static void clickLogout()
	{
		d.findElement(logout).click();
	}
	
	
	public static void clickInsurance()
	{
		d.findElement(insurance).click();
	}
	
	public static void clickApplyLifeInsurance()
	{
		d.findElement(applyLifeInsurance).click();
	}
	
	public static void clickMyProfile()
	{
		d.findElement(myProfile).click();
	}
	
	@SuppressWarnings("deprecation")
	public static void updatetoNewLocation() throws InterruptedException
	{
		d.findElement(updatelocation).click();
		
		d.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"mdzip\"]")).sendKeys("66020");
		Thread.sleep(2000);
		d.manage().timeouts().implicitlyWait(40000, TimeUnit.SECONDS);
		d.findElement(By.id("MDZBtn")).click();
	}
		
}
