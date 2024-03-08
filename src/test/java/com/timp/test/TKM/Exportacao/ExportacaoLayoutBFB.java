package com.timp.test.TKM.Exportacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TKM.AcessarTKMPO;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteExportado.BibliotecaPEPO;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteExportado.GerenciarConteudoParaAgruparPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class ExportacaoLayoutBFB extends TestBase {
	LoginTC loginTC;
	BibliotecaPEPO bibliotecaPEPO;
	GerenciarConteudoParaAgruparPO gerenciarConteudoParaAgruparPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		bibliotecaPEPO = new BibliotecaPEPO();
		gerenciarConteudoParaAgruparPO = new GerenciarConteudoParaAgruparPO();
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
		sleep(11000);
		
		bibliotecaPEPO.clickbtnPacoteExportado();
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		  System.out.println("Ultimo registro: " + id);
		
		bibliotecaPEPO.clickbtnNovo();
		sleep(2000);
		
		bibliotecaPEPO.fillOutTxtNome("Test TA BFB");
		sleep(2000);
		
		bibliotecaPEPO.fillOutTxtdescripcion("Ciclo TA ");
		sleep(2000);
		
		bibliotecaPEPO.clickbtnGravar();
		sleep(4000);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println(id);
		System.out.println("Id Creado: "+ idultimo);
		idInserir("expBFB",idultimo);
		 
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

	@Test(priority = 2)
	public void AdicionarContenudo() {
	//	loginTC.login();
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
		
		String idultimo = idObter("expBFB");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
		WebElement agrupar = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//span[text()=\"Gerenciar Conteúdo para Agrupar\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		agrupar.click();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnAdicionarContenudo();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnComponente();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcComponenteBFB();
		sleep(3000);
		
		gerenciarConteudoParaAgruparPO.clickbtnModelo();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcModeloBFB();
		sleep(3000);
		
		
		
		gerenciarConteudoParaAgruparPO.clickbtnGravar();
		sleep(2000);
	
		String idBFB = "";
		if (tq1 == true) {

			idBFB="58106";
		}else {
			idBFB="1753";
		}
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.fillOutTxtBusqueda(idBFB);
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnBusqueda();
		sleep(2000);
		
		WebElement busqueda = driver.findElement(By.xpath("//div[@data-id=\""+idBFB+"\"]//span"));
		
		busqueda.click();
		sleep(1000);
		
		
		gerenciarConteudoParaAgruparPO.clickbtnGravar();
		sleep(5000);
		
		 String componente = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		 System.out.println("Componente Agregado: " + componente);
		 
		 String modelo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[4]/div")).getText();
		 System.out.println("Modelo Agregado: " + modelo);
		 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(componente.contains("BFB"));
		 sucesso.add(modelo.contains("Layout"));
		 
		 gerenciarConteudoParaAgruparPO.clickbtnBiblioteca();
		 sleep(2000);
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
		
		 
			
		 

	}
	
	@Test(priority = 3)
	public void Exportar() {
		
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
		
		sleep(2000);
		
		String idultimo = idObter("expBFB");
		
		String fechaExportación = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[6]//div")).getText();
		System.out.println("Fecha Exportación sin realizar el proceso: " + fechaExportación);
		
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(fechaExportación.equals(""));
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
		WebElement exportar = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//span[text()=\"Iniciar Exportação em Background\"]"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		exportar.click();
		sleep(11000);
		System.out.println("Test paso ");
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
		
		actionsMoveToElement(menu);
		sleep(2000);
		
		
		menu.click();
		sleep(1000);
		
		 String status = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//li[3]//span[2]")).getText();
		 System.out.println("Opcion: " + status);
		 sleep(6000);
		  
		  while (status.equals("Exportação") ) {
		 
			 driver.navigate().refresh();
			 sleep(10000);
			 invisibilityOfElementOverlay();
			 sleep(15000);
			  
			 bibliotecaPEPO.clickbtnPacoteExportado();
			 sleep(2000);
			
			 menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
				
			actionsMoveToElement(menu);
			sleep(2000);
				
			menu.click();
			sleep(1000);
				
		    status = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//li[3]//span[2]")).getText();
	        System.out.println("Opcion Habilitada : " + status);
	        sleep(30000);
	        
			
		}
		  
		WebElement descargar = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div/div[2]//span[text()=\"Baixar Pacote Salvo em Background\"]"));
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[1]/div"));
		
		actionsMoveToElement(menu);
		sleep(2000);

		
		descargar.click();
		sleep(2000);
		
		String fecha = fechaActual();
		System.out.println(fecha);
		
		String fechaExportación2 = driver.findElement(By.xpath("//div[@data-id=\""+idultimo+"\"]/div[6]//div")).getText();
		System.out.println("Fecha Exportación: " + fechaExportación2);
		
		sucesso.add(fechaExportación2.equals(fecha));
		System.out.println(sucesso);
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), filtros);
		}
		
		
	}
		
		
		

}