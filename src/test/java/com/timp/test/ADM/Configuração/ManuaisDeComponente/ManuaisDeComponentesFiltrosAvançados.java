package com.timp.test.ADM.Configuração.ManuaisDeComponente;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.AcessarADMPO;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.ADM.Configuração.ManuaisDeComponente.ManuaisDeComponentesFiltrosAvançadosPO;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.ExecucoesExecucoesPublicasFiltrosAvaPO;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ManuaisDeComponentesFiltrosAvançados extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarADMPO acessarADMPO;
	ManuaisDeComponentesFiltrosAvançadosPO manuaisDeComponentesFiltrosAvançadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarADMPO = new AcessarADMPO();
		manuaisDeComponentesFiltrosAvançadosPO = new ManuaisDeComponentesFiltrosAvançadosPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarADMPO.acessarADM();

	}

	@Test(priority = 2)
	public void filtros() {

		// codigoTipoCreditoFiltrosAvançadosPO.filtros();

		ArrayList<Boolean> sucesso = manuaisDeComponentesFiltrosAvançadosPO.detalhes();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}

	}
}
