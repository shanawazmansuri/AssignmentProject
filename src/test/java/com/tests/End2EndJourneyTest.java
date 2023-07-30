package com.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.basepage.BasePage;
import com.functions.EndToEndScenFunc;
import com.functions.LoginFunc;

public class End2EndJourneyTest extends BasePage {
	
	EndToEndScenFunc e2e = new EndToEndScenFunc();
	LoginFunc log = new LoginFunc();
	

	@Test(description = "Validating End to End jouney of purchasing a product", priority = 1, enabled = true)
	public void buyProductTest() {
		
		
		try {
			log.loginUtil();
			e2e.buyProduct();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
