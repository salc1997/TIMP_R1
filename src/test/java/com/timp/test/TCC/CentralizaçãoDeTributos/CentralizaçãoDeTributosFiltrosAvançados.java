package com.timp.test.TCC.Centraliza��oDeTributos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao.ConfiguracaoEExecucaoFiltrosAvan�adosPO;
import com.sap.timp.pageObjectModel.TCC.Centraliza��oDeTributos.Centraliza��oDeTributosFiltrosAvan�adosPO;

public class Centraliza��oDeTributosFiltrosAvan�ados extends TestBaseCristhian{

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	Centraliza��oDeTributosFiltrosAvan�adosPO centraliza��oDeTributosFiltrosAvan�adosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		centraliza��oDeTributosFiltrosAvan�adosPO = new Centraliza��oDeTributosFiltrosAvan�adosPO();
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

		centraliza��oDeTributosFiltrosAvan�adosPO.Filtros();

	}
}
