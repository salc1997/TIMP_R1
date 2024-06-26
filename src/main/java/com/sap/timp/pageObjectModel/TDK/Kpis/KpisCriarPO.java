package com.sap.timp.pageObjectModel.TDK.Kpis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.sap.timp.base.TestBase;

public class KpisCriarPO extends TestBase {
	
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's P�blicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Kpi\"]")
	public WebElement novoKip;
	
	@FindBy(xpath = "//div[@id=\"name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"classification\"]/div/div/div[2]")
	public WebElement clasificacion;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement clasificacionOPC;
	
	@FindBy(xpath = "//li[@id=\"1\"]")
	public WebElement clasificacionOPC2;
	
	@FindBy(xpath = "//li[@id=\"1\"]")
	public WebElement clasificacionOPCTQ2;
	
	
	@FindBy(xpath = "//div[@id=\"accessClassification\"]/div/div[2]")
	public WebElement clasificacionAcceso;
	
	@FindBy(xpath = "//li[@id=\"1\"]")
	public WebElement clasificacionAccesoOPC;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public KpisCriarPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean Criar() {
		
		System.out.println("---------- Criar --------- " );
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;
		boolean tq2  = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}else if(url.contains("tq2")){
			tq2 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		kpis.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		
		String id ="0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		}
		
		
		System.out.println("Ultimo registro: " + id);
		
		novoKip.click();
		sleep(4000);

		
		nome.click();
		sleep(3000);
		
		nome.sendKeys("TESTEAUTOMATIZADO");
		sleep(4000);
		
		clasificacion.click();
		sleep(2000);
		
		
		
		clasificacionOPC.click();
		sleep(2000);
		
		clasificacionAcceso.click();
		sleep(2000);
		
		
		
		if (tq1 == true) {

			clasificacionAccesoOPC.click();
			sleep(2000);
			
		}else if (tp1==true ) {
			clasificacionOPC.click();
			sleep(2000);
			
		}else if (tq2==true ) {
			clasificacionOPCTQ2.click();
			sleep(2000);
			
		}else {
			clasificacionOPC2.click();
			sleep(2000);
		}
		
		Gravar.click();
		sleep(2000);
		
		waitExpectedElement(biblioteca);
		sleep(4000);
		
		biblioteca.click();
		sleep(2000);
		
		sim.click();
		sleep(2000);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		idInserir("KpisCriar", idB);

		System.out.println(id);
		System.out.println(idB);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		
		boolean sucesso = false;
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
		
	}
}
