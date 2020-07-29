package com.sap.timp.pageObjectModel.MDR.CEP.Municipio;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;

public class MunicipioEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"Munic�pio\"]")
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
	
	@FindBy(xpath = "//input[contains(@placeholder,\"N�mero de localiza��o\")]")
	public WebElement numero;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome de localiza��o\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement uf;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"CEP\")]")
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
	
	public MunicipioEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void editar() {
		
		cep.click();
		sleep(1000);
		municipio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		
		pesquisar.sendKeys("99999999");
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		
	}

}
