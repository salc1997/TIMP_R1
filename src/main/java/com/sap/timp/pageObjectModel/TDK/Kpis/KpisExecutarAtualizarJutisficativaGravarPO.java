package com.sap.timp.pageObjectModel.TDK.Kpis;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class KpisExecutarAtualizarJutisficativaGravarPO extends TestBaseEliel{
	

	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//span[text()=\"Execuções\"]")
	public WebElement execucoes;
	
	@FindBy(xpath = "//span[text()=\"Execuções Públicas\"]")
	public WebElement execucoespublicas;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Widget\"]")
	public WebElement adicionarwidget;
	
	@FindBy(xpath = "//button[text()=\"Criar Widget\"]")
	public WebElement criarwidget;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Cabeçalho\"]")
	public WebElement cabecalho;
	
	@FindBy(xpath = "//div[@id=\"select-group\"]/div/div[2]")
	public WebElement grupoestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupo;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupotp1;
	
	@FindBy(xpath = "//div[@id=\"select-structure\"]/div/div[2]")
	public WebElement estruturadedados;
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestrutura;
	
	
	@FindBy(xpath = "//span[text()=\"Conteúdo\"]")
	public WebElement conteudo;
	
	@FindBy(xpath = "//div[@id=\"type\"]/div/div/div[2]")
	public WebElement colunas;
	
	@FindBy(xpath = "//li[@id][text()=\"Campos\"]")
	public WebElement opcaocolunas;
	
	@FindBy(xpath = "//div[@id=\"fields\"]/div/div[2]")
	public WebElement campos;
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS\"]")
	public WebElement opcaocampos;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//div[@id=\"indicator-card-container\"]")
	public WebElement cartaoindicador;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement executarElement;
	
	@FindBy(xpath = "//span[text()=\"Atualização\"]")
	public WebElement atualizacao;
	
	@FindBy(xpath = "//div[@class=\"widgets actualizate-select\"]/div/div/div[2]")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@class=\"list-option selectAll\"]/div/div[2]")
	public WebElement opcaonome;
	
	@FindBy(xpath = "//div[@class=\"timeType actualizate-select\"]/div/div/div[2]")
	public WebElement tipo;
	
	@FindBy(xpath = "//li[@id][text()=\"Segundos\"]")
	public WebElement opcaotipo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher a Periodicidade\"]")
	public WebElement periodicidade;
	
	@FindBy(xpath = "//span[text()=\"Pare a Atualização\"]")
	public WebElement pararatualizacao;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement justificativa;
	
	@FindBy(xpath = "//button[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	public KpisExecutarAtualizarJutisficativaGravarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> CartaoIndicador() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		execucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		execucoespublicas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		String idultimoexecucoes = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		
		kpis.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter2();
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		executar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cartaoindicador);
		sleep(2000);
		
		executarElement.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		fechar.click();
		sleep(2000);
		atualizacao.click();
		
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		nome.click();
		sleep(2000);
		opcaonome.click();
		sleep(2000);
		closeSelectTypeCheckbox(nome);
		tipo.click();
		sleep(2000);
		opcaotipo.click();
		sleep(2000);
		periodicidade.sendKeys("15");
		sleep(2000);
		Aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(15000);
		
		pararatualizacao.click();
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int cartaoindicador = driver.findElements(By.xpath("//div[@class=\"indicator-card base-card rounded all-border default-border-color default-card-color handler\"]")).size();
		
		if(cartaoindicador == 0)
		{
			System.out.println("Cartao indicador foi removido");
			sucesso.add(false);
		}else {
			System.out.println("Cartao indicador consta na pagina de edicao");
			sucesso.add(true);
		}
		/*
		Gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(mensagemsalvo);
		sleep(2000);
		if(mensagemsalvo.isDisplayed() && cartaoindicador > 0)
		{
			System.out.println("foi salva com sucesso e o cartao consta na pagina de edicao");
			sucesso.add(true);
		}else {
			System.out.println("Nao foi salva com sucesso e o cartao não consta na pagina de edicao");
			sucesso.add(false);
			
		}
		
		*/
		System.out.println(sucesso);
		return sucesso;
	}

}
