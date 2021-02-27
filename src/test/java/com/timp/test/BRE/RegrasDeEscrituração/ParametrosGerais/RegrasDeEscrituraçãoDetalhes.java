package com.timp.test.BRE.RegrasDeEscritura��o.ParametrosGerais;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais.RegrasDeEscritura��oCriarComCopiaPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais.RegrasDeEscritura��oCriarMasCaminhoPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais.RegrasDeEscritura��oDetalhesPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais.RegrasDeEscritura��oEditarPO;
import com.sap.timp.pageObjectModel.BRE.RegrasDeEscritura��o.ParametrosGerais.RegrasDeEscritura��oVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegrasDeEscritura��oDetalhes extends TestBaseSteven{
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	RegrasDeEscritura��oDetalhesPO regrasDeEscritura��oDetalhesPO;
	
	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		regrasDeEscritura��oDetalhesPO = new RegrasDeEscritura��oDetalhesPO();
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
		
		regrasDeEscritura��oDetalhesPO.detalhes();
		

		
	}
}
