package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApura�aoXSpedFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class DeParaLivroApuracaoXSpedFiscalExcluirEmMassaPO extends TestBase {
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"DE-PARA Livro Apura��o X SPED-Fiscal\"]")
	public WebElement livroapuracao;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"tribute\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"tipoTributo\"]/div/div/div[2]")
	public WebElement tipotributo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"line\"]/div/div/div[2]")
	public WebElement linha;

	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaolinha;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de In�cio de Vig�ncia \"]")
	public WebElement data;
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;

	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagem;
	
	public DeParaLivroApuracaoXSpedFiscalExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		livroapuracao.click();
		
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
		
		novo.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Primeiro Registro
		
		tributo.click();
		
		sleep(2000);
		
		opcaotributo.click();
		
		sleep(2000);
		attributeToBe("//div[@class=\"element\" and @id=\"tipoTributo\"]/div", "class", "base-select required");
		sleep(2000);
		tipotributo.click();
		sleep(2000);
		opcaotipotributo.click();
		sleep(2000);
		linha.click();
		sleep(2000);
		opcaolinha.click();
		
		sleep(1000);
		data.sendKeys(fechaActual());
		sleep(2000);
		novo.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		//Segundo Registro
		driver.navigate().refresh();
		sleep(2000);
		waitExpectedElement(tributo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tributo.click();
		
		sleep(2000);
		
		opcaotributo.click();
		
		sleep(6000);
		//attributeToBeXpath("//div[@class=\"element\" and @id=\"tipoTributo\"]/div", "class", "base-select required");
		sleep(2000);
		tipotributo.click();
		sleep(2000);
		opcaotipotributo.click();
		sleep(2000);
		linha.click();
		sleep(2000);
		opcaolinha.click();
		
		sleep(1000);
		data.sendKeys(fechaActual());
		sleep(2000);
		novo.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		//(2000);
		//nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		
	
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}	
	
	
	public boolean excluir() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(1000);
		waitExpectedElement(aceitar);
		sleep(1000);
		aceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectedElement(siguiente);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println(" Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
		
		
		
		return sucesso;
	}


}
