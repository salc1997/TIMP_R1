package com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoTributoXEstrutura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ConfiguraçãoTributoTributoXEstruturaCriarPO extends TestBaseKenssy{

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement ConfiguraçãodeTributos;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributo X Estrutura\"]")
	public WebElement ConfiguraçãodeTributosEstrutura;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração de Tributo X Estrutura\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Seleccionar Estrutura de dados\"]")
	public WebElement estruturaDados;
	@FindBy(xpath = "//div[1]/div[@class=\"list-item\" and @id][1]/div[1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Tributo\"]")
	public WebElement tributo;
	@FindBy(xpath = "//div[1]/div[@class=\"list-item\" and @id][1]/div[1]/label/span")
	public WebElement opcaoTributo;
	
	@FindBy(xpath = "//div[contains(@class,\"dataIniVigencia\")]/div/div/input")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public ConfiguraçãoTributoTributoXEstruturaCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	String idPrimerRegistro ="0";
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ConfiguraçãodeTributos.click();
		sleep(2000);
		ConfiguraçãodeTributosEstrutura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = "0"; // Primer ID antes de crear un registro
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID ultimo Registro: " + id);
		}
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estruturaDados.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		opcaoTributo.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		
		dataVigencia.sendKeys(fechaActual());
		sleep(2000);
		
		btnGravar.click();
		sleep(4000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		
		// Se obtiene el primer registro de la tabla
		idPrimerRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText(); 
		System.out.println("");
		System.out.println("ID ultimo nuevo registro: " + idPrimerRegistro);
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idPrimerRegistro);
		
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if (id2 > id1) {  
			sucesso = true; 
			idInserir("ConfiguraçãoTributoEstrutura",idPrimerRegistro);
			System.out.println("Registro creado...");
		}
		
		return sucesso;
		
	}
}
