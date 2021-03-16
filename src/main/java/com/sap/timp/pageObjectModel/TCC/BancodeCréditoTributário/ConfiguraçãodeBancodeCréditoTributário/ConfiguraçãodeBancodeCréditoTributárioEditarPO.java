package com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguraçãodeBancodeCréditoTributárioEditarPO extends TestBaseMassiel {

	@FindBy(xpath = "//span[text()=\"Banco de Crédito Tributário\"]")
	public WebElement BancoCréditoTributário;

	
	@FindBy(xpath = "//span[text()=\"Configuração de Banco de Crédito Tributário\"]")
	public WebElement configuracion;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	
	public ConfiguraçãodeBancodeCréditoTributárioEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		BancoCréditoTributário.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracion.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("idBCT-ConfiguracaoDeBancoDeCreditoTributario");
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		attributoNotToBeEmptyElement(validaDe, "value");
	  	sleep(8000);
		
	
		String valor = validaDe.getAttribute("value");
		System.out.println(valor);
		String enviar = fechaActual();
		
		sleep(1000);
		validaDe.clear();

		sleep(1000);
		validaDe.sendKeys(enviar);
		sleep(6000);
		
		btnGravar.click();
		sleep(6000);
		
		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar1.click();
		sleep(2000);
		attributoNotToBeEmptyElement(validaDe, "value");
	  	sleep(8000);
	  	
	  	String nuevoTexto = validaDe.getAttribute("value");
	  	System.out.println(enviar);
		System.out.println(nuevoTexto);
		
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
	  	
		return sucesso;
	}
}
