package com.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.basepage.BasePage;
import com.functions.RegisterFunc;
import com.utilities.ExcelUtils;

public class RegisterTest extends BasePage {

	@DataProvider(name = "Register")
	public Object[][] registerData() {
		Object[][] data = ExcelUtils.excelData(".\\ExcelData\\GM.xls", "Register");
		return data;
	}

	@Test(dataProvider = "Register", description = "Validating by registering new User with proper data", priority = 1, enabled = true)
	public void registerUserTest(String firstName, String lastName, String emailId, String telNo,
			String password, String confPassword) {
		RegisterFunc reg = new RegisterFunc(firstName, lastName, emailId, telNo , password, confPassword);
		try {
			reg.validUserRegister();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}