package com.timp.test.TKM;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.BibliotecaRegraAN2PO;
import com.sap.timp.pageObjectModel.TKM.AcessarTKMPO;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteImportado.BibliotecaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class ImportacaoRegrasAN2BRE extends TestBase {
	LoginTC loginTC;
	BibliotecaPO bibliotecaPO;
	BibliotecaRegraAN2PO bibliotecaRegraAN2PO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		bibliotecaPO = new BibliotecaPO();
		bibliotecaRegraAN2PO = new BibliotecaRegraAN2PO();
	}

	@AfterClass
	public void afterClass() {
	}

	
	@Test(priority = 0)
	public void Criar() {
		
		
		loginTC.login();
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		
		if (tq1 == true) {


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/tkm/#library");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/tkm/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/tkm/#library");
		}
		sleep(9000);
		
		bibliotecaPO.clickbtnPacoteImportado();
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println("Ultimo registro: " + id);
		
		bibliotecaPO.clickbtnImportar();
		sleep(5000);
		
		WebElement fileInput = driver.findElement(By.name("file"));
		
		String filePath  = "";
		if (tq1 == true) {

			filePath = "C:\\Users\\user_ta\\Desktop\\Test TA BRE AN2TC2.bdl";
		}else {
			filePath = "C:\\Users\\user_ta\\Desktop\\Test TA BRE AN2TQ1.bdl";
		}
		 
		fileInput.sendKeys(filePath);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bibliotecaPO.clickbtnSubir();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println(id);
		System.out.println("Id Creado: "+ idultimo);
		idInserir("relatorioImportadoAN2",idultimo);
		 
		 double idD = convertToDouble(id);
		 double idBD = convertToDouble(idultimo);
		  sleep(5000);

		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			if (idBD > idD  ){
				sucesso.add(true);
			}else {
				sucesso.add(false);
			}
			for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), filtros);
			}
		
	}

	@Test(priority = 1)
	public void VerificarInf() {
		
		loginTC.login();
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		if (tq1 == true) {


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/tkm/#library");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/tkm/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/tkm/#library");
		}
		
		sleep(5000);
		bibliotecaPO.clickbtnPacoteImportado();
		sleep(2000);
		
		String idultimo = idObter("relatorioImportadoAN2");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));	
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		
		String idBRE = "";
		if (tq1 == true) {

			idBRE="5403";
		}else {
			idBRE="5778";
		}
		sleep(2000);
		
		 String componente = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		 System.out.println("Componente Agregado: " + componente);
		 
		 String modelo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[4]/div")).getText();
		 System.out.println("Modelo Agregado: " + modelo);
		 
		 String idOrigem = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[6]/div")).getText();
		 System.out.println("Id Origem " + idOrigem);
		 
		 String idDestino = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[7]/div")).getText();
		 System.out.println("Id Destino: " + idDestino);
		 
		 String nomeRegra = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[8]/div")).getText();
		 System.out.println("Nome Regra: " + nomeRegra);
		 
		 String descripcion = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[9]/div")).getText();
		 System.out.println("Descripcion : " + descripcion);
		 
		idInserir("IdDestinoBRE",idDestino);
		idInserir("NomeRegra",nomeRegra);
		idInserir("Descripcion",descripcion);
		 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(componente.contains("BRE"));
		 sucesso.add(modelo.contains("Rule"));
		 sucesso.add(idOrigem.equals(idBRE));

		 System.out.println(sucesso);
			
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
		
		 
			
		 

	}
	
	@Test(priority = 2)
	public void VerificarRegraImportada() {
		
		loginTC.login();
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		if (tq1 == true) {


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/bre/#library");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/bre/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/bre/#library");
		}
		
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		String idultimo = idObter("relatorioImportadoAN2");
		String idDestinoBRE = idObter("IdDestinoBRE");
		String nomeRegra = idObter("NomeRegra");
		String descripcion = idObter("Descripcion");
		
	
		bibliotecaRegraAN2PO.clickbtnRegraAN2();
		sleep(4000);
		
		bibliotecaRegraAN2PO.fillOutTxtBusqueda(idDestinoBRE);
		sleep(2000);
		
		bibliotecaRegraAN2PO.clickbtnBusqueda();
		sleep(6000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idDestinoBRE+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idDestinoBRE+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElement(menu);
		sleep(2000);
		
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(6000);
		
		
		
	}
		
		
		

}