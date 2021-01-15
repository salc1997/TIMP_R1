<<<<<<< HEAD
package com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;


public class EstruturasVisualizarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"baseTabs-view-container\"]/div[1]/ul/li/div/span[text()=\"Estruturas\"]")
	public WebElement estruturas;
	
	@FindBy(xpath = "//div[@id=\"struc-cont\"]/ul/li[1]/ul/li[1]/div/div/div[1]/span[1]")
	public WebElement abrirTab;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement inputPesquisar;
	
	public EstruturasVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean visualizar() {
		invisibilityOfElementOverlay();
		estruturas.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistro = "0"; // Id Registro
		
		if(rows > 0) {
			idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
			System.out.println("ID Registro: " + idRegistro);
		}
		
		WebElement menu = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: "+idRegistro+ "\")]/div[1]/div"));
		WebElement a�ao = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: "+idRegistro+ "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		menu.click();
		sleep(1000);
		a�ao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abrirTab.click();
		invisibilityOfElementOverlay();
		
		String cantidadRegistro = driver.findElement(By.xpath("//div[@id=\"struc-cont\"]/ul/li[1]/ul/li[1]/div/div/div[2]/span")).getText().trim();
		System.out.println("");
		System.out.println("Cantidad de registros: " + cantidadRegistro);
		
		String valorBuscar = driver.findElement(By.xpath("//div[@id=\"struc-cont\"]/ul/li[1]/ul/li[1]/ul/li[2]/div/div/div/div[2]/span")).getText().trim();
		System.out.println("");
		System.out.println("Valor a buscar: " + valorBuscar);
		
		inputPesquisar.sendKeys(valorBuscar);
		inputPesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		String cantidadRegistroResultadoBusqueda = driver.findElement(By.xpath("//div[@id=\"struc-cont\"]/ul/li[1]/ul/li[1]/div/div/div[2]/span")).getText().trim();
		System.out.println("");
		System.out.println("Cantidad de registros resultados busqueda: " + cantidadRegistroResultadoBusqueda);
		
		boolean sucesso = false;
		
		if(convertToInt(cantidadRegistroResultadoBusqueda) > 0) {
			System.out.println("Se encontraron resultados...");
			sucesso = true;
		}else {
			System.out.println("No se encontraron resultados de la busqueda...");
			return sucesso;
		}
		
		sleep(2000);
		
		inputPesquisar.clear();
		inputPesquisar.sendKeys(Keys.ENTER);
		
		
		String cantidadRegistroAlBorrar = driver.findElement(By.xpath("//div[@id=\"struc-cont\"]/ul/li[1]/ul/li[1]/div/div/div[2]/span")).getText().trim();
		System.out.println("");
		System.out.println("Total registros al borrar la busqueda: " + cantidadRegistroAlBorrar);
		
		if(convertToInt(cantidadRegistroAlBorrar) > 1) {
			System.out.println("Busqueda borrada");
			sucesso = true;
		}else {
			System.out.println("Al borrar la busqueda no hay datos...");
			return sucesso = false;
		}
		
		return sucesso;
	}
}
=======
package com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseCristhian;

public class EstruturasVisualizarPO extends TestBaseCristhian {
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/ul/li[1]/div/span[2]")
	public WebElement estruturas;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de in�cio de vig�ncia\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"N�o\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[1]/div/div/div[2]/span[1]")
	public WebElement capa;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[2]/div/div/div[2]/span[1]")
	public WebElement item;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[3]/div/div/div[2]/span[1]")
	public WebElement oleo;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[4]/div/div/div[2]/span[1]")
	public WebElement campos;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/div/div/div[2]/span[1]")
	public WebElement total;
	
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[1]/div/div/div[2]/span[1]")
	public WebElement capaE;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[2]/div/div/div[2]/span[1]")
	public WebElement itemE;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[3]/div/div/div[2]/span[1]")
	public WebElement oleoE;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[4]/div/div/div[2]/span[1]")
	public WebElement camposE;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/div/div/div[2]/span[1]")
	public WebElement totalE;
	
	
	
	
	public EstruturasVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		estruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[2]"));
		WebElement ver = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[2]/span[2]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String capavisualizar = capa.getText();
		String itemvisualizar = item.getText();
		String oleovisualizar = oleo.getText();
		//String camposvisualizar = campos.getText();
		String totalvisualizar = total.getText();
		
		
		System.out.println(capavisualizar);
		System.out.println(itemvisualizar);
		System.out.println(oleovisualizar);
		//System.out.println(camposvisualizar);
		System.out.println(totalvisualizar);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		biblioteca.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter1();
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		WebElement menu1 = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[2]"));
		WebElement editar = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]/span[2]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    sleep(2000);
	    
	    String capavisualizarE = capaE.getText();
		String itemvisualizarE = itemE.getText();
		String oleovisualizarE = oleoE.getText();
		//String camposvisualizarE = camposE.getText();
		String totalvisualizarE = totalE.getText();
		
		
		System.out.println(capavisualizarE);
		System.out.println(itemvisualizarE);
		System.out.println(oleovisualizarE);
		//System.out.println(camposvisualizarE);
		System.out.println(totalvisualizarE);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
	  
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(capavisualizarE.contains(capavisualizar));
		sucesso.add(itemvisualizarE.contains(itemvisualizar));
		sucesso.add(oleovisualizarE.contains(oleovisualizar));
		//sucesso.add(camposvisualizarE.contains(camposvisualizar));
		sucesso.add(totalvisualizarE.contains(totalvisualizar));
		

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}

}
>>>>>>> refs/heads/Cristhian
