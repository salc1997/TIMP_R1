package com.timp.test.MDR.TabelasApoioESocial.Tabela24;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela23.FactoresDeRiscoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela24.Codifica��oDeAcDeTrabVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class Codifica��oDeAcDeTrabVisualizar extends TestBaseCristhian {
	
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	Codifica��oDeAcDeTrabVisualizarPO codifica��oDeAcDeTrabVisualizarPO;

  @BeforeClass
  public void beforeClass() {
	driver = initializationC();
	loginTC = new LoginTC();
	acessarMDRPO = new AcessarMDRPO();
	codifica��oDeAcDeTrabVisualizarPO = new Codifica��oDeAcDeTrabVisualizarPO();
  }

  @AfterClass
  public void afterClass() {
  }
  
	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarMDR() {

		acessarMDRPO.acessarMDR();

	}

	@Test(priority = 2)
	public void visualizar() {

		ArrayList<Boolean> sucesso = codifica��oDeAcDeTrabVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualiza�ar);
		}

	}

}
