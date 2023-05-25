package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaCriarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaTodasFuncPO;

public class MapeamentoDeParametrosDeEntradaTodasFunc extends TestBaseSteven{
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeParametrosDeEntradaTodasFuncPO mapeamentoDeParametrosDeEntradaTodasFuncPO;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeParametrosDeEntradaTodasFuncPO = new  MapeamentoDeParametrosDeEntradaTodasFuncPO();
	  }

	  @AfterClass
	  public void afterClass() {
		 // driver.close();
	  }
	  

	 @Test(priority = 0)
	 	public void criar() {
	 		
	 		loginTC.login();
			 acessarATRPO.acessarATR();
	 		
	 		boolean sucesso = mapeamentoDeParametrosDeEntradaTodasFuncPO.criar();
			assertTrue(sucesso, Criar);
			sleep(2000);
	 		
	 	}
	@Test(priority = 1)
	 	public void editar() {
	 		
	 		boolean sucesso = mapeamentoDeParametrosDeEntradaTodasFuncPO.Editar();
			assertTrue(sucesso, Editar);
			sleep(2000);
	 		
	 	}
	@Test(priority = 2 )
	 	public void visualizar() {
	 		
	 		ArrayList<Boolean> sucesso = mapeamentoDeParametrosDeEntradaTodasFuncPO.visualizar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizar);
				
			}
	 		sleep(2000);
	 	}
		
	@Test(priority = 3)
		public void filtro() {
			
			boolean sucesso = mapeamentoDeParametrosDeEntradaTodasFuncPO.filtro();
			assertTrue(sucesso, Filtros);
			sleep(2000);
		}
		
		@Test(priority = 4)
	 	public void Excluir() {
	
	 		boolean sucesso = mapeamentoDeParametrosDeEntradaTodasFuncPO.excluir();
			assertTrue(sucesso, Eliminado);
			sleep(2000);
	 		
	 	}
		
		@Test(priority = 5)
		public void criarMassa() {

			boolean sucesso = mapeamentoDeParametrosDeEntradaTodasFuncPO.criar();
			assertTrue(sucesso, Criar);
			sleep(1000);
		}
		
		@Test(dependsOnMethods = "criarMassa")
		public void excluir() {
			
			boolean sucesso2 = mapeamentoDeParametrosDeEntradaTodasFuncPO.excluir();
			assertTrue(sucesso2, Eliminado);
			sleep(2000);
		}
	
}
