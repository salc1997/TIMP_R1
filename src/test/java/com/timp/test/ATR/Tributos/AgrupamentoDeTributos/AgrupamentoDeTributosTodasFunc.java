package com.timp.test.ATR.Tributos.AgrupamentoDeTributos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosCriarPO;
import com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos.AgrupamentoDeTributosTodasFuncPO;

public class AgrupamentoDeTributosTodasFunc extends TestBaseSteven{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	AgrupamentoDeTributosTodasFuncPO agrupamentoDeTributosTodasFuncPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  agrupamentoDeTributosTodasFuncPO = new  AgrupamentoDeTributosTodasFuncPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	  

	 @Test(priority = 0)
	 public void criar() {
	 		
	 		loginTC.login();
	 		acessarATRPO.acessarATR();
	 		
	 		boolean sucesso = agrupamentoDeTributosTodasFuncPO.criar();
	 		assertTrue(sucesso, Criar);
	 		sleep(2000);
	 		
	 }
	 
	 @Test(priority = 1)
	 public void criarcopia() {
	 		

	 		ArrayList<Boolean> sucesso = agrupamentoDeTributosTodasFuncPO.criarcopia();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Criar);
				
			}
			
	 		sleep(2000);
	 		
	 }
	 @Test(priority = 2)
	 	public void detalle() {
	 		
	 	
		 ArrayList<Boolean> sucesso = agrupamentoDeTributosTodasFuncPO.detalhes();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Detalhes);
				
			}
	 		sleep(2000);
	 }
	 
	 @Test(priority = 3)
	 	public void editar() {
	 		
	 		ArrayList<Boolean> sucesso = agrupamentoDeTributosTodasFuncPO.editar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Editar);
				
			}
	 		sleep(2000);
	 }
	 
	@Test(priority = 4)
	 	public void visualizar() {
	 		
	 		ArrayList<Boolean> sucesso = agrupamentoDeTributosTodasFuncPO.visualizar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizaçar);
				
			}
			
	 		sleep(2000);
	 		
	 	}
		@Test(priority = 5)
	 	public void excluir() {

	 		boolean sucesso = agrupamentoDeTributosTodasFuncPO.excluir();
			assertTrue(sucesso, Eliminado);
			sleep(2000);
	 		
	 	}
		@Test(priority = 6)
		public void criarMassa() {
			
		

			boolean sucesso = agrupamentoDeTributosTodasFuncPO.criarMassa();
			assertTrue(sucesso, Criar);
			sleep(2000);
		
		}
		
		@Test(dependsOnMethods = "criarMassa")
		public void Excluir() {
			
			sleep(1000);
			boolean sucesso2 = agrupamentoDeTributosTodasFuncPO.excluirMassa();
			assertTrue(sucesso2, Eliminado);
			sleep(2000);

		}
}
