package com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ConfiguracaoTributoAgrupamentoCriarPO extends TestBase {
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configura��o;
	
	@FindBy(xpath = "//span[text()=\"Configura��o de Tributos\"]")
	public WebElement Configura��odeTributos;
	
	@FindBy(xpath = "//span[text()=\"Configura��o de Tributo Agrupamento\"]")
	public WebElement Configura��odeTributosAgrupamento;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Tributo Agrupamento\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Agrupamento\"]")
	public WebElement agrupamento;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[4]/button/span")
	public WebElement actualizar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public ConfiguracaoTributoAgrupamentoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Configura��o.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		Configura��odeTributos.click();
		sleep(3000);

		
		Configura��odeTributosAgrupamento.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		 
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			System.out.println("ID Primer Registro: " + id);
		}
		
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		agrupamento.sendKeys("TESTE QA");
		
	
		btnGravar.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		sleep(2000);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		 
		btnPrimeraPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		
		// Se obtiene el primer registro de la tabla
		String idPrimerRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText(); 
		System.out.println("");
		System.out.println("ID Primer nuevo registro: " + idPrimerRegistro);
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idPrimerRegistro);
		
		//compara pra ver se o novo id criado � realmente o ultimo		  
		if (id2 > id1) {  
			sucesso = true; 
			idInserir("Configura��oTributoAgrupamento",idPrimerRegistro);
			System.out.println("Registro creado...");
		}
		
		return sucesso;
	}

}