package com.timp.test.TFP.Configuracoes.Status.SubPeriodo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configuracoes.Status.SubPeriodo.ConfiguracoesStatusSubPeriodoEditarPO;

public class ConfiguracoesStatusSubPeriodoEditar extends TestBase {
	
	
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
	
 
	
	@Test()
	public void editar() {
		
		loginTC.login();
		acessarTFPPO.acessarTFP();
		
		ArrayList<Boolean> sucesso = configuracoesStatusSubPeriodoEditarPO.editar();
		for (int i = 0; i < sucesso.size(); i++) {
			// teste pra conferir se o resultado mostrado � igual
			assertTrue(sucesso.get(i), Editar);
		}
		

	}
  
}
