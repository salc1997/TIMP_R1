package com.sap.timp.pageObjectModel.BRD;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBase;

public class RenomearColunaPO extends TestBase{
	
	
	@FindBy(xpath = "//li[@id=\"draggable-28\"]/div/div/div/span")
	public WebElement menuC;

	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[5]")
	public WebElement opcion;
	@FindBy(xpath = "//li[@id=\"draggable-28\"]/div/div/div/div/div/div/div[2]/input")
	public WebElement coluna;
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	@FindBy(xpath = "//*[@id=\"draggable-28\"]")
	public WebElement nombre;
	
	
	
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	
	public RenomearColunaPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<String> renomear() {
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);

		waitExpectElement(menu);
		sleep(menuT);

		menu.click();

		opcao.click();

		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		String nombreC = nombre.getAttribute("column-name");

		sleep(2000);
		menuC.click();
		
		opcion.click();

		String nuevoN = "Empresa2";
		ArrayList<String> sucesso = new ArrayList<String>();
		sucesso.add(nuevoN);
		coluna.clear();
		sleep(1000);
		coluna.sendKeys(nuevoN);
		gravar.click();

		sleep(5000);

		driver.navigate().refresh();

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");

		String nombreCN = nombre.getAttribute("column-name");
		sucesso.add(nombreCN);
		
		

	
		menuC.click();
		opcion.click();
		sleep(1000);
		coluna.clear();
		sleep(1000);
		coluna.sendKeys(nombreC);

		gravar.click();
		sleep(5000);
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");

		return sucesso;
		
	}
	
	
	

}
