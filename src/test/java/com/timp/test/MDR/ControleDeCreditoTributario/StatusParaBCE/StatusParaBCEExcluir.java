package com.timp.test.MDR.ControleDeCreditoTributario.StatusParaBCE;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.Antecipacao.AntecipacaoVisualizarPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEDetalhesPO;
import com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBCE.StatusParaBCEExcluirPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheVisualizarPO;

public class StatusParaBCEExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	StatusParaBCEExcluirPO statusParaBCEExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		statusParaBCEExcluirPO = new StatusParaBCEExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
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
	public void excluir() {

		boolean sucesso = statusParaBCEExcluirPO.excluir();

		assertTrue(sucesso, Eliminado);
	

	}
}