package com.timp.test.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Bairro.BairroCriarPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabil.MapeamentoContabilCriarPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoContabilCorrecao.MapeamentoContabilCorrecaoCriarPO;

public class MapeamentoContabilCorrecaoEditar extends TestBaseSteven{

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MapeamentoContabilCorrecaoCriarPO mapeamentoContabilCorrecaoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		mapeamentoContabilCorrecaoCriarPO = new MapeamentoContabilCorrecaoCriarPO();
	}
	/*
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	*/
	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void criar() {

		mapeamentoContabilCorrecaoCriarPO.criar();
		
	}
}