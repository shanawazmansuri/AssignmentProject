package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.basepage.BasePage;

public class RegisterPg extends BasePage {

	public static WebElement myAccountLink() {
		return xpath("//span[text()='My Account']");

	}

	public static WebElement registerLink() {
		return xpath("//a[text()='Register']");

	}

	public static WebElement firstName() {
		return id("input-firstname");

	}

	public static WebElement lastName() {
		return id("input-lastname");

	}

	public static WebElement email() {
		return id("input-email");

	}

	public static WebElement telephone() {
		return id("input-telephone");

	}

	public static WebElement password() {
		return id("input-password");

	}

	public static WebElement confPassword() {
		return id("input-confirm");

	}

	public static List<WebElement> subscribe() {
		return elements("//input[@name='newsletter']");

	}

	public static WebElement policy() {
		return xpath("//input[@type='checkbox']");

	}

	public static WebElement continueBtn() {
		return xpath("//input[@type='submit']");

	}
	
	public static WebElement registerMsg() {
		return xpath("//h1[contains(text(),'Your Account')]");

	}

}
