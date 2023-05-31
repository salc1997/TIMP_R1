package com.timp.test.MDR.ParametrosParaCategoriaDeIRF;

import org.testng.annotations.Test;


import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF.ParametrosParaCategoriaDeIRFVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ParametrosParaCategoriaDeIRFVisualizar extends TestBaseSteven{
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	ParametrosParaCategoriaDeIRFVisualizarPO parametrosParaCategoriaDeIRFVisualizarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		 parametrosParaCategoriaDeIRFVisualizarPO = new ParametrosParaCategoriaDeIRFVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void visualizar() {
		loginTC.login();
		accesarMDRPO.acessarMDR();

		
		 ArrayList<Boolean> sucesso = parametrosParaCategoriaDeIRFVisualizarPO.Visualizar();

		 for (int i = 0; i < sucesso.size(); i++) {
			 assertTrue(sucesso.get(i), visualizar);
		 }
	}

}
