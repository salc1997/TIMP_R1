package com.timp.test.MDR.TabelasApoioESocial.Tabela10;

import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela10.TiposDeLotacaoTributariaExcluirEmMassaPO;

public class TiposDeLotacaoTributarioExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	TiposDeLotacaoTributariaExcluirEmMassaPO tiposDeLotacaoTributariaExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		tiposDeLotacaoTributariaExcluirEmMassaPO = new TiposDeLotacaoTributariaExcluirEmMassaPO();
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
	public void criar() {

		boolean sucesso = tiposDeLotacaoTributariaExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = tiposDeLotacaoTributariaExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}