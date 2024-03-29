package com.timp.test.MDR.Ajustes.CodigosAjustes;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.CodigosAjustes.CodigoAjustesDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.Ajustes.CodigosAjustes.CodigoAjustesEditarPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoCriarPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoFiltrosPO;

public class CodigosAjustesDetalhes extends TestBase {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoAjustesDetalhesPO codigoAjustesDetalhesPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoAjustesDetalhesPO = new CodigoAjustesDetalhesPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void detalhes() {
		
	
		loginTC.login();

		acessarMDRPO.acessarMDR();


		ArrayList<Boolean> sucesso = codigoAjustesDetalhesPO.detalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		sleep(2000);
	}

}
