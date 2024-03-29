package com.timp.test.TDK.Kpis.Edicao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisLinksRapidosExcluirPO;

public class KpisLinksRapidosExcluir extends TestBase {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisLinksRapidosExcluirPO kpisLinksRapidosExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisLinksRapidosExcluirPO = new KpisLinksRapidosExcluirPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void linkrapidoexcluir() {
		loginTC.login();
		acessarTDKPO.acessarTDK();
		
		boolean sucesso = kpisLinksRapidosExcluirPO.linksrapidosexcluir();
		assertTrue(sucesso, "O link n�o foi excluido");
	}
}
