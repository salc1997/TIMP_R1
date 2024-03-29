package com.sap.timp.pageObjectModel.MDR.Antecipacao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class AntecipacaoEditarPO extends TestBase {

	@FindBy(xpath = "//span[text()=\" Antecipa��o\"]")
	public WebElement antecipacao;


	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//*[@id=\"percAntecipacao\"]/div/div/input")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	public AntecipacaoEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {

		antecipacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		String idRegistro = idObter("antecipacao");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();

		waitExpectedElement("//div[@id=\"empresa\"]/div/div/div/div/div");
		waitExpectedElement("//div[@id=\"uf\"]/div/div/div/div/div");
		waitExpectedElement("//div[@id=\"filial\"]/div/div/div/div/div");
		sleep(2000);

		String valor = campo.getAttribute("value");
		System.out.println("Valor antes da edi��o: " +valor);
		String enviar = "30";

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

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectedElement("//div[@id=\"empresa\"]/div/div/div/div/div");
		waitExpectedElement("//div[@id=\"uf\"]/div/div/div/div/div");
		waitExpectedElement("//div[@id=\"filial\"]/div/div/div/div/div");
		waitExpectedElement(campo);
		
		sleep(2000);

		String nuevoTexto = campo.getAttribute("value");
		System.out.println("Valor ap�s edi��o: " +nuevoTexto);

		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println("Valor editado com sucesso: "+sucesso);


		
		return sucesso;

	}

}
