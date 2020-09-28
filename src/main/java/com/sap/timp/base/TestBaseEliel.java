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
	public String elementosDiferentes = "Os elementos não são iguais";
	public String comentariosInativos = "Os comentários não foram ativados";
	public String correcãoInativa = "A correção não foi ativada";
	public String semAcesso = "Não foi possivel aceder ao aplicativo";
	public String semCampoOutput = "O campo output não foi adicionado";
	public String comentarioNãoValido = "Os comentários não foram os ingresados";
	public String crescenteEDecrescente = "Os resultados não estão em uma ordem válida";
	public String copiaNaoCriada = "A cópia não foi criada com sucesso";
	public String editado = "O relatório não foi modificado com sucesso";
	public String eliminar = "O elemento não foi deletado";
	public String deletarColuna = "A coluna não foi deletada";
	public String exportação = "A exportação não foi realizada com sucesso";
	public String filtros = "Os resultados do filtro não são iguais";
	public String aplicaçãoFiltros = "Os filtros não foram aplicados com sucesso";
	public String formatação = "A formatação não foi aplicada";
	public String excluirVariante = "A variante não foi excluida";
	public String salvarVariante = "A variante não foi salvada com sucesso";
	public String formula = "Os valores não são iguais";
	public String gruposAvan = "Os resultados não são iguais";
	public String gruposAvanDif = "Os resultados não são diferentes";
	public String gruposAvanDel = "Os grupos não foram deletados";
	public String ListaSuspensa = "Os comentários não foram inseridos";
	public String novoRelatorio = "O novo relatório não foi criado";
	public String colunas = "As colunas não foram inseridas";
	public String paginaSeguiente = "Não se conseguiu avançar para a página seguiente";
	public String paginaAnterior = "Não se conseguiu avançar para a página anterior";
	public String paginaFinal = "Não se conseguiu avançar para a última página";
	public String paginaInicial = "Não se conseguiu avançar para a página inicial";
	public String paginaInserida = "Não foi possivél avaçar para a página inserida";
	public String visualizaçar = "O modo visualização não está ativado";
	public String compartilharE = "Não foi possivél compartilhar o relatório desde o editor";
	public String descompartilharE = "Não foi possivél descompartilhar o relatório desde o editor";
	public String compartilharB = "Não foi possivél compartilhar o relatório desde a biblioteca";
	public String descompartilharB = "Não foi possivél compartilhar o relatório desde a biblioteca";
	public String renomear = "A coluna não foi renomeada com sucesso";
	public String reordenar = "A coluna não foi reordenada com sucesso";
	
	//MDR
	public String Editar = "O valor do campo não foi editado";
	public String EmpresaVisualizar = "Não foi possivél visalizar o registro";
	public String Filtros = "Os resultados não são acorde aos filtros";
	public String Criar = "O registro não foi criado com sucesso";
	public String Eliminado = "O registro não foi eliminado com sucesso";
	
	
	

}
