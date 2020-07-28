package com.sap.timp.pageObjectModel.MDR.CEP.Logradouro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKathy;

public class LogradouroCriarPO extends TestBaseKathy{

	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"Logradouro\"]")
	public WebElement logradouro;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[9]")
	public WebElement siguiente;
		
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Novo logradouro\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[1]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement fieldCEP;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[2]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement fieldUF;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[3]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement numeroLocalizaçao;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[4]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement numeroBairro;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[5]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nombreLogradouro;
	
	public LogradouroCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void logradouroCriar() {
		cep.click();
		sleep(1000);
		logradouro.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}
}
