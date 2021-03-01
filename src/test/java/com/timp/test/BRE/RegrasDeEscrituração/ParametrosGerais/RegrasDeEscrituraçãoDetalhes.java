package com.timp.test.BRE.RegrasDeEscrituração.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoCriarComCopiaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoCriarMasCaminhoPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoDetalhesPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoEditarPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais.RegrasDeEscrituraçãoVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasDeEscrituraçãoDetalhes extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscrituraçãoDetalhesPO regrasDeEscrituraçãoDetalhesPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscrituraçãoDetalhesPO = new RegrasDeEscrituraçãoDetalhesPO();
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
	public void acessarBRE() {
		acessarBREPO.acessarBRE();
	}
	
	@Test(priority = 2)
	public void detalhes() {
		
		regrasDeEscrituraçãoDetalhesPO.detalhes();
		

		
	}
}
