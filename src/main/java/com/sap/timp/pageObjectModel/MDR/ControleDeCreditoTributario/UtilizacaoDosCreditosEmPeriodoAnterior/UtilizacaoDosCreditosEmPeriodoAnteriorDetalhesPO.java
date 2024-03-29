package com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosEmPeriodoAnterior;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class UtilizacaoDosCreditosEmPeriodoAnteriorDetalhesPO extends TestBase {
	
	

	@FindBy(xpath = "//span[text()=\"Controle de Cr�dito Tribut�rio\"]")
	public WebElement controledecreditotributario;
	
	@FindBy(xpath = "//span[text()=\"Utiliza��o dos Cr�ditos em Per�odo Anterior\"]")
	public WebElement utilizacaodoscreditos;
	
	@FindBy(xpath = "//span[text()=\"Novo Utiliza��o dos Cr�ditos em Per�odo Anterior\"]")
	public WebElement novoutilozacaodoscreditos;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaotributo;
	

	@FindBy(xpath = "//div[@class=\"field\" and @id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"creditCode\"]/div/div/div[2]")
	public WebElement codigodecredito;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaocodigodecredito;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Utiliza��o\"]")
	public WebElement utilizacao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement dataincial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vig�ncia \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"detail-description\" and @class=\"detail\"][2]/div/div")
	public WebElement empresade;
	
	@FindBy(xpath = "//div[@id=\"detail-description\" and @class=\"detail\"][3]/div/div")
	public WebElement filialde;
	
	@FindBy(xpath = "//div[@id=\"detail-description\" and @class=\"detail\"][4]/div/div")
	public WebElement tributode;
	
	@FindBy(xpath = "//div[@id=\"detail-description\" and @class=\"detail\"][5]/div/div")
	public WebElement codigocreditode;
	
	@FindBy(xpath = "//div[@id=\"detail-description\" and @class=\"detail\"][6]/div/div")
	public WebElement ordemde;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"companyCode\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialvi;
	
	@FindBy(xpath = "//span[@id=\"TAX\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"creditCode\"]")
	public WebElement codigocreditovi;
	
	@FindBy(xpath = "//span[@id=\"utilizationOrder\"]")
	public WebElement ordemvi;
	
	
	@FindBy(xpath = "//span[text()=\"Editar\"]")
	public WebElement editar;
	public UtilizacaoDosCreditosEmPeriodoAnteriorDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		controledecreditotributario.click();
		sleep(2000);
		
		utilizacaodoscreditos.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("UtilizacaoDosCreditosEmPeriodoAnterior");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String empresadetalhes = empresade.getText();
		String filialdetalhes = filialde.getText();
		String tributodetalhes = tributode.getText();
		String codigodetalhes = codigocreditode.getText();
		String utilizacaodetalhes = ordemde.getText();
		
		System.out.println(empresadetalhes);
		System.out.println(filialdetalhes);
		System.out.println(tributodetalhes);
		System.out.println(codigodetalhes);
		System.out.println(utilizacaodetalhes);
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("UtilizacaoDosCreditosEmPeriodoAnterior");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar
		waitExpectedElement(editar);
		sleep(4000);
		String empresavisualizar = empresavi.getText();
		String filialvisualizar = filialvi.getText();
		String tributovisualizar = tributovi.getText();
		String codigovisualizar = codigocreditovi.getText();
		String utilizacaovisualizar = ordemvi.getText();
		
		System.out.println(empresavisualizar);
		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(codigovisualizar);
		System.out.println(utilizacaovisualizar);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresadetalhes));
		sucesso.add(filialvisualizar.equals(filialdetalhes));
		sucesso.add(tributovisualizar.equals(tributodetalhes));
		sucesso.add(codigovisualizar.equals(codigodetalhes));
		sucesso.add(utilizacaovisualizar.equals(utilizacaodetalhes));
		
		return sucesso;
	}
}
