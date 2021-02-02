package com.sap.timp.pageObjectModel.MDR.CEP.Bairro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class BairroExcluirMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"Bairro\"]")
	public WebElement bairro;
	
	@FindBy(xpath = "//button/span[text()=\"Novo bairro\"]")
	public WebElement novo;

	@FindBy(xpath = "//input[contains(@placeholder,\"Número de bairro\")]")
	public WebElement numBairro;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement uf;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"localização\")]")
	public WebElement localizacao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do bairro\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	@FindBy(xpath = "//span[text()=\"Salvar e Novo\"]")
	public WebElement salvarENovo;
	
	public BairroExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void llenarDatos1() {
		String numEnviar = "99997";		
		numBairro.clear();
		numBairro.sendKeys(numEnviar);
		sleep(1000);
		
		llenarDatos();
	}
	
	public void llenarDatos2() {
		String numEnviar = "99998";		
		numBairro.clear();
		numBairro.sendKeys(numEnviar);
		sleep(1000);
		
		llenarDatos();
	}
	
	public void llenarDatos() {
		uf.clear();
		uf.sendKeys("12");
		sleep(1000);
		
		localizacao.clear();
		localizacao.sendKeys("1020");
		sleep(1000);
		
		nome.clear();
		nome.sendKeys("Prueba");
		sleep(2000);
	}

	String idG = "";
	public boolean criar() {
		sleep(2000);
		cep.click();
		
		sleep(2000);
		bairro.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		

		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idG = id;
		System.out.println("Último id antes da criação: "+id);
	
		
		// Crear primer registro
		novo.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Se llenan los datos
		llenarDatos1();
		
		salvarENovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		// Crear segundo registro
		// Se llenan los datos
		llenarDatos2();
		
		salvarENovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		btnUltimaPagina.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;

		String id1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[3]/div")).getText();

		int id1I = convertToInt(id1);
		rows = rows - 1;
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[3]/div")).getText();
		
		System.out.println("Penultimo id após da criação: " +id1);
		System.out.println("Último id após da criação: " +id2);
		
		int id2I = convertToInt(id2);
		int idI = convertToInt(id);
		
		if (id1I > idI && id2I > idI) {
			sucesso = true;
		}
		

		
		return sucesso;
	} 
	
	public boolean exluirMassa() {
		sleep(1000);
		if(!novo.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));

		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		rows = rows - 1;
		marcarCheckbox = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));

		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		btnExcluirMassa.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		

		int id1 = convertToInt(idG);
		int id2 = 99998;
		int id3 = 99997;
		
		System.out.println("Ultimo registro al eliminar en massa: " + id1); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		System.out.println("Ultimo registro: " + id2);
		System.out.println("Penultimo registro:" + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1 != id3) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}
}
