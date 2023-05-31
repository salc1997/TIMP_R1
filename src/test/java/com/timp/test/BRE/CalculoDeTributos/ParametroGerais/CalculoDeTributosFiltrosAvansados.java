package com.timp.test.BRE.CalculoDeTributos.ParametroGerais;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.ParametrosGerais.CalculoDeTributosFiltrosAbansadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CalculoDeTributosFiltrosAvansados extends TestBase {
	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	CalculoDeTributosFiltrosAbansadosPO calculoDeTributosFiltrosAbansadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		calculoDeTributosFiltrosAbansadosPO = new CalculoDeTributosFiltrosAbansadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Filtro() {
		loginTC.login();
		acessarBREPO.acessarBRE();

		ArrayList<Boolean> estructura = calculoDeTributosFiltrosAbansadosPO.Estructura();
		for (int i = 0; i < estructura.size(); i++) {
			assertTrue(estructura.get(i), Filtros);
		}

		ArrayList<Boolean> tributo = calculoDeTributosFiltrosAbansadosPO.tributo();
		for (int i = 0; i < tributo.size(); i++) {
			assertTrue(tributo.get(i), Filtros);
		}
	}
}
