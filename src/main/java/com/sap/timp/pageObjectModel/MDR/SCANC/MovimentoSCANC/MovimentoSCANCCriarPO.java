package com.sap.timp.pageObjectModel.MDR.SCANC.MovimentoSCANC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;
import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;

public class MovimentoSCANCCriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Movimento SCANC\"]")
	public WebElement produtosScanc;
	
	@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
	public WebElement novo;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Empresa\")]")
	public WebElement empresa;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement uf;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione Filial\")]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement filialO;
		
	@FindBy(xpath = "//input[contains(@placeholder,\"Filial Centralizadora\")]")
	public WebElement filialCentralizadora;

	@FindBy(xpath = "//div[@id=\"effectiveDate\"]/div/div/input")
	public WebElement dataVigencia;
	
	
	
	
	public MovimentoSCANCCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		produtosScanc.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		
		empresa.sendKeys(Keys.ENTER);
		sleep(1000);
		opcao.click();
		
		attributeToBeXpath("//div[@id=\"UF\"]/div", "class", "base-select required");
		sleep(2000);
		
		uf.sendKeys(Keys.ENTER);
		sleep(1000);
		opcao.click();
		
		attributeToBeXpath("//div[@id=\"branches\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);	
		
		filial.sendKeys(Keys.ENTER);
		sleep(1000);
		filialO.click();
		filialO.sendKeys(Keys.ESCAPE);
		sleep(2000);
		

		
		filialCentralizadora.sendKeys(Keys.ENTER);
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		dataVigencia.sendKeys(fechaActual());
		
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		
		idInserir2(id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
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
