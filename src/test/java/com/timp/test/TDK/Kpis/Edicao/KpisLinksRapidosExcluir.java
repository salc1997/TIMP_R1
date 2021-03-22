package com.timp.test.TDK.Kpis.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisLinksRapidosExcluirPO;

public class KpisLinksRapidosExcluir extends TestBaseEliel {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisLinksRapidosExcluirPO kpisLinksRapidosExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationE();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisLinksRapidosExcluirPO = new KpisLinksRapidosExcluirPO();

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
	public void acessarTDK() {
		acessarTDKPO.acessarTDK();
	}

	@Test(priority = 2)
	public void linkrapidoexcluir() {

		boolean sucesso = kpisLinksRapidosExcluirPO.linksrapidosexcluir();

		assertTrue(sucesso, "O link não foi excluido");

	}

}
