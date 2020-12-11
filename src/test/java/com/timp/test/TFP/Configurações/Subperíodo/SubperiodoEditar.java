package com.timp.test.TFP.Configurações.Subperíodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Subperíodo.SubperiodoEditarPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Subperíodo.SubperíodoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SubperiodoEditar  extends TestBaseKenssy {
	 LoginTC loginTC;
	  AcessarTFPPO acessarTFPPO;
	  SubperiodoEditarPO subperiodoEditarPO;

	 @BeforeClass
	 public void beforeClass() {
		  driver = initializationKen();
		  loginTC = new LoginTC();
		  acessarTFPPO = new AcessarTFPPO();
		  subperiodoEditarPO = new  SubperiodoEditarPO();
	 }
	
	 @AfterClass
	 public void afterClass() {
	 }
 
	 @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void TFPEntrar() {
		 acessarTFPPO .acessarTFP();
	}
	
	@Test(priority = 2)
	public void criar() {
		boolean sucesso = subperiodoEditarPO.editar();

		// teste pra conferir se o resultado mostrado é igual
		assertTrue(sucesso, Editar);
	}


}
