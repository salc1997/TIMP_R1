package com.timp.test.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivrosCMSSTExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ParametrosParaLivroICMSSTExcluir extends TestBaseSteven {
	
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParametrosParaLivrosCMSSTExcluirPO parametrosParaLivroICMSSTVisualizarPO;
	
	
	
  @BeforeClass
  public void beforeClass() {
	  driver = initialization();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  parametrosParaLivroICMSSTVisualizarPO =new ParametrosParaLivrosCMSSTExcluirPO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test(priority = 0)
	public void login() {
		loginTC.login();
	}
	@Test(priority = 1)
	public void acessarMDR() {
		accesarMDRPO.acessarMDR();
	}

	@Test(priority = 2)
	public void Excluir() {
		boolean sucesso = parametrosParaLivroICMSSTVisualizarPO.Excluir();
		assertTrue(sucesso, Editar);
		  
	  }


}
