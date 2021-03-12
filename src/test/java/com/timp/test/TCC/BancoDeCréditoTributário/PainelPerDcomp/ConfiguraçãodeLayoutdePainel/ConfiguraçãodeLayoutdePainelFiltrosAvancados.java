package com.timp.test.TCC.BancoDeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainel;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoFiltrosAvan�adosPO;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCr�ditoTribut�rio.PainelPerDcomp.Configura��odeLayoutdePainel.Configura��odeLayoutdePainelFiltrosAvancadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Configura��odeLayoutdePainelFiltrosAvancados extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Configura��odeLayoutdePainelFiltrosAvancadosPO configura��odeLayoutdePainelFiltrosAvancadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configura��odeLayoutdePainelFiltrosAvancadosPO = new Configura��odeLayoutdePainelFiltrosAvancadosPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarTCCPO.acessarTCC();

	}

	@Test(priority = 2)
	public void filtros() {

		// codigoTipoCreditoFiltrosAvan�adosPO.filtros();

		ArrayList<Boolean> sucesso = configura��odeLayoutdePainelFiltrosAvancadosPO.filtros();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}

	}
}
