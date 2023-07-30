package com.functions;

import java.io.IOException;

import org.testng.Assert;

import com.basepage.BasePage;
import com.pages.EndtoEndScenarioPg;
import com.utilities.ExtentReportConf;
import com.utilities.ScreenShot;

public class EndToEndScenFunc extends BasePage {

	public void buyProduct() throws IOException {

		try {

			String product = pro.prop.getProperty("product");
			String qty = pro.prop.getProperty("qty");
			String price = pro.prop.getProperty("price");
			
			
			
			enterText(EndtoEndScenarioPg.search(), product);
			ExtentReportConf.reportPassLog("Entered Prodct Search as " + product);
			

			click(EndtoEndScenarioPg.searchBtn());
			ExtentReportConf.reportPassLog("Clicked on Search Button");

			scrollDownUsingJavascriptExecutor();
			Assert.assertEquals(gettextByAttribute(EndtoEndScenarioPg.productLabel(),"innerHTML"), product);
			ExtentReportConf.reportPassLog("Verfied search result as " + product);

			
			click(EndtoEndScenarioPg.addToCart());
			ExtentReportConf.reportPassLog("Clicked on Add to Cart Button");

			
			assertTrueContains(EndtoEndScenarioPg.addCartMsg(), "Success: You have added HTC Touch HD to your shopping cart!");
			ExtentReportConf.reportPassLog("Verfied search result as " + product);

			Wait(2000);
			waitToClick(EndtoEndScenarioPg.checkout(), 10);
			click(EndtoEndScenarioPg.checkout());
			ExtentReportConf.reportPassLog("Clicked on CheckOut Button");

			waitToClick(EndtoEndScenarioPg.paymentAddressConf(), 10);
			click(EndtoEndScenarioPg.paymentAddressConf());
			ExtentReportConf.reportPassLog("Clicked on Continue Button on Billing Details Section");

			
			waitToClick(EndtoEndScenarioPg.shippingaddressConf(), 10);
			click(EndtoEndScenarioPg.shippingaddressConf());
			ExtentReportConf.reportPassLog("Clicked on Continue Button on Delivery Details Section");

			
			waitToClick(EndtoEndScenarioPg.shippingMethod(), 10);
			click(EndtoEndScenarioPg.shippingMethod());
			ExtentReportConf.reportPassLog("Clicked on Continue Button on Delivery Method Section");

			
			waitToClick(EndtoEndScenarioPg.cod(), 10);
			click(EndtoEndScenarioPg.cod());
			ExtentReportConf.reportPassLog("Clicked on Cash on Delivery Payment Method");

			
			waitToClick(EndtoEndScenarioPg.termCond(), 10);
			click(EndtoEndScenarioPg.termCond());
			ExtentReportConf.reportPassLog("Clicked on Accept Terms and Condition check box");

			
			waitToClick(EndtoEndScenarioPg.paymentMethodConf(), 10);
			click(EndtoEndScenarioPg.paymentMethodConf());
			ExtentReportConf.reportPassLog("Clicked on Continue Button on Payment Method Section");
			
			
			scrollDownUsingJavascriptExecutor();
			String actprodDetails = gettextByAttribute(EndtoEndScenarioPg.confproduct(), "innerHTML");
						
			
			Assert.assertEquals(actprodDetails, product);
			ExtentReportConf.reportPassLog("Verified product as "+actprodDetails);
			
			
			assertEquals(EndtoEndScenarioPg.confQty(), qty);
			ExtentReportConf.reportPassLog("Verified Qty as "+gettext(EndtoEndScenarioPg.confQty()));
			
			
			assertEquals(EndtoEndScenarioPg.confPrice(), price);
			ExtentReportConf.reportPassLog("Verified Actual Price as "+gettext(EndtoEndScenarioPg.confPrice()));
			
			
			click(EndtoEndScenarioPg.confOrderBtn());
			ExtentReportConf.reportPassLog("Clicked on Confirm Order Button");
			
			
			assertEquals(EndtoEndScenarioPg.confOrderMsg(), "Your order has been placed!");
			ExtentReportConf.reportPassLog("Verified success order placed message");
			
			

		} catch (Exception e) {

			String e2e = ScreenShot.screenShotExtentReport(driver, "end2end");
			ExtentReportConf.reportFailLogwithSS(e.getMessage(), e2e);

		}
	}

}
