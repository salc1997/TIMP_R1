package com.sap.timp.pageObjectModel.MDR.RepresentantesLegais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class RepresentantesLegaisCriarPO extends TestBaseEliel{
	
	
	@FindBy(xpath = "//span[text()=\"Representantes Legais\"]")
	public WebElement representanteslegais;
	

	
	@FindBy(xpath = "//span[text()=\"Novo Representante Legal\"]")
	public WebElement novorepresentantelegal;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o nome de Representante Legal\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o CEP\"]")
	public WebElement cep;
	
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaotributo;
	

	@FindBy(xpath = "//div[@class=\"field\" and @id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"creditCode\"]/div/div/div[2]")
	public WebElement codigodecredito;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaocodigodecredito;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Utilização\"]")
	public WebElement utilizacao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement dataincial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public RepresentantesLegaisCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		representanteslegais.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novorepresentantelegal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nome.sendKeys("Teste Automatizado");
		sleep(2000);
		cep.sendKeys("26385030");
		
		String data=fechaActual();
		dataincial.sendKeys(data);
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir1(id2);
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
