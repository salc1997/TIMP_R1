package com.timp.test.ATR.Estruturas.MapeamentoDeEstruturas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasTodasFuncPO;

public class MapeamentoDeEstruturasTodasFunc extends TestBaseSteven {
 
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeEstruturasTodasFuncPO mapeamentoDeEstruturasTodasFuncPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeEstruturasTodasFuncPO = new  MapeamentoDeEstruturasTodasFuncPO();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	 
	 @Test(priority = 0)
	 	public void criar() {
	 		
	 		loginTC.login();
	 		 acessarATRPO.acessarATR();
	 		
	 		boolean sucesso = mapeamentoDeEstruturasTodasFuncPO.criar();
			assertTrue(sucesso, Criar);
		
			sleep(2000);
	 	}
	 @Test(priority = 1)
	 	public void criarcopia() {
	 		
	 	
	 		ArrayList<Boolean> sucesso = mapeamentoDeEstruturasTodasFuncPO.criarcopia();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Criar);
			}
			
	 		sleep(2000);
	 	}
	 @Test(priority = 2)
	 	public void editar() {
	 		
	 		ArrayList<Boolean> sucesso = mapeamentoDeEstruturasTodasFuncPO.editar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Editar);
				
			}
			
	 		sleep(2000);
	 	}
	 
	 @Test(priority = 3)
	 public void visualizar() {
	 			 		
	 	ArrayList<Boolean> sucesso = mapeamentoDeEstruturasTodasFuncPO.visualizar();
	 	for (int i = 0; i < sucesso.size(); i++) {
	 		assertTrue(sucesso.get(i), visualizar);
				
		}
	 	sleep(2000);
	 }
	 
	
	 @Test(priority = 4)
	 	public void filtro() {
	 		
	 	ArrayList<Boolean> sucesso = mapeamentoDeEstruturasTodasFuncPO.filtro();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Filtros);
			}
			
	 		sleep(2000);
	 		
	 	}
	 @Test(priority = 5)
	 	public void excluir() {
	 
	 		boolean sucesso = mapeamentoDeEstruturasTodasFuncPO.excluir();
			assertTrue(sucesso, Eliminado);
			sleep(2000);
	 		
	 	}
	 @Test(priority = 6)
		public void CriarMassa() {

			ArrayList<Boolean> sucesso = mapeamentoDeEstruturasTodasFuncPO.criarMassa();
			for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), Criar);
			}
			sleep(2000);

		}
		
	@Test(dependsOnMethods = "CriarMassa")
		public void excluirMasa() {
			
			boolean sucesso2 = mapeamentoDeEstruturasTodasFuncPO.excluirMassa();
			assertTrue(sucesso2, Eliminado);
			sleep(2000);
		}
}
