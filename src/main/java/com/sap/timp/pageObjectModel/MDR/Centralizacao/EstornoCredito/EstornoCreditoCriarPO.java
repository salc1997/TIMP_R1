package com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;

public class EstornoCreditoCriarPO extends TestBaseMassiel{
	
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
	

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")

	public WebElement empresa;
	
	//@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	@FindBy(xpath = "//li[text()=\"3000\"]")
	public WebElement opcaoempresa;
	

	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement opcaoempresaTC2;

	@FindBy(xpath ="//div[@id=\"UF\"]/div/div/div[2]")
	public WebElement selecionaruffilial; 

	
	@FindBy(xpath ="//*[@id=\"UF\"]/div/div[1]/div[2]")
	public WebElement ufFilial; 
	
	@FindBy(xpath = "//li[text()=\"BA\"]")
	public WebElement opcaouffilial;
	

	@FindBy(xpath = "//li[text()=\"AL\"]")
	public WebElement opcaouffilialTC2;
	

	@FindBy(xpath = "//div[@id=\"branches\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//*[@id=\"0031\"]/div[1]/label/span")
	public WebElement opcao1filial;
	


	//@FindBy(xpath = "//*[@id=\"0032\"]/div[1]/label/span")

	@FindBy(xpath = " //div[@class=\"list-option\"][2]/div/div[2]")
	public WebElement opcao2filial;
	

	
	@FindBy(xpath = "//*[@id=\"0008\"]/div[1]/label/span")
	public WebElement opcao1filialTC2;
	

	@FindBy(xpath = "//*[@id=\"0805\"]/div[1]/label/span")
	public WebElement opcao2filialTC2;
	
	
	@FindBy(xpath="//div[@id=\"centralizedBranch\"]/div/div/div[2]")

	public WebElement filialcentralizadora;
	
	@FindBy(xpath="//li[text()=\"0031\"]")
	public WebElement opcaofialcentralizadora;
	
	@FindBy(xpath="//li[text()=\"0008\"]")
	public WebElement opcaofialcentralizadoraTC2;
	
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
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	public EstornoCreditoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	

	public boolean CriarEstornoCredito() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if(url.contains("tc2")) {
			tc2 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		estornocredito.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		//gera um novo arquivo
		novoestorno.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Preenchimento 
		empresa.click();

		if (tc2 == true) {
			opcaoempresaTC2.click();
		}else {
			opcaoempresa.click();
		}
		sleep(1000);
		
		
		ufFilial.click();
		
		if (tc2 == true) {
			opcaouffilialTC2.click();
		}else {
			opcaouffilial.click();
		}
		
	 
		sleep(2000);
		filial.click();

		if (tc2 == true) {
			opcao1filialTC2.click();
			sleep(1000);
			opcao2filialTC2.click();
			sleep(1000);
			opcao2filialTC2.sendKeys(Keys.ESCAPE);
		}else {
			opcao1filial.click();
			sleep(1000);
			opcao2filial.click();
			sleep(1000);
			opcao2filial.sendKeys(Keys.ESCAPE);
		}


		filialcentralizadora.click();

		
		if (tc2 == true) {
			opcaofialcentralizadoraTC2.click();
		}else {
			opcaofialcentralizadora.click();
		}
		sleep(1000);

		//pega a data atual
		String dataatual = fechaActual();
		datainicio.sendKeys(dataatual);
		
		//fim do preenchiminto
		gravar.click();
		
		butaosim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//Pega o ultimo id depois do preenchimento
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("EstornoCredito",idB);
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
