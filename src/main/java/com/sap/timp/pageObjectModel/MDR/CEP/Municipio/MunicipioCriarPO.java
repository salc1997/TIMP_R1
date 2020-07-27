package com.sap.timp.pageObjectModel.MDR.CEP.Municipio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;

public class MunicipioCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"Município\"]")
	public WebElement municipio;
	
	public MunicipioCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void criar() {
		
		cep.click();
		sleep(1000);
		municipio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		
		
	}

}
