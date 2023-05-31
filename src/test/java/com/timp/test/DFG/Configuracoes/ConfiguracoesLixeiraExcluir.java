package com.timp.test.DFG.Configuracoes;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;
import com.sap.timp.pageObjectModel.DFG.Configuracoes.ConfiguracoesLixeiraExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguracoesLixeiraExcluir extends TestBase {
	LoginTC loginTC;
	AcessarDFGPO acessarDFGPO;
	ConfiguracoesLixeiraExcluirPO configuracoesLixeiraExcluirPO;
 
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
		loginTC = new LoginTC();
		acessarDFGPO = new AcessarDFGPO();
		configuracoesLixeiraExcluirPO = new ConfiguracoesLixeiraExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	 //driver.close();
  }
  

	@Test()
	public void Lixeria() {
		loginTC.login();
		acessarDFGPO.acessarDFG();
		boolean sucesso = configuracoesLixeiraExcluirPO.LixeriaExcluir();
		  assertTrue(sucesso, Editar);
		
		
	}

}
