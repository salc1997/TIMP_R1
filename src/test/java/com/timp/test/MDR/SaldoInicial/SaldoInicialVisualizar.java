package com.timp.test.MDR.SaldoInicial;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SaldoInicial.SaldoInicialVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SaldoInicialVisualizar extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SaldoInicialVisualizarPO saldoInicialVisualizarPO;
 
  @BeforeClass
  public void beforeClass() {
	  driver = initializationKen();
	  loginTC = new LoginTC();
	  acessarMDRPO = new AcessarMDRPO();
	  saldoInicialVisualizarPO = new SaldoInicialVisualizarPO();
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
 	public void acessarMDR() {
 		acessarMDRPO.acessarMDR();
 	}

 	@Test(priority = 2)
  public void VisualizarSaldoInicial() {
 		//saldoInicialVisualizarPO.VisualizarSaldoInicial();
 		
 		ArrayList<Boolean> sucesso = saldoInicialVisualizarPO.VisualizarSaldoInicial();

		for (int i = 0; i < sucesso.size(); i++) {

			assertTrue(sucesso.get(i), visualiza�ar);

		}
  }
}