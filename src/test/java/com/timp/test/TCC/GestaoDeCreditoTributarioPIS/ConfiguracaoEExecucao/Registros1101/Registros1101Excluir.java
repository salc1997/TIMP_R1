package com.timp.test.TCC.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registros1101;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao.ConfiguracaoEExecucaoExcluirPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registros1101.Registros1101ExcluirPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class Registros1101Excluir extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Registros1101ExcluirPO registros1101ExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		registros1101ExcluirPO = new Registros1101ExcluirPO();
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
	public void acessarTCC() {

		acessarTCCPO.acessarTCC();

	}

	@Test(priority = 2)
	public void Excluir() {

		boolean sucesso = registros1101ExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
	}
}
