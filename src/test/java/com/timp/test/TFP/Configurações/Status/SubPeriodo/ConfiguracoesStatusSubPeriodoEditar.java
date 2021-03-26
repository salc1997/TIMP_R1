package com.timp.test.TFP.Configura��es.Status.SubPeriodo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configura��es.Status.SubPeriodo.ConfiguracoesStatusSubPeriodoEditarPO;

public class ConfiguracoesStatusSubPeriodoEditar extends TestBaseSteven {
	
	
	 LoginTC loginTC;
	 AcessarTFPPO acessarTFPPO;
	 ConfiguracoesStatusSubPeriodoEditarPO  configuracoesStatusSubPeriodoEditarPO;
	
	@BeforeClass
	public void beforeClass() { 
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarTFPPO = new AcessarTFPPO();
	  configuracoesStatusSubPeriodoEditarPO = new ConfiguracoesStatusSubPeriodoEditarPO();
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
	public void editar() {
		
		ArrayList<Boolean> sucesso = configuracoesStatusSubPeriodoEditarPO.editar();
		for (int i = 0; i < sucesso.size(); i++) {
			// teste pra conferir se o resultado mostrado � igual
			assertTrue(sucesso.get(i), Editar);
		}
		

	}
  
}
