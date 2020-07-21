package com.sap.timp.pageObjectModel.MDR.DerexInstituicao;

import javax.swing.text.AbstractDocument.LeafElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class InstitucaoCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
	public WebElement derex;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//li/div/span[text()=\"Institui��o Financeira\"]")
	public WebElement instituicaoF;
	
	@FindBy(xpath = "//button/span[text()=\"Nova Institui��o Financeira\"]")
	public WebElement nova;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/input")
	public WebElement empresa;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/input")
	public WebElement filial;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
	public WebElement filialO;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"financialInstitution\"]/div/div/input")
	public WebElement instituicao;
	
	@FindBy(xpath = "//div[@id=\"country\"]/div/div[2]")
	public WebElement pais;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
	public WebElement paisO;
	
	@FindBy(xpath = "//div[@id=\"options\"]/div/div/div[2]")
	public WebElement moedaOrdem;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
	public WebElement moedaOrdemO;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div/input")
	public WebElement validF;
	
	@FindBy(xpath = "//div[@id=\"coin\"]/div/div[2]")
	public WebElement moeda;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
	public WebElement moedaO;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	*/
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	public InstitucaoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		
		derex.click();
		sleep(1000);
		instituicaoF.click();
		
		waitExpectXpath("//*[@id=\"table\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"table\"]/div[2]/div/div/div/img");
		sleep(2000);

		siguiente.click();
		
		waitExpectXpath("//*[@id=\"table\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"table\"]/div[2]/div/div/div/img");
		sleep(2000);
		
		idC.click();
		sleep(1000);
		
		dobleClickElement(idC);
			
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		System.out.println(id);
		
		nova.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
		//waitExpectElement(biblioteca);
		//waitExpectXpath("//*[@id=\"Editcontainer\"]/div[4]/div/div/div/img");
		sleep(2000);
		empresa.click();
		sleep(1000);
		empresaO.click();
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-select required");
		sleep(1000);
		filial.click();
		sleep(1000);
		filialO.click();
		
		sleep(2000);
		tributo.click();
		sleep(2000);
		tributoO.click();
		tributoO.sendKeys(Keys.ESCAPE);
		
		sleep(1000);
		
		instituicao.sendKeys("Institui��o Teste");
		
		sleep(1000);
		
		pais.click();
		sleep(1000);
		paisO.click();
		sleep(1000);
		
		moedaOrdem.click();
		sleep(1000);
		moedaOrdemO.click();
		sleep(1000);
		attributeToBeXpath("//div[@id=\"coin\"]/div", "class", "base-autocomplete required");
		
		sleep(2000);
		moeda.click();
		sleep(1000);
		moedaO.click();
		
		
		String validFrom = fechaActual();
		
		validF.sendKeys(validFrom);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("/html/body/div[3]/div/div[4]/div/div/div/img");
		sleep(2000);
		biblioteca.click();
		
		waitExpectXpath("//*[@id=\"table\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"table\"]/div[2]/div/div/div/img");
		sleep(2000);

		siguiente.click();
		
		waitExpectXpath("//*[@id=\"table\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"table\"]/div[2]/div/div/div/img");
		sleep(2000);
		
		idC.click();
		sleep(1000);
		
		dobleClickElement(idC);
			
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		System.out.println(idB);
		
		double idbD = convertToDouble(idB);
		double idD = convertToDouble(id);
		
		boolean sucesso = false;
		
		if (idbD>idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		return sucesso;	
		
	}
	
}
