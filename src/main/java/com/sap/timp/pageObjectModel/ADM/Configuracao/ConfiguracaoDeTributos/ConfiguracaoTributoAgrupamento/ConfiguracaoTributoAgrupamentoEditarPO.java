package com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ConfiguracaoTributoAgrupamentoEditarPO extends TestBase {
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement ConfiguraçãodeTributos;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributo Agrupamento\"]")
	public WebElement ConfiguraçãodeTributosAgrupamento;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Agrupamento\"]")
	public WebElement agrupamento;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public ConfiguracaoTributoAgrupamentoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Configuração.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		ConfiguraçãodeTributos.click();
		sleep(3000);

		
		ConfiguraçãodeTributosAgrupamento.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ConfiguraçãoTributoAgrupamento");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		String valorDescricao = "TESTE QA EDITADO";
	
		
		agrupamento.clear();
		agrupamento.sendKeys(valorDescricao);
		sleep(1000);
		
		btnGravar.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		
		attributoNotToBeEmpty(agrupamento, "value");
		String valorDescricaoGuardado = agrupamento.getAttribute("value");
		System.out.println("");
		System.out.println("Descricao valor guardado: " + valorDescricaoGuardado);
		  
		boolean sucesso = false;
		
		if(valorDescricaoGuardado.equals(valorDescricao)) {
			System.out.println("");
			System.out.println("Valor editado satisfactoriamente...");
			sucesso = true;
		}else {
			System.out.println("");
			System.out.println("Error al prencher descricao...");
		}
		
		return sucesso;
	}

}
