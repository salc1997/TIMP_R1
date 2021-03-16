package com.timp.test.TCC.BancoDeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainel;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseCristhian;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegradeAbasVerPO;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainel.ConfiguraçãodeLayoutdePainelVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ConfiguraçãodeLayoutdePainelVisualizar extends TestBaseCristhian {
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	ConfiguraçãodeLayoutdePainelVisualizarPO configuraçãodeLayoutdePainelVisualizarrPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationC();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		configuraçãodeLayoutdePainelVisualizarrPO = new ConfiguraçãodeLayoutdePainelVisualizarPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 1)
	public void ingresarTAA() {
		acessarTCCPO.acessarTCC();
	}

	@Test(priority = 2)
	public void ver() {
		ArrayList<Boolean> sucesso = configuraçãodeLayoutdePainelVisualizarrPO.ver();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}

}
