package com.sap.timp.pageObjectModel.MDR.DeterminacaoAutomaticaDeGuias;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;


public class DeterminacaoAutomaticaDeGuiasExcluirPO extends TestBase{
	
	
	@FindBy(xpath = "//span[text()=\"Determinação Automática de Guias\"]")
	public WebElement determincaoautomaticadeguias;
	
	
	@FindBy(xpath = "//span[text()=\"Nova Determinação Automática de Guias\"]")
	public WebElement novodeterminacaoautomaticadeguias;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoEmpresa;
	
	@FindBy(xpath = "//button[@id=\"adjustmentCode-btn-open-dialog\"]")
	public WebElement aCodigoAjuste;
	
	@FindBy(xpath = "//div[@id=\"content-list\"]//child::div[contains(@class,\"tbody\")]/div[@class=\"tr\" and @data-id=\"824\"]//span")
	public WebElement item;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@id=\"componentOutput\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcaoComponente;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"componentConfiguration\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement codigoConfiguração;
	
	@FindBy(xpath = "//div[@id=\"componentConfiguration\"]//child::input")
	public WebElement codigoConfiguraçãoInput;
	
	@FindBy(xpath = "//div[@id=\"idLayout\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement layoutGuia;
	
	@FindBy(xpath = "//div[@id=\"idLayout\"]//child::input")
	public WebElement layoutGuiaInput;
	
	@FindBy(xpath = "//div[@id=\"outputCodePR\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement codigoOutputPR;
	

	@FindBy(xpath = "//div[@id=\"idLayoutConfiguration\"]//child::div[contains(@class,\"icon-downmenu\")]")
	public WebElement configuraçãodoLayout;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcaoli;
	
	@FindBy(xpath = "//li[@id=\"option-30\"]")
	public WebElement opcaoLayout;

	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Agrupador de CFOP\"]")
	public WebElement agrupadorcfop;
	
	@FindBy(xpath = "//div[@id=\"validityFrom\"]/div/div[1]/input")
	public WebElement dataincial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//div[@id=\"validityFrom\"]//input")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	
	
	public DeterminacaoAutomaticaDeGuiasExcluirPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean Excluir() {
		sleep(2000);
		determincaoautomaticadeguias.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		String idRegistro = idObter("DeterminacaoAutomaticaGuias");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(15000);
		
		waitExpectElement(btnAceitar);
		sleep(2000);
		btnAceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Recargo la pagina
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(idUltimo);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		System.out.println(idUltimo); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
		
	}		
	
	
	
	

}
