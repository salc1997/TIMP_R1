package com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ConfiguraçãodeBancodeCréditoTributárioExcluirPO extends TestBase {
	
	@FindBy(xpath = "//span[text()=\"Banco de Crédito Tributário\"]")
	public WebElement BancoCréditoTributário;

	
	@FindBy(xpath = "//span[text()=\"Configuração de Banco de Crédito Tributário\"]")
	public WebElement configuracion;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;

	@FindBy(xpath = "//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement btnCriar;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Leiaute \"]")
	public WebElement cboLeiaute;
	
	@FindBy(xpath = "//*[@id=\"1018\"]")
	public WebElement opcionLeiaute;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement btnNo;
	
	
	public ConfiguraçãodeBancodeCréditoTributárioExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	

	public boolean excluir() {
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElement(driver.findElement(By.xpath("//span[text()=\"Estorno de Crédito\"]")));
		sleep(2000);
		
		BancoCréditoTributário.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracion.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);sleep(2000);
		
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		//String idRegistro = idObter1();
		String idRegistro = idObter("idBCT-ConfiguracaoDeBancoDeCreditoTributario");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectedElement(btnSim);
		btnSim.click();
		sleep(16000);
		
		btnNo.click();
		sleep(2000);
	
		
		sleep(35000);
		
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		System.out.println("Rows:" +rows);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		
	
		System.out.println("ID Primer Registro despues de eliminar: " + idultimo);
		
		int id1 = convertToInt(idRegistro);
		int id2 = convertToInt(idultimo);
		
		
		  
		boolean sucesso = false;
		
		if(id2 != id1) {
			System.out.println("");
			System.out.println("Valor eliminado satisfactoriamente...");
			sucesso = true;
		}else {
			System.out.println("");
			System.out.println("Error al eliminar registro...");
		}
		
		return sucesso;
	}

}
