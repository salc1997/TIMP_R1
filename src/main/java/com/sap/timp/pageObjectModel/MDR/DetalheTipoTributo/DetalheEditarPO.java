package com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DetalheEditarPO extends TestBaseSteven {

	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//span[text()=\"Detalhes Do Tipo De Tributo\"]")
	public WebElement detalhe;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	@FindBy(xpath = "//li/span[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//div[@id=\"descricao\"]/div/textarea")
	public WebElement campo;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	
	public DetalheEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {

		detalhe.click();

		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div/div[1]/div/div[1]/div");

		siguiente.click();

		waitExpectXpath("//*[@id=\"list\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div[2]/div/div/div/img");
		sleep(2000);

		Actions actions = new Actions(driver);
		idC.click();
		sleep(1000);
		actions.doubleClick(idC).perform();
		
		menu.click();
		sleep(1000);
		editar.click();
		
		waitExpectXpath("//*[@id=\"select\"]/div[1]/input");
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"tax\"]/div", "class", "base-select required");
		sleep(1000);
		
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
		
		waitExpectXpath("//*[@id=\"select\"]/div[1]/input");
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"tax\"]/div", "class", "base-select required");
		sleep(1000);
		
		String nuevoTexto = campo.getAttribute("value");

		boolean sucesso = nuevoTexto.equals(enviar);
		
		sleep(1000);
		campo.clear();
		sleep(1000);
		campo.sendKeys(valor);
		
		gravar.click();
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		return sucesso;


	}
}
