package com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class StatusOcorrenciaFiscalEditarPO extends TestBaseSteven {



	@FindBy(xpath = "//span[text()=\"Ocorr�ncia Fiscal\"]")
	public WebElement ocorrenciaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Status de Ocorr�ncia Fiscal\"]")
	public WebElement statusOcorrencia;


	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//textarea")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	public StatusOcorrenciaFiscalEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {

		sleep(2000);
		ocorrenciaFiscal.click();
		sleep(2000);
		statusOcorrencia.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributoNotToBeEmptyElement(campo, "value");
		
		
		sleep(2000);

		String valor = campo.getAttribute("value");

		String enviar = "Teste Editar";

		campo.clear();
		sleep(1000);
		campo.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributoNotToBeEmptyElement(campo, "value");

		

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
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		return sucesso;

	}

}