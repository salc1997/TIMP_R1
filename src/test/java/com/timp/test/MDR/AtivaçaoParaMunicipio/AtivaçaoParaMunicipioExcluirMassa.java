package com.timp.test.MDR.Ativa�aoParaMunicipio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ativa�aoParaMunicipio.Ativa�aoParaMunicipioExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Ativa�aoParaMunicipioExcluirMassa extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Ativa�aoParaMunicipioExcluirMassaPO ativa�aoParaMunicipioExcluirMassaPO;
	
  
  @BeforeClass
  public void beforeClass() {
	 driver = initialization();
	loginTC = new LoginTC();
	acessarMDRPO = new AcessarMDRPO();
	ativa�aoParaMunicipioExcluirMassaPO = new Ativa�aoParaMunicipioExcluirMassaPO();
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
  }

  @Test()
	public void ExcluirMassa() {

		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = ativa�aoParaMunicipioExcluirMassaPO.ExcluirMassa();
		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
