package com.sap.timp.pageObjectModel.MDR.CenariosCorrecao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKathy;

public class CenariosCorrecaoVisualizarPO extends TestBaseKathy{
	@FindBy(xpath = "//li/div/span[text()=\"Cenários de Correção\"]")
	public WebElement cenarios;
		
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//*[@id=\"tax\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"correction-object\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement objetoCorrecao;
	
	@FindBy(xpath = "//*[@id=\"web-service\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement servicoWeb;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//*[@id=\"valid-from\"]/div/div[1]/input")
	public WebElement campo;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[9]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[6]")
	public WebElement siguienteTC2;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement opc;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[11]/div[3]/div")	
	public WebElement idC;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[12]/div[1]/div/div[2]/ul/li[4]")
	public WebElement eliminar;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	public CenariosCorrecaoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public String cenariosCorrecaoVisualizar() {
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
		
		cenarios.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);	
			
		if(tc2==true) {
			siguienteTC2.click();
		}else {
			siguiente.click();
		}
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		Integer filas= driver.findElements(By.xpath("//div[contains(@class,\"body\")]/div[@class=\"tr\"]")).size();
		//*[@id="list"]/div/div[1]/div/div[3]/div[12]/div[1]/div/div[1]
		String fi1 = String.valueOf(filas);
		System.out.println(fi1);
		String idTexto= driver.findElement(By.xpath("//div[contains(@class,\"body\")]/div[@class=\"tr\"]["+fi1+"]/div[3]/div")).getText();
		/*
		String id = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+fi1+"]/div[3]/div")).getText();
		
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(3000);
		*/
		WebElement idC= driver.findElement(By.xpath("//div[contains(@class,\"body\")]/div[@class=\"tr\"]["+fi1+"]/div/div"));
		
		WebElement visualizar= driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+fi1+"]/div[1]/div/div[2]/ul/li[2]"));
		//*[@id="list"]/div/div[1]/div/div[3]/div["+fi1+"]/div[1]/div
	
		//pesquisar.sendKeys(idTexto);
		//pesquisar.sendKeys(Keys.ENTER);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);
		idC.click();
		sleep(1000);
		visualizar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		
		return sucesso;	
	}
}
