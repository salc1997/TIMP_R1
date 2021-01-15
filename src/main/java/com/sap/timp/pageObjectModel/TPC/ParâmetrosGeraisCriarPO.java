package com.sap.timp.pageObjectModel.TPC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseCristhian;

public class ParâmetrosGeraisCriarPO extends TestBaseCristhian {
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Pagamento\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Vencimento\"]")
	public WebElement dtaVencimento;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement cboTributo;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and @class=\"list-item\" and text()=\"COFINS\"]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar UF\"]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//*[@id=\"SP\"]/div[1]/label/span")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//*[@id=\"AL\"]/div[1]/label/span")
	public WebElement opcionUfTC2;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Filial\"]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//*[@id=\"1000_SP_0001\"]/div[1]/label/span")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//*[@id=\"1000_SP_0014\"]/div[1]/label/span")
	public WebElement opcionFilialTC2;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Imposto\"]")
	public WebElement cboTipoImposto;
	
	@FindBy(xpath = "//li[text()=\"DIFAL\"]")
	public WebElement opcionTipoImposto;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Detalhe Tipo Tributo\"]")
	public WebElement cboDetalheTipoTributo;
	
	@FindBy(xpath = "//li[text()=\"IMPORTAÇÃO\"]")
	public WebElement opcionDetalheTipoTributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Leiaute \"]")
	public WebElement cboLeiaute;
	
	@FindBy(xpath = "//*[@id=\"1018\"]")
	public WebElement opcionLeiaute;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Componente\"]")
	public WebElement cboComponente;
	
	@FindBy(xpath = "//li[text()=\"ADM\"]")
	public WebElement opcionComponente;

	@FindBy(xpath = "//li[text()=\"ATR\"]")
	public WebElement opcionComponenteTC2;
	
	
	@FindBy(xpath = "//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement btnCriar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public ParâmetrosGeraisCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
			System.out.println("ID Primer Registro: " + id);
		}
		
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String data = fechaManana();
		dtaVencimento.sendKeys(data);
		
		cboTributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(7000);
		
		
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		sleep(1000);
		opcionEmpresa.sendKeys(Keys. ESCAPE);
		sleep(1000);
		
		
		
		cboUf.click();
		sleep(1000);
		opcionUf.click();
		sleep(1000);
		opcionUf.sendKeys(Keys. ESCAPE);
		sleep(7000);
		
		
		
		
		
		
		if ( tp1 == true) {
			
			
			cboFilial.click();
			sleep(1000);
			opcionFilial.click();
			sleep(1000);
			opcionFilial.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			
			cboTipoImposto.click();
			sleep(1000);
			opcionTipoImposto.click();
			sleep(3000);
			
			cboDetalheTipoTributo.click();
			sleep(3000);
			opcionDetalheTipoTributo.click();
			sleep(1000);
			
			cboLeiaute.sendKeys("101 - teste");
			sleep(3000);
			cboLeiaute.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			cboComponente.click();
			sleep(3000);
			opcionComponenteTC2.click();
			sleep(3000);

		}else if(tc2 == true ) {
			
			cboFilial.click();
			sleep(1000);
			opcionFilialTC2.click();
			sleep(1000);
			opcionFilialTC2.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			
			cboTipoImposto.click();
			sleep(1000);
			opcionTipoImposto.click();
			sleep(3000);
			
			cboDetalheTipoTributo.click();
			sleep(3000);
			opcionDetalheTipoTributo.click();
			sleep(1000);
			
			cboLeiaute.sendKeys("1 - Livro de Entrada (Não Mexer)");
			sleep(3000);
			cboLeiaute.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			cboComponente.click();
			sleep(3000);
			opcionComponenteTC2.click();
			sleep(3000);
			
		}else {
			cboFilial.click();
			sleep(1000);
			opcionFilial.click();
			sleep(1000);
			opcionFilial.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			
			cboTipoImposto.click();
			sleep(1000);
			opcionTipoImposto.click();
			sleep(3000);
			
			cboDetalheTipoTributo.click();
			sleep(3000);
			opcionDetalheTipoTributo.click();
			sleep(1000);
			
			cboLeiaute.sendKeys("1017 - TEST DATOS");
			sleep(3000);
			cboLeiaute.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			cboComponente.click();
			sleep(3000);
			opcionComponente.click();
			sleep(3000);
		}
		
		
		
	
		validaDe.sendKeys("11/01/2021");
		sleep(4000);

	
		btnCriar.click();
		sleep(2000);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		System.out.println("Rows:" +rows);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		idInserir1(idultimo);

		System.out.println(id);
		System.out.println(idultimo);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idultimo);
		
		boolean sucesso = false;
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
