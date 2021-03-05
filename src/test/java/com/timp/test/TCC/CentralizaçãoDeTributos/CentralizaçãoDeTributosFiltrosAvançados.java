package com.timp.test.TCC.CentralizaçãoDeTributos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao.ConfiguracaoEExecucaoFiltrosAvançadosPO;
import com.sap.timp.pageObjectModel.TCC.CentralizaçãoDeTributos.CentralizaçãoDeTributosFiltrosAvançadosPO;

public class CentralizaçãoDeTributosFiltrosAvançados extends TestBaseCristhian{

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	CentralizaçãoDeTributosFiltrosAvançadosPO centralizaçãoDeTributosFiltrosAvançadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		centralizaçãoDeTributosFiltrosAvançadosPO = new CentralizaçãoDeTributosFiltrosAvançadosPO();
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

		centralizaçãoDeTributosFiltrosAvançadosPO.Filtros();

	}
}
