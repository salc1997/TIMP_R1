package com.timp.test.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao.ParametrosGeraisConfiguracaoConfiguracaoFiltrosAvancadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosGeraisConfiguraçãoConfiguraçãoFiltrosAvancados extends TestBase{
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ParametrosGeraisConfiguracaoConfiguracaoFiltrosAvancadosPO parametrosGeraisFiltrosAvancadosPO;


	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		parametrosGeraisFiltrosAvancadosPO = new ParametrosGeraisConfiguracaoConfiguracaoFiltrosAvancadosPO();


	}

	@AfterClass
	public void afterClass() {

		//driver.close();

	}

	@Test()
	public void criarConfiguracao() {
		loginTC.login();
		acessarBCBPO.acessar();
		
		ArrayList<Boolean> sucesso = parametrosGeraisFiltrosAvancadosPO.Filtros();
		System.out.println("veamos: "+sucesso);
		sleep(3000);
		
	}
}
