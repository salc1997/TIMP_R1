package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class AjusteEInformaçoesDeValoresExcluirPO extends TestBaseEliel{
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"5.3 Ajustes e Informação de Valores Provenientes de Documento Fiscal\"]")
	public WebElement ajusteeinformacao;
	
	@FindBy(xpath = "//span[text()=\"Novas configurações e informações de Valores  \"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código Ajuste de Informações de Valores\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher a descrição do Ajustes e Informações de Valores Provenientes de Documento Fiscal\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datadeiniciodevigencia;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//span[text()=\"Novo Valor Declaratório\"]")
	public WebElement novovalor;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código de Valores Declaratórios\"]")
	public WebElement codigodevalores;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Reflexo na Apuração ICMS\"]")
	public WebElement icms;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//li[text()=\"Teste  Automatizado\"]")
	public WebElement usuariotd1;
	
	@FindBy(xpath = "//li[text()=\"TESTE AUTOMATIZADO\"]")
	public WebElement usuariotq1;

	@FindBy(xpath = "//li[text()=\"TESTEAUTOMATIZADO TESTEAUTOMATIZADO\"]")
	public WebElement usuariotp1;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]/span[2]")
	public WebElement filtrosavancados;
	
	@FindBy(xpath = "//div[@id=\"creationIdUser\" and @class=\"library-advanced-filter-item\"]/div/div/div[2]")
	public WebElement filtrousuariocriacao;
	
	public AjusteEInformaçoesDeValoresExcluirPO() {

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
		
		ajusteeinformacao.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		aceitar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtrosavancados.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtrousuariocriacao.click();
		
		if (  tq1 == true) {
			usuariotq1.click();
		}else if(tc2 == true || tp1 == true ) {
			usuariotp1.click();
		}else {
			usuariotd1.click();
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		boolean sucesso = nenhumResult.isDisplayed();
		return sucesso;
	
		
		
		
	}
	
	

}
