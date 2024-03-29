package com.sap.timp.pageObjectModel.ADM.Usuarios.Pacotes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.sap.timp.base.TestBase;

public class PacotesCriarPO extends TestBase{
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div/div[2]")
	public WebElement flecha;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[4]")
	public WebElement usuario;
	
	@FindBy(xpath = "//span[text()=\"Pacotes\"]")
	public WebElement pacotes;
	
	@FindBy(xpath = "//span[text()=\"Novo Pacote\"]")
	public WebElement nuevo;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Nome do Pacote\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//span[text()=\"Aplicativos do Pacote\"]")
	public WebElement aplicativos ;
	
	@FindBy(xpath = "//div[@id=\"apps-container\"]/div/div[1]/div[2]/div[1]")
	public WebElement elemento;
	
	@FindBy(xpath = "//div[@class=\"th checkbox-header\"][1]/div/label/span")
	public WebElement chek;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//Span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement no;
	

	public PacotesCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean Criar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		flecha.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		usuario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pacotes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas	
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		System.out.println(id);			
		sleep(2000);	
		
		nuevo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("TestMassielV");
		sleep(4000);
		
		aplicativos.click();
		sleep(2000);
		
		moveToElement(elemento, driver.findElement(By.xpath("//div[@id=\"apps-container\"]/div/div[3]")));
		sleep(2000);
		
		chek.click();
		sleep(4000);
	
		
		aplicar.click();
		sleep(4000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		
		idInserir("pacotesCriar",id2);
		int idD = convertToInt(id);
		int id2D = convertToInt(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
