package com.timp.test.ATR.Tributos.AgrupamentoDeTributos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosCriarComCopiaPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosCriarPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosDetalhesPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosEditarPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosExcluirPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosVerPO;

public class AgrupamentoDeTributosTodasFunc extends TestBase{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	AgrupamentoDeTributosCriarPO agrupamentoDeTributosCriarPO;
	AgrupamentoDeTributosCriarComCopiaPO agrupamentoDeTributosCriarComCopiaPO;
	AgrupamentoDeTributosDetalhesPO agrupamentoDeTributosDetalhesPO;
	AgrupamentoDeTributosEditarPO agrupamentoDeTributosEditarPO;
	AgrupamentoDeTributosVerPO agrupamentoDeTributosVerPO;
	AgrupamentoDeTributosExcluirPO agrupamentoDeTributosExcluirPO;
	AgrupamentoDeTributosExcluirEmMassaPO agrupamentoDeTributosExcluirEmMassaPO;
	
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  agrupamentoDeTributosCriarPO = new  AgrupamentoDeTributosCriarPO();
		  agrupamentoDeTributosCriarComCopiaPO = new  AgrupamentoDeTributosCriarComCopiaPO();
		  agrupamentoDeTributosDetalhesPO = new  AgrupamentoDeTributosDetalhesPO();
		  agrupamentoDeTributosEditarPO = new  AgrupamentoDeTributosEditarPO();
		  agrupamentoDeTributosVerPO = new  AgrupamentoDeTributosVerPO();
		  agrupamentoDeTributosExcluirPO = new  AgrupamentoDeTributosExcluirPO();
		  agrupamentoDeTributosExcluirEmMassaPO = new AgrupamentoDeTributosExcluirEmMassaPO();
		
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	  

	 @Test(priority = 0)
	 public void criar() {
	 		
	 		loginTC.login();
	 		acessarATRPO.acessarATR();
	 		
	 		boolean sucesso = agrupamentoDeTributosCriarPO.criar();
	 		assertTrue(sucesso, Criar);
	 		sleep(2000);
	 		
	 }
	 
	 @Test(priority = 1)
	 public void criarcopia() {
	 		

	 		ArrayList<Boolean> sucesso = agrupamentoDeTributosCriarComCopiaPO.criarcopia();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Criar);
				
			}
			
	 		sleep(2000);
	 		
	 }
	 @Test(priority = 2)
	 	public void detalle() {
	 		
	 	
		 ArrayList<Boolean> sucesso = agrupamentoDeTributosDetalhesPO.detalhes();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Detalhes);
				
			}
	 		sleep(2000);
	 }
	 
	 @Test(priority = 3)
	 	public void editar() {
	 		
	 		ArrayList<Boolean> sucesso = agrupamentoDeTributosEditarPO.editar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Editar);
				
			}
	 		sleep(2000);
	 }
	 
	@Test(priority = 4)
	 	public void visualizar() {
	 		
	 		ArrayList<Boolean> sucesso = agrupamentoDeTributosVerPO.visualizar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizar);
				
			}
			
	 		sleep(2000);
	 		
	 	}
		@Test(priority = 5)
	 	public void excluir() {

	 		boolean sucesso = agrupamentoDeTributosExcluirPO.excluir();
			assertTrue(sucesso, Eliminado);
			sleep(2000);
	 		
	 	}
		@Test(priority = 6)
		public void criarMassa() {
			
		

			boolean sucesso = agrupamentoDeTributosExcluirEmMassaPO.criar();
			assertTrue(sucesso, Criar);
			sleep(2000);
		
		}
		
		@Test(dependsOnMethods = "criarMassa")
		public void Excluir() {
			
			sleep(1000);
			boolean sucesso2 = agrupamentoDeTributosExcluirEmMassaPO.excluir();;
			assertTrue(sucesso2, Eliminado);
			sleep(2000);

		}
}
