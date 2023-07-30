package com.functions;

import java.io.IOException;

import com.basepage.BasePage;
import com.pages.LoginPg;
import com.pages.RegisterPg;
import com.utilities.ExtentReportConf;
import com.utilities.ScreenShot;

public class LoginFunc extends BasePage{
	
	private String loginUserEmail;
	private String loginUserPwd;
	
	public LoginFunc(String loginUserEmail, String loginUserPwd) {
		this.loginUserEmail = loginUserEmail;
		this.loginUserPwd = loginUserPwd;
	}
	
	public LoginFunc() {
	}
	
	public void loginSteps()
	{
		
		click(RegisterPg.myAccountLink());
		ExtentReportConf.reportPassLog("Clicked on My Account Link");
		
		click(LoginPg.loginLink());
		ExtentReportConf.reportPassLog("Clicked on Login Link");

		enterText(LoginPg.loginEmailid(), loginUserEmail);
		ExtentReportConf.reportPassLog("Entered Login Email Id as " + loginUserEmail);
		
		enterText(LoginPg.loginPwd(), loginUserPwd);
		ExtentReportConf.reportPassLog("Entered Login User Pwd as " + loginUserPwd);

		click(LoginPg.loginBtn());
		ExtentReportConf.reportPassLog("Click on Login Button");

	}
	
	
	public void userLoginTest() throws IOException {

		try {

			loginSteps();

		} catch (Exception e) {

			String logs = ScreenShot.screenShotExtentReport(driver, "Login");
			ExtentReportConf.reportFailLogwithSS(e.getMessage(), logs);

		}
	}

	
	public void invalidUserLogin() throws IOException {

		try {

			loginSteps();
			
			assertEquals(LoginPg.invalidUserMsg(), "Warning: No match for E-Mail Address and/or Password.");
			ExtentReportConf.reportPassLog("Verified Invalid User Msg as "+gettext(LoginPg.invalidUserMsg()));


		} catch (Exception e) {

			String log = ScreenShot.screenShotExtentReport(driver, "Login");
			ExtentReportConf.reportFailLogwithSS(e.getMessage(), log);

		}
	}
	
	public void loginUtil() throws IOException {

		try {


			click(RegisterPg.myAccountLink());
			ExtentReportConf.reportPassLog("Clicked on My Account Link");
			
			click(LoginPg.loginLink());
			ExtentReportConf.reportPassLog("Clicked on Login Link");
			
			String userName = pro.prop.getProperty("userName");	
			enterText(LoginPg.loginEmailid(), userName);
			ExtentReportConf.reportPassLog("Entered Login Email Id as " + userName);
			
			String pwd = pro.prop.getProperty("pwd");	
			enterText(LoginPg.loginPwd(), pwd);
			ExtentReportConf.reportPassLog("Entered Login User Pwd as " + pwd);

			click(LoginPg.loginBtn());
			ExtentReportConf.reportPassLog("Click on Login Button");


		} catch (Exception e) {

			String log = ScreenShot.screenShotExtentReport(driver, "LoginUtil");
			ExtentReportConf.reportFailLogwithSS(e.getMessage(), log);

		}
	}


}
