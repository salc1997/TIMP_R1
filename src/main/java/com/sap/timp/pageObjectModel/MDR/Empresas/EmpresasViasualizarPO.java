package com.sap.timp.pageObjectModel.MDR.Empresas;

//import org.apache.poi.hssf.record.TextObjectRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EmpresasViasualizarPO extends TestBaseSteven{
	

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[21]")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	
	 @FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[2]")
	public WebElement visualizar;
	
	
	
	public EmpresasViasualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public String visualizar() {
		
		empresa.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");

		sleep(2000);
		
		menu.click();
		visualizar.click();
		
		waitExpectXpath("//label[text()=\"Razão Social:\"]");
		
		String sucesso = driver.findElement(By.xpath("//*[@id=\"show\"]/table[1]")).getAttribute("class");
		
		return sucesso;
	}
	
	

}
