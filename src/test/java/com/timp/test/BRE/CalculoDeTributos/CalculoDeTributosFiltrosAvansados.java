package com.timp.test.BRE.CalculoDeTributos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.CalculoDeTributosFiltrosAbansadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CalculoDeTributosFiltrosAvansados extends TestBaseMassiel{

	LoginTC loginTC;
	AcessarBREPO acessarBREPO;
	CalculoDeTributosFiltrosAbansadosPO  calculoDeTributosFiltrosAbansadosPO;
	
	
  @BeforeClass
  public void beforeClass() {
	  	driver = initializationM();
		loginTC = new LoginTC();
		acessarBREPO = new AcessarBREPO();
		calculoDeTributosFiltrosAbansadosPO  = new CalculoDeTributosFiltrosAbansadosPO();
  }

  @AfterClass
  public void afterClass() {
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
	public void Filtro() {

		//ArrayList<Boolean> regulamento = calculoDeTributosFiltrosAbansadosPO.filtrosRegulamento();
		//for (int i = 0; i < regulamento.size(); i++) {
		//assertTrue(regulamento.get(i), Filtros);
		//}
		
		
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
