package com.timp.test.MDR.TabelasApoioSped.InformaçoesAdicionais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.InformaçoesAdicionais.InformaçoesAdicionaisVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class InformaçoesAdicionaisVisualizar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	InformaçoesAdicionaisVisualizarPO informaçoesAdicionaisVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		informaçoesAdicionaisVisualizarPO = new InformaçoesAdicionaisVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = informaçoesAdicionaisVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
	}

}
