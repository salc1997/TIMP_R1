package com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoDeTributo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ConfiguracaoDeTributoExcluirPO extends TestBase {

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;

	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement configuracaotributos;

	@FindBy(xpath = "//span[text()=\"Configuração de tributo\"]")
	public WebElement configuracaotributo;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	public ConfiguracaoDeTributoExcluirPO() {

		PageFactory.initElements(driver, this);
	}

	public Boolean excluir() {

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaotributos.click();
		sleep(2000);
		configuracaotributo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primeira.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("ConfiguracaoDeTributo");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement excluir = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);

		excluir.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		/*driver.navigate().refresh();
		waitExpectElement(primeira);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		*/
		String id = driver
				.findElement(By.xpath(
						"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div"))
				.getText();

		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);

		boolean sucesso = false;

		if (id1 != id2) {
			sucesso = true;
		}
		System.out.println(sucesso);
		return sucesso;

	}

}
