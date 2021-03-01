package com.timp.test.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Executados;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;

import com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.Executados.BancodeOcorrênciasExecutadosEditarPO;
import com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.Executados.ExecutadosEditarPO;

public class ExecutadosEditar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ExecutadosEditarPO executadosEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		executadosEditarPO = new ExecutadosEditarPO();
	}

	@AfterClass
	public void afterClass() {
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
	public void executarEditar() {
		executadosEditarPO.editarExe();
		/*
		 * boolean sucesso = configuracaoEExecucaoExecutarPO.executar();
		 * assertTrue(sucesso, Criar);
		 */
	}
}
