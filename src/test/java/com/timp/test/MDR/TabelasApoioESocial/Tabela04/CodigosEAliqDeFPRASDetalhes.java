package com.timp.test.MDR.TabelasApoioESocial.Tabela04;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela04.CodigosEAliqDeFPRASDetalhesPO;

public class CodigosEAliqDeFPRASDetalhes extends TestBase {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	CodigosEAliqDeFPRASDetalhesPO codigosEAliqDeFPRASDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		accesarMDRPO = new AcessarMDRPO();
		codigosEAliqDeFPRASDetalhesPO = new CodigosEAliqDeFPRASDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhe() {
		loginTC.login();
		accesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = codigosEAliqDeFPRASDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}
}
