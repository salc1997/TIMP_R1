package com.sap.timp.pageObjectModel.MDR.SCANC.OPPropiasRessarcimentos;

import javax.swing.text.AbstractDocument.LeafElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.escape.Escaper;
import com.google.errorprone.annotations.FormatMethod;
import com.sap.timp.base.TestBase;
import com.sap.timp.base.TestBase;

public class OPPropiasRessarcimentosExcluirMassaPO extends TestBase{
	
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Op. Próprias e Ressarcimentos\"]")
	public WebElement opProprias;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"company-repayments\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"ufbranch-repayments\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"annexe-repayments\"]/div/div/div[2]")
	public WebElement anexo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
		
	@FindBy(xpath = "//div[@id=\"square-repayments\"]/div/div/div[2]")
	public WebElement tipoCuadro;
	
	@FindBy(xpath = "//div[@id=\"nf-status-repayments\"]/div/div/div[2]")
	public WebElement codSituacao;
	
	@FindBy(xpath = "//div[@id=\"report-repayments\"]/div/div/div[2]")
	public WebElement modeloRelatorio;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"início\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement salvarNovo;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][2]")
	public WebElement opcao3;
	
	
	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;

	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;

	public OPPropiasRessarcimentosExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean Criar() {
		
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		opProprias.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		
		empresa.click();
		sleep(1000);
		opcao.click();
		
		attributeToBe("//div[@id=\"ufbranch-repayments\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		uf.click();
		sleep(1000);
		opcao2.click();
		closeSelectTypeCheckbox(uf);
		sleep(1000);
		anexo.click();
		sleep(1000);
		opcao.click();
		sleep(1000);

		attributeToBe("//div[@id=\"square-repayments\"]/div", "class", "base-select required");
		sleep(2000);
		
		tipoCuadro.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		waitExpectedElement(codSituacao);
		sleep(2000);
		
		codSituacao.click();
		sleep(1000);
		opcao2.click();
		closeSelectTypeCheckbox(codSituacao);
		
		modeloRelatorio.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		dataVigencia.sendKeys(fechaActual());
		sleep(2000);
		
		salvarNovo.click();
		sleep(2000);
		
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(16000);
		
		empresa.click();
		sleep(1000);
		opcao3.click();
		
		attributeToBe("//div[@id=\"ufbranch-repayments\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		uf.click();
		sleep(1000);
		opcao2.click();
		closeSelectTypeCheckbox(uf);
		sleep(1000);
		
		anexo.click();
		sleep(1000);
		opcao.click();
		sleep(1000);

		attributeToBe("//div[@id=\"square-repayments\"]/div", "class", "base-select required");
		sleep(2000);
		
		tipoCuadro.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		waitExpectedElement(codSituacao);
		sleep(3000);
		
		codSituacao.click();
		sleep(1000);
		opcao2.click();
		
		sleep(2000);
		
		closeSelectTypeCheckbox(codSituacao);
		sleep(1000);
	
		modeloRelatorio.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		
		dataVigencia.sendKeys(fechaActual());
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		
		return sucesso;
	}		
	
	public boolean ExcluirMasa() {
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		rows = 2;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectedElement(siguiente);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
			System.out.println(id);
		}
			
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println("Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
	
		return sucesso;
	}	
	

}
