package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguracaoConfiguracaoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfiguraçãoConfiguraçãoEditar extends TestBase {

	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguracaoConfiguracaoEditarPO parametrosGeraisConfiguraçãoEditarPO;
	
  @BeforeClass
  public void beforeClass() {
	driver = initialization();
	loginTC = new LoginTC();
	acessarBCBPO = new AcessarBCBPO();
	parametrosGeraisConfiguraçãoEditarPO = new ParametrosGeraisConfiguracaoConfiguracaoEditarPO();
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }


  @Test()
  public void editar() {
	  loginTC.login();
		acessarBCBPO.acessar();
		
	//  parametrosGeraisConfiguraçãoEditarPO.editar();
	  
	boolean sucesso = parametrosGeraisConfiguraçãoEditarPO.editar();

	assertTrue(sucesso, Editar);
	
	sleep(3000);

  }

}
