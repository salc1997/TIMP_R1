package com.timp.test.TCC.FatorDeCreditamento;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.Centraliza��oDeTributos.Centraliza��oDeTributosFiltrosAvan�adosPO;
import com.sap.timp.pageObjectModel.TCC.FatorDeCreditamento.FatorDeCreditamentoFiltrosAvan�adosPO;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FatorDeCreditamentoFiltrosAvan�ados extends TestBaseCristhian{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	FatorDeCreditamentoFiltrosAvan�adosPO fatorDeCreditamentoFiltrosAvan�adosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		fatorDeCreditamentoFiltrosAvan�adosPO = new FatorDeCreditamentoFiltrosAvan�adosPO();
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
	public void Filtro() {

		fatorDeCreditamentoFiltrosAvan�adosPO.Filtros();

	}
}
