package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class CodigoTipoCreditoExcluirPO extends TestBaseEliel {
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"4.3.6 Tabela Código de Tipo de Crédito\"]")
	public WebElement tipoCredito;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Código de Tipo de Crédito\"]")
	public WebElement novo;
	
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//li[text()=\"ICMS\" and @id]")
	public WebElement tributoO;
	@FindBy(xpath = "//div[@id=\"creditTypeCode\"]/div/div/input")
	public WebElement codigo;
	@FindBy(xpath = "//div[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"validityFrom\"]/div/div/input")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;
	
	@FindBy(xpath ="//*[@id=\"list\"]/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[4]")
	public WebElement excluir;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]/span[2]")
	public WebElement filtrosavancados;
	
	@FindBy(xpath = "//div[@class=\"library-advanced-filter-item\"][4]/div/div/div[2]")
	public WebElement filtrousuario;
	
	@FindBy(xpath = "//li[@id][3]")
	public WebElement usuario;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement usuariotc2tp1;
	
	@FindBy(xpath = "//li[@id][6]")
	public WebElement usuariotq1;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	
	public CodigoTipoCreditoExcluirPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean excluir() {
		
		
String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		
		
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		tipoCredito.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		idC.click();
		sleep(1000);
		
		dobleClickElement(idC);
			
		String id = idR.getText();
		//System.out.println(id);
	
		opcao.click();
		
		engrenagem.click();
		
		sleep(2000);
		excluir.click();

		sleep(2000);
		aceitar.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtrosavancados.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtrousuario.click();
		
		sleep(2000);
		if (tc2 == true || tp1 == true ) {
			usuariotc2tp1.click();
		}else if (tq1 == true){
			usuariotq1.click();
		}else {
			usuario.click();
		}
		//usuario.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = nenhumResult.isDisplayed();
		System.out.println(sucesso);
		return sucesso;

	
	}
	
	

}
