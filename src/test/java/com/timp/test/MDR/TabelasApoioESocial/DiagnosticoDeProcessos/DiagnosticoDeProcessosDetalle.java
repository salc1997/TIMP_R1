package com.timp.test.MDR.TabelasApoioESocial.DiagnosticoDeProcessos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.DiagnosticoDeProcessos.DiagnosticoDeProcessosDetallePO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class DiagnosticoDeProcessosDetalle extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DiagnosticoDeProcessosDetallePO diagnosticoDeProcessosDetallePO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		diagnosticoDeProcessosDetallePO = new DiagnosticoDeProcessosDetallePO();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test()
	public void detalle() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		
		ArrayList<Boolean> sucesso = diagnosticoDeProcessosDetallePO.Detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}

	}
}