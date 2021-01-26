package com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPExcluirEnMasaPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL.ValoresParaMetodoPRLExcluirEmMasaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ModeloDeApuracaoTPExcluirEnMasa extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	ModeloDeApuracaoTPExcluirEnMasaPO  modeloDeApuracaoTPExcluirEnMasaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  modeloDeApuracaoTPExcluirEnMasaPO = new ModeloDeApuracaoTPExcluirEnMasaPO();
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
  public void excluirEnMasaModeloApuracaoTP() {
	  boolean sucesso = modeloDeApuracaoTPExcluirEnMasaPO.criar();
		assertTrue(sucesso, Criar);
		
	  sleep(1000);
	  
	  boolean sucesso2 = modeloDeApuracaoTPExcluirEnMasaPO.excluirEnMasaModeloApuracaoTP();
	  	assertTrue(sucesso2, Eliminado);
  }

}
