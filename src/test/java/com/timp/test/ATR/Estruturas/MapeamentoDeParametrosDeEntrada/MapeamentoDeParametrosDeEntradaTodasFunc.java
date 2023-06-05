package com.timp.test.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaCriarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaEditarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaExcluirPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentoDeParametrosDeEntradaVisualizarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada.MapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO;

public class MapeamentoDeParametrosDeEntradaTodasFunc extends TestBase{
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeParametrosDeEntradaCriarPO mapeamentoDeParametrosDeEntradaCriarPO;
	MapeamentoDeParametrosDeEntradaEditarPO mapeamentoDeParametrosDeEntradaeditarPO;
	MapeamentoDeParametrosDeEntradaVisualizarPO mapeamentoDeParametrosDeEntradaVisualizarPO;
	MapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO mapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO;
	MapeamentoDeParametrosDeEntradaExcluirPO mapeamentoDeParametrosDeEntradaExcluirPO;
	MapeamentoDeParametrosDeEntradaExcluirEmMassaPO mapeamentoDeParametrosDeEntradaExcluirEmMassaPO;
	
	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeParametrosDeEntradaCriarPO = new  MapeamentoDeParametrosDeEntradaCriarPO();
		  mapeamentoDeParametrosDeEntradaeditarPO = new  MapeamentoDeParametrosDeEntradaEditarPO();
		  mapeamentoDeParametrosDeEntradaVisualizarPO = new  MapeamentoDeParametrosDeEntradaVisualizarPO();
		  mapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO = new MapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO();
		  mapeamentoDeParametrosDeEntradaExcluirPO = new  MapeamentoDeParametrosDeEntradaExcluirPO();
		  mapeamentoDeParametrosDeEntradaExcluirEmMassaPO = new MapeamentoDeParametrosDeEntradaExcluirEmMassaPO();

	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  

	 @Test(priority = 0)
	 	public void criar() {
	 		
	 		loginTC.login();
			 acessarATRPO.acessarATR();
	 		
	 		boolean sucesso = mapeamentoDeParametrosDeEntradaCriarPO.criar();
			assertTrue(sucesso, Criar);
			sleep(2000);
	 		
	 	}
	@Test(priority = 1)
	 	public void editar() {
	 		
	 		boolean sucesso = mapeamentoDeParametrosDeEntradaeditarPO.Editar();
			assertTrue(sucesso, Editar);
			sleep(2000);
	 		
	 	}
	@Test(priority = 2 )
	 	public void visualizar() {
	 		
	 		ArrayList<Boolean> sucesso = mapeamentoDeParametrosDeEntradaVisualizarPO.visualizar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), visualizar);
				
			}
	 		sleep(2000);
	 	}
		
	@Test(priority = 3)
		public void filtro() {
			
			boolean sucesso = mapeamentodeParâmetrosdeEntradaFiltroporIDLimparPO.filtro();
			assertTrue(sucesso, Filtros);
			sleep(2000);
		}
		
		@Test(priority = 4)
	 	public void Excluir() {
	
	 		boolean sucesso =  mapeamentoDeParametrosDeEntradaExcluirPO.excluir();
			assertTrue(sucesso, Eliminado);
			sleep(2000);
	 		
	 	}
		
		@Test(priority = 5)
		public void criarMassa() {

			boolean sucesso = mapeamentoDeParametrosDeEntradaExcluirEmMassaPO.criar();
			assertTrue(sucesso, Criar);
			sleep(1000);
		}
		
		@Test(dependsOnMethods = "criarMassa")
		public void excluir() {
			
			boolean sucesso2 = mapeamentoDeParametrosDeEntradaExcluirEmMassaPO.excluir();
			assertTrue(sucesso2, Eliminado);
			sleep(2000);
		}
	
}
