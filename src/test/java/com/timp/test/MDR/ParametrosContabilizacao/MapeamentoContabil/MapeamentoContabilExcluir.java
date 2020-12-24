package com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabil;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Bairro.BairroCriarPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabil.MapeamentoContabilCriarPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabil.MapeamentoContabilEditarPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabil.MapeamentoContabilExcluirPO;

public class MapeamentoContabilExcluir extends TestBaseCristhian {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MapeamentoContabilExcluirPO mapeamentoContabilExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationC();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		mapeamentoContabilExcluirPO = new MapeamentoContabilExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
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

		boolean sucesso = mapeamentoContabilExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
	}
}
