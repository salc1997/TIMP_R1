package com.sap.timp.pageObjectModel.MDR.CEP.Municipio;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class MunicipioCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"cep\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"Município\"]")
	public WebElement municipio;
	
	@FindBy(xpath = "//button/span[text()=\"Nova Cidade\"]")
	public WebElement novo;

	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Número de localização\")]")
	public WebElement numero;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome de localização\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement uf;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"cep\")]")
	public WebElement cepN;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Loc in sit\")]")
	public WebElement locS;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Loc in tipo\")]")
	public WebElement locT;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[3]/div")
	public WebElement localiza;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	public MunicipioCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		
		cep.click();
		sleep(1000);
		municipio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		numero.sendKeys("15364");
		
		nome.sendKeys("Teste Municipio");
		
		uf.sendKeys("SP");
		
		cepN.sendKeys("11112222");
		
		locS.sendKeys("1");
		
		locT.sendKeys("1");
		
		sleep(2000);
		gravar.click();
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
		
		pesquisar.sendKeys("99999999");
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String registro= localiza.getText();
		
		boolean sucesso = registro.contains("99999999");
		
		return sucesso;
		
		
		
		
	}

}
