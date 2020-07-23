package com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class InstitucaoEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
	public WebElement derex;
	@FindBy(xpath = "//li/div/span[text()=\"Instituição Financeira\"]")
	public WebElement instituicaoF;
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	@FindBy(xpath = "//li/span[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//div[@id=\"financialInstitution\"]/div/div/input")
	public WebElement campo;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	

	

	public InstitucaoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {
		
		derex.click();
		sleep(1000);
		instituicaoF.click();
		
		waitExpectXpath("//*[@id=\"table\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"table\"]/div[2]/div/div/div/img");
		sleep(2000);

		siguiente.click();
		
		waitExpectXpath("//*[@id=\"table\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"table\"]/div[2]/div/div/div/img");
		sleep(2000);
		
		idC.click();
		sleep(1000);
		
		dobleClickElement(idC);
			
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		System.out.println(id);
		
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
		

		String valor = campo.getAttribute("value");

		
		String enviar = "Prueba";
		
		campo.clear();
		campo.sendKeys(enviar);
		sleep(1000);
		gravar.click();
		sleep(2000);
		sim.click();
		sleep(3000);		 
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");

		
		driver.navigate().refresh();
		
		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
		sleep(1000);
		
		String nuevoTexto = campo.getAttribute("value");

		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		sleep(1000);
		campo.clear();
		sleep(1000);
		campo.sendKeys(valor);
		
		gravar.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		return sucesso;
		
	}

}
