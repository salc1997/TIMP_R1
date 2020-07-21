package com.sap.timp.pageObjectModel.MDR.DerexInstituicao;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class InstitucaoEliminarPO extends TestBaseSteven {
	
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
	
	@FindBy(xpath = "//li/span[text()=\"Excluir\"]")
	public WebElement excluir;

	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	
	public InstitucaoEliminarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void eliminar() {
		
		derex.click();
		sleep(1000);
		instituicaoF.click();
		
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);

		siguiente.click();
		
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		
		sleep(2000);
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		String id = idR.getText();
		System.out.println(id);
		sleep(2000);
		menu.click();
		sleep(2000);
		
		excluir.click();
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		pesquisar.sendKeys(id);
		pesquisar.sendKeys(Keys.ENTER);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		boolean sucesso = nenhumResult.isDisplayed();
		
		System.out.println(sucesso);
		
	}
	
	
	
	
	
}


