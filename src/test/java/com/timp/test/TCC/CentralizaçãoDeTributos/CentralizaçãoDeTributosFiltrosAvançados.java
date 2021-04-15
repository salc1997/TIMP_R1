package com.timp.test.TCC.CentralizaçãoDeTributos;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao.ConfiguracaoEExecucaoFiltrosAvançadosPO;
import com.sap.timp.pageObjectModel.TCC.CentralizaçãoDeTributos.CentralizaçãoDeTributosFiltrosAvançadosPO;

public class CentralizaçãoDeTributosFiltrosAvançados extends TestBaseSteven{

	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	CentralizaçãoDeTributosFiltrosAvançadosPO centralizaçãoDeTributosFiltrosAvançadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		centralizaçãoDeTributosFiltrosAvançadosPO = new CentralizaçãoDeTributosFiltrosAvançadosPO();
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
	public void acessarTCC() {

		acessarTCCPO.acessarTCC();

	}

	@Test(priority = 2)
	public void Filtro() {

		centralizaçãoDeTributosFiltrosAvançadosPO.Filtros();

	}
}
