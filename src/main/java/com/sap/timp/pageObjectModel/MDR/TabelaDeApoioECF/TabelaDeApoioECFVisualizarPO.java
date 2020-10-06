package com.sap.timp.pageObjectModel.MDR.TabelaDeApoioECF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class TabelaDeApoioECFVisualizarPO extends TestBaseEliel{
	
	@FindBy(xpath = "//ul/li[contains(@identifier,\"supportParameterECF\") and @tabindex=\"0\"]")
	public WebElement tabelaecf;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
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
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tabela ECF \"]")
	public WebElement tabela;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Descrição da Tabela ECF\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Versão Leiaute \"]")
	public WebElement versaoleiaute;
	

	@FindBy(xpath = "//span[@id=\"table-ecf\"]")
	public WebElement tabelavi;
	
	@FindBy(xpath = "//span[@id=\"description-ecf\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"idLayout\"]")
	public WebElement leautivi;
	
	
	public TabelaDeApoioECFVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		tabelaecf.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		//visualizar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(tabelavi);
		sleep(2000);
		//visualizar
		
		String tabelavisualizar = tabelavi.getText();
		String descricaovisualizar = descricaovi.getText();
		String leautivisualizar = leautivi.getText();
	
		
		
		System.out.println( tabelavisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(leautivisualizar);
	
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
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
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String tabelaeditar=tabela.getAttribute("value");
		String descricaoeditar=descricao.getAttribute("value");
		String leautieditar=versaoleiaute.getAttribute("value");
		
	
		System.out.println( tabelaeditar);
		System.out.println(descricaoeditar);
		System.out.println(leautieditar);
	
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(tabelavisualizar.equals(tabelaeditar));
		sucesso.add(descricaovisualizar.equals(descricaoeditar));
		sucesso.add(leautivisualizar.equals(leautieditar));

		return sucesso;	

	
	}	
	

}
