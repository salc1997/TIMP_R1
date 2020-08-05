package com.sap.timp.pageObjectModel.MDR.TESTE;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AntecipacaoEditarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\" Antecipação\"]")
	public WebElement antecipacao;


	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;

	@FindBy(xpath = "//li/span[text()=\"Editar\"]")
	public WebElement editar;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[2]/div/div[5]")
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
		waitExpectXpath("//*[@id=\"list\"]/div/div/div[2]/div/div[5]");
		/*siguiente.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div/div[1]/div/div[1]/div");
		
		idC.click();
		dobleClickElement(idC);
		sleep(2000);
		
		*/
<<<<<<< HEAD
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter();
		//pesquisa esse id
=======
		
		String idRegistro = idObter1();
		
>>>>>>> branch 'master' of https://github.com/Katitanuma/TIMP_R1.git
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectElement(siguiente);
		sleep(4000);

		
		menu.click();
		sleep(1000);
		editar.click();

		//invisibilityOfElement("//*[@id=\"container\"]/div[4]/div/div/div/img");
		attributeToBeXpath("//div[@id=\"tributo\"]/div", "class", "base-select required");
		sleep(2000);

		String url = driver.getCurrentUrl();
		String valor = campo.getAttribute("value");

		String enviar = "30";

		campo.clear();
		sleep(1000);
		campo.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");

		driver.navigate().refresh();

		//invisibilityOfElement("//*[@id=\"container\"]/div[4]/div/div/div/img");

		//waitExpectElement(campo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//*[@id=\"uf\"]/div", "class", "base-select required");
		waitExpectElement(campo);
		
		sleep(2000);

		String nuevoTexto = campo.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);

		sleep(1000);
		campo.clear();

		sleep(1000);
		campo.sendKeys(valor);

		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		return sucesso;

	}

}
