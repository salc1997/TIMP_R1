package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class Observa�oesdoDocumentoFiscalEditarPO extends TestBaseEliel{
	
	
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"Observa��es do Documento Fiscal - Registro 0460\"]")
	public WebElement observacoesdocumento;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//span[text()=\"Novo Valor Declarat�rio\"]")
	public WebElement novovalor;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o C�digo de Valores Declarat�rios\"]")
	public WebElement codigodevalores;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher a descri��o do Informa��o Adicional\"]")
	public WebElement descricao;
	
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
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;
	
	
	public Observa�oesdoDocumentoFiscalEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public void editar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		observacoesdocumento.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter1();
		//pesquisa esse id
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		opcao.click();
		
		sleep(2000);
		
		engrenagem.click();
	}	
	
	

}
