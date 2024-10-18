package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ParametrosGeraisHierarquiaCriarComCópiaPO extends TestBase {
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
	public WebElement hierarquias;

	@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
	public WebElement hierarquiaConfiguracao;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimo;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//input[contains(@placeholder,\"Preencher o nome de Hierarquia\")]")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveHierarchies\"]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public ParametrosGeraisHierarquiaCriarComCópiaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criar() {
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sleep(2000);
		hierarquias.click();
		sleep(2000);
		hierarquiaConfiguracao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("ParametrosGeraisH1");

		System.out.println(idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement copiar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));
		
		actionsMoveToElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		copiar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributoNotToBeEmpty(campo, "value");
		
		
		sleep(2000);

		gravar.click();
		sleep(2000);
		waitExpectedElement(nao);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id2 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div"))
				.getText();
		String nome = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();
		System.out.println(nome);

		sucesso.add(nome.contains("Cópia de - Teste QA PRUEBA TA"));
		
		System.out.println("nuevo Copia: "+id2);
		idInserir("ParametrosGeraisCopia",id2);

		int id1I = convertToInt(idRegistro);
		int id2I = convertToInt(id2);
		
		if (id2I > id1I) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public boolean excluir() {
		
		
		String idRegistro = idObter("ParametrosGeraisCopia");
		System.out.println("excluiremos: "+idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElement(menu);
		sleep(4000);
		menu.click();
		sleep(1000);
		
		excluir.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		driver.navigate().refresh();
		waitExpectedElement(lixeira);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[4]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println("Registro Excluido: "+sucesso);
		return sucesso;
		
	}
	
	
	public boolean excluirLixeira() {
		
		lixeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idRegistro = idObter("ParametrosGeraisCopia");
		System.out.println("excluiremos: "+idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElement(menu);
		sleep(4000);
		menu.click();
		sleep(1000);
		
		excluir.click();
		sleep(2000);
		waitExpectedElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		driver.navigate().refresh();
		waitExpectedElement(lixeira);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println("Registro Excluido da Lixeira: "+sucesso);
		return sucesso;
		
	}

}
