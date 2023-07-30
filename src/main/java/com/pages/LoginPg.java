package com.pages;

import org.openqa.selenium.WebElement;

import com.basepage.BasePage;

public class LoginPg extends BasePage {

	public static WebElement loginLink() {
		return xpath("//a[text()='Login']");

	}

	public static WebElement loginEmailid() {
		return id("input-email");

	}

	public static WebElement loginPwd() {
		return id("input-password");

	}

	public static WebElement loginBtn() {
		return xpath("//input[@type='submit']");

	}
	
	public static WebElement invalidUserMsg() {
		return xpath("//div[contains(text(),'Warning:')]");

	}

}
