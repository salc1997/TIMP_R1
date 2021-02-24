package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguraçãoConfiguraçãoRaizPO;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.CodigosAjustes.CodigoAjustesDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfiguraçãoConfiguraçãoDetalhes  extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO parametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO = new ParametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO();


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
	public void brbEntrar() {
		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);

	}

	@Test(priority = 2)
	public void detalhes() {
		parametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO.parametrosGeraisDetalhes();
//		ArrayList<Boolean> sucesso = parametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO.detalhes();
//
//		for (int i = 0; i < sucesso.size(); i++) {
//			assertTrue(sucesso.get(i), Detalhes);
//		}

	}

}
