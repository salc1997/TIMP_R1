package com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria.TabelaCodigoDaSituaçaoTributariaDetalhesPO;

public class HierarquiaDeCenariosDeCorreçaoDetalhes extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	HierarquiaDeCenariosDeCorreçaoDetalhesPO hierarquiaDeCenariosDeCorreçaoDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		hierarquiaDeCenariosDeCorreçaoDetalhesPO = new HierarquiaDeCenariosDeCorreçaoDetalhesPO();
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

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void Detalhes() {

		String sucesso = hierarquiaDeCenariosDeCorreçaoDetalhesPO.detalhes();

		assertEquals(sucesso, "edit", visualizaçar);
	}

}
