package com.sap.timp.pageObjectModel.MDR.CEP.Logradouro;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKathy;

public class LogradouroEditarPO extends TestBaseKathy{
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"Logradouro\"]")
	public WebElement logradouro;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;
	
	@FindBy(xpath = "//li/span[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[5]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement campo;
	
	public LogradouroEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean logradouroEditar() {
		cep.click();
		sleep(1000);
		logradouro.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
		
		String numEnviar = "11112222";
		
		pesquisar.sendKeys(numEnviar);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		waitExpectElement(campo);
		//invisibilityOfElement("//*[@id=\"form-container\"]/div/div/div/div/img");
		sleep(1000);
		
		String valor = campo.getAttribute("value");

		String enviar = "PruebaAutomatizada";

		campo.clear();
		sleep(1000);
		campo.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		driver.navigate().refresh(); 
		
		waitExpectElement(campo);
		
		String nuevoTexto = campo.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);

		sleep(1000);
		campo.clear();

		sleep(1000);
		campo.sendKeys(valor);

		gravar.click();

		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			
		return sucesso;
	}
}
