package com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseEliel;

public class EstornoCreditoEditarPO extends TestBaseEliel {

	
	
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Estorno de Crédito de Insumos\"]")
	public WebElement estornocredito;
	
	@FindBy (xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisa;

	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//span[text()=\"Novo Estorno de Crédito de Insumos\"]")
	public WebElement novoestorno;

	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]/div")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	//@FindBy(xpath = "//input[@placeholder=\"Preencher/Selecionar  data\"]")
	@FindBy(xpath = "//*[@id=\"validity\"]/div/div[1]/input")
	public WebElement datainicovigencia;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id]/div[10]/div")
	public WebElement data;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	public EstornoCreditoEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public void Editar() {
		//espera a página carregar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		estornocredito.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter1();
		
		System.out.println(idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		sleep(4000);
		
		String texto = data.getText();
		System.out.println(texto);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		menu.click();
		sleep(1000);
		editar.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		waitExpectElement(datainicovigencia);
		sleep(2000);
		
		//inseri aqui
		//String texto = datainicovigencia.getAttribute("value");
		//System.out.println(texto);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//limpa o campo da data
		datainicovigencia.clear();
		
		//inseri uma nova data
		
		datainicovigencia.sendKeys("30/07/2020");
		
		sleep(1000);
		gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(butaosim);
		sleep(2000);
		butaosim.sendKeys(Keys.ENTER);;
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//recarrega a pagina
		driver.navigate().refresh();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(datainicovigencia);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//String texto1= datainicovigencia.getAttribute("value");
		//System.out.println(texto1);
		
		
		//verifica se o valor inserido consta no relatório
				String texto1= datainicovigencia.getAttribute("value");
				System.out.println(texto1);
				boolean text= texto1.contains(texto1);
				System.out.println(text);
				sleep(1000);
				
				//volta com o campo modificado
				sleep(2000);
				datainicovigencia.clear();
				datainicovigencia.sendKeys(texto);
				
				//grava de novo
				gravar.click();
				sleep(1000);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				waitExpectElement(butaosim);
				sleep(2000);
				butaosim.sendKeys(Keys.ENTER);
						
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				waitExpectElement(datainicovigencia);
				sleep(2000);
	}	
	
	
	
	
	
	
	
}
