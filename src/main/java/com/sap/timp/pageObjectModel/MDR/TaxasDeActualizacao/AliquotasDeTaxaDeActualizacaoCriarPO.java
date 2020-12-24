package com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.MDR.RegistroDeExporta�ao.RegistroDeExporta�aoCriarPO;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator.ForTotal;

public class AliquotasDeTaxaDeActualizacaoCriarPO extends TestBaseCristhian {
	
	
	@FindBy(xpath = "//span[text()=\"Taxas de Atualiza��o\"]")
	public WebElement taxasActualizacao;
	
	@FindBy(xpath = "//span[text()=\"Al�quotas de Taxa de Atualiza��o\"]")
	public WebElement aliquotas;
	
	@FindBy(xpath = "//button/span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"C�digo\")]")
	public WebElement codigo;
	
	@FindBy(xpath = "//*[@id=\"form-builder\"]/div/div[2]/table/tr[1]/td[2]/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement valor;
	
	@FindBy(xpath = "//*[@id=\"form-builder\"]/div/div[2]/table/tr[3]/td[1]/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement valorPeriodo;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Prencher o Fator Acumulado\")]")
	public WebElement fatorAcum;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Prencher a Taxa\")]")
	public WebElement taxa;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a In�cio da Taxa\")]")
	public WebElement inicioTaxa;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Fim da Taxa\")]")
	public WebElement finTaxa;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Data de Divulga��o da Taxa\")]")
	public WebElement dataDivulgacion;	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Data de Atualiza��o da Taxa\")]")
	public WebElement dataActualizacion;	

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public AliquotasDeTaxaDeActualizacaoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		taxasActualizacao.click();
		sleep(2000);
		aliquotas.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigo.sendKeys("7107");
		sleep(1000);
		
		valor.sendKeys("987");
		sleep(1000);
		
		fatorAcum.sendKeys("765");
		sleep(1000);
		
		taxa.sendKeys("432");
		sleep(1000);
		
		valorPeriodo.sendKeys("3318");
		sleep(1000);
		
		String data = fechaActual();
		inicioTaxa.sendKeys(data);
		sleep(1000);
		
		String data1 = fechaManana();
		finTaxa.sendKeys(data1);
		sleep(1000);
		
		String data2 = fechaManana();
		dataDivulgacion.sendKeys(data2);
		sleep(1000);
		
		String data3 = fechaManana();
		dataActualizacion.sendKeys(data3);
		sleep(1000);
		
		

		
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer Totalfila = rows;
		Totalfila = rows - 1;
		Integer rFinal = 0; 
		rFinal = rows - Totalfila;
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rFinal+"]/div[3]/div")).getText();
		idInserir3(idB);
		sleep(2000);
		System.out.println("ID: "+id);
		System.out.println("IDB: "+idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado � realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
	}
		


}
