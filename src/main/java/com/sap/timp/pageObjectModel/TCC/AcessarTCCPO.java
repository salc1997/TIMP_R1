package com.sap.timp.pageObjectModel.TCC;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class AcessarTCCPO extends TestBase{

	@FindBy(xpath = "//div[text()=\"TCC\"]")
	public WebElement tcc;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;

	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-balanceConsolidation\"]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-balanceConsolidation\"]")
	public WebElement mostrar;
	

	public AcessarTCCPO() {

		PageFactory.initElements(driver, this);
	}

	
	public boolean acessarTCC() {

		waitExpectedElement("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!tcc.isDisplayed()) {
			ar.click();
		}
		sleep(1000);
		
		tcc.click();
		
		waitExpectedElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		
		return sucesso;
		
		
	}
	
}
