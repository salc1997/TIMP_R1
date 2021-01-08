package com.timp.test.ATR.CopiaEstruturasrelacionamento.RelacionamentoEstruturas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ATR.AcessarATRPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasCriarComCopiaPO;
import com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas.RelacionamentoEstruturasCriarPO;
import com.sap.timp.pageObjectModel.BPMA.AcessarBPMAPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RelacionamentoEstruturasCriarComCopia extends TestBaseSteven{
	LoginTC loginTC;
	AcessarATRPO acessarATRPO ;
	RelacionamentoEstruturasCriarComCopiaPO relacionamentoEstruturasCriarComCopiaPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarATRPO = new AcessarATRPO();
	  relacionamentoEstruturasCriarComCopiaPO = new RelacionamentoEstruturasCriarComCopiaPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 1)
 	public void login() {
 		loginTC.login();

 	}

 	@Test(priority = 2)
 	public void ATREntrar() {

 		boolean sucesso = acessarATRPO.acessarATR();

 	}

 	@Test(priority = 3)
 	public void criarCopia() {

 		ArrayList<Boolean> sucesso =relacionamentoEstruturasCriarComCopiaPO.criar();
 		
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

 	}
 	
 	
 	@Test(priority = 4)
 	public void editarCopia() {
 		
 		ArrayList<Boolean> sucesso =relacionamentoEstruturasCriarComCopiaPO.editar();
 		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), editado);
		}
 		

 	}
 	
 	@Test(priority = 5)
 	public void excluirCopia() {
 		
 		boolean sucesso =relacionamentoEstruturasCriarComCopiaPO.excluir();

 		assertTrue(sucesso, Eliminado);
	
 		

 	}
 	
}
