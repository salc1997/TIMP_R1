package com.sap.timp.pageObjectModel.TFP.Configurações;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguraçõesPeríodoCriarPO extends TestBaseMassiel{


	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//span[text()=\"Período\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração de Período\"]")
	public WebElement nota;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"3000\"]")
	public WebElement empresaOpc;
	
	@FindBy(xpath = "//div[@id=\"dialogContentWraper\"]")
	public WebElement empresaFlecha;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Estado\"]")
	public WebElement Estado;
	
	@FindBy(xpath = "//div[@id=\"BA\"]")
	public WebElement EstadoOPC;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Filial\"]")
	public WebElement Filial;
	
	@FindBy(xpath = "//div[@id=\"3000-0031-BA\"]")
	public WebElement FilialOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Abertura de período\"]")
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
	
	public ConfiguraçõesPeríodoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
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
		
		empresaOpc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		dobleClickElement(empresaFlecha);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Estado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		EstadoOPC.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		dobleClickElement(empresaFlecha);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//Filial.click();
		//sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);
		
		//FilialOpc.click();
		//sleep(2000);
		////invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);
		
		//dobleClickElement(empresaFlecha);
		//sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);
		
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
