package com.timp.test.DFG.Configuracoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesLixeiraExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracoesLixeiraExcluir extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ConfiguracoesLixeiraExcluirPO configuracoesLixeiraExcluirPO;
 
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		configuracoesLixeiraExcluirPO = new ConfiguracoesLixeiraExcluirPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
  @Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void dfgEntrar() {
		acessarDFGPO.acessarDFG();

	}

	@Test(priority = 2)
	public void executar() {
		
		boolean sucesso = configuracoesLixeiraExcluirPO.LixeriaExcluir();
		  assertTrue(sucesso, Editar);
		
		
	}

}
