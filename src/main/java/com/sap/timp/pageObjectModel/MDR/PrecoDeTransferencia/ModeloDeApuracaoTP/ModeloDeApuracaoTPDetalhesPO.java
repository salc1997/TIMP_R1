package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class ModeloDeApuracaoTPDetalhesPO extends TestBaseEliel{
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\" Modelo de Apuração TP\"]")
	public WebElement modelodeapuracao;
	
	@FindBy(xpath = "//span[text()=\"Novo  Modelo de Apuração TP\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Modelo\"]")
	public WebElement modelo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//div[@id=\"type\"]/div/div/div[2]")
	public WebElement tipo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Respaldo legal\"]")
	public WebElement respaldo;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data Inicial\"]")
	public WebElement datainicial;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public ModeloDeApuracaoTPDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		modelodeapuracao.click();
		
		sleep(2000);
		
	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		primeira.click();
		
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
		
		//detalhes
		String ocorrenciadetalhes = ocorrencia.getText();
		String objetosdetalhes = objetos.getText();
		String classificacaodetalhes = classificacao.getText();
		String datainiciodetalhes = datainicio.getText();
		String datafimdetalhes = datafim.getText();
		
		
		System.out.println( ocorrenciadetalhes);
		System.out.println(objetosdetalhes);
		System.out.println(classificacaodetalhes);
		System.out.println(datainiciodetalhes);
		System.out.println(datafimdetalhes);
		
	
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
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
		
		//visualizar
		
		String ocorrenciavisualizar = ocorrenciavi.getText();
		String objetosvisualizar = objetosvi.getText();
		String classificacaovisualizar = classificacaovi.getText();
		String datainiciovisualizar = datainiciovi.getText();
		String datafimvisualizar = datafimvi.getText();
		
		
		System.out.println( ocorrenciavisualizar);
		System.out.println(objetosvisualizar);
		System.out.println(classificacaovisualizar);
		System.out.println(datainiciovisualizar);
		System.out.println(datafimvisualizar);
	
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(ocorrenciavisualizar.equals(ocorrenciadetalhes));
		sucesso.add(objetosvisualizar.equals(objetosdetalhes));
		sucesso.add(classificacaovisualizar.equals(classificacaodetalhes));
		sucesso.add( datainiciovisualizar.equals( datainiciodetalhes));
		sucesso.add(datafimvisualizar.equals(datafimdetalhes));
	
		return sucesso;
	}


}
