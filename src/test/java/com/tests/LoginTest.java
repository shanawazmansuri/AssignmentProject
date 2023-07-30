package com.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.basepage.BasePage;
import com.functions.LoginFunc;
import com.utilities.ExcelUtils;

public class LoginTest extends BasePage {

	@DataProvider(name = "Login")
	public Object[][] loginData() {
		Object[][] data = ExcelUtils.excelData(".\\ExcelData\\GM.xls", "ValidLogin");
		return data;
	}
	
	@DataProvider(name = "InvalidLogin")
	public Object[][] invalidData() {
		Object[][] data = ExcelUtils.excelData(".\\ExcelData\\GM.xls", "InvalidLogin");
		return data;
	}

	@Test(dataProvider = "Login", description = "Validating by Login into the system", priority = 1, enabled = false)
	public void userLoginTest(String loginUserEmail, String loginUserPwd) {
		LoginFunc log = new LoginFunc(loginUserEmail, loginUserPwd);
		try {
			log.userLoginTest();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	@Test(dataProvider = "InvalidLogin", description = "Validating by Login into the system by invalid user Name and Password", priority = 2, enabled = true)
	public void invalidUserTest(String loginUserEmail, String loginUserPwd) {
		LoginFunc log = new LoginFunc(loginUserEmail, loginUserPwd);
		try {
			log.invalidUserLogin();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	@Test(description = "Login Utility", priority = 3, enabled = false)
	public void loginUtility() {
		try {
			LoginFunc log = new LoginFunc();

			log.loginUtil();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}