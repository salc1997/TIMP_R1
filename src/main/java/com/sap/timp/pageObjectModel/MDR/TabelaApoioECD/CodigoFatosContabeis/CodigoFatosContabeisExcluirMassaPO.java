package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CodigoFatosContabeisExcluirMassaPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\" Tabelas de Apoio ECD\"]")
	public WebElement tabelaECDE;
	
	@FindBy(xpath = "//span[text()=\" C�digo dos Fatos Cont�beis\"]")
	public WebElement opcionCodigoFatosContabeis;
	
	@FindBy(xpath = "//span[text()=\"Novo  C�digo do Fato Cont�bil\"]")
	public WebElement btnNovoCodigoFatoContabeisElement;
	
	@FindBy(xpath = "//div[@id=\"accountingFactCode-1\"]/div/div/input")
	public WebElement inputCodigoFatoContabil;
	
	@FindBy(xpath = "//div[@id=\"accountingFact-1\"]/div/div/input")
	public WebElement inputDescricaoFatoContabil;
	
	@FindBy(xpath = "//div[@id=\"startDate-1\"]/div/div/input")
	public WebElement inputDataInicio;
	
	@FindBy(xpath = "//div[@id=\"endDate-1\"]/div/div/input")
	public WebElement inputDataFinal;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	public CodigoFatosContabeisExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void criar() {
		sleep(2000);
		tabelaECDE.click();
		
		sleep(2000);
		opcionCodigoFatosContabeis.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		btnNovoCodigoFatoContabeisElement.click();
		
		sleep(2000);
		waitExpectElement(inputCodigoFatoContabil);
		inputCodigoFatoContabil.sendKeys("5505");
		
		sleep(2000);
		waitExpectElement(inputDescricaoFatoContabil);
		inputDescricaoFatoContabil.sendKeys("Prueba de tester = verificar5");
		
		sleep(2000);
		waitExpectElement(inputDataInicio);
		inputDataInicio.sendKeys("09/10/2020");
		
		sleep(2000);
		waitExpectElement(inputDataFinal);
		inputDataFinal.sendKeys("10/10/2020");
		
		sleep(2000);
	}
}
