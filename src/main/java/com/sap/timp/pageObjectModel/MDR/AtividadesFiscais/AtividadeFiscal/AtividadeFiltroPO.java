package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtividadeFiltroPO extends TestBaseSteven {

	@FindBy(xpath = "//li[contains(@class,\"collapsed\")]/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades1;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-fiscalActivities\"]")
	public WebElement atividadesO1;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	


	public AtividadeFiltroPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtro() {

		String url = driver.getCurrentUrl();

		
		atividades1.click();
		sleep(2000);
		atividadesO1.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);

		String idRegistro = id.getText();

		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = id.getText();

		boolean sucesso = idRegistro.equals(idBusqueda);

		return sucesso;

	}

}
