package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;

public class RelatorioRefinariaGeradosGerarAjustesPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Executar Ajustes\"]")
	public WebElement btnExecutarAjustes;
	
	@FindBy(xpath = "//button[text()=\"Criar/Atualizar\"]")
	public WebElement btnCriarActualizar;
	
	@FindBy(xpath = "//div[@class=\"overlay dark\"][2]/div/div/button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//div[@class=\"overlay dark\"][1]/div/div/button[text()=\"Fechar\"]")
	public WebElement btnFechar2;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement btnHome;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-tax_01\"]")
	public WebElement icmsST;
	
	@FindBy(xpath = "//button[@id=\"advancedFiltersBtn\"]")
	public WebElement btnFiltrosAvancados;
	
	@FindBy(xpath = "//div[@id=\"creationUser\"]/div/div[2]")
	public WebElement cboUsuarioDeCriacao;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item visible\" and text()=\"TESTE AUTOMATIZADO\"]")
	public WebElement opcionUsuarioCriacao;
	
	@FindBy(xpath = "//div[@id=\"creationDate\"]/div/div[1]/span")
	public WebElement inputDataDeCriacao;
	
	@FindBy(xpath = "//body/div[@class=\"range-popup-wrapper large\"]/div[2]/div[@class=\"footer-wrapper\"]")
	public WebElement btnAplicar;
	
	public RelatorioRefinariaGeradosGerarAjustesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void gerarAjustes() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String url = driver.getCurrentUrl();
		String idRegistro = "0";
		
		if(url.contains("tq1")) {
			idRegistro = "24";
		}
		
		if(url.contains("tc2")) {
			idRegistro = "9";
		}
		
		System.out.println("ID: " + idRegistro);
		
		WebElement marcarCheckBox = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[2]/label/span"));
		marcarCheckBox.click();
		sleep(1000);
		
		btnExecutarAjustes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]/div[@class=\"base-loader-container\"]/div/div");
		sleep(3000);
		
		btnCriarActualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]/div[@class=\"base-loader-container\"]/div/div");
		sleep(3000);
		
		waitExpectElement(btnFechar);
		btnFechar.click();
		sleep(1000);
		btnFechar2.click();
		sleep(1000);
		
		btnHome.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		AcessarTAAPO acessarTAA = new AcessarTAAPO();
		acessarTAA.acessarTAA();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		icmsST.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnFiltrosAvancados.click();
		sleep(2000);
		
		cboUsuarioDeCriacao.click();
		sleep(1000);
		opcionUsuarioCriacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
//		Calendar c1 = Calendar.getInstance();
//		String dia = Integer.toString(c1.get(Calendar.DATE));
//		System.out.println("DIA ACTUA: " + dia);
//		
//		WebElement fecha = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[@class=\"dates-wrapper\"]/div[contains(@class, \"date\") and @tabindex=\"0\" and text()=\""+dia+"\"]"));
//		fecha.click();
		
		inputDataDeCriacao.click();
		sleep(1000);
		
		btnAplicar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
	}
}
