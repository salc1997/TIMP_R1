package com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class DetalheVisualizarPO extends TestBase {

	@FindBy(xpath = "//span[text()=\"Detalhes Do Tipo De Tributo\"]")
	public WebElement detalhe;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;

	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;

	public DetalheVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public String visualizar() {

		detalhe.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div/div/div/div/img");
		siguiente.click();

		waitExpectXpath("//*[@id=\"list\"]/div/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div[2]/div/div/div/img");
		waitExpectElement(menu);
		sleep(2000);

		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		menu.click();
		sleep(2000);
		visualizar.click();
		
		sleep(15000);

		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");

		return sucesso;

	}

}
