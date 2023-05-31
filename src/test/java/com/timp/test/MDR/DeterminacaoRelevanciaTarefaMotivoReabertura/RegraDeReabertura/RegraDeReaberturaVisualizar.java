package com.timp.test.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegraDeReabertura;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBase;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegradeReabertura.RegradeReaberturaVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegraDeReaberturaVisualizar extends TestBase{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	RegradeReaberturaVisualizarPO regradeReaberturaVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		regradeReaberturaVisualizarPO = new RegradeReaberturaVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void visualizar() {
		
		loginTC.login();
		
		accesarMDRPO.acessarMDR();
		
		ArrayList<Boolean> sucesso = regradeReaberturaVisualizarPO.visualizar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizar);
		}
	}



}
