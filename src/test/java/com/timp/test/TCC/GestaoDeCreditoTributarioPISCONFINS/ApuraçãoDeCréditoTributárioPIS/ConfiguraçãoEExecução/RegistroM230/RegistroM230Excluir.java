package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.Apura��oDeCr�ditoTribut�rioPIS.Configura��oEExecu��o.RegistroM230;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.Apura��oDeCr�ditoTribut�rioPIS.Configura��oEExecu��o.RegistroM230.RegistroM230ExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegistroM230Excluir extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	RegistroM230ExcluirPO registroM230ExcluirPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM230ExcluirPO = new RegistroM230ExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
 
	@Test()
	public void excluir() {
		
		loginTC.login();
		
		acessarTCCPO.acessarTCC();
		
 		boolean sucesso = registroM230ExcluirPO.excluir();

		assertTrue(sucesso, Criar);
		
	}

}
