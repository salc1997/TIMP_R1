package com.sap.timp.pageObjectModel.MDR.Centralizacao.Saldos;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SaldosCriarPO extends TestBaseKenssy{
	
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Saldos\"]")
	public WebElement saldos;
	
	@FindBy(xpath = "//span[text()=\"Nova Centralização de Saldos\"]")
	public WebElement novoSaldo;
	
	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[1]")
	public WebElement empresa;
	
		@FindBy(xpath = "//li[@id][1]")
		public WebElement opcempresa;
	
	@FindBy(xpath ="//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement selecionarUmaUfFilial; 
	
		@FindBy(xpath ="//li[@id][1]")
		public WebElement opcselecionarUmaUfFilial; 
	
	@FindBy(xpath = "//div[@id=\"filials\"]/div/div/div[2]")
	public WebElement filial;
	
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcfilial;
		
	@FindBy(xpath="//div[@id=\"centralizadora\"]/div/div[2]")
	public WebElement filialcentralizadora;
		
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcfilialCentralizadora;
		
		
	@FindBy(xpath="//div[@id=\"tribute\"]/div/div/div[2]")
	public WebElement tributo;
			
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcTributo;
		
	
	@FindBy(xpath="//div[@id=\"webServiceId\"]/div/div/div[2]")
	public WebElement servicioWeb;
			
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcServicioWeb;

	@FindBy(xpath="//div[@id=\"nfCreationParameterId\"]/div/div/div[2]")
	public WebElement nf;
			
		@FindBy(xpath="//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcNf;
		
	@FindBy(xpath="//div[@id=\"ufOrigem\"]/div/div/div[2]")
	public WebElement ufOrigen;
			
		@FindBy(xpath="//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcUfOrigen;
	
	@FindBy(xpath="//div[@id=\"iniVigencia\"]/div/div/input")
	public WebElement fechaIniVigencia;
	
		
		
	@FindBy(xpath="//body")
	public WebElement clickFuera;
	
	
	//PARTE DE AJUSTE
	@FindBy(xpath="//span[text()=\"Ajuste\"]")
	public WebElement botonAjuste;
	
	
	@FindBy(xpath="//span[text()=\"Novo Ajuste\"]")
	public WebElement novoAjuste;
	
	
	
	
	public SaldosCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void CriarSaldo() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		saldos.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novoSaldo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//PROCEDIMIENTO DE LLENAR LOS DATOS
		empresa.click();
		opcempresa.click();
		
		opcempresa.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
//		selecionarUmaUfFilial.click();
//		sleep(2000);
//		opcselecionarUmaUfFilial.click();
//		
//		opcselecionarUmaUfFilial.sendKeys(Keys.ESCAPE);
		attributeToBeXpath("//div[@id=\"uf\"]/div","class", "base-autocomplete required");
		sleep(2000);
		
		filial.click();
		sleep(2000);
		opcfilial.click();
		sleep(2000);
		clickFuera.click();
		
		
		attributeToBeXpath("//div[@id=\"centralizadora\"]/div", "class", "base-autocomplete required");
		sleep(2000);
		
		filialcentralizadora.click();
		sleep(2000);
		opcfilialCentralizadora.click();
		//opcfilialCentralizadora.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		
		
		tributo.click();
		opcTributo.click();
		opcTributo.sendKeys(Keys.ESCAPE);
		
		servicioWeb.click();
		opcServicioWeb.click();
		sleep(2000);
		clickFuera.click();
		//sleep(2000);
		
		nf.click();
		opcNf.click();
		clickFuera.click();
//		
		ufOrigen.click();
		opcUfOrigen.click();
		clickFuera.click();
		

		fechaIniVigencia.sendKeys(fechaActual());
		clickFuera.click();
		sleep(2000);
		
		
		//PROCEDIMIENTO PARA NUEVO AJUSTE
		
		botonAjuste.click();
		waitExpectElement(novoAjuste);
		sleep(2000);
		novoAjuste.click();
		
		
		
		
		
		
		
	}

}

