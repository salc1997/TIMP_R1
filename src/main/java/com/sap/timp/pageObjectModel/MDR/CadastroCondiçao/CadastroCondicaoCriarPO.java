package com.sap.timp.pageObjectModel.MDR.CadastroCondiçao;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class CadastroCondicaoCriarPO extends TestBaseEliel{
	
	
	@FindBy(xpath = "//span[text()=\"Cadastro da Condição\"]")
	public WebElement cadastrocondicao;
		
	@FindBy(xpath = "//span[text()=\"Novo Cadastro da Condição\"]")
	public WebElement novocadastrocondicao;
	

	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Empresa\"]")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	public WebElement opcaoempresatc2tq1tp1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  um UF\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//*[@id=\"SP\"]/div[1]/label/span")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Filial\"]")
	public WebElement filial;
	
	@FindBy(xpath ="//*[@id=\"1000_SP_0001\"]/div[1]/label/span")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  um Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"23\"]/div[1]/label/span")
	public WebElement opcaotributo;
	
	@FindBy(xpath ="//input[@placeholder=\"Selecionar  uma  Sequência de Acesso\"]")
	public WebElement sequenciaacesso;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcaosequenciaacesso;
	
	@FindBy(xpath = "//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement vigenciade;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span/span")
	public WebElement camposestrutura;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Atribuição\"]")
	public WebElement atribuicao;
	
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]/div")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[6]")
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[7]")
	//public WebElement setafinal;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[7]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public CadastroCondicaoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean criar() {
		
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		cadastrocondicao.click();
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
		novocadastrocondicao.click();
	
		sleep(2000);
		empresa.click();
		sleep(2000);
		if (tc2 == true || tp1 == true || tq1 == true) {
			opcaoempresatc2tq1tp1.click();
			empresa.sendKeys(Keys.ESCAPE);
		}else {
			opcaoempresa.click();
			empresa.sendKeys(Keys.ESCAPE);
		}
		//opcaoempresa.click();
		
		//empresa.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
		
		uf.click();
		
		opcaouf.click();
		
		uf.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
		
		filial.click();
		
		opcaofilial.click();
		
		filial.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
		
		tributo.click();
		
		opcaotributo.click();
		
		tributo.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
		
		sequenciaacesso.click();
		
		opcaosequenciaacesso.click();

		sleep(2000);
		
		//pega a data atual
		String dataatual = fechaActual();
		vigenciade.sendKeys(dataatual);
				
		sleep(2000);
		camposestrutura.click();
		sleep(2000);
		atribuicao.sendKeys("campo");
		
		gravar.click();
		
		butaosim.click();
		
		sleep(2000);
		
		biblioteca.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Pega o ultimo id depois do preenchimento

		setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		String idB = idR.getText();
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
		
		System.out.println( sucesso);

		
		pesquisar.sendKeys(idB);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//verificar se o relatório foi criado
		boolean text= idB.contains(idR.getText());
		System.out.println(text);
		
		return text;

	}
	

}
