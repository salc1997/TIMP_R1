package com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBase;

public class GrupoDeEstruturasFiltroPorIDPO extends TestBase {
	protected String estructuras = "http://as1-100-01-tc2:8000/timp/atr/#structures";

	
	@FindBy(xpath = "//span[text()=\"Grupo de Estruturas\"]")
	public WebElement grupodeestrutura;
	
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	

	public GrupoDeEstruturasFiltroPorIDPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> filtro() {
		driver.get(estructuras );
		sleep(8000);
		
		grupodeestrutura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String idRegistro = id.getText();
		System.out.println(idRegistro + " Id Registro");
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = id.getText();
		System.out.println(idBusqueda + " Id Busqueda");
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(idRegistro.equals(idBusqueda));
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		if (rows2 > rows1) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println(sucesso);

		return sucesso;

	}

}
