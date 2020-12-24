package com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo.DeterminacionRelevanciaPorMotivoExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela16.SGDPExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class DeterminacionRelevanciaPorMotivoExcluir extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeterminacionRelevanciaPorMotivoExcluirPO determinacionRelevanciaPorMotivoExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		determinacionRelevanciaPorMotivoExcluirPO = new DeterminacionRelevanciaPorMotivoExcluirPO();
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
		acessarMDRPO.acessarMDR();
	}
	
	@Test(priority = 2)
	public void excluir() {
		boolean sucesso = determinacionRelevanciaPorMotivoExcluirPO.excluir();
		assertTrue(sucesso, Criar);
	}

}
