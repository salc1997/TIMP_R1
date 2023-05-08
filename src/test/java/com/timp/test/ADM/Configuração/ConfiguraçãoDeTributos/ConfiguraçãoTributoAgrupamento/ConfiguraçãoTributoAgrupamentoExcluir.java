package com.timp.test.ADM.Configura��o.Configura��oDeTributos.Configura��oTributoAgrupamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configura��o.Configura��oDeTributos.Configura��oTributoAgrupamento.Configura��oTributoAgrupamentoExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Configura��oTributoAgrupamentoExcluir extends TestBaseSteven {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	Configura��oTributoAgrupamentoExcluirPO configura��oTributoAgrupamentoExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  loginTC = new LoginTC();
	  acessarADMPO = new AcessarADMPO();
	  configura��oTributoAgrupamentoExcluirPO = new Configura��oTributoAgrupamentoExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

	
	@Test()
	public void Excluir() {

		loginTC.login();
		acessarADMPO.acessarADM();
		
		boolean sucesso = configura��oTributoAgrupamentoExcluirPO.excluir();
		assertTrue(sucesso, Editar);

		sleep(2000);
	}

}
