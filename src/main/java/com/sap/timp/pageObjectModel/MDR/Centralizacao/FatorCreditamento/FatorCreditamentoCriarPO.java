package com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sap.timp.base.TestBase;

public class FatorCreditamentoCriarPO extends TestBase{
	@FindBy(xpath = "//li/div/span[text()=\"Centralização\"]")
	public WebElement centralização;
	
	@FindBy(xpath = "//li/div/span[text()=\"Fator de Creditamento do CIAP\"]")
	public WebElement fatorCrecimento;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Fator de Creditamento do CIAP\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[text()=\"3000\"]")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement opcaoEmpresaTC2;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;
		
	@FindBy(xpath = "//div[@id=\"UF\"]/div/div/div[2]")
	public WebElement ufFilial;


	@FindBy(xpath = "//li[text()=\"BA\"]")
	public WebElement opcUfFilial;
	
	@FindBy(xpath = "//li[text()=\"CE\"]")
	public WebElement opcUfFilialTC2;
	
	//@FindBy(xpath = "//div/div[@id=\"branches\"]/div/div/div/input")
	@FindBy(xpath = "//div[@id=\"branches\"]/div/div/div[2]")
	public WebElement filiais;
	
	@FindBy(xpath = "//div[@id=\"0031\"]/div/label/span")
	public WebElement opcFiliais;
	
	@FindBy(xpath = "//div[@id=\"0032\"]/div/label/span")
	public WebElement opcFiliais2;
	
	@FindBy(xpath = "//div[@id=\"0215\"]/div/label/span")
	public WebElement opcFiliaisTC2;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement opcFiliaisTC22;
	
	//@FindBy(xpath = "//div/div[@id=\"centralizedBranch\"]/div/div/div/input")
	@FindBy(xpath = "//div[@id=\"centralizedBranch\"]/div/div/div[2]")
	public WebElement filialCentralizadora;
	
	@FindBy(xpath = "//li[text()=\"0031\"]")
	public WebElement opcFilialCentralizadora;
	
	@FindBy(xpath = "//li[text()=\"0215\"]")
	public WebElement opcFilialCentralizadoraTC2;
	
	@FindBy(xpath = "//*[@id=\"validity\"]/div/div[1]/input")
	public WebElement dataVigenciaInicio;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
		
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	public FatorCreditamentoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean fatorCreditamentoCriar() {
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		centralização.click();
		sleep(1000);
		fatorCrecimento.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		novo.click();
		sleep(6000);
	//	waitExpectElement(empresa);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		if (tc2 == true) {
			opcaoEmpresaTC2.click();
		}else {
			opcEmpresa.click();
		}
		
		sleep(2000);
		
		ufFilial.click();
		if (tc2 == true) {
			opcUfFilialTC2.click();
		}else {
			opcUfFilial.click();
		}
		
		sleep(2000);
		
		filiais.click();
		if(tc2==true) {
			opcFiliaisTC2.click();
			opcFiliaisTC22.click();
			sleep(1000);
			opcFiliaisTC22.sendKeys(Keys.ESCAPE);
		}else {
			opcFiliais.click();
			opcFiliais2.click();
			opcFiliais2.sendKeys(Keys.ESCAPE);
		}
		sleep(2000);
		filialCentralizadora.click();
		if (tc2 == true) {
			opcFilialCentralizadoraTC2.click();
		}else {
			opcFilialCentralizadora.click();
		}
		sleep(1000);
		dataVigenciaInicio.sendKeys(fechaActual());
		sleep(2000);

		
		btnGravar.click();
		waitExpectedElement(confirmacionGravar);
		confirmacionGravar.click();
		
		sleep(3000);
		
		waitExpectedElement("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(btnRegresar);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		
			
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("FatorCreditamentoCIAP",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println("Antes da criação: " +idD);
		System.out.println("Apos da criação: " +id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
	
		return sucesso;
	}
}
