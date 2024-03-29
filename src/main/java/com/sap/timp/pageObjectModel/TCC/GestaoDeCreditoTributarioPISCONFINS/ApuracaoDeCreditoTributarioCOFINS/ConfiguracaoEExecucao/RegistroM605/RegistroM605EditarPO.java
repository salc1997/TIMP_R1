package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM605;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class RegistroM605EditarPO extends TestBase{
	
	@FindBy(xpath = "//span[text()=\"Gest�o de Cr�dito Tribut�rio PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apura��o de Cr�dito Tribut�rio COFINS\"]")
	public WebElement apuracaocreditocofins;
	

	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\" and @tabindex=\"0\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM605\"]")
	public WebElement registroM605;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Indicador de natureza da reten��o na Fonte \"]")
	public WebElement indicador1;
	
	@FindBy(xpath = "//div[@id=\"indNatRet\"]/div/div[2]")
	public WebElement indicador;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar N�mero do campo\"]")
	public WebElement campo;

	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;


	
	public RegistroM605EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {

		String url = driver.getCurrentUrl();
		
		boolean tp1 = false;
		
		if (url.contains("tp1")) {
			tp1= true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuracaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM605.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("GestaoCreditoTributarioCOFINSRegistroM605");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectedElement("//div[@id=\"company\"]/div/div[1]/div[2]");
		waitExpectedElement("//div[@id=\"branch\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		waitExpectedElement("//div[@id=\"uf\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String enviar = "11";

		campo.clear();
		sleep(1000);
		campo.sendKeys(enviar);
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		waitExpectedElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		refresh();
		
		sleep(2000);
		waitExpectedElement("//div[@id=\"company\"]/div/div[1]/div[2]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCampoE = campo.getAttribute("value");
		System.out.println("O texto do campo ap�s a edi��o �: " +textoCampoE);
		
		boolean sucesso = textoCampoE.equals(enviar);
		
		System.out.println("O registro foi editado com sucesso: " +sucesso);
		

		return sucesso;	
	}

}
