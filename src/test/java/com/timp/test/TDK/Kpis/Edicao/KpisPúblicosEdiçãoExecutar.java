package com.timp.test.TDK.Kpis.Edicao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisCartaoIndicadorEditarPO;
import com.sap.timp.pageObjectModel.TDK.Kpis.Edicao.KpisPúblicosEdiçãoExecutarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class KpisPúblicosEdiçãoExecutar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	KpisPúblicosEdiçãoExecutarPO kpisPúblicosEdiçãoExecutarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		kpisPúblicosEdiçãoExecutarPO = new KpisPúblicosEdiçãoExecutarPO();
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
	public void executar() {

		boolean sucesso = kpisPúblicosEdiçãoExecutarPO.Grafico();
		assertTrue(sucesso, Editar);

	}

}
