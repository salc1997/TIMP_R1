package com.sap.timp.pageObjectModel.MDR.Centralizacao;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.base.TestBaseSteven;

public class EstornoCreditoFiltrosPO extends TestBaseKathy{
	
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"Bairro\"]")
	public WebElement bairro;
	
	
	public EstornoCreditoFiltrosPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public void criarBairro() {
		
		
		cep.click();
		sleep(1000);
		bairro.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
		
	
		
		
	}
}
