package com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroFornecedor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class CadastroFornecedorEditarPO extends TestBase {

	
	@FindBy(xpath = "//span[text()=\"Par�metros de Cria��o de Nota Fiscal\"]")
	public WebElement parametrosCriacaoNotaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Cadastro de Fornecedor\"]")
	public WebElement cadastroFornecedor;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//input[contains(@placeholder,\"Inicial\")]")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	public CadastroFornecedorEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {


		sleep(2000);
		parametrosCriacaoNotaFiscal.click();
		sleep(2000);
		cadastroFornecedor.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String idRegistro = idObter("CadastroFornecedor");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

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
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		//driver.navigate().refresh();
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);		
		waitExpectedElement(campo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);


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
