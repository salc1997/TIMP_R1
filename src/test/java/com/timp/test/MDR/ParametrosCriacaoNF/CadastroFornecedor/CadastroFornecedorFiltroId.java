package com.timp.test.MDR.ParametrosCriacaoNF.CadastroFornecedor;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira.InstituicaoFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheCriarPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheFiltroIdPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroFornecedor.CadastroFornecedorFiltroIdPO;

public class CadastroFornecedorFiltroId extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CadastroFornecedorFiltroIdPO cadastroFornecedorFiltroIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		cadastroFornecedorFiltroIdPO = new CadastroFornecedorFiltroIdPO();
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
	public void filtroId() {

		ArrayList<Boolean> empresa = cadastroFornecedorFiltroIdPO.filtroEmpresa();

		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}

		ArrayList<Boolean> dataInicial = cadastroFornecedorFiltroIdPO.filtroDataInicial();

		for (int i = 0; i < dataInicial.size(); i++) {
			assertTrue(dataInicial.get(i), Filtros);
		}

		ArrayList<Boolean> dataFinal = cadastroFornecedorFiltroIdPO.filtroDataFinal();
		for (int i = 0; i < dataFinal.size(); i++) {
			assertTrue(dataFinal.get(i), Filtros);
		}

	}
}