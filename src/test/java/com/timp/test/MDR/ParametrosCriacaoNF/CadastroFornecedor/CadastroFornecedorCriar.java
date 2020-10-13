package com.timp.test.MDR.ParametrosCriacaoNF.CadastroFornecedor;

import static org.testng.Assert.assertTrue;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal.StatusOcorrenciaFiscalCriarPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroFornecedor.CadastroFornecedorCriarPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroNotaFiscal.CadastroNotaFiscalCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AgrupadorDeCFOP.AgrupadorDeCFOPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelasOutrosDebitosCriarPO;

public class CadastroFornecedorCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroFornecedorCriarPO cadastroFornecedorCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroFornecedorCriarPO = new CadastroFornecedorCriarPO();
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
	public void criar() {

		boolean sucesso = cadastroFornecedorCriarPO.criar();
		assertTrue(sucesso, Criar);

	}

}
