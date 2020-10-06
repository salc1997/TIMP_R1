package com.sap.timp.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBaseEliel extends TestBaseSteven {

	TestBaseSteven testeBaseSteven = new TestBaseSteven();

	public WebDriver initializationE() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(tq1);
		return driver;

	}

	public void sleep(int miliSeconds) {
		try {
			Thread.sleep(miliSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void waitExpectXpath(String locator) {
		WebDriverWait wait = new WebDriverWait(driver, 15000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		
	}
	
	public void waitExpectElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15000);
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public void actionsMoveToElementXpath(String xpath) {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(xpath))).perform();
	}
	
	public void actionsMoveToElementElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public void invisibilityOfElement(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 15000);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
		
	}

	public void attributeToBeXpath(String locator, String attribute, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 15000);
		
		wait.until(ExpectedConditions.attributeToBe(By.xpath(locator), attribute, value));
	}
	
	public void attributeToBeElement(WebElement element, String attribute, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 15000);
		
		wait.until(ExpectedConditions.attributeToBe(element, attribute, value));
	}
	
	
	public void dobleClickXpath(String locator) {
		
		Actions actions = new Actions(driver);
		actions.doubleClick(driver.findElement(By.xpath(locator))).perform();
		
	}
	
	
	public void dobleClickElement(WebElement element) {
		
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
		
	}
	
	public void moveToElement(WebElement element, WebElement hacia) {
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(element,hacia).perform();
		
	}
	
	public String fechaActual() {

		Date fecha = new Date();

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");

		return df.format(fecha);

	}
	
	public String fechaAyer() {

		Date fecha = new Date();
		
		Date ayer = new Date(fecha.getTime() + TimeUnit.DAYS.toMillis( -1 ));

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");

		return df.format(ayer);

	}


public String dataanterior() {
	
	DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
	Calendar cal = Calendar.getInstance();
	cal.add (Calendar.DAY_OF_MONTH, -1);
	
	return df.format(cal.getTime());
	
}
	
	public Double convertToDouble(String numero) {
				
		Double result = new Double(numero);
		
		return result;
		
	}
	
	
	
	public Integer contarWebElementsList(List<WebElement> colunas){
		
		int contar = -1;

		if (colunas.size() > 0) {
			
			for (int i = 0; i < colunas.size(); i++) {
				contar = contar + 1;
			}	
		}else {
			contar = 0;
		}
		

		
		return contar;
		
	}
	
	//BRB
	public String elementosDiferentes = "Os elementos n�o s�o iguais";
	public String comentariosInativos = "Os coment�rios n�o foram ativados";
	public String correc�oInativa = "A corre��o n�o foi ativada";
	public String semAcesso = "N�o foi possivel aceder ao aplicativo";
	public String semCampoOutput = "O campo output n�o foi adicionado";
	public String comentarioN�oValido = "Os coment�rios n�o foram os ingresados";
	public String crescenteEDecrescente = "Os resultados n�o est�o em uma ordem v�lida";
	public String copiaNaoCriada = "A c�pia n�o foi criada com sucesso";
	public String editado = "O relat�rio n�o foi modificado com sucesso";
	public String eliminar = "O elemento n�o foi deletado";
	public String deletarColuna = "A coluna n�o foi deletada";
	public String exporta��o = "A exporta��o n�o foi realizada com sucesso";
	public String filtros = "Os resultados do filtro n�o s�o iguais";
	public String aplica��oFiltros = "Os filtros n�o foram aplicados com sucesso";
	public String formata��o = "A formata��o n�o foi aplicada";
	public String excluirVariante = "A variante n�o foi excluida";
	public String salvarVariante = "A variante n�o foi salvada com sucesso";
	public String formula = "Os valores n�o s�o iguais";
	public String gruposAvan = "Os resultados n�o s�o iguais";
	public String gruposAvanDif = "Os resultados n�o s�o diferentes";
	public String gruposAvanDel = "Os grupos n�o foram deletados";
	public String ListaSuspensa = "Os coment�rios n�o foram inseridos";
	public String novoRelatorio = "O novo relat�rio n�o foi criado";
	public String colunas = "As colunas n�o foram inseridas";
	public String paginaSeguiente = "N�o se conseguiu avan�ar para a p�gina seguiente";
	public String paginaAnterior = "N�o se conseguiu avan�ar para a p�gina anterior";
	public String paginaFinal = "N�o se conseguiu avan�ar para a �ltima p�gina";
	public String paginaInicial = "N�o se conseguiu avan�ar para a p�gina inicial";
	public String paginaInserida = "N�o foi possiv�l ava�ar para a p�gina inserida";
	public String visualiza�ar = "O modo visualiza��o n�o est� ativado";
	public String compartilharE = "N�o foi possiv�l compartilhar o relat�rio desde o editor";
	public String descompartilharE = "N�o foi possiv�l descompartilhar o relat�rio desde o editor";
	public String compartilharB = "N�o foi possiv�l compartilhar o relat�rio desde a biblioteca";
	public String descompartilharB = "N�o foi possiv�l compartilhar o relat�rio desde a biblioteca";
	public String renomear = "A coluna n�o foi renomeada com sucesso";
	public String reordenar = "A coluna n�o foi reordenada com sucesso";
	
	//MDR
	public String Editar = "O valor do campo n�o foi editado";
	public String EmpresaVisualizar = "N�o foi possiv�l visalizar o registro";
	public String Filtros = "Os resultados n�o s�o acorde aos filtros";
	public String Criar = "O registro n�o foi criado com sucesso";
	public String Eliminado = "O registro n�o foi eliminado com sucesso";
	
	
	

}
