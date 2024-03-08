package com.timp.test.TKM.Importacao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.BibliotecaRegraAN2PO;
import com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais.EdicionRegraAN2PO;
import com.sap.timp.pageObjectModel.BRE.TabelasExternas.BibliotecaTabelaExternaPO;
import com.sap.timp.pageObjectModel.TKM.AcessarTKMPO;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteExportado.BibliotecaPEPO;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteExportado.GerenciarConteudoParaAgruparPO;
import com.sap.timp.pageObjectModel.TKM.conteudoDeTransporte.PacoteImportado.BibliotecaPIPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;

public class ImportacaoRegrasAN2BRE extends TestBase {
	LoginTC loginTC;
	AcessarTKMPO acessarTKMPO;
	BibliotecaPEPO bibliotecaPEPO;
	GerenciarConteudoParaAgruparPO gerenciarConteudoParaAgruparPO;
	BibliotecaPIPO bibliotecaPIPO;
	BibliotecaRegraAN2PO bibliotecaRegraAN2PO;
	EdicionRegraAN2PO  edicionRegraAN2PO;
	BibliotecaTabelaExternaPO bibliotecaTabelaExternaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTKMPO = new AcessarTKMPO();
		bibliotecaPEPO = new BibliotecaPEPO();
		gerenciarConteudoParaAgruparPO = new GerenciarConteudoParaAgruparPO();
		bibliotecaPIPO = new BibliotecaPIPO();
		bibliotecaRegraAN2PO = new BibliotecaRegraAN2PO();
		edicionRegraAN2PO = new EdicionRegraAN2PO();
		bibliotecaTabelaExternaPO = new BibliotecaTabelaExternaPO();
	}

	
	
	@AfterClass
	public void afterClass() {
	}
	
	String Hierarquia ="";
	String corre ="";

	@Test(priority = 0)
	public void CriarExportacion() {
		
	
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


			driver.navigate().to("http://as1-100-01-tc2:8000/timp/login/#/login");

		}else if (tc2==true ) {
			
			driver.navigate().to("http://as1-100-01-tq1:8000/timp/login/#/login");
			
		}else {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/tkm/#library");
		}
		sleep(3000);
		
		loginTC.login();
		sleep(3000);
		
		acessarTKMPO.acessarTKM();
		sleep(10000);
		
		bibliotecaPEPO.clickbtnPacoteExportado();
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		  System.out.println("Ultimo registro: " + id);
		
		bibliotecaPEPO.clickbtnNovo();
		sleep(2000);
		
		bibliotecaPEPO.fillOutTxtNome("Test TA BRE AN2");
		sleep(2000);
		
		bibliotecaPEPO.fillOutTxtdescripcion("Ciclo TA ");
		sleep(2000);
		
		bibliotecaPEPO.clickbtnGravar();
		sleep(6000);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println(id);
		System.out.println("Id Creado: "+ idultimo);
		idInserir("relatorioBRE",idultimo);
		 
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
		
		String idultimo = idObter("relatorioBRE");
		
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
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcComponenteBRE();
		sleep(3000);
		
		gerenciarConteudoParaAgruparPO.clickbtnModelo();
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnOpcModeloBRE();
		sleep(3000);
		
		
		gerenciarConteudoParaAgruparPO.clickbtnGravar();
		sleep(2000);
		
		String idBRE = "";
		if (tq1 == true) {

			idBRE="5778";
		}else {
			idBRE="5403";
		}
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.fillOutTxtBusqueda(idBRE);
		sleep(2000);
		
		gerenciarConteudoParaAgruparPO.clickbtnBusqueda();
		sleep(2000);
		
		WebElement busqueda = driver.findElement(By.xpath("//div[@data-id=\""+idBRE+"\"]//span"));
		
		busqueda.click();
		sleep(1000);
		
		
		gerenciarConteudoParaAgruparPO.clickbtnGravar();
		sleep(5000);
		
		 String componente = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		 System.out.println("Componente Agregado: " + componente);
		 
		 String modelo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[4]/div")).getText();
		 System.out.println("Modelo Agregado: " + modelo);
		 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(componente.contains("BRE"));
		 sucesso.add(modelo.contains("Rule"));
		 
		 gerenciarConteudoParaAgruparPO.clickbtnBiblioteca();
		 sleep(2000);
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
		
		 
			
		 

	}
	
	@Test(priority = 3)
	public void Exportar() {
		
		sleep(2000);
		
		String idultimo = idObter("relatorioBRE");
		
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
	@Test(priority = 4)
	public void Criar() {
		
		sleep(4000);
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


			driver.navigate().to("http://as1-100-01-tc2:8000/timp/login/#/login");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/tkm/#library");
			
		}else {
			driver.navigate().to("http://as1-100-01-tq1:8000/timp/login/#/login");
		}
		
		sleep(4000);
	
		loginTC.login();
		sleep(4000);

		acessarTKMPO.acessarTKM();
		sleep(10000);
		
		bibliotecaPIPO.clickbtnPacoteImportado();
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		System.out.println("Ultimo registro: " + id);
		
		bibliotecaPIPO.clickbtnImportar();
		sleep(5000);
		
		WebElement fileInput = driver.findElement(By.name("file"));
		String filePath = "C:\\Users\\user_ta\\Downloads\\Test TA BRE AN2.bdl";
		fileInput.sendKeys(filePath);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bibliotecaPIPO.clickbtnSubir();
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

	@Test(priority = 5)
	public void VerificarInf() {
		
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
		bibliotecaPIPO.clickbtnPacoteImportado();
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
		
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add(componente.contains("BRE"));
		 sucesso.add(modelo.contains("Rule"));
		 sucesso.add(idOrigem.equals(idBRE));

		 System.out.println(sucesso);
			
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
	}

		@Test(priority = 6)
		public void VerificarRegraImportada() {
		
		
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
		
	   sleep(8000);
		
	 
		
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
		
		
		System.out.println("Id Destino: "+ idDestinoBRE);
		
		bibliotecaRegraAN2PO.clickbtnRegraAN2();
		sleep(4000);
		
		bibliotecaRegraAN2PO.fillOutTxtBusqueda(idDestinoBRE);
		sleep(2000);
		
		bibliotecaRegraAN2PO.clickbtnBusqueda();
		sleep(8000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idDestinoBRE+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idDestinoBRE+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElement(menu);
		sleep(2000);
		
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(12000);
		
		String   nomeRegra = "";
		String   descripcionRegra = "";
		String   açoes = "";
		
		String  nomeRegratq1 = "";
		String  descripcionRegratq1 = "";
		String  açoestq1 = "";
		
		if (tq1 == true) {

			waitExpectedElement("//span[text()=\"Adicionar Caminho\"]");
			 nomeRegra = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[1]")).getText();
			System.out.println("Nome Regra: " + nomeRegra);
			
			descripcionRegra = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[2]")).getText();
			System.out.println("Descripción Regra: " + descripcionRegra);
			 
			 açoes = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[4]")).getText();
			System.out.println("Açoes: " +  açoes);
			
			Hierarquia = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[5]")).getText();
			Hierarquia =Hierarquia.replace("Correções:[[", "");
			Hierarquia =Hierarquia.replace("-ContabilizaçãodeCorreção:[CCNF1074 -PIS Crédito- Troca deBases (comcontabiliazação):[VL_BC_PIS= ValorDébito (VC),ALIQ_PIS= 0,VL_PIS= ValorNovo,VL_BC_OUTRAS_PIS=0,VL_BC_EXC_PIS= 0]]]", "");
		
			System.out.println("Hierarquia: " +  Hierarquia);
			
			corre = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[5]")).getText();
			corre = corre.replace("Correções:[[HCNF0741-ContabilizaçãodeCorreção:[", "");
			corre = corre.replace(" -PIS Crédito- Troca deBases (comcontabiliazação):[VL_BC_PIS= ValorDébito (VC),ALIQ_PIS= 0,VL_PIS= ValorNovo,VL_BC_OUTRAS_PIS=0,VL_BC_EXC_PIS= 0]]]", "");
			System.out.println("Correções: " +  corre);
			
			
			 nomeRegratq1 = "Status daCorreção PT='Corrigido'";
			 descripcionRegratq1 = "Nome doCampo ='VL_ICMSST'";
			 açoestq1 = "ContabilizarCorreção";
		
			
			
		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/brb/#library");
			
		}else {
			
			waitExpectedElement("//span[text()=\"Adicionar Caminho\"]");
			 nomeRegra = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[1]")).getText();
			System.out.println("Nome Regra: " + nomeRegra);
			
			descripcionRegra = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[2]")).getText();
			System.out.println("Descripción Regra: " + descripcionRegra);
			 
			 açoes = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[3]")).getText();
			System.out.println("Açoes: " +  açoes);
			
			Hierarquia = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[4]")).getText();
			Hierarquia =Hierarquia.replace("Correções:[[", "");
			Hierarquia =Hierarquia.replace(" - tabelaexterna formatodata: [CCNF1143 -Cenário correçãotabela externaformato data:[DT_EXTEMPORANEA =EXTEM (VE),DT_E_S =LANCAMENTO (VE),COD_SIT =00]]]", "");
			System.out.println("Hierarquia: " +  Hierarquia);
			
			corre = driver.findElement(By.xpath("//div[@id=\"graph\"]/*/*/*[4]")).getText();
			corre = corre.replace("Correções:[[HCNF0487 - tabelaexterna formatodata: [", "");
			corre = corre.replace(" -Cenário correçãotabela externaformato data:[DT_EXTEMPORANEA =EXTEM (VE),DT_E_S =LANCAMENTO (VE),COD_SIT =00]]]", "");
			System.out.println("Correções: " +  corre);
			
			 nomeRegratq1 = " Docnum = data tablaexterna - DOCNUM";
			 descripcionRegratq1 = "Item-docnum = datatabla externa -ITEM";
			 açoestq1 = "CORRIGIR DATA VE";
			
		}

		
		
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			 
		 sucesso.add( nomeRegratq1.contains(nomeRegra));
		 sucesso.add( descripcionRegratq1.contains(descripcionRegra));
		 sucesso.add( açoestq1.contains(açoes));
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
			
			sleep(2000);
		
	}

	@Test(priority = 7)
	public void VerificarTabelaExterna() {
		
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
		
		edicionRegraAN2PO.clickBtnTabelas();
		sleep(4000);
		
		 String tabelaExterna = "";
		
		 if (tq1 == true) {


			 tabelaExterna = driver.findElement(By.xpath("//div[@class=\"object-list-field\"][2]//div")).getText();
			 System.out.println("tabelaExterna: " +  tabelaExterna);
			 sleep(4000);

			}else if (tp1==true ) {
				driver.navigate().to("http://as1-100-01-tp1:8000/timp/bre/#library");
				
			}else {
				 tabelaExterna = driver.findElement(By.xpath("//div[@class=\"object-list-field\"]//div")).getText();
				 System.out.println("tabelaExterna: " +  tabelaExterna);
				 sleep(4000);
			}
		
		 
		 if (tq1 == true) {


				driver.navigate().to("http://as1-100-01-tq1:8000/timp/bre/#library");

			}else if (tp1==true ) {
				driver.navigate().to("http://as1-100-01-tp1:8000/timp/bre/#library");
				
			}else {
				driver.navigate().to("http://as1-100-01-tc2:8000/timp/bre/#library");
			}
		 invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 bibliotecaTabelaExternaPO.clickbtnTabelas();
		 sleep(3000);
		 
		 bibliotecaTabelaExternaPO.clickbtnTabelasExternas();
		 sleep(3000);
		 
		 bibliotecaTabelaExternaPO.clickbtnFiltrosAvanzados();
		 sleep(3000);
		 
		 bibliotecaTabelaExternaPO.fillOuttxtTituloRegras(tabelaExterna);
		 sleep(5000);
		 
		 bibliotecaTabelaExternaPO.clickbtnAplicar();
		 sleep(3000);
		 
		 WebElement menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[1]/div"));
		 WebElement açao = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[1]//li/span[text()=\"Editar\"]"));
		 sleep(2000);
		 
		 menu.click();
		sleep(1000);
		açao.click();
		sleep(15000);
		
		 String nomeTabelaExterna = "";
		 String nomeTabelaHana = "";
		 String grupoEstructura = "";
		 String estructuraValidacion  = "";
		 String nomeTabelaHanaREV = "";
		 String grupoEstructuraREV = "";
		 String estructuraValidacionREV  = "";
		
		if (tq1 == true) {

			nomeTabelaExterna = driver.findElement(By.xpath("//div[@id=\"table-name\"]//input")).getAttribute("value");
			System.out.println("Nome tabela Externa: " +  nomeTabelaExterna);
			 
			 nomeTabelaHana = driver.findElement(By.xpath("//div[@id=\"db-table-name\"]//input")).getAttribute("value");
			 System.out.println("Nome Tabela Hana: " +  nomeTabelaHana);
			 
			 grupoEstructura = driver.findElement(By.xpath("//div[@id=\"structure-group\"]//input")).getAttribute("value");
			 System.out.println("Grupo Estructura: " +  grupoEstructura);
			 
			 estructuraValidacion = driver.findElement(By.xpath("//div[@id=\"structure-validation\"]//input")).getAttribute("value");
			 System.out.println("Estructura Validacion: " +  estructuraValidacion);
			 
			 nomeTabelaHanaREV = "CUSTOMER::TabelaDUE2T";
			 grupoEstructuraREV = "APURAÇÃO_PIS_COFINS";
			 estructuraValidacionREV  = "01_NOTAFISCALTDFCIMP_PRODUTOS EXPORTADOS";
			 
		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/brb/#library");
			
		}else {
			nomeTabelaExterna = driver.findElement(By.xpath("//div[@id=\"table-name\"]//input")).getAttribute("value");
			System.out.println("Nome tabela Externa: " +  nomeTabelaExterna);
			 
			 nomeTabelaHana = driver.findElement(By.xpath("//div[@id=\"db-table-name\"]//input")).getAttribute("value");
			 System.out.println("Nome Tabela Hana: " +  nomeTabelaHana);
			 
			 grupoEstructura = driver.findElement(By.xpath("//div[@id=\"structure-group\"]//input")).getAttribute("value");
			 System.out.println("Grupo Estructura: " +  grupoEstructura);
			 
			 estructuraValidacion = driver.findElement(By.xpath("//div[@id=\"structure-validation\"]//input")).getAttribute("value");
			 System.out.println("Estructura Validacion: " +  estructuraValidacion);
			 nomeTabelaHanaREV = "CUSTOMER::datatablaexterna";
			 grupoEstructuraREV = "Nota Fiscal (Itens com Impostos) + Petrobras + Ordem de Venda";
			 estructuraValidacionREV  = "Nota Fiscal (Itens com Impostos) + Petrobras + Ordem de Venda";
			

		}
	 
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			 
		 sucesso.add( nomeTabelaExterna.contains(tabelaExterna));
		 sucesso.add( nomeTabelaHana.contains(nomeTabelaHanaREV));
		 sucesso.add( grupoEstructura.contains(grupoEstructuraREV));
		 sucesso.add( estructuraValidacion.contains(estructuraValidacionREV));
		 
		 System.out.println(sucesso);
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
			
			sleep(2000);
		 
		
	}

	@Test(priority = 8)
	public void VerificarMdrHierarquia() {
		
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


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/mdr/#/library?cadastro=scenarioHierarchy");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/mdr/#/library?cadastro=scenarioHierarchy");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/mdr/#/library?cadastro=scenarioHierarchy");
		}
		
		sleep(20000);
		
		WebElement pesquisar = driver.findElement(By.xpath("//div[@id=\"search-input\"]//input"));
		System.out.println(Hierarquia);
		sleep(2000);
		pesquisar.sendKeys(Hierarquia);
		sleep(2000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(18000);
		
		 WebElement menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[1]/div"));
		 WebElement editar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[1]//li/span[text()=\"Editar\"]"));
		 sleep(4000);
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(18000);
		
		String tributo = "";
		String objetoCorrecao = "";
		String descripcion = "";
		String tributoREV = "";
		String objetoCorrecaoREV = "";
		String descripcionREV = "";
		
		
		if (tq1 == true) {


			tributo = driver.findElement(By.xpath("//div[@id=\"tax\"]//input")).getAttribute("value");
			 System.out.println("Tributo: " +  tributo);
			 
			 objetoCorrecao = driver.findElement(By.xpath("//div[@id=\"correction-object\"]//input")).getAttribute("value");
			 System.out.println("Nome Tabela Hana: " +  objetoCorrecao);
			 
			 descripcion = driver.findElement(By.xpath("//div[@id=\"description\"]//input")).getAttribute("value");
			 System.out.println("Grupo Estructura: " +  descripcion);
			 
			 tributoREV = "ICMS";
			 objetoCorrecaoREV = "NF";
			 descripcionREV = "Contabilização de Correção";

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/mdr/#/library?cadastro=scenarioHierarchy");
			
		}else {
			 tributo = driver.findElement(By.xpath("//div[@id=\"tax\"]//input")).getAttribute("value");
			 System.out.println("Tributo: " +  tributo);
			 
			 objetoCorrecao = driver.findElement(By.xpath("//div[@id=\"correction-object\"]//input")).getAttribute("value");
			 System.out.println("Nome Tabela Hana: " +  objetoCorrecao);
			 
			 descripcion = driver.findElement(By.xpath("//div[@id=\"description\"]//input")).getAttribute("value");
			 System.out.println("Grupo Estructura: " +  descripcion);
			 
				 tributoREV = "ICMS";
				 objetoCorrecaoREV = "NF";
				 descripcionREV = "tabela externa formato data";
			 
		}
		
		
		
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		 
		 sucesso.add( tributo.contains(tributoREV));
		 sucesso.add( objetoCorrecao.contains(objetoCorrecaoREV));
		 sucesso.add( descripcion.contains(descripcionREV));
		
		 System.out.println( sucesso);
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
			
			sleep(4000);
	}

	@Test(priority = 9)
	public void VerificarMdrCorrecao() {
		
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


			driver.navigate().to("http://as1-100-01-tq1:8000/timp/mdr/#/library?cadastro=scenarioConfiguration");

		}else if (tp1==true ) {
			driver.navigate().to("http://as1-100-01-tp1:8000/timp/mdr/#/library?cadastro=scenarioHierarchy");
			
		}else {
			driver.navigate().to("http://as1-100-01-tc2:8000/timp/mdr/#/library?cadastro=scenarioConfiguration");
		}
		
		sleep(10000);
		WebElement pesquisar = driver.findElement(By.xpath("//div[@id=\"search-input\"]//input"));
		System.out.println(corre);
		sleep(2000);
		pesquisar.sendKeys(corre);
		sleep(2000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		
		 WebElement menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[1]/div"));
		 WebElement editar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[1]//li/span[text()=\"Editar\"]"));
		 sleep(2000);
		actionsMoveToElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(24000);
		
		String tributo = "";
		String objetoCorrecao = "";
		String descripcion = "";
		String  serviciWeb = "";
		String  campo1 = "";
		String  campo2 = "";
		String  campo3 = "";
		
		 ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (tq1 == true) {

			tributo = driver.findElement(By.xpath("//div[@id=\"tax\"]//input")).getAttribute("value");
			 System.out.println("Tributo: " +  tributo);
			 
			 objetoCorrecao = driver.findElement(By.xpath("//div[@id=\"correction-object\"]//input")).getAttribute("value");
			 System.out.println("Objeto de Correção: " +  objetoCorrecao);
			 
			 descripcion = driver.findElement(By.xpath("//div[@id=\"description\"]//input")).getAttribute("value");
			 System.out.println("Descrição do Cenário: " +  descripcion);
			 
			 serviciWeb = driver.findElement(By.xpath("//div[@id=\"web-service\"]//input")).getAttribute("value");
			 System.out.println("Serviço Web: " +   serviciWeb);
			 
			 campo1 = driver.findElement(By.xpath("//div[@id=\"field-1\"]//input")).getAttribute("value");
			 System.out.println("Campo 1: " +   campo1);
			 
			
			
		}else if (tp1==true ) {
			
		}else {
			tributo = driver.findElement(By.xpath("//div[@id=\"tax\"]//input")).getAttribute("value");
			 System.out.println("Tributo: " +  tributo);
			 
			 objetoCorrecao = driver.findElement(By.xpath("//div[@id=\"correction-object\"]//input")).getAttribute("value");
			 System.out.println("Objeto de Correção: " +  objetoCorrecao);
			 
			 descripcion = driver.findElement(By.xpath("//div[@id=\"description\"]//input")).getAttribute("value");
			 System.out.println("Descrição do Cenário: " +  descripcion);
			 
			 serviciWeb = driver.findElement(By.xpath("//div[@id=\"web-service\"]//input")).getAttribute("value");
			 System.out.println("Serviço Web: " +   serviciWeb);
			 
			 campo1 = driver.findElement(By.xpath("//div[@id=\"field-1\"]//input")).getAttribute("value");
			 System.out.println("Campo 1: " +   campo1);
			 
			 campo2 = driver.findElement(By.xpath("//div[@id=\"field-2\"]//input")).getAttribute("value");
			 System.out.println("Campo 2: " +   campo2);
			 
			 campo3 = driver.findElement(By.xpath("//div[@id=\"field-3\"]//input")).getAttribute("value");
			 System.out.println("Campo 3: " +   campo3);
			 
			 sucesso.add( tributo.contains("ICMS"));
			 sucesso.add( objetoCorrecao.contains("NF"));
			 sucesso.add( descripcion.contains("Cenário correção tabela externa formato data"));
			 sucesso.add( serviciWeb.contains("TMFNotaFiscalCorrectionsSyncIn"));
			 sucesso.add( campo1.contains("Data extemporânea (DT_EXTEMPORANEA)"));
			 sucesso.add( campo2.contains("Data lançamento doc. fiscal (DT_E_S)"));
			 sucesso.add( campo3.contains("Código da situação doc. fiscal (COD_SIT)"));
		}
		
		 
		 
		 
		
		
		 
		 
		
		 System.out.println( sucesso);
		 
		 for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), visualizar);

			}
			
			sleep(2000);
	}


}
