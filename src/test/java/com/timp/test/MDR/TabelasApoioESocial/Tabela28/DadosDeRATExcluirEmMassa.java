package com.timp.test.MDR.TabelasApoioESocial.Tabela28;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRVS.RegistroRVSExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela28.DadosDeRATExcluirEmMassaPO;

public class DadosDeRATExcluirEmMassa extends TestBaseEliel {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DadosDeRATExcluirEmMassaPO dadosDeRATExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		dadosDeRATExcluirEmMassaPO = new DadosDeRATExcluirEmMassaPO();
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

		boolean sucesso = dadosDeRATExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = dadosDeRATExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}
}
