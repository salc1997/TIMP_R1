package com.sap.timp.pageObjectModel.BRB.prueba;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;

public class AcessarBrbPO2 extends TestBaseSteven{

	LoginTC loginTC;
	
	@FindBy(xpath = "//div[text()=\"BRB\"]")
	public WebElement brb;
	
	@FindBy(xpath = "//*[@id=\"tkb-right-arrow\"]")
	public WebElement ar;
	
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	public WebElement botao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-output\"]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[1]/div")
	public WebElement mostrar;
	
	public AcessarBrbPO2() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean acessar() {
	
		
		sleep(1000);

		waitExpectXpath("//*[@id=\"home-icon\"]");
		
		while(brb.isDisplayed() == false) {
			ar.click();
		}		
	
		brb.click();
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
		waitExpectXpath("//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[1]/div");
		cadastro.click();
		//waitExpectXpath("//*[@id=\"right\"]/div/div[4]/div/div[2]/div/div[5]");
		//waitExpectXpath("//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div");
		//waitExpectXpath("//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = mostrar.isDisplayed();
		
		
		return sucesso;
		
		
		
	}
	
	
	
	
	
}