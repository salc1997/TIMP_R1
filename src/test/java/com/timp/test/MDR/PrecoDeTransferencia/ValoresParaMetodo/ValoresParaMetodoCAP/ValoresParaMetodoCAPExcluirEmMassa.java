package com.timp.test.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoCAP.ValoresParaMetodoCAPExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ValoresParaMetodoCAPExcluirEmMassa extends TestBaseKenssy{
 
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	 ValoresParaMetodoCAPExcluirEmMassaPO valoresParaMetodoCAPExcluirEmMassaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  valoresParaMetodoCAPExcluirEmMassaPO = new ValoresParaMetodoCAPExcluirEmMassaPO();
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
	boolean sucesso = valoresParaMetodoCAPExcluirEmMassaPO.criar();
	assertTrue(sucesso, Criar);
	sleep(1000);
	boolean sucesso2 = valoresParaMetodoCAPExcluirEmMassaPO.valoresParaMetodoCAPExcluirEmMassa();
	assertTrue(sucesso2, Eliminado);
  }

}