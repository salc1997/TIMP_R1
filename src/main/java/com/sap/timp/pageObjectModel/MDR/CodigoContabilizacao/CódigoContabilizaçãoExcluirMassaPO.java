package com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseCristhian;

public class CódigoContabilizaçãoExcluirMassaPO extends TestBaseCristhian {
	
	@FindBy(xpath = "//span[text()=\"Códigos de Contabilização\"]")
	public WebElement codigoscontabilizacao;
	
	@FindBy(xpath = "//span[text()=\"Novo Código de Contabilização\"]")
	public WebElement novocodigocontabilizacao;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravarNovo;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement empresa;
	
	//@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Lançamento \"]")
	public WebElement tipolancamento;
	
	@FindBy(xpath = "//li[@class=\"list-item selected visible\"]")
	public WebElement opcaotipolancamento;

	@FindBy(xpath = "//*[@id=\"standard-description\"]/div/div/input")
	public WebElement descricaopadrao;
	
	@FindBy(xpath = "//div[@class=\"icon main-icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//*[@id=\"start-date\"]/div/div[1]/input")
	public WebElement datainicio;
	
	@FindBy(xpath = "//div[@id=\"tax-type\"]/div/div[2]")
	public WebElement tipotributo;
	
	//@FindBy(xpath = "//div[@class=\"base-autocomplete-box show\"]/ul/li[2]")
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipotributo;
	
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public CódigoContabilizaçãoExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		codigoscontabilizacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novocodigocontabilizacao.click();
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		empresa.click();
		sleep(2000);
		opcaoempresa.click();
		sleep(2000);
		opcaoempresa.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		tipolancamento.sendKeys(Keys.ENTER);
		sleep(2000);
		opcaotipolancamento.click();
		sleep(1000);
		
		descricaopadrao.sendKeys("Teste QA 1");
		
		tributo.click();
		
		opcaotributo.click();
		
		//tipotributo.sendKeys("A0002 - FUNDOS");
		
		
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-autocomplete required");
		sleep(2000);
		tipotributo.click();
		
		opcaotipotributo.click();
		
		//pega a data atual
		//String data= fechaActual();
		String data = fechaAyer();
		datainicio.sendKeys(data);
		
		
		sleep(2000);
		gravarNovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		empresa.click();
		sleep(2000);
		opcaoempresa.click();
		sleep(2000);
		opcaoempresa.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
		
		tipolancamento.sendKeys(Keys.ENTER);
		sleep(2000);
		opcaotipolancamento.click();
		
		sleep(1000);
		
		descricaopadrao.sendKeys("Teste QA 1");
		sleep(2000);
		tributo.click();
		sleep(2000);
		opcaotributo.click();
		
		//tipotributo.sendKeys("A0002 - FUNDOS");
		
		sleep(3000);
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-autocomplete required");
		sleep(2000);
		tipotributo.click();
		sleep(2000);
		opcaotipotributo.click();
		sleep(2000);
		//pega a data atual
		//String data= fechaActual();
		String data1 = fechaAyer();
		datainicio.sendKeys(data1);
		
		sleep(2000);
		gravarNovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("rows: "+rows);
		Integer fila1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer fila2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		fila2 = fila2 - 1; 
		
		System.out.println("fila1: "+fila1);
		System.out.println("fila2: "+fila2);
		
		WebElement selecccionuno = driver.findElement(By.xpath("//div[@data-id]["+fila1+"]/div[2]/label/span"));
		selecccionuno.click();
		
		WebElement selecccionDos = driver.findElement(By.xpath("//div[@data-id]["+fila2+"]/div[2]/label/span"));
		selecccionDos.click();
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Sign-and-Symbols icon-persign\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(2000);
		
		aceitar.click();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir3(idB);
		sleep(2000);
		System.out.println("ID: "+id);
		System.out.println("IDB: "+idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
	}
}
