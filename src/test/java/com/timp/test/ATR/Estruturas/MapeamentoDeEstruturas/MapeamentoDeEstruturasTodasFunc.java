package com.timp.test.ATR.Estruturas.MapeamentoDeEstruturas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasCriarComCopiaPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasCriarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasEditarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasExcluirPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasFiltroPorIDPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentoDeEstruturasVisualizarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas.MapeamentodeEstruturasExcluirMassaPO;

public class MapeamentoDeEstruturasTodasFunc extends TestBase {
 
	
	LoginTC loginTC;
	AcessarATRPO acessarATRPO;
	MapeamentoDeEstruturasCriarPO mapeamentoDeEstruturasCriarPO;
	MapeamentoDeEstruturasCriarComCopiaPO mapeamentoDeEstruturasCriarComCopiaPO;
	MapeamentoDeEstruturasEditarPO mapeamentoDeEstruturasEditarPO;
	MapeamentoDeEstruturasVisualizarPO mapeamentoDeEstruturasVisualizarPO;
	MapeamentoDeEstruturasFiltroPorIDPO mapeamentoDeEstruturasFiltroPorIDPO;
	MapeamentoDeEstruturasExcluirPO mapeamentoDeEstruturasExcluirPO;
	MapeamentodeEstruturasExcluirMassaPO mapeamentodeEstruturasExcluirMassaPO;
	
	

	
	@BeforeClass
	  public void beforeClass() {
		  
		  driver = initialization();
		  loginTC = new LoginTC();
		  acessarATRPO = new AcessarATRPO();
		  mapeamentoDeEstruturasCriarPO = new  MapeamentoDeEstruturasCriarPO();
		  mapeamentoDeEstruturasCriarComCopiaPO = new  MapeamentoDeEstruturasCriarComCopiaPO();
		  mapeamentoDeEstruturasEditarPO = new  MapeamentoDeEstruturasEditarPO();
		  mapeamentoDeEstruturasVisualizarPO = new  MapeamentoDeEstruturasVisualizarPO();
		  mapeamentoDeEstruturasFiltroPorIDPO = new  MapeamentoDeEstruturasFiltroPorIDPO();
		  mapeamentoDeEstruturasExcluirPO = new  MapeamentoDeEstruturasExcluirPO();
		  mapeamentodeEstruturasExcluirMassaPO = new MapeamentodeEstruturasExcluirMassaPO();
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	 
	 @Test(priority = 0)
	 	public void criar() {
	 		
	 		loginTC.login();
	 		 acessarATRPO.acessarATR();
	 		
	 		boolean sucesso = mapeamentoDeEstruturasCriarPO.criar();
			assertTrue(sucesso, Criar);
		
			sleep(2000);
	 	}
	 @Test(priority = 1)
	 	public void criarcopia() {
	 		
	 	
	 		ArrayList<Boolean> sucesso = mapeamentoDeEstruturasCriarComCopiaPO.criarcopia();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Criar);
			}
			
	 		sleep(2000);
	 	}
	 @Test(priority = 2)
	 	public void editar() {
	 		
	 		ArrayList<Boolean> sucesso = mapeamentoDeEstruturasEditarPO.editar();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Editar);
				
			}
			
	 		sleep(2000);
	 	}
	 
	 @Test(priority = 3)
	 public void visualizar() {
	 			 		
	 	ArrayList<Boolean> sucesso = mapeamentoDeEstruturasVisualizarPO.visualizar();
	 	for (int i = 0; i < sucesso.size(); i++) {
	 		assertTrue(sucesso.get(i), visualizar);
				
		}
	 	sleep(2000);
	 }
	 
	
	 @Test(priority = 4)
	 	public void filtro() {
	 		
	 	ArrayList<Boolean> sucesso = mapeamentoDeEstruturasFiltroPorIDPO.filtro();
	 		for (int i = 0; i < sucesso.size(); i++) {
	 			assertTrue(sucesso.get(i), Filtros);
			}
			
	 		sleep(2000);
	 		
	 	}
	 @Test(priority = 5)
	 	public void excluir() {
	 
	 		boolean sucesso = mapeamentoDeEstruturasExcluirPO.excluir();
			assertTrue(sucesso, Eliminado);
			sleep(2000);
	 		
	 	}
	 @Test(priority = 6)
		public void CriarMassa() {

			ArrayList<Boolean> sucesso = mapeamentodeEstruturasExcluirMassaPO.criar();
			for (int i = 0; i < sucesso.size(); i++) {
				assertTrue(sucesso.get(i), Criar);
			}
			sleep(2000);

		}
		
	@Test(dependsOnMethods = "CriarMassa")
		public void excluirMasa() {
			
			boolean sucesso2 = mapeamentodeEstruturasExcluirMassaPO.excluirMasaMotivosDesligamento();
			assertTrue(sucesso2, Eliminado);
			sleep(2000);
		}
}
