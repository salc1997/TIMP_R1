package com.timp.test.MDR.DeterminacaoDeTipoDeCondicao;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoDeTipoDeCondicao.DeterminacaoDeTipoDeCondicaoDetalhesPO;

public class DeterminacaoDeTipoDeCondicaoDetalhes extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacaoDeTipoDeCondicaoDetalhesPO determinacaoDeTipoDeCondicaoDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacaoDeTipoDeCondicaoDetalhesPO = new DeterminacaoDeTipoDeCondicaoDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test(priority = 0)
	public void login() {
		

	}

	@Test(priority = 1)
	public void acessarMDR() {

		

	}

	@Test()
	public void Detalhes() {

		loginTC.login();
		
		acessarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = determinacaoDeTipoDeCondicaoDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), Detalhes);

		}
	}

}
