package com.sap.timp.pageObjectModel.MDR.Bairro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class BairroVisualizarPO extends TestBase{
	

	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"Bairro\"]")
	public WebElement bairro;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;
	
	public BairroVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public String visualizar() {
		
		cep.click();
		sleep(1000);
		bairro.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
		String numEnviar = "99999";
		
		pesquisar.sendKeys(numEnviar);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu.click();
		sleep(2000);
		visualizar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		
		return sucesso;
		
		
	}
	
	
	
	

}
