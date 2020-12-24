package com.sap.timp.pageObjectModel.BRE.TabelasExternas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class TabelasExternasEditarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Tabelas\"]")
	public WebElement tabelas;

	@FindBy(xpath = "//span[text()=\"Tabelas externas\"]")
	public WebElement tabelasExternas;

	@FindBy(xpath = "//div[@id=\"effective-date-to\"]/div/div/input")
	public WebElement dataFim;

	@FindBy(xpath = "//button[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	public  TabelasExternasEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public void Editar() {

		String url = driver.getCurrentUrl();

		sleep(2000);
		tabelas.click();
		sleep(2000);

		tabelasExternas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = null;

		if (url.contains("tq1")==true) {

			idRegistro = "list-check_171";

		}if (url.contains("tc2")==true) {
			idRegistro = "list-check_306";

		} if (url.contains("tp1")==true) {
			idRegistro = "list-check_281";
		}

		System.out.println(idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String valor = dataFim.getAttribute("value");

		String enviar = fechaActual();

		dataFim.clear();
		sleep(2000);
		dataFim.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		if (url.contains("tq1")==true) {

			idRegistro = "list-check_171";

		}if (url.contains("tc2")==true) {
			idRegistro = "list-check_306";

		} if (url.contains("tp1")==true) {
			idRegistro = "list-check_281";
		}

		System.out.println(idRegistro);

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar1.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String novoTexto=dataFim.getAttribute("value");

		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);


	}
}
