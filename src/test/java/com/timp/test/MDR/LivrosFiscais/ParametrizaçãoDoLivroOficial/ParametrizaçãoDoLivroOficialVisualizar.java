package com.timp.test.MDR.LivrosFiscais.Parametriza��oDoLivroOficial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.LivrosFiscais.Parametriza��oDoLivroOficial.Parametriza��oDoLivroOficialVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Parametriza��oDoLivroOficialVisualizar extends TestBaseMassiel{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	Parametriza��oDoLivroOficialVisualizarPO parametriza��oDoLivroOficialVisualizarPO;

  @BeforeClass
  public void beforeClass() {
	  driver = initializationM();
	  accesarMDRPO = new AcessarMDRPO();
	  loginTC = new LoginTC();
	  parametriza��oDoLivroOficialVisualizarPO = new Parametriza��oDoLivroOficialVisualizarPO();
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
		
		
		ArrayList<Boolean> sucesso = parametriza��oDoLivroOficialVisualizarPO.visualizar();

			for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}
	}
}
