package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracaoEExecucaoPainelCreditoICMSVisualizarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-creditPanelIcmsConfiguration\"]")
	public WebElement painelCréditoICMS;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]")
	public WebElement filialInput;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/div[1]")
	public WebElement empresaInput;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div[1]/div/input")
	public WebElement componenteInput;
	
	@FindBy(xpath = "//div[@id=\"layout\"]/div/div/input")
	public WebElement LeiuteInput;
	
	public ConfiguracaoEExecucaoPainelCreditoICMSVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void visualizar() {
		
		gestaoCredito.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracaoEExecucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		painelCréditoICMS.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		String idRegistro = idObter4();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectElement(componenteInput);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String empresaV = empresaInput.getText();
		String filialV = filialInput.getText();
		String componenteV =componenteInput.getAttribute("value");
		String LeiuteV =LeiuteInput.getAttribute("value");
		
		System.out.println("---------------Informação no Visualizar-----------------");
		System.out.println(empresaV);
		System.out.println(filialV);
		System.out.println(componenteV);
		System.out.println(LeiuteV);
	}
}
