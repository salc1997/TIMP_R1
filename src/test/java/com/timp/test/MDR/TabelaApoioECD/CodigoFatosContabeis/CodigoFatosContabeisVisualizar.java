package com.timp.test.MDR.TabelaApoioECD.CodigoFatosContabeis;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis.CodigoFatosContabeisVisualizarPO;

public class CodigoFatosContabeisVisualizar extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	CodigoFatosContabeisVisualizarPO codigoFatosContabeisVisualizarPO;

	public CodigoFatosContabeisVisualizar() {
		super();
	}

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		codigoFatosContabeisVisualizarPO = new CodigoFatosContabeisVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {
		loginTC.login();
		acesarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = codigoFatosContabeisVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
	}
}
