package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInforma�oesDeValores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class AjusteEInforma�oesDeValoresDetalhesPO extends TestBaseEliel {
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"5.3 Ajustes e Informa��o de Valores Provenientes de Documento Fiscal\"]")
	public WebElement ajusteeinformacao;
	
	@FindBy(xpath = "//span[text()=\"Novas configura��es e informa��es de Valores  \"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o C�digo Ajuste de Informa��es de Valores\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher a descri��o do Ajustes e Informa��es de Valores Provenientes de Documento Fiscal\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vig�ncia \"]")
	public WebElement datadeiniciodevigencia;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//span[text()=\"Novo Valor Declarat�rio\"]")
	public WebElement novovalor;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o C�digo de Valores Declarat�rios\"]")
	public WebElement codigodevalores;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Reflexo na Apura��o ICMS\"]")
	public WebElement icms;
	
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
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public AjusteEInforma�oesDeValoresDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public String detalhes() {
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
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter1();
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		System.out.println(sucesso);	
		return sucesso;	
		
		
	}
	
	

}
