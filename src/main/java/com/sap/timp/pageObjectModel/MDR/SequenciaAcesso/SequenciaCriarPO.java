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
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  um Tributo\"]")
	public WebElement tributo;
	
	@FindBy (xpath = "//*[@id=\"23\"]/div[1]/label/span")
	public WebElement opcaotributo;

	@FindBy(xpath =" //*[@id=\"select\"]/div[1]/input")
	public WebElement grupoestrutura;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcaogrupo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Estrutura de Dados\"]")
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
	
	@FindBy (xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[5]")
	public WebElement seguinte;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span/span")
	public WebElement camposestrutura;
	
	@FindBy(xpath="//div[text()=\"Agrupamento\"]")
	public WebElement agrupamento;
	
	@FindBy(xpath = "//*[@id=\"fields\"]/div[3]")
	public WebElement camposselecionados;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[7]")
	public WebElement setafinal;
	
	
	public SequenciaCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void criar() {
		
		
		Actions action = new Actions(driver);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sequencia.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Pega o ultimo id
		setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		
		String id = idR.getText();
		sleep(2000);
		//System.out.println(id);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sequenciaacesso.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		nome.sendKeys("Teste");
		
		descricao.sendKeys("descrição");
		
		empresa.click();
		
		opcaoempresa.click();
		
		empresa.sendKeys(Keys.ESCAPE);
		
		tributo.click();
		
		opcaotributo.click();
		
		tributo.sendKeys(Keys.ESCAPE);
		
		grupoestrutura.click();
		
		opcaogrupo.click();
		
		sleep(1000);
		
		estruturadados.click();
		
		opcaoestrutura.click();
		
		camposestrutura.click();
		
		//arrastar a opçao para outro campo
		action.clickAndHold(agrupamento).moveToElement(camposselecionados).release().build().perform();
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		gravar.click();
		
		butaosim.click();
		
		biblioteca.click();
		
		
		

	}
	


}
