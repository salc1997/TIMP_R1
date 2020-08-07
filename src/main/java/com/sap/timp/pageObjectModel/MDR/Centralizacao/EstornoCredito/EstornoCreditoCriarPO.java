package com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.base.TestBaseSteven;

public class EstornoCreditoCriarPO extends TestBaseEliel{
	
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Estorno de Crédito de Insumos\"]")
	public WebElement estornocredito;
	
	@FindBy (xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisa;

	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//span[text()=\"Novo Estorno de Crédito de Insumos\"]")
	public WebElement novoestorno;
	
	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[1]")
	public WebElement empresa;
	
	//@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath ="//input[@placeholder=\"Selecionar UF Filial\"]")
	public WebElement selecionaruffilial; 
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcaouffilial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Filiais\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//*[@id=\"0001\"]/div[1]/label/span")
	public WebElement opcao1filial;
	

	@FindBy(xpath = "//*[@id=\"0002\"]/div[1]/label/span")
	public WebElement opcao2filial;
	
	@FindBy(xpath="//input[ @placeholder=\"Selecionar Filial Centralizadora\"]")
	public WebElement filialcentralizadora;
	
	@FindBy(xpath="//*[@id=\"option-1\"]")
	public WebElement opcaofialcentralizadora;
	
	@FindBy(xpath = "//*[@id=\"tabs\"]/div/div/div[3]/div[5]/div/div/div[1]/div/div/label/span")
	public WebElement simregimeespecial;
	

	@FindBy(xpath = "//input[@placeholder=\"Preencher Numérico\"]")
	public WebElement preechernumerico;
	
	@FindBy(xpath = "//*[@id=\"validity\"]/div/div[1]/input")
	public WebElement datainicio;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	@FindBy (xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[5]")
	public WebElement seguinte;
	
	
	public EstornoCreditoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean CriarEstornoCredito() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		estornocredito.click();
		
		waitExpectElement(pesquisa);
		//Pega o ultimo id
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		
		String id = idR.getText();
		sleep(2000);
	
		//gera um novo arquivo
		novoestorno.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Preenchimento 
		empresa.click();
		
		opcaoempresa.click();
		
		opcaoempresa.sendKeys(Keys.ESCAPE);
		
		selecionaruffilial.click();
		
		opcaouffilial.click();
		
	    opcaouffilial.sendKeys(Keys.ESCAPE);
		filial.click();
		
		opcao1filial.click();
		
		opcao2filial.click();
		
		opcao2filial.sendKeys(Keys.ESCAPE);
		
		filialcentralizadora.click();
		
		opcaofialcentralizadora.click();
		
		simregimeespecial.click();
		
		preechernumerico.sendKeys("7");
		//pega a data atual
		String dataatual = fechaActual();
		datainicio.sendKeys(dataatual);
		
		//fim do preenchiminto
		gravar.click();
		
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//Pega o ultimo id depois do preenchimento
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		
		String idB = idR.getText();
		sleep(2000);
		System.out.println(id);
		System.out.println(idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		System.out.println( sucesso);
		return sucesso;
		
		
		
	}
}
