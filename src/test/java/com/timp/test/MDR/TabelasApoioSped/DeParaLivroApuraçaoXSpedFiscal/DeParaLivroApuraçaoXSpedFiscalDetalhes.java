package com.timp.test.MDR.TabelasApoioSped.DeParaLivroApurašaoXSpedFiscal;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApurašaoXSpedFiscal.DeParaLivroApurašaoXSpedFiscalDetalhesPO;

public class DeParaLivroApurašaoXSpedFiscalDetalhes extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeParaLivroApurašaoXSpedFiscalDetalhesPO deParaLivroApurašaoXSpedFiscalDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deParaLivroApurašaoXSpedFiscalDetalhesPO = new DeParaLivroApurašaoXSpedFiscalDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhes() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		ArrayList<Boolean> sucesso = deParaLivroApurašaoXSpedFiscalDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), Detalhes);

		}
	}

}
