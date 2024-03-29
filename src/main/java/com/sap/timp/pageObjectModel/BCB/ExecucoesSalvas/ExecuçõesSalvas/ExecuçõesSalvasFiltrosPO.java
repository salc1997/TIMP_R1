package com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.ExecuçõesSalvas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class ExecuçõesSalvasFiltrosPO extends TestBase{
	//TSTNG-4245
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][3]")
	public WebElement execucoes;
	
	@FindBy(xpath = "//span[text()=\"Execução da Consolidação\"]")
	public WebElement execucacoConsolidacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")
	public WebElement id;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpiar;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	
	@FindBy(xpath = "//div[@id=\"hierarchy-name-filter\"]/div/div[2]")
	public WebElement nombreHierarquia;
	
	@FindBy(xpath = "//li[@id=\"(BCB com campo de Output) TA\"]")
	public WebElement opcNombreHierarquia;
	
	@FindBy(xpath = "//div[@id=\"company-filter\"]//div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf-filter\"]//div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch-filter\"]//div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"tax-filter\"]//div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"subperiod-filter\"]/div/div[1]/span")
	public WebElement calendeario;
	
	public ExecuçõesSalvasFiltrosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Filtro() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		sleep(2000);
		execucoes.click();
		sleep(10000);
		execucacoConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		int rows = 1;
				
		String idRegistro = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();
		
		System.out.println(" ID de Execucoes: "+idRegistro);
		
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = id.getText();

		boolean sucesso = idRegistro.equals(idBusqueda);
		
		sleep(2000);
		limpiar.click();
		sleep(5000);
		
		
		
		return sucesso;
	}	
	public ArrayList<Boolean> Hierarquia() {
		
		sleep(6000);
		filtros.click();
		sleep(2000);
		
		sleep(2000);
		nombreHierarquia.click();
		sleep(3000);
		
		String HierarquiaText = opcNombreHierarquia.getText();
		opcNombreHierarquia.click();
		sleep(3000);
		
	/*	closeSelectTypeCheckbox(nombreHierarquia);
		sleep(3000);*/
		
		System.out.println("VIENE EN EL SELECT HIERARQUIA: "+ HierarquiaText);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[7]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Hierarquia Filtro");
			sucesso.add(textFiltroEmpresa.contains(HierarquiaText));

			f = f + 1;
		}
		System.out.println(sucesso);
		sleep(2000);
		limpiar.click();
		sleep(5000);

		return sucesso;
	}
	
	public ArrayList<Boolean>  Empresa() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String Empresa = "1000";
		
		
		System.out.println("Empresa en Libreria: "+ Empresa);
		sleep(2000);
		
		sleep(2000);
		empresa.click();
		sleep(2000);
		
		

		WebElement Opc = driver.findElement(By.xpath("//li[contains(text(),\""+Empresa+"\")]"));

		Opc.click();
		sleep(4000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		
		for (int i = 0; i < rows1; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows1 + "]/div[9]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Empresa Filtro");
			sucesso.add(Empresa.equals(textFiltroEmpresa));

			f = f + 1;
		}
		sleep(2000);
		limpiar.click();
		sleep(5000);
		
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	
	public ArrayList<Boolean> UF() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String UF = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[10]/div"))
				.getText();
		
		
		System.out.println("UF en Libreria: "+ UF);
		sleep(2000);
		
		sleep(2000);
		uf.click();
		sleep(2000);
		
		actionsMoveToElement("//li[contains(text(),\""+UF+"\")]");
		sleep(2000);

		WebElement Opc = driver.findElement(By.xpath("//li[contains(text(),\""+UF+"\")]"));

		Opc.click();
		sleep(4000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		
		for (int i = 0; i < rows1; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows1 + "]/div[10]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " UF Filtro");
			sucesso.add(UF.equals(textFiltroEmpresa));

			f = f + 1;
		}
		sleep(2000);
		limpiar.click();
		sleep(5000);
		
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	public ArrayList<Boolean> Filial() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String Filial = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[11]/div"))
				.getText();
			
		
		
		System.out.println("Filial en Libreria: "+ Filial);
		sleep(2000);
		
		sleep(2000);
		filial.click();
		sleep(2000);
		
	

		WebElement Opc = driver.findElement(By.xpath("//li[@id=\"0001\"]"));

		Opc.click();
		sleep(4000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		
		for (int i = 0; i < rows1; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows1 + "]/div[11]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Filial Filtro");
			sucesso.add(textFiltroEmpresa.contains(Filial));

			f = f + 1;
		}
		System.out.println(sucesso);
		sleep(2000);
		limpiar.click();
		sleep(5000);
		return sucesso;
		
	}
	
	
	public ArrayList<Boolean> Tributo() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String Tributo = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[12]/div"))
				.getText();
		
		
		System.out.println("Tributo en Libreria: "+ Tributo);
		sleep(2000);
		
		sleep(2000);
		tributo.click();
		sleep(2000);
		
		actionsMoveToElement("//li[contains(text(),\""+Tributo+"\")]");
		sleep(2000);

		WebElement Opc = driver.findElement(By.xpath("//li[contains(text(),\""+Tributo+"\")]"));

		Opc.click();
		sleep(4000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		
		for (int i = 0; i < rows1; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows1 + "]/div[12]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Tributo Filtro");
			sucesso.add(Tributo.equals(textFiltroEmpresa));

			f = f + 1;
		}
		sleep(2000);
		limpiar.click();
		sleep(5000);
		
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	
	public ArrayList<Boolean> SubPeriodo() {
		
		
		int rows = 1;
		String sub = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[12]/div"))
				.getText();
		
		
		sub = sub.substring(3,7);
		
		
		
		
		System.out.println("SubPeriodo en Libreria: "+ sub);
		sleep(2000);
		
		sleep(2000);
		calendeario.click();
		sleep(2000);
		
		actionsMoveToElement("//li[contains(text(),\""+sub+"\")]");
		sleep(2000);

		WebElement Opc = driver.findElement(By.xpath("//li[contains(text(),\""+sub+"\")]"));

		Opc.click();
		sleep(4000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		/*	int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		
		for (int i = 0; i < rows1; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows1 + "]/div[10]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Filial Filtro");
			sucesso.add(textFiltroEmpresa.contains(sub));

			f = f + 1;
		}*/
		System.out.println(sucesso);
		return sucesso;
		
	}
	
}
