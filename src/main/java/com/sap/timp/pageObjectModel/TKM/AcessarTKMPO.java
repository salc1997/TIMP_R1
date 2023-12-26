package com.sap.timp.pageObjectModel.TKM;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;

public class AcessarTKMPO extends TestBase{

					 
	@FindBy(xpath = "//div[text()=\"TKM\"]")
	public WebElement tkm;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;
	
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	public WebElement botao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-output\"]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view -view-wrapper  selected\"]//Span[text()=\"Pacotes Importados\"]")
	public WebElement mostrar;
	
	public AcessarTKMPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean acessarTKM() {
		


		waitExpectedElement("//*[@id=\"home-icon\"]");
		sleep(3000);
		
		while(tkm.isDisplayed() == false) {
			ar.click();
		}		
	
		tkm.click();
		waitExpectedElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		boolean sucesso = mostrar.isDisplayed();
		
		
		return sucesso;
		
		
		
	}
	
	
	
	
	
}
