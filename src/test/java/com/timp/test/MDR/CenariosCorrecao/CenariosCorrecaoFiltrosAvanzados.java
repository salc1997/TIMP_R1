package com.timp.test.MDR.CenariosCorrecao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKathy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CenariosCorrecao.CenariosCorrecaoFiltrosAvanzadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CenariosCorrecaoFiltrosAvanzados extends TestBaseKathy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CenariosCorrecaoFiltrosAvanzadosPO cenariosCorrecaoFiltrosAvanzadosPO;
 
	@BeforeClass
	public void beforeClass() {
		driver = initializationK();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cenariosCorrecaoFiltrosAvanzadosPO = new CenariosCorrecaoFiltrosAvanzadosPO();
	}

	@AfterClass
	public void afterClass() {
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
	public void filtros() {
		ArrayList<Boolean> sucesso = cenariosCorrecaoFiltrosAvanzadosPO.tributo();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter attribute aren't equal");
		}

		ArrayList<Boolean> sucesso2 = cenariosCorrecaoFiltrosAvanzadosPO.usuario();
		sleep(2000);
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), "The results in the filter user aren't equal");
		}

		ArrayList<Boolean> sucesso4 = cenariosCorrecaoFiltrosAvanzadosPO.usuarioModificado();
		sleep(2000);
		for (int i = 0; i < sucesso4.size(); i++) {
			assertTrue(sucesso4.get(i), "The results in the filter user modified aren't equal");
		}

	}
}
