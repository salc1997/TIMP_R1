package com.sap.timp.pageObjectModel.MDR.SequenciaAcesso;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class SequenciaCriarPO extends TestBaseEliel{
	
	
	@FindBy(xpath = "//li/div/span[text()=\"Sequência de Acesso\"]")
	public WebElement sequencia;
		
	@FindBy(xpath = "//span[text()=\"Nova Sequência de Acesso\"]")
	public WebElement sequenciaacesso;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  um Nome\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//*[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	//@FindBy (xpath = "//*[@id=\"23\"]/div[1]/label/span")
	@FindBy (xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaotributo;

	@FindBy(xpath ="//div[@id=\"structureGroup\"]/div/div/div[2]")
	public WebElement grupoestrutura;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcaogrupo;
	
	@FindBy(xpath = "//div[@id=\"structure\"]/div/div/div[2]")
	public WebElement estruturadados;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcaoestrutura;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span/span")
	public WebElement camposestrutura;
	
	//@FindBy(xpath="//div[text()=\"Agrupamento\"]")
	@FindBy(xpath = "//div[@data-item and @data-id][1]")
	public WebElement agrupamento;
	
	@FindBy(xpath = "//*[@id=\"fields\"]/div[3]")
	public WebElement camposselecionados;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[7]")
	public WebElement setafinal;
	
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input [@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public SequenciaCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean criar() {
		
		
		Actions action = new Actions(driver);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sequencia.click();
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
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sequenciaacesso.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		nome.sendKeys("Teste");
		
		descricao.sendKeys("descrição");
		
		empresa.click();
		sleep(2000);
		opcaoempresa.click();
		sleep(2000);
		opcaoempresa.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		opcaotributo.click();
		sleep(2000);
		opcaotributo.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		grupoestrutura.click();
		sleep(2000);
		opcaogrupo.click();
		
		sleep(1000);
		
		estruturadados.click();
		sleep(2000);
		opcaoestrutura.click();
		sleep(2000);
		camposestrutura.click();
		
		//arrastar a opçao para outro campo
		action.clickAndHold(agrupamento).moveToElement(camposselecionados).release().build().perform();
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gravar.click();
		
		sleep(2000);
		
		butaosim.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		sleep(2000);
		//butaosim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir3(idB);
		sleep(2000);
		System.out.println(id);
		System.out.println(idB);
		
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
