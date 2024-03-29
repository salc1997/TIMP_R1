package com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaDetalhesPO;

public class HierarquiaDeCenariosDeCorreçaoDetalhes extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	HierarquiaDeCenariosDeCorreçaoDetalhesPO hierarquiaDeCenariosDeCorreçaoDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		hierarquiaDeCenariosDeCorreçaoDetalhesPO = new HierarquiaDeCenariosDeCorreçaoDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Detalhes() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = hierarquiaDeCenariosDeCorreçaoDetalhesPO.detalhes();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		// assertEquals(sucesso, "edit", visualizaçar);
	}

}
