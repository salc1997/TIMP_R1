package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class MotivosdeDesligamentoExcluirMasaPO extends TestBaseKenssy {
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 19 - Motivos de Desligamento\"]")
	public WebElement tabela19;
	
	@FindBy(xpath = "//button/span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	
	//DATOS
	@FindBy(xpath = "//input[contains(@placeholder,\"Código\")]")
	public WebElement codigo;
	@FindBy(xpath = "//textarea[contains(@placeholder,\"Preencher Descrição\")]")
	public WebElement descricao;
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement validade;
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement finalPagina;
	
	
	public MotivosdeDesligamentoExcluirMasaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void excluirMasaMotivosDesligamento() {
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		tabela19.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span")).getText();
			System.out.println(id);
		}
		
		
		//CLICK BOTON NUEVO
		sleep(2000);
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		for (int i = 0; i < 1; i++) {
			codigo.sendKeys("124");
			sleep(1000);
			descricao.sendKeys("Teste Compatibilidade Motivo Desligamento "+i+"");
			sleep(1000);
			
			String data = fechaActual();
			validade.sendKeys(data);
			sleep(1000);
			
			gravareNovo.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			sim.click();
			
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
//		sleep(2000);	
//		sim.click();
		
		sleep(2000);		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		finalPagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		 rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		 id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
//		int id1 = convertToInt(id);
//		int id2 = convertToInt(idRegistro);
//		System.out.println(id1);
//		System.out.println(id2);
//		
//		boolean sucesso = false;
//		
//		if (id1 != id2) {
//			sucesso= true;
//		}
//		
//		return sucesso;
//		boolean sucesso = false;
//		  
//		if(rows == 0) {
//			return sucesso = true; 
//		}
//		  
//		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
//		idInserir1(idB);
		
//		codigo.sendKeys("124");
//		sleep(1000);
//		descricao.sendKeys("Teste Compatibilidade Motivo Desligamento");
//		sleep(1000);
//		
//		String data = fechaActual();
//		validade.sendKeys(data);
//		sleep(1000);
//		
//		gravareNovo.click();
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);

		
	}
}
