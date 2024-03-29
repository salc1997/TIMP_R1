package com.sap.timp.pageObjectModel.MDR.SCANC.RelacionamentoEntreQuadros;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class RelacionamentoEntreQuadrosFiltroIdPO extends TestBase {

	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Relacionamento entre Quadros\"]")
	public WebElement relacionamentoScanc;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	


	public RelacionamentoEntreQuadrosFiltroIdPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtro() {


		sleep(2000);
		scanc.click();
		sleep(2000);
		relacionamentoScanc.click();
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
