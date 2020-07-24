package com.sap.timp.pageObjectModel.MDR.Tributos;

import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKathy;

public class TributosCriarPO extends TestBaseKathy{
	@FindBy(xpath = "//li/div/span[text()=\"Centralização\"]")
	public WebElement centralização;
	
	@FindBy(xpath = "//li/div/span[text()=\"Tributos\"]")
	public WebElement tributos;
	
	@FindBy(xpath = "//button/span[text()=\"Nova Centralização de Tributos\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um  Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar UF Filial\"]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcUfFilial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Filiais\"]")
	public WebElement filiais;
	
	@FindBy(xpath = "//*[@id=\"0001\"]/div[2]")
	public WebElement opcFiliais;
	
	@FindBy(xpath = "//div[contains(@class,\"overlay-multipleSelect3\")]")
	public WebElement claseOpcFiliais;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"00\"]/div[2]")
	public WebElement opcTributoICMS;
	
	@FindBy(xpath = "//*[@id=\"23\"]/div[2]")
	public WebElement opcTributoCIAP;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo Centralizador\"]")
	public WebElement tributoCentralizador;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcTributoCentralizador;
	
	@FindBy(xpath = "//*[@id=\"validity\"]/div/div[1]/input")
	public WebElement dataVigenciaInicio;
	
	public TributosCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void criarTributo() {
		
		
		centralização.click();
		sleep(1000);
		tributos.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
		
		novo.click();
		waitExpectElement(btnGravar);
		waitExpectElement(empresa);
		empresa.sendKeys(Keys.ENTER);
		opcEmpresa.click();
		sleep(2500);
		ufFilial.sendKeys(Keys.ENTER);
		opcUfFilial.click();
		sleep(2500);
		filiais.sendKeys(Keys.ENTER);
		opcFiliais.click();
		claseOpcFiliais.click();
		
		tributo.click();
		//tributo.sendKeys("ICMS");
		//tributo.sendKeys(Keys.ENTER);
		opcTributoCIAP.click();
		opcTributoICMS.click();
		claseOpcFiliais.click();
		
		tributoCentralizador.click();
		opcTributoCentralizador.click();
		
		dataVigenciaInicio.click();
		dataVigenciaInicio.sendKeys("24/07/2020");
		btnGravar.click();
		/*
		try {
		    WebElement button = driver.findElement(By.xpath("//input[@placeholder=\"Selecionar UF Filial\"]"));
		            button.click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
		    WebElement button = driver.findElement(By.xpath("//input[@placeholder=\"Selecionar UF Filial\"]"));
		            button.click();
		}
		*/
		
	}
}
