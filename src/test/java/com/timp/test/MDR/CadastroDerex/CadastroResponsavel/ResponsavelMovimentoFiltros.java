package com.timp.test.MDR.CadastroDerex.CadastroResponsavel;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.CadastroResponsavel.*;

public class ResponsavelMovimentoFiltros extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ResponsavelMovimentoFiltrosPO responsavelMovimentoFiltrosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		responsavelMovimentoFiltrosPO = new ResponsavelMovimentoFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtros() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = responsavelMovimentoFiltrosPO.filtros();
		System.out.println(sucesso);
		assertTrue(sucesso, Criar);
		sleep(2000);
	}

}
