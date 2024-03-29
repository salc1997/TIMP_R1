package com.sap.timp.pageObjectModel.MDR.LimiteCompetencia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class LimiteCompetenciaEditarPO extends TestBase {

	@FindBy(xpath = "//span[text()=\"Limite de Compet�ncia\"]")
	public WebElement limiteCompetencia;


	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//input[contains(@placeholder,\"in�cio\")]")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	public LimiteCompetenciaEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {


		sleep(2000);
		limiteCompetencia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("LimiteCompetencia");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(8000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
/*
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-MultipleSelect3 required");
		attributeToBeXpath("//div[@id=\"process-type\"]/div", "class", "base-select required");
		attributeToBeXpath("//div[@id=\"approval-level\"]/div", "class", "base-select required");
		attributeToBeXpath("//div[@id=\"value-from\"]/div/div", "class", "base-input  required type1");
		attributeToBeXpath("//div[@id=\"value-to\"]/div/div", "class", "base-input  required type1");
		*/
		sleep(8000);

		String valor = campo.getAttribute("value");

		String enviar = fechaAyer();

		campo.clear();
		sleep(1000);
		campo.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);

		waitExpectedElement("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");

		driver.navigate().refresh();
/*
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-MultipleSelect3 required");
		attributeToBeXpath("//div[@id=\"process-type\"]/div", "class", "base-select required");
		attributeToBeXpath("//div[@id=\"approval-level\"]/div", "class", "base-select required");
		attributeToBeXpath("//div[@id=\"value-from\"]/div/div", "class", "base-input  required type1");
		attributeToBeXpath("//div[@id=\"value-to\"]/div/div", "class", "base-input  required type1");
		*/
		sleep(10000);
		sleep(10000);
		sleep(10000);
		
		String nuevoTexto = campo.getAttribute("value");

		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);


		System.out.println(sucesso);
		return sucesso;

	}

}
