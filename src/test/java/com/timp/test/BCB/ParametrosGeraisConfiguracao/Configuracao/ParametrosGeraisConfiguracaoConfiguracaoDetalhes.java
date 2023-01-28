package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguracaoConfiguracaoDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfiguracaoConfiguracaoDetalhes  extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguracaoConfiguracaoDetalhesPO parametrosGeraisConfigura��oConfigura��oDetalhesPO;


	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisConfigura��oConfigura��oDetalhesPO = new ParametrosGeraisConfiguracaoConfiguracaoDetalhesPO();


	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void detalhes() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		//parametrosGeraisConfigura��oConfigura��oDetalhesPO.parametrosGeraisDetalhes();
		ArrayList<Boolean> sucesso = parametrosGeraisConfigura��oConfigura��oDetalhesPO.parametrosGeraisDetalhes();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
		
		sleep(3000);

	}

}
