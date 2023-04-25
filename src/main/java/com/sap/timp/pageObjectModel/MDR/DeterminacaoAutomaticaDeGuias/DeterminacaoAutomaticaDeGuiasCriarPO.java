package com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseKenssy;

public class DeterminacaoAutomaticaDeGuiasCriarPO extends TestBaseKenssy{
	
	
	@FindBy(xpath = "//span[text()=\"Determina��o Autom�tica de Guias\"]")
	public WebElement determincaoautomaticadeguias;
	
	
	@FindBy(xpath = "//span[text()=\"Nova Determina��o Autom�tica de Guias\"]")
	public WebElement novodeterminacaoautomaticadeguias;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"1000\"]//span")
	public WebElement opcaoEmpresa;
	
	@FindBy(xpath = "//button[@id=\"adjustmentCode-btn-open-dialog\"]")
	public WebElement aCodigoAjuste;
	
	@FindBy(xpath = "//div[@data-id=\"2566\"]//span")
	public WebElement item;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@id=\"componentOutput\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcaoComponente;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descri��o\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"componentConfiguration\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement codigoConfigura��o;
	
	@FindBy(xpath = "//div[@id=\"componentConfiguration\"]//child::input")
	public WebElement codigoConfigura��oInput;
	
	@FindBy(xpath = "//div[@id=\"idLayout\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement layoutGuia;
	
	@FindBy(xpath = "//div[@id=\"idLayout\"]//child::input")
	public WebElement layoutGuiaInput;
	
	@FindBy(xpath = "//div[@id=\"outputCodePR\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement codigoOutputPR;
	

	@FindBy(xpath = "//div[@id=\"idLayoutConfiguration\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement configura��odoLayout;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id=\"64\"]")
	public WebElement opcaoli;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcaoOutput;
	
	@FindBy(xpath = "//li[@id=\"61\"]")
	public WebElement opcaoLayout;

	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Agrupador de CFOP\"]")
	public WebElement agrupadorcfop;
	
	@FindBy(xpath = "//div[@id=\"validityFrom\"]/div/div[1]/input")
	public WebElement dataincial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vig�ncia \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Id Associa��o\"]")
	public WebElement pesquisarAsoc;
	
	public DeterminacaoAutomaticaDeGuiasCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		determincaoautomaticadeguias.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//cria�ao
		novodeterminacaoautomaticadeguias.click();
		sleep(20000);

		empresa.click();
		sleep(2000);
		opcaoEmpresa.click();
		sleep(2000);
		closeSelectTypeCheckbox(empresa);
		sleep(3000);
		
		
		aCodigoAjuste.click();
		sleep(6000);
		
		pesquisarAsoc.sendKeys("2566", Keys.ENTER);
		sleep(3000);
		
		item.click();
		sleep(2000);
		
		aceitar.click();
		sleep(10000);
		
		descricao.sendKeys("test Prueba");
		sleep(8000);
		
		componente.click();
		sleep(3000);
		
		opcaoComponente.click();
		sleep(3000);
		
		attributeToBeXpath("//div[@id=\"componentConfiguration\"]/div/div/div/div[1]", "class", "input-wrapper base-input  required");
		
		codigoConfigura��o.click();
		sleep(3000);
		
		codigoConfigura��oInput.sendKeys("1564");
		sleep(3000);
		
		//waitExpectElement(opcao);
		sleep(3000);
		
		opcao.click();
		sleep(3000);
		
		
		codigoOutputPR.click();
		sleep(3000);
		
		opcaoOutput.click();
		sleep(8000);
		
		layoutGuia.click();
		sleep(3000);
		
		layoutGuiaInput.sendKeys("61");
		sleep(3000);
		opcaoLayout.click();
		sleep(3000);
		
		configura��odoLayout.click();
		sleep(1000);
		
		opcaoli.click();
		sleep(1000);
		
		
		String data=fechaActual();
		dataincial.sendKeys(data);
		
		sleep(2000);
		gravar.click();
		sleep(2000);
	
		nao.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
	//	biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("DeterminacaoAutomaticaGuias",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		return sucesso;
		
	}		
	
	
	
	

}
