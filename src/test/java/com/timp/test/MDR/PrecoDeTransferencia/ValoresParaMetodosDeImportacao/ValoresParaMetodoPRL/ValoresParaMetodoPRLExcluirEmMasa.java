package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLExcluirEmMasaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ValoresParaMetodoPRLExcluirEmMasa extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	ValoresParaMetodoPRLExcluirEmMasaPO  valoresParaMetodoPRLExcluirEmMasaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  valoresParaMetodoPRLExcluirEmMasaPO = new ValoresParaMetodoPRLExcluirEmMasaPO();
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
	  boolean sucesso = valoresParaMetodoPRLExcluirEmMasaPO.criar();
		assertTrue(sucesso, Criar);
		
	  sleep(1000);
	  
	  boolean sucesso2 = valoresParaMetodoPRLExcluirEmMasaPO.excluirEmMasaValoresParaMetodoPRL();
	  	assertTrue(sucesso2, Eliminado);
  }

}
