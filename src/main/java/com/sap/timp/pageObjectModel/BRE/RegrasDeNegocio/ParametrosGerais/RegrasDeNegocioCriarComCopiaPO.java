package com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class RegrasDeNegocioCriarComCopiaPO extends TestBase {
	
	@FindBy(xpath = "//span[text()=\"Regras de Neg�cio\"]")
	public WebElement regrasdenegocio;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	public RegrasDeNegocioCriarComCopiaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarComCopia() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		regrasdenegocio.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("RegrasDeNegocioCriar");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));
		System.out.println("ID ultimo registro: " + idRegistro);
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.clear();
		nome.sendKeys("Testeautomatizado - Nao Mexer - Copia");
		waitExpectedElement(aplicar);
		sleep(6000);
		aplicar.click();
		
		sleep(28000);
	
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regrasdenegocio.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistroCopia = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("ID Registro copia: " + idRegistroCopia);
		
		if(idRegistroCopia != idRegistro) {
			boolean sucesso1= true;
			System.out.println("Copia criada...");
			System.out.println("ID Registro: " + idRegistro);
			System.out.println("ID Registro copia: " + idRegistroCopia);	
			sucesso.add(sucesso1);
		}else {
			boolean sucesso1= false;
			System.out.println("Copia n�o criada");			
			sucesso.add(sucesso1);
		}
		
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopia+"\"]/div[1]/div"));
		a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopia+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectedElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	//	waitExpectElement(mensagem);
		sleep(6000);
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistroCopiaLixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("ID Registro Copia na Lixeira: " + idRegistroCopiaLixeira);
		
		double idD = convertToDouble(idRegistroCopiaLixeira);
		double idBD = convertToDouble(idRegistroCopia);
		if(idD == idBD)
		{
			System.out.println("Sim o ID � o mesmo da Copia");
			boolean sucesso1=true;
			sucesso.add(sucesso1);
		}else {
			System.out.println("N�o � o mesmo ID");
			boolean sucesso1 = false;
			sucesso.add(sucesso1);
		}
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopiaLixeira+"\"]/div[1]/div"));
		a�ao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopiaLixeira+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistroLixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		if(idRegistroCopiaLixeira != idRegistroLixeira) {
			System.out.println("ID Registro Copia Lixeira: " + idRegistroCopiaLixeira);
			System.out.println("ID Registro ultimo ap�s apagar o registro copia da lixeira: " + idRegistroLixeira);	
			boolean sucesso2 = true;
			sucesso.add(sucesso2);
		}else {
			System.out.println("N�o existe a c�pia na lixeira");			
			 boolean sucesso2 = false;
			 sucesso.add(sucesso2);
		}
		
		System.out.println(sucesso);
		return sucesso;
	}

}
