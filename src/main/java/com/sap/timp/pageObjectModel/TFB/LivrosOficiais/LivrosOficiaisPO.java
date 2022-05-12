package com.sap.timp.pageObjectModel.TFB.LivrosOficiais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class LivrosOficiaisPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//div[contains(@class,\"eft-tabs\")][1]//child::div[@class=\"baseTabs-box  \"][3]")
	public WebElement livros;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/child::div[1]/div[2]")
	public WebElement flecha;

	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-wrapper\"]//child::span[text()=\"Livro ICMS\"]")
	public WebElement livrosICMS;
	
	@FindBy(xpath = "//button/span[text()=\"Executar Livro ICMS\"]")
	public WebElement executarLivrosICMS;
	
	@FindBy(xpath = "//div[@id=\"company\"]//child::div[contains(@class,\"icon\")]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"1000\"]")
	public WebElement empresaOPC;

	@FindBy(xpath = "//div[@id=\"state\"]//child::div[contains(@class,\"icon\")]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@id=\"RJ\"]")
	public WebElement estadoOPC;
	
	@FindBy(xpath = "//div[@id=\"branch\"]//child::div[contains(@class,\"icon\")]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"0001\"]")
	public WebElement filialOPC;
	
	//EXECUTAR
	@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\")]")
	public WebElement paginaAnterior;
		
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement ano2016;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement jan;
	
	
	@FindBy(xpath = "//span[text()=\"1M\"]")
	public WebElement m1;
	
	@FindBy(xpath = "//div[contains(@class,\"base-dialog\")]//child::button[2]")
	public WebElement executar;
	
	@FindBy(xpath = "//div[@class=\"bar-container boxes\"]//child::span[text()=\"Entradas\"]")
	public WebElement entradas;
	
	@FindBy(xpath = "//div[@class=\"bar-container boxes\"]//child::span[text()=\"Saidas\"]")
	public WebElement saidas;
	
	@FindBy(xpath = "//div[@class=\"bar-container boxes\"]//child::span[contains(text(),\"Resumo\")]")
	public WebElement resumo;
	
	@FindBy(xpath = "//div[@class=\"bar-container boxes\"]//child::span[contains(text(),\"Informações \")]")
	public WebElement informações;
	
	@FindBy(xpath = "//div[@class=\"bar-container boxes\"]//child::span[contains(text(),\"Detalhes\")]")
	public WebElement detalhes;
	
	@FindBy(xpath = "//button/span[text()=\"Oficializar\"]")
	public WebElement oficializar;
	
	@FindBy(xpath = "//div[@id=\"bookName\"]//child::input")
	public WebElement NomeLivro;
	
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[2]")
	public WebElement gravar;
	
	@FindBy(xpath = "//div[@class=\"inner-text\"]")
	public WebElement aviso;
	
	@FindBy(xpath = "//div[contains(@class,\"small ui-draggable\")]//child::div[@class=\"dialog-buttons\"]/button[2]")
	public WebElement sim;

	//----- Livros ICMS- ST
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-wrapper\"]//child::span[text()=\"Livro ICMS-ST\"]")
	public WebElement livrosICMSST;
	
	@FindBy(xpath = "//button/span[text()=\"Executar Livro ICMS-ST\"]")
	public WebElement executarLivrosICMSST;
	
	@FindBy(xpath = "//div[@id=\"SP\"]")
	public WebElement estadoOPCLivrosICMSST;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensajeLivro;
	
	@FindBy(xpath = "//div[contains(@class,\"base-dialog\")]//child::button[1]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	//----- Livros IPI
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-wrapper\"]//child::span[text()=\"Livro IPI\"]")
	public WebElement livrosIPI;
	
	@FindBy(xpath = "//button/span[text()=\"Executar Livro IPI\"]")
	public WebElement executarLivrosIPI;
	
	//----- Livros ICMS DIFAL
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-wrapper\"]//child::span[text()=\"Livro ICMS DIFAL/E300\"]")
	public WebElement livrosICMSDIFAL;
	
	@FindBy(xpath = "//button/span[text()=\"Executar Livro ICMS DIFAL/E300\"]")
	public WebElement executarLivrosICMSDIFAL;
	
	@FindBy(xpath = "//div[@class=\"bar-container boxes active\"]//child::span[text()=\"Entradas - Origem\"]")
	public WebElement entradasOrigen;
	
	@FindBy(xpath = "//div[@class=\"bar-container boxes active\"]//child::span[text()=\"Saidas - Origem\"]")
	public WebElement saidasOrigen;
	
	@FindBy(xpath = "//div[@class=\"bar-container boxes active\"]//child::span[text()=\"Resumo da Apuração do Imposto - Origem\"]")
	public WebElement resumoOrigen;
	
	@FindBy(xpath = "//div[@class=\"bar-container boxes active\"]//child::span[text()=\"Informações Complementares - Origem\"]")
	public WebElement informaçõesOrigen;
	
	@FindBy(xpath = "//div[@class=\"bar-container boxes active\"]//child::span[text()=\"Detalhes dos ajustes - Origem\"]")
	public WebElement detalhesOrigen;
	
	public  LivrosOficiaisPO() {

		PageFactory.initElements(driver, this);
	}
	
	public  boolean  livros() {

		sleep(1000);
		
		while (!livros.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		livros.click();
	
		sleep(3000);
		
		
		boolean sucesso = livrosICMS.isDisplayed();
		
	   sleep(3000);
	   System.out.println("Presenta Livros ICMS: "+sucesso);
	   
	   return sucesso;		
	}
	
	public  ArrayList<Boolean>  livrosICMS() {
		
		livrosICMS.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		executarLivrosICMS.click();
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		empresaOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(empresa);
		sleep(1000);
		
		
		estado.click();
		sleep(1000);
		estadoOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(estado);
		sleep(1000);
		
		filial.click();
		sleep(1000);
		filialOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
		periodo.click();
		sleep(2000);
		paginaAnterior.click();
		sleep(2000);
		ano2016.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		jan.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		m1.click();
		sleep(1000);
		
		executar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		//&& !saidas.isDisplayed() && !resumo.isDisplayed() && !informações.isDisplayed() && !detalhes.isDisplayed()
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add( entradas.isDisplayed());
		sucesso.add( saidas.isDisplayed());
		sucesso.add(resumo.isDisplayed());
		sucesso.add( informações.isDisplayed());
		sucesso.add( detalhes.isDisplayed());
		        
		System.out.println("Presenta Entradas & salidas: "+sucesso);
		
		oficializar.click();
		sleep(1000);
		
		String txtNomeLivro = NomeLivro.getAttribute("value");
		
		System.out.println("Nome do Livro "+txtNomeLivro);
		
		gravar.click();
		sleep(1000);
		
		String txtAviso = aviso.getText();
		System.out.println("Nome do Livro "+txtAviso);
		
		String txtAvisoCaso = "Ao oficializar esse período (01/2016) todos os períodos mensais de 01/2016 até 05/2022 terão que ser oficializados novamente para que o mês corrente 05/2022 seja oficializado . Tem certeza de que deseja continuar?";
		
		sucesso.add(txtAvisoCaso.equals(txtAviso));
		
		sim.click();
		sleep(1000);
		
		sucesso.add( executarLivrosICMS.isDisplayed());
		System.out.println("Retorno a Biblioteca: "+sucesso);
		
		return sucesso;		
	}
	   
	public  ArrayList<Boolean>   LivrosICMSST() {
		
		livrosICMSST.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);  
		
		executarLivrosICMSST.click();
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		empresaOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(empresa);
		sleep(1000);
		
		
		estado.click();
		sleep(1000);
		estadoOPCLivrosICMSST.click();
		sleep(1000);
		closeSelectTypeCheckbox(estado);
		sleep(1000);
		
		filial.click();
		sleep(1000);
		filialOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
		periodo.click();
		sleep(2000);
		paginaAnterior.click();
		sleep(2000);
		ano2016.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		jan.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		m1.click();
		sleep(1000);
		
		executar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String txtMensajeLivro = mensajeLivro.getText();
		
		System.out.println("Mensaje de Livros "+ txtMensajeLivro);
		
		String  txtMensajeEsperado= "Livro executado con éxtio ";
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(txtMensajeLivro.equals( txtMensajeEsperado));
		
		System.out.println("--Livros ICMS-ST--: "+sucesso);
		sleep(1000);
		
		cancelar.click();
		sleep(1000);
		
		biblioteca.click();
		sleep(1000);
		
		return sucesso;
	}
	
	public  void  LivrosIPI() {
		
		livrosIPI.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);  
		
		executarLivrosIPI.click();
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		empresaOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(empresa);
		sleep(1000);
		
		
		estado.click();
		sleep(1000);
		estadoOPCLivrosICMSST.click();
		sleep(1000);
		closeSelectTypeCheckbox(estado);
		sleep(1000);
		
		filial.click();
		sleep(1000);
		filialOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
		periodo.click();
		sleep(2000);
		paginaAnterior.click();
		sleep(2000);
		ano2016.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		jan.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		m1.click();
		sleep(1000);
		
		executar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add( entradas.isDisplayed());
		sucesso.add( saidas.isDisplayed());
		sucesso.add(resumo.isDisplayed());
		sucesso.add( informações.isDisplayed());
		sucesso.add( detalhes.isDisplayed());
		        
		System.out.println("Presenta Entradas & salidas: "+sucesso);
	}
	
	public  void  LivroICMSDIFAL() {
		
		livrosICMSDIFAL.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);  
		
		executarLivrosICMSDIFAL.click();
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		empresaOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(empresa);
		sleep(1000);
		
		
		estado.click();
		sleep(1000);
		estadoOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(estado);
		sleep(1000);
		
		filial.click();
		sleep(1000);
		filialOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
		periodo.click();
		sleep(2000);
		paginaAnterior.click();
		sleep(2000);
		ano2016.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		jan.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		m1.click();
		sleep(1000);
		
		executar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add( entradasOrigen.isDisplayed());
		sucesso.add( saidasOrigen.isDisplayed());
		sucesso.add(resumoOrigen.isDisplayed());
		sucesso.add( informaçõesOrigen.isDisplayed());
		sucesso.add( detalhesOrigen.isDisplayed());
		        
		System.out.println("Presenta Entradas & salidas: "+sucesso);

		oficializar.click();
		sleep(1000);
		
		String txtNomeLivroICMSDIFAL = NomeLivro.getAttribute("value");
		
		System.out.println("Nome do Livro: "+txtNomeLivroICMSDIFAL);
		
		gravar.click();
		sleep(1000);
		
		String txtAviso = aviso.getText();
		System.out.println("Nome do Livro "+txtAviso);
		
		String txtAvisoCaso = "Ao oficializar esse período (01/2016) todos os períodos mensais de 01/2016 até 05/2022 terão que ser oficializados novamente para que o mês corrente 05/2022 seja oficializado . Tem certeza de que deseja continuar?";
		
		sucesso.add(txtAvisoCaso.equals(txtAviso));
		
		sim.click();
		sleep(1000);
	}
}


