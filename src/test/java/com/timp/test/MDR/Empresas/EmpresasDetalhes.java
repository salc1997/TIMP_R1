package com.timp.test.MDR.Empresas;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseEliel;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Empresas.EmpresasDetallePO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisCriarPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais.LivrosFiscaisDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST.ParametrosParaLivroICMSSTCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaOutrosDebitos.TabelaOutrosDebitosVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Municipio.MunicipioDetallePO;
import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Municipio.MunicipioVisualizarPO;

public class EmpresasDetalhes extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	EmpresasDetallePO empresasDetallePO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		empresasDetallePO = new EmpresasDetallePO();
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
	public void detalhes() {

		ArrayList<Boolean> sucesso = empresasDetallePO.Detalle();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
