package com.functions;

import java.io.IOException;

import com.basepage.BasePage;
import com.pages.RegisterPg;
import com.utilities.ExtentReportConf;
import com.utilities.ScreenShot;

public class RegisterFunc extends BasePage {

	private String firstName;
	private String lastName;
	private String emailId;
	private String telNo;
	private String password;
	private String confPassword;

	public RegisterFunc(String firstName, String lastName, String emailId, String telNo,
			String password, String confPassword) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.telNo = telNo;
		this.password = password;
		this.confPassword = confPassword;
	}

	public void validUserRegister() throws IOException {

		try {

			click(RegisterPg.myAccountLink());
			ExtentReportConf.reportPassLog("Clicked on My Account Link");
			
			click(RegisterPg.registerLink());
			ExtentReportConf.reportPassLog("Clicked on Register Link");

			enterText(RegisterPg.firstName(), firstName);
			ExtentReportConf.reportPassLog("Entered First Name as " + firstName);

			enterText(RegisterPg.lastName(), lastName);
			ExtentReportConf.reportPassLog("Entered Last Name as " + lastName);

			enterText(RegisterPg.email(), emailId);
			ExtentReportConf.reportPassLog("Entered Email Address as " + emailId);

			enterText(RegisterPg.telephone(), telNo);
			ExtentReportConf.reportPassLog("Entered Tel No. as " + telNo);

			enterText(RegisterPg.password(), password);
			ExtentReportConf.reportPassLog("Entered Password as " + password);

			enterText(RegisterPg.confPassword(), confPassword);
			ExtentReportConf.reportPassLog("Entered Confirm Password as " + confPassword);

			click(RegisterPg.subscribe().get(0));
			ExtentReportConf.reportPassLog("Click on Yes Subscribe Option Radio Button");

			click(RegisterPg.policy());
			ExtentReportConf.reportPassLog("Click on Accept policy check box");

			click(RegisterPg.continueBtn());
			ExtentReportConf.reportPassLog("Click on Continue Button");

			waitTovisibleElement(RegisterPg.registerMsg(), 10);
			assertEquals(RegisterPg.registerMsg(), "Your Account Has Been Created!");
			ExtentReportConf
					.reportPassLog("Verified Registration successful msg as " + gettext(RegisterPg.registerMsg()));

		} catch (Exception e) {

			String reg = ScreenShot.screenShotExtentReport(driver, "Register");
			ExtentReportConf.reportFailLogwithSS(e.getMessage(), reg);

		}
	}

}