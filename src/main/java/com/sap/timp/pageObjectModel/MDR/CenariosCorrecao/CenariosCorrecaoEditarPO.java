package com.sap.timp.pageObjectModel.MDR.CenariosCorrecao;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKathy;

public class CenariosCorrecaoEditarPO extends TestBaseKathy{
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

	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[12]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;
		
	public CenariosCorrecaoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean cenariosCorrecaoEditar() {
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
		/*
		String id = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+fi1+"]/div[3]/div")).getText();
		
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(3000);
		*/
		WebElement idC= driver.findElement(By.xpath("//div[contains(@class,\"body\")]/div[@class=\"tr\"]["+fi1+"]/div/div"));
		
		WebElement edit= driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+fi1+"]/div[1]/div/div[2]/ul/li[3]"));
		//*[@id="list"]/div/div[1]/div/div[3]/div["+fi1+"]/div[1]/div
		idC.click();
		//menu.click();
		sleep(2000);
		edit.click();
		
		//attributeToBeXpath("//div[@id=\"UF\"]/div", "class", "base-select required");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		waitExpectElement(campo);
		campo.sendKeys(Keys.ENTER);
		String valor = campo.getAttribute("value");

		String enviar = "27/07/2020";
		
		campo.clear();
		sleep(1000);
		campo.sendKeys(enviar);
		campo.sendKeys(Keys.ENTER);
		//campo.sendKeys(Keys.ENTER);
		cuerpo.click();
		sleep(2000);
		btnGravar.click();
		sleep(3000);
		confirmacionGravar.click();
		sleep(2000);

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");

		driver.navigate().refresh();

		attributeToBeXpath("//*[@id=\"description\"]/div/div[2]/div/div[1]", "class", "input-wrapper base-input ");
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(20000);
		sleep(2000);
		
		String nuevoTexto = campo.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);

		sleep(3000);
		waitExpectElement(campo);
		campo.sendKeys(Keys.ENTER);
		campo.clear();

		sleep(1000);
		campo.sendKeys(valor);
		campo.sendKeys(Keys.ENTER);
		cuerpo.click();
		
		btnGravar.click();

		sleep(3000);
		confirmacionGravar.click();
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		return sucesso;
	}
}
