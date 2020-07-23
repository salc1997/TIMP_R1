package com.sap.timp.pageObjectModel.MDR.Tributos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKathy;

public class TributosCriarPO extends TestBaseKathy{
	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div/div/div/ul/li[6]/div[1]")
	public WebElement brb;
	
	@FindBy(xpath = "//*[@id=\"tkb-right-arrow\"]")
	public WebElement derecha;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[2]/div/div[5]")
	public WebElement btnSuccess;
	
	public TributosCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Acceder() {
		while(!brb.isDisplayed()) {
			derecha.click();					
		}
		waitExpectElement(brb);
	
		brb.click();	
		waitExpectElement(btnSuccess);
		
		boolean exito = btnSuccess.isDisplayed();
		return exito;
	}

}
