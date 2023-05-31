package com.timp.test.MDR.SCANC.OPPropiasRessarcimentos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SCANC.OPPropiasRessarcimentos.OPPropiasRessarcimentosDetalhesPO;


public class OPPropriosRessarcimentosDetalhes extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	OPPropiasRessarcimentosDetalhesPO oPPropiasRessarcimentosDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		oPPropiasRessarcimentosDetalhesPO = new OPPropiasRessarcimentosDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Detalhe() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		
		ArrayList<Boolean> sucesso = oPPropiasRessarcimentosDetalhesPO.Detalhes();
		
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}

	}

}
