package com.timp.test.MDR.TabelasApoioESocial.Tabela24;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela16.SGDPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela24.Codifica��oDeAcDeTrabCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Codifica��oDeAcDeTrabCriar extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Codifica��oDeAcDeTrabCriarPO codifica��oDeAcDeTrabCriarPO;
	
  @BeforeClass
  public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codifica��oDeAcDeTrabCriarPO = new Codifica��oDeAcDeTrabCriarPO();
  }

  @AfterClass
  public void afterClass() {
	  
  }

  @Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}
	@Test(priority = 2)
	public void criar() {

		boolean sucesso = codifica��oDeAcDeTrabCriarPO.criar();

		assertTrue(sucesso, Criar);

	}
}
