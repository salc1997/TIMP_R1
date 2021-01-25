package com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo.DeterminacionRelevanciaPorMotivoExcluirEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DeterminacionRelevanciaPorMotivoExcluirEmMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO accesarMDR;
	DeterminacionRelevanciaPorMotivoExcluirEmMassaPO  determinacionRelevanciaPorMotivoExcluirEmMassaPO;
	
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  accesarMDR = new AcessarMDRPO();
	  determinacionRelevanciaPorMotivoExcluirEmMassaPO = new DeterminacionRelevanciaPorMotivoExcluirEmMassaPO();
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
  public void criar() {
	boolean sucesso = determinacionRelevanciaPorMotivoExcluirEmMassaPO.criar();
	assertTrue(sucesso, Criar);

	sleep(1000);
	

  }
  
  @Test(dependsOnMethods = "criar")
  public void excluir() {

	
	boolean sucesso2 = determinacionRelevanciaPorMotivoExcluirEmMassaPO.determinacaoDeRelevanciaPorMotivoExcluirEmMassa();
	assertTrue(sucesso2, Eliminado);
  }

  

}
