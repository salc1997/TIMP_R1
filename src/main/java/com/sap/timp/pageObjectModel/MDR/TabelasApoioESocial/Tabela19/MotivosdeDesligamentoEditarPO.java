package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;



public class MotivosdeDesligamentoEditarPO extends TestBase {
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 19 - Motivos de Desligamento\"]")
	public WebElement tabela19;
	
	//DATOS
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"description_0_1\")]/div/textarea")
	public WebElement campo;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement finalPagina;
	
	
	public MotivosdeDesligamentoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editarMotivoDesligamento() {
		sleep(2000);
		tabelaApoio.click();
		sleep(6000);
		tabela19.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		finalPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("MotivosdeDesligamento");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectedElement(campo);
		sleep(2000);
		//attributoNotToBeEmptyElement(campo, "value");
		
		
		String valor = campo.getAttribute("value");
		System.out.println(valor);
		
		String enviar = "Teste Editar KENSSY 7";

		campo.clear();
		sleep(2000);
		
		campo.sendKeys(enviar);
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		
		waitExpectedElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);

		driver.navigate().refresh();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectedElement(campo);
		sleep(9000);
		
		waitExpectedElement(campo);
		attributoNotToBeEmpty(campo, "value"); // OJO ESTE ES UN TEXTAREA XD CON VALUE
		
		String nuevoTexto = campo.getAttribute("value");
		System.out.println("----------------------------------------");
		System.out.println("Nuevo Valor: "+ nuevoTexto);
		System.out.println("Valor Anterior: " + valor);
		sleep(1000);
		
		
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);

//		if(sucesso) {
//			sleep(1000);
//			campo.clear();
//			sleep(1000);
//			campo.sendKeys(valor);
//			sleep(1000);
//			gravar.click();
//			sleep(2000);
//			sim.click();
//			sleep(1000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(1000);
//		}
		return sucesso;
		
	}

}
