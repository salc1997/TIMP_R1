package com.timp.test.MDR.SCANC.OPPropiasRessarcimentos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.OPPropiasRessarcimentos.OPPropiasRessarcimentosVisualizarPO;


public class OPPropriosRessarcimentosVisualizar extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	OPPropiasRessarcimentosVisualizarPO oPPropiasRessarcimentosVisualizarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		oPPropiasRessarcimentosVisualizarPO = new OPPropiasRessarcimentosVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		
		ArrayList<Boolean> sucesso = oPPropiasRessarcimentosVisualizarPO.Visualizar();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}

	}

}
