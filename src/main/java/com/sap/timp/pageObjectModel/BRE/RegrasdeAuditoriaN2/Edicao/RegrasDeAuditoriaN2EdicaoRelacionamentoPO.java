package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;



public class RegrasDeAuditoriaN2EdicaoRelacionamentoPO extends TestBase{
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement regrasDeAuditoriaN2;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Selecionar Relacionamento\"]")
	public WebElement btnSeleccionarRelacionamento;
	
	@FindBy(xpath = "//div[@class=\"structure-relation-select\"]/div/div/div[2]")
	public WebElement cboRelacionamentoElementoDeEstrutura;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement btnNao;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	

	@FindBy(xpath = "//div[contains(text(),\"Ajustes Fiscais\")]")
	public WebElement opcion;
	
	public RegrasDeAuditoriaN2EdicaoRelacionamentoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		regrasDeAuditoriaN2.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		//String idRegistro = idObter3();
		String idRegistro = idObter("An2");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(18000);
		
		btnSeleccionarRelacionamento.click();
		sleep(8000);
		
	//	waitExpectElement(cboRelacionamentoElementoDeEstrutura);
		cboRelacionamentoElementoDeEstrutura.click();
		sleep(1000);
		
		String URL = driver.getCurrentUrl();
		
		if(URL.contains("tc2")) {
			opcion = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and contains(text(), \"Empresa / Filial\")]"));
		}
		
		if(URL.contains("tp1")) {
			opcion = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and contains(text(), \"Ajustes Fiscais\")]"));
		}
		
		sleep(2000);
		opcion.click();
		closeSelectTypeCheckbox(cboRelacionamentoElementoDeEstrutura);
		sleep(2000);
		
		String opcionSeleccionada = driver.findElement(By.xpath("//div[@class=\"structure-relation-select\"]/div/div/div/div/div/div[1]")).getText();
		System.out.println("");
		System.out.println("Opcion seleccionada de relacionamento: " + opcionSeleccionada);
		
		sleep(2000);
		btnAplicar.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		waitExpectedElement(btnNao);
		btnNao.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		regrasDeAuditoriaN2.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		btnSeleccionarRelacionamento.click();
		sleep(8000);
		
		waitExpectedElement(cboRelacionamentoElementoDeEstrutura);
		
		String opcionSeleccionadaEditada = driver.findElement(By.xpath("//div[@class=\"structure-relation-select\"]/div/div/div/div/div/div[1]")).getText();
		System.out.println("");
		System.out.println("Opcion Editada de relacionamento: " + opcionSeleccionadaEditada);
		
		boolean sucesso = false;
		
		if(opcionSeleccionadaEditada.equals(opcionSeleccionada)) {
			System.out.println("Relacionamento de estrutura editado satisfactoriamente...");
			sucesso = true;
		}else {
			System.out.println("No se puedo editar el Relacionamento de estrutura...");
		}
		
		return sucesso;
	}
}
