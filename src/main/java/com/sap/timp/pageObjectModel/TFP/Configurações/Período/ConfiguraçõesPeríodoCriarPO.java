package com.sap.timp.pageObjectModel.TFP.Configura��es.Per�odo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class Configura��esPer�odoCriarPO extends TestBaseMassiel{


	@FindBy(xpath = "//span[text()=\"Configura��es\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//span[text()=\"Per�odo\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[text()=\"Nova Configura��o de Per�odo\"]")
	public WebElement nota;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	//@FindBy(xpath = "//div[@id=\"3000\"]")
	//public WebElement empresaOpc;
	
	@FindBy(xpath = "//div[@id=\"dialogContentWraper\"]")
	public WebElement empresaFlecha;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div[2]")
	public WebElement Estado;
	
	//@FindBy(xpath = "//div[@id=\"BA\"]")
	//public WebElement EstadoOPC;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement Filial;
	
	//@FindBy(xpath = "//div[@id=\"3000-0031-BA\"]")
	//public WebElement FilialOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Abertura de per�odo\"]")
	public WebElement Abertura;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement AberturaOpc;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de dia\"]")
	public WebElement tipoDia;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement tipoDiaOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Dia\"]")
	public WebElement Dia;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement DiaOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data inicial\"]")
	public WebElement validadeDE;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data final\"]")
	public WebElement validadeAte;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	public Configura��esPer�odoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tc2 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tc2")) {
			tc2 = true;
		}else {
			tp1 = true;
		}
		configuracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		System.out.println(id);
		
		nota.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {
			WebElement empresaOpc = driver.findElement(By.xpath( "//div[@id=\"3000\"]"));
			
			empresaOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(empresa);
			
			
		}else if (tc2 == true) {
			
			WebElement empresaOpc = driver.findElement(By.xpath( "//div[@id=\"6000\"]"));
			
			empresaOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(empresa);
			
		
		}else {
			
			WebElement empresaOpc = driver.findElement(By.xpath( "//div[@id=\"3000\"]"));
			
			empresaOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(empresa);
			
		}
		
		
	
		
		Estado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {
			WebElement EstadoOPC = driver.findElement(By.xpath( "//div[@id=\"BA\"]"));
			
			EstadoOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(Estado);
			
			
		}else if (tc2 == true) {
			
			WebElement EstadoOPC = driver.findElement(By.xpath( "//div[@id=\"RJ\"]"));
			
			EstadoOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(Estado);
			
			
		
		}else {
			
			WebElement EstadoOPC = driver.findElement(By.xpath( "//div[@id=\"BA\"]"));
			
			EstadoOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(Estado);
			
			
		}
		
		
		Filial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {
			WebElement FilialOpc = driver.findElement(By.xpath( "//div[@id=\"3000-0031-BA\"]"));
			
			FilialOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(Filial);
			
			
		}else if (tc2 == true) {
			
			WebElement FilialOpc = driver.findElement(By.xpath( "//div[@id=\"6000-0001-RJ\"]"));
			
			FilialOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(Filial);
			
			
		
		}else {
			
			WebElement FilialOpc = driver.findElement(By.xpath( "//div[@id=\"3000-0031-BA\"]"));;
			
			FilialOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(Filial);
			
			
		}
		
		
		Abertura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AberturaOpc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		tipoDia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoDiaOpc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Dia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		DiaOpc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		validadeDE.sendKeys("01/01/2014");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		validadeAte.sendKeys("31/12/2014");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		criar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		System.out.println(id);
		sleep(2000);
		idInserir4(id2);
		System.out.println(id2);
		
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(id2);
		
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
