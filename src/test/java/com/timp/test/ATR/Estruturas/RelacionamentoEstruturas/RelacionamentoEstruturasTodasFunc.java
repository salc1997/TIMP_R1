package com.timp.test.ATR.Estruturas.RelacionamentoEstruturas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasCriarPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasTodasFuncPO;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RelacionamentoEstruturasTodasFunc extends TestBaseSteven{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO ;
	RelacionamentoEstruturasTodasFuncPO relacionamentoEstruturasTodasFuncPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarATRPO = new AcessarATRPO();
	  relacionamentoEstruturasTodasFuncPO = new RelacionamentoEstruturasTodasFuncPO();
  }

  @AfterClass
  public void afterClass() {
	 driver.close();
  }
 
	@Test(priority = 0)
 	public void criarRelacionamento() {
 		
 		loginTC.login();
		 acessarATRPO.acessarATR();

 		ArrayList<Boolean> sucesso = relacionamentoEstruturasTodasFuncPO.criar();
 		
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
 		sleep(2000);
 	}

 	

	@Test(priority = 1)
 	public void criarCopia() {		 
 		ArrayList<Boolean> sucesso = relacionamentoEstruturasTodasFuncPO.criarCopia();
 		
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
 		sleep(2000);
 	}
 	
 	
 	@Test(dependsOnMethods = "criarCopia")
 	public void editarCopia() {
 		
 		ArrayList<Boolean> sucesso = relacionamentoEstruturasTodasFuncPO.editarCopia();
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), editado);
		}
 		
 		sleep(2000);
 	}
 	
 	@Test(dependsOnMethods = "editarCopia")
 	public void excluirCopia() {
 		
 		boolean sucesso = relacionamentoEstruturasTodasFuncPO.excluirCopia();

 		assertTrue(sucesso, Eliminado);
	
 		sleep(2000);

 	}
 	
	@Test(priority = 2)
 	public void EditarRelacionamento() {


 		ArrayList<Boolean> sucesso = relacionamentoEstruturasTodasFuncPO.editar();
 		
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), editado);
		}
 		sleep(2000);

 	}
	
	@Test(priority = 3)
 	public void VisualizarRelacionamento() {
 	 		
 		ArrayList<Boolean> sucesso =relacionamentoEstruturasTodasFuncPO.visualizar();
 		
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
 		
 		sleep(2000);
 	}
	
	@Test(priority = 4)
 	public void excluir() {
 		
 	
 		boolean sucesso = relacionamentoEstruturasTodasFuncPO.excluir();

 		assertTrue(sucesso, Eliminado);
	
 		sleep(2000);

 	}
	
	@Test(priority = 5)
	public void criarMasa() {
		
		boolean sucesso = relacionamentoEstruturasTodasFuncPO.criarMassa();
		assertTrue(sucesso,Criar);
		sleep(2000);
	}

	@Test(dependsOnMethods = "criarMasa")
	public void excluirMassa() {
		boolean sucesso = relacionamentoEstruturasTodasFuncPO.exluirMassa();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
