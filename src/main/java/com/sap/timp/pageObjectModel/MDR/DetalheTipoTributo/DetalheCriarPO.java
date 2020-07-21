package com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class DetalheCriarPO extends TestBase{

	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//span[text()=\"Detalhes Do Tipo De Tributo\"]")
	public WebElement detalhe;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div[1]/div/div/ul/li[1]/button")
	public WebElement novoDetalhe;
	
	@FindBy(xpath = "//*[@id=\"codEmpresa\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div/label/span")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[contains(@aria-label,\"Tributo\")]/div/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"taxType\"]/div/div/div/input")
	public WebElement imposto;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement impostoO;
	
	@FindBy(xpath = "//div[@id=\"descricao\"]/div/textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"validity\"]/div/div/input")
	public WebElement inicio;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	
	public DetalheCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		
		detalhe.click();
		
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div/div[1]/div/div[1]/div");
		
		siguiente.click();
		
		waitExpectXpath("//*[@id=\"list\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div[2]/div/div/div/img");
		sleep(2000);
		
		Actions actions = new Actions(driver);
		idC.click();
		sleep(1000);
		actions.doubleClick(idC).perform();
			
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		
		novoDetalhe.click();
		
		waitExpectElement(empresa);
		sleep(2000);
		empresa.click();
		sleep(1000);
		empresaO.click();
		empresa.sendKeys(Keys.ESCAPE);
		
		attributeToBeXpath("//div[@id=\"tax\"]/div", "class", "base-select required");
		sleep(1000);
		tributo.click();
		sleep(1000);
		tributoO.click();
		
		invisibilityOfElement("//*[@id=\"tabs\"]/div[2]/div/div/div/img");
		sleep(2000);
		imposto.click();
		impostoO.click();
		
		sleep(1000);
		
		descricao.sendKeys("Descricao de Teste");
		
		
		String fecha = fechaActual();
		
		inicio.sendKeys(fecha);
		
		sleep(1000);
		gravar.click();
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		
		invisibilityOfElement("//*[@id=\"tabs\"]/div[2]/div/div/div/img");
		sleep(2000);
		biblioteca.click();
		
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div/div[1]/div/div[1]/div");
		
		siguiente.click();
		
		waitExpectXpath("//*[@id=\"list\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div[2]/div/div/div/img");
		sleep(2000);
		
		idC.click();
		sleep(1000);
		actions.doubleClick(idC).perform();
			
		String idN = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		
		Double idND = convertToDouble(idN);
		Double idD = convertToDouble(id);
		
		boolean sucesso = false;
		
		if (idND > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		return sucesso;
		
		
	}
	
	
	
}
