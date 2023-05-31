package com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.CadastroMotivosReabertura;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class CadastroMotivosReaberturaEditarPO extends TestBase {

	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância de Tarefa por Motivo de Reabertura\"]")
	public WebElement determinacaoRelevancia;
	
	@FindBy(xpath = "//span[text()=\"Cadastro de Motivos de Reabertura\"]")
	public WebElement motivoReabertura;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//input[contains(@placeholder,\"descrição\")]")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	public CadastroMotivosReaberturaEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {

		sleep(2000);
		determinacaoRelevancia.click();
		sleep(2000);
		motivoReabertura.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("CadastroMotivosReabertura");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributoNotToBeEmpty(campo, "value");
		
		
		sleep(2000);

		String valor = campo.getAttribute("value");

		String enviar = "Teste Editar";

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
		attributoNotToBeEmpty(campo, "value");
		waitExpectedElement(campo);
		
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
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		waitExpectedElement("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		return sucesso;

	}

}
