package com.timp.test.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial.ParametrizaçãoDoLivroOficialVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrizaçãoDoLivroOficialVisualizar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParametrizaçãoDoLivroOficialVisualizarPO parametrizaçãoDoLivroOficialVisualizarPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  parametrizaçãoDoLivroOficialVisualizarPO = new ParametrizaçãoDoLivroOficialVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
  }

  @Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}
	@Test(priority = 1)
	public void ingresarMDR() {
		accesarMDRPO.acessarMDR();
	}

	@Test(priority = 2)
	public void visualizar() {
		
		
		ArrayList<Boolean> sucesso = parametrizaçãoDoLivroOficialVisualizarPO.visualizar();

			for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
