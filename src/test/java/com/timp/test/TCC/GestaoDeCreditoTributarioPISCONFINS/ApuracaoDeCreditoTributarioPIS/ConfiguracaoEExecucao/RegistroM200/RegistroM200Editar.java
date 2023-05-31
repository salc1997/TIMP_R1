package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM200;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM200.RegistroM200EditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegistroM200Editar extends TestBase {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	RegistroM200EditarPO registroM200EditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registroM200EditarPO = new RegistroM200EditarPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void editar() {

		loginTC.login();

		acessarTCCPO.acessarTCC();

		boolean sucesso = registroM200EditarPO.editar();

		assertTrue(sucesso, Criar);
	}

}
