package com.sap.timp.pageObjectModel.MDR.CEP.Municipio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MunicipioVisualizarPO extends TestBaseSteven{
	
	
	
	@FindBy(xpath = "//div/div/span[text()=\"Número de localização\"]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;
	
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"Município\"]")
	public WebElement municipio;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	public MunicipioVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public String visualizar() {

		cep.click();
		sleep(1000);
		municipio.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		idC.click();
		sleep(1000);
		dobleClickElement(idC);

		
		menu.click();
		sleep(1000);
		visualizar.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		System.out.println(sucesso);
		
		return sucesso;


	}

}
