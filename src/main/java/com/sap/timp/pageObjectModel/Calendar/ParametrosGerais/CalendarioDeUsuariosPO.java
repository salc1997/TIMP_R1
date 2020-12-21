package com.sap.timp.pageObjectModel.Calendar.ParametrosGerais;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CalendarioDeUsuariosPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Calendário de Usuários\"]")
	public WebElement calendario;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\") and @tabindex=\"0\"][2]")
	public WebElement ar;
	
	@FindBy(xpath = "//span[text()=\"Calendário de Usuários\"]")
	public WebElement mostrar;
	

	public CalendarioDeUsuariosPO() {

		PageFactory.initElements(driver, this);
	}

	
	public boolean acessarMDR() {

		calendario.click();
		sleep(3000);
		waitExpectElement(ar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		
		
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		return sucesso;
		
		
	}
	
}
