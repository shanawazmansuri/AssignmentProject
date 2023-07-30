package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.basepage.BasePage;

public class EndtoEndScenarioPg extends BasePage {
	


	public static WebElement search() {
		return name("search");

	}
	
	public static WebElement searchBtn() {
		return xpath("//button[@class='btn btn-default btn-lg']");

	}
	
	public static WebElement productLabel() {
		return xpath("//a[text()='HTC Touch HD']");

	}
	
	public static WebElement addToCart() {
		return xpath("//span[text()='Add to Cart']");

	}
	
	public static WebElement addCartMsg() {
		return xpath("//div[contains(text(),' Success:')]");

	}
	
	public static WebElement checkout() {
		return xpath("//a[@title='Checkout']");
		

	}
	
	public static WebElement paymentAddressConf() {
		return id("button-payment-address");

	}
	
	public static WebElement shippingaddressConf() {
		return id("button-shipping-address");

	}
	
	public static WebElement shippingMethod() {
		return id("button-shipping-method");

	}
	
	public static WebElement termCond() {
		return name("agree");

	}
	
	public static WebElement cod() {
		return name("payment_method");

	}
	
	public static WebElement paymentMethodConf() {
		return id("button-payment-method");

	}
	
	public static List<WebElement> confOrderDetails() {
		return elements("//table[@class='table table-striped']/tbody/tr/td");

	}
	
	public static WebElement confproduct() {
		return xpath("//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tbody/tr/td[1]/a");

	}
	
	public static WebElement confQty() {
		return xpath("//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tbody/tr/td[3]");

	}
	
	public static WebElement confPrice() {
		return xpath("//*[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tbody/tr/td[4]");

	}
	
	public static WebElement confOrderBtn() {
		return id("button-confirm");

	}
	
	public static WebElement confOrderMsg() {
		return xpath("//h1[text()='Your order has been placed!']");

	}
	
	
	
	
	
	
	
	

	
	
	
	

}
