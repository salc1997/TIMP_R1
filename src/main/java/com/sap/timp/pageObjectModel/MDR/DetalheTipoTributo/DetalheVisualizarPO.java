package com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DetalheVisualizarPO extends TestBaseSteven {

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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter1();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");

		return sucesso;

	}

}
