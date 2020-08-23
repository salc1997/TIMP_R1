package com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class InstitucaoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
	public WebElement derex;
	@FindBy(xpath = "//li/div/span[text()=\"Instituição Financeira\"]")
	public WebElement instituicaoF;
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	public InstitucaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public String visualizar() {
		
		derex.click();
		sleep(1000);
		instituicaoF.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter4();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		
		attributeToBeXpath("//div[@class=\"edit tabs\"]", "id", "show");
		
		
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		System.out.println(sucesso);
		return sucesso;
		
		
	}
	
	

}
