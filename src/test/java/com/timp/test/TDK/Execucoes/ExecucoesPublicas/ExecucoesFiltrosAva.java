package com.timp.test.TDK.Execucoes.ExecucoesPublicas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainelFiltrosAvancadosPO;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas.ExecucoesFiltrosAvaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ExecucoesFiltrosAva extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	ExecucoesFiltrosAvaPO execucoesFiltrosAvaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		execucoesFiltrosAvaPO = new ExecucoesFiltrosAvaPO();
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

		acessarTDKPO.acessarTDK();

	}

	@Test(priority = 2)
	public void filtros() {

		// codigoTipoCreditoFiltrosAvançadosPO.filtros();

		ArrayList<Boolean> sucesso = execucoesFiltrosAvaPO.detalhes();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}

	}

}
