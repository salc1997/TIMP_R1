package com.sap.timp.pageObjectModel.ADM.Configuracao.ConfiguracaoDeTributos.ConfiguracaoTributoAgrupamento;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ConfiguracaoTributoAgrupamentofiltrarPO extends TestBase {
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configura��o;
	
	@FindBy(xpath = "//span[text()=\"Configura��o de Tributos\"]")
	public WebElement Configura��odeTributos;
	
	@FindBy(xpath = "//span[text()=\"Configura��o de Tributo Agrupamento\"]")
	public WebElement Configura��odeTributosAgrupamento;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;
	
	public ConfiguracaoTributoAgrupamentofiltrarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean filtro() {

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Configura��o.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		Configura��odeTributos.click();
		sleep(3000);

		
		Configura��odeTributosAgrupamento.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("Configura��oTributoAgrupamento");
		System.out.println("ID Registro: " + idRegistro);
		
		pesquisar.sendKeys(idRegistro);
		sleep(2000);
		
		pesquisar.sendKeys(Keys. ENTER);
		sleep(2000);

		String idBusqueda = id.getText();
		System.out.println(idBusqueda + " Id Busqueda");
		
		boolean sucesso = idBusqueda.equals(idRegistro);

		
		System.out.println(sucesso);
		return sucesso;
	}
}
