package com.timp.test.MDR.TabelasApoioESocial.Tabela22;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASExcluirEnMasaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela22.CompatibilidadeEntreFPASExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CompatibilidadeEntreFPASExcluirEnMasa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	CompatibilidadeEntreFPASExcluirEnMasaPO compatibilidadeEntreFPASExcluirEnMasaPO;
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  compatibilidadeEntreFPASExcluirEnMasaPO = new CompatibilidadeEntreFPASExcluirEnMasaPO();
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
  public void excluirEnMasaCompatibilidadeEntreFPAS() {
	  boolean sucesso = compatibilidadeEntreFPASExcluirEnMasaPO.criar();
		assertTrue(sucesso, Criar);
		
	  sleep(1000);
	  
	  boolean sucesso2 = compatibilidadeEntreFPASExcluirEnMasaPO.excluirEnMasaCompatibilidadeEntreFPAS();
	  	assertTrue(sucesso2, Eliminado);
  }

}
