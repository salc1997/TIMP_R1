package com.sap.timp.pageObjectModel.MDR.GrupoAtividadeFiscal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class GrupoAtividadeEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]")
	public WebElement atividades1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]/ul/li[3]")
	public WebElement atividadesO1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]")
	public WebElement atividades2;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]/ul/li[3]")
	public WebElement atividadesO2;
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição\")]")
	public WebElement campo;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	@FindBy(xpath = "//li/span[text()=\"Editar\"]")
	public WebElement editar;
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public GrupoAtividadeEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void editar() {
		
		String url = driver.getCurrentUrl();

		if (url.contains("tc2") || url.contains("tp1")) {
			atividades2.click();
			sleep(2000);
			atividadesO2.click();
			sleep(2000);
		} else {

			atividades1.click();
			sleep(2000);
			atividadesO1.click();
			sleep(2000);
		}
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div/div/div/div/img");

		sleep(2000);

		siguiente.click();

		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div/div/div/div/img");
		sleep(2000);

		Actions actions = new Actions(driver);
		idC.click();
		sleep(1000);
		actions.doubleClick(idC).perform();
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);

		waitExpectElement(campo);
		
		
		String valor = campo.getAttribute("value");

		
		String enviar = "Prueba editar";
		
		campo.clear();
		campo.sendKeys(enviar);
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		sleep(3000);		 
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");

		
		driver.navigate().refresh();
		
		
		waitExpectElement(campo);
		sleep(1000);
		
		String nuevoTexto = campo.getAttribute("value");
		

		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(nuevoTexto);
		System.out.println(valor);
		
		sleep(1000);
		campo.clear();
		sleep(1000);
		campo.sendKeys(valor);
		
		gravar.click();
		
		sleep(2000);
		sim.click();
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		System.out.println(sucesso);
		
		
		
	}

}
