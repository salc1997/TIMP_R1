package com.timp.test.ATR.Estruturas.RelacionamentoEstruturas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasCriarComCopiaPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasCriarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasEditarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasExcluirPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasVisualizarPO;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RelacionamentoEstruturasTodasFunc extends TestBase{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO ;
	RelacionamentoEstruturasCriarPO relacionamentoEstruturasCriarPO;
	RelacionamentoEstruturasCriarComCopiaPO relacionamentoEstruturasCriarComCopiaPO;
	RelacionamentoEstruturasEditarPO relacionamentoEstruturasEditarPO;
	RelacionamentoEstruturasVisualizarPO relacionamentoEstruturasVisualizarPO;
	RelacionamentoEstruturasExcluirPO relacionamentoEstruturasExcluirPO;
	RelacionamentoEstruturasExcluirEmMassaPO relacionamentoEstruturasExcluirEmMassaPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarATRPO = new AcessarATRPO();
	  relacionamentoEstruturasCriarPO = new RelacionamentoEstruturasCriarPO();
	  relacionamentoEstruturasCriarComCopiaPO = new RelacionamentoEstruturasCriarComCopiaPO();
	  relacionamentoEstruturasEditarPO = new RelacionamentoEstruturasEditarPO();
	  relacionamentoEstruturasVisualizarPO = new RelacionamentoEstruturasVisualizarPO();
	  relacionamentoEstruturasExcluirPO = new RelacionamentoEstruturasExcluirPO();
	  relacionamentoEstruturasExcluirEmMassaPO = new RelacionamentoEstruturasExcluirEmMassaPO();
  }

  @AfterClass
  public void afterClass() {
	 driver.close();
  }
 
	@Test(priority = 0)
 	public void criarRelacionamento() {
 		
 		loginTC.login();
		 acessarATRPO.acessarATR();

 		ArrayList<Boolean> sucesso = relacionamentoEstruturasCriarPO.criar();
 		
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
 		sleep(2000);
 	}

 	

	@Test(priority = 1)
 	public void criarCopia() {		 
 		ArrayList<Boolean> sucesso = relacionamentoEstruturasCriarComCopiaPO.criar();
 		
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
 		sleep(2000);
 	}
 	
 	
 	@Test(dependsOnMethods = "criarCopia")
 	public void editarCopia() {
 		
 		ArrayList<Boolean> sucesso = relacionamentoEstruturasCriarComCopiaPO.editar();
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), editado);
		}
 		
 		sleep(2000);
 	}
 	
 	@Test(dependsOnMethods = "editarCopia")
 	public void excluirCopia() {
 		
 		boolean sucesso = relacionamentoEstruturasCriarComCopiaPO.excluir();

 		assertTrue(sucesso, Eliminado);
	
 		sleep(2000);

 	}
 	
	@Test(priority = 2)
 	public void EditarRelacionamento() {


 		ArrayList<Boolean> sucesso = relacionamentoEstruturasEditarPO.editar();
 		
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), editado);
		}
 		sleep(2000);

 	}
	
	@Test(priority = 3)
 	public void VisualizarRelacionamento() {
 	 		
 		ArrayList<Boolean> sucesso = relacionamentoEstruturasVisualizarPO.visualizar();
 		
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
 		
 		sleep(2000);
 	}
	
	@Test(priority = 4)
 	public void excluir() {
 		
 	
 		boolean sucesso =relacionamentoEstruturasExcluirPO.excluir();

 		assertTrue(sucesso, Eliminado);
	
 		sleep(2000);

 	}
	
	@Test(priority = 5)
	public void criarMasa() {
		
		boolean sucesso = relacionamentoEstruturasExcluirEmMassaPO.criar();
		assertTrue(sucesso,Criar);
		sleep(2000);
	}

	@Test(dependsOnMethods = "criarMasa")
	public void excluirMassa() {
		boolean sucesso = relacionamentoEstruturasExcluirEmMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
