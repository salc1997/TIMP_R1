package com.timp.test.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra.DeterminacaoDeRelevanciaPorRegraExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DeterminacaoDeRelevanciaPorRegraExcluirEmMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	DeterminacaoDeRelevanciaPorRegraExcluirEmMassaPO  determinacaoDeRelevanciaPorRegraExcluirEmMassaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  determinacaoDeRelevanciaPorRegraExcluirEmMassaPO = new DeterminacaoDeRelevanciaPorRegraExcluirEmMassaPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test(priority = 0)
  public void ingresar() {
	  loginTC.login();
  }
  
  @Test(priority = 1)
  public void mdrEntrar() {
	 accesarMDR.acessarMDR();

  }
  
  @Test(priority = 2)
  public void excluirEmMassa() {
	boolean sucesso = determinacaoDeRelevanciaPorRegraExcluirEmMassaPO.criar();
	assertTrue(sucesso, Criar);
	sleep(1000);
	
	boolean sucesso2 = determinacaoDeRelevanciaPorRegraExcluirEmMassaPO.determinacaoDeRelevanciaPorRegraExcluirEmMassa();
	assertTrue(sucesso2, Eliminado);
  }

}