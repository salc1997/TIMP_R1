package com.sap.timp.pageObjectModel.MDR.DerexInstituicao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class InstitucaoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
	public WebElement derex;
	@FindBy(xpath = "//li/div/span[text()=\"Instituição Financeira\"]")
	public WebElement instituicaoF;
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;
	
	public InstitucaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public String visualizar() {
		
		derex.click();
		sleep(1000);
		instituicaoF.click();
		
		waitExpectXpath("//*[@id=\"table\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"table\"]/div[2]/div/div/div/img");
		sleep(2000);

		siguiente.click();
		
		waitExpectXpath("//*[@id=\"table\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"table\"]/div[2]/div/div/div/img");
		sleep(2000);

		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		menu.click();
		sleep(2000);
		visualizar.click();
		sleep(2000);
		
		attributeToBeXpath("//div[@class=\"edit tabs\"]", "id", "show");
		
		
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		System.out.println(sucesso);
		return sucesso;
		
		
	}
	
	

}
