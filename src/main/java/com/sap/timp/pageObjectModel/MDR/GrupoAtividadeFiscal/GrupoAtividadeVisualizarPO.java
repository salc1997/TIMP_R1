package com.sap.timp.pageObjectModel.MDR.GrupoAtividadeFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class GrupoAtividadeVisualizarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]")
	public WebElement atividades1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]/ul/li[3]")
	public WebElement atividadesO1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]")
	public WebElement atividades2;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]/ul/li[3]")
	public WebElement atividadesO2;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	public GrupoAtividadeVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public String visualizar() {

		String url = driver.getCurrentUrl();

		if (url.contains("tc2") || url.contains("tp1")) {
			atividades2.click();
			sleep(2000);
			atividadesO2.click();
			sleep(2000);
		} else {

			atividades1.click();
			sleep(2000);
			atividadesO1.click();
			sleep(2000);
		}
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div/div/div/div/img");

		sleep(2000);

		siguiente.click();

		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div/div/div/div/img");
		sleep(2000);

		Actions actions = new Actions(driver);
		idC.click();
		sleep(1000);
		actions.doubleClick(idC).perform();
		
		menu.click();
		sleep(1000);
		visualizar.click();
		
		sleep(15000);

		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");

		return sucesso;

	}

}
