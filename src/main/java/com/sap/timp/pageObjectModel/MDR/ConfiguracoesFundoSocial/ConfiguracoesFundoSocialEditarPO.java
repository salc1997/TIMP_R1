package com.sap.timp.pageObjectModel.MDR.ConfiguracoesFundoSocial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ConfiguracoesFundoSocialEditarPO extends TestBase{
	@FindBy(xpath = "//span[text()=\"Configurações de Fundo Social\"]")
	public WebElement confiFundo;
	

	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	
	@FindBy(xpath = "//div[@class=\"action-button\"]")
	public WebElement botonMenu;
	
	@FindBy(xpath = "//input[@placeholder=\"Vigência de\"]")
	public WebElement fecha;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement Sim;
	


	public ConfiguracoesFundoSocialEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean Editar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		confiFundo.click();
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro =idObter("ConfiguracaoFundoSocial");
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		attributoNotToBeEmpty(fecha, "value");
	  	sleep(2000);
	  	
	  	String valor = fecha.getAttribute("value");
		System.out.println(valor);
		String enviar = (fechaActual());
		
		sleep(1000);
		fecha.clear();

		sleep(1000);
		fecha.sendKeys(enviar);

		Gravar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		Sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		attributoNotToBeEmpty(fecha, "value");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nuevoTexto = fecha.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		fecha.clear();
		sleep(2000);
		
		sleep(1000);
		fecha.sendKeys(valor);

		Gravar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			 
		Sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
		
	
	}
}
