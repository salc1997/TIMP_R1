package com.sap.timp.pageObjectModel.BRB;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EditarPOPrueba extends TestBaseSteven{

	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")				
	public WebElement gravar;
	
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;
	
	@FindBy(xpath = "//li/span[text()=\"Editar\"]")
	public WebElement opcao;
	
	@FindBy(xpath = "//*[@id=\"draggable-28\"]")
	public WebElement mover;
	
	@FindBy(xpath = "//*[@id=\"draggable-30\"]")
	public WebElement haciaE;
	
	public EditarPOPrueba() {

		PageFactory.initElements(driver, this);
	}
	

	public void editar() {
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);

		waitExpectElement(menu);
		sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		sleep(2000);
		
		Point empresa = mover.getLocation();
		Point filial = haciaE.getLocation();
		
		
		System.out.println(empresa);
		System.out.println(filial);
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(mover, haciaE).perform();
		
		
		
	}

}
