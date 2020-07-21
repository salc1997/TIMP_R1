package com.sap.timp.pageObjectModel.MDR;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AcessarMDRPO extends TestBaseSteven{

	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div/div/div/ul/li[12]")
	public WebElement mdr;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;
	
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	public WebElement botao;
	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[1]")
	public WebElement mostrar;
	

	public AcessarMDRPO() {

		PageFactory.initElements(driver, this);
	}

	
	public void acessarMDR() {
		String url = driver.getCurrentUrl();
		waitExpectXpath("//*[@id=\"home-icon\"]");
		
		while(mdr.isDisplayed() == false) {
			ar.click();
		}
		
		mdr.click();
		
		waitExpectElement(mostrar);
		if (url.contains("tc2") || url.contains("tp1")) {
			waitExpectXpath("//*[@id=\"list\"]/div/div[2]/div/div[9]");
		}
		
		sleep(2000);
		
	
		
		
	}
	
}
