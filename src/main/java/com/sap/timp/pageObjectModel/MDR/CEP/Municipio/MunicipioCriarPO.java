package com.sap.timp.pageObjectModel.MDR.CEP.Municipio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;

public class MunicipioCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"Município\"]")
	public WebElement municipio;
	
	@FindBy(xpath = "//button/span[text()=\"Nova Cidade\"]")
	public WebElement novo;

	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	public MunicipioCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void criar() {
		
		cep.click();
		sleep(1000);
		municipio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		
		
		
		
		
		
		
	}

}
